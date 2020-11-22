package dsu.software.busansubway.Details;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import dsu.software.busansubway.Inside.InsideActivity;
import dsu.software.busansubway.R;

// TODO: 환승역 색 구분 + 호선에 따른 색 변화
// TODO: 버튼에 실시간 위치에 따른 남은 정거장 표시

public class DetailActivity extends AppCompatActivity {

    private RecyclerView recyclerview;

    TextView left, center, right;
    TextView station_start, station_end;
    TextView station, hosun;
    Button time_start, time_start2, time_end, time_end2;
    int[][] subway_tab = new int[6][43];
    static public int which = 0;
    static public int state = 0;
    LinearLayout station_hosun;
//    String add = R.string.app_name;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_main);


        subway_tab[0][0] = R.string.first_1;
        subway_tab[0][1] = R.string.first_2;
        subway_tab[0][2] = R.string.first_3;
        subway_tab[0][3] = R.string.first_4;
        subway_tab[0][4] = R.string.first_5;
        subway_tab[0][5] = R.string.first_6;
        subway_tab[0][6] = R.string.first_7;
        subway_tab[0][7] = R.string.first_8;
        subway_tab[0][8] = R.string.first_9;
        subway_tab[0][9] = R.string.first_10;
        subway_tab[0][10] = R.string.first_11;
        subway_tab[0][11] = R.string.first_12;
        subway_tab[0][12] = R.string.first_13;
        subway_tab[0][13] = R.string.first_14;
        subway_tab[0][14] = R.string.first_15;
        subway_tab[0][15] = R.string.first_16;
        subway_tab[0][16] = R.string.first_17;
        subway_tab[0][17] = R.string.first_18;
        subway_tab[0][18] = R.string.first_19;
        subway_tab[0][19] = R.string.first_20;
        subway_tab[0][20] = R.string.first_21;
        subway_tab[0][21] = R.string.first_22;
        subway_tab[0][22] = R.string.first_23;
        subway_tab[0][23] = R.string.first_24;
        subway_tab[0][24] = R.string.first_25;
        subway_tab[0][25] = R.string.first_26;
        subway_tab[0][26] = R.string.first_27;
        subway_tab[0][27] = R.string.first_28;
        subway_tab[0][28] = R.string.first_29;
        subway_tab[0][29] = R.string.first_30;
        subway_tab[0][30] = R.string.first_31;
        subway_tab[0][31] = R.string.first_32;
        subway_tab[0][32] = R.string.first_33;
        subway_tab[0][33] = R.string.first_34;
        subway_tab[0][34] = R.string.first_35;
        subway_tab[0][35] = R.string.first_36;
        subway_tab[0][36] = R.string.first_37;
        subway_tab[0][37] = R.string.first_38;
        subway_tab[0][38] = R.string.first_39;
        subway_tab[0][39] = R.string.first_40;

