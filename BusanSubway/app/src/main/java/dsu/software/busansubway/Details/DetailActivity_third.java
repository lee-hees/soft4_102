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

import dsu.software.busansubway.Inside.InsideActivity_third_1;
import dsu.software.busansubway.Inside.InsideActivity_third_2;
import dsu.software.busansubway.Inside.InsideActivity_third_3;
import dsu.software.busansubway.Inside.InsideActivity_third_4;
import dsu.software.busansubway.R;

// TODO: 환승역 색 구분 + 호선에 따른 색 변화
// TODO: 버튼에 실시간 위치에 따른 남은 정거장 표시

public class DetailActivity_third extends AppCompatActivity {

    private RecyclerView recyclerview;

    TextView left, center, right;
    TextView station_start, station_end;
    TextView station, hosun;
    Button time_start, time_start2, time_end, time_end2;
    int[][] subway_tab = new int[6][43];
    public static int which = 0;
    public static int state = 0;
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

        subway_tab[4][0] = R.string.fourth_1;
        subway_tab[4][1] = R.string.fourth_2;
        subway_tab[4][2] = R.string.fourth_3;
        subway_tab[4][3] = R.string.fourth_4;
        subway_tab[4][4] = R.string.fourth_5;
        subway_tab[4][5] = R.string.fourth_6;
        subway_tab[4][6] = R.string.fourth_7;
        subway_tab[4][7] = R.string.fourth_8;
        subway_tab[4][8] = R.string.fourth_9;
        subway_tab[4][9] = R.string.fourth_10;
        subway_tab[4][10] = R.string.fourth_11;
        subway_tab[4][11] = R.string.fourth_12;
        subway_tab[4][12] = R.string.fourth_13;
        subway_tab[4][13] = R.string.fourth_14;

        subway_tab[5][0] = R.string.kim_1;
        subway_tab[5][1] = R.string.kim_2;
        subway_tab[5][2] = R.string.kim_3;
        subway_tab[5][3] = R.string.kim_4;
        subway_tab[5][4] = R.string.kim_5;
        subway_tab[5][5] = R.string.kim_6;
        subway_tab[5][6] = R.string.kim_7;
        subway_tab[5][7] = R.string.kim_8;
        subway_tab[5][8] = R.string.kim_9;
        subway_tab[5][9] = R.string.kim_10;
        subway_tab[5][10] = R.string.kim_11;
        subway_tab[5][11] = R.string.kim_12;
        subway_tab[5][12] = R.string.kim_13;
        subway_tab[5][13] = R.string.kim_14;
        subway_tab[5][14] = R.string.kim_15;
        subway_tab[5][15] = R.string.kim_16;
        subway_tab[5][16] = R.string.kim_17;
        subway_tab[5][17] = R.string.kim_18;
        subway_tab[5][18] = R.string.kim_19;
        subway_tab[5][19] = R.string.kim_20;
        subway_tab[5][20] = R.string.kim_21;

        station_hosun = findViewById(R.id.station_hosun);
        center = findViewById(R.id.center);
        hosun = findViewById(R.id.hosun);
        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        station = findViewById(R.id.station);
        station.setText("3호선");
        right = findViewById(R.id.right);
        left = findViewById(R.id.left);
        station_start = findViewById(R.id.station_start);
        station_end = findViewById(R.id.station_end);

//        final ChangeScript changeScript = new ChangeScript();

        chagescript();

