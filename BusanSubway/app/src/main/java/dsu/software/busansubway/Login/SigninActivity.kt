package dsu.software.busansubway.Login

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import dsu.software.busansubway.R
import dsu.software.busansubway.Select.Station_Tab
import java.util.regex.Pattern

class SigninActivity : AppCompatActivity() {
    private var mAuth: FirebaseAuth? = null
    var Eemail: EditText? = null
    var Epassword: EditText? = null
    var signin: Button? = null
    var signup: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        mAuth = FirebaseAuth.getInstance()
        val color = arrayOf(false, false)
        Eemail = findViewById(R.id.email_in)
        Eemail!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                color[0] = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", Eemail!!.getText().toString())
                if (color[0] && color[1]) {
                    signin!!.setBackgroundResource(R.color.color)
                } else {
                    signin!!.setBackgroundResource(R.color.gray)
                }
            }

            override fun afterTextChanged(editable: Editable) {}
        })
        Epassword = findViewById(R.id.password_in)
        Epassword!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                color[1] = Epassword!!.getText().toString().length >= 6
                if (color[0] && color[1]) {
                    signin!!.setBackgroundResource(R.color.color)
                } else {
                    signin!!.setBackgroundResource(R.color.gray)
                }
            }

            override fun afterTextChanged(editable: Editable) {}
        })
        signin = findViewById(R.id.signin_in)
        signin!!.setOnClickListener(View.OnClickListener { signin() })
        signup = findViewById(R.id.signup_in)
        signup!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(applicationContext, SignupActivity::class.java)
            startActivity(intent)
        })
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = mAuth!!.currentUser
    }

    private fun signin() {
        val email = Eemail!!.text.toString()
        val password = Epassword!!.text.toString()

//        Toast.makeText(this, email +"\n"+ password, Toast.LENGTH_SHORT).show();
        try {
            mAuth!!.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Sign in success, update UI with the signed-in user's information
                            val user = mAuth!!.currentUser
                            val intent = Intent(applicationContext, Station_Tab::class.java)
                            startActivity(intent)
                            finish()
                        } else {
                            Toast.makeText(this@SigninActivity, "이메일 또는 비밀번호가 다릅니다", Toast.LENGTH_SHORT).show()
                        }
                    }
        } catch (e: Exception) {
            Toast.makeText(this, "이메일 또는 비밀번호를 입력하시오", Toast.LENGTH_SHORT).show()
        }
    }
}