        subway_tab[1][0] = R.string.second_1;
        subway_tab[1][1] = R.string.second_2;
        subway_tab[1][2] = R.string.second_3;
        subway_tab[1][3] = R.string.second_4;
        subway_tab[1][4] = R.string.second_5;
        subway_tab[1][5] = R.string.second_6;
        subway_tab[1][6] = R.string.second_7;
        subway_tab[1][7] = R.string.second_8;
        subway_tab[1][8] = R.string.second_9;
        subway_tab[1][9] = R.string.second_10;
        subway_tab[1][10] = R.string.second_11;
        subway_tab[1][11] = R.string.second_12;
        subway_tab[1][12] = R.string.second_13;
        subway_tab[1][13] = R.string.second_14;
        subway_tab[1][14] = R.string.second_15;
        subway_tab[1][15] = R.string.second_16;
        subway_tab[1][16] = R.string.second_17;
        subway_tab[1][17] = R.string.second_18;
        subway_tab[1][18] = R.string.second_19;
        subway_tab[1][19] = R.string.second_20;
        subway_tab[1][20] = R.string.second_21;
        subway_tab[1][21] = R.string.second_22;
        subway_tab[1][22] = R.string.second_23;
        subway_tab[1][23] = R.string.second_24;
        subway_tab[1][24] = R.string.second_25;
        subway_tab[1][25] = R.string.second_26;
        subway_tab[1][26] = R.string.second_27;
        subway_tab[1][27] = R.string.second_28;
        subway_tab[1][28] = R.string.second_29;
        subway_tab[1][29] = R.string.second_30;
        subway_tab[1][30] = R.string.second_31;
        subway_tab[1][31] = R.string.second_32;
        subway_tab[1][32] = R.string.second_33;
        subway_tab[1][33] = R.string.second_34;
        subway_tab[1][34] = R.string.second_35;
        subway_tab[1][35] = R.string.second_36;
        subway_tab[1][36] = R.string.second_37;
        subway_tab[1][37] = R.string.second_38;
        subway_tab[1][38] = R.string.second_39;
        subway_tab[1][39] = R.string.second_40;
        subway_tab[1][40] = R.string.second_41;
        subway_tab[1][41] = R.string.second_42;
        subway_tab[1][42] = R.string.second_43;


        subway_tab[2][0] = R.string.third_1;
        subway_tab[2][1] = R.string.third_2;
        subway_tab[2][2] = R.string.third_3;
        subway_tab[2][3] = R.string.third_4;
        subway_tab[2][4] = R.string.third_5;
        subway_tab[2][5] = R.string.third_6;
        subway_tab[2][6] = R.string.third_7;
        subway_tab[2][7] = R.string.third_8;
        subway_tab[2][8] = R.string.third_9;
        subway_tab[2][9] = R.string.third_10;
        subway_tab[2][10] = R.string.third_11;
        subway_tab[2][11] = R.string.third_12;
        subway_tab[2][12] = R.string.third_13;
        subway_tab[2][13] = R.string.third_14;
        subway_tab[2][14] = R.string.third_15;
        subway_tab[2][15] = R.string.third_16;
        subway_tab[2][16] = R.string.third_17;


        subway_tab[3][0] = R.string.dong_1;
        subway_tab[3][1] = R.string.dong_2;
        subway_tab[3][2] = R.string.dong_3;
        subway_tab[3][3] = R.string.dong_4;
        subway_tab[3][4] = R.string.dong_5;
        subway_tab[3][5] = R.string.dong_6;
        subway_tab[3][6] = R.string.dong_7;
        subway_tab[3][7] = R.string.dong_8;
        subway_tab[3][8] = R.string.dong_9;
        subway_tab[3][9] = R.string.dong_10;
        subway_tab[3][10] = R.string.dong_11;
        subway_tab[3][11] = R.string.dong_12;
        subway_tab[3][12] = R.string.dong_13;
        subway_tab[3][13] = R.string.dong_14;
        subway_tab[3][14] = R.string.dong_15;


        subway_tab[4][0] = R.string.kim_1;
        subway_tab[4][1] = R.string.kim_2;
        subway_tab[4][2] = R.string.kim_3;
        subway_tab[4][3] = R.string.kim_4;
        subway_tab[4][4] = R.string.kim_5;
        subway_tab[4][5] = R.string.kim_6;
        subway_tab[4][6] = R.string.kim_7;
        subway_tab[4][7] = R.string.kim_8;
        subway_tab[4][8] = R.string.kim_9;
        subway_tab[4][9] = R.string.kim_10;
        subway_tab[4][10] = R.string.kim_11;
        subway_tab[4][11] = R.string.kim_12;
        subway_tab[4][12] = R.string.kim_13;
        subway_tab[4][13] = R.string.kim_14;
        subway_tab[4][14] = R.string.kim_15;
        subway_tab[4][15] = R.string.kim_16;
        subway_tab[4][16] = R.string.kim_17;
        subway_tab[4][17] = R.string.kim_18;
        subway_tab[4][18] = R.string.kim_19;
        subway_tab[4][19] = R.string.kim_20;
        subway_tab[4][20] = R.string.kim_21;


