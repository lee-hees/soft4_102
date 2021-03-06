package dsu.software.busansubway.Details

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*
import dsu.software.busansubway.Details.*
import dsu.software.busansubway.Inside.InsideActivity_first_1
import dsu.software.busansubway.Inside.InsideActivity_first_2
import dsu.software.busansubway.Inside.InsideActivity_first_3
import dsu.software.busansubway.Inside.InsideActivity_first_4
import dsu.software.busansubway.R
import java.util.*
import kotlin.collections.ArrayList

// TODO: 환승역 색 구분 + 호선에 따른 색 변화
// TODO: 버튼에 실시간 위치에 따른 남은 정거장 표시
class DetailActivity_first : AppCompatActivity() {
    private var recyclerview: RecyclerView? = null
    var left: LinearLayout? = null
    var right: LinearLayout? = null
    var center: TextView? = null
    var station_start: TextView? = null
    var station_end: TextView? = null
    var station: TextView? = null
    var hosun: TextView? = null
    var time_start: Button? = null
    var time_start2: Button? = null
    var time_end: Button? = null
    var time_end2: Button? = null
    var subway_tab = Array(6) { IntArray(43) }
    var station_hosun: LinearLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_main)
        subway_tab[0][0] = R.string.first_1
        subway_tab[0][1] = R.string.first_2
        subway_tab[0][2] = R.string.first_3
        subway_tab[0][3] = R.string.first_4
        subway_tab[0][4] = R.string.first_5
        subway_tab[0][5] = R.string.first_6
        subway_tab[0][6] = R.string.first_7
        subway_tab[0][7] = R.string.first_8
        subway_tab[0][8] = R.string.first_9
        subway_tab[0][9] = R.string.first_10
        subway_tab[0][10] = R.string.first_11
        subway_tab[0][11] = R.string.first_12
        subway_tab[0][12] = R.string.first_13
        subway_tab[0][13] = R.string.first_14
        subway_tab[0][14] = R.string.first_15
        subway_tab[0][15] = R.string.first_16
        subway_tab[0][16] = R.string.first_17
        subway_tab[0][17] = R.string.first_18
        subway_tab[0][18] = R.string.first_19
        subway_tab[0][19] = R.string.first_20
        subway_tab[0][20] = R.string.first_21
        subway_tab[0][21] = R.string.first_22
        subway_tab[0][22] = R.string.first_23
        subway_tab[0][23] = R.string.first_24
        subway_tab[0][24] = R.string.first_25
        subway_tab[0][25] = R.string.first_26
        subway_tab[0][26] = R.string.first_27
        subway_tab[0][27] = R.string.first_28
        subway_tab[0][28] = R.string.first_29
        subway_tab[0][29] = R.string.first_30
        subway_tab[0][30] = R.string.first_31
        subway_tab[0][31] = R.string.first_32
        subway_tab[0][32] = R.string.first_33
        subway_tab[0][33] = R.string.first_34
        subway_tab[0][34] = R.string.first_35
        subway_tab[0][35] = R.string.first_36
        subway_tab[0][36] = R.string.first_37
        subway_tab[0][37] = R.string.first_38
        subway_tab[0][38] = R.string.first_39
        subway_tab[0][39] = R.string.first_40
        station_hosun = findViewById(R.id.station_hosun)
        center = findViewById(R.id.center)
        hosun = findViewById(R.id.hosun)
        recyclerview = findViewById(R.id.recyclerview)
        recyclerview!!.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        station = findViewById(R.id.station)
        station!!.text = "1호선"
        right = findViewById(R.id.right)
        left = findViewById(R.id.left)
        station_start = findViewById(R.id.station_start)
        station_end = findViewById(R.id.station_end)

