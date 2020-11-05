package com.example.firebase_test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.example.firebase_test1.First.FourActivity;
import com.example.firebase_test1.First.OneActivity;
import com.example.firebase_test1.First.ThreeActivity;
import com.example.firebase_test1.First.TwoActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "~~~~~~~~~~~~~~~~~~~~";

    public static ArrayList<DatabaseReference> first_move = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_move = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_move = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_move = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_move = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_move = new ArrayList<>();

    public static ArrayList<DatabaseReference> first_one_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> first_one_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> first_one_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> first_one_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> first_two_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> first_two_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> first_two_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> first_two_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> first_three_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> first_three_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> first_three_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> first_three_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> first_four_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> first_four_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> first_four_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> first_four_to_fourth_list = new ArrayList<>();

    public static ArrayList<DatabaseReference> second_one_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_one_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_one_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_one_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_two_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_two_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_two_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_two_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_three_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_three_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_three_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_three_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_four_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_four_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_four_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> second_four_to_fourth_list = new ArrayList<>();

    public static ArrayList<DatabaseReference> third_one_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_one_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_one_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_one_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_two_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_two_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_two_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_two_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_three_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_three_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_three_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_three_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_four_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_four_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_four_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> third_four_to_fourth_list = new ArrayList<>();

    public static ArrayList<DatabaseReference> fourth_one_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_one_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_one_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_one_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_two_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_two_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_two_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_two_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_three_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_three_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_three_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_three_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_four_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_four_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_four_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> fourth_four_to_fourth_list = new ArrayList<>();

    public static ArrayList<DatabaseReference> dong_one_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_one_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_one_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_one_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_two_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_two_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_two_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_two_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_three_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_three_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_three_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_three_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_four_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_four_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_four_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> dong_four_to_fourth_list = new ArrayList<>();

    public static ArrayList<DatabaseReference> kim_one_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_one_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_one_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_one_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_two_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_two_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_two_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_two_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_three_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_three_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_three_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_three_to_fourth_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_four_to_first_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_four_to_second_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_four_to_third_list = new ArrayList<>();
    public static ArrayList<DatabaseReference> kim_four_to_fourth_list = new ArrayList<>();

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button first_one_button = findViewById(R.id.first_one);
        Button first_two_button = findViewById(R.id.first_two);
        Button first_three_button = findViewById(R.id.first_three);
        Button first_four_button = findViewById(R.id.first_four);
        Button second_one_button = findViewById(R.id.second_one);
        Button second_two_button = findViewById(R.id.second_two);
        Button second_three_button = findViewById(R.id.second_three);
        Button second_four_button = findViewById(R.id.second_four);
        Button third_one_button = findViewById(R.id.third_one);
        Button third_two_button = findViewById(R.id.third_two);
        Button third_three_button = findViewById(R.id.third_three);
        Button third_four_button = findViewById(R.id.third_four);
        Button fourth_one_button = findViewById(R.id.fourth_one);
        Button fourth_two_button = findViewById(R.id.fourth_two);
        Button fourth_three_button = findViewById(R.id.fourth_three);
        Button fourth_four_button = findViewById(R.id.fourth_four);
        Button dong_one_button = findViewById(R.id.dong_one);
        Button dong_two_button = findViewById(R.id.dong_two);
        Button dong_three_button = findViewById(R.id.dong_three);
        Button dong_four_button = findViewById(R.id.dong_four);
        Button kim_one_button = findViewById(R.id.kim_one);
        Button kim_two_button = findViewById(R.id.kim_two);
        Button kim_three_button = findViewById(R.id.kim_three);
        Button kim_four_button = findViewById(R.id.kim_four);
        first_one_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OneActivity.class);
                startActivity(intent);
            }
        });
        first_two_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TwoActivity.class);
                startActivity(intent);
            }
        });
        first_three_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ThreeActivity.class);
                startActivity(intent);
            }
        });
        first_four_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FourActivity.class);
                startActivity(intent);
            }
        });
        second_one_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Second.OneActivity.class);
                startActivity(intent);
            }
        });
        second_two_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Second.TwoActivity.class);
                startActivity(intent);
            }
        });
        second_three_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Second.ThreeActivity.class);
                startActivity(intent);
            }
        });
        second_four_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Second.FourActivity.class);
                startActivity(intent);
            }
        });
        third_one_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Third.OneActivity.class);
                startActivity(intent);
            }
        });
        third_two_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Third.TwoActivity.class);
                startActivity(intent);
            }
        });
        third_three_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Third.ThreeActivity.class);
                startActivity(intent);
            }
        });
        third_four_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Third.FourActivity.class);
                startActivity(intent);
            }
        });
        fourth_one_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Fourth.OneActivity.class);
                startActivity(intent);
            }
        });
        fourth_two_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Fourth.TwoActivity.class);
                startActivity(intent);
            }
        });
        fourth_three_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Fourth.ThreeActivity.class);
                startActivity(intent);
            }
        });
        fourth_four_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Fourth.FourActivity.class);
                startActivity(intent);
            }
        });
        dong_one_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Dong.OneActivity.class);
                startActivity(intent);
            }
        });
        dong_two_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Dong.TwoActivity.class);
                startActivity(intent);
            }
        });
        dong_three_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Dong.ThreeActivity.class);
                startActivity(intent);
            }
        });
        dong_four_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Dong.FourActivity.class);
                startActivity(intent);
            }
        });
        kim_one_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Kim.OneActivity.class);
                startActivity(intent);
            }
        });
        kim_two_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Kim.TwoActivity.class);
                startActivity(intent);
            }
        });
        kim_three_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Kim.ThreeActivity.class);
                startActivity(intent);
            }
        });
        kim_four_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.firebase_test1.Kim.FourActivity.class);
                startActivity(intent);
            }
        });


        final int[] _reverse_first = {0, 0, 1, 1};
        final int[] _current_station_first = {0, 0, 39, 39};

        final int[] _reverse_second = {0, 0, 1, 1};
        final int[] _current_station_second = {0, 0, 42, 42};

        final int[] _reverse_third = {0, 0, 1, 1};
        final int[] _current_station_third = {0, 0, 16, 16};

        final int[] _reverse_fourth = {0, 0, 1, 1};
        final int[] _current_station_fourth = {0, 0, 13, 13};

        final int[] _reverse_dong = {0, 0, 1, 1};
        final int[] _current_station_dong = {0, 0, 20, 20};

        final int[] _reverse_kim = {0, 0, 1, 1};
        final int[] _current_station_kim = {0, 0, 14, 14};


        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        DatabaseReference first = database.getReference("first"); // 1호선
        DatabaseReference first_one = first.child("one"); // 1호선 1호차
        DatabaseReference first_two = first.child("two"); // 1호선 2호차
        DatabaseReference first_three = first.child("three"); // 1호선 3호차
        DatabaseReference first_four = first.child("four"); // 1호선 4호차

        DatabaseReference second = database.getReference("second"); // 1호선
        DatabaseReference second_one = second.child("one"); // 1호선 1호차
        DatabaseReference second_two = second.child("two"); // 1호선 2호차
        DatabaseReference second_three = second.child("three"); // 1호선 3호차
        DatabaseReference second_four = second.child("four"); // 1호선 4호차

        DatabaseReference third = database.getReference("third"); // 1호선
        DatabaseReference third_one = third.child("one"); // 1호선 1호차
        DatabaseReference third_two = third.child("two"); // 1호선 2호차
        DatabaseReference third_three = third.child("three"); // 1호선 3호차
        DatabaseReference third_four = third.child("four"); // 1호선 4호차

        DatabaseReference fourth = database.getReference("fourth"); // 1호선
        DatabaseReference fourth_one = fourth.child("one"); // 1호선 1호차
        DatabaseReference fourth_two = fourth.child("two"); // 1호선 2호차
        DatabaseReference fourth_three = fourth.child("three"); // 1호선 3호차
        DatabaseReference fourth_four = fourth.child("four"); // 1호선 4호차

        DatabaseReference dong = database.getReference("dong"); // 1호선
        DatabaseReference dong_one = dong.child("one"); // 1호선 1호차
        DatabaseReference dong_two = dong.child("two"); // 1호선 2호차
        DatabaseReference dong_three = dong.child("three"); // 1호선 3호차
        DatabaseReference dong_four = dong.child("four"); // 1호선 4호차

        DatabaseReference kim = database.getReference("kim"); // 1호선
        DatabaseReference kim_one = kim.child("one"); // 1호선 1호차
        DatabaseReference kim_two = kim.child("two"); // 1호선 2호차
        DatabaseReference kim_three = kim.child("three"); // 1호선 3호차
        DatabaseReference kim_four = kim.child("four"); // 1호선 4호차

        first_move.add(first_one.child("reverse"));
        first_move.add(first_one.child("current_station"));
        first_move.get(0).setValue(_reverse_first[0]);
        first_move.get(1).setValue(_current_station_first[0]);
        first_move.add(first_two.child("reverse"));
        first_move.add(first_two.child("current_station"));
        first_move.get(2).setValue(_reverse_first[1]);
        first_move.get(3).setValue(_current_station_first[1]);
        first_move.add(first_three.child("reverse"));
        first_move.add(first_three.child("current_station"));
        first_move.get(4).setValue(_reverse_first[2]);
        first_move.get(5).setValue(_current_station_first[2]);
        first_move.add(first_four.child("reverse"));
        first_move.add(first_four.child("current_station"));
        first_move.get(6).setValue(_reverse_first[3]);
        first_move.get(7).setValue(_current_station_first[3]);

        second_move.add(second_one.child("reverse"));
        second_move.add(second_one.child("current_station"));
        second_move.get(0).setValue(_reverse_second[0]);
        second_move.get(1).setValue(_current_station_second[0]);
        second_move.add(second_two.child("reverse"));
        second_move.add(second_two.child("current_station"));
        second_move.get(2).setValue(_reverse_second[1]);
        second_move.get(3).setValue(_current_station_second[1]);
        second_move.add(second_three.child("reverse"));
        second_move.add(second_three.child("current_station"));
        second_move.get(4).setValue(_reverse_second[2]);
        second_move.get(5).setValue(_current_station_second[2]);
        second_move.add(second_four.child("reverse"));
        second_move.add(second_four.child("current_station"));
        second_move.get(6).setValue(_reverse_second[3]);
        second_move.get(7).setValue(_current_station_second[3]);

        third_move.add(third_one.child("reverse"));
        third_move.add(third_one.child("current_station"));
        third_move.get(0).setValue(_reverse_third[0]);
        third_move.get(1).setValue(_current_station_third[0]);
        third_move.add(third_two.child("reverse"));
        third_move.add(third_two.child("current_station"));
        third_move.get(2).setValue(_reverse_third[1]);
        third_move.get(3).setValue(_current_station_third[1]);
        third_move.add(third_three.child("reverse"));
        third_move.add(third_three.child("current_station"));
        third_move.get(4).setValue(_reverse_third[2]);
        third_move.get(5).setValue(_current_station_third[2]);
        third_move.add(third_four.child("reverse"));
        third_move.add(third_four.child("current_station"));
        third_move.get(6).setValue(_reverse_third[3]);
        third_move.get(7).setValue(_current_station_third[3]);

        fourth_move.add(fourth_one.child("reverse"));
        fourth_move.add(fourth_one.child("current_station"));
        fourth_move.get(0).setValue(_reverse_fourth[0]);
        fourth_move.get(1).setValue(_current_station_fourth[0]);
        fourth_move.add(fourth_two.child("reverse"));
        fourth_move.add(fourth_two.child("current_station"));
        fourth_move.get(2).setValue(_reverse_fourth[1]);
        fourth_move.get(3).setValue(_current_station_fourth[1]);
        fourth_move.add(fourth_three.child("reverse"));
        fourth_move.add(fourth_three.child("current_station"));
        fourth_move.get(4).setValue(_reverse_fourth[2]);
        fourth_move.get(5).setValue(_current_station_fourth[2]);
        fourth_move.add(fourth_four.child("reverse"));
        fourth_move.add(fourth_four.child("current_station"));
        fourth_move.get(6).setValue(_reverse_fourth[3]);
        fourth_move.get(7).setValue(_current_station_fourth[3]);

        dong_move.add(dong_one.child("reverse"));
        dong_move.add(dong_one.child("current_station"));
        dong_move.get(0).setValue(_reverse_dong[0]);
        dong_move.get(1).setValue(_current_station_dong[0]);
        dong_move.add(dong_two.child("reverse"));
        dong_move.add(dong_two.child("current_station"));
        dong_move.get(2).setValue(_reverse_dong[1]);
        dong_move.get(3).setValue(_current_station_dong[1]);
        dong_move.add(dong_three.child("reverse"));
        dong_move.add(dong_three.child("current_station"));
        dong_move.get(4).setValue(_reverse_dong[2]);
        dong_move.get(5).setValue(_current_station_dong[2]);
        dong_move.add(dong_four.child("reverse"));
        dong_move.add(dong_four.child("current_station"));
        dong_move.get(6).setValue(_reverse_dong[3]);
        dong_move.get(7).setValue(_current_station_dong[3]);

        kim_move.add(kim_one.child("reverse"));
        kim_move.add(kim_one.child("current_station"));
        kim_move.get(0).setValue(_reverse_kim[0]);
        kim_move.get(1).setValue(_current_station_kim[0]);
        kim_move.add(kim_two.child("reverse"));
        kim_move.add(kim_two.child("current_station"));
        kim_move.get(2).setValue(_reverse_kim[1]);
        kim_move.get(3).setValue(_current_station_kim[1]);
        kim_move.add(kim_three.child("reverse"));
        kim_move.add(kim_three.child("current_station"));
        kim_move.get(4).setValue(_reverse_kim[2]);
        kim_move.get(5).setValue(_current_station_kim[2]);
        kim_move.add(kim_four.child("reverse"));
        kim_move.add(kim_four.child("current_station"));
        kim_move.get(6).setValue(_reverse_kim[3]);
        kim_move.get(7).setValue(_current_station_kim[3]);

        DatabaseReference first_one_to_first = first_one.child("one_to_first"); // 1호차의 1번칸
        DatabaseReference first_one_to_second = first_one.child("one_to_second"); // 1호차의 2번칸
        DatabaseReference first_one_to_third = first_one.child("one_to_third"); // 1호차의 3번칸
        DatabaseReference first_one_to_fourth = first_one.child("one_to_fourth"); // 1호차의 4번칸
        DatabaseReference first_two_to_first = first_two.child("two_to_first"); // 2호차의 1번칸
        DatabaseReference first_two_to_second = first_two.child("two_to_second"); // 2호차의 2번칸
        DatabaseReference first_two_to_third = first_two.child("two_to_third"); // 2호차의 3번칸
        DatabaseReference first_two_to_fourth = first_two.child("two_to_fourth"); // 2호차의 4번칸
        DatabaseReference first_three_to_first = first_three.child("three_to_first"); // 3호차의 1번칸
        DatabaseReference first_three_to_second = first_three.child("three_to_second"); // 3호차의 2번칸
        DatabaseReference first_three_to_third = first_three.child("three_to_third"); // 3호차의 3번칸
        DatabaseReference first_three_to_fourth = first_three.child("three_to_fourth"); // 3호차의 4번칸
        DatabaseReference first_four_to_first = first_four.child("four_to_first"); // 4호차의 1번칸
        DatabaseReference first_four_to_second = first_four.child("four_to_second"); // 4호차의 2번칸
        DatabaseReference first_four_to_third = first_four.child("four_to_third"); // 4호차의 3번칸
        DatabaseReference first_four_to_fourth = first_four.child("four_to_fourth"); // 4호차의 4번칸
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_01"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_02"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_03"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_04"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_05"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_06"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_07"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_08"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_09"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_10"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_11"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_12"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_13"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_14"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_15"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_16"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_17"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_18"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_19"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_20"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_21"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_22"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_23"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_24"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_25"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_26"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_27"));
        first_one_to_first_list.add(first_one_to_first.child("one_to_first_list_28"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_01"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_02"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_03"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_04"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_05"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_06"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_07"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_08"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_09"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_10"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_11"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_12"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_13"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_14"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_15"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_16"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_17"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_18"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_19"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_20"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_21"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_22"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_23"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_24"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_25"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_26"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_27"));
        first_one_to_second_list.add(first_one_to_second.child("one_to_second_list_28"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_01"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_02"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_03"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_04"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_05"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_06"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_07"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_08"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_09"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_10"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_11"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_12"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_13"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_14"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_15"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_16"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_17"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_18"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_19"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_20"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_21"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_22"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_23"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_24"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_25"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_26"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_27"));
        first_one_to_third_list.add(first_one_to_third.child("one_to_third_list_28"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_01"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_02"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_03"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_04"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_05"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_06"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_07"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_08"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_09"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_10"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_11"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_12"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_13"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_14"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_15"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_16"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_17"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_18"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_19"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_20"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_21"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_22"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_23"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_24"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_25"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_26"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_27"));
        first_one_to_fourth_list.add(first_one_to_fourth.child("one_to_fourth_list_28"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_01"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_02"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_03"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_04"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_05"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_06"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_07"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_08"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_09"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_10"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_11"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_12"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_13"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_14"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_15"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_16"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_17"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_18"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_19"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_20"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_21"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_22"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_23"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_24"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_25"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_26"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_27"));
        first_two_to_first_list.add(first_two_to_first.child("two_to_first_list_28"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_01"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_02"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_03"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_04"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_05"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_06"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_07"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_08"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_09"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_10"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_11"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_12"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_13"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_14"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_15"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_16"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_17"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_18"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_19"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_20"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_21"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_22"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_23"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_24"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_25"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_26"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_27"));
        first_two_to_second_list.add(first_two_to_second.child("two_to_second_list_28"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_01"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_02"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_03"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_04"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_05"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_06"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_07"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_08"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_09"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_10"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_11"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_12"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_13"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_14"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_15"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_16"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_17"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_18"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_19"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_20"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_21"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_22"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_23"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_24"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_25"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_26"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_27"));
        first_two_to_third_list.add(first_two_to_third.child("two_to_third_list_28"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_01"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_02"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_03"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_04"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_05"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_06"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_07"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_08"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_09"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_10"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_11"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_12"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_13"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_14"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_15"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_16"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_17"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_18"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_19"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_20"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_21"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_22"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_23"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_24"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_25"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_26"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_27"));
        first_two_to_fourth_list.add(first_two_to_fourth.child("two_to_fourth_list_28"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_01"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_02"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_03"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_04"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_05"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_06"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_07"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_08"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_09"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_10"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_11"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_12"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_13"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_14"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_15"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_16"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_17"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_18"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_19"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_20"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_21"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_22"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_23"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_24"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_25"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_26"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_27"));
        first_three_to_first_list.add(first_three_to_first.child("three_to_first_list_28"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_01"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_02"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_03"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_04"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_05"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_06"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_07"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_08"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_09"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_10"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_11"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_12"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_13"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_14"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_15"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_16"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_17"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_18"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_19"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_20"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_21"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_22"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_23"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_24"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_25"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_26"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_27"));
        first_three_to_second_list.add(first_three_to_second.child("three_to_second_list_28"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_01"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_02"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_03"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_04"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_05"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_06"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_07"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_08"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_09"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_10"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_11"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_12"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_13"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_14"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_15"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_16"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_17"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_18"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_19"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_20"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_21"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_22"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_23"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_24"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_25"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_26"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_27"));
        first_three_to_third_list.add(first_three_to_third.child("three_to_third_list_28"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_01"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_02"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_03"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_04"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_05"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_06"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_07"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_08"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_09"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_10"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_11"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_12"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_13"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_14"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_15"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_16"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_17"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_18"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_19"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_20"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_21"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_22"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_23"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_24"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_25"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_26"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_27"));
        first_three_to_fourth_list.add(first_three_to_fourth.child("three_to_fourth_list_28"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_01"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_02"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_03"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_04"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_05"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_06"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_07"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_08"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_09"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_10"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_11"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_12"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_13"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_14"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_15"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_16"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_17"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_18"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_19"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_20"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_21"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_22"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_23"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_24"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_25"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_26"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_27"));
        first_four_to_first_list.add(first_four_to_first.child("four_to_first_list_28"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_01"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_02"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_03"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_04"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_05"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_06"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_07"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_08"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_09"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_10"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_11"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_12"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_13"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_14"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_15"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_16"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_17"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_18"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_19"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_20"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_21"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_22"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_23"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_24"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_25"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_26"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_27"));
        first_four_to_second_list.add(first_four_to_second.child("four_to_second_list_28"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_01"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_02"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_03"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_04"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_05"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_06"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_07"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_08"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_09"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_10"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_11"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_12"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_13"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_14"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_15"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_16"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_17"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_18"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_19"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_20"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_21"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_22"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_23"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_24"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_25"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_26"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_27"));
        first_four_to_third_list.add(first_four_to_third.child("four_to_third_list_28"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_01"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_02"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_03"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_04"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_05"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_06"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_07"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_08"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_09"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_10"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_11"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_12"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_13"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_14"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_15"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_16"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_17"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_18"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_19"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_20"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_21"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_22"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_23"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_24"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_25"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_26"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_27"));
        first_four_to_fourth_list.add(first_four_to_fourth.child("four_to_fourth_list_28"));

        DatabaseReference second_one_to_first = second_one.child("one_to_first"); // 1호차의 1번칸
        DatabaseReference second_one_to_second = second_one.child("one_to_second"); // 1호차의 2번칸
        DatabaseReference second_one_to_third = second_one.child("one_to_third"); // 1호차의 3번칸
        DatabaseReference second_one_to_fourth = second_one.child("one_to_fourth"); // 1호차의 4번칸
        DatabaseReference second_two_to_first = second_two.child("two_to_first"); // 2호차의 1번칸
        DatabaseReference second_two_to_second = second_two.child("two_to_second"); // 2호차의 2번칸
        DatabaseReference second_two_to_third = second_two.child("two_to_third"); // 2호차의 3번칸
        DatabaseReference second_two_to_fourth = second_two.child("two_to_fourth"); // 2호차의 4번칸
        DatabaseReference second_three_to_first = second_three.child("three_to_first"); // 3호차의 1번칸
        DatabaseReference second_three_to_second = second_three.child("three_to_second"); // 3호차의 2번칸
        DatabaseReference second_three_to_third = second_three.child("three_to_third"); // 3호차의 3번칸
        DatabaseReference second_three_to_fourth = second_three.child("three_to_fourth"); // 3호차의 4번칸
        DatabaseReference second_four_to_first = second_four.child("four_to_first"); // 4호차의 1번칸
        DatabaseReference second_four_to_second = second_four.child("four_to_second"); // 4호차의 2번칸
        DatabaseReference second_four_to_third = second_four.child("four_to_third"); // 4호차의 3번칸
        DatabaseReference second_four_to_fourth = second_four.child("four_to_fourth"); // 4호차의 4번칸
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_01"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_02"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_03"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_04"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_05"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_06"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_07"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_08"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_09"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_10"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_11"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_12"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_13"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_14"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_15"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_16"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_17"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_18"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_19"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_20"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_21"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_22"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_23"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_24"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_25"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_26"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_27"));
        second_one_to_first_list.add(second_one_to_first.child("one_to_first_list_28"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_01"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_02"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_03"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_04"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_05"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_06"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_07"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_08"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_09"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_10"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_11"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_12"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_13"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_14"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_15"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_16"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_17"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_18"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_19"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_20"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_21"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_22"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_23"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_24"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_25"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_26"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_27"));
        second_one_to_second_list.add(second_one_to_second.child("one_to_second_list_28"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_01"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_02"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_03"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_04"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_05"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_06"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_07"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_08"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_09"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_10"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_11"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_12"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_13"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_14"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_15"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_16"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_17"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_18"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_19"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_20"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_21"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_22"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_23"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_24"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_25"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_26"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_27"));
        second_one_to_third_list.add(second_one_to_third.child("one_to_third_list_28"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_01"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_02"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_03"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_04"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_05"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_06"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_07"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_08"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_09"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_10"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_11"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_12"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_13"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_14"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_15"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_16"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_17"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_18"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_19"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_20"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_21"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_22"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_23"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_24"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_25"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_26"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_27"));
        second_one_to_fourth_list.add(second_one_to_fourth.child("one_to_fourth_list_28"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_01"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_02"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_03"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_04"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_05"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_06"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_07"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_08"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_09"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_10"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_11"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_12"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_13"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_14"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_15"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_16"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_17"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_18"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_19"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_20"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_21"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_22"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_23"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_24"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_25"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_26"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_27"));
        second_two_to_first_list.add(second_two_to_first.child("two_to_first_list_28"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_01"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_02"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_03"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_04"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_05"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_06"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_07"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_08"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_09"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_10"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_11"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_12"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_13"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_14"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_15"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_16"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_17"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_18"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_19"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_20"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_21"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_22"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_23"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_24"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_25"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_26"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_27"));
        second_two_to_second_list.add(second_two_to_second.child("two_to_second_list_28"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_01"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_02"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_03"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_04"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_05"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_06"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_07"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_08"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_09"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_10"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_11"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_12"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_13"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_14"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_15"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_16"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_17"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_18"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_19"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_20"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_21"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_22"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_23"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_24"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_25"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_26"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_27"));
        second_two_to_third_list.add(second_two_to_third.child("two_to_third_list_28"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_01"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_02"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_03"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_04"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_05"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_06"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_07"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_08"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_09"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_10"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_11"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_12"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_13"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_14"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_15"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_16"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_17"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_18"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_19"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_20"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_21"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_22"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_23"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_24"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_25"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_26"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_27"));
        second_two_to_fourth_list.add(second_two_to_fourth.child("two_to_fourth_list_28"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_01"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_02"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_03"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_04"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_05"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_06"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_07"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_08"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_09"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_10"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_11"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_12"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_13"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_14"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_15"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_16"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_17"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_18"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_19"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_20"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_21"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_22"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_23"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_24"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_25"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_26"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_27"));
        second_three_to_first_list.add(second_three_to_first.child("three_to_first_list_28"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_01"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_02"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_03"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_04"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_05"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_06"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_07"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_08"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_09"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_10"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_11"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_12"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_13"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_14"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_15"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_16"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_17"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_18"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_19"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_20"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_21"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_22"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_23"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_24"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_25"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_26"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_27"));
        second_three_to_second_list.add(second_three_to_second.child("three_to_second_list_28"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_01"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_02"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_03"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_04"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_05"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_06"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_07"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_08"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_09"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_10"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_11"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_12"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_13"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_14"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_15"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_16"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_17"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_18"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_19"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_20"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_21"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_22"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_23"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_24"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_25"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_26"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_27"));
        second_three_to_third_list.add(second_three_to_third.child("three_to_third_list_28"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_01"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_02"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_03"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_04"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_05"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_06"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_07"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_08"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_09"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_10"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_11"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_12"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_13"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_14"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_15"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_16"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_17"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_18"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_19"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_20"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_21"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_22"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_23"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_24"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_25"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_26"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_27"));
        second_three_to_fourth_list.add(second_three_to_fourth.child("three_to_fourth_list_28"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_01"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_02"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_03"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_04"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_05"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_06"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_07"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_08"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_09"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_10"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_11"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_12"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_13"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_14"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_15"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_16"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_17"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_18"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_19"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_20"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_21"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_22"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_23"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_24"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_25"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_26"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_27"));
        second_four_to_first_list.add(second_four_to_first.child("four_to_first_list_28"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_01"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_02"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_03"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_04"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_05"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_06"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_07"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_08"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_09"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_10"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_11"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_12"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_13"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_14"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_15"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_16"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_17"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_18"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_19"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_20"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_21"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_22"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_23"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_24"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_25"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_26"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_27"));
        second_four_to_second_list.add(second_four_to_second.child("four_to_second_list_28"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_01"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_02"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_03"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_04"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_05"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_06"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_07"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_08"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_09"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_10"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_11"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_12"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_13"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_14"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_15"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_16"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_17"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_18"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_19"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_20"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_21"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_22"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_23"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_24"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_25"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_26"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_27"));
        second_four_to_third_list.add(second_four_to_third.child("four_to_third_list_28"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_01"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_02"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_03"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_04"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_05"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_06"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_07"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_08"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_09"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_10"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_11"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_12"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_13"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_14"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_15"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_16"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_17"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_18"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_19"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_20"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_21"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_22"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_23"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_24"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_25"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_26"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_27"));
        second_four_to_fourth_list.add(second_four_to_fourth.child("four_to_fourth_list_28"));

        DatabaseReference third_one_to_first = third_one.child("one_to_first"); // 1호차의 1번칸
        DatabaseReference third_one_to_second = third_one.child("one_to_second"); // 1호차의 2번칸
        DatabaseReference third_one_to_third = third_one.child("one_to_third"); // 1호차의 3번칸
        DatabaseReference third_one_to_fourth = third_one.child("one_to_fourth"); // 1호차의 4번칸
        DatabaseReference third_two_to_first = third_two.child("two_to_first"); // 2호차의 1번칸
        DatabaseReference third_two_to_second = third_two.child("two_to_second"); // 2호차의 2번칸
        DatabaseReference third_two_to_third = third_two.child("two_to_third"); // 2호차의 3번칸
        DatabaseReference third_two_to_fourth = third_two.child("two_to_fourth"); // 2호차의 4번칸
        DatabaseReference third_three_to_first = third_three.child("three_to_first"); // 3호차의 1번칸
        DatabaseReference third_three_to_second = third_three.child("three_to_second"); // 3호차의 2번칸
        DatabaseReference third_three_to_third = third_three.child("three_to_third"); // 3호차의 3번칸
        DatabaseReference third_three_to_fourth = third_three.child("three_to_fourth"); // 3호차의 4번칸
        DatabaseReference third_four_to_first = third_four.child("four_to_first"); // 4호차의 1번칸
        DatabaseReference third_four_to_second = third_four.child("four_to_second"); // 4호차의 2번칸
        DatabaseReference third_four_to_third = third_four.child("four_to_third"); // 4호차의 3번칸
        DatabaseReference third_four_to_fourth = third_four.child("four_to_fourth"); // 4호차의 4번칸
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_01"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_02"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_03"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_04"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_05"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_06"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_07"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_08"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_09"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_10"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_11"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_12"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_13"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_14"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_15"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_16"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_17"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_18"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_19"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_20"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_21"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_22"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_23"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_24"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_25"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_26"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_27"));
        third_one_to_first_list.add(third_one_to_first.child("one_to_first_list_28"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_01"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_02"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_03"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_04"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_05"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_06"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_07"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_08"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_09"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_10"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_11"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_12"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_13"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_14"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_15"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_16"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_17"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_18"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_19"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_20"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_21"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_22"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_23"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_24"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_25"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_26"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_27"));
        third_one_to_second_list.add(third_one_to_second.child("one_to_second_list_28"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_01"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_02"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_03"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_04"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_05"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_06"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_07"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_08"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_09"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_10"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_11"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_12"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_13"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_14"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_15"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_16"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_17"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_18"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_19"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_20"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_21"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_22"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_23"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_24"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_25"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_26"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_27"));
        third_one_to_third_list.add(third_one_to_third.child("one_to_third_list_28"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_01"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_02"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_03"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_04"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_05"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_06"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_07"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_08"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_09"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_10"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_11"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_12"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_13"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_14"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_15"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_16"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_17"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_18"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_19"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_20"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_21"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_22"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_23"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_24"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_25"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_26"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_27"));
        third_one_to_fourth_list.add(third_one_to_fourth.child("one_to_fourth_list_28"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_01"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_02"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_03"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_04"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_05"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_06"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_07"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_08"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_09"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_10"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_11"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_12"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_13"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_14"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_15"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_16"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_17"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_18"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_19"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_20"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_21"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_22"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_23"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_24"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_25"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_26"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_27"));
        third_two_to_first_list.add(third_two_to_first.child("two_to_first_list_28"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_01"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_02"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_03"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_04"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_05"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_06"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_07"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_08"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_09"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_10"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_11"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_12"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_13"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_14"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_15"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_16"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_17"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_18"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_19"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_20"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_21"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_22"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_23"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_24"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_25"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_26"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_27"));
        third_two_to_second_list.add(third_two_to_second.child("two_to_second_list_28"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_01"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_02"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_03"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_04"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_05"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_06"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_07"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_08"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_09"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_10"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_11"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_12"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_13"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_14"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_15"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_16"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_17"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_18"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_19"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_20"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_21"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_22"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_23"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_24"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_25"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_26"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_27"));
        third_two_to_third_list.add(third_two_to_third.child("two_to_third_list_28"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_01"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_02"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_03"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_04"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_05"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_06"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_07"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_08"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_09"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_10"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_11"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_12"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_13"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_14"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_15"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_16"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_17"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_18"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_19"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_20"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_21"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_22"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_23"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_24"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_25"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_26"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_27"));
        third_two_to_fourth_list.add(third_two_to_fourth.child("two_to_fourth_list_28"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_01"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_02"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_03"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_04"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_05"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_06"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_07"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_08"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_09"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_10"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_11"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_12"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_13"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_14"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_15"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_16"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_17"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_18"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_19"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_20"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_21"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_22"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_23"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_24"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_25"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_26"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_27"));
        third_three_to_first_list.add(third_three_to_first.child("three_to_first_list_28"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_01"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_02"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_03"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_04"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_05"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_06"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_07"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_08"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_09"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_10"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_11"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_12"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_13"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_14"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_15"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_16"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_17"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_18"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_19"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_20"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_21"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_22"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_23"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_24"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_25"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_26"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_27"));
        third_three_to_second_list.add(third_three_to_second.child("three_to_second_list_28"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_01"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_02"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_03"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_04"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_05"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_06"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_07"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_08"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_09"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_10"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_11"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_12"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_13"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_14"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_15"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_16"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_17"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_18"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_19"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_20"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_21"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_22"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_23"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_24"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_25"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_26"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_27"));
        third_three_to_third_list.add(third_three_to_third.child("three_to_third_list_28"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_01"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_02"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_03"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_04"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_05"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_06"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_07"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_08"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_09"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_10"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_11"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_12"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_13"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_14"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_15"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_16"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_17"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_18"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_19"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_20"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_21"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_22"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_23"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_24"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_25"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_26"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_27"));
        third_three_to_fourth_list.add(third_three_to_fourth.child("three_to_fourth_list_28"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_01"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_02"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_03"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_04"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_05"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_06"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_07"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_08"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_09"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_10"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_11"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_12"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_13"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_14"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_15"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_16"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_17"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_18"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_19"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_20"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_21"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_22"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_23"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_24"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_25"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_26"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_27"));
        third_four_to_first_list.add(third_four_to_first.child("four_to_first_list_28"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_01"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_02"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_03"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_04"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_05"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_06"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_07"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_08"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_09"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_10"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_11"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_12"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_13"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_14"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_15"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_16"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_17"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_18"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_19"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_20"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_21"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_22"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_23"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_24"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_25"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_26"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_27"));
        third_four_to_second_list.add(third_four_to_second.child("four_to_second_list_28"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_01"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_02"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_03"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_04"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_05"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_06"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_07"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_08"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_09"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_10"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_11"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_12"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_13"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_14"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_15"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_16"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_17"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_18"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_19"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_20"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_21"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_22"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_23"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_24"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_25"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_26"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_27"));
        third_four_to_third_list.add(third_four_to_third.child("four_to_third_list_28"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_01"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_02"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_03"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_04"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_05"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_06"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_07"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_08"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_09"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_10"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_11"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_12"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_13"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_14"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_15"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_16"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_17"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_18"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_19"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_20"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_21"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_22"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_23"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_24"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_25"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_26"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_27"));
        third_four_to_fourth_list.add(third_four_to_fourth.child("four_to_fourth_list_28"));

        DatabaseReference fourth_one_to_first = fourth_one.child("one_to_first"); // 1호차의 1번칸
        DatabaseReference fourth_one_to_second = fourth_one.child("one_to_second"); // 1호차의 2번칸
        DatabaseReference fourth_one_to_third = fourth_one.child("one_to_third"); // 1호차의 3번칸
        DatabaseReference fourth_one_to_fourth = fourth_one.child("one_to_fourth"); // 1호차의 4번칸
        DatabaseReference fourth_two_to_first = fourth_two.child("two_to_first"); // 2호차의 1번칸
        DatabaseReference fourth_two_to_second = fourth_two.child("two_to_second"); // 2호차의 2번칸
        DatabaseReference fourth_two_to_third = fourth_two.child("two_to_third"); // 2호차의 3번칸
        DatabaseReference fourth_two_to_fourth = fourth_two.child("two_to_fourth"); // 2호차의 4번칸
        DatabaseReference fourth_three_to_first = fourth_three.child("three_to_first"); // 3호차의 1번칸
        DatabaseReference fourth_three_to_second = fourth_three.child("three_to_second"); // 3호차의 2번칸
        DatabaseReference fourth_three_to_third = fourth_three.child("three_to_third"); // 3호차의 3번칸
        DatabaseReference fourth_three_to_fourth = fourth_three.child("three_to_fourth"); // 3호차의 4번칸
        DatabaseReference fourth_four_to_first = fourth_four.child("four_to_first"); // 4호차의 1번칸
        DatabaseReference fourth_four_to_second = fourth_four.child("four_to_second"); // 4호차의 2번칸
        DatabaseReference fourth_four_to_third = fourth_four.child("four_to_third"); // 4호차의 3번칸
        DatabaseReference fourth_four_to_fourth = fourth_four.child("four_to_fourth"); // 4호차의 4번칸
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_01"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_02"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_03"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_04"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_05"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_06"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_07"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_08"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_09"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_10"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_11"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_12"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_13"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_14"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_15"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_16"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_17"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_18"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_19"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_20"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_21"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_22"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_23"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_24"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_25"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_26"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_27"));
        fourth_one_to_first_list.add(fourth_one_to_first.child("one_to_first_list_28"));

        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_01"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_02"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_03"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_04"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_05"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_06"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_07"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_08"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_09"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_10"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_11"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_12"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_13"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_14"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_15"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_16"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_17"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_18"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_19"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_20"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_21"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_22"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_23"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_24"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_25"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_26"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_27"));
        fourth_one_to_second_list.add(fourth_one_to_second.child("one_to_second_list_28"));

        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_01"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_02"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_03"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_04"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_05"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_06"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_07"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_08"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_09"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_10"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_11"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_12"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_13"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_14"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_15"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_16"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_17"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_18"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_19"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_20"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_21"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_22"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_23"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_24"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_25"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_26"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_27"));
        fourth_one_to_third_list.add(fourth_one_to_third.child("one_to_third_list_28"));

        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_01"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_02"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_03"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_04"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_05"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_06"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_07"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_08"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_09"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_10"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_11"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_12"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_13"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_14"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_15"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_16"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_17"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_18"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_19"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_20"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_21"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_22"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_23"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_24"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_25"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_26"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_27"));
        fourth_one_to_fourth_list.add(fourth_one_to_fourth.child("one_to_fourth_list_28"));


        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_01"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_02"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_03"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_04"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_05"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_06"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_07"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_08"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_09"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_10"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_11"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_12"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_13"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_14"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_15"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_16"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_17"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_18"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_19"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_20"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_21"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_22"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_23"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_24"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_25"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_26"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_27"));
        fourth_two_to_first_list.add(fourth_two_to_first.child("two_to_first_list_28"));

        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_01"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_02"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_03"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_04"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_05"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_06"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_07"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_08"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_09"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_10"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_11"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_12"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_13"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_14"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_15"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_16"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_17"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_18"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_19"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_20"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_21"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_22"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_23"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_24"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_25"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_26"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_27"));
        fourth_two_to_second_list.add(fourth_two_to_second.child("two_to_second_list_28"));

        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_01"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_02"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_03"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_04"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_05"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_06"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_07"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_08"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_09"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_10"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_11"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_12"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_13"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_14"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_15"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_16"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_17"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_18"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_19"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_20"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_21"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_22"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_23"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_24"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_25"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_26"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_27"));
        fourth_two_to_third_list.add(fourth_two_to_third.child("two_to_third_list_28"));

        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_01"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_02"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_03"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_04"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_05"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_06"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_07"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_08"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_09"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_10"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_11"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_12"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_13"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_14"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_15"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_16"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_17"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_18"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_19"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_20"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_21"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_22"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_23"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_24"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_25"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_26"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_27"));
        fourth_two_to_fourth_list.add(fourth_two_to_fourth.child("two_to_fourth_list_28"));


        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_01"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_02"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_03"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_04"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_05"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_06"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_07"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_08"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_09"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_10"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_11"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_12"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_13"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_14"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_15"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_16"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_17"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_18"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_19"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_20"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_21"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_22"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_23"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_24"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_25"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_26"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_27"));
        fourth_three_to_first_list.add(fourth_three_to_first.child("three_to_first_list_28"));

        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_01"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_02"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_03"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_04"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_05"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_06"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_07"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_08"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_09"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_10"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_11"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_12"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_13"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_14"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_15"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_16"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_17"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_18"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_19"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_20"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_21"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_22"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_23"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_24"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_25"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_26"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_27"));
        fourth_three_to_second_list.add(fourth_three_to_second.child("three_to_second_list_28"));

        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_01"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_02"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_03"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_04"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_05"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_06"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_07"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_08"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_09"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_10"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_11"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_12"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_13"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_14"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_15"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_16"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_17"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_18"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_19"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_20"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_21"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_22"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_23"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_24"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_25"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_26"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_27"));
        fourth_three_to_third_list.add(fourth_three_to_third.child("three_to_third_list_28"));

        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_01"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_02"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_03"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_04"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_05"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_06"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_07"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_08"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_09"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_10"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_11"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_12"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_13"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_14"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_15"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_16"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_17"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_18"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_19"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_20"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_21"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_22"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_23"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_24"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_25"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_26"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_27"));
        fourth_three_to_fourth_list.add(fourth_three_to_fourth.child("three_to_fourth_list_28"));


        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_01"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_02"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_03"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_04"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_05"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_06"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_07"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_08"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_09"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_10"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_11"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_12"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_13"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_14"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_15"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_16"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_17"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_18"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_19"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_20"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_21"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_22"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_23"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_24"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_25"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_26"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_27"));
        fourth_four_to_first_list.add(fourth_four_to_first.child("four_to_first_list_28"));

        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_01"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_02"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_03"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_04"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_05"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_06"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_07"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_08"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_09"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_10"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_11"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_12"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_13"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_14"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_15"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_16"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_17"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_18"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_19"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_20"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_21"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_22"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_23"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_24"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_25"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_26"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_27"));
        fourth_four_to_second_list.add(fourth_four_to_second.child("four_to_second_list_28"));

        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_01"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_02"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_03"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_04"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_05"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_06"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_07"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_08"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_09"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_10"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_11"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_12"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_13"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_14"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_15"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_16"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_17"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_18"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_19"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_20"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_21"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_22"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_23"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_24"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_25"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_26"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_27"));
        fourth_four_to_third_list.add(fourth_four_to_third.child("four_to_third_list_28"));

        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_01"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_02"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_03"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_04"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_05"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_06"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_07"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_08"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_09"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_10"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_11"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_12"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_13"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_14"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_15"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_16"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_17"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_18"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_19"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_20"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_21"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_22"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_23"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_24"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_25"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_26"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_27"));
        fourth_four_to_fourth_list.add(fourth_four_to_fourth.child("four_to_fourth_list_28"));


        DatabaseReference dong_one_to_first = dong_one.child("one_to_first"); // 1호차의 1번칸
        DatabaseReference dong_one_to_second = dong_one.child("one_to_second"); // 1호차의 2번칸
        DatabaseReference dong_one_to_third = dong_one.child("one_to_third"); // 1호차의 3번칸
        DatabaseReference dong_one_to_fourth = dong_one.child("one_to_fourth"); // 1호차의 4번칸

        DatabaseReference dong_two_to_first = dong_two.child("two_to_first"); // 2호차의 1번칸
        DatabaseReference dong_two_to_second = dong_two.child("two_to_second"); // 2호차의 2번칸
        DatabaseReference dong_two_to_third = dong_two.child("two_to_third"); // 2호차의 3번칸
        DatabaseReference dong_two_to_fourth = dong_two.child("two_to_fourth"); // 2호차의 4번칸

        DatabaseReference dong_three_to_first = dong_three.child("three_to_first"); // 3호차의 1번칸
        DatabaseReference dong_three_to_second = dong_three.child("three_to_second"); // 3호차의 2번칸
        DatabaseReference dong_three_to_third = dong_three.child("three_to_third"); // 3호차의 3번칸
        DatabaseReference dong_three_to_fourth = dong_three.child("three_to_fourth"); // 3호차의 4번칸

        DatabaseReference dong_four_to_first = dong_four.child("four_to_first"); // 4호차의 1번칸
        DatabaseReference dong_four_to_second = dong_four.child("four_to_second"); // 4호차의 2번칸
        DatabaseReference dong_four_to_third = dong_four.child("four_to_third"); // 4호차의 3번칸
        DatabaseReference dong_four_to_fourth = dong_four.child("four_to_fourth"); // 4호차의 4번칸

        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_01"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_02"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_03"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_04"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_05"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_06"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_07"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_08"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_09"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_10"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_11"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_12"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_13"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_14"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_15"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_16"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_17"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_18"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_19"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_20"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_21"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_22"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_23"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_24"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_25"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_26"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_27"));
        dong_one_to_first_list.add(dong_one_to_first.child("one_to_first_list_28"));

        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_01"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_02"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_03"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_04"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_05"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_06"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_07"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_08"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_09"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_10"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_11"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_12"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_13"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_14"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_15"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_16"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_17"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_18"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_19"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_20"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_21"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_22"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_23"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_24"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_25"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_26"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_27"));
        dong_one_to_second_list.add(dong_one_to_second.child("one_to_second_list_28"));

        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_01"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_02"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_03"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_04"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_05"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_06"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_07"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_08"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_09"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_10"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_11"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_12"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_13"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_14"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_15"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_16"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_17"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_18"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_19"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_20"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_21"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_22"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_23"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_24"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_25"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_26"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_27"));
        dong_one_to_third_list.add(dong_one_to_third.child("one_to_third_list_28"));

        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_01"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_02"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_03"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_04"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_05"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_06"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_07"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_08"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_09"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_10"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_11"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_12"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_13"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_14"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_15"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_16"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_17"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_18"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_19"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_20"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_21"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_22"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_23"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_24"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_25"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_26"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_27"));
        dong_one_to_fourth_list.add(dong_one_to_fourth.child("one_to_fourth_list_28"));


        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_01"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_02"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_03"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_04"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_05"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_06"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_07"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_08"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_09"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_10"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_11"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_12"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_13"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_14"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_15"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_16"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_17"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_18"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_19"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_20"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_21"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_22"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_23"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_24"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_25"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_26"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_27"));
        dong_two_to_first_list.add(dong_two_to_first.child("two_to_first_list_28"));

        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_01"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_02"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_03"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_04"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_05"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_06"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_07"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_08"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_09"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_10"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_11"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_12"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_13"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_14"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_15"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_16"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_17"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_18"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_19"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_20"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_21"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_22"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_23"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_24"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_25"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_26"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_27"));
        dong_two_to_second_list.add(dong_two_to_second.child("two_to_second_list_28"));

        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_01"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_02"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_03"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_04"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_05"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_06"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_07"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_08"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_09"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_10"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_11"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_12"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_13"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_14"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_15"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_16"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_17"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_18"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_19"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_20"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_21"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_22"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_23"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_24"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_25"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_26"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_27"));
        dong_two_to_third_list.add(dong_two_to_third.child("two_to_third_list_28"));

        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_01"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_02"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_03"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_04"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_05"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_06"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_07"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_08"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_09"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_10"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_11"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_12"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_13"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_14"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_15"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_16"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_17"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_18"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_19"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_20"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_21"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_22"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_23"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_24"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_25"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_26"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_27"));
        dong_two_to_fourth_list.add(dong_two_to_fourth.child("two_to_fourth_list_28"));


        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_01"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_02"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_03"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_04"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_05"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_06"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_07"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_08"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_09"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_10"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_11"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_12"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_13"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_14"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_15"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_16"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_17"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_18"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_19"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_20"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_21"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_22"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_23"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_24"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_25"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_26"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_27"));
        dong_three_to_first_list.add(dong_three_to_first.child("three_to_first_list_28"));

        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_01"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_02"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_03"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_04"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_05"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_06"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_07"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_08"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_09"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_10"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_11"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_12"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_13"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_14"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_15"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_16"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_17"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_18"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_19"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_20"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_21"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_22"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_23"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_24"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_25"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_26"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_27"));
        dong_three_to_second_list.add(dong_three_to_second.child("three_to_second_list_28"));

        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_01"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_02"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_03"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_04"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_05"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_06"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_07"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_08"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_09"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_10"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_11"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_12"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_13"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_14"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_15"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_16"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_17"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_18"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_19"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_20"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_21"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_22"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_23"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_24"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_25"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_26"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_27"));
        dong_three_to_third_list.add(dong_three_to_third.child("three_to_third_list_28"));

        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_01"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_02"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_03"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_04"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_05"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_06"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_07"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_08"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_09"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_10"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_11"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_12"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_13"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_14"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_15"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_16"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_17"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_18"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_19"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_20"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_21"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_22"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_23"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_24"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_25"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_26"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_27"));
        dong_three_to_fourth_list.add(dong_three_to_fourth.child("three_to_fourth_list_28"));


        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_01"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_02"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_03"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_04"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_05"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_06"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_07"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_08"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_09"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_10"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_11"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_12"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_13"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_14"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_15"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_16"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_17"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_18"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_19"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_20"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_21"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_22"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_23"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_24"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_25"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_26"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_27"));
        dong_four_to_first_list.add(dong_four_to_first.child("four_to_first_list_28"));

        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_01"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_02"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_03"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_04"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_05"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_06"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_07"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_08"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_09"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_10"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_11"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_12"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_13"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_14"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_15"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_16"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_17"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_18"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_19"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_20"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_21"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_22"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_23"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_24"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_25"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_26"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_27"));
        dong_four_to_second_list.add(dong_four_to_second.child("four_to_second_list_28"));

        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_01"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_02"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_03"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_04"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_05"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_06"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_07"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_08"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_09"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_10"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_11"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_12"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_13"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_14"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_15"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_16"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_17"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_18"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_19"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_20"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_21"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_22"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_23"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_24"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_25"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_26"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_27"));
        dong_four_to_third_list.add(dong_four_to_third.child("four_to_third_list_28"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_01"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_02"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_03"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_04"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_05"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_06"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_07"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_08"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_09"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_10"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_11"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_12"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_13"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_14"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_15"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_16"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_17"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_18"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_19"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_20"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_21"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_22"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_23"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_24"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_25"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_26"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_27"));
        dong_four_to_fourth_list.add(dong_four_to_fourth.child("four_to_fourth_list_28"));

        DatabaseReference kim_one_to_first = kim_one.child("one_to_first"); // 1호차의 1번칸
        DatabaseReference kim_one_to_second = kim_one.child("one_to_second"); // 1호차의 2번칸
        DatabaseReference kim_one_to_third = kim_one.child("one_to_third"); // 1호차의 3번칸
        DatabaseReference kim_one_to_fourth = kim_one.child("one_to_fourth"); // 1호차의 4번칸
        DatabaseReference kim_two_to_first = kim_two.child("two_to_first"); // 2호차의 1번칸
        DatabaseReference kim_two_to_second = kim_two.child("two_to_second"); // 2호차의 2번칸
        DatabaseReference kim_two_to_third = kim_two.child("two_to_third"); // 2호차의 3번칸
        DatabaseReference kim_two_to_fourth = kim_two.child("two_to_fourth"); // 2호차의 4번칸
        DatabaseReference kim_three_to_first = kim_three.child("three_to_first"); // 3호차의 1번칸
        DatabaseReference kim_three_to_second = kim_three.child("three_to_second"); // 3호차의 2번칸
        DatabaseReference kim_three_to_third = kim_three.child("three_to_third"); // 3호차의 3번칸
        DatabaseReference kim_three_to_fourth = kim_three.child("three_to_fourth"); // 3호차의 4번칸
        DatabaseReference kim_four_to_first = kim_four.child("four_to_first"); // 4호차의 1번칸
        DatabaseReference kim_four_to_second = kim_four.child("four_to_second"); // 4호차의 2번칸
        DatabaseReference kim_four_to_third = kim_four.child("four_to_third"); // 4호차의 3번칸
        DatabaseReference kim_four_to_fourth = kim_four.child("four_to_fourth"); // 4호차의 4번칸
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_01"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_02"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_03"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_04"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_05"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_06"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_07"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_08"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_09"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_10"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_11"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_12"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_13"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_14"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_15"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_16"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_17"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_18"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_19"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_20"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_21"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_22"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_23"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_24"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_25"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_26"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_27"));
        kim_one_to_first_list.add(kim_one_to_first.child("one_to_first_list_28"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_01"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_02"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_03"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_04"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_05"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_06"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_07"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_08"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_09"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_10"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_11"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_12"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_13"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_14"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_15"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_16"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_17"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_18"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_19"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_20"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_21"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_22"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_23"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_24"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_25"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_26"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_27"));
        kim_one_to_second_list.add(kim_one_to_second.child("one_to_second_list_28"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_01"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_02"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_03"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_04"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_05"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_06"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_07"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_08"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_09"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_10"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_11"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_12"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_13"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_14"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_15"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_16"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_17"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_18"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_19"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_20"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_21"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_22"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_23"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_24"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_25"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_26"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_27"));
        kim_one_to_third_list.add(kim_one_to_third.child("one_to_third_list_28"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_01"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_02"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_03"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_04"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_05"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_06"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_07"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_08"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_09"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_10"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_11"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_12"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_13"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_14"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_15"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_16"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_17"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_18"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_19"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_20"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_21"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_22"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_23"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_24"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_25"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_26"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_27"));
        kim_one_to_fourth_list.add(kim_one_to_fourth.child("one_to_fourth_list_28"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_01"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_02"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_03"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_04"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_05"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_06"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_07"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_08"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_09"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_10"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_11"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_12"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_13"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_14"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_15"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_16"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_17"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_18"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_19"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_20"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_21"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_22"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_23"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_24"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_25"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_26"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_27"));
        kim_two_to_first_list.add(kim_two_to_first.child("two_to_first_list_28"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_01"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_02"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_03"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_04"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_05"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_06"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_07"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_08"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_09"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_10"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_11"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_12"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_13"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_14"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_15"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_16"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_17"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_18"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_19"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_20"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_21"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_22"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_23"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_24"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_25"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_26"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_27"));
        kim_two_to_second_list.add(kim_two_to_second.child("two_to_second_list_28"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_01"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_02"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_03"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_04"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_05"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_06"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_07"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_08"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_09"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_10"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_11"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_12"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_13"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_14"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_15"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_16"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_17"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_18"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_19"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_20"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_21"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_22"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_23"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_24"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_25"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_26"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_27"));
        kim_two_to_third_list.add(kim_two_to_third.child("two_to_third_list_28"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_01"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_02"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_03"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_04"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_05"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_06"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_07"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_08"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_09"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_10"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_11"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_12"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_13"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_14"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_15"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_16"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_17"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_18"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_19"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_20"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_21"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_22"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_23"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_24"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_25"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_26"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_27"));
        kim_two_to_fourth_list.add(kim_two_to_fourth.child("two_to_fourth_list_28"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_01"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_02"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_03"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_04"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_05"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_06"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_07"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_08"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_09"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_10"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_11"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_12"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_13"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_14"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_15"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_16"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_17"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_18"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_19"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_20"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_21"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_22"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_23"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_24"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_25"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_26"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_27"));
        kim_three_to_first_list.add(kim_three_to_first.child("three_to_first_list_28"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_01"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_02"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_03"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_04"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_05"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_06"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_07"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_08"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_09"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_10"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_11"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_12"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_13"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_14"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_15"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_16"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_17"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_18"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_19"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_20"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_21"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_22"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_23"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_24"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_25"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_26"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_27"));
        kim_three_to_second_list.add(kim_three_to_second.child("three_to_second_list_28"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_01"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_02"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_03"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_04"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_05"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_06"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_07"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_08"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_09"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_10"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_11"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_12"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_13"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_14"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_15"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_16"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_17"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_18"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_19"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_20"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_21"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_22"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_23"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_24"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_25"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_26"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_27"));
        kim_three_to_third_list.add(kim_three_to_third.child("three_to_third_list_28"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_01"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_02"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_03"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_04"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_05"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_06"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_07"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_08"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_09"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_10"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_11"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_12"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_13"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_14"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_15"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_16"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_17"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_18"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_19"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_20"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_21"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_22"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_23"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_24"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_25"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_26"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_27"));
        kim_three_to_fourth_list.add(kim_three_to_fourth.child("three_to_fourth_list_28"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_01"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_02"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_03"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_04"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_05"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_06"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_07"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_08"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_09"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_10"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_11"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_12"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_13"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_14"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_15"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_16"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_17"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_18"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_19"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_20"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_21"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_22"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_23"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_24"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_25"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_26"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_27"));
        kim_four_to_first_list.add(kim_four_to_first.child("four_to_first_list_28"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_01"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_02"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_03"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_04"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_05"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_06"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_07"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_08"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_09"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_10"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_11"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_12"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_13"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_14"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_15"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_16"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_17"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_18"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_19"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_20"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_21"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_22"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_23"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_24"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_25"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_26"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_27"));
        kim_four_to_second_list.add(kim_four_to_second.child("four_to_second_list_28"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_01"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_02"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_03"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_04"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_05"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_06"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_07"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_08"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_09"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_10"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_11"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_12"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_13"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_14"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_15"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_16"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_17"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_18"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_19"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_20"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_21"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_22"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_23"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_24"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_25"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_26"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_27"));
        kim_four_to_third_list.add(kim_four_to_third.child("four_to_third_list_28"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_01"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_02"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_03"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_04"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_05"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_06"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_07"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_08"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_09"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_10"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_11"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_12"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_13"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_14"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_15"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_16"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_17"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_18"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_19"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_20"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_21"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_22"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_23"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_24"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_25"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_26"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_27"));
        kim_four_to_fourth_list.add(kim_four_to_fourth.child("four_to_fourth_list_28"));


        Timer mTimer1_1 = new Timer(true);
        final Handler handler1_1 = new Handler();
        mTimer1_1.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler1_1.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_first[0] == 0) {
                                               _current_station_first[0] += 1;
                                           } else {
                                               _current_station_first[0] -= 1;
                                           }
                                           if (_current_station_first[0] == 39) {
                                               _reverse_first[0] = 1;
                                           } else if (_current_station_first[0] == 0) {
                                               _reverse_first[0] = 0;
                                           }
                                           first_move.get(0).setValue(_reverse_first[0]);
                                           first_move.get(1).setValue(_current_station_first[0]);
                                           for (int i = 0; i < first_one_to_first_list.size(); i++) {
                                               first_one_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < first_one_to_second_list.size(); i++) {
                                               first_one_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < first_one_to_third_list.size(); i++) {
                                               first_one_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < first_one_to_fourth_list.size(); i++) {
                                               first_one_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }

                                       }
                                   });
                               }

                           }, 0, 40000
        );

        Timer mTimer1_2 = new Timer(true);
        final Handler handler1_2 = new Handler();
        mTimer1_2.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler1_2.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_first[1] == 0) {
                                               _current_station_first[1] += 1;
                                           } else {
                                               _current_station_first[1] -= 1;
                                           }
                                           if (_current_station_first[1] == 39) {
                                               _reverse_first[1] = 1;
                                           } else if (_current_station_first[1] == 0) {
                                               _reverse_first[1] = 0;
                                           }
                                           first_move.get(2).setValue(_reverse_first[1]);
                                           first_move.get(3).setValue(_current_station_first[1]);
                                           for (int i = 0; i < first_two_to_first_list.size(); i++) {
                                               first_two_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < first_two_to_second_list.size(); i++) {
                                               first_two_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < first_two_to_third_list.size(); i++) {
                                               first_two_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < first_two_to_fourth_list.size(); i++) {
                                               first_two_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 200000, 40000
        );

        Timer mTimer1_3 = new Timer(true);
        final Handler handler1_3 = new Handler();
        mTimer1_3.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler1_3.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_first[2] == 0) {
                                               _current_station_first[2] += 1;
                                           } else {
                                               _current_station_first[2] -= 1;
                                           }
                                           if (_current_station_first[2] == 39) {
                                               _reverse_first[2] = 1;
                                           } else if (_current_station_first[2] == 0) {
                                               _reverse_first[2] = 0;
                                           }
                                           first_move.get(4).setValue(_reverse_first[2]);
                                           first_move.get(5).setValue(_current_station_first[2]);
                                           for (int i = 0; i < first_three_to_first_list.size(); i++) {
                                               first_three_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < first_three_to_second_list.size(); i++) {
                                               first_three_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < first_three_to_third_list.size(); i++) {
                                               first_three_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < first_three_to_fourth_list.size(); i++) {
                                               first_three_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 0, 40000
        );

        Timer mTimer1_4 = new Timer(true);
        final Handler handler1_4 = new Handler();
        mTimer1_4.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler1_4.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_first[3] == 0) {
                                               _current_station_first[3] += 1;
                                           } else {
                                               _current_station_first[3] -= 1;
                                           }
                                           if (_current_station_first[3] == 39) {
                                               _reverse_first[3] = 1;
                                           } else if (_current_station_first[3] == 0) {
                                               _reverse_first[3] = 0;
                                           }
                                           first_move.get(6).setValue(_reverse_first[3]);
                                           first_move.get(7).setValue(_current_station_first[3]);
                                           for (int i = 0; i < first_four_to_first_list.size(); i++) {
                                               first_four_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < first_four_to_second_list.size(); i++) {
                                               first_four_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < first_four_to_third_list.size(); i++) {
                                               first_four_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < first_four_to_fourth_list.size(); i++) {
                                               first_four_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 200000, 40000
        );

// ------------------------------------------------------------------------------------------------------------------------------//

        Timer mTimer2_1 = new Timer(true);
        final Handler handler2_1 = new Handler();
        mTimer2_1.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler2_1.post(new Runnable() {
                                       public void run() {
                                           if (_reverse_second[0] == 0) {
                                               _current_station_second[0] += 1;
                                           } else {
                                               _current_station_second[0] -= 1;
                                           }
                                           if (_current_station_second[0] == 42) {
                                               _reverse_second[0] = 1;
                                           } else if (_current_station_second[0] == 0) {
                                               _reverse_second[0] = 0;
                                           }
                                           second_move.get(0).setValue(_reverse_second[0]);
                                           second_move.get(1).setValue(_current_station_second[0]);
                                           for (int i = 0; i < second_one_to_first_list.size(); i++) {
                                               second_one_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < second_one_to_second_list.size(); i++) {
                                               second_one_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < second_one_to_third_list.size(); i++) {
                                               second_one_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < second_one_to_fourth_list.size(); i++) {
                                               second_one_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }

                                       }
                                   });
                               }

                           }, 0, 40000
        );

        Timer mTimer2_2 = new Timer(true);
        final Handler handler2_2 = new Handler();
        mTimer2_2.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler2_2.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_second[1] == 0) {
                                               _current_station_second[1] += 1;
                                           } else {
                                               _current_station_second[1] -= 1;
                                           }
                                           if (_current_station_second[1] == 42) {
                                               _reverse_second[1] = 1;
                                           } else if (_current_station_second[1] == 0) {
                                               _reverse_second[1] = 0;
                                           }
                                           second_move.get(2).setValue(_reverse_second[1]);
                                           second_move.get(3).setValue(_current_station_second[1]);
                                           for (int i = 0; i < second_two_to_first_list.size(); i++) {
                                               second_two_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < second_two_to_second_list.size(); i++) {
                                               second_two_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < second_two_to_third_list.size(); i++) {
                                               second_two_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < second_two_to_fourth_list.size(); i++) {
                                               second_two_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 200000, 40000
        );

        Timer mTimer2_3 = new Timer(true);
        final Handler handler2_3 = new Handler();
        mTimer2_3.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler2_3.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_second[2] == 0) {
                                               _current_station_second[2] += 1;
                                           } else {
                                               _current_station_second[2] -= 1;
                                           }
                                           if (_current_station_second[2] == 42) {
                                               _reverse_second[2] = 1;
                                           } else if (_current_station_second[2] == 0) {
                                               _reverse_second[2] = 0;
                                           }
                                           second_move.get(4).setValue(_reverse_second[2]);
                                           second_move.get(5).setValue(_current_station_second[2]);
                                           for (int i = 0; i < second_three_to_first_list.size(); i++) {
                                               second_three_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < second_three_to_second_list.size(); i++) {
                                               second_three_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < second_three_to_third_list.size(); i++) {
                                               second_three_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < second_three_to_fourth_list.size(); i++) {
                                               second_three_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 0, 40000
        );

        Timer mTimer2_4 = new Timer(true);
        final Handler handler2_4 = new Handler();
        mTimer2_4.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler2_4.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_second[3] == 0) {
                                               _current_station_second[3] += 1;
                                           } else {
                                               _current_station_second[3] -= 1;
                                           }
                                           if (_current_station_second[3] == 42) {
                                               _reverse_second[3] = 1;
                                           } else if (_current_station_second[3] == 0) {
                                               _reverse_second[3] = 0;
                                           }
                                           second_move.get(6).setValue(_reverse_second[3]);
                                           second_move.get(7).setValue(_current_station_second[3]);
                                           for (int i = 0; i < second_four_to_first_list.size(); i++) {
                                               second_four_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < second_four_to_second_list.size(); i++) {
                                               second_four_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < second_four_to_third_list.size(); i++) {
                                               second_four_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < second_four_to_fourth_list.size(); i++) {
                                               second_four_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 200000, 40000
        );

// ------------------------------------------------------------------------------------------------------------------------------//


        Timer mTimer3_1 = new Timer(true);
        final Handler handler3_1 = new Handler();
        mTimer3_1.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler3_1.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_third[0] == 0) {
                                               _current_station_third[0] += 1;
                                           } else {
                                               _current_station_third[0] -= 1;
                                           }
                                           if (_current_station_third[0] == 16) {
                                               _reverse_third[0] = 1;
                                           } else if (_current_station_third[0] == 0) {
                                               _reverse_third[0] = 0;
                                           }
                                           third_move.get(0).setValue(_reverse_third[0]);
                                           third_move.get(1).setValue(_current_station_third[0]);
                                           for (int i = 0; i < third_one_to_first_list.size(); i++) {
                                               third_one_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < third_one_to_second_list.size(); i++) {
                                               third_one_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < third_one_to_third_list.size(); i++) {
                                               third_one_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < third_one_to_fourth_list.size(); i++) {
                                               third_one_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                       }
                                   });
                               }

                           }, 0, 40000
        );

        Timer mTimer3_2 = new Timer(true);
        final Handler handler3_2 = new Handler();
        mTimer3_2.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler3_2.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_third[1] == 0) {
                                               _current_station_third[1] += 1;
                                           } else {
                                               _current_station_third[1] -= 1;
                                           }
                                           if (_current_station_third[1] == 16) {
                                               _reverse_third[1] = 1;
                                           } else if (_current_station_third[1] == 0) {
                                               _reverse_third[1] = 0;
                                           }
                                           third_move.get(2).setValue(_reverse_third[1]);
                                           third_move.get(3).setValue(_current_station_third[1]);
                                           for (int i = 0; i < third_two_to_first_list.size(); i++) {
                                               third_two_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < third_two_to_second_list.size(); i++) {
                                               third_two_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < third_two_to_third_list.size(); i++) {
                                               third_two_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < third_two_to_fourth_list.size(); i++) {
                                               third_two_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 200000, 40000
        );

        Timer mTimer3_3 = new Timer(true);
        final Handler handler3_3 = new Handler();
        mTimer3_3.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler3_3.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_third[2] == 0) {
                                               _current_station_third[2] += 1;
                                           } else {
                                               _current_station_third[2] -= 1;
                                           }
                                           if (_current_station_third[2] == 16) {
                                               _reverse_third[2] = 1;
                                           } else if (_current_station_third[2] == 0) {
                                               _reverse_third[2] = 0;
                                           }
                                           third_move.get(4).setValue(_reverse_third[2]);
                                           third_move.get(5).setValue(_current_station_third[2]);
                                           for (int i = 0; i < third_three_to_first_list.size(); i++) {
                                               third_three_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < third_three_to_second_list.size(); i++) {
                                               third_three_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < third_three_to_third_list.size(); i++) {
                                               third_three_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < third_three_to_fourth_list.size(); i++) {
                                               third_three_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 0, 40000
        );

        Timer mTimer3_4 = new Timer(true);
        final Handler handler3_4 = new Handler();
        mTimer3_4.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler3_4.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_third[3] == 0) {
                                               _current_station_third[3] += 1;
                                           } else {
                                               _current_station_third[3] -= 1;
                                           }
                                           if (_current_station_third[3] == 16) {
                                               _reverse_third[3] = 1;
                                           } else if (_current_station_third[3] == 0) {
                                               _reverse_third[3] = 0;
                                           }
                                           third_move.get(6).setValue(_reverse_third[3]);
                                           third_move.get(7).setValue(_current_station_third[3]);
                                           for (int i = 0; i < third_four_to_first_list.size(); i++) {
                                               third_four_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < third_four_to_second_list.size(); i++) {
                                               third_four_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < third_four_to_third_list.size(); i++) {
                                               third_four_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < third_four_to_fourth_list.size(); i++) {
                                               third_four_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 200000, 40000
        );

// ------------------------------------------------------------------------------------------------------------------------------//


        Timer mTimer4_1 = new Timer(true);
        // 10초마다 갱신
        final Handler handler4_1 = new Handler();
        mTimer4_1.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler4_1.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_fourth[0] == 0) {
                                               _current_station_fourth[0] += 1;
                                           } else {
                                               _current_station_fourth[0] -= 1;
                                           }
                                           if (_current_station_fourth[0] == 13) {
                                               _reverse_fourth[0] = 1;
                                           } else if (_current_station_fourth[0] == 0) {
                                               _reverse_fourth[0] = 0;
                                           }
                                           fourth_move.get(0).setValue(_reverse_fourth[0]);
                                           fourth_move.get(1).setValue(_current_station_fourth[0]);
                                           for (int i = 0; i < fourth_one_to_first_list.size(); i++) {
                                               fourth_one_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < fourth_one_to_second_list.size(); i++) {
                                               fourth_one_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < fourth_one_to_third_list.size(); i++) {
                                               fourth_one_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < fourth_one_to_fourth_list.size(); i++) {
                                               fourth_one_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }

                                       }
                                   });
                               }

                           }, 0, 40000
        );

        Timer mTimer4_2 = new Timer(true);
        final Handler handler4_2 = new Handler();
        mTimer4_2.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler4_2.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_fourth[1] == 0) {
                                               _current_station_fourth[1] += 1;
                                           } else {
                                               _current_station_fourth[1] -= 1;
                                           }
                                           if (_current_station_fourth[1] == 13) {
                                               _reverse_fourth[1] = 1;
                                           } else if (_current_station_fourth[1] == 0) {
                                               _reverse_fourth[1] = 0;
                                           }
                                           fourth_move.get(2).setValue(_reverse_fourth[1]);
                                           fourth_move.get(3).setValue(_current_station_fourth[1]);
                                           for (int i = 0; i < fourth_two_to_first_list.size(); i++) {
                                               fourth_two_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < fourth_two_to_second_list.size(); i++) {
                                               fourth_two_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < fourth_two_to_third_list.size(); i++) {
                                               fourth_two_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < fourth_two_to_fourth_list.size(); i++) {
                                               fourth_two_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 200000, 40000
        );

        Timer mTimer4_3 = new Timer(true);
        final Handler handler4_3 = new Handler();
        mTimer4_3.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler4_3.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_fourth[2] == 0) {
                                               _current_station_fourth[2] += 1;
                                           } else {
                                               _current_station_fourth[2] -= 1;
                                           }
                                           if (_current_station_fourth[2] == 13) {
                                               _reverse_fourth[2] = 1;
                                           } else if (_current_station_fourth[2] == 0) {
                                               _reverse_fourth[2] = 0;
                                           }
                                           fourth_move.get(4).setValue(_reverse_fourth[2]);
                                           fourth_move.get(5).setValue(_current_station_fourth[2]);
                                           for (int i = 0; i < fourth_three_to_first_list.size(); i++) {
                                               fourth_three_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < fourth_three_to_second_list.size(); i++) {
                                               fourth_three_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < fourth_three_to_third_list.size(); i++) {
                                               fourth_three_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < fourth_three_to_fourth_list.size(); i++) {
                                               fourth_three_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 0, 40000
        );

        Timer mTimer4_4 = new Timer(true);
        final Handler handler4_4 = new Handler();
        mTimer4_4.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handler4_4.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_fourth[3] == 0) {
                                               _current_station_fourth[3] += 1;
                                           } else {
                                               _current_station_fourth[3] -= 1;
                                           }
                                           if (_current_station_fourth[3] == 13) {
                                               _reverse_fourth[3] = 1;
                                           } else if (_current_station_fourth[3] == 0) {
                                               _reverse_fourth[3] = 0;
                                           }
                                           fourth_move.get(6).setValue(_reverse_fourth[3]);
                                           fourth_move.get(7).setValue(_current_station_fourth[3]);
                                           for (int i = 0; i < fourth_four_to_first_list.size(); i++) {
                                               fourth_four_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < fourth_four_to_second_list.size(); i++) {
                                               fourth_four_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < fourth_four_to_third_list.size(); i++) {
                                               fourth_four_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < fourth_four_to_fourth_list.size(); i++) {
                                               fourth_four_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 200000, 40000
        );


        // ------------------------------------------------------------------------------------------------------------------------------//


        Timer mTimerd_1 = new Timer(true);
        // 10초마다 갱신
        final Handler handlerd_1 = new Handler();
        mTimerd_1.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handlerd_1.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_dong[0] == 0) {
                                               _current_station_dong[0] += 1;
                                           } else {
                                               _current_station_dong[0] -= 1;
                                           }
                                           if (_current_station_dong[0] == 20) {
                                               _reverse_dong[0] = 1;
                                           } else if (_current_station_dong[0] == 0) {
                                               _reverse_dong[0] = 0;
                                           }
                                           dong_move.get(0).setValue(_reverse_dong[0]);
                                           dong_move.get(1).setValue(_current_station_dong[0]);
                                           for (int i = 0; i < dong_one_to_first_list.size(); i++) {
                                               dong_one_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < dong_one_to_second_list.size(); i++) {
                                               dong_one_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < dong_one_to_third_list.size(); i++) {
                                               dong_one_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < dong_one_to_fourth_list.size(); i++) {
                                               dong_one_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 0, 40000
        );


        Timer mTimerd_2 = new Timer(true);
        final Handler handlerd_2 = new Handler();
        mTimerd_2.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handlerd_2.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_dong[1] == 0) {
                                               _current_station_dong[1] += 1;
                                           } else {
                                               _current_station_dong[1] -= 1;
                                           }
                                           if (_current_station_dong[1] == 20) {
                                               _reverse_dong[1] = 1;
                                           } else if (_current_station_dong[1] == 0) {
                                               _reverse_dong[1] = 0;
                                           }
                                           dong_move.get(2).setValue(_reverse_dong[1]);
                                           dong_move.get(3).setValue(_current_station_dong[1]);
                                           for (int i = 0; i < dong_two_to_first_list.size(); i++) {
                                               dong_two_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < dong_two_to_second_list.size(); i++) {
                                               dong_two_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < dong_two_to_third_list.size(); i++) {
                                               dong_two_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < dong_two_to_fourth_list.size(); i++) {
                                               dong_two_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 200000, 40000
        );

        Timer mTimerd_3 = new Timer(true);
        final Handler handlerd_3 = new Handler();
        mTimerd_3.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handlerd_3.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_dong[2] == 0) {
                                               _current_station_dong[2] += 1;
                                           } else {
                                               _current_station_dong[2] -= 1;
                                           }
                                           if (_current_station_dong[2] == 20) {
                                               _reverse_dong[2] = 1;
                                           } else if (_current_station_dong[2] == 0) {
                                               _reverse_dong[2] = 0;
                                           }
                                           dong_move.get(4).setValue(_reverse_dong[2]);
                                           dong_move.get(5).setValue(_current_station_dong[2]);
                                           for (int i = 0; i < dong_three_to_first_list.size(); i++) {
                                               dong_three_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < dong_three_to_second_list.size(); i++) {
                                               dong_three_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < dong_three_to_third_list.size(); i++) {
                                               dong_three_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < dong_three_to_fourth_list.size(); i++) {
                                               dong_three_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 0, 40000
        );

        Timer mTimerd_4 = new Timer(true);
        final Handler handlerd_4 = new Handler();
        mTimerd_4.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handlerd_4.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_dong[3] == 0) {
                                               _current_station_dong[3] += 1;
                                           } else {
                                               _current_station_dong[3] -= 1;
                                           }
                                           if (_current_station_dong[3] == 20) {
                                               _reverse_dong[3] = 1;
                                           } else if (_current_station_dong[3] == 0) {
                                               _reverse_dong[3] = 0;
                                           }
                                           dong_move.get(6).setValue(_reverse_dong[3]);
                                           dong_move.get(7).setValue(_current_station_dong[3]);
                                           for (int i = 0; i < dong_four_to_first_list.size(); i++) {
                                               dong_four_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < dong_four_to_second_list.size(); i++) {
                                               dong_four_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < dong_four_to_third_list.size(); i++) {
                                               dong_four_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < dong_four_to_fourth_list.size(); i++) {
                                               dong_four_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 200000, 40000
        );


        // ------------------------------------------------------------------------------------------------------------------------------//

        Timer mTimerk_1 = new Timer(true);
        // 10초마다 갱신
        final Handler handlerk_1 = new Handler();
        mTimerk_1.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handlerk_1.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_kim[0] == 0) {
                                               _current_station_kim[0] += 1;
                                           } else {
                                               _current_station_kim[0] -= 1;
                                           }
                                           if (_current_station_kim[0] == 14) {
                                               _reverse_kim[0] = 1;
                                           } else if (_current_station_kim[0] == 0) {
                                               _reverse_kim[0] = 0;
                                           }
                                           kim_move.get(0).setValue(_reverse_kim[0]);
                                           kim_move.get(1).setValue(_current_station_kim[0]);
                                           for (int i = 0; i < kim_one_to_first_list.size(); i++) {
                                               kim_one_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < kim_one_to_second_list.size(); i++) {
                                               kim_one_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < kim_one_to_third_list.size(); i++) {
                                               kim_one_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < kim_one_to_fourth_list.size(); i++) {
                                               kim_one_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 0, 40000
        );

        Timer mTimerk_2 = new Timer(true);
        final Handler handlerk_2 = new Handler();
        mTimerk_2.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handlerk_2.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_kim[1] == 0) {
                                               _current_station_kim[1] += 1;
                                           } else {
                                               _current_station_kim[1] -= 1;
                                           }
                                           if (_current_station_kim[1] == 14) {
                                               _reverse_kim[1] = 1;
                                           } else if (_current_station_kim[1] == 0) {
                                               _reverse_kim[1] = 0;
                                           }
                                           kim_move.get(2).setValue(_reverse_kim[1]);
                                           kim_move.get(3).setValue(_current_station_kim[1]);
                                           for (int i = 0; i < kim_two_to_first_list.size(); i++) {
                                               kim_two_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < kim_two_to_second_list.size(); i++) {
                                               kim_two_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < kim_two_to_third_list.size(); i++) {
                                               kim_two_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < kim_two_to_fourth_list.size(); i++) {
                                               kim_two_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 200000, 40000
        );

        Timer mTimerk_3 = new Timer(true);
        final Handler handlerk_3 = new Handler();
        mTimerk_3.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handlerk_3.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_kim[2] == 0) {
                                               _current_station_kim[2] += 1;
                                           } else {
                                               _current_station_kim[2] -= 1;
                                           }
                                           if (_current_station_kim[2] == 14) {
                                               _reverse_kim[2] = 1;
                                           } else if (_current_station_kim[2] == 0) {
                                               _reverse_kim[2] = 0;
                                           }
                                           kim_move.get(4).setValue(_reverse_kim[2]);
                                           kim_move.get(5).setValue(_current_station_kim[2]);
                                           for (int i = 0; i < kim_three_to_first_list.size(); i++) {
                                               kim_three_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < kim_three_to_second_list.size(); i++) {
                                               kim_three_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < kim_three_to_third_list.size(); i++) {
                                               kim_three_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < kim_three_to_fourth_list.size(); i++) {
                                               kim_three_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 0, 40000
        );

        Timer mTimerk_4 = new Timer(true);
        final Handler handlerk_4 = new Handler();
        mTimerk_4.schedule(new TimerTask() {
                               @Override
                               public void run() {
                                   handlerk_4.post(new Runnable() {
                                       public void run() {

                                           if (_reverse_kim[3] == 0) {
                                               _current_station_kim[3] += 1;
                                           } else {
                                               _current_station_kim[3] -= 1;
                                           }
                                           if (_current_station_kim[3] == 14) {
                                               _reverse_kim[3] = 1;
                                           } else if (_current_station_kim[3] == 0) {
                                               _reverse_kim[3] = 0;
                                           }
                                           kim_move.get(6).setValue(_reverse_kim[3]);
                                           kim_move.get(7).setValue(_current_station_kim[3]);
                                           for (int i = 0; i < kim_four_to_first_list.size(); i++) {
                                               kim_four_to_first_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < kim_four_to_second_list.size(); i++) {
                                               kim_four_to_second_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < kim_four_to_third_list.size(); i++) {
                                               kim_four_to_third_list.get(i).setValue((int) (Math.random() * 2));
                                           }
                                           for (int i = 0; i < kim_four_to_fourth_list.size(); i++) {
                                               kim_four_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
                                           }


                                       }
                                   });
                               }

                           }, 200000, 40000
        );

        // ------------------------------------------------------------------------------------------------------------------------------//


//        // 1호선에 대한 랜덤
//        for (int i = 0; i < first_to_first_list.size(); i++) {
//            first_to_first_list.get(i).setValue((int) (Math.random() * 2));
//        }
//        for (int i = 0; i < first_to_second_list.size(); i++) {
//            first_to_second_list.get(i).setValue((int) (Math.random() * 2));
//        }
//        for (int i = 0; i < first_to_third_list.size(); i++) {
//            first_to_third_list.get(i).setValue((int) (Math.random() * 2));
//        }
//        for (int i = 0; i < first_to_fourth_list.size(); i++) {
//            first_to_fourth_list.get(i).setValue((int) (Math.random() * 2));
//        }


//        }
//
//
//        // 1호선 1번칸 적용
//        for (int i = 0; i < first_to_first_list.size(); i++) {
//            // Read from the database
//            final int finalI = i;
//            first_to_first_list.get(i).addValueEventListener(new ValueEventListener() {
//                @SuppressLint("LongLogTag")
//                @Override
//                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                    // This method is called once with the initial value and again
//                    // whenever data at this location is updated.
//                    Integer value = dataSnapshot.getValue(Integer.class);
//
//                    if (value == 1) {
//                        first_to_first_button.get(finalI).setBackgroundResource(R.color.black);
//                    } else {
//                        first_to_first_button.get(finalI).setBackgroundResource(R.color.white);
//                    }
//
////                    Log.d(TAG, "Value is: " + value);
//                }
//
//                @SuppressLint("LongLogTag")
//                @Override
//                public void onCancelled(DatabaseError error) {
////                 Failed to read value
//                    Log.w(TAG, "Failed to read value.", error.toException());
//                }
//            });
//        }
//        // 1호선 1번칸 적용
//        for (int i = 0; i < first_to_second_list.size(); i++) {
//            // Read from the database
//            final int finalI = i;
//            first_to_second_list.get(i).addValueEventListener(new ValueEventListener() {
//                @SuppressLint("LongLogTag")
//                @Override
//                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                    // This method is called once with the initial value and again
//                    // whenever data at this location is updated.
//                    Integer value = dataSnapshot.getValue(Integer.class);
//
//                    if (value == 1) {
//                        first_to_second_button.get(finalI).setBackgroundResource(R.color.black);
//                    } else {
//                        first_to_second_button.get(finalI).setBackgroundResource(R.color.white);
//                    }
//
////                    Log.d(TAG, "Value is: " + value);
//                }
//
//                @SuppressLint("LongLogTag")
//                @Override
//                public void onCancelled(DatabaseError error) {
////                 Failed to read value
//                    Log.w(TAG, "Failed to read value.", error.toException());
//                }
//            });
//        }
//        // 1호선 1번칸 적용
//        for (int i = 0; i < first_to_third_list.size(); i++) {
//            // Read from the database
//            final int finalI = i;
//            first_to_third_list.get(i).addValueEventListener(new ValueEventListener() {
//                @SuppressLint("LongLogTag")
//                @Override
//                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                    // This method is called once with the initial value and again
//                    // whenever data at this location is updated.
//                    Integer value = dataSnapshot.getValue(Integer.class);
//
//                    if (value == 1) {
//                        first_to_third_button.get(finalI).setBackgroundResource(R.color.black);
//                    } else {
//                        first_to_third_button.get(finalI).setBackgroundResource(R.color.white);
//                    }
//
////                    Log.d(TAG, "Value is: " + value);
//                }
//
//                @SuppressLint("LongLogTag")
//                @Override
//                public void onCancelled(DatabaseError error) {
////                 Failed to read value
//                    Log.w(TAG, "Failed to read value.", error.toException());
//                }
//            });
//        }
//        // 1호선 1번칸 적용
//        for (int i = 0; i < first_to_fourth_list.size(); i++) {
//            // Read from the database
//            final int finalI = i;
//            first_to_fourth_list.get(i).addValueEventListener(new ValueEventListener() {
//                @SuppressLint("LongLogTag")
//                @Override
//                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                    // This method is called once with the initial value and again
//                    // whenever data at this location is updated.
//                    Integer value = dataSnapshot.getValue(Integer.class);
//
//                    if (value == 1) {
//                        first_to_fourth_button.get(finalI).setBackgroundResource(R.color.black);
//                    } else {
//                        first_to_fourth_button.get(finalI).setBackgroundResource(R.color.white);
//                    }
//
////                    Log.d(TAG, "Value is: " + value);
//                }
//
//                @SuppressLint("LongLogTag")
//                @Override
//                public void onCancelled(DatabaseError error) {
////                 Failed to read value
//                    Log.w(TAG, "Failed to read value.", error.toException());
//                }
//            });
//        }
//        // 1호선 1번칸 적용

//            // Read from the database
//            final int finalI = i;

//                @SuppressLint("LongLogTag")
//                @Override
//                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                    // This method is called once with the initial value and again
//                    // whenever data at this location is updated.
//                    Integer value = dataSnapshot.getValue(Integer.class);
//
//                    if (value == 1) {

//                    } else {

//                    }
//
////                    Log.d(TAG, "Value is: " + value);
//                }
//
//                @SuppressLint("LongLogTag")
//                @Override
//                public void onCancelled(DatabaseError error) {
////                 Failed to read value
//                    Log.w(TAG, "Failed to read value.", error.toException());
//                }
//            });
//        }

    }

}
