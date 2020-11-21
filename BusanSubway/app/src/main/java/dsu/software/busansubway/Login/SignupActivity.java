package dsu.software.busansubway.Login;

import android.graphics.Color;
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

public class SignupActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    EditText Eemail, Epassword, Epassword_check;
    Button signup;
    private Boolean[] color = {false, false, false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mAuth = FirebaseAuth.getInstance();


        Eemail = findViewById(R.id.email_up);
        Eemail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                color[0] = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", Eemail.getText().toString());
                if (color[0] && color[1] && color[2] && Epassword.getText().toString().equals(Epassword_check.getText().toString())) {
                    signup.setBackgroundResource(R.color.color);
                } else {
                    signup.setBackgroundResource(R.color.grey);
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        Epassword = findViewById(R.id.password_up);
        Epassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                color[1] = Epassword.getText().toString().length() >= 6;
                if (color[0] && color[1] && color[2] && Epassword.getText().toString().equals(Epassword_check.getText().toString())) {
                    signup.setBackgroundResource(R.color.color);
                } else {
                    signup.setBackgroundResource(R.color.grey);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        Epassword_check = findViewById(R.id.password_check_up);
        Epassword_check.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                color[2] = Epassword.getText().toString().length() >= 6;
                if (color[0] && color[1] && color[2] && Epassword.getText().toString().equals(Epassword_check.getText().toString())) {
                    signup.setBackgroundResource(R.color.color);
                } else {
                    signup.setBackgroundResource(R.color.grey);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });


        signup = findViewById(R.id.signup_up);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signup();
            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }

    private void signup() {
        String email = Eemail.getText().toString();
        String password = Epassword.getText().toString();
        String password_check = Epassword_check.getText().toString();

//        Toast.makeText(this, email +"\n"+ password, Toast.LENGTH_SHORT).show();

        if (color[0] && color[1] && color[2] && password.equals(password_check)) {
            try {
                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    finish();
                                } else {
                                    Toast.makeText(SignupActivity.this, "이메일 형식이 다릅니다", Toast.LENGTH_SHORT).show();
                                }

                            }
                        });

            } catch (Exception e) {
                Toast.makeText(this, "이메일 또는 비밀번호를 입력하시오", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(SignupActivity.this, "이메일 형식 또는 비밀번호가 다릅니다", Toast.LENGTH_SHORT).show();
        }

    }
}