//package dsu.software.busansubway.Select;
//
//import android.annotation.SuppressLint;
//import android.content.Intent;
//import android.graphics.Color;
//import android.os.Build;
//import android.os.Bundle;
//import android.os.Handler;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.AdapterView;
//import android.widget.Button;
//import android.widget.LinearLayout;
//import android.widget.ListView;
//import android.widget.TableLayout;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.Fragment;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Timer;
//import java.util.TimerTask;
//
//import dsu.software.busansubway.Details.DetailActivity_dong;
//import dsu.software.busansubway.Details.DetailActivity_dong;
//import dsu.software.busansubway.Details.DetailActivity_kim;
//import dsu.software.busansubway.R;
//
//public class dong extends Fragment {
//
//    ListView listView;
//    ListviewAdapter myListAdapter;
//    ArrayList<ListViewItem> list_itemArrayList;
//    LinearLayout info30;
//    TextView st_name;
//    TextView station_start, station_end, time_start, time_end;
//    static String name;
//
//    ArrayList<DatabaseReference> _move = new ArrayList<>();
//    public static ArrayList<DatabaseReference> dong_move = new ArrayList<>();
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//
//        View view = inflater.inflate(R.layout.activity_select_station_list, container, false);
//
//        TableLayout gotoDetail = view.findViewById(R.id.gotoDetail);
//        gotoDetail.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getContext(), DetailActivity_dong.class);
//                startActivity(intent);
//            }
//        });
//
//        final Station_string string = new Station_string();
//
//        list_itemArrayList = new ArrayList<ListViewItem>();
//        listView = (ListView) view.findViewById(R.id.list_view);
//
//        list_itemArrayList.add(new ListViewItem(5, getString(R.string.dong_1)));
//        list_itemArrayList.add(new ListViewItem(5, getString(R.string.dong_2)));
//        list_itemArrayList.add(new ListViewItem(5, getString(R.string.dong_3)));
//        list_itemArrayList.add(new ListViewItem(5, getString(R.string.dong_4)));
//        list_itemArrayList.add(new ListViewItem(5, getString(R.string.dong_5)));
//        list_itemArrayList.add(new ListViewItem(5, getString(R.string.dong_6)));
//        list_itemArrayList.add(new ListViewItem(5, getString(R.string.dong_7)));
//        list_itemArrayList.add(new ListViewItem(5, getString(R.string.dong_8)));
//        list_itemArrayList.add(new ListViewItem(5, getString(R.string.dong_9)));
//        list_itemArrayList.add(new ListViewItem(5, getString(R.string.dong_10)));
//        list_itemArrayList.add(new ListViewItem(5, getString(R.string.dong_11)));
//        list_itemArrayList.add(new ListViewItem(5, getString(R.string.dong_12)));
//        list_itemArrayList.add(new ListViewItem(5, getString(R.string.dong_13)));
//        list_itemArrayList.add(new ListViewItem(5, getString(R.string.dong_14)));
//        list_itemArrayList.add(new ListViewItem(5, getString(R.string.dong_15)));
//
//        info30 = view.findViewById(R.id.info30);
//        st_name = view.findViewById(R.id.st_name);
//
//        final TextView exit = (TextView) view.findViewById(R.id.exit);
//        exit.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                info30.setVisibility(View.GONE);
//            }
//        });
//
//        myListAdapter = new ListviewAdapter(getActivity(), list_itemArrayList);
//        listView.setAdapter(myListAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                info30.setVisibility(View.VISIBLE);
//                st_name.setTextColor(Color.parseColor("#98DAEA"));
//                st_name.setText(list_itemArrayList.get(position).getContent().contents);
//                DetailActivity_dong.which = 4; // 동해선 확인용
//                if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.dong_1))) {
//                    DetailActivity_dong.state = 0;
//                    Station_Tab.name = getString(string.FS[DetailActivity_dong.which][DetailActivity_dong.state]);
//
//                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.dong_2))) {
//                    DetailActivity_dong.state = 1;
//                    Station_Tab.name = getString(string.FS[DetailActivity_dong.which][DetailActivity_dong.state]);
//
//                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.dong_3))) {
//                    DetailActivity_dong.state = 2;
//                    Station_Tab.name = getString(string.FS[DetailActivity_dong.which][DetailActivity_dong.state]);
//
//                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.dong_4))) {
//                    DetailActivity_dong.state = 3;
//                    Station_Tab.name = getString(string.FS[DetailActivity_dong.which][DetailActivity_dong.state]);
//
//                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.dong_5))) {
//                    DetailActivity_dong.state = 4;
//                    Station_Tab.name = getString(string.FS[DetailActivity_dong.which][DetailActivity_dong.state]);
//
//                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.dong_6))) {
//                    DetailActivity_dong.state = 5;
//                    Station_Tab.name = getString(string.FS[DetailActivity_dong.which][DetailActivity_dong.state]);
//
//                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.dong_7))) {
//                    DetailActivity_dong.state = 6;
//                    Station_Tab.name = getString(string.FS[DetailActivity_dong.which][DetailActivity_dong.state]);
//
//                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.dong_8))) {
//                    DetailActivity_dong.state = 7;
//                    Station_Tab.name = getString(string.FS[DetailActivity_dong.which][DetailActivity_dong.state]);
//
//                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.dong_9))) {
//                    DetailActivity_dong.state = 8;
//                    Station_Tab.name = getString(string.FS[DetailActivity_dong.which][DetailActivity_dong.state]);
//
//                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.dong_10))) {
//                    DetailActivity_dong.state = 9;
//                    Station_Tab.name = getString(string.FS[DetailActivity_dong.which][DetailActivity_dong.state]);
//
//                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.dong_11))) {
//                    DetailActivity_dong.state = 10;
//                    Station_Tab.name = getString(string.FS[DetailActivity_dong.which][DetailActivity_dong.state]);
//
//                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.dong_12))) {
//                    DetailActivity_dong.state = 11;
//                    Station_Tab.name = getString(string.FS[DetailActivity_dong.which][DetailActivity_dong.state]);
//
//                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.dong_13))) {
//                    DetailActivity_dong.state = 12;
//                    Station_Tab.name = getString(string.FS[DetailActivity_dong.which][DetailActivity_dong.state]);
//
//                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.dong_14))) {
//                    DetailActivity_dong.state = 13;
//                    Station_Tab.name = getString(string.FS[DetailActivity_dong.which][DetailActivity_dong.state]);
//
//                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.dong_15))) {
//                    DetailActivity_dong.state = 14;
//                    Station_Tab.name = getString(string.FS[DetailActivity_dong.which][DetailActivity_dong.state]);
//
//                }
//                reset(); // 원래 크기로 되돌리기
//                list_itemArrayList.set(position, new ListViewItem(55, (list_itemArrayList.get(position).getContent().contents)));
//                listView.setAdapter(myListAdapter);
//                listView.setSelection(position);
//                //Intent todetail = new Intent(getActivity(), Detail_Tab.class);
//                //startActivity(todetail);
//            }
//        });
//
//        station_start = view.findViewById(R.id.station_start);
//        station_end = view.findViewById(R.id.station_end);
//        station_end.setText("일광행");
//        station_start.setText("부전(동해선)행");
//
//        // Write a message to the database
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//
//        final int[] _reverse_dong = {0, 0, 1, 1};
//        final int[] _current_station_dong = {0, 0, 14, 14};
//
//        DatabaseReference dong = database.getReference("dong"); // 1호선
//        DatabaseReference dong_one = dong.child("one"); // 1호선 1호차
//        DatabaseReference dong_two = dong.child("two"); // 1호선 2호차
//        DatabaseReference dong_three = dong.child("three"); // 1호선 3호차
//        DatabaseReference dong_four = dong.child("four"); // 1호선 4호차
//
//        dong_move.add(dong_one.child("reverse"));
//        dong_move.add(dong_one.child("current_station"));
//        dong_move.get(0).setValue(_reverse_dong[0]);
//        dong_move.get(1).setValue(_current_station_dong[0]);
//        dong_move.add(dong_two.child("reverse"));
//        dong_move.add(dong_two.child("current_station"));
//        dong_move.get(2).setValue(_reverse_dong[1]);
//        dong_move.get(3).setValue(_current_station_dong[1]);
//        dong_move.add(dong_three.child("reverse"));
//        dong_move.add(dong_three.child("current_station"));
//        dong_move.get(4).setValue(_reverse_dong[2]);
//        dong_move.get(5).setValue(_current_station_dong[2]);
//        dong_move.add(dong_four.child("reverse"));
//        dong_move.add(dong_four.child("current_station"));
//        dong_move.get(6).setValue(_reverse_dong[3]);
//        dong_move.get(7).setValue(_current_station_dong[3]);
//
//        time_start = view.findViewById(R.id.time_start);
//        time_end = view.findViewById(R.id.time_end);
//
//        _move = dong_move;
//        Timer mTimer = new Timer();
//        final Handler handler = new Handler();
//        mTimer.schedule(new TimerTask() {
//                            @Override
//                            public void run() {
//                                handler.post(new Runnable() {
//                                    public void run() {
//                                        // 수행할 작업을 넣는다.
//
//                                        final int[] reverse = {0, 0, 0, 0};
//                                        final int[] current_station = {0, 0, 0, 0};
//
//
//                                        // 현재 역 표시
//                                        _move.get(0).addValueEventListener(new ValueEventListener() {
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                // This method is called once with the initial value and again
//                                                // whenever data at this location is updated.
//                                                Integer value = dataSnapshot.getValue(Integer.class);
//                                                reverse[0] = value;
//                                            }
//
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onCancelled(DatabaseError error) {
//                                            }
//                                        });
//
//                                        _move.get(2).addValueEventListener(new ValueEventListener() {
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                // This method is called once with the initial value and again
//                                                // whenever data at this location is updated.
//                                                Integer value = dataSnapshot.getValue(Integer.class);
//                                                reverse[1] = value;
//                                            }
//
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onCancelled(DatabaseError error) {
//                                            }
//                                        });
//
//                                        _move.get(4).addValueEventListener(new ValueEventListener() {
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                // This method is called once with the initial value and again
//                                                // whenever data at this location is updated.
//                                                Integer value = dataSnapshot.getValue(Integer.class);
//                                                reverse[2] = value;
//                                            }
//
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onCancelled(DatabaseError error) {
//                                            }
//                                        });
//
//                                        _move.get(6).addValueEventListener(new ValueEventListener() {
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                // This method is called once with the initial value and again
//                                                // whenever data at this location is updated.
//                                                Integer value = dataSnapshot.getValue(Integer.class);
//                                                reverse[3] = value;
//                                            }
//
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onCancelled(DatabaseError error) {
//                                            }
//                                        });
//
//
//                                        _move.get(1).addValueEventListener(new ValueEventListener() {
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                // This method is called once with the initial value and again
//                                                // whenever data at this location is updated.
//                                                Integer value = dataSnapshot.getValue(Integer.class);
//                                                current_station[0] = value;
//                                            }
//
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onCancelled(DatabaseError error) {
//                                            }
//                                        });
//
//                                        _move.get(3).addValueEventListener(new ValueEventListener() {
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                // This method is called once with the initial value and again
//                                                // whenever data at this location is updated.
//                                                Integer value = dataSnapshot.getValue(Integer.class);
//                                                current_station[1] = value;
//                                            }
//
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onCancelled(DatabaseError error) {
//                                            }
//                                        });
//
//                                        _move.get(5).addValueEventListener(new ValueEventListener() {
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                // This method is called once with the initial value and again
//                                                // whenever data at this location is updated.
//                                                Integer value = dataSnapshot.getValue(Integer.class);
//                                                current_station[2] = value;
//                                            }
//
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onCancelled(DatabaseError error) {
//                                            }
//                                        });
//
//                                        _move.get(7).addValueEventListener(new ValueEventListener() {
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                // This method is called once with the initial value and again
//                                                // whenever data at this location is updated.
//                                                Integer value = dataSnapshot.getValue(Integer.class);
//                                                current_station[3] = value;
//
//
//                                                int[] rev = {0, 0};
//                                                int[] nrev = {0, 0};
//                                                for (int i = 0, count1 = 0, count2 = 0; i < reverse.length; i++) {
//                                                    if (reverse[i] == 1) {
//                                                        rev[count1++] = i;
//                                                    } else {
//                                                        nrev[count2++] = i;
//                                                    }
//                                                }
//
//                                                // test 용도 - 완료 후 주석 처리할 것
//
//                                                current_station[0]=5;
//                                                current_station[3]=5;
//
//                                                //
//
////                                                station_start.setText(Arrays.toString(nrev) + current_station[nrev[0]] + " " + current_station[nrev[1]]);
////                                                station_end.setText(Arrays.toString(rev) + current_station[rev[0]] + " " + current_station[rev[1]]);
//
//                                                int current = DetailActivity_dong.state;
//
//                                                // 왼쪽
//                                                if (current_station[nrev[0]] > current_station[nrev[1]]) // 멀리 있는거 먼저 체크
//                                                {
//                                                    if (current > current_station[nrev[0]]) // 곧도착/정거장전
//                                                    {
//                                                        if (current - current_station[nrev[0]] == 1) {
//                                                            time_start.setText("곧도착");
//                                                        } else {
//                                                            time_start.setText(current - current_station[nrev[0]] + "정거장 전");
//                                                        }
//                                                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//                                                            time_start.setTextColor(Color.parseColor("#aaff0000"));
//                                                        }
//                                                    } else //
//                                                    {
//                                                        if (current > current_station[nrev[1]]) // 곧도착/정거장전
//                                                        {
//                                                            if (current - current_station[nrev[1]] == 1) {
//                                                                time_start.setText("곧도착");
//                                                            } else {
//                                                                time_start.setText(current - current_station[nrev[1]] + "정거장 전");
//                                                            }
//                                                            time_start.setTextColor(Color.parseColor("#aaff0000"));
//                                                        } else//곧출발
//                                                        {
//                                                            time_start.setText("곧출발");
//                                                            time_start.setTextColor(Color.parseColor("#555555"));
//                                                        }
//                                                    }
//                                                } else {
//                                                    if (current > current_station[nrev[1]]) // 곧도착/정거장전
//                                                    {
//                                                        if (current - current_station[nrev[1]] == 1) {
//                                                            time_start.setText("곧도착");
//                                                        } else {
//                                                            time_start.setText(current - current_station[nrev[1]] + "정거장 전");
//                                                        }
//                                                        time_start.setTextColor(Color.parseColor("#aaff0000"));
//                                                    } else //
//                                                    {
//                                                        if (current > current_station[nrev[0]]) // 곧도착/정거장전
//                                                        {
//                                                            if (current - current_station[nrev[0]] == 1) {
//                                                                time_start.setText("곧도착");
//                                                            } else {
//                                                                time_start.setText(current - current_station[nrev[0]] + "정거장 전");
//                                                            }
//                                                            time_start.setTextColor(Color.parseColor("#aaff0000"));
//                                                        } else//곧출발
//                                                        {
//                                                            time_start.setText("곧출발");
//                                                            time_start.setTextColor(Color.parseColor("#555555"));
//                                                        }
//                                                    }
//                                                }
//
//
//                                                // 오른쪽
//                                                if (current_station[rev[0]] > current_station[rev[1]]) // 멀리 있는거 먼저 체크
//                                                {
//                                                    if (current < current_station[rev[1]]) // 곧도착/정거장전
//                                                    {
//                                                        if (current_station[rev[1]] - current == 1) {
//                                                            time_end.setText("곧도착");
//                                                        } else {
//                                                            time_end.setText(current_station[rev[1]] - current + "정거장 전");
//                                                        }
//                                                        time_end.setTextColor(Color.parseColor("#aaff0000"));
//                                                    } else //
//                                                    {
//                                                        if (current < current_station[rev[0]]) // 곧도착/정거장전
//                                                        {
//                                                            if (current_station[rev[0]] - current == 1) {
//                                                                time_end.setText("곧도착");
//                                                            } else {
//                                                                time_end.setText(current_station[rev[0]] - current + "정거장 전");
//                                                            }
//                                                            time_end.setTextColor(Color.parseColor("#aaff0000"));
//                                                        } else//곧출발
//                                                        {
//                                                            time_end.setText("곧출발");
//                                                            time_end.setTextColor(Color.parseColor("#555555"));
//                                                        }
//                                                    }
//                                                } else {
//                                                    if (current < current_station[rev[0]]) // 곧도착/정거장전
//                                                    {
//                                                        if (current_station[rev[0]] - current == 1) {
//                                                            time_end.setText("곧도착");
//                                                        } else {
//                                                            time_end.setText(current_station[rev[0]] - current + "정거장 전");
//                                                        }
//                                                        time_end.setTextColor(Color.parseColor("#aaff0000"));
//                                                    } else //
//                                                    {
//                                                        if (current < current_station[rev[1]]) // 곧도착/정거장전
//                                                        {
//                                                            if (current_station[rev[1]] - current == 1) {
//                                                                time_end.setText("곧도착");
//                                                            } else {
//                                                                time_end.setText(current_station[rev[1]] - current + "정거장 전");
//                                                            }
//                                                            time_end.setTextColor(Color.parseColor("#aaff0000"));
//                                                        } else//곧출발
//                                                        {
//                                                            time_end.setText("곧출발");
//                                                            time_end.setTextColor(Color.parseColor("#555555"));
//                                                        }
//                                                    }
//                                                }
//
//
////
//
//
//                                            }
//
//                                            @SuppressLint("LongLogTag")
//                                            @Override
//                                            public void onCancelled(DatabaseError error) {
//                                            }
//                                        });
//                                    }
//                                });
//                            }
//
//                        }, 0, 100
//        );
//
//
//        return view;
//    }
//
//    public void reset() {
//        list_itemArrayList.set(0, new ListViewItem(5, getString(R.string.dong_1)));
//        list_itemArrayList.set(1, new ListViewItem(5, getString(R.string.dong_2)));
//        list_itemArrayList.set(2, new ListViewItem(5, getString(R.string.dong_3)));
//        list_itemArrayList.set(3, new ListViewItem(5, getString(R.string.dong_4)));
//        list_itemArrayList.set(4, new ListViewItem(5, getString(R.string.dong_5)));
//        list_itemArrayList.set(5, new ListViewItem(5, getString(R.string.dong_6)));
//        list_itemArrayList.set(6, new ListViewItem(5, getString(R.string.dong_7)));
//        list_itemArrayList.set(7, new ListViewItem(5, getString(R.string.dong_8)));
//        list_itemArrayList.set(8, new ListViewItem(5, getString(R.string.dong_9)));
//        list_itemArrayList.set(9, new ListViewItem(5, getString(R.string.dong_10)));
//        list_itemArrayList.set(10, new ListViewItem(5, getString(R.string.dong_11)));
//        list_itemArrayList.set(11, new ListViewItem(5, getString(R.string.dong_12)));
//        list_itemArrayList.set(12, new ListViewItem(5, getString(R.string.dong_13)));
//        list_itemArrayList.set(13, new ListViewItem(5, getString(R.string.dong_14)));
//        list_itemArrayList.set(14, new ListViewItem(5, getString(R.string.dong_15)));
//    }
//}
