//package dsu.software.busansubway.Inside
//
//import android.annotation.SuppressLint
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.TextView
//import androidx.appcompat.app.AppCompatActivity
//import dsu.software.busansubway.R
//
//class InsideActivity_third_4 : AppCompatActivity() {
//    @SuppressLint("ResourceType")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_inside_detail_seat)
//
////        final TextView station_name = findViewById(R.id.station_name); //역이름 표시
//        val where = findViewById<TextView>(R.id.where) //무슨 행열차인지 표시
//        val locate = findViewById<TextView>(R.id.locate) //현위치 표시
//        val subway_car1_button = findViewById<Button>(R.id.subway_car1_button) //1번객차 덮개
//        val subway_car2_button = findViewById<Button>(R.id.subway_car2_button) //2번객차 덮개
//        val subway_car3_button = findViewById<Button>(R.id.subway_car3_button) //3번객차 덮개
//        val subway_car4_button = findViewById<Button>(R.id.subway_car4_button) //4번객차 덮개
//
//        //덮개 색깔 변경
//        subway_car2_button.setBackgroundResource(R.drawable.train_yellow)
//        subway_car3_button.setBackgroundResource(R.drawable.train_yellow)
//        subway_car4_button.setBackgroundResource(R.drawable.train_red)
//        //subway_car3_button.setBackgroundColor(context.getResources().getColor(R.color.train_yellow);
//        //subway_car4_button.setBackgroundColor(Color.parseColor(getString(R.drawable.train_red)));
//
//        //텍스트 변경
////        station_name.setText("2호선");
//        where.text = "다대포해수욕장행"
//        locate.text = "서면역"
//        subway_car1_button.text = "1번객차 " + "- 여유"
//        subway_car2_button.text = "2번객차 " + "- 보통"
//        subway_car3_button.text = "3번객차 " + "- 보통"
//        subway_car4_button.text = "4번객차 " + "- 혼잡"
//
//
//        //1번객차
//        val one_to_first_04 = findViewById<TextView>(R.id.one_to_first_04)
//        one_to_first_04.setBackgroundColor(R.color.black)
//        val one_to_first_11 = findViewById<TextView>(R.id.one_to_first_11)
//        one_to_first_11.setBackgroundColor(R.color.black)
//        val one_to_first_17 = findViewById<TextView>(R.id.one_to_first_17)
//        one_to_first_17.setBackgroundColor(R.color.black)
//        val one_to_first_23 = findViewById<TextView>(R.id.one_to_first_23)
//        one_to_first_23.setBackgroundColor(R.color.black)
//
//        //2번객차
//        val one_to_second_05 = findViewById<TextView>(R.id.one_to_second_05)
//        one_to_second_05.setBackgroundColor(R.color.black)
//        val one_to_second_07 = findViewById<TextView>(R.id.one_to_second_07)
//        one_to_second_07.setBackgroundColor(R.color.black)
//        val one_to_second_11 = findViewById<TextView>(R.id.one_to_second_11)
//        one_to_second_11.setBackgroundColor(R.color.black)
//        val one_to_second_18 = findViewById<TextView>(R.id.one_to_second_18)
//        one_to_second_18.setBackgroundColor(R.color.black)
//        val one_to_second_20 = findViewById<TextView>(R.id.one_to_second_20)
//        one_to_second_20.setBackgroundColor(R.color.black)
//        val one_to_second_22 = findViewById<TextView>(R.id.one_to_second_22)
//        one_to_second_22.setBackgroundColor(R.color.black)
//        val one_to_second_25 = findViewById<TextView>(R.id.one_to_second_25)
//        one_to_second_25.setBackgroundColor(R.color.black)
//
//        //3번객차
//        val one_to_third_05 = findViewById<TextView>(R.id.one_to_third_05)
//        one_to_third_05.setBackgroundColor(R.color.black)
//        val one_to_third_06 = findViewById<TextView>(R.id.one_to_third_06)
//        one_to_third_06.setBackgroundColor(R.color.black)
//        val one_to_third_09 = findViewById<TextView>(R.id.one_to_third_09)
//        one_to_third_09.setBackgroundColor(R.color.black)
//        val one_to_third_12 = findViewById<TextView>(R.id.one_to_third_12)
//        one_to_third_12.setBackgroundColor(R.color.black)
//        val one_to_third_18 = findViewById<TextView>(R.id.one_to_third_18)
//        one_to_third_18.setBackgroundColor(R.color.black)
//        val one_to_third_20 = findViewById<TextView>(R.id.one_to_third_20)
//        one_to_third_20.setBackgroundColor(R.color.black)
//        val one_to_third_22 = findViewById<TextView>(R.id.one_to_third_22)
//        one_to_third_22.setBackgroundColor(R.color.black)
//        val one_to_third_25 = findViewById<TextView>(R.id.one_to_third_25)
//        one_to_third_25.setBackgroundColor(R.color.black)
//
//        //4번객차
//        val one_to_fourth_05 = findViewById<TextView>(R.id.one_to_fourth_05)
//        one_to_fourth_05.setBackgroundColor(R.color.black)
//        val one_to_fourth_06 = findViewById<TextView>(R.id.one_to_fourth_06)
//        one_to_fourth_06.setBackgroundColor(R.color.black)
//        val one_to_fourth_07 = findViewById<TextView>(R.id.one_to_fourth_07)
//        one_to_fourth_07.setBackgroundColor(R.color.black)
//        val one_to_fourth_09 = findViewById<TextView>(R.id.one_to_fourth_09)
//        one_to_fourth_09.setBackgroundColor(R.color.black)
//        val one_to_fourth_11 = findViewById<TextView>(R.id.one_to_fourth_11)
//        one_to_fourth_11.setBackgroundColor(R.color.black)
//        val one_to_fourth_12 = findViewById<TextView>(R.id.one_to_fourth_12)
//        one_to_fourth_12.setBackgroundColor(R.color.black)
//        val one_to_fourth_17 = findViewById<TextView>(R.id.one_to_fourth_17)
//        one_to_fourth_17.setBackgroundColor(R.color.black)
//        val one_to_fourth_19 = findViewById<TextView>(R.id.one_to_fourth_19)
//        one_to_fourth_19.setBackgroundColor(R.color.black)
//        val one_to_fourth_20 = findViewById<TextView>(R.id.one_to_fourth_20)
//        one_to_fourth_20.setBackgroundColor(R.color.black)
//        val one_to_fourth_22 = findViewById<TextView>(R.id.one_to_fourth_22)
//        one_to_fourth_22.setBackgroundColor(R.color.black)
//        val one_to_fourth_23 = findViewById<TextView>(R.id.one_to_fourth_23)
//        one_to_fourth_23.setBackgroundColor(R.color.black)
//        val one_to_fourth_24 = findViewById<TextView>(R.id.one_to_fourth_24)
//        one_to_fourth_24.setBackgroundColor(R.color.black)
//
//
//        //1번덮개 버튼 터치 시 1번객차 버튼 없애기
//        subway_car1_button.setOnClickListener {
//            subway_car1_button.visibility = View.GONE
//            subway_car2_button.visibility = View.VISIBLE
//            subway_car3_button.visibility = View.VISIBLE
//            subway_car4_button.visibility = View.VISIBLE
//        }
//
//        //2번덮개 버튼 터치 시 2번객차 버튼 없애기
//        subway_car2_button.setOnClickListener {
//            subway_car1_button.visibility = View.VISIBLE
//            subway_car2_button.visibility = View.GONE
//            subway_car3_button.visibility = View.VISIBLE
//            subway_car4_button.visibility = View.VISIBLE
//        }
//
//        //3번덮개 버튼 터치 시 3번객차 버튼 없애기
//        subway_car3_button.setOnClickListener {
//            subway_car1_button.visibility = View.VISIBLE
//            subway_car2_button.visibility = View.VISIBLE
//            subway_car3_button.visibility = View.GONE
//            subway_car4_button.visibility = View.VISIBLE
//        }
//
//        //4번덮개 버튼 터치 시 4번객차 버튼 없애기
//        subway_car4_button.setOnClickListener {
//            subway_car1_button.visibility = View.VISIBLE
//            subway_car2_button.visibility = View.VISIBLE
//            subway_car3_button.visibility = View.VISIBLE
//            subway_car4_button.visibility = View.GONE
//        }
//    }
//}

