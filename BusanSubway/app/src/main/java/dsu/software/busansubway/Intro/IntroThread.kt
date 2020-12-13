package dsu.software.busansubway.Intro

import android.os.Handler
import android.os.Message

class IntroThread(private val handler: Handler) : Thread() {
    override fun run() {
        val msg = Message()
        try {
            sleep(800)
            msg.what = 1
            handler.sendEmptyMessage(msg.what)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
