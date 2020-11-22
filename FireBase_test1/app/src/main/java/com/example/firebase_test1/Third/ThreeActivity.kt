package com.example.firebase_test1.Third

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.firebase_test1.MainActivity
import com.example.firebase_test1.R
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import java.util.*

class ThreeActivity : AppCompatActivity() {
    var _move = ArrayList<DatabaseReference>()
    var _three_to_first_list = ArrayList<DatabaseReference>()
    var _three_to_second_list = ArrayList<DatabaseReference>()
    var _three_to_third_list = ArrayList<DatabaseReference>()
    var _three_to_fourth_list = ArrayList<DatabaseReference>()
    val three_to_first_button = ArrayList<TextView>()
    val three_to_second_button = ArrayList<TextView>()
    val three_to_third_button = ArrayList<TextView>()
    val three_to_fourth_button = ArrayList<TextView>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_three)
        val button = findViewById<Button>(R.id.back)
        button.setOnClickListener { finish() }
        _move = MainActivity.third_move
        _three_to_first_list = MainActivity.third_three_to_first_list
        _three_to_second_list = MainActivity.third_three_to_second_list
        _three_to_third_list = MainActivity.third_three_to_third_list
        _three_to_fourth_list = MainActivity.third_three_to_fourth_list
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_01) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_02) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_03) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_04) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_05) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_06) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_07) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_08) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_09) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_10) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_11) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_12) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_13) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_14) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_15) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_16) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_17) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_18) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_19) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_20) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_21) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_22) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_23) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_24) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_25) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_26) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_27) as TextView)
        three_to_first_button.add(findViewById<View>(R.id.three_to_first_28) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_01) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_02) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_03) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_04) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_05) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_06) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_07) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_08) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_09) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_10) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_11) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_12) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_13) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_14) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_15) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_16) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_17) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_18) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_19) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_20) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_21) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_22) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_23) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_24) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_25) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_26) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_27) as TextView)
        three_to_second_button.add(findViewById<View>(R.id.three_to_second_28) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_01) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_02) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_03) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_04) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_05) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_06) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_07) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_08) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_09) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_10) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_11) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_12) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_13) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_14) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_15) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_16) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_17) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_18) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_19) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_20) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_21) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_22) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_23) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_24) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_25) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_26) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_27) as TextView)
        three_to_third_button.add(findViewById<View>(R.id.three_to_third_28) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_01) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_02) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_03) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_04) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_05) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_06) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_07) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_08) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_09) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_10) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_11) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_12) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_13) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_14) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_15) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_16) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_17) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_18) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_19) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_20) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_21) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_22) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_23) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_24) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_25) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_26) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_27) as TextView)
        three_to_fourth_button.add(findViewById<View>(R.id.three_to_fourth_28) as TextView)



        // 현재 역 표시 텍스트
        val current = findViewById<TextView>(R.id.current)
        val mTimer = Timer(true)
        val handler = Handler()
        mTimer.schedule(object : TimerTask() {
            override fun run() {
                handler.post {
                    // 수행할 작업을 넣는다.

                    // 현재 역 표시
                    _move.get(5).addValueEventListener(object : ValueEventListener {
                        @SuppressLint("LongLogTag")
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            // This method is called once with the initial value and again
                            // whenever data at this location is updated.
                            val value = dataSnapshot.getValue(Int::class.java)
                            current.text = "현재 역 : $value"
                            Log.d(TAG, "Value is: $value")
                        }

                        @SuppressLint("LongLogTag")
                        override fun onCancelled(error: DatabaseError) {
                            Log.w(TAG, "Failed to read value.", error.toException())
                        }
                    })

                    // 1호선 1번칸 적용
                    for (i in _three_to_first_list.indices) {
                        // Read from the database
                        _three_to_first_list[i].addValueEventListener(object : ValueEventListener {
                            @SuppressLint("LongLogTag")
                            override fun onDataChange(dataSnapshot: DataSnapshot) {
                                // This method is called once with the initial value and again
                                // whenever data at this location is updated.
                                val value = dataSnapshot.getValue(Int::class.java)
                                if (value == 1) {
                                    three_to_first_button[i].setBackgroundResource(R.color.black)
                                } else {
                                    if (i == 2 || i == 25) {
                                        three_to_first_button[i].setBackgroundResource(R.color.pink)
                                    } else if (i == 0 || i == 1 || i == 12 || i == 13 || i == 14 || i == 15 || i == 26 || i == 27 ) {
                                        three_to_first_button[i].setBackgroundResource(R.color.yellow)
                                    } else {
                                        three_to_first_button[i].setBackgroundResource(R.color.white)
                                    }
                                }
                                Log.d(TAG, "Value is: $value")
                            }

                            @SuppressLint("LongLogTag")
                            override fun onCancelled(error: DatabaseError) {
                                Log.w(TAG, "Failed to read value.", error.toException())
                            }
                        })
                    }
                    // 1호선 2번칸 적용
                    for (i in _three_to_second_list.indices) {
                        // Read from the database
                        _three_to_second_list[i].addValueEventListener(object : ValueEventListener {
                            @SuppressLint("LongLogTag")
                            override fun onDataChange(dataSnapshot: DataSnapshot) {
                                // This method is called once with the initial value and again
                                // whenever data at this location is updated.
                                val value = dataSnapshot.getValue(Int::class.java)
                                if (value == 1) {
                                    three_to_second_button[i].setBackgroundResource(R.color.black)
                                } else {
                                    if (i == 2 || i == 25) {
                                        three_to_second_button[i].setBackgroundResource(R.color.pink)
                                    } else if (i == 0 || i == 1 || i == 12 || i == 13 || i == 14 || i == 15 || i == 26 || i == 27 ) {
                                        three_to_second_button[i].setBackgroundResource(R.color.yellow)
                                    } else {
                                        three_to_second_button[i].setBackgroundResource(R.color.white)
                                    }
                                }
                                Log.d(TAG, "Value is: $value")
                            }

                            @SuppressLint("LongLogTag")
                            override fun onCancelled(error: DatabaseError) {
                                Log.w(TAG, "Failed to read value.", error.toException())
                            }
                        })
                    }
                    // 1호선 3번칸 적용
                    for (i in _three_to_third_list.indices) {
                        // Read from the database
                        _three_to_third_list[i].addValueEventListener(object : ValueEventListener {
                            @SuppressLint("LongLogTag")
                            override fun onDataChange(dataSnapshot: DataSnapshot) {
                                // This method is called once with the initial value and again
                                // whenever data at this location is updated.
                                val value = dataSnapshot.getValue(Int::class.java)
                                if (value == 1) {
                                    three_to_third_button[i].setBackgroundResource(R.color.black)
                                } else {
                                    if (i == 2 || i == 25) {
                                        three_to_third_button[i].setBackgroundResource(R.color.pink)
                                    } else if (i == 0 || i == 1 || i == 12 || i == 13 || i == 14 || i == 15 || i == 26 || i == 27 ) {
                                        three_to_third_button[i].setBackgroundResource(R.color.yellow)
                                    } else {
                                        three_to_third_button[i].setBackgroundResource(R.color.white)
                                    }
                                }
                                Log.d(TAG, "Value is: $value")
                            }

                            @SuppressLint("LongLogTag")
                            override fun onCancelled(error: DatabaseError) {
                                Log.w(TAG, "Failed to read value.", error.toException())
                            }
                        })
                    }

                    // 1호선 4번칸 적용
                    for (i in _three_to_fourth_list.indices) {
                        // Read from the database
                        _three_to_fourth_list[i].addValueEventListener(object : ValueEventListener {
                            @SuppressLint("LongLogTag")
                            override fun onDataChange(dataSnapshot: DataSnapshot) {
                                // This method is called once with the initial value and again
                                // whenever data at this location is updated.
                                val value = dataSnapshot.getValue(Int::class.java)
                                if (value == 1) {
                                    three_to_fourth_button[i].setBackgroundResource(R.color.black)
                                } else {
                                    if (i == 2 || i == 25) {
                                        three_to_fourth_button[i].setBackgroundResource(R.color.pink)
                                    } else if (i == 0 || i == 1 || i == 12 || i == 13 || i == 14 || i == 15 || i == 26 || i == 27 ) {
                                        three_to_fourth_button[i].setBackgroundResource(R.color.yellow)
                                    } else {
                                        three_to_fourth_button[i].setBackgroundResource(R.color.white)
                                    }
                                }
                                Log.d(TAG, "Value is: $value")
                            }

                            @SuppressLint("LongLogTag")
                            override fun onCancelled(error: DatabaseError) {
                                Log.w(TAG, "Failed to read value.", error.toException())
                            }
                        })
                    }

                }
            }
        }, 0, 2000
        )
    }

    companion object {
        const val TAG = "~~~~~~~~~~~~~~~~~~~~"
    }
}