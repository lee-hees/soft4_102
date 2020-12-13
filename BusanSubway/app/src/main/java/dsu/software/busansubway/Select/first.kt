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
import dsu.software.busansubway.Details.DetailActivity_first
import dsu.software.busansubway.R
import java.util.*

class first : Fragment() {
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
    @SuppressLint("SetTextI18n")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_select_station_list, container, false)
        val gotoDetail = view.findViewById<TableLayout>(R.id.gotoDetail)
        gotoDetail.setOnClickListener {
            val intent = Intent(context, DetailActivity_first::class.java)
            startActivity(intent)
        }
        val string = Station_string()
        list_itemArrayList = ArrayList()
        listView = view.findViewById<View>(R.id.list_view) as ListView
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_1)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_2)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_3)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_4)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_5)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_6)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_7)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_8)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_9)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_10)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_11)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_12)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_13)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_14)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_15)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_16)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_17)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_18)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_19)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_20)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_21)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_22)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_23)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_24)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_25)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_26)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_27)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_28)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_29)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_30)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_31)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_32)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_33)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_34)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_35)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_36)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_37)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_38)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_39)))
        list_itemArrayList!!.add(ListViewItem(1, getString(R.string.first_40)))
        info30 = view.findViewById(R.id.info30)
        st_name = view.findViewById(R.id.st_name)
        val exit = view.findViewById<View>(R.id.exit) as TextView
        exit.setOnClickListener { info30!!.visibility = View.GONE }
        myListAdapter = ListviewAdapter(activity, list_itemArrayList!!)
        listView!!.adapter = myListAdapter
        listView!!.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            info30!!.visibility = View.VISIBLE
            st_name!!.setTextColor(Color.parseColor("#FC7F25"))
            st_name!!.text = list_itemArrayList!![position].content.contents
            DetailActivity_first.which = 0 // 1호선 확인용
            if (list_itemArrayList!![position].content.contents == getString(R.string.first_1)) {
                DetailActivity_first.state = 0
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_2)) {
                DetailActivity_first.state = 1
                //                    Toast.makeText(string, DetailActivity_first.which + DetailActivity_first.state+"", Toast.LENGTH_SHORT).show();
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_3)) {
                DetailActivity_first.state = 2
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_4)) {
                DetailActivity_first.state = 3
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_5)) {
                DetailActivity_first.state = 4
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_6)) {
                DetailActivity_first.state = 5
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_7)) {
                DetailActivity_first.state = 6
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_8)) {
                DetailActivity_first.state = 7
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_9)) {
                DetailActivity_first.state = 8
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_10)) {
                DetailActivity_first.state = 9
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_11)) {
                DetailActivity_first.state = 10
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_12)) {
                DetailActivity_first.state = 11
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_13)) {
                DetailActivity_first.state = 12
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_14)) {
                DetailActivity_first.state = 13
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_15)) {
                DetailActivity_first.state = 14
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_16)) {
                DetailActivity_first.state = 15
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_17)) {
                DetailActivity_first.state = 16
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_18)) {
                DetailActivity_first.state = 17
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_19)) {
                DetailActivity_first.state = 18
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_20)) {
                DetailActivity_first.state = 19
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_21)) {
                DetailActivity_first.state = 20
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_22)) {
                DetailActivity_first.state = 21
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_23)) {
                DetailActivity_first.state = 22
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_24)) {
                DetailActivity_first.state = 23
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_25)) {
                DetailActivity_first.state = 24
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_26)) {
                DetailActivity_first.state = 25
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_27)) {
                DetailActivity_first.state = 26
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_28)) {
                DetailActivity_first.state = 27
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_29)) {
                DetailActivity_first.state = 28
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_30)) {
                DetailActivity_first.state = 29
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_31)) {
                DetailActivity_first.state = 30
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_32)) {
                DetailActivity_first.state = 31
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_33)) {
                DetailActivity_first.state = 32
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_34)) {
                DetailActivity_first.state = 33
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_35)) {
                DetailActivity_first.state = 34
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_36)) {
                DetailActivity_first.state = 35
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_37)) {
                DetailActivity_first.state = 36
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_38)) {
                DetailActivity_first.state = 37
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_39)) {
                DetailActivity_first.state = 38
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            } else if (list_itemArrayList!![position].content.contents == getString(R.string.first_40)) {
                DetailActivity_first.state = 39
                Station_Tab.Companion.name = getString(string.FS[DetailActivity_first.which]!![DetailActivity_first.state])
            }
            reset() // 원래 크기로 되돌리기
            list_itemArrayList!![position] = ListViewItem(11, list_itemArrayList!![position].content.contents)
            listView!!.adapter = myListAdapter
            listView!!.setSelection(position) // 클릭한거 제일 위로

            //Intent todetail = new Intent(getActivity(), Detail_Tab.class);
            //startActivity(todetail);
        }
        station_start = view.findViewById(R.id.station_start)
        station_end = view.findViewById(R.id.station_end)
        station_end!!.text = "노포행"
        station_start!!.text = "다대포해수욕장행"

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
        first_move.get(0).setValue(_reverse_first[0])
        first_move.get(1).setValue(_current_station_first[0])
        first_move.add(first_two.child("reverse"))
        first_move.add(first_two.child("current_station"))
        first_move.get(2).setValue(_reverse_first[1])
        first_move.get(3).setValue(_current_station_first[1])
        first_move.add(first_three.child("reverse"))
        first_move.add(first_three.child("current_station"))
        first_move.get(4).setValue(_reverse_first[2])
        first_move.get(5).setValue(_current_station_first[2])
        first_move.add(first_four.child("reverse"))
        first_move.add(first_four.child("current_station"))
        first_move.get(6).setValue(_reverse_first[3])
        first_move.get(7).setValue(_current_station_first[3])
        time_start = view.findViewById(R.id.time_start)
        time_end = view.findViewById(R.id.time_end)
        _move = first_move
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
                        @SuppressLint("LongLogTag")
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
                            val current = DetailActivity_first.state

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
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                        time_start!!.setTextColor(Color.parseColor("#aaff0000"))
                                    }
                                } else  //
                                {
                                    if (current > current_station[nrev[1]]) // 곧도착/정거장전
                                    {
                                        if (current - current_station[nrev[1]] == 1) {
                                            time_start!!.text = "곧도착"
                                        } else {
                                            time_start!!.text = (current - current_station[nrev[1]]).toString() + "정거장 전"
                                        }
                                        time_start!!.setTextColor(Color.parseColor("#aaff0000"))
                                    } else  //곧출발
                                    {
                                        time_start!!.text = "곧출발"
                                        time_start!!.setTextColor(Color.parseColor("#555555"))
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
                                    time_start!!.setTextColor(Color.parseColor("#aaff0000"))
                                } else  //
                                {
                                    if (current > current_station[nrev[0]]) // 곧도착/정거장전
                                    {
                                        if (current - current_station[nrev[0]] == 1) {
                                            time_start!!.text = "곧도착"
                                        } else {
                                            time_start!!.text = (current - current_station[nrev[0]]).toString() + "정거장 전"
                                        }
                                        time_start!!.setTextColor(Color.parseColor("#aaff0000"))
                                    } else  //곧출발
                                    {
                                        time_start!!.text = "곧출발"
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
                                        time_end!!.text = "곧도착"
                                    } else {
                                        time_end!!.text = (current_station[rev[1]] - current).toString() + "정거장 전"
                                    }
                                    time_end!!.setTextColor(Color.parseColor("#aaff0000"))
                                } else  //
                                {
                                    if (current < current_station[rev[0]]) // 곧도착/정거장전
                                    {
                                        if (current_station[rev[0]] - current == 1) {
                                            time_end!!.text = "곧도착"
                                        } else {
                                            time_end!!.text = (current_station[rev[0]] - current).toString() + "정거장 전"
                                        }
                                        time_end!!.setTextColor(Color.parseColor("#aaff0000"))
                                    } else  //곧출발
                                    {
                                        time_end!!.text = "곧출발"
                                        time_end!!.setTextColor(Color.parseColor("#555555"))
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
                                    time_end!!.setTextColor(Color.parseColor("#aaff0000"))
                                } else  //
                                {
                                    if (current < current_station[rev[1]]) // 곧도착/정거장전
                                    {
                                        if (current_station[rev[1]] - current == 1) {
                                            time_end!!.text = "곧도착"
                                        } else {
                                            time_end!!.text = (current_station[rev[1]] - current).toString() + "정거장 전"
                                        }
                                        time_end!!.setTextColor(Color.parseColor("#aaff0000"))
                                    } else  //곧출발
                                    {
                                        time_end!!.text = "곧출발"
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
        list_itemArrayList!![0] = ListViewItem(1, getString(R.string.first_1))
        list_itemArrayList!![1] = ListViewItem(1, getString(R.string.first_2))
        list_itemArrayList!![2] = ListViewItem(1, getString(R.string.first_3))
        list_itemArrayList!![3] = ListViewItem(1, getString(R.string.first_4))
        list_itemArrayList!![4] = ListViewItem(1, getString(R.string.first_5))
        list_itemArrayList!![5] = ListViewItem(1, getString(R.string.first_6))
        list_itemArrayList!![6] = ListViewItem(1, getString(R.string.first_7))
        list_itemArrayList!![7] = ListViewItem(1, getString(R.string.first_8))
        list_itemArrayList!![8] = ListViewItem(1, getString(R.string.first_9))
        list_itemArrayList!![9] = ListViewItem(1, getString(R.string.first_10))
        list_itemArrayList!![10] = ListViewItem(1, getString(R.string.first_11))
        list_itemArrayList!![11] = ListViewItem(1, getString(R.string.first_12))
        list_itemArrayList!![12] = ListViewItem(1, getString(R.string.first_13))
        list_itemArrayList!![13] = ListViewItem(1, getString(R.string.first_14))
        list_itemArrayList!![14] = ListViewItem(1, getString(R.string.first_15))
        list_itemArrayList!![15] = ListViewItem(1, getString(R.string.first_16))
        list_itemArrayList!![16] = ListViewItem(1, getString(R.string.first_17))
        list_itemArrayList!![17] = ListViewItem(1, getString(R.string.first_18))
        list_itemArrayList!![18] = ListViewItem(1, getString(R.string.first_19))
        list_itemArrayList!![19] = ListViewItem(1, getString(R.string.first_20))
        list_itemArrayList!![20] = ListViewItem(1, getString(R.string.first_21))
        list_itemArrayList!![21] = ListViewItem(1, getString(R.string.first_22))
        list_itemArrayList!![22] = ListViewItem(1, getString(R.string.first_23))
        list_itemArrayList!![23] = ListViewItem(1, getString(R.string.first_24))
        list_itemArrayList!![24] = ListViewItem(1, getString(R.string.first_25))
        list_itemArrayList!![25] = ListViewItem(1, getString(R.string.first_26))
        list_itemArrayList!![26] = ListViewItem(1, getString(R.string.first_27))
        list_itemArrayList!![27] = ListViewItem(1, getString(R.string.first_28))
        list_itemArrayList!![28] = ListViewItem(1, getString(R.string.first_29))
        list_itemArrayList!![29] = ListViewItem(1, getString(R.string.first_30))
        list_itemArrayList!![30] = ListViewItem(1, getString(R.string.first_31))
        list_itemArrayList!![31] = ListViewItem(1, getString(R.string.first_32))
        list_itemArrayList!![32] = ListViewItem(1, getString(R.string.first_33))
        list_itemArrayList!![33] = ListViewItem(1, getString(R.string.first_34))
        list_itemArrayList!![34] = ListViewItem(1, getString(R.string.first_35))
        list_itemArrayList!![35] = ListViewItem(1, getString(R.string.first_36))
        list_itemArrayList!![36] = ListViewItem(1, getString(R.string.first_37))
        list_itemArrayList!![37] = ListViewItem(1, getString(R.string.first_38))
        list_itemArrayList!![38] = ListViewItem(1, getString(R.string.first_39))
        list_itemArrayList!![39] = ListViewItem(1, getString(R.string.first_40))
    }

    companion object {
        var name: String? = null
        var first_move = ArrayList<DatabaseReference>()
    }
}