package dsu.software.busansubway.Inside

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener

import dsu.software.busansubway.Details.DetailActivity_third
import dsu.software.busansubway.R

import java.util.*

class InsideActivity_third_4 :AppCompatActivity(){
    var _move=ArrayList<DatabaseReference>()
    var _four_to_first_list=ArrayList<DatabaseReference>()
    var _four_to_second_list=ArrayList<DatabaseReference>()
    var _four_to_third_list=ArrayList<DatabaseReference>()
    var _four_to_fourth_list=ArrayList<DatabaseReference>()
    val four_to_first_button=ArrayList<TextView>()
    val four_to_second_button=ArrayList<TextView>()
    val four_to_third_button=ArrayList<TextView>()
    val four_to_fourth_button=ArrayList<TextView>()
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inside_detail_seat)

//        final TextView station_name = findViewById(R.id.station_name); //역이름 표시
        val where=findViewById<TextView>(R.id.where) //무슨 행열차인지 표시
        val locate=findViewById<TextView>(R.id.locate) //현위치 표시
        val subway_car1_button=findViewById<Button>(R.id.subway_car1_button) //1번객차 덮개
        val subway_car2_button=findViewById<Button>(R.id.subway_car2_button) //2번객차 덮개
        val subway_car3_button=findViewById<Button>(R.id.subway_car3_button) //3번객차 덮개
        val subway_car4_button=findViewById<Button>(R.id.subway_car4_button) //4번객차 덮개

        //텍스트 변경
        locate.text=DetailActivity_third.title
        locate.setTextColor(Color.parseColor("#B77A56"))
        where.text="수영행"

        _four_to_first_list=DetailActivity_third.third_four_to_first_list
        _four_to_second_list=DetailActivity_third.third_four_to_second_list
        _four_to_third_list=DetailActivity_third.third_four_to_third_list
        _four_to_fourth_list=DetailActivity_third.third_four_to_fourth_list
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_01)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_02)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_03)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_04)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_05)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_06)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_07)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_08)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_09)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_10)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_11)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_12)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_13)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_14)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_15)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_16)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_17)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_18)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_19)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_20)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_21)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_22)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_23)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_24)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_25)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_26)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_27)as TextView)
        four_to_first_button.add(findViewById<View>(R.id.one_to_first_28)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_01)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_02)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_03)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_04)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_05)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_06)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_07)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_08)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_09)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_10)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_11)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_12)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_13)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_14)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_15)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_16)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_17)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_18)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_19)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_20)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_21)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_22)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_23)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_24)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_25)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_26)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_27)as TextView)
        four_to_second_button.add(findViewById<View>(R.id.one_to_second_28)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_01)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_02)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_03)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_04)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_05)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_06)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_07)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_08)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_09)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_10)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_11)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_12)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_13)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_14)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_15)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_16)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_17)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_18)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_19)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_20)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_21)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_22)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_23)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_24)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_25)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_26)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_27)as TextView)
        four_to_third_button.add(findViewById<View>(R.id.one_to_third_28)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_01)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_02)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_03)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_04)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_05)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_06)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_07)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_08)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_09)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_10)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_11)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_12)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_13)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_14)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_15)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_16)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_17)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_18)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_19)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_20)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_21)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_22)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_23)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_24)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_25)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_26)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_27)as TextView)
        four_to_fourth_button.add(findViewById<View>(R.id.one_to_fourth_28)as TextView)

        var counter1=0
        var counter2=0
        var counter3=0
        var counter4=0

        val mTimer=Timer(true)
        val handler=Handler()
        mTimer.schedule(object:TimerTask(){
            override fun run(){
                handler.post{


                    // 수행할 작업을 넣는다.

                    //                    // 현재 역 표시
//                    _move.get(1).addValueEventListener(object : ValueEventListener {
//                        @SuppressLint("LongLogTag")
//                        override fun onDataChange(dataSnapshot: DataSnapshot) {
//                            // This method is called once with the initial value and again
//                            // whenever data at this location is updated.
//                            val value = dataSnapshot.getValue(Int::class.java)
////                            current.text = "현재 역 : $value"
//                        }
//
//                        @SuppressLint("LongLogTag")
//                        override fun onCancelled(error: DatabaseError) {
//                        }
//                    @SuppressLint("LongLogTag")
//                    override fun onCancelled(error: DatabaseError) {
//                        Log.w(TAG, "Failed to read value.", error.toException())
//                    }
//                    })


                    // 1호선 1번칸 적용
                    for(i in _four_to_first_list.indices){
                        // Read from the database
                        counter1=0
                        _four_to_first_list[i].addValueEventListener(object:ValueEventListener{
                            @SuppressLint("LongLogTag")
                            override fun onDataChange(dataSnapshot:DataSnapshot){
                                // This method is called once with the initial value and again
                                // whenever data at this location is updated.
                                val value=dataSnapshot.getValue(Int::class.java)
                                if(value==1){
                                    four_to_first_button[i].setBackgroundResource(R.color.black)
                                    counter1+=1
                                    when{
                                        counter1>20->{
                                            subway_car1_button.text="1번 차 - 혼잡"
                                            subway_car1_button.setBackgroundResource(R.drawable.train_red)
                                        }
                                        counter1>10->{
                                            subway_car1_button.text="1번 차 - 보통"
                                            subway_car1_button.setBackgroundResource(R.drawable.train_yellow)
                                        }
                                        else->{
                                            subway_car1_button.text="1번 차 - 여유"
                                            subway_car1_button.setBackgroundResource(R.drawable.train_green)

                                        }
                                    }

                                }else{
                                    if(i==2||i==25){
                                        four_to_first_button[i].setBackgroundResource(R.color.train_pregnant)
                                    }else if(i==0||i==1||i==12||i==13||i==14||i==15||i==26||i==27){
                                        four_to_first_button[i].setBackgroundResource(R.color.train_old)
                                    }else{
                                        four_to_first_button[i].setBackgroundResource(R.color.white)
                                    }
                                }
                            }

                            @SuppressLint("LongLogTag")
                            override fun onCancelled(error:DatabaseError){
                                Log.w(TAG,"Failed to read value.",error.toException())
                            }
                        })
                    }

                    // 1호선 2번칸 적용
                    for(i in _four_to_second_list.indices){
                        // Read from the database
                        counter2 = 0
                        _four_to_second_list[i].addValueEventListener(object:ValueEventListener{
                            @SuppressLint("LongLogTag")
                            override fun onDataChange(dataSnapshot:DataSnapshot){
                                // This method is called once with the initial value and again
                                // whenever data at this location is updated.
                                val value=dataSnapshot.getValue(Int::class.java)
                                if(value==1){
                                    four_to_second_button[i].setBackgroundResource(R.color.black)
                                    counter2+=1
                                    when{
                                        counter2>20->{
                                            subway_car2_button.text="2번 차 - 혼잡"
                                            subway_car2_button.setBackgroundResource(R.drawable.train_red)
                                        }
                                        counter2>10->{
                                            subway_car2_button.text="2번 차 - 보통"
                                            subway_car2_button.setBackgroundResource(R.drawable.train_yellow)
                                        }
                                        else->{
                                            subway_car2_button.text="2번 차 - 여유"
                                            subway_car2_button.setBackgroundResource(R.drawable.train_green)

                                        }
                                    }

                                }else{
                                    if(i==2||i==25){
                                        four_to_second_button[i].setBackgroundResource(R.color.train_pregnant)
                                    }else if(i==0||i==1||i==12||i==13||i==14||i==15||i==26||i==27){
                                        four_to_second_button[i].setBackgroundResource(R.color.train_old)
                                    }else{
                                        four_to_second_button[i].setBackgroundResource(R.color.white)
                                    }
                                }
                            }
                            @SuppressLint("LongLogTag")
                            override fun onCancelled(error:DatabaseError){
                                Log.w(TAG,"Failed to read value.",error.toException())
                            }
                        })
                    }
                    // 1호선 3번칸 적용
                    for(i in _four_to_third_list.indices){
                        counter3 = 0
                        // Read from the database
                        _four_to_third_list[i].addValueEventListener(object:ValueEventListener{
                            @SuppressLint("LongLogTag")
                            override fun onDataChange(dataSnapshot:DataSnapshot){
                                // This method is called once with the initial value and again
                                // whenever data at this location is updated.
                                val value=dataSnapshot.getValue(Int::class.java)
                                if (value == 1) {
                                    four_to_third_button[i].setBackgroundResource(R.color.black)
                                    counter3 += 1
                                    when {
                                        counter3 > 20 -> {
                                            subway_car3_button.text = "3번 차 - 혼잡"
                                            subway_car3_button.setBackgroundResource(R.drawable.train_red)
                                        }
                                        counter3 > 10 -> {
                                            subway_car3_button.text = "3번 차 - 보통"
                                            subway_car3_button.setBackgroundResource(R.drawable.train_yellow)
                                        }
                                        else -> {
                                            subway_car3_button.text = "3번 차 - 여유"
                                            subway_car3_button.setBackgroundResource(R.drawable.train_green)

                                        }
                                    }

                                } else {
                                    if (i == 2 || i == 25) {
                                        four_to_third_button[i].setBackgroundResource(R.color.train_pregnant)
                                    } else if (i == 0 || i == 1 || i == 12 || i == 13 || i == 14 || i == 15 || i == 26 || i == 27) {
                                        four_to_third_button[i].setBackgroundResource(R.color.train_old)
                                    } else {
                                        four_to_third_button[i].setBackgroundResource(R.color.white)
                                    }
                                }
                            }

                            @SuppressLint("LongLogTag")
                            override fun onCancelled(error:DatabaseError){
                                Log.w(TAG,"Failed to read value.",error.toException())
                            }
                        })
                    }

                    // 1호선 4번칸 적용
                    for(i in _four_to_fourth_list.indices){
                        // Read from the database
                        counter4 = 0
                        _four_to_fourth_list[i].addValueEventListener(object:ValueEventListener{
                            @SuppressLint("LongLogTag")
                            override fun onDataChange(dataSnapshot:DataSnapshot){
                                // This method is called once with the initial value and again
                                // whenever data at this location is updated.
                                val value=dataSnapshot.getValue(Int::class.java)
                                if (value == 1) {
                                    four_to_fourth_button[i].setBackgroundResource(R.color.black)
                                    counter4 += 1
                                    when {
                                        counter4 > 20 -> {
                                            subway_car4_button.text = "4번 차 - 혼잡"
                                            subway_car4_button.setBackgroundResource(R.drawable.train_red)
                                        }
                                        counter4 > 10 -> {
                                            subway_car4_button.text = "4번 차 - 보통"
                                            subway_car4_button.setBackgroundResource(R.drawable.train_yellow)
                                        }
                                        else -> {
                                            subway_car4_button.text = "4번 차 - 여유"
                                            subway_car4_button.setBackgroundResource(R.drawable.train_green)

                                        }
                                    }

                                } else {
                                    if (i == 2 || i == 25) {
                                        four_to_fourth_button[i].setBackgroundResource(R.color.train_pregnant)
                                    } else if (i == 0 || i == 1 || i == 12 || i == 13 || i == 14 || i == 15 || i == 26 || i == 27) {
                                        four_to_fourth_button[i].setBackgroundResource(R.color.train_old)
                                    } else {
                                        four_to_fourth_button[i].setBackgroundResource(R.color.white)
                                    }
                                }
                            }

                            @SuppressLint("LongLogTag")
                            override fun onCancelled(error:DatabaseError){
                                Log.w(TAG,"Failed to read value.",error.toException())
                            }
                        })
                    }

                }
            }
        },0,2000
        )


