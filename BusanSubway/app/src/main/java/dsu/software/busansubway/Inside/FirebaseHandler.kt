package dsu.software.busansubway.Inside

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import dsu.software.busansubway.R

class FirebaseHandler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inside_detail_seat)

        // Write a message to the database
        val database = FirebaseDatabase.getInstance()
    }
}