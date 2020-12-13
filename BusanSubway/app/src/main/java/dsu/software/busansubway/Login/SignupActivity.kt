package dsu.software.busansubway.Login

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import dsu.software.busansubway.Login.SignupActivity
import dsu.software.busansubway.R
import java.util.regex.Pattern

class SignupActivity : AppCompatActivity() {
    private var mAuth: FirebaseAuth? = null
    var Eemail: EditText? = null
    var Epassword: EditText? = null
    var Epassword_check: EditText? = null
    var signup: Button? = null
    private val color = arrayOf(false, false, false)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        mAuth = FirebaseAuth.getInstance()
        Eemail = findViewById(R.id.email_up)
        Eemail!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                color[0] = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", Eemail!!.getText().toString())
                if (color[0] && color[1] && color[2] && Epassword!!.text.toString() == Epassword_check!!.text.toString()) {
                    signup!!.setBackgroundResource(R.color.color)
                } else {
                    signup!!.setBackgroundResource(R.color.gray)
                }
            }

            override fun afterTextChanged(editable: Editable) {}
        })
        Epassword = findViewById(R.id.password_up)
        Epassword!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                color[1] = Epassword!!.getText().toString().length >= 6
                if (color[0] && color[1] && color[2] && Epassword!!.getText().toString() == Epassword_check!!.text.toString()) {
                    signup!!.setBackgroundResource(R.color.color)
                } else {
                    signup!!.setBackgroundResource(R.color.gray)
                }
            }

            override fun afterTextChanged(editable: Editable) {}
        })
        Epassword_check = findViewById(R.id.password_check_up)
        Epassword_check!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                color[2] = Epassword!!.getText().toString().length >= 6
                if (color[0] && color[1] && color[2] && Epassword!!.getText().toString() == Epassword_check!!.getText().toString()) {
                    signup!!.setBackgroundResource(R.color.color)
                } else {
                    signup!!.setBackgroundResource(R.color.gray)
                }
            }

            override fun afterTextChanged(editable: Editable) {}
        })
        signup= findViewById(R.id.signup_up) as Button
        signup!!.setOnClickListener(View.OnClickListener { signup() })
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = mAuth!!.currentUser
    }

    private fun signup() {
        val email = Eemail!!.text.toString()
        val password = Epassword!!.text.toString()
        val password_check = Epassword_check!!.text.toString()

//        Toast.makeText(this, email +"\n"+ password, Toast.LENGTH_SHORT).show();
        if (color[0] && color[1] && color[2] && password == password_check) {
            try {
                mAuth!!.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(this) { task ->
                            if (task.isSuccessful) {
                                // Sign in success, update UI with the signed-in user's information
                                val user = mAuth!!.currentUser
                                finish()
                            } else {
                                Toast.makeText(this@SignupActivity, "이메일 형식이 다릅니다", Toast.LENGTH_SHORT).show()
                            }
                        }
            } catch (e: Exception) {
                Toast.makeText(this, "이메일 또는 비밀번호를 입력하시오", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this@SignupActivity, "이메일 형식 또는 비밀번호가 다릅니다", Toast.LENGTH_SHORT).show()
        }
    }
}