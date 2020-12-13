package dsu.software.busansubway.Intro

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Message
import androidx.appcompat.app.AppCompatActivity
import dsu.software.busansubway.Login.SigninActivity
import dsu.software.busansubway.R

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        val introThread = IntroThread(handler)
        introThread.start()
    }

    @SuppressLint("HandlerLeak")
    var handler: Handler = object : Handler() {
        override fun handleMessage(msg: Message) {
            if (msg.what == 1) {
                val intent = Intent(this@IntroActivity, SigninActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}