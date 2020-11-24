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

import dsu.software.busansubway.Inside.InsideActivity_second_1;
import dsu.software.busansubway.Inside.InsideActivity_second_2;
import dsu.software.busansubway.Inside.InsideActivity_second_3;
import dsu.software.busansubway.Inside.InsideActivity_second_4;
import dsu.software.busansubway.R;

// TODO: 환승역 색 구분 + 호선에 따른 색 변화
// TODO: 버튼에 실시간 위치에 따른 남은 정거장 표시

public class DetailActivity_second extends AppCompatActivity {

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
        station.setText("2호선");
        right = findViewById(R.id.right);
        left = findViewById(R.id.left);
        station_start = findViewById(R.id.station_start);
        station_end = findViewById(R.id.station_end);

//        final ChangeScript changeScript = new ChangeScript();

        chagescript();

        station.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 서면 -> 1
                if (which == 1 && state == 24) {
                    DetailActivity_first.which = 0;
                    DetailActivity_first.state = 15;
                    intentfunc(DetailActivity_first.which);
                }
            }
        });

        hosun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 덕천 -> 3
                if (which == 1 && state == 10) {
                    DetailActivity_third.which = 2;
                    DetailActivity_third.state = 4;
                    intentfunc(DetailActivity_third.which);
                }
                // 사상 -> 김
                if (which == 1 && state == 16) {
                    DetailActivity_kim.which = 5;
                    DetailActivity_kim.state = 20;
                    intentfunc(DetailActivity_kim.which);
                }
                // 수영 -> 3
                if (which == 1 && state == 35) {
                    DetailActivity_third.which = 2;
                    DetailActivity_third.state = 16;
                    intentfunc(DetailActivity_third.which);
                }
                // 벡스코 -> 동
                if (which == 1 && state == 38) {
                    DetailActivity_dong.which = 4;
                    DetailActivity_dong.state = 5;
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
                Intent intent = new Intent(getApplicationContext(), InsideActivity_second_1.class);
                startActivity(intent);
            }
        });

        time_start2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InsideActivity_second_2.class);
                startActivity(intent);
            }
        });

        time_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InsideActivity_second_3.class);
                startActivity(intent);
            }
        });

        time_end2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InsideActivity_second_4.class);
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

        if (subway_tab[which][state] == subway_tab[1][42]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

            center.setText(R.string.second_43);
            right.setVisibility(View.INVISIBLE);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_43)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_43)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][41]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

            center.setText(R.string.second_42);
            station_start.setText("양산행");
            station_end.setText("장산행");
            right.setVisibility(View.VISIBLE);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_42_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_42_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_42_3)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_42)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_42)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][40]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_41_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_41_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_41_5)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_41)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_41)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][39]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_40_1)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_40)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_40)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][38]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.VISIBLE);
            hosun.setText("동해선");
            center.setTextColor(Color.parseColor("#B2E419"));

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


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_39_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_39_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_39_3)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_39)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_39)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][37]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_38)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_38)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][36]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_37_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_37_2)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_37)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_37)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][35]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.VISIBLE);
            center.setTextColor(Color.parseColor("#B2E419"));
            hosun.setText("3호선");

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_36)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_36)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][34]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_35_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_35_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_35_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_35_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_35_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_35_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_35)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_35)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][33]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_34_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_34_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_34_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_34_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_34)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_34)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][32]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

            center.setText(R.string.second_33);
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33_12)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_33)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_33)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][31]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_32_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_32_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_32_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_32_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_32)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_32)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][30]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_31_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_31_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_31_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_31_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_31)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_31)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][29]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_30_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_30_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_30_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_30_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_30)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_30)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][28]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_29_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_29_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_29_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_29_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_29)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_29)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][27]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_28_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_28_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_28_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_28_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_28)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_28)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][26]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_27_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_27_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_27_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_27_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_27_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_27_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_27)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_27)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][25]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setTextColor(Color.GRAY);
            hosun.setVisibility(View.GONE);
            station.setText("2호선");
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_26_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_26_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_26_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_26_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_26)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_26)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][24]) {
            hosun.setTextColor(Color.parseColor("#B2E419"));
            station.setTextColor(Color.GRAY);
            hosun.setVisibility(View.VISIBLE);
            center.setTextColor(Color.parseColor("#B2E419"));
            station.setText("1호선");
            hosun.setText("2호선");

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_8)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_25)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_25)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][23]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setTextColor(Color.GRAY);
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));
            station.setText("2호선");

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_24_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_24_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_24_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_24_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_24_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_24_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_24)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_24)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][22]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_23_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_23_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_23_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_23_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_23_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_23_7)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_23)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_23)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][21]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_8)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_22)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_22)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][20]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_21_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_21_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_21_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_21_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_21)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_21)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][19]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_20_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_20_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_20_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_20_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_20_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_20_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_20_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_20_8)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_20)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_20)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][18]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

            center.setText(R.string.second_19);

            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_11)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_11)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_13)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_13)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_15)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_15)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_19)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_19)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][17]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_18_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_18_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_18_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_18_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_18_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_18_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_18_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_18_8)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_18)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_18)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][16]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.VISIBLE);
            hosun.setText("김해선");
            center.setTextColor(Color.parseColor("#B2E419"));

            center.setText(R.string.second_17);
            station_start.setText("양산행");
            station_end.setText("장산행");
            List<ExpandableListAdapter.Item> data = new ArrayList<>();
            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
            exit.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
            fainfo.invisibleChildren = new ArrayList<>();
            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
            etcinfo.invisibleChildren = new ArrayList<>();

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_17_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_17_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_17_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_17_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_17)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_17)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][15]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_16_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_16_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_16_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_16_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_16)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_16)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][14]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_15_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_15_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_15_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_15_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_15)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_15)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][13]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_14_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_14_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_14_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_14_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_14)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_14)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));

        } else if (subway_tab[which][state] == subway_tab[1][12]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_13_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_13_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_13_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_13_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_13_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_13_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_13)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_13)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][11]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_12_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_12_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_12_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_12_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_12_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_12_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_12)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_12)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][10]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.VISIBLE);
            hosun.setText("3호선");
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_11)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_11)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][9]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_10_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_10_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_10_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_10_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_10_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_10_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_10)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_10)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][8]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_9_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_9_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_9_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_9_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_9_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_9_6)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_9)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_9)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][7]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            right.setVisibility(View.VISIBLE);

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_11)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_11)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_13)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_13)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_14)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_14)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_15)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_15)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_17)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_17)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_8)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_8)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][6]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_7_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_7_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_7_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_7_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_7)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_7)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][5]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_11)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_11)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_13)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_13)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_6)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_6)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][4]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_5_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_5_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_5_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_5_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_5_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_5_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_5_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_5_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_5_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_11)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_5_11)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_5)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_5)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][3]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_4_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_4_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_4_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_4_4)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_4)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_4)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][2]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);

            center.setTextColor(Color.parseColor("#B2E419"));
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


            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_3_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_3_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_3_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_3_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_3_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_3_7)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_3)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_3)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][1]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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
            left.setVisibility(View.VISIBLE);

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_2_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_2_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_2_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_2_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_2_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_2_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_2_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_2_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_2_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_2_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_2_12)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_2)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_2)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        } else if (subway_tab[which][state] == subway_tab[1][0]) {
            station.setTextColor(Color.parseColor("#B2E419"));
            hosun.setVisibility(View.GONE);
            center.setTextColor(Color.parseColor("#B2E419"));

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

            left.setVisibility(View.INVISIBLE);

            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_1)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_2)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_3)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_4)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_5)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_6)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_7)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_8)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_9)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_10)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_11)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_11)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_12)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_13)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_13)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.out_14)));
            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_14)));
            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_1)));
            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_1)));

            data.add(exit);
            data.add(fainfo);
            data.add(etcinfo);
            recyclerview.setAdapter(new ExpandableListAdapter(data));
        }
    }


}
