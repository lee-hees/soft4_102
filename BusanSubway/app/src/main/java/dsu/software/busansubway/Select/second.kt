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
import dsu.software.busansubway.Details.DetailActivity_second
import dsu.software.busansubway.R
import java.util.*

class second : Fragment() {
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
            val intent = Intent(context, DetailActivity_second::class.java)
            startActivity(intent)
        }
        val string = Station_string()
        list_itemArrayList = ArrayList()
        listView = view.findViewById<View>(R.id.list_view) as ListView
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_1)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_2)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_3)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_4)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_5)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_6)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_7)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_8)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_9)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_10)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_11)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_12)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_13)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_14)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_15)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_16)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_17)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_18)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_19)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_20)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_21)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_22)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_23)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_24)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_25)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_26)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_27)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_28)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_29)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_30)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_31)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_32)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_33)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_34)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_35)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_36)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_37)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_38)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_39)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_40)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_41)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_42)))
        list_itemArrayList!!.add(ListViewItem(2, getString(R.string.second_43)))
        info30 = view.findViewById(R.id.info30)
        st_name = view.findViewById(R.id.st_name)
        val exit = view.findViewById<View>(R.id.exit) as TextView
        exit.setOnClickListener { info30!!.setVisibility(View.GONE) }
        myListAdapter = ListviewAdapter(activity, list_itemArrayList!!)
        listView!!.adapter = myListAdapter
        listView!!.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            info30!!.setVisibility(View.VISIBLE)
            st_name!!.setTextColor(Color.parseColor("#B2E419"))
            st_name!!.setText(list_itemArrayList!![position].contents)
            DetailActivity_second.which = 1 // 2호선 확인용
            if (list_itemArrayList!![position].contents == getString(R.string.second_1)) {
                DetailActivity_second.state = 0
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_2)) {
                DetailActivity_second.state = 1
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_3)) {
                DetailActivity_second.state = 2
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_4)) {
                DetailActivity_second.state = 3
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_5)) {
                DetailActivity_second.state = 4
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_6)) {
                DetailActivity_second.state = 5
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_7)) {
                DetailActivity_second.state = 6
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_8)) {
                DetailActivity_second.state = 7
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_9)) {
                DetailActivity_second.state = 8
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_10)) {
                DetailActivity_second.state = 9
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_11)) {
                DetailActivity_second.state = 10
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_12)) {
                DetailActivity_second.state = 11
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_13)) {
                DetailActivity_second.state = 12
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_14)) {
                DetailActivity_second.state = 13
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_15)) {
                DetailActivity_second.state = 14
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_16)) {
                DetailActivity_second.state = 15
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_17)) {
                DetailActivity_second.state = 16
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_18)) {
                DetailActivity_second.state = 17
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_19)) {
                DetailActivity_second.state = 18
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_20)) {
                DetailActivity_second.state = 19
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_21)) {
                DetailActivity_second.state = 20
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_22)) {
                DetailActivity_second.state = 21
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_23)) {
                DetailActivity_second.state = 22
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_24)) {
                DetailActivity_second.state = 23
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_25)) {
                DetailActivity_second.state = 24
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_26)) {
                DetailActivity_second.state = 25
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_27)) {
                DetailActivity_second.state = 26
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_28)) {
                DetailActivity_second.state = 27
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_29)) {
                DetailActivity_second.state = 28
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_30)) {
                DetailActivity_second.state = 29
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_31)) {
                DetailActivity_second.state = 30
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_32)) {
                DetailActivity_second.state = 31
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_33)) {
                DetailActivity_second.state = 32
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_34)) {
                DetailActivity_second.state = 33
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_35)) {
                DetailActivity_second.state = 34
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_36)) {
                DetailActivity_second.state = 35
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_37)) {
                DetailActivity_second.state = 36
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_38)) {
                DetailActivity_second.state = 37
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_39)) {
                DetailActivity_second.state = 38
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_40)) {
                DetailActivity_second.state = 39
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_41)) {
                DetailActivity_second.state = 40
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_42)) {
                DetailActivity_second.state = 41
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            } else if (list_itemArrayList!![position].contents == getString(R.string.second_43)) {
                DetailActivity_second.state = 42
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_second.which]!![DetailActivity_second.state])
            }
            reset() // 원래 크기로 되돌리기
            list_itemArrayList!![position] = ListViewItem(22, list_itemArrayList!![position].contents)
            listView!!.adapter = myListAdapter
            listView!!.setSelection(position) // 클릭한거 제일 위로
            //Intent todetail = new Intent(getActivity(), Detail_Tab.class);
            //startActivity(todetail);
        }
        station_start = view.findViewById(R.id.station_start)
        station_end = view.findViewById(R.id.station_end)
        station_end!!.setText("양산행")
        station_start!!.setText("장산행")

        // Write a message to the database
        val database = FirebaseDatabase.getInstance()
        val _reverse_second = intArrayOf(0, 0, 1, 1)
        val _current_station_second = intArrayOf(0, 0, 42, 42)
        val second = database.getReference("second") // 2호선
        val second_one = second.child("one") // 2호선 1호차
        val second_two = second.child("two") // 2호선 2호차
        val second_three = second.child("three") // 2호선 3호차
        val second_four = second.child("four") // 2호선 4호차
        second_move.add(second_one.child("reverse"))
        second_move.add(second_one.child("current_station"))
        second_move.get(0).setValue(_reverse_second[0])
        second_move.get(1).setValue(_current_station_second[0])
        second_move.add(second_two.child("reverse"))
        second_move.add(second_two.child("current_station"))
        second_move.get(2).setValue(_reverse_second[1])
        second_move.get(3).setValue(_current_station_second[1])
        second_move.add(second_three.child("reverse"))
        second_move.add(second_three.child("current_station"))
        second_move.get(4).setValue(_reverse_second[2])
        second_move.get(5).setValue(_current_station_second[2])
        second_move.add(second_four.child("reverse"))
        second_move.add(second_four.child("current_station"))
        second_move.get(6).setValue(_reverse_second[3])
        second_move.get(7).setValue(_current_station_second[3])
        time_start = view.findViewById(R.id.time_start)
        time_end = view.findViewById(R.id.time_end)
        _move = second_move
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
                            current_station[1] = 10
                            current_station[2] = 15
                            current_station[3] = 10

                            //

