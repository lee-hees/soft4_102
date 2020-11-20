package dsu.software.busansubway.Login;

import android.content.Intent;
import android.os.Bundle;
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

import dsu.software.busansubway.AA.Main;
import dsu.software.busansubway.R;

public class SignupActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    EditText Eemail, Epassword;
    Button signin, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mAuth = FirebaseAuth.getInstance();

        Eemail = findViewById(R.id.email_up);
        Epassword = findViewById(R.id.password_up);

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

//        Toast.makeText(this, email +"\n"+ password, Toast.LENGTH_SHORT).show();

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
                                Toast.makeText(SignupActivity.this, "이메일 또는 비밀번호가 다릅니다", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });

        } catch (Exception e) {
            Toast.makeText(this, "이메일 또는 비밀번호를 입력하시오", Toast.LENGTH_SHORT).show();
        }

    }
}