package dsu.software.busansubway.Login;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.regex.Pattern;

import dsu.software.busansubway.R;
import dsu.software.busansubway.Select.Station_Tab;

public class SigninActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    EditText Eemail, Epassword;
    Button signin, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        mAuth = FirebaseAuth.getInstance();

        final Boolean[] color = {false, false};

        Eemail = findViewById(R.id.email_in);
        Eemail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                color[0] = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", Eemail.getText().toString());
                if (color[0] && color[1]) {
                    signin.setBackgroundResource(R.color.color);
                } else {
                    signin.setBackgroundResource(R.color.gray);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        Epassword = findViewById(R.id.password_in);
        Epassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                color[1] = Epassword.getText().toString().length() >= 6;
                if (color[0] && color[1]) {
                    signin.setBackgroundResource(R.color.color);
                } else {
                    signin.setBackgroundResource(R.color.gray);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        signin = findViewById(R.id.signin_in);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signin();
            }
        });

        signup = findViewById(R.id.signup_in);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }

    private void signin() {
        String email = Eemail.getText().toString();
        String password = Epassword.getText().toString();

//        Toast.makeText(this, email +"\n"+ password, Toast.LENGTH_SHORT).show();

        try {
            mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                FirebaseUser user = mAuth.getCurrentUser();
                                Intent intent = new Intent(getApplicationContext(), Station_Tab.class);
                                startActivity(intent);
                                finish();
                            } else {
                                Toast.makeText(SigninActivity.this, "이메일 또는 비밀번호가 다릅니다", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });

        } catch (Exception e) {
            Toast.makeText(this, "이메일 또는 비밀번호를 입력하시오", Toast.LENGTH_SHORT).show();
        }

    }
}