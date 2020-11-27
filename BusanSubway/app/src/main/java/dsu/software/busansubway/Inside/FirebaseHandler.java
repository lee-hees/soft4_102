package dsu.software.busansubway.Inside;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import dsu.software.busansubway.R;

public class FirebaseHandler extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_detail_seat);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();





    }
}