//                                                station_start.setText(Arrays.toString(nrev) + current_station[nrev[0]] + " " + current_station[nrev[1]]);
//                                                station_end.setText(Arrays.toString(rev) + current_station[rev[0]] + " " + current_station[rev[1]]);
                            val current = DetailActivity_second.state

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
        list_itemArrayList!![0] = ListViewItem(2, getString(R.string.second_1))
        list_itemArrayList!![1] = ListViewItem(2, getString(R.string.second_2))
        list_itemArrayList!![2] = ListViewItem(2, getString(R.string.second_3))
        list_itemArrayList!![3] = ListViewItem(2, getString(R.string.second_4))
        list_itemArrayList!![4] = ListViewItem(2, getString(R.string.second_5))
        list_itemArrayList!![5] = ListViewItem(2, getString(R.string.second_6))
        list_itemArrayList!![6] = ListViewItem(2, getString(R.string.second_7))
        list_itemArrayList!![7] = ListViewItem(2, getString(R.string.second_8))
        list_itemArrayList!![8] = ListViewItem(2, getString(R.string.second_9))
        list_itemArrayList!![9] = ListViewItem(2, getString(R.string.second_10))
        list_itemArrayList!![10] = ListViewItem(2, getString(R.string.second_11))
        list_itemArrayList!![11] = ListViewItem(2, getString(R.string.second_12))
        list_itemArrayList!![12] = ListViewItem(2, getString(R.string.second_13))
        list_itemArrayList!![13] = ListViewItem(2, getString(R.string.second_14))
        list_itemArrayList!![14] = ListViewItem(2, getString(R.string.second_15))
        list_itemArrayList!![15] = ListViewItem(2, getString(R.string.second_16))
        list_itemArrayList!![16] = ListViewItem(2, getString(R.string.second_17))
        list_itemArrayList!![17] = ListViewItem(2, getString(R.string.second_18))
        list_itemArrayList!![18] = ListViewItem(2, getString(R.string.second_19))
        list_itemArrayList!![19] = ListViewItem(2, getString(R.string.second_20))
        list_itemArrayList!![20] = ListViewItem(2, getString(R.string.second_21))
        list_itemArrayList!![21] = ListViewItem(2, getString(R.string.second_22))
        list_itemArrayList!![22] = ListViewItem(2, getString(R.string.second_23))
        list_itemArrayList!![23] = ListViewItem(2, getString(R.string.second_24))
        list_itemArrayList!![24] = ListViewItem(2, getString(R.string.second_25))
        list_itemArrayList!![25] = ListViewItem(2, getString(R.string.second_26))
        list_itemArrayList!![26] = ListViewItem(2, getString(R.string.second_27))
        list_itemArrayList!![27] = ListViewItem(2, getString(R.string.second_28))
        list_itemArrayList!![28] = ListViewItem(2, getString(R.string.second_29))
        list_itemArrayList!![29] = ListViewItem(2, getString(R.string.second_30))
        list_itemArrayList!![30] = ListViewItem(2, getString(R.string.second_31))
        list_itemArrayList!![31] = ListViewItem(2, getString(R.string.second_32))
        list_itemArrayList!![32] = ListViewItem(2, getString(R.string.second_33))
        list_itemArrayList!![33] = ListViewItem(2, getString(R.string.second_34))
        list_itemArrayList!![34] = ListViewItem(2, getString(R.string.second_35))
        list_itemArrayList!![35] = ListViewItem(2, getString(R.string.second_36))
        list_itemArrayList!![36] = ListViewItem(2, getString(R.string.second_37))
        list_itemArrayList!![37] = ListViewItem(2, getString(R.string.second_38))
        list_itemArrayList!![38] = ListViewItem(2, getString(R.string.second_39))
        list_itemArrayList!![39] = ListViewItem(2, getString(R.string.second_40))
        list_itemArrayList!![40] = ListViewItem(2, getString(R.string.second_41))
        list_itemArrayList!![41] = ListViewItem(2, getString(R.string.second_42))
        list_itemArrayList!![42] = ListViewItem(2, getString(R.string.second_43))
    }

    companion object {
        var name: String? = null
        var second_move = ArrayList<DatabaseReference>()
    }
}