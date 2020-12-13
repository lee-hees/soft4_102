package dsu.software.busansubway.Select

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TableLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.firebase.database.*
import dsu.software.busansubway.Details.DetailActivity_kim
import dsu.software.busansubway.R
import java.util.*

class kim : Fragment() {
    var listView: ListView? = null
    var myListAdapter: ListviewAdapter? = null
    var list_itemArrayList: ArrayList<ListViewItem>? = null
    var info30: LinearLayout? = null
    var st_name: TextView? = null
    var station_start: TextView? = null
    var station_end: TextView? = null
    var time_start: TextView? = null
    var time_end: TextView? = null
    var _move = ArrayList<DatabaseReference>()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_select_station_list, container, false)
        val gotoDetail = view.findViewById<TableLayout>(R.id.gotoDetail)
        gotoDetail.setOnClickListener {
            val intent = Intent(context, DetailActivity_kim::class.java)
            startActivity(intent)
        }
        val string = Station_string()
        list_itemArrayList = ArrayList()
        listView = view.findViewById<View>(R.id.list_view) as ListView
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_1)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_2)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_3)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_4)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_5)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_6)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_7)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_8)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_9)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_10)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_11)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_12)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_13)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_14)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_15)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_16)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_17)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_18)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_19)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_20)))
        list_itemArrayList!!.add(ListViewItem(6, getString(R.string.kim_21)))
        info30 = view.findViewById(R.id.info30)
        st_name = view.findViewById(R.id.st_name)
        val exit = view.findViewById<View>(R.id.exit) as TextView
        exit.setOnClickListener { info30!!.setVisibility(View.GONE) }
        myListAdapter = ListviewAdapter(activity, list_itemArrayList!!)
        listView!!.adapter = myListAdapter
        listView!!.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            info30!!.setVisibility(View.VISIBLE)
            st_name!!.setTextColor(Color.parseColor("#A04BA2"))
            st_name!!.setText(list_itemArrayList!![position].contents)
            DetailActivity_kim.which = 5 // 김해선 확인용
            if (list_itemArrayList!![position].contents == getString(R.string.kim_1)) {
                DetailActivity_kim.state = 0
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_2)) {
                DetailActivity_kim.state = 1
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_3)) {
                DetailActivity_kim.state = 2
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_4)) {
                DetailActivity_kim.state = 3
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_5)) {
                DetailActivity_kim.state = 4
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_6)) {
                DetailActivity_kim.state = 5
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_7)) {
                DetailActivity_kim.state = 6
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_8)) {
                DetailActivity_kim.state = 7
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_9)) {
                DetailActivity_kim.state = 8
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_10)) {
                DetailActivity_kim.state = 9
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_11)) {
                DetailActivity_kim.state = 10
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_12)) {
                DetailActivity_kim.state = 11
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_13)) {
                DetailActivity_kim.state = 12
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_14)) {
                DetailActivity_kim.state = 13
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_15)) {
                DetailActivity_kim.state = 14
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_16)) {
                DetailActivity_kim.state = 15
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_17)) {
                DetailActivity_kim.state = 16
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_18)) {
                DetailActivity_kim.state = 17
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_19)) {
                DetailActivity_kim.state = 18
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_20)) {
                DetailActivity_kim.state = 19
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.kim_21)) {
                DetailActivity_kim.state = 20
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_kim.which]!![DetailActivity_kim.state])
            }
            reset() // 원래 크기로 되돌리기
            list_itemArrayList!![position] = ListViewItem(66, list_itemArrayList!![position].contents)
            listView!!.adapter = myListAdapter
            listView!!.setSelection(position)
            //Intent todetail = new Intent(getActivity(), Detail_Tab.class);
            //startActivity(todetail);
        }
        station_start = view.findViewById(R.id.station_start)
        station_end = view.findViewById(R.id.station_end)
        station_end!!.setText("가야대행")
        station_start!!.setText("사상행")

        // Write a message to the database
        val database = FirebaseDatabase.getInstance()
        val _reverse_kim = intArrayOf(0, 0, 1, 1)
        val _current_station_kim = intArrayOf(0, 0, 20, 20)
        val kim = database.getReference("kim") // 1호선
        val kim_one = kim.child("one") // 1호선 1호차
        val kim_two = kim.child("two") // 1호선 2호차
        val kim_three = kim.child("three") // 1호선 3호차
        val kim_four = kim.child("four") // 1호선 4호차
        kim_move.add(kim_one.child("reverse"))
        kim_move.add(kim_one.child("current_station"))
        kim_move.get(0).setValue(_reverse_kim[0])
        kim_move.get(1).setValue(_current_station_kim[0])
        kim_move.add(kim_two.child("reverse"))
        kim_move.add(kim_two.child("current_station"))
        kim_move.get(2).setValue(_reverse_kim[1])
        kim_move.get(3).setValue(_current_station_kim[1])
        kim_move.add(kim_three.child("reverse"))
        kim_move.add(kim_three.child("current_station"))
        kim_move.get(4).setValue(_reverse_kim[2])
        kim_move.get(5).setValue(_current_station_kim[2])
        kim_move.add(kim_four.child("reverse"))
        kim_move.add(kim_four.child("current_station"))
        kim_move.get(6).setValue(_reverse_kim[3])
        kim_move.get(7).setValue(_current_station_kim[3])
        time_start = view.findViewById(R.id.time_start)
        time_end = view.findViewById(R.id.time_end)
        _move = kim_move
        val mTimer = Timer()
        val handler = Handler()
        mTimer.schedule(object : TimerTask() {
            override fun run() {
                handler.post {
                    // 수행할 작업을 넣는다.
                    val reverse = intArrayOf(0, 0, 0, 0)
                    val current_station = intArrayOf(0, 0, 0, 0)


                    // 현재 역 표시
                    _move[0].addValueEventListener(object : ValueEventListener {
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
                    _move[2].addValueEventListener(object : ValueEventListener {
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
                    _move[4].addValueEventListener(object : ValueEventListener {
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
                    _move[6].addValueEventListener(object : ValueEventListener {
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
                    _move[1].addValueEventListener(object : ValueEventListener {
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
                    _move[3].addValueEventListener(object : ValueEventListener {
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
                    _move[5].addValueEventListener(object : ValueEventListener {
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
                    _move[7].addValueEventListener(object : ValueEventListener {
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
                            current_station[0] = 5
                            current_station[3] = 5

                            //(

//                                                station_start.setText(Arrays).toString(nrev) + current_station[nrev[0]] + " " + current_station[nrev[1(]]);
//                                                station_end.setText(Arrays).toString(rev) + current_station[rev[0]] + " " + current_station[rev[1]]);
                            val current = DetailActivity_kim.state

                            // 왼쪽
                            if (current_station[nrev[0]] > current_station[nrev[1]]) // 멀리 있는거 먼저 체크
                            {
                                if (current > current_station[nrev[0]]) // 곧도착/정거장전
                                {
                                    if (current - current_station[nrev[0]] == 1) {
                                        time_start!!.setText("곧도착")
                                    } else {
                                        time_start!!.setText((current - current_station[nrev[0]]).toString() + "정거장 전")
                                    }
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                        time_start!!.setTextColor(Color.parseColor("#aaff0000"))
                                    }
                                } else  //
                                {
                                    if (current > current_station[nrev[1]]) // 곧도착/정거장전
                                    {
                                        if (current - current_station[nrev[1]] == 1) {
                                            time_start!!.setText("곧도착")
                                        } else {
                                            time_start!!.setText((current - current_station[nrev[1]]).toString() + "정거장 전")
                                        }
                                        time_start!!.setTextColor(Color.parseColor("#aaff0000"))
                                    } else  //곧출발
                                    {
                                        time_start!!.setText("곧출발")
                                        time_start!!.setTextColor(Color.parseColor("#555555"))
                                    }
                                }
                            } else {
                                if (current > current_station[nrev[1]]) // 곧도착/정거장전
                                {
                                    if (current - current_station[nrev[1]] == 1) {
                                        time_start!!.setText("곧도착")
                                    } else {
                                        time_start!!.setText((current - current_station[nrev[1]]).toString() + "정거장 전")
                                    }
                                    time_start!!.setTextColor(Color.parseColor("#aaff0000"))
                                } else  //
                                {
                                    if (current > current_station[nrev[0]]) // 곧도착/정거장전
                                    {
                                        if (current - current_station[nrev[0]] == 1) {
                                            time_start!!.setText("곧도착")
                                        } else {
                                            time_start!!.setText((current - current_station[nrev[0]]).toString() + "정거장 전")
                                        }
                                        time_start!!.setTextColor(Color.parseColor("#aaff0000"))
                                    } else  //곧출발
                                    {
                                        time_start!!.setText("곧출발")
                                        time_start!!.setTextColor(Color.parseColor("#555555"))
                                    }
                                }
                            }


                            // 오른쪽
                            if (current_station[rev[0]] > current_station[rev[1]]) // 멀리 있는거 먼저 체크
                            {
                                if (current < current_station[rev[1]]) // 곧도착/정거장전
                                {
                                    if (current_station[rev[1]] - current == 1) {
                                        time_end!!.setText("곧도착")
                                    } else {
                                        time_end!!.setText((current_station[rev[1]] - current).toString() + "정거장 전")
                                    }
                                    time_end!!.setTextColor(Color.parseColor("#aaff0000"))
                                } else  //
                                {
                                    if (current < current_station[rev[0]]) // 곧도착/정거장전
                                    {
                                        if (current_station[rev[0]] - current == 1) {
                                            time_end!!.setText("곧도착")
                                        } else {
                                            time_end!!.setText((current_station[rev[0]] - current).toString() + "정거장 전")
                                        }
                                        time_end!!.setTextColor(Color.parseColor("#aaff0000"))
                                    } else  //곧출발
                                    {
                                        time_end!!.setText("곧출발")
                                        time_end!!.setTextColor(Color.parseColor("#555555"))
                                    }
                                }
                            } else {
                                if (current < current_station[rev[0]]) // 곧도착/정거장전
                                {
                                    if (current_station[rev[0]] - current == 1) {
                                        time_end!!.setText("곧도착")
                                    } else {
                                        time_end!!.setText((current_station[rev[0]] - current).toString() + "정거장 전")
                                    }
                                    time_end!!.setTextColor(Color.parseColor("#aaff0000"))
                                } else  //
                                {
                                    if (current < current_station[rev[1]]) // 곧도착/정거장전
                                    {
                                        if (current_station[rev[1]] - current == 1) {
                                            time_end!!.setText("곧도착")
                                        } else {
                                            time_end!!.setText((current_station[rev[1]] - current).toString() + "정거장 전")
                                        }
                                        time_end!!.setTextColor(Color.parseColor("#aaff0000"))
                                    } else  //곧출발
                                    {
                                        time_end!!.setText("곧출발")
                                        time_end!!.setTextColor(Color.parseColor("#555555"))
                                    }
                                }
                            }


//
                        }

                        @SuppressLint("LongLogTag")
                        override fun onCancelled(error: DatabaseError) {
                        }
                    })
                }
            }
        }, 0, 100
        )
        return view
    }

    fun reset() {
        list_itemArrayList!![0] = ListViewItem(6, getString(R.string.kim_1))
        list_itemArrayList!![1] = ListViewItem(6, getString(R.string.kim_2))
        list_itemArrayList!![2] = ListViewItem(6, getString(R.string.kim_3))
        list_itemArrayList!![3] = ListViewItem(6, getString(R.string.kim_4))
        list_itemArrayList!![4] = ListViewItem(6, getString(R.string.kim_5))
        list_itemArrayList!![5] = ListViewItem(6, getString(R.string.kim_6))
        list_itemArrayList!![6] = ListViewItem(6, getString(R.string.kim_7))
        list_itemArrayList!![7] = ListViewItem(6, getString(R.string.kim_8))
        list_itemArrayList!![8] = ListViewItem(6, getString(R.string.kim_9))
        list_itemArrayList!![9] = ListViewItem(6, getString(R.string.kim_10))
        list_itemArrayList!![10] = ListViewItem(6, getString(R.string.kim_11))
        list_itemArrayList!![11] = ListViewItem(6, getString(R.string.kim_12))
        list_itemArrayList!![12] = ListViewItem(6, getString(R.string.kim_13))
        list_itemArrayList!![13] = ListViewItem(6, getString(R.string.kim_14))
        list_itemArrayList!![14] = ListViewItem(6, getString(R.string.kim_15))
        list_itemArrayList!![15] = ListViewItem(6, getString(R.string.kim_16))
        list_itemArrayList!![16] = ListViewItem(6, getString(R.string.kim_17))
        list_itemArrayList!![17] = ListViewItem(6, getString(R.string.kim_18))
        list_itemArrayList!![18] = ListViewItem(6, getString(R.string.kim_19))
        list_itemArrayList!![19] = ListViewItem(6, getString(R.string.kim_20))
        list_itemArrayList!![20] = ListViewItem(6, getString(R.string.kim_21))
    }

    companion object {
        var name: String? = null
        var kim_move = ArrayList<DatabaseReference>()
    }
}