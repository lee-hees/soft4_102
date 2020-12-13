//package dsu.software.busansubway.Details;
//
//import android.annotation.SuppressLint;
//import android.content.Intent;
//import android.graphics.Color;
//import android.os.Bundle;
//import android.os.Handler;
//import android.view.View;
//import android.widget.Button;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Timer;
//import java.util.TimerTask;
//
//import dsu.software.busansubway.Inside.InsideActivity_second_1;
//import dsu.software.busansubway.Inside.InsideActivity_second_2;
//import dsu.software.busansubway.Inside.InsideActivity_second_3;
//import dsu.software.busansubway.Inside.InsideActivity_second_4;
//import dsu.software.busansubway.R;
//
//// TODO: 환승역 색 구분 + 호선에 따른 색 변화
//// TODO: 버튼에 실시간 위치에 따른 남은 정거장 표시
//
//public class DetailActivity_second extends AppCompatActivity {
//
//    private RecyclerView recyclerview;
//
//    LinearLayout left, right;
//    TextView center;
//    TextView station_start, station_end;
//    TextView station, hosun;
//    Button time_start, time_start2, time_end, time_end2;
//    int[][] subway_tab = new int[6][43];
//    public static int which = 0;
//    public static int state = 0;
//    public static String title = "";
//    LinearLayout station_hosun;
////    String add = R.string.app_name;
//
//    public static ArrayList<DatabaseReference> second_move = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_one_to_first_list = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_one_to_second_list = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_one_to_third_list = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_one_to_fourth_list = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_two_to_first_list = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_two_to_second_list = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_two_to_third_list = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_two_to_fourth_list = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_three_to_first_list = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_three_to_second_list = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_three_to_third_list = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_three_to_fourth_list = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_four_to_first_list = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_four_to_second_list = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_four_to_third_list = new ArrayList<>();
//    public static ArrayList<DatabaseReference> second_four_to_fourth_list = new ArrayList<>();
//
//
//    @SuppressLint("WrongViewCast")
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_detail_main);
//
//
//        subway_tab[0][0] = R.string.first_1;
//        subway_tab[0][1] = R.string.first_2;
//        subway_tab[0][2] = R.string.first_3;
//        subway_tab[0][3] = R.string.first_4;
//        subway_tab[0][4] = R.string.first_5;
//        subway_tab[0][5] = R.string.first_6;
//        subway_tab[0][6] = R.string.first_7;
//        subway_tab[0][7] = R.string.first_8;
//        subway_tab[0][8] = R.string.first_9;
//        subway_tab[0][9] = R.string.first_10;
//        subway_tab[0][10] = R.string.first_11;
//        subway_tab[0][11] = R.string.first_12;
//        subway_tab[0][12] = R.string.first_13;
//        subway_tab[0][13] = R.string.first_14;
//        subway_tab[0][14] = R.string.first_15;
//        subway_tab[0][15] = R.string.first_16;
//        subway_tab[0][16] = R.string.first_17;
//        subway_tab[0][17] = R.string.first_18;
//        subway_tab[0][18] = R.string.first_19;
//        subway_tab[0][19] = R.string.first_20;
//        subway_tab[0][20] = R.string.first_21;
//        subway_tab[0][21] = R.string.first_22;
//        subway_tab[0][22] = R.string.first_23;
//        subway_tab[0][23] = R.string.first_24;
//        subway_tab[0][24] = R.string.first_25;
//        subway_tab[0][25] = R.string.first_26;
//        subway_tab[0][26] = R.string.first_27;
//        subway_tab[0][27] = R.string.first_28;
//        subway_tab[0][28] = R.string.first_29;
//        subway_tab[0][29] = R.string.first_30;
//        subway_tab[0][30] = R.string.first_31;
//        subway_tab[0][31] = R.string.first_32;
//        subway_tab[0][32] = R.string.first_33;
//        subway_tab[0][33] = R.string.first_34;
//        subway_tab[0][34] = R.string.first_35;
//        subway_tab[0][35] = R.string.first_36;
//        subway_tab[0][36] = R.string.first_37;
//        subway_tab[0][37] = R.string.first_38;
//        subway_tab[0][38] = R.string.first_39;
//        subway_tab[0][39] = R.string.first_40;
//
//        subway_tab[1][0] = R.string.second_1;
//        subway_tab[1][1] = R.string.second_2;
//        subway_tab[1][2] = R.string.second_3;
//        subway_tab[1][3] = R.string.second_4;
//        subway_tab[1][4] = R.string.second_5;
//        subway_tab[1][5] = R.string.second_6;
//        subway_tab[1][6] = R.string.second_7;
//        subway_tab[1][7] = R.string.second_8;
//        subway_tab[1][8] = R.string.second_9;
//        subway_tab[1][9] = R.string.second_10;
//        subway_tab[1][10] = R.string.second_11;
//        subway_tab[1][11] = R.string.second_12;
//        subway_tab[1][12] = R.string.second_13;
//        subway_tab[1][13] = R.string.second_14;
//        subway_tab[1][14] = R.string.second_15;
//        subway_tab[1][15] = R.string.second_16;
//        subway_tab[1][16] = R.string.second_17;
//        subway_tab[1][17] = R.string.second_18;
//        subway_tab[1][18] = R.string.second_19;
//        subway_tab[1][19] = R.string.second_20;
//        subway_tab[1][20] = R.string.second_21;
//        subway_tab[1][21] = R.string.second_22;
//        subway_tab[1][22] = R.string.second_23;
//        subway_tab[1][23] = R.string.second_24;
//        subway_tab[1][24] = R.string.second_25;
//        subway_tab[1][25] = R.string.second_26;
//        subway_tab[1][26] = R.string.second_27;
//        subway_tab[1][27] = R.string.second_28;
//        subway_tab[1][28] = R.string.second_29;
//        subway_tab[1][29] = R.string.second_30;
//        subway_tab[1][30] = R.string.second_31;
//        subway_tab[1][31] = R.string.second_32;
//        subway_tab[1][32] = R.string.second_33;
//        subway_tab[1][33] = R.string.second_34;
//        subway_tab[1][34] = R.string.second_35;
//        subway_tab[1][35] = R.string.second_36;
//        subway_tab[1][36] = R.string.second_37;
//        subway_tab[1][37] = R.string.second_38;
//        subway_tab[1][38] = R.string.second_39;
//        subway_tab[1][39] = R.string.second_40;
//        subway_tab[1][40] = R.string.second_41;
//        subway_tab[1][41] = R.string.second_42;
//        subway_tab[1][42] = R.string.second_43;
//
//
//        subway_tab[2][0] = R.string.third_1;
//        subway_tab[2][1] = R.string.third_2;
//        subway_tab[2][2] = R.string.third_3;
//        subway_tab[2][3] = R.string.third_4;
//        subway_tab[2][4] = R.string.third_5;
//        subway_tab[2][5] = R.string.third_6;
//        subway_tab[2][6] = R.string.third_7;
//        subway_tab[2][7] = R.string.third_8;
//        subway_tab[2][8] = R.string.third_9;
//        subway_tab[2][9] = R.string.third_10;
//        subway_tab[2][10] = R.string.third_11;
//        subway_tab[2][11] = R.string.third_12;
//        subway_tab[2][12] = R.string.third_13;
//        subway_tab[2][13] = R.string.third_14;
//        subway_tab[2][14] = R.string.third_15;
//        subway_tab[2][15] = R.string.third_16;
//        subway_tab[2][16] = R.string.third_17;
//
//
//        subway_tab[3][0] = R.string.dong_1;
//        subway_tab[3][1] = R.string.dong_2;
//        subway_tab[3][2] = R.string.dong_3;
//        subway_tab[3][3] = R.string.dong_4;
//        subway_tab[3][4] = R.string.dong_5;
//        subway_tab[3][5] = R.string.dong_6;
//        subway_tab[3][6] = R.string.dong_7;
//        subway_tab[3][7] = R.string.dong_8;
//        subway_tab[3][8] = R.string.dong_9;
//        subway_tab[3][9] = R.string.dong_10;
//        subway_tab[3][10] = R.string.dong_11;
//        subway_tab[3][11] = R.string.dong_12;
//        subway_tab[3][12] = R.string.dong_13;
//        subway_tab[3][13] = R.string.dong_14;
//        subway_tab[3][14] = R.string.dong_15;
//
//        subway_tab[4][0] = R.string.fourth_1;
//        subway_tab[4][1] = R.string.fourth_2;
//        subway_tab[4][2] = R.string.fourth_3;
//        subway_tab[4][3] = R.string.fourth_4;
//        subway_tab[4][4] = R.string.fourth_5;
//        subway_tab[4][5] = R.string.fourth_6;
//        subway_tab[4][6] = R.string.fourth_7;
//        subway_tab[4][7] = R.string.fourth_8;
//        subway_tab[4][8] = R.string.fourth_9;
//        subway_tab[4][9] = R.string.fourth_10;
//        subway_tab[4][10] = R.string.fourth_11;
//        subway_tab[4][11] = R.string.fourth_12;
//        subway_tab[4][12] = R.string.fourth_13;
//        subway_tab[4][13] = R.string.fourth_14;
//
//        subway_tab[5][0] = R.string.kim_1;
//        subway_tab[5][1] = R.string.kim_2;
//        subway_tab[5][2] = R.string.kim_3;
//        subway_tab[5][3] = R.string.kim_4;
//        subway_tab[5][4] = R.string.kim_5;
//        subway_tab[5][5] = R.string.kim_6;
//        subway_tab[5][6] = R.string.kim_7;
//        subway_tab[5][7] = R.string.kim_8;
//        subway_tab[5][8] = R.string.kim_9;
//        subway_tab[5][9] = R.string.kim_10;
//        subway_tab[5][10] = R.string.kim_11;
//        subway_tab[5][11] = R.string.kim_12;
//        subway_tab[5][12] = R.string.kim_13;
//        subway_tab[5][13] = R.string.kim_14;
//        subway_tab[5][14] = R.string.kim_15;
//        subway_tab[5][15] = R.string.kim_16;
//        subway_tab[5][16] = R.string.kim_17;
//        subway_tab[5][17] = R.string.kim_18;
//        subway_tab[5][18] = R.string.kim_19;
//        subway_tab[5][19] = R.string.kim_20;
//        subway_tab[5][20] = R.string.kim_21;
//
//        station_hosun = findViewById(R.id.station_hosun);
//        center = findViewById(R.id.center);
//        hosun = findViewById(R.id.hosun);
//        recyclerview = findViewById(R.id.recyclerview);
//        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
//        station = findViewById(R.id.station);
//        station.setText("2호선");
//        right = findViewById(R.id.right);
//        left = findViewById(R.id.left);
//        station_start = findViewById(R.id.station_start);
//        station_end = findViewById(R.id.station_end);
//
////        final ChangeScript changeScript = new ChangeScript();
//
//        chagescript();
//
//        station.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // 서면 -> 1
//                if (which == 1 && state == 24) {
//                    DetailActivity_first.which = 0;
//                    DetailActivity_first.state = 15;
//                    intentfunc(DetailActivity_first.which);
//                }
//            }
//        });
//
//        hosun.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // 덕천 -> 3
//                if (which == 1 && state == 10) {
//                    DetailActivity_third.which = 2;
//                    DetailActivity_third.state = 4;
//                    intentfunc(DetailActivity_third.which);
//                }
//                // 사상 -> 김
//                if (which == 1 && state == 16) {
//                    DetailActivity_kim.which = 5;
//                    DetailActivity_kim.state = 20;
//                    intentfunc(DetailActivity_kim.which);
//                }
//                // 수영 -> 3
//                if (which == 1 && state == 35) {
//                    DetailActivity_third.which = 2;
//                    DetailActivity_third.state = 16;
//                    intentfunc(DetailActivity_third.which);
//                }
//                // 벡스코 -> 동
//                if (which == 1 && state == 38) {
//                    DetailActivity_dong.which = 4;
//                    DetailActivity_dong.state = 5;
//                    intentfunc(DetailActivity_dong.which);
//                }
//            }
//        });
//
//        right.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                state++;
//
//                chagescript();
//            }
//        });
//
//        left.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                state--;
//                chagescript();
//            }
//        });
//
//        time_start = findViewById(R.id.time_start);
//        time_start2 = findViewById(R.id.time_start2);
//        time_end = findViewById(R.id.time_end);
//        time_end2 = findViewById(R.id.time_end2);
//
//        time_start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), InsideActivity_second_1.class);
//                startActivity(intent);
//            }
//        });
//
//        time_start2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), InsideActivity_second_2.class);
//                startActivity(intent);
//            }
//        });
//
//        time_end.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), InsideActivity_second_3.class);
//                startActivity(intent);
//            }
//        });
//
//        time_end2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), InsideActivity_second_4.class);
//                startActivity(intent);
//            }
//        });
//
//        // Write a message to the database
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//
//        final int[] _reverse_second = {0, 0, 1, 1};
//        final int[] _current_station_second = {0, 0, 42, 42};
//
//        DatabaseReference second = database.getReference("second"); // 1호선
//        DatabaseReference second_one = second.child("one"); // 1호선 1호차
//        DatabaseReference second_two = second.child("two"); // 1호선 2호차
//        DatabaseReference second_three = second.child("three"); // 1호선 3호차
//        DatabaseReference second_four = second.child("four"); // 1호선 4호차
//
//        second_move.add(second_one.child("reverse"));
//        second_move.add(second_one.child("current_station"));
//        second_move.get(0).setValue(_reverse_second[0]);
//        second_move.get(1).setValue(_current_station_second[0]);
//        second_move.add(second_two.child("reverse"));
//        second_move.add(second_two.child("current_station"));
//        second_move.get(2).setValue(_reverse_second[1]);
//        second_move.get(3).setValue(_current_station_second[1]);
//        second_move.add(second_three.child("reverse"));
//        second_move.add(second_three.child("current_station"));
//        second_move.get(4).setValue(_reverse_second[2]);
//        second_move.get(5).setValue(_current_station_second[2]);
//        second_move.add(second_four.child("reverse"));
//        second_move.add(second_four.child("current_station"));
//        second_move.get(6).setValue(_reverse_second[3]);
//        second_move.get(7).setValue(_current_station_second[3]);
//
//        DatabaseReference second_one_to_first = second_one.child("one_to_first"); // 1호차의 1번칸
//        DatabaseReference second_one_to_second = second_one.child("one_to_second"); // 1호차의 2번칸
//        DatabaseReference second_one_to_third = second_one.child("one_to_third"); // 1호차의 3번칸
//        DatabaseReference second_one_to_fourth = second_one.child("one_to_fourth"); // 1호차의 4번칸
//        DatabaseReference second_two_to_first = second_two.child("two_to_first"); // 2호차의 1번칸
//        DatabaseReference second_two_to_second = second_two.child("two_to_second"); // 2호차의 2번칸
//        DatabaseReference second_two_to_third = second_two.child("two_to_third"); // 2호차의 3번칸
//        DatabaseReference second_two_to_fourth = second_two.child("two_to_fourth"); // 2호차의 4번칸
//        DatabaseReference second_three_to_first = second_three.child("three_to_first"); // 3호차의 1번칸
//        DatabaseReference second_three_to_second = second_three.child("three_to_second"); // 3호차의 2번칸
//        DatabaseReference second_three_to_third = second_three.child("three_to_third"); // 3호차의 3번칸
//        DatabaseReference second_three_to_fourth = second_three.child("three_to_fourth"); // 3호차의 4번칸
//        DatabaseReference second_four_to_first = second_four.child("four_to_first"); // 4호차의 1번칸
//        DatabaseReference second_four_to_second = second_four.child("four_to_second"); // 4호차의 2번칸
//        DatabaseReference second_four_to_third = second_four.child("four_to_third"); // 4호차의 3번칸
//        DatabaseReference second_four_to_fourth = second_four.child("four_to_fourth"); // 4호차의 4번칸
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_01"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_02"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_03"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_04"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_05"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_06"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_07"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_08"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_09"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_10"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_11"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_12"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_13"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_14"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_15"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_16"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_17"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_18"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_19"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_20"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_21"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_22"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_23"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_24"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_25"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_26"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_27"));
//        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_28"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_01"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_02"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_03"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_04"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_05"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_06"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_07"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_08"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_09"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_10"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_11"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_12"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_13"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_14"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_15"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_16"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_17"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_18"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_19"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_20"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_21"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_22"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_23"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_24"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_25"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_26"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_27"));
//        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_28"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_01"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_02"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_03"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_04"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_05"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_06"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_07"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_08"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_09"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_10"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_11"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_12"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_13"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_14"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_15"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_16"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_17"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_18"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_19"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_20"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_21"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_22"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_23"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_24"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_25"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_26"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_27"));
//        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_28"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_01"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_02"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_03"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_04"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_05"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_06"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_07"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_08"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_09"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_10"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_11"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_12"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_13"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_14"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_15"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_16"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_17"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_18"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_19"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_20"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_21"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_22"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_23"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_24"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_25"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_26"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_27"));
//        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_28"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_01"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_02"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_03"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_04"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_05"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_06"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_07"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_08"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_09"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_10"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_11"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_12"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_13"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_14"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_15"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_16"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_17"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_18"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_19"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_20"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_21"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_22"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_23"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_24"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_25"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_26"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_27"));
//        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_28"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_01"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_02"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_03"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_04"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_05"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_06"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_07"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_08"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_09"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_10"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_11"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_12"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_13"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_14"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_15"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_16"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_17"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_18"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_19"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_20"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_21"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_22"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_23"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_24"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_25"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_26"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_27"));
//        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_28"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_01"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_02"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_03"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_04"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_05"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_06"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_07"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_08"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_09"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_10"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_11"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_12"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_13"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_14"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_15"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_16"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_17"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_18"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_19"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_20"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_21"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_22"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_23"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_24"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_25"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_26"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_27"));
//        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_28"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_01"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_02"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_03"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_04"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_05"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_06"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_07"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_08"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_09"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_10"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_11"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_12"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_13"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_14"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_15"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_16"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_17"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_18"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_19"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_20"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_21"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_22"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_23"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_24"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_25"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_26"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_27"));
//        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_28"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_01"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_02"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_03"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_04"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_05"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_06"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_07"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_08"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_09"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_10"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_11"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_12"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_13"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_14"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_15"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_16"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_17"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_18"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_19"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_20"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_21"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_22"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_23"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_24"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_25"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_26"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_27"));
//        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_28"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_01"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_02"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_03"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_04"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_05"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_06"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_07"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_08"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_09"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_10"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_11"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_12"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_13"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_14"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_15"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_16"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_17"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_18"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_19"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_20"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_21"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_22"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_23"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_24"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_25"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_26"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_27"));
//        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_28"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_01"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_02"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_03"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_04"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_05"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_06"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_07"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_08"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_09"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_10"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_11"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_12"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_13"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_14"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_15"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_16"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_17"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_18"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_19"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_20"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_21"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_22"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_23"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_24"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_25"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_26"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_27"));
//        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_28"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_01"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_02"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_03"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_04"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_05"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_06"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_07"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_08"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_09"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_10"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_11"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_12"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_13"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_14"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_15"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_16"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_17"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_18"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_19"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_20"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_21"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_22"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_23"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_24"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_25"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_26"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_27"));
//        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_28"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_01"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_02"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_03"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_04"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_05"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_06"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_07"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_08"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_09"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_10"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_11"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_12"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_13"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_14"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_15"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_16"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_17"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_18"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_19"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_20"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_21"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_22"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_23"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_24"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_25"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_26"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_27"));
//        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_28"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_01"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_02"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_03"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_04"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_05"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_06"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_07"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_08"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_09"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_10"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_11"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_12"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_13"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_14"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_15"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_16"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_17"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_18"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_19"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_20"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_21"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_22"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_23"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_24"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_25"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_26"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_27"));
//        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_28"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_01"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_02"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_03"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_04"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_05"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_06"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_07"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_08"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_09"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_10"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_11"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_12"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_13"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_14"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_15"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_16"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_17"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_18"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_19"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_20"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_21"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_22"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_23"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_24"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_25"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_26"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_27"));
//        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_28"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_01"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_02"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_03"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_04"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_05"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_06"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_07"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_08"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_09"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_10"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_11"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_12"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_13"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_14"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_15"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_16"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_17"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_18"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_19"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_20"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_21"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_22"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_23"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_24"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_25"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_26"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_27"));
//        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_28"));
//
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
//                                        second_move.get(0).addValueEventListener(new ValueEventListener() {
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
//                                        second_move.get(2).addValueEventListener(new ValueEventListener() {
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
//                                        second_move.get(4).addValueEventListener(new ValueEventListener() {
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
//                                        second_move.get(6).addValueEventListener(new ValueEventListener() {
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
//                                        second_move.get(1).addValueEventListener(new ValueEventListener() {
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
//                                        second_move.get(3).addValueEventListener(new ValueEventListener() {
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
//                                        second_move.get(5).addValueEventListener(new ValueEventListener() {
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
//                                        second_move.get(7).addValueEventListener(new ValueEventListener() {
//                                            @SuppressLint({"LongLogTag", "SetTextI18n"})
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
//                                                current_station[0] = 15;
//                                                current_station[1] = 10;
//
//                                                current_station[2] = 5;
//                                                current_station[3] = 10;
//
//                                                //
//
////                                                station_start.setText(Arrays.toString(nrev) + current_station[nrev[0]] + " " + current_station[nrev[1]]);
////                                                station_end.setText(Arrays.toString(rev) + current_station[rev[0]] + " " + current_station[rev[1]]);
//
//                                                int current = DetailActivity_second.state;
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
//                                                        if (current - current_station[nrev[1]] == 1) {
//                                                            time_start2.setText("곧도착");
//                                                        } else {
//                                                            time_start2.setText(current - current_station[nrev[1]] + "정거장 전");
//                                                        }
//                                                        time_start.setTextColor(Color.parseColor("#aaff0000"));
//                                                        time_start2.setTextColor(Color.parseColor("#aaff0000"));
//                                                    } else //
//                                                    {
//                                                        if (current > current_station[nrev[1]]) // 곧도착/정거장전
//                                                        {
//                                                            if (current - current_station[nrev[1]] == 1) {
//                                                                time_start.setText("곧도착");
//                                                            } else {
//                                                                time_start.setText(current - current_station[nrev[1]] + "정거장 전");
//                                                            }
//                                                            time_start2.setText("곧출발");
//                                                            time_start.setTextColor(Color.parseColor("#aaff0000"));
//                                                            time_start2.setTextColor(Color.parseColor("#555555"));
//                                                        } else//곧출발
//                                                        {
//                                                            time_start.setText("곧출발");
//                                                            time_start2.setText("곧출발");
//                                                            time_start.setTextColor(Color.parseColor("#555555"));
//                                                            time_start2.setTextColor(Color.parseColor("#555555"));
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
//                                                        if (current - current_station[nrev[0]] == 1) {
//                                                            time_start2.setText("곧도착");
//                                                        } else {
//                                                            time_start2.setText(current - current_station[nrev[0]] + "정거장 전");
//                                                        }
//                                                        time_start.setTextColor(Color.parseColor("#aaff0000"));
//                                                        time_start2.setTextColor(Color.parseColor("#aaff0000"));
//                                                    } else //
//                                                    {
//                                                        if (current > current_station[nrev[0]]) // 곧도착/정거장전
//                                                        {
//                                                            if (current - current_station[nrev[0]] == 1) {
//                                                                time_start.setText("곧도착");
//                                                            } else {
//                                                                time_start.setText(current - current_station[nrev[0]] + "정거장 전");
//                                                            }
//                                                            time_start2.setText("곧출발");
//                                                            time_start.setTextColor(Color.parseColor("#aaff0000"));
//                                                            time_start2.setTextColor(Color.parseColor("#555555"));
//                                                        } else//곧출발
//                                                        {
//                                                            time_start.setText("곧출발");
//                                                            time_start2.setText("곧출발");
//                                                            time_start.setTextColor(Color.parseColor("#555555"));
//                                                            time_start2.setTextColor(Color.parseColor("#555555"));
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
//                                                        if (current_station[rev[0]] - current == 1) {
//                                                            time_end2.setText("곧도착");
//                                                        } else {
//                                                            time_end2.setText(current_station[rev[0]] - current + "정거장 전");
//                                                        }
//                                                        time_end.setTextColor(Color.parseColor("#aaff0000"));
//                                                        time_end2.setTextColor(Color.parseColor("#aaff0000"));
//                                                    } else //
//                                                    {
//                                                        if (current < current_station[rev[0]]) // 곧도착/정거장전
//                                                        {
//                                                            if (current_station[rev[0]] - current == 1) {
//                                                                time_end.setText("곧도착");
//                                                            } else {
//                                                                time_end.setText(current_station[rev[0]] - current + "정거장 전");
//                                                            }
//                                                            time_end2.setText("곧출발");
//                                                            time_end.setTextColor(Color.parseColor("#aaff0000"));
//                                                            time_end2.setTextColor(Color.parseColor("#555555"));
//                                                        } else//곧출발
//                                                        {
//                                                            time_end.setText("곧출발");
//                                                            time_end2.setText("곧출발");
//                                                            time_end.setTextColor(Color.parseColor("#555555"));
//                                                            time_end2.setTextColor(Color.parseColor("#555555"));
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
//                                                        if (current_station[rev[1]] - current == 1) {
//                                                            time_end2.setText("곧도착");
//                                                        } else {
//                                                            time_end2.setText(current_station[rev[1]] - current + "정거장 전");
//                                                        }
//                                                        time_end.setTextColor(Color.parseColor("#aaff0000"));
//                                                        time_end2.setTextColor(Color.parseColor("#aaff0000"));
//                                                    } else //
//                                                    {
//                                                        if (current < current_station[rev[1]]) // 곧도착/정거장전
//                                                        {
//                                                            if (current_station[rev[1]] - current == 1) {
//                                                                time_end.setText("곧도착");
//                                                            } else {
//                                                                time_end.setText(current_station[rev[1]] - current + "정거장 전");
//                                                            }
//                                                            time_end2.setText("곧출발");
//                                                            time_end.setTextColor(Color.parseColor("#aaff0000"));
//                                                            time_end2.setTextColor(Color.parseColor("#555555"));
//                                                        } else//곧출발
//                                                        {
//                                                            time_end.setText("곧출발");
//                                                            time_end2.setText("곧출발");
//                                                            time_end.setTextColor(Color.parseColor("#555555"));
//                                                            time_end2.setTextColor(Color.parseColor("#555555"));
//                                                        }
//                                                    }
//                                                }
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
//    }
//
//    void intentfunc(int detailwhich) {
//        if (detailwhich == 0) {
//            Intent intent = new Intent(getApplicationContext(), DetailActivity_first.class);
//            startActivity(intent);
//            finish();
//        } else if (detailwhich == 1) {
//            Intent intent = new Intent(getApplicationContext(), DetailActivity_second.class);
//            startActivity(intent);
//            finish();
//        } else if (detailwhich == 2) {
//            Intent intent = new Intent(getApplicationContext(), DetailActivity_third.class);
//            startActivity(intent);
//            finish();
//        } else if (detailwhich == 3) {
//            Intent intent = new Intent(getApplicationContext(), DetailActivity_fourth.class);
//            startActivity(intent);
//            finish();
//        } else if (detailwhich == 4) {
//            Intent intent = new Intent(getApplicationContext(), DetailActivity_dong.class);
//            startActivity(intent);
//            finish();
//        } else if (detailwhich == 5) {
//            Intent intent = new Intent(getApplicationContext(), DetailActivity_kim.class);
//            startActivity(intent);
//            finish();
//        }
//    }
//
//
//    void chagescript() {
//
//        if (subway_tab[which][state] == subway_tab[1][42]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_43);
//            title = (String) center.getText();
//            right.setVisibility(View.INVISIBLE);
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_1_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_43)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_43)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][41]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_42);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            right.setVisibility(View.VISIBLE);
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_2_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_2_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_2_3)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_42)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_42)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][40]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_41);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            left.setVisibility(View.VISIBLE);
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_3_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_3_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_3_5)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_41)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_41)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][39]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_40);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_4_1)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_40)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_40)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][38]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.VISIBLE);
//            hosun.setText("동해선");
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_39);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_5_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_5_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_5_3)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_39)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_39)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][37]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_38);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_6_6)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_38)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_38)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][36]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_37);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_7_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_7_2)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_37)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_37)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][35]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.VISIBLE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setText("3호선");
//
//            center.setText(R.string.second_36);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_8_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_36)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_36)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][34]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_35);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_9_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_9_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_9_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_9_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_9_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_9_6)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_35)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_35)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][33]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_34);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_10_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_10_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_10_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_10_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_34)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_34)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][32]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_33);
//            title = (String) center.getText();
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_9)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11_9)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11_10)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_12)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_11_12)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_33)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_33)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][31]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_32);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_12_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_12_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_12_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_12_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_32)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_32)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][30]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_31);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_13_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_13_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_13_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_13_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_31)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_31)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][29]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_30);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_14_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_14_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_14_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_14_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_30)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_30)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][28]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_29);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_15_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_15_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_15_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_15_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_29)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_29)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][27]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_28);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_16_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_16_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_16_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_16_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_28)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_28)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][26]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_27);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            right.setVisibility(View.VISIBLE);
//
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_17_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_17_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_17_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_17_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_17_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_17_6)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_27)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_27)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][25]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setTextColor(Color.GRAY);
//            hosun.setVisibility(View.GONE);
//            station.setText("2호선");
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_26);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_18_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_18_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_18_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_18_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_26)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_26)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][24]) {
//            hosun.setTextColor(Color.parseColor("#B2E419"));
//            station.setTextColor(Color.GRAY);
//            hosun.setVisibility(View.VISIBLE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//            station.setText("1호선");
//            hosun.setText("2호선");
//
//            center.setText(R.string.second_25);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_19_8)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_25)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_25)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][23]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setTextColor(Color.GRAY);
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//            station.setText("2호선");
//
//            center.setText(R.string.second_24);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_20_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_20_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_20_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_20_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_20_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_20_6)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_24)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_24)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][22]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_23);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_21_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_21_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_21_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_21_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_21_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_21_7)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_23)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_23)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][21]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_22);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_22_8)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_22)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_22)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][20]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_21);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_23_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_23_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_23_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_23_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_21)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_21)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][19]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_20);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_24_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_24_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_24_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_24_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_24_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_24_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_24_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_24_8)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_20)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_20)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][18]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_19);
//            title = (String) center.getText();
//
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_9)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_9)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_10)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_11)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_11)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_12)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_12)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_13)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_13)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_15)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_25_15)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_19)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_19)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][17]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_18);
//            title = (String) center.getText();
//            center.setTextSize(30);
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_26_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_26_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_26_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_26_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_26_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_26_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_26_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_26_8)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_18)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_18)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][16]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.VISIBLE);
//            hosun.setText("김해선");
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_17);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_27_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_27_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_27_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_27_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_17)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_17)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][15]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_16);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            center.setTextSize(30);
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_28_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_28_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_28_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_28_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_16)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_16)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][14]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_15);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_29_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_29_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_29_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_29_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_15)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_15)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][13]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_14);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_30_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_30_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_30_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_30_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_14)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_14)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//
//        } else if (subway_tab[which][state] == subway_tab[1][12]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_13);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_31_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_31_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_31_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_31_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_31_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_31_6)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_13)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_13)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][11]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_12);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_32_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_32_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_32_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_32_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_32_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_32_6)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_12)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_12)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][10]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.VISIBLE);
//            hosun.setText("3호선");
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_11);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_33_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_11)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_11)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][9]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_10);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_34_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_34_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_34_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_34_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_34_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_34_6)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_10)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_10)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][8]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_9);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_35_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_35_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_35_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_35_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_35_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_35_6)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_9)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_9)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][7]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_8);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            right.setVisibility(View.VISIBLE);
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_9)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_9)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_10)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_11)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_11)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_12)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_12)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_13)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_13)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_14)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_14)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_15)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_15)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_17)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_36_17)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_8)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_8)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][6]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_7);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_37_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_37_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_37_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_37_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_7)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_7)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][5]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_6);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_9)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_9)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_10)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_11)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_11)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_12)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_12)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_13)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_38_13)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_6)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_6)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][4]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_5);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_39_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_39_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_39_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_39_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_39_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_39_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_39_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_39_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_9)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_39_9)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_11)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_39_11)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_5)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_5)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][3]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_4);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_40_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_40_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_40_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_40_4)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_4)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_4)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][2]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//
//            center.setTextColor(Color.parseColor("#B2E419"));
//            center.setText(R.string.second_3);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_41_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_41_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_41_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_41_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_41_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_41_7)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_3)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_3)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][1]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_2);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            right.setVisibility(View.VISIBLE);
//            left.setVisibility(View.VISIBLE);
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_42_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_42_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_42_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_42_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_42_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_42_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_42_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_42_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_9)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_42_9)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_42_10)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_12)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_42_12)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_2)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_2)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        } else if (subway_tab[which][state] == subway_tab[1][0]) {
//            station.setTextColor(Color.parseColor("#B2E419"));
//            hosun.setVisibility(View.GONE);
//            center.setTextColor(Color.parseColor("#B2E419"));
//
//            center.setText(R.string.second_1);
//            title = (String) center.getText();
//            station_start.setText("장산행");
//            station_end.setText("양산행");
//            List<ExpandableListAdapter.Item> data = new ArrayList<>();
//            ExpandableListAdapter.Item exit = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "출구정보");
//            exit.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item fainfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "시설정보");
//            fainfo.invisibleChildren = new ArrayList<>();
//            ExpandableListAdapter.Item etcinfo = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "주소 및 전화번호");
//            etcinfo.invisibleChildren = new ArrayList<>();
//
//            left.setVisibility(View.INVISIBLE);
//
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_1)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_2)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_3)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_4)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_5)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_6)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_7)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_8)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_9)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_9)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_10)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_10)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_11)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_11)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_12)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_12)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_13)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_13)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(1, ExpandableListAdapter.CHILD, getString(R.string.out_14)));
//            exit.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_out_43_14)));
//            fainfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_in_1)));
//            etcinfo.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, getString(R.string.second_call_1)));
//
//            data.add(exit);
//            data.add(fainfo);
//            data.add(etcinfo);
//            recyclerview.setAdapter(new ExpandableListAdapter(data));
//        }
//    }
//
//
//}