        station.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //연산 ->1
                if (which == 2 && state == 12) {
                    DetailActivity_first.which = 0;
                    DetailActivity_first.state = 11;
                    intentfunc(DetailActivity_first.which);
                }
                //덕천 ->2
                if (which == 2 && state == 4) {
                    DetailActivity_second.which = 1;
                    DetailActivity_second.state = 10;
                    intentfunc(DetailActivity_second.which);
                }
                //수영 ->2
                if (which == 2 && state == 16) {
                    DetailActivity_second.which = 1;
                    DetailActivity_second.state = 35;
                    intentfunc(DetailActivity_second.which);
                }
            }
        });

        hosun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //대저 ->김
                if (which == 2 && state == 0) {
                    DetailActivity_kim.which = 5;
                    DetailActivity_kim.state = 14;
                    intentfunc(DetailActivity_kim.which);
                }
                //미남 ->4
                if (which == 2 && state == 8) {
                    DetailActivity_fourth.which = 3;
                    DetailActivity_fourth.state = 13;
                    intentfunc(DetailActivity_fourth.which);
                }
                //거제 ->동
                if (which == 2 && state == 11) {
                    DetailActivity_dong.which = 4;
                    DetailActivity_dong.state = 12;
                    intentfunc(DetailActivity_dong.which);
                }
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                state++;

                chagescript();
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                state--;
                chagescript();
            }
        });

        time_start = findViewById(R.id.time_start);
        time_start2 = findViewById(R.id.time_start2);
        time_end = findViewById(R.id.time_end);
        time_end2 = findViewById(R.id.time_end2);

        time_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InsideActivity_third_1.class);
                startActivity(intent);
            }
        });

        time_start2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InsideActivity_third_2.class);
                startActivity(intent);
            }
        });

        time_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InsideActivity_third_3.class);
                startActivity(intent);
            }
        });

        time_end2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InsideActivity_third_4.class);
                startActivity(intent);
            }
        });


    }

    void intentfunc(int detailwhich) {
        if (detailwhich == 0) {
            Intent intent = new Intent(getApplicationContext(), DetailActivity_first.class);
            startActivity(intent);
            finish();
        } else if (detailwhich == 1) {
            Intent intent = new Intent(getApplicationContext(), DetailActivity_second.class);
            startActivity(intent);
            finish();
        } else if (detailwhich == 2) {
            Intent intent = new Intent(getApplicationContext(), DetailActivity_third.class);
            startActivity(intent);
            finish();
        } else if (detailwhich == 3) {
            Intent intent = new Intent(getApplicationContext(), DetailActivity_fourth.class);
            startActivity(intent);
            finish();
        } else if (detailwhich == 4) {
            Intent intent = new Intent(getApplicationContext(), DetailActivity_dong.class);
            startActivity(intent);
            finish();
        } else if (detailwhich == 5) {
            Intent intent = new Intent(getApplicationContext(), DetailActivity_kim.class);
            startActivity(intent);
            finish();
        }
    }

    void chagescript() {

        if (subway_tab[which][state] == subway_tab[2][16]) {
            station.setTextColor(Color.GRAY);
            hosun.setTextColor(Color.parseColor("#B77A56"));
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.VISIBLE);

            center.setText(R.string.third_17);
            right.setVisibility(View.INVISIBLE);

            station_start.setText("대저행");
            station_end.setText("수영행");
            hosun.setText("3호선");
            station.setText("2호선");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_17_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_17_2)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_17)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_17)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][15]) {
            station.setTextColor(Color.parseColor("#B77A56"));
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.GONE);

            center.setText(R.string.third_16);
            right.setVisibility(View.VISIBLE);
            station.setText("3호선");
            station_start.setText("대저행");
            station_end.setText("수영행");
            station.setTextColor(Color.parseColor("#B77A56"));

            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_16_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_16_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_16_3)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_16)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_16)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][14]) {
            station.setTextColor(Color.parseColor("#B77A56"));
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.GONE);

            center.setText(R.string.third_15);

            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();
            station_start.setText("대저행");
            station_end.setText("수영행");
            station.setTextColor(Color.parseColor("#B77A56"));

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_15_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_15_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_15_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_15_5)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_15)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_15)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][13]) {
            station.setTextColor(Color.parseColor("#B77A56"));
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.GONE);

            center.setText(R.string.third_14);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();
            station.setText("3호선");
            station_start.setText("대저행");
            station_end.setText("수영행");
            station.setTextColor(Color.parseColor("#B77A56"));


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_14_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_14_3)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_14)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_14)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][12]) {
            station.setTextColor(Color.GRAY);
            hosun.setTextColor(Color.parseColor("#B77A56"));
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.VISIBLE);

            center.setText(R.string.third_13);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();
            station.setText("1호선");
            hosun.setText("3호선");
            station_start.setText("대저행");
            station_end.setText("수영행");
            hosun.setTextColor(Color.parseColor("#B77A56"));

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_13_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_13_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_13_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_13_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_13_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_13_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_13_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_13_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_13_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_13_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_13_12)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_13)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_13)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[2][11]) {
            station.setTextColor(Color.parseColor("#B77A56"));
            hosun.setTextColor(Color.GRAY);
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.VISIBLE);

            center.setText(R.string.third_12);
            station.setText("3호선");
            hosun.setText("동해선");
            station_start.setText("대저행");
            station_end.setText("수영행");
            station.setTextColor(Color.parseColor("#B77A56"));
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_12_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_12_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_12_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_12_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_12_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_12_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_12)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_12)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][10]) {
            station.setTextColor(Color.parseColor("#B77A56"));
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.GONE);

            center.setText(R.string.third_11);
            station.setText("3호선");
            station_start.setText("대저행");
            station_end.setText("수영행");
            station.setTextColor(Color.parseColor("#B77A56"));

            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_11_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_11_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_11_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_11_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_11_5)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_11)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_11)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[2][9]) {
            station.setTextColor(Color.parseColor("#B77A56"));
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.GONE);

            center.setText(R.string.third_10);
            station.setText("3호선");
            station_start.setText("대저행");
            station_end.setText("수영행");
            station.setTextColor(Color.parseColor("#B77A56"));
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_10_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_10_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_10_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_10_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_10)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_10)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][8]) {
            station.setTextColor(Color.parseColor("#B77A56"));
            hosun.setTextColor(Color.GRAY);
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.VISIBLE);

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
            station.setTextColor(Color.parseColor("#B77A56"));


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_9_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_9_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_9_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_9_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_9_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_9_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_9_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_9_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_9_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_9_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_11)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_9_11)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_9_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_13)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_9_13)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_14)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_9_14)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_9)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_9)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][7]) {
            station.setTextColor(Color.parseColor("#B77A56"));
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.GONE);

            center.setText(R.string.third_8);
            station.setText("3호선");
            station_start.setText("대저행");
            station_end.setText("수영행");
            station.setTextColor(Color.parseColor("#B77A56"));
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_8_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_8_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_8_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_8_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_8)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_8)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[2][6]) {
            station.setTextColor(Color.parseColor("#B77A56"));
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.GONE);

            center.setText(R.string.third_7);
            station_start.setText("대저행");
            station_end.setText("수영행");
            station.setTextColor(Color.parseColor("#B77A56"));

            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_7_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_7_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_7_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_7_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_7_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_7_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_7_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_11)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_7_11)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_7)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_7)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][5]) {
            station.setTextColor(Color.parseColor("#B77A56"));
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.GONE);

            center.setText(R.string.third_6);

            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            station.setText("3호선");
            station_start.setText("대저행");
            station_end.setText("수영행");
            station.setTextColor(Color.parseColor("#B77A56"));


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_6_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_6_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_6_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_6_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_6_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_6_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_6_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_6_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_6_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_6_10)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_6)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_6)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][4]) {
            station.setTextColor(Color.GRAY);
            hosun.setTextColor(Color.parseColor("#B77A56"));
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.VISIBLE);

            center.setText(R.string.third_5);

            station.setText("2호선");
            hosun.setText("3호선");
            station_start.setText("대저행");
            station_end.setText("수영행");
            hosun.setTextColor(Color.parseColor("#B77A56"));

            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_5_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_5_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_5_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_5_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_5_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_5_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_5_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_5_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_5_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_5_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_14)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_5_14)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_16)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_5_16)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_17)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_5_17)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_5)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_5)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[2][3]) {
            station.setTextColor(Color.parseColor("#B77A56"));
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.GONE);

            center.setText(R.string.third_4);
            station.setText("3호선");
            station_start.setText("대저행");
            station_end.setText("수영행");
            station.setTextColor(Color.parseColor("#B77A56"));
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_4_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_4_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_4_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_4_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_4)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_4)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[2][2]) {
            station.setTextColor(Color.parseColor("#B77A56"));
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.GONE);

            center.setText(R.string.third_3);
            station_start.setText("대저행");
            station_end.setText("수영행");
            station.setTextColor(Color.parseColor("#B77A56"));
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_3_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_3_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_3_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_3_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_3_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_3_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_3)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_3)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[2][1]) {
            station.setTextColor(Color.parseColor("#B77A56"));
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.GONE);

            center.setText(R.string.third_2);

            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();
            station.setText("3호선");
            station_start.setText("대저행");
            station_end.setText("수영행");
            station.setTextColor(Color.parseColor("#B77A56"));
            left.setVisibility(View.VISIBLE);

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_2_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_2_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_2_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_2_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_2_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_2_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_2_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_2_8)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_2)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_2)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[2][0]) {
            station.setTextColor(Color.parseColor("#B77A56"));
            hosun.setTextColor(Color.GRAY);
            center.setTextColor(Color.parseColor("#B77A56"));
            hosun.setVisibility(View.VISIBLE);

            center.setText(R.string.third_1);

            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();
            station.setText("3호선");
            hosun.setText("김해선");
            station_start.setText("대저행");
            station_end.setText("수영행");
            station.setTextColor(Color.parseColor("#B77A56"));
            left.setVisibility(View.INVISIBLE);


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_11)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_11)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_13)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_13)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_14)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_14)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_15)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_15)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_17)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_out_1_17)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_in_1)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.third_call_1)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        }
    }


}
