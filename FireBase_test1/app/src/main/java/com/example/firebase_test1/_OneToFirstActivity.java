//package com.example.firebase_test1;
//
//import android.annotation.SuppressLint;
//import android.os.Bundle;
//import android.os.Handler;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.ValueEventListener;
//
//import java.util.ArrayList;
//import java.util.Timer;
//import java.util.TimerTask;
//
//public class _OneToFirstActivity extends AppCompatActivity {
//
//    final static String TAG = "~~~~~~~~~~~~~~~~~~~~";
//
//    ArrayList<DatabaseReference> _move = new ArrayList<>();
//
//    ArrayList<DatabaseReference> _one_to_first_list = new ArrayList<>();
//    ArrayList<DatabaseReference> _one_to_second_list = new ArrayList<>();
//    ArrayList<DatabaseReference> _one_to_third_list = new ArrayList<>();
//    ArrayList<DatabaseReference> _one_to_fourth_list = new ArrayList<>();
//    ArrayList<DatabaseReference> _one_to_fifth_list = new ArrayList<>();
//
//    final ArrayList<TextView> one_to_first_button = new ArrayList<>();
//    final ArrayList<TextView> one_to_second_button = new ArrayList<>();
//    final ArrayList<TextView> one_to_third_button = new ArrayList<>();
//    final ArrayList<TextView> one_to_fourth_button = new ArrayList<>();
//    final ArrayList<TextView> one_to_fifth_button = new ArrayList<>();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.first_one);
//
//        Button button = findViewById(R.id.back);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//            }
//        });
//
//        _move = MainActivity.move;
//
//        _one_to_first_list = MainActivity.one_to_first_list;
//        _one_to_second_list = MainActivity.one_to_second_list;
//        _one_to_third_list = MainActivity.one_to_third_list;
//        _one_to_fourth_list = MainActivity.one_to_fourth_list;
//        _one_to_fifth_list = MainActivity.one_to_fifth_list;
//
//
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_01));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_02));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_03));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_04));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_05));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_06));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_07));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_08));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_09));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_10));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_11));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_12));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_13));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_14));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_15));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_16));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_17));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_18));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_19));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_20));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_21));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_22));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_23));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_24));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_25));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_26));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_27));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_28));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_29));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_30));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_31));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_32));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_33));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_34));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_35));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_36));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_37));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_38));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_39));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_40));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_41));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_42));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_43));
//        one_to_first_button.add((TextView) findViewById(R.id.one_to_first_44));
//
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_01));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_02));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_03));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_04));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_05));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_06));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_07));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_08));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_09));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_10));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_11));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_12));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_13));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_14));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_15));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_16));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_17));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_18));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_19));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_20));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_21));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_22));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_23));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_24));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_25));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_26));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_27));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_28));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_29));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_30));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_31));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_32));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_33));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_34));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_35));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_36));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_37));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_38));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_39));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_40));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_41));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_42));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_43));
//        one_to_second_button.add((TextView) findViewById(R.id.one_to_second_44));
//
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_01));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_02));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_03));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_04));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_05));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_06));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_07));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_08));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_09));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_10));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_11));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_12));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_13));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_14));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_15));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_16));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_17));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_18));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_19));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_20));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_21));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_22));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_23));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_24));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_25));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_26));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_27));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_28));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_29));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_30));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_31));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_32));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_33));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_34));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_35));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_36));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_37));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_38));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_39));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_40));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_41));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_42));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_43));
//        one_to_third_button.add((TextView) findViewById(R.id.one_to_third_44));
//
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_01));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_02));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_03));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_04));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_05));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_06));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_07));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_08));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_09));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_10));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_11));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_12));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_13));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_14));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_15));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_16));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_17));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_18));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_19));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_20));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_21));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_22));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_23));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_24));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_25));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_26));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_27));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_28));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_29));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_30));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_31));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_32));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_33));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_34));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_35));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_36));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_37));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_38));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_39));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_40));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_41));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_42));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_43));
//        one_to_fourth_button.add((TextView) findViewById(R.id.one_to_fourth_44));
//
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_01));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_02));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_03));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_04));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_05));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_06));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_07));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_08));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_09));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_10));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_11));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_12));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_13));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_14));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_15));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_16));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_17));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_18));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_19));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_20));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_21));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_22));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_23));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_24));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_25));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_26));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_27));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_28));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_29));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_30));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_31));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_32));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_33));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_34));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_35));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_36));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_37));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_38));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_39));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_40));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_41));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_42));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_43));
//        one_to_fifth_button.add((TextView) findViewById(R.id.one_to_fifth_44));
//
//
//        // 현재 역 표시 텍스트
//        final TextView current = findViewById(R.id.current);
//
//        Timer mTimer = new Timer(true);
//        final Handler handler = new Handler();
//        mTimer.schedule(new TimerTask() {
//                            @Override
//                            public void run() {
//                                handler.post(new Runnable() {
//                                    public void run() {
//                                        // 수행할 작업을 넣는다.
//
//                                        // 현재 역 표시
//                                        _move.get(1).addValueEventListener(new ValueEventListener() {
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                // This method is called once with the initial value and again
//                                                // whenever data at this location is updated.
//                                                Integer value = dataSnapshot.getValue(Integer.class);
//
//                                                current.setText("현재 역 : " + value);
//
//                                                Log.d(TAG, "Value is: " + value);
//                                            }
//
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onCancelled(DatabaseError error) {
//                                                Log.w(TAG, "Failed to read value.", error.toException());
//                                            }
//                                        });
//
//                                        // 1호선 1번칸 적용
//                                        for (int i = 0; i < _one_to_first_list.size(); i++) {
//                                            // Read from the database
//                                            final int finalI = i;
//                                            _one_to_first_list.get(i).addValueEventListener(new ValueEventListener() {
//                                                @SuppressLint("LongLogTag")
//                                                @Override
//                                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                    // This method is called once with the initial value and again
//                                                    // whenever data at this location is updated.
//                                                    Integer value = dataSnapshot.getValue(Integer.class);
//
//                                                    if (value == 1) {
//                                                        one_to_first_button.get(finalI).setBackgroundResource(R.color.black);
//                                                    } else {
//                                                        if (finalI == 3 || finalI == 40) {
//                                                            one_to_first_button.get(finalI).setBackgroundResource(R.color.pink);
//                                                        } else if (finalI == 0 || finalI == 1 || finalI == 2 || finalI == 19 || finalI == 20 || finalI == 21 || finalI == 22 || finalI == 23 || finalI == 24 || finalI == 41 || finalI == 42 || finalI == 43) {
//                                                            one_to_first_button.get(finalI).setBackgroundResource(R.color.yellow);
//                                                        } else {
//                                                            one_to_first_button.get(finalI).setBackgroundResource(R.color.white);
//                                                        }
//                                                    }
//
//                                                    Log.d(TAG, "Value is: " + value);
//                                                }
//
//                                                @SuppressLint("LongLogTag")
//                                                @Override
//                                                public void onCancelled(DatabaseError error) {
//                                                    Log.w(TAG, "Failed to read value.", error.toException());
//                                                }
//                                            });
//                                        }
//                                        // 1호선 2번칸 적용
//                                        for (int i = 0; i < _one_to_second_list.size(); i++) {
//                                            // Read from the database
//                                            final int finalI = i;
//                                            _one_to_second_list.get(i).addValueEventListener(new ValueEventListener() {
//                                                @SuppressLint("LongLogTag")
//                                                @Override
//                                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                    // This method is called once with the initial value and again
//                                                    // whenever data at this location is updated.
//                                                    Integer value = dataSnapshot.getValue(Integer.class);
//
//                                                    if (value == 1) {
//                                                        one_to_second_button.get(finalI).setBackgroundResource(R.color.black);
//                                                    } else {
//                                                        if (finalI == 3 || finalI == 40) {
//                                                            one_to_second_button.get(finalI).setBackgroundResource(R.color.pink);
//                                                        } else if (finalI == 0 || finalI == 1 || finalI == 2 || finalI == 19 || finalI == 20 || finalI == 21 || finalI == 22 || finalI == 23 || finalI == 24 || finalI == 41 || finalI == 42 || finalI == 43) {
//                                                            one_to_second_button.get(finalI).setBackgroundResource(R.color.yellow);
//                                                        } else {
//                                                            one_to_second_button.get(finalI).setBackgroundResource(R.color.white);
//                                                        }
//                                                    }
//
//                                                    Log.d(TAG, "Value is: " + value);
//                                                }
//
//                                                @SuppressLint("LongLogTag")
//                                                @Override
//                                                public void onCancelled(DatabaseError error) {
//                                                    Log.w(TAG, "Failed to read value.", error.toException());
//                                                }
//                                            });
//                                        }
//                                        // 1호선 3번칸 적용
//                                        for (int i = 0; i < _one_to_third_list.size(); i++) {
//                                            // Read from the database
//                                            final int finalI = i;
//                                            _one_to_third_list.get(i).addValueEventListener(new ValueEventListener() {
//                                                @SuppressLint("LongLogTag")
//                                                @Override
//                                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                    // This method is called once with the initial value and again
//                                                    // whenever data at this location is updated.
//                                                    Integer value = dataSnapshot.getValue(Integer.class);
//
//                                                    if (value == 1) {
//                                                        one_to_third_button.get(finalI).setBackgroundResource(R.color.black);
//                                                    } else {
//                                                        if (finalI == 3 || finalI == 40) {
//                                                            one_to_third_button.get(finalI).setBackgroundResource(R.color.pink);
//                                                        } else if (finalI == 0 || finalI == 1 || finalI == 2 || finalI == 19 || finalI == 20 || finalI == 21 || finalI == 22 || finalI == 23 || finalI == 24 || finalI == 41 || finalI == 42 || finalI == 43) {
//                                                            one_to_third_button.get(finalI).setBackgroundResource(R.color.yellow);
//                                                        } else {
//                                                            one_to_third_button.get(finalI).setBackgroundResource(R.color.white);
//                                                        }
//                                                    }
//
//                                                    Log.d(TAG, "Value is: " + value);
//                                                }
//
//                                                @SuppressLint("LongLogTag")
//                                                @Override
//                                                public void onCancelled(DatabaseError error) {
//                                                    Log.w(TAG, "Failed to read value.", error.toException());
//                                                }
//                                            });
//                                        }
//
//                                        // 1호선 4번칸 적용
//                                        for (int i = 0; i < _one_to_fourth_list.size(); i++) {
//                                            // Read from the database
//                                            final int finalI = i;
//                                            _one_to_fourth_list.get(i).addValueEventListener(new ValueEventListener() {
//                                                @SuppressLint("LongLogTag")
//                                                @Override
//                                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                    // This method is called once with the initial value and again
//                                                    // whenever data at this location is updated.
//                                                    Integer value = dataSnapshot.getValue(Integer.class);
//
//                                                    if (value == 1) {
//                                                        one_to_fourth_button.get(finalI).setBackgroundResource(R.color.black);
//                                                    } else {
//                                                        if (finalI == 3 || finalI == 40) {
//                                                            one_to_fourth_button.get(finalI).setBackgroundResource(R.color.pink);
//                                                        } else if (finalI == 0 || finalI == 1 || finalI == 2 || finalI == 19 || finalI == 20 || finalI == 21 || finalI == 22 || finalI == 23 || finalI == 24 || finalI == 41 || finalI == 42 || finalI == 43) {
//                                                            one_to_fourth_button.get(finalI).setBackgroundResource(R.color.yellow);
//                                                        } else {
//                                                            one_to_fourth_button.get(finalI).setBackgroundResource(R.color.white);
//                                                        }
//                                                    }
//
//                                                    Log.d(TAG, "Value is: " + value);
//                                                }
//
//                                                @SuppressLint("LongLogTag")
//                                                @Override
//                                                public void onCancelled(DatabaseError error) {
//                                                    Log.w(TAG, "Failed to read value.", error.toException());
//                                                }
//                                            });
//                                        }
//                                        // 1호선 5번칸 적용
//                                        for (int i = 0; i < _one_to_fifth_list.size(); i++) {
//                                            // Read from the database
//                                            final int finalI = i;
//                                            _one_to_fifth_list.get(i).addValueEventListener(new ValueEventListener() {
//                                                @SuppressLint("LongLogTag")
//                                                @Override
//                                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                    // This method is called once with the initial value and again
//                                                    // whenever data at this location is updated.
//                                                    Integer value = dataSnapshot.getValue(Integer.class);
//
//                                                    if (value == 1) {
//                                                        one_to_fifth_button.get(finalI).setBackgroundResource(R.color.black);
//                                                    } else {
//                                                        if (finalI == 3 || finalI == 40) {
//                                                            one_to_fifth_button.get(finalI).setBackgroundResource(R.color.pink);
//                                                        } else if (finalI == 0 || finalI == 1 || finalI == 2 || finalI == 19 || finalI == 20 || finalI == 21 || finalI == 22 || finalI == 23 || finalI == 24 || finalI == 41 || finalI == 42 || finalI == 43) {
//                                                            one_to_fifth_button.get(finalI).setBackgroundResource(R.color.yellow);
//                                                        } else {
//                                                            one_to_fifth_button.get(finalI).setBackgroundResource(R.color.white);
//                                                        }
//                                                    }
//
//                                                    Log.d(TAG, "Value is: " + value);
//                                                }
//
//                                                @SuppressLint("LongLogTag")
//                                                @Override
//                                                public void onCancelled(DatabaseError error) {
//                                                    Log.w(TAG, "Failed to read value.", error.toException());
//                                                }
//                                            });
//                                        }
//
//                                    }
//                                });
//                            }
//
//                        }, 0, 5000
//        );
//
//    }
//
//
//}