//        final ChangeScript changeScript = new ChangeScript();
        chagescript()
        hosun!!.setOnClickListener(View.OnClickListener { // 동래 -> 4
            if (which == 0 && state == 9) {
                DetailActivity_fourth.which = 3
                DetailActivity_fourth.state = 12
                intentfunc(DetailActivity_fourth.which)
            }
            // 교대 -> 동
            if (which == 0 && state == 10) {
                DetailActivity_dong.which = 4
                DetailActivity_dong.state = 11
                intentfunc(DetailActivity_dong.which)
            }
            // 연산 -> 3
            if (which == 0 && state == 11) {
                DetailActivity_third.which = 2
                DetailActivity_third.state = 12
                intentfunc(DetailActivity_third.which)
            }
            // 서면 -> 2
            if (which == 0 && state == 15) {
                DetailActivity_second.which = 1
                DetailActivity_second.state = 24
                intentfunc(DetailActivity_second.which)
            }
        })
        right!!.setOnClickListener(View.OnClickListener {
            state++
            chagescript()
        })
        left!!.setOnClickListener(View.OnClickListener {
            state--
            chagescript()
        })
        time_start = findViewById(R.id.time_start)
        time_start2 = findViewById(R.id.time_start2)
        time_end = findViewById(R.id.time_end)
        time_end2 = findViewById(R.id.time_end2)
        time_start!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(applicationContext, InsideActivity_first_1::class.java)
            startActivity(intent)
        })
        time_start2!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(applicationContext, InsideActivity_first_2::class.java)
            startActivity(intent)
        })
        time_end!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(applicationContext, InsideActivity_first_3::class.java)
            startActivity(intent)
        })
        time_end2!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(applicationContext, InsideActivity_first_4::class.java)
            startActivity(intent)
        })


        // Write a message to the database
        val database = FirebaseDatabase.getInstance()
        val _reverse_first = intArrayOf(0, 0, 1, 1)
        val _current_station_first = intArrayOf(0, 0, 39, 39)
        val first = database.getReference("first") // 1호선
        val first_one = first.child("one") // 1호선 1호차
        val first_two = first.child("two") // 1호선 2호차
        val first_three = first.child("three") // 1호선 3호차
        val first_four = first.child("four") // 1호선 4호차
        first_move.add(first_one.child("reverse"))
        first_move.add(first_one.child("current_station"))
        first_move[0].setValue(_reverse_first[0])
        first_move[1].setValue(_current_station_first[0])
        first_move.add(first_two.child("reverse"))
        first_move.add(first_two.child("current_station"))
        first_move[2].setValue(_reverse_first[1])
        first_move[3].setValue(_current_station_first[1])
        first_move.add(first_three.child("reverse"))
        first_move.add(first_three.child("current_station"))
        first_move[4].setValue(_reverse_first[2])
        first_move[5].setValue(_current_station_first[2])
        first_move.add(first_four.child("reverse"))
        first_move.add(first_four.child("current_station"))
        first_move[6].setValue(_reverse_first[3])
        first_move[7].setValue(_current_station_first[3])
        val first_one_to_first = first_one.child("one_to_first") // 1호차의 1번칸
        val first_one_to_second = first_one.child("one_to_second") // 1호차의 2번칸
        val first_one_to_third = first_one.child("one_to_third") // 1호차의 3번칸
        val first_one_to_fourth = first_one.child("one_to_fourth") // 1호차의 4번칸
        val first_two_to_first = first_two.child("two_to_first") // 2호차의 1번칸
        val first_two_to_second = first_two.child("two_to_second") // 2호차의 2번칸
        val first_two_to_third = first_two.child("two_to_third") // 2호차의 3번칸
        val first_two_to_fourth = first_two.child("two_to_fourth") // 2호차의 4번칸
        val first_three_to_first = first_three.child("three_to_first") // 3호차의 1번칸
        val first_three_to_second = first_three.child("three_to_second") // 3호차의 2번칸
        val first_three_to_third = first_three.child("three_to_third") // 3호차의 3번칸
        val first_three_to_fourth = first_three.child("three_to_fourth") // 3호차의 4번칸
        val first_four_to_first = first_four.child("four_to_first") // 4호차의 1번칸
        val first_four_to_second = first_four.child("four_to_second") // 4호차의 2번칸
        val first_four_to_third = first_four.child("four_to_third") // 4호차의 3번칸
        val first_four_to_fourth = first_four.child("four_to_fourth") // 4호차의 4번칸
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_01"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_02"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_03"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_04"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_05"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_06"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_07"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_08"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_09"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_10"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_11"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_12"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_13"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_14"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_15"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_16"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_17"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_18"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_19"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_20"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_21"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_22"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_23"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_24"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_25"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_26"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_27"))
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_28"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_01"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_02"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_03"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_04"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_05"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_06"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_07"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_08"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_09"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_10"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_11"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_12"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_13"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_14"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_15"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_16"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_17"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_18"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_19"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_20"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_21"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_22"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_23"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_24"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_25"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_26"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_27"))
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_28"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_01"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_02"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_03"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_04"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_05"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_06"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_07"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_08"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_09"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_10"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_11"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_12"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_13"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_14"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_15"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_16"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_17"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_18"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_19"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_20"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_21"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_22"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_23"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_24"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_25"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_26"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_27"))
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_28"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_01"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_02"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_03"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_04"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_05"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_06"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_07"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_08"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_09"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_10"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_11"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_12"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_13"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_14"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_15"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_16"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_17"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_18"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_19"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_20"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_21"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_22"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_23"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_24"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_25"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_26"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_27"))
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_28"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_01"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_02"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_03"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_04"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_05"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_06"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_07"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_08"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_09"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_10"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_11"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_12"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_13"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_14"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_15"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_16"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_17"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_18"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_19"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_20"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_21"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_22"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_23"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_24"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_25"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_26"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_27"))
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_28"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_01"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_02"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_03"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_04"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_05"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_06"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_07"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_08"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_09"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_10"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_11"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_12"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_13"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_14"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_15"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_16"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_17"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_18"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_19"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_20"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_21"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_22"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_23"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_24"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_25"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_26"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_27"))
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_28"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_01"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_02"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_03"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_04"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_05"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_06"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_07"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_08"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_09"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_10"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_11"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_12"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_13"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_14"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_15"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_16"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_17"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_18"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_19"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_20"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_21"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_22"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_23"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_24"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_25"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_26"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_27"))
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_28"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_01"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_02"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_03"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_04"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_05"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_06"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_07"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_08"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_09"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_10"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_11"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_12"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_13"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_14"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_15"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_16"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_17"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_18"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_19"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_20"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_21"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_22"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_23"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_24"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_25"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_26"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_27"))
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_28"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_01"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_02"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_03"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_04"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_05"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_06"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_07"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_08"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_09"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_10"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_11"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_12"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_13"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_14"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_15"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_16"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_17"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_18"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_19"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_20"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_21"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_22"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_23"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_24"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_25"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_26"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_27"))
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_28"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_01"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_02"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_03"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_04"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_05"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_06"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_07"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_08"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_09"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_10"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_11"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_12"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_13"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_14"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_15"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_16"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_17"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_18"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_19"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_20"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_21"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_22"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_23"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_24"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_25"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_26"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_27"))
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_28"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_01"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_02"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_03"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_04"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_05"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_06"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_07"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_08"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_09"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_10"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_11"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_12"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_13"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_14"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_15"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_16"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_17"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_18"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_19"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_20"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_21"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_22"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_23"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_24"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_25"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_26"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_27"))
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_28"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_01"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_02"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_03"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_04"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_05"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_06"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_07"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_08"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_09"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_10"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_11"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_12"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_13"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_14"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_15"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_16"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_17"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_18"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_19"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_20"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_21"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_22"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_23"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_24"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_25"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_26"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_27"))
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_28"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_01"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_02"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_03"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_04"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_05"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_06"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_07"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_08"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_09"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_10"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_11"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_12"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_13"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_14"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_15"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_16"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_17"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_18"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_19"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_20"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_21"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_22"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_23"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_24"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_25"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_26"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_27"))
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_28"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_01"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_02"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_03"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_04"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_05"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_06"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_07"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_08"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_09"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_10"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_11"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_12"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_13"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_14"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_15"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_16"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_17"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_18"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_19"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_20"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_21"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_22"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_23"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_24"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_25"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_26"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_27"))
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_28"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_01"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_02"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_03"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_04"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_05"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_06"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_07"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_08"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_09"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_10"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_11"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_12"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_13"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_14"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_15"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_16"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_17"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_18"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_19"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_20"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_21"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_22"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_23"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_24"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_25"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_26"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_27"))
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_28"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_01"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_02"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_03"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_04"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_05"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_06"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_07"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_08"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_09"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_10"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_11"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_12"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_13"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_14"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_15"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_16"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_17"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_18"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_19"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_20"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_21"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_22"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_23"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_24"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_25"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_26"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_27"))
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_28"))
        val mTimer = Timer()
        val handler = Handler()
        mTimer.schedule(object : TimerTask() {
            override fun run() {
                handler.post {
                    // 수행할 작업을 넣는다.
                    val reverse = intArrayOf(0, 0, 0, 0)
                    val current_station = intArrayOf(0, 0, 0, 0)


                    // 현재 역 표시
                    first_move[0].addValueEventListener(object : ValueEventListener {
                        @SuppressLint("LongLogTag")
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            // This method is called once with the initial value and again
                            // whenever data at this location is updated.
                            val value = dataSnapshot.getValue(Int::class.java)
                            reverse[0] = value!!
                        }

                        @SuppressLint("LongLogTag")
                        override fun onCancelled(error: DatabaseError) {
                        }
                    })
                    first_move[2].addValueEventListener(object : ValueEventListener {
                        @SuppressLint("LongLogTag")
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            // This method is called once with the initial value and again
                            // whenever data at this location is updated.
                            val value = dataSnapshot.getValue(Int::class.java)
                            reverse[1] = value!!
                        }

                        @SuppressLint("LongLogTag")
                        override fun onCancelled(error: DatabaseError) {
                        }
                    })
                    first_move[4].addValueEventListener(object : ValueEventListener {
                        @SuppressLint("LongLogTag")
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            // This method is called once with the initial value and again
                            // whenever data at this location is updated.
                            val value = dataSnapshot.getValue(Int::class.java)
                            reverse[2] = value!!
                        }

                        @SuppressLint("LongLogTag")
                        override fun onCancelled(error: DatabaseError) {
                        }
                    })
                    first_move[6].addValueEventListener(object : ValueEventListener {
                        @SuppressLint("LongLogTag")
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            // This method is called once with the initial value and again
                            // whenever data at this location is updated.
                            val value = dataSnapshot.getValue(Int::class.java)
                            reverse[3] = value!!
                        }

                        @SuppressLint("LongLogTag")
                        override fun onCancelled(error: DatabaseError) {
                        }
                    })
                    first_move[1].addValueEventListener(object : ValueEventListener {
                        @SuppressLint("LongLogTag")
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            // This method is called once with the initial value and again
                            // whenever data at this location is updated.
                            val value = dataSnapshot.getValue(Int::class.java)
                            current_station[0] = value!!
                        }

                        @SuppressLint("LongLogTag")
                        override fun onCancelled(error: DatabaseError) {
                        }
                    })
                    first_move[3].addValueEventListener(object : ValueEventListener {
                        @SuppressLint("LongLogTag")
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            // This method is called once with the initial value and again
                            // whenever data at this location is updated.
                            val value = dataSnapshot.getValue(Int::class.java)
                            current_station[1] = value!!
                        }

                        @SuppressLint("LongLogTag")
                        override fun onCancelled(error: DatabaseError) {
                        }
                    })
                    first_move[5].addValueEventListener(object : ValueEventListener {
                        @SuppressLint("LongLogTag")
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            // This method is called once with the initial value and again
                            // whenever data at this location is updated.
                            val value = dataSnapshot.getValue(Int::class.java)
                            current_station[2] = value!!
                        }

                        @SuppressLint("LongLogTag")
                        override fun onCancelled(error: DatabaseError) {
                        }
                    })
                    first_move[7].addValueEventListener(object : ValueEventListener {
                        @SuppressLint("LongLogTag", "SetTextI18n")
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            // This method is called once with the initial value and again
                            // whenever data at this location is updated.
                            val value = dataSnapshot.getValue(Int::class.java)
                            current_station[3] = value!!
                            val rev = intArrayOf(0, 0)
                            val nrev = intArrayOf(0, 0)
                            var i = 0
                            var count1 = 0
                            var count2 = 0
                            while (i < reverse.size) {
                                if (reverse[i] == 1) {
                                    rev[count1++] = i
                                } else {
                                    nrev[count2++] = i
                                }
                                i++
                            }

                            // test 용도 - 완료 후 주석 처리할 것
                            current_station[0] = 15
                            current_station[1] = 10
                            current_station[2] = 5
                            current_station[3] = 10

                            //

//                                                station_start.setText(Arrays.toString(nrev) + current_station[nrev[0]] + " " + current_station[nrev[1]]);
//                                                station_end.setText(Arrays.toString(rev) + current_station[rev[0]] + " " + current_station[rev[1]]);
                            val current = state

                            // 왼쪽
                            if (current_station[nrev[0]] > current_station[nrev[1]]) // 멀리 있는거 먼저 체크
                            {
                                if (current > current_station[nrev[0]]) // 곧도착/정거장전
                                {
                                    if (current - current_station[nrev[0]] == 1) {
                                        time_start!!.text = "곧도착"
                                    } else {
                                        time_start!!.text = (current - current_station[nrev[0]]).toString() + "정거장 전"
                                    }
                                    if (current - current_station[nrev[1]] == 1) {
                                        time_start2!!.text = "곧도착"
                                    } else {
                                        time_start2!!.text = (current - current_station[nrev[1]]).toString() + "정거장 전"
                                    }
                                    time_start!!.setTextColor(Color.parseColor("#aaff0000"))
                                    time_start2!!.setTextColor(Color.parseColor("#aaff0000"))
                                } else  //
                                {
                                    if (current > current_station[nrev[1]]) // 곧도착/정거장전
                                    {
                                        if (current - current_station[nrev[1]] == 1) {
                                            time_start!!.text = "곧도착"
                                        } else {
                                            time_start!!.text = (current - current_station[nrev[1]]).toString() + "정거장 전"
                                        }
                                        time_start2!!.text = "곧출발"
                                        time_start!!.setTextColor(Color.parseColor("#aaff0000"))
                                        time_start2!!.setTextColor(Color.parseColor("#555555"))
                                    } else  //곧출발
                                    {
                                        time_start!!.text = "곧출발"
                                        time_start2!!.text = "곧출발"
                                        time_start!!.setTextColor(Color.parseColor("#555555"))
                                        time_start2!!.setTextColor(Color.parseColor("#555555"))
                                    }
                                }
                            } else {
                                if (current > current_station[nrev[1]]) // 곧도착/정거장전
                                {
                                    if (current - current_station[nrev[1]] == 1) {
                                        time_start!!.text = "곧도착"
                                    } else {
                                        time_start!!.text = (current - current_station[nrev[1]]).toString() + "정거장 전"
                                    }
                                    if (current - current_station[nrev[0]] == 1) {
                                        time_start2!!.text = "곧도착"
                                    } else {
                                        time_start2!!.text = (current - current_station[nrev[0]]).toString() + "정거장 전"
                                    }
                                    time_start!!.setTextColor(Color.parseColor("#aaff0000"))
                                    time_start2!!.setTextColor(Color.parseColor("#aaff0000"))
                                } else  //
                                {
                                    if (current > current_station[nrev[0]]) // 곧도착/정거장전
                                    {
                                        if (current - current_station[nrev[0]] == 1) {
                                            time_start!!.text = "곧도착"
                                        } else {
                                            time_start!!.text = (current - current_station[nrev[0]]).toString() + "정거장 전"
                                        }
                                        time_start2!!.text = "곧출발"
                                        time_start!!.setTextColor(Color.parseColor("#aaff0000"))
                                        time_start2!!.setTextColor(Color.parseColor("#555555"))
                                    } else  //곧출발
                                    {
                                        time_start!!.text = "곧출발"
                                        time_start2!!.text = "곧출발"
                                        time_start!!.setTextColor(Color.parseColor("#555555"))
                                        time_start2!!.setTextColor(Color.parseColor("#555555"))
                                    }
                                }
                            }


                            // 오른쪽
                            if (current_station[rev[0]] > current_station[rev[1]]) // 멀리 있는거 먼저 체크
                            {
                                if (current < current_station[rev[1]]) // 곧도착/정거장전
                                {
                                    if (current_station[rev[1]] - current == 1) {
                                        time_end!!.text = "곧도착"
                                    } else {
                                        time_end!!.text = (current_station[rev[1]] - current).toString() + "정거장 전"
                                    }
                                    if (current_station[rev[0]] - current == 1) {
                                        time_end2!!.text = "곧도착"
                                    } else {
                                        time_end2!!.text = (current_station[rev[0]] - current).toString() + "정거장 전"
                                    }
                                    time_end!!.setTextColor(Color.parseColor("#aaff0000"))
                                    time_end2!!.setTextColor(Color.parseColor("#aaff0000"))
                                } else  //
                                {
                                    if (current < current_station[rev[0]]) // 곧도착/정거장전
                                    {
                                        if (current_station[rev[0]] - current == 1) {
                                            time_end!!.text = "곧도착"
                                        } else {
                                            time_end!!.text = (current_station[rev[0]] - current).toString() + "정거장 전"
                                        }
                                        time_end2!!.text = "곧출발"
                                        time_end!!.setTextColor(Color.parseColor("#aaff0000"))
                                        time_end2!!.setTextColor(Color.parseColor("#555555"))
                                    } else  //곧출발
                                    {
                                        time_end!!.text = "곧출발"
                                        time_end2!!.text = "곧출발"
                                        time_end!!.setTextColor(Color.parseColor("#555555"))
                                        time_end2!!.setTextColor(Color.parseColor("#555555"))
                                    }
                                }
                            } else {
                                if (current < current_station[rev[0]]) // 곧도착/정거장전
                                {
                                    if (current_station[rev[0]] - current == 1) {
                                        time_end!!.text = "곧도착"
                                    } else {
                                        time_end!!.text = (current_station[rev[0]] - current).toString() + "정거장 전"
                                    }
                                    if (current_station[rev[1]] - current == 1) {
                                        time_end2!!.text = "곧도착"
                                    } else {
                                        time_end2!!.text = (current_station[rev[1]] - current).toString() + "정거장 전"
                                    }
                                    time_end!!.setTextColor(Color.parseColor("#aaff0000"))
                                    time_end2!!.setTextColor(Color.parseColor("#aaff0000"))
                                } else  //
                                {
                                    if (current < current_station[rev[1]]) // 곧도착/정거장전
                                    {
                                        if (current_station[rev[1]] - current == 1) {
                                            time_end!!.text = "곧도착"
                                        } else {
                                            time_end!!.text = (current_station[rev[1]] - current).toString() + "정거장 전"
                                        }
                                        time_end2!!.text = "곧출발"
                                        time_end!!.setTextColor(Color.parseColor("#aaff0000"))
                                        time_end2!!.setTextColor(Color.parseColor("#555555"))
                                    } else  //곧출발
                                    {
                                        time_end!!.text = "곧출발"
                                        time_end2!!.text = "곧출발"
                                        time_end!!.setTextColor(Color.parseColor("#555555"))
                                        time_end2!!.setTextColor(Color.parseColor("#555555"))
                                    }
                                }
                            }
                        }

                        @SuppressLint("LongLogTag")
                        override fun onCancelled(error: DatabaseError) {
                        }
                    })
                }
            }
        }, 0, 100
        )
    }

    fun intentfunc(detailwhich: Int) {
        if (detailwhich == 0) {
            val intent = Intent(applicationContext, DetailActivity_first::class.java)
            startActivity(intent)
            finish()
        } else if (detailwhich == 1) {
            val intent = Intent(applicationContext, DetailActivity_second::class.java)
            startActivity(intent)
            finish()
        } else if (detailwhich == 2) {
            val intent = Intent(applicationContext, DetailActivity_third::class.java)
            startActivity(intent)
            finish()
        } else if (detailwhich == 3) {
            val intent = Intent(applicationContext, DetailActivity_fourth::class.java)
            startActivity(intent)
            finish()
        } else if (detailwhich == 4) {
            val intent = Intent(applicationContext, DetailActivity_dong::class.java)
            startActivity(intent)
            finish()
        } else if (detailwhich == 5) {
            val intent = Intent(applicationContext, DetailActivity_kim::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun chagescript() {
        if (subway_tab[which][state] == subway_tab[0][0]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setText(R.string.first_1)
            title = center!!.text as String
            left!!.visibility = View.INVISIBLE
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_1_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_1_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_1_3)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_1)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_1)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][1]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_2)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            left!!.visibility = View.VISIBLE
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_2_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_2_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_2_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_2_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_2_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_2_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_2_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_2_8)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_2)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_2)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][2]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_3)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_3_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_3_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_3_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_3_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_3_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_3_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_3_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_3_8)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_3)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_3)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][3]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_4)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_4_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_4_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_4_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_4_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_4_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_4_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_4_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_4_8)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_4)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_4)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][4]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_5)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_5_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_5_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_5_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_5_4)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_5)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_5)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][5]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_6)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_6_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_6_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_6_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_6_4)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_6)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_6)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][6]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_7)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_7_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_7_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_7_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_7_4)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_7)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_7)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][7]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_8)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_8_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_8_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_8_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_8_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_8_5)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_8)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_8)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][8]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_9)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_9_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_9_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_9_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_9_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_9_5)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_9)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_9)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][9]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.VISIBLE
            hosun!!.text = "4호선"
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_10)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_10_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_10_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_10_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_10_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_10_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_10_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_10_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_10_8)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_10)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_10)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][10]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.VISIBLE
            hosun!!.text = "동해선"
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_11)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_11_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_11_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_11_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_11_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_11_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_11_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_11_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_9)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_11_9)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_11_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_11)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_11_11)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_12)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_11_12)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_11)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_11)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][11]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.VISIBLE
            hosun!!.text = "3호선"
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_12)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_12_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_12_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_12_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_12_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_12_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_12_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_12_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_12_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_12_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_12)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_12_12)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_14)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_12_14)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_16)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_12_16)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_17)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_12_17)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_12)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_12)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][12]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_13)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_13_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_13_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_13_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_13_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_13_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_13_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_13_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_13_8)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_13)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_13)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][13]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_14)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_14_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_14_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_14_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_14_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_14_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_14_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_14_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_14_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_9)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_14_9)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_14)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_14)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][14]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_15)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_15_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_15_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_15_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_15_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_15_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_15_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_15_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_15_8)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_15)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_15)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][15]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.VISIBLE
            hosun!!.text = "2호선"
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_16)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_16_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_16_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_16_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_16_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_16_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_16_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_16_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_16_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_16_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_11)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_16_11)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_12)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_16_12)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_13)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_16_13)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_15)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_16_15)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_16)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_16)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][16]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_17)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_17_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_17_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_17_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_17_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_17_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_17_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_17_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_17_8)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_17)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_17)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][17]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_18)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_18_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_18_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_18_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_18_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_18_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_18_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_18_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_18_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_9)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_18_9)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_18_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_12)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_18_12)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_18)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_18)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][18]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_19)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_19_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_19_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_19_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_19_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_19_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_19_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_19_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_19_8)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_19)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_19)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][19]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_20)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_20_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_20_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_20_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_20_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_20_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_20_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_20_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_20_8)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_20)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_20)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][20]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_21)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_21_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_21_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_21_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_21_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_21_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_21_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_21_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_21_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_9)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_21_9)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_21_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_12)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_21_12)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_21)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_21)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][21]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_22)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_22_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_22_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_22_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_22_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_22_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_22_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_22_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_22_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_22_10)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_22)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_22)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][22]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_23)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_9)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23_9)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_11)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23_11)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_12)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23_12)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_13)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23_13)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_14)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23_14)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_15)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_17)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23_17)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_23)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_23)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][23]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_24)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_24_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_24_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_24_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_24_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_24_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_24_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_24_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_24_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_24_10)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_24)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_24)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][24]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            station!!.text = "1호선"
            center!!.setText(R.string.first_25)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_25_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_25_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_25_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_25_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_25_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_25_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_25_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_25_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_25_10)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_25)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_25)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][25]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_26)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_26_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_26_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_26_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_26_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_26_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_26_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_26_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_26_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_9)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_26_9)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_26_10)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_26)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_26)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][26]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_27)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_27_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_27_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_27_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_27_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_27_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_27_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_27_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_27_8)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_27)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_27)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][27]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_28)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_28_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_28_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_28_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_28_4)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_28)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_28)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][28]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_29)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_29_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_29_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_29_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_29_4)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_29)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_29)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][29]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_30)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_30_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_30_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_30_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_30_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_30_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_30_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_30_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_30_10)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_30)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_30)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][30]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_31)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_31_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_31_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_31_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_31_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_31_5)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_31)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_31)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][31]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_32)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_32_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_32_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_32_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_32_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_32_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_32_6)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_32)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_32)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][32]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_33)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_33_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_33_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_33_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_33_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_33_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_33_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_33_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_33_8)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_9)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_33_9)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_33_10)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_11)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_33_11)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_12)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_33_12)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_33)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_33)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][33]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_34)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_34_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_34_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_34_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_34_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_34_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_34_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_34_7)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_9)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_34_9)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_34)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_34)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][34]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_35)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_35_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_35_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_35_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_35_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_35_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_35_6)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_35)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_35)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][35]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_36)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_36_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_36_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_36_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_36_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_36_5)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_36_6)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_36)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_36)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][36]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_37)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_37_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_37_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_37_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_37_4)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_37)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_37)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][37]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_38)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_38_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_38_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_38_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_38_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_38_5)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_38)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_38)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][38]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_39)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            right!!.visibility = View.VISIBLE
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_39_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_39_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_39_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_39_4)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_39)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_39)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        } else if (subway_tab[which][state] == subway_tab[0][39]) {
            station!!.setTextColor(Color.parseColor("#FC7F25"))
            hosun!!.visibility = View.GONE
            center!!.setTextColor(Color.parseColor("#FC7F25"))
            center!!.setText(R.string.first_40)
            title = center!!.text as String
            station_start!!.text = "다대포해수욕장행"
            station_end!!.text = "노포행"
            val data: MutableList<ExpandableListAdapter.Item?> = ArrayList()
            val exit = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보")
            exit.invisibleChildren = ArrayList()
            val fainfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보")
            fainfo.invisibleChildren = ArrayList()
            val etcinfo = ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호")
            etcinfo.invisibleChildren = ArrayList()
            right!!.visibility = View.INVISIBLE
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_40_1)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_40_2)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_40_3)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)))
            exit.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_40_4)))
            fainfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_40)))
            etcinfo.invisibleChildren!!.add(ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_40)))
            data.add(exit)
            data.add(fainfo)
            data.add(etcinfo)
            recyclerview!!.adapter = ExpandableListAdapter(data)
        }
    }

    companion object {
        var which = 0
        var state = 0
        var title = ""

        //    String add = R.string.app_name;
        var first_move = ArrayList<DatabaseReference>()
        var first_one_to_first_list = ArrayList<DatabaseReference>()
        var first_one_to_second_list = ArrayList<DatabaseReference>()
        var first_one_to_third_list = ArrayList<DatabaseReference>()
        var first_one_to_fourth_list = ArrayList<DatabaseReference>()
        var first_two_to_first_list = ArrayList<DatabaseReference>()
        var first_two_to_second_list = ArrayList<DatabaseReference>()
        var first_two_to_third_list = ArrayList<DatabaseReference>()
        var first_two_to_fourth_list = ArrayList<DatabaseReference>()
        var first_three_to_first_list = ArrayList<DatabaseReference>()
        var first_three_to_second_list = ArrayList<DatabaseReference>()
        var first_three_to_third_list = ArrayList<DatabaseReference>()
        var first_three_to_fourth_list = ArrayList<DatabaseReference>()
        var first_four_to_first_list = ArrayList<DatabaseReference>()
        var first_four_to_second_list = ArrayList<DatabaseReference>()
        var first_four_to_third_list = ArrayList<DatabaseReference>()
        var first_four_to_fourth_list = ArrayList<DatabaseReference>()
    }
}