        subway_tab[5][0] = R.string.fourth_1;
        subway_tab[5][1] = R.string.fourth_2;
        subway_tab[5][2] = R.string.fourth_3;
        subway_tab[5][3] = R.string.fourth_4;
        subway_tab[5][4] = R.string.fourth_5;
        subway_tab[5][5] = R.string.fourth_6;
        subway_tab[5][6] = R.string.fourth_7;
        subway_tab[5][7] = R.string.fourth_8;
        subway_tab[5][8] = R.string.fourth_9;
        subway_tab[5][9] = R.string.fourth_10;
        subway_tab[5][10] = R.string.fourth_11;
        subway_tab[5][11] = R.string.fourth_12;
        subway_tab[5][12] = R.string.fourth_13;
        subway_tab[5][13] = R.string.fourth_14;

        station_hosun = findViewById(R.id.station_hosun);
        center = findViewById(R.id.center);
        hosun = findViewById(R.id.hosun);
        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        station = findViewById(R.id.station);
        right = findViewById(R.id.right);
        left = findViewById(R.id.left);
        station_start = findViewById(R.id.station_start);
        station_end = findViewById(R.id.station_end);

//        final ChangeScript changeScript = new ChangeScript();

        chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);

        station.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (which == 1 && state == 24) {
                    which = 0;
                    state = 24;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 2 && state == 4) {
                    which = 1;
                    state = 10;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 2 && state == 16) {
                    which = 1;
                    state = 35;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 2 && state == 12) {
                    which = 0;
                    state = 28;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 3 && state == 0) {
                    which = 2;
                    state = 8;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 3 && state == 1) {
                    which = 0;
                    state = 30;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 1 && state == 16) {
                    which = 4;
                    state = 20;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 2 && state == 0) {
                    which = 4;
                    state = 14;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 5 && state == 9) {
                    which = 1;
                    state = 38;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 5 && state == 3) {
                    which = 0;
                    state = 29;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 5 && state == 2) {
                    which = 2;
                    state = 11;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
            }
        });

        hosun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (which == 0 && state == 24) {
                    which = 1;
                    state = 24;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 1 && state == 10) {
                    which = 2;
                    state = 4;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 1 && state == 35) {
                    which = 2;
                    state = 16;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 0 && state == 28) {
                    which = 2;
                    state = 12;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 2 && state == 8) {
                    which = 3;
                    state = 0;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 0 && state == 30) {
                    which = 3;
                    state = 1;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 4 && state == 20) {
                    which = 1;
                    state = 16;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 4 && state == 14) {
                    which = 2;
                    state = 0;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 1 && state == 38) {
                    which = 5;
                    state = 9;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 0 && state == 29) {
                    which = 5;
                    state = 3;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
                if (which == 2 && state == 11) {
                    which = 5;
                    state = 2;
                    chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
                }
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                state++;

                chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                state--;
                chagescript(subway_tab, which, state, left, center, right, station_start, station_end, recyclerview, station_hosun, station, hosun);
            }
        });

        time_start=findViewById(R.id.time_start);
        time_start2=findViewById(R.id.time_start2);
        time_end=findViewById(R.id.time_end);
        time_end2=findViewById(R.id.time_end2);

        time_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InsideActivity.class);
                startActivity(intent);
            }
        });



    }

    void chagescript(int[][] subway_tab, int which, int state, TextView left, TextView center, TextView right, TextView station_start, TextView station_end, RecyclerView recyclerview, LinearLayout station_hosun, TextView station, TextView hosun) {

        if (subway_tab[which][state] == subway_tab[0][0]) {
            center.setText(R.string.first_1);
            center.setTextColor(Color.parseColor("#FF5E00"));
            left.setVisibility(View.INVISIBLE);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_1)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_1)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_1)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[0][1]) {
            center.setText(R.string.first_2);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            left.setVisibility(View.VISIBLE);
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_2)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_2)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_2)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[0][2]) {
            center.setText(R.string.first_3);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_3)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_3)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_3)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][3]) {
            center.setText(R.string.first_4);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_4)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_4)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][4]) {
            center.setText(R.string.first_5);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_5)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_5)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_5)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][5]) {
            center.setText(R.string.first_6);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_6)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_6)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[0][6]) {
            center.setText(R.string.first_7);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_7)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_7)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_7)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[0][7]) {
            center.setText(R.string.first_8);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_8)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_8)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_8)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][8]) {
            center.setText(R.string.first_9);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_9)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_9)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_9)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[0][9]) {
            center.setText(R.string.first_10);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_10)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_10)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_10)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[0][10]) {
            center.setText(R.string.first_11);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_11)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_11)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_11)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][11]) {
            center.setText(R.string.first_12);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_12)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_12)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_12)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][12]) {
            center.setText(R.string.first_13);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_13)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_13)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_13)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][13]) {
            center.setText(R.string.first_14);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_14)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_14)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_14)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[0][14]) {
            center.setText(R.string.first_15);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_15)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_15)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_15)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[0][15]) {
            center.setText(R.string.first_16);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_16)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_16)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_16)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][16]) {
            center.setText(R.string.first_17);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_17)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_17)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_17)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[0][17]) {
            center.setText(R.string.first_18);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_18)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_18)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_18)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[0][18]) {
            center.setText(R.string.first_19);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_19)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_19)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_19)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][19]) {
            center.setText(R.string.first_20);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_20)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_20)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_20)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[0][20]) {
            center.setText(R.string.first_21);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_21)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_21)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_21)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][21]) {
            center.setText(R.string.first_22);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_22)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_22)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_22)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][22]) {
            center.setText(R.string.first_23);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_23)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_23)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_23)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][23]) {
            center.setText(R.string.first_24);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_24)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_24)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_24)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][24]) {
            hosun.setText("2호선");
            station.setText("1호선");

            center.setText(R.string.first_25);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_25)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_25)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_25)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[0][25]) {
            center.setText(R.string.first_26);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_26)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_26)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_26)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[0][26]) {
            center.setText(R.string.first_27);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_27)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_27)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_27)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][27]) {
            center.setText(R.string.first_28);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_28)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_28)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_28)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][28]) {
            center.setText(R.string.first_29);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station.setText("1호선");
            hosun.setText("3호선");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_29)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_29)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_29)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[0][29]) {
            center.setText(R.string.first_30);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            hosun.setText("동해선");
            station.setText("1호선");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_30)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_30)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_30)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][30]) {
            center.setText(R.string.first_31);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station.setText("1호선");
            hosun.setText("4호선");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_31)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_31)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_31)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][31]) {
            center.setText(R.string.first_32);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_32)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_32)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_32)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][32]) {
            center.setText(R.string.first_33);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_33)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_33)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_33)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][33]) {
            center.setText(R.string.first_34);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_34)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_34)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_34)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][34]) {
            center.setText(R.string.first_35);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_35)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_35)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_35)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][35]) {
            center.setText(R.string.first_36);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_36)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_36)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_36)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][36]) {
            center.setText(R.string.first_37);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_37)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_37)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_37)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][37]) {
            center.setText(R.string.first_38);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_38)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_38)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_38)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][38]) {
            center.setText(R.string.first_39);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            right.setVisibility(View.VISIBLE);

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_39)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_39)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_39)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[0][39]) {
            center.setText(R.string.first_40);
            station_start.setText("다대포해수욕장행");
            station_end.setText("노포행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            right.setVisibility(View.INVISIBLE);

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_out_40)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_in_40)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.first_call_40)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][0]) {
            center.setText(R.string.second_43);
            left.setVisibility(View.INVISIBLE);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_43)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_43)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][1]) {
            center.setText(R.string.second_42);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            left.setVisibility(View.VISIBLE);
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_42)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_42)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_42)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][2]) {
            center.setText(R.string.second_41);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            left.setVisibility(View.VISIBLE);
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_41)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_41)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_41)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][3]) {
            center.setText(R.string.second_40);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_40)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_40)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_40)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][4]) {
            center.setText(R.string.second_39);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_39)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_39)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_39)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][5]) {
            center.setText(R.string.second_38);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_38)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_38)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][6]) {
            center.setText(R.string.second_37);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_37)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_37)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_37)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][7]) {
            center.setText(R.string.second_36);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_36)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_36)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][8]) {
            center.setText(R.string.second_35);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_35)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_35)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_35)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][9]) {
            center.setText(R.string.second_34);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_34)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_34)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_34)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][10]) {
            center.setText(R.string.second_33);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            hosun.setText("3호선");
            station.setText("2호선");
            station_start.setText("양산행");
            station_end.setText("장산행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_33)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_33)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][11]) {
            center.setText(R.string.second_32);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_32)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_32)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_32)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][12]) {
            center.setText(R.string.second_31);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_31)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_31)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_31)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][13]) {
            center.setText(R.string.second_30);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_30)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_30)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_30)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][14]) {
            center.setText(R.string.second_29);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_29)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_29)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_29)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][15]) {
            center.setText(R.string.second_28);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_28)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_28)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_28)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][16]) {
            center.setText(R.string.second_27);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            right.setVisibility(View.VISIBLE);
            hosun.setText("2호선");
            station.setText("김해선");


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_27)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_27)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_27)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][17]) {
            center.setText(R.string.second_26);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_26)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_26)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_26)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][18]) {
            center.setText(R.string.second_25);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_25)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_25)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][19]) {
            center.setText(R.string.second_24);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_24)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_24)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_24)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][20]) {
            center.setText(R.string.second_23);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_23)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_23)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_23)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][21]) {
            center.setText(R.string.second_22);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_22)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_22)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][22]) {
            center.setText(R.string.second_21);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_21)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_21)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_21)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][23]) {
            center.setText(R.string.second_20);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_20)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_20)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_20)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][24]) {
            center.setText(R.string.second_19);
            hosun.setText("2호선");
            station.setText("1호선");

            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_19)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_19)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][25]) {
            center.setText(R.string.second_18);
            center.setTextSize(30);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_18)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_18)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_18)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][26]) {

            center.setText(R.string.second_17);
            center.setTextSize(25);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_17)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_17)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_17)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][27]) {
            center.setText(R.string.second_16);
            station_start.setText("양산행");
            station_end.setText("장산행");
            center.setTextSize(30);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_16)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_16)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_16)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][28]) {
            center.setText(R.string.second_15);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_15)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_15)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_15)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][29]) {
            center.setText(R.string.second_14);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_14)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_14)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_14)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][30]) {
            center.setText(R.string.second_13);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_13)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_13)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_13)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][31]) {
            center.setText(R.string.second_12);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_12)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_12)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_12)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][32]) {
            center.setText(R.string.second_11);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_11)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_11)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][33]) {
            center.setText(R.string.second_10);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_10)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_10)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_10)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][34]) {
            center.setText(R.string.second_9);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_9)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_9)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_9)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][35]) {
            center.setText(R.string.second_8);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station.setText("2호선");
            hosun.setText("3호선");
            right.setVisibility(View.VISIBLE);


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_8)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_8)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][36]) {
            center.setText(R.string.second_7);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_7)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_7)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_7)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][37]) {
            center.setText(R.string.second_6);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_6)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_6)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][38]) {
            center.setText(R.string.second_5);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            hosun.setText("동해선");
            station.setText("2호선");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_5)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_5)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_5)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][39]) {
            center.setText(R.string.second_4);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_4)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_4)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][40]) {
            center.setText(R.string.second_3);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_3)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_3)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_3)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][41]) {
            center.setText(R.string.second_2);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            right.setVisibility(View.VISIBLE);

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_2)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_2)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_2)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][42]) {
            center.setText(R.string.second_1);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            right.setVisibility(View.INVISIBLE);

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_1)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_1)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[2][0]) {
            center.setText(R.string.third_17);
            left.setVisibility(View.INVISIBLE);

            hosun.setText("3호선");
            station.setText("김해선");
            station_start.setText("대저행");
            station_end.setText("수영행");


            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_17)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_17)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_17)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][1]) {
            center.setText(R.string.third_16);
            left.setVisibility(View.VISIBLE);
            station_start.setText("대저행");
            station_end.setText("수영행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_16)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_16)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_16)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][2]) {
            center.setText(R.string.third_15);
            station_start.setText("대저행");
            station_end.setText("수영행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_15)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_15)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_15)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][3]) {
            center.setText(R.string.third_14);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            station_start.setText("대저행");
            station_end.setText("수영행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_14)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_14)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_14)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][4]) {
            center.setText(R.string.third_13);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            hosun.setText("3호선");
            station.setText("2호선");
            station_start.setText("대저행");
            station_end.setText("수영행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_13)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_13)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_13)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[2][5]) {
            center.setText(R.string.third_12);
            station_start.setText("대저행");
            station_end.setText("수영행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_12)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_12)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_12)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][6]) {
            center.setText(R.string.third_11);
            station_start.setText("대저행");
            station_end.setText("수영행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_11)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_11)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_11)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[2][7]) {
            center.setText(R.string.third_10);
            station_start.setText("대저행");
            station_end.setText("수영행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_10)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_10)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_10)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][8]) {
            center.setText(R.string.third_9);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station.setText("3호선");
            hosun.setText("4호선");
            left.setVisibility(View.VISIBLE);
            station_start.setText("대저행");
            station_end.setText("수영행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_9)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_9)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_9)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][9]) {
            center.setText(R.string.third_8);
            station_start.setText("대저행");
            station_end.setText("수영행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_8)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_8)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_8)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[2][10]) {
            center.setText(R.string.third_7);
            station_start.setText("대저행");
            station_end.setText("수영행");

            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_7)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_7)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_7)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][11]) {
            center.setText(R.string.third_6);

            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            station.setText("3호선");
            hosun.setText("동해선");
            station_start.setText("대저행");
            station_end.setText("수영행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_6)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_6)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][12]) {
            center.setText(R.string.third_5);
            station_start.setText("대저행");
            station_end.setText("수영행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station.setText("1호선");
            hosun.setText("3호선");


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_5)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_5)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_5)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[2][13]) {
            center.setText(R.string.third_4);
            station_start.setText("대저행");
            station_end.setText("수영행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_4)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_4)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[2][14]) {
            center.setText(R.string.third_3);
            station_start.setText("대저행");
            station_end.setText("수영행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_3)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_3)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_3)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[2][15]) {
            center.setText(R.string.third_2);
            station_start.setText("대저행");
            station_end.setText("수영행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            right.setVisibility(View.VISIBLE);

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_2)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_2)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_2)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][16]) {
            center.setText(R.string.third_1);
            station_start.setText("대저행");
            station_end.setText("수영행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            right.setVisibility(View.INVISIBLE);

            hosun.setText("3호선");
            station.setText("2호선");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_1)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_1)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[3][0]) {
            center.setText(R.string.fourth_1);
            left.setVisibility(View.INVISIBLE);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            hosun.setText("4호선");
            station.setText("3호선");
            station_start.setText("미남행");
            station_end.setText("안평행");


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_out_1)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_in_1)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_call_1)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[3][1]) {
            center.setText(R.string.fourth_2);
            left.setVisibility(View.VISIBLE);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            hosun.setText("4호선");
            station_start.setText("미남행");
            station_end.setText("안평행");
            station.setText("1호선");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_out_2)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_in_2)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_call_2)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[3][2]) {
            center.setText(R.string.fourth_3);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station_start.setText("미남행");
            station_end.setText("안평행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_out_3)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_in_3)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_call_3)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[3][3]) {
            center.setText(R.string.fourth_4);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            station_start.setText("미남행");
            station_end.setText("안평행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_out_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_in_4)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_call_4)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[3][4]) {
            center.setText(R.string.fourth_5);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            station_start.setText("미남행");
            station_end.setText("안평행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_out_5)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_in_5)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_call_5)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[3][5]) {
            center.setText(R.string.fourth_6);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station_start.setText("미남행");
            station_end.setText("안평행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_out_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_in_6)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_call_6)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[3][6]) {
            center.setText(R.string.fourth_7);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station_start.setText("미남행");
            station_end.setText("안평행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_out_7)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_in_7)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_call_7)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[3][7]) {
            center.setText(R.string.fourth_8);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station_start.setText("미남행");
            station_end.setText("안평행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_out_8)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_in_8)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_call_8)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[3][8]) {
            center.setText(R.string.fourth_9);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station_start.setText("미남행");
            station_end.setText("안평행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_out_9)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_in_9)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_call_9)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[3][9]) {
            center.setText(R.string.fourth_10);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station_start.setText("미남행");
            station_end.setText("안평행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_out_10)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_in_10)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_call_10)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[3][10]) {
            center.setText(R.string.fourth_11);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station_start.setText("미남행");
            station_end.setText("안평행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_out_11)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_in_11)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_call_11)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[3][11]) {
            center.setText(R.string.fourth_12);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            station_start.setText("미남행");
            station_end.setText("안평행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_out_12)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_in_12)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_call_12)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[3][12]) {
            center.setText(R.string.fourth_13);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            right.setVisibility(View.VISIBLE);

            station_start.setText("미남행");
            station_end.setText("안평행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_out_13)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_in_13)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_call_13)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[3][13]) {
            center.setText(R.string.fourth_14);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            right.setVisibility(View.INVISIBLE);

            station_start.setText("미남행");
            station_end.setText("안평행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_out_14)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_in_14)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.fourth_call_14)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[4][0]) {
            center.setText(R.string.kim_21);
            left.setVisibility(View.INVISIBLE);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station_start.setText("가야대행");
            station_end.setText("사상행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_21)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_21)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_21)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[4][1]) {
            center.setText(R.string.kim_20);
            left.setVisibility(View.VISIBLE);

            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_20)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_20)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_20)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[4][2]) {
            center.setText(R.string.kim_19);

            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_19)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_19)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_19)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[4][3]) {
            center.setText(R.string.kim_18);
            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_18)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_18)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_18)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[4][4]) {
            center.setText(R.string.kim_17);
            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_17)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_17)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_17)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[4][5]) {
            center.setText(R.string.kim_16);
            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_16)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_16)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_16)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[4][6]) {
            center.setText(R.string.kim_15);
            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_15)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_15)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_15)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[4][7]) {
            center.setText(R.string.kim_14);
            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_14)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_14)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_14)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[4][8]) {
            center.setText(R.string.kim_13);
            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_13)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_13)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_13)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[4][9]) {
            center.setText(R.string.kim_12);
            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_12)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_12)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_12)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[4][10]) {
            center.setText(R.string.kim_11);
            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_11)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_11)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_11)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[4][11]) {
            center.setText(R.string.kim_10);
            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_10)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_10)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_10)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[4][12]) {
            center.setText(R.string.kim_9);

            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_9)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_9)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_9)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[4][13]) {
            center.setText(R.string.kim_8);

            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_8)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_8)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_8)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[4][14]) {
            center.setText(R.string.kim_7);

            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            left.setVisibility(View.VISIBLE);
            hosun.setText("3호선");
            station.setText("김해선");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_7)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_7)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_7)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[4][15]) {
            center.setText(R.string.kim_6);

            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_6)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_6)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[4][16]) {
            center.setText(R.string.kim_5);

            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_5)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_5)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_5)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[4][17]) {
            center.setText(R.string.kim_4);

            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_4)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_4)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[4][18]) {
            center.setText(R.string.kim_3);

            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_3)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_3)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_3)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[4][19]) {
            center.setText(R.string.kim_2);

            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            right.setVisibility(View.VISIBLE);

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_2)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_2)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_2)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[4][20]) {
            center.setText(R.string.kim_1);

            station_start.setText("가야대행");
            station_end.setText("사상행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            right.setVisibility(View.INVISIBLE);
            hosun.setText("2호선");
            station.setText("김해선");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_out_1)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_in_1)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.kim_call_1)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[5][0]) {
            center.setText(R.string.dong_1);
            station_start.setText("부전(동해선)행");
            station_end.setText("일광행");
            left.setVisibility(View.INVISIBLE);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_out_1)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_in_1)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_call_1)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[5][1]) {
            center.setText(R.string.dong_2);
            left.setVisibility(View.VISIBLE);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station_start.setText("부전(동해선)행");
            station_end.setText("일광행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_out_2)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_in_2)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_call_2)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[5][2]) {
            center.setText(R.string.dong_3);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            hosun.setText("동해선");
            station.setText("3호선");
            station_start.setText("부전(동해선)행");
            station_end.setText("일광행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_out_3)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_in_3)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_call_3)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[5][3]) {
            center.setText(R.string.dong_4);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            hosun.setText("동해선");
            station.setText("1호선");
            station_start.setText("부전(동해선)행");
            station_end.setText("일광행");


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_out_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_in_4)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_call_4)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[5][4]) {
            center.setText(R.string.dong_5);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station_start.setText("부전(동해선)행");
            station_end.setText("일광행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_out_5)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_in_5)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_call_5)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[5][5]) {
            center.setText(R.string.dong_6);
            station_start.setText("부전(동해선)행");
            station_end.setText("일광행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_out_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_in_6)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_call_6)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[5][6]) {
            center.setText(R.string.dong_7);
            station_start.setText("부전(동해선)행");
            station_end.setText("일광행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_out_7)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_in_7)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_call_7)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[5][7]) {
            center.setText(R.string.dong_8);
            station_start.setText("부전(동해선)행");
            station_end.setText("일광행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_out_8)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_in_8)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_call_8)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[5][8]) {
            center.setText(R.string.dong_9);
            station_start.setText("부전(동해선)행");
            station_end.setText("일광행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_out_9)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_in_9)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_call_9)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[5][9]) {
            center.setText(R.string.dong_10);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station_start.setText("부전(동해선)행");
            station_end.setText("일광행");
            hosun.setText("동해선");
            station.setText("2호선");
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_out_10)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_in_10)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_call_10)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[5][10]) {
            center.setText(R.string.dong_11);
            station_start.setText("부전(동해선)행");
            station_end.setText("일광행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_out_11)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_in_11)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_call_11)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[5][11]) {
            center.setText(R.string.dong_12);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station_start.setText("부전(동해선)행");
            station_end.setText("일광행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_out_12)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_in_12)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_call_12)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[5][12]) {
            center.setText(R.string.dong_13);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station_start.setText("부전(동해선)행");
            station_end.setText("일광행");


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_out_13)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_in_13)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_call_13)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[5][13]) {
            center.setText(R.string.dong_14);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            right.setVisibility(View.VISIBLE);
            station_start.setText("부전(동해선)행");
            station_end.setText("일광행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_out_14)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_in_14)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_call_14)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[5][14]) {
            center.setText(R.string.dong_15);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            right.setVisibility(View.INVISIBLE);
            station_start.setText("부전(동해선)행");
            station_end.setText("일광행");

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_out_15)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_in_15)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.dong_call_15)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        }

    }


}