//        //1번객차
//        val one_to_first_04 = findViewById<TextView>(R.id.one_to_first_04)
//        one_to_first_04.setBackgroundResource(R.color.black)
//        val one_to_first_11 = findViewById<TextView>(R.id.one_to_first_11)
//        one_to_first_11.setBackgroundResource(R.color.black)
//        val one_to_first_17 = findViewById<TextView>(R.id.one_to_first_17)
//        one_to_first_17.setBackgroundResource(R.color.black)
//        val one_to_first_23 = findViewById<TextView>(R.id.one_to_first_23)
//        one_to_first_23.setBackgroundResource(R.color.black)
//
//        //2번객차
//        val one_to_second_05 = findViewById<TextView>(R.id.one_to_second_05)
//        one_to_second_05.setBackgroundResource(R.color.black)
//        val one_to_second_07 = findViewById<TextView>(R.id.one_to_second_07)
//        one_to_second_07.setBackgroundResource(R.color.black)
//        val one_to_second_11 = findViewById<TextView>(R.id.one_to_second_11)
//        one_to_second_11.setBackgroundResource(R.color.black)
//        val one_to_second_18 = findViewById<TextView>(R.id.one_to_second_18)
//        one_to_second_18.setBackgroundResource(R.color.black)
//        val one_to_second_20 = findViewById<TextView>(R.id.one_to_second_20)
//        one_to_second_20.setBackgroundResource(R.color.black)
//        val one_to_second_22 = findViewById<TextView>(R.id.one_to_second_22)
//        one_to_second_22.setBackgroundResource(R.color.black)
//        val one_to_second_25 = findViewById<TextView>(R.id.one_to_second_25)
//        one_to_second_25.setBackgroundResource(R.color.black)
//
//        //3번객차
//        val one_to_third_05 = findViewById<TextView>(R.id.one_to_third_05)
//        one_to_third_05.setBackgroundResource(R.color.black)
//        val one_to_third_06 = findViewById<TextView>(R.id.one_to_third_06)
//        one_to_third_06.setBackgroundResource(R.color.black)
//        val one_to_third_09 = findViewById<TextView>(R.id.one_to_third_09)
//        one_to_third_09.setBackgroundResource(R.color.black)
//        val one_to_third_12 = findViewById<TextView>(R.id.one_to_third_12)
//        one_to_third_12.setBackgroundResource(R.color.black)
//        val one_to_third_18 = findViewById<TextView>(R.id.one_to_third_18)
//        one_to_third_18.setBackgroundResource(R.color.black)
//        val one_to_third_20 = findViewById<TextView>(R.id.one_to_third_20)
//        one_to_third_20.setBackgroundResource(R.color.black)
//        val one_to_third_22 = findViewById<TextView>(R.id.one_to_third_22)
//        one_to_third_22.setBackgroundResource(R.color.black)
//        val one_to_third_25 = findViewById<TextView>(R.id.one_to_third_25)
//        one_to_third_25.setBackgroundResource(R.color.black)
//
//        //4번객차
//        val one_to_fourth_05 = findViewById<TextView>(R.id.one_to_fourth_05)
//        one_to_fourth_05.setBackgroundResource(R.color.black)
//        val one_to_fourth_06 = findViewById<TextView>(R.id.one_to_fourth_06)
//        one_to_fourth_06.setBackgroundResource(R.color.black)
//        val one_to_fourth_07 = findViewById<TextView>(R.id.one_to_fourth_07)
//        one_to_fourth_07.setBackgroundResource(R.color.black)
//        val one_to_fourth_09 = findViewById<TextView>(R.id.one_to_fourth_09)
//        one_to_fourth_09.setBackgroundResource(R.color.black)
//        val one_to_fourth_11 = findViewById<TextView>(R.id.one_to_fourth_11)
//        one_to_fourth_11.setBackgroundResource(R.color.black)
//        val one_to_fourth_12 = findViewById<TextView>(R.id.one_to_fourth_12)
//        one_to_fourth_12.setBackgroundResource(R.color.black)
//        val one_to_fourth_17 = findViewById<TextView>(R.id.one_to_fourth_17)
//        one_to_fourth_17.setBackgroundResource(R.color.black)
//        val one_to_fourth_19 = findViewById<TextView>(R.id.one_to_fourth_19)
//        one_to_fourth_19.setBackgroundResource(R.color.black)
//        val one_to_fourth_20 = findViewById<TextView>(R.id.one_to_fourth_20)
//        one_to_fourth_20.setBackgroundResource(R.color.black)
//        val one_to_fourth_22 = findViewById<TextView>(R.id.one_to_fourth_22)
//        one_to_fourth_22.setBackgroundResource(R.color.black)
//        val one_to_fourth_23 = findViewById<TextView>(R.id.one_to_fourth_23)
//        one_to_fourth_23.setBackgroundResource(R.color.black)
//        val one_to_fourth_24 = findViewById<TextView>(R.id.one_to_fourth_24)
//        one_to_fourth_24.setBackgroundResource(R.color.black)


        //1번덮개 버튼 터치 시 1번객차 버튼 없애기
        subway_car1_button.setOnClickListener{
            subway_car1_button.visibility=View.GONE
            subway_car2_button.visibility=View.VISIBLE
            subway_car3_button.visibility=View.VISIBLE
            subway_car4_button.visibility=View.VISIBLE
        }

        //2번덮개 버튼 터치 시 2번객차 버튼 없애기
        subway_car2_button.setOnClickListener{
            subway_car1_button.visibility=View.VISIBLE
            subway_car2_button.visibility=View.GONE
            subway_car3_button.visibility=View.VISIBLE
            subway_car4_button.visibility=View.VISIBLE
        }

        //3번덮개 버튼 터치 시 3번객차 버튼 없애기
        subway_car3_button.setOnClickListener{
            subway_car1_button.visibility=View.VISIBLE
            subway_car2_button.visibility=View.VISIBLE
            subway_car3_button.visibility=View.GONE
            subway_car4_button.visibility=View.VISIBLE
        }

        //4번덮개 버튼 터치 시 4번객차 버튼 없애기
        subway_car4_button.setOnClickListener{
            subway_car1_button.visibility=View.VISIBLE
            subway_car2_button.visibility=View.VISIBLE
            subway_car3_button.visibility=View.VISIBLE
            subway_car4_button.visibility=View.GONE
        }

    }

    companion object{
        const val TAG="~~~~~~~~~~~~~~~~~~~~"
    }
}