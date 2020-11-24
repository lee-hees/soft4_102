package dsu.software.busansubway.Inside;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import dsu.software.busansubway.R;

public class InsideActivity_second_2 extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_detail_seat);

//        final TextView station_name = findViewById(R.id.station_name); //역이름 표시
        final TextView where = findViewById(R.id.where); //무슨 행열차인지 표시
        final TextView locate = findViewById(R.id.locate); //현위치 표시
        final Button subway_car1_button = findViewById(R.id.subway_car1_button); //1번객차 덮개
        final Button subway_car2_button = findViewById(R.id.subway_car2_button); //2번객차 덮개
        final Button subway_car3_button = findViewById(R.id.subway_car3_button); //3번객차 덮개
        final Button subway_car4_button = findViewById(R.id.subway_car4_button); //4번객차 덮개

        //덮개 색깔 변경
        subway_car2_button.setBackgroundResource(R.drawable.train_yellow);
        subway_car3_button.setBackgroundResource(R.drawable.train_yellow);
        subway_car4_button.setBackgroundResource(R.drawable.train_red);
        //subway_car3_button.setBackgroundColor(context.getResources().getColor(R.color.train_yellow);
        //subway_car4_button.setBackgroundColor(Color.parseColor(getString(R.drawable.train_red)));

        //텍스트 변경
//        station_name.setText("2호선");
        where.setText("다대포해수욕장행");
        locate.setText("서면역");
        subway_car1_button.setText("1번객차 " + "- 여유");
        subway_car2_button.setText("2번객차 " + "- 보통");
        subway_car3_button.setText("3번객차 " + "- 보통");
        subway_car4_button.setText("4번객차 " + "- 혼잡");


        //1번객차
        TextView one_to_first_04 = findViewById(R.id.one_to_first_04);
        one_to_first_04.setBackgroundColor(R.color.black);
        TextView one_to_first_11 = findViewById(R.id.one_to_first_11);
        one_to_first_11.setBackgroundColor(R.color.black);
        TextView one_to_first_17 = findViewById(R.id.one_to_first_17);
        one_to_first_17.setBackgroundColor(R.color.black);
        TextView one_to_first_23 = findViewById(R.id.one_to_first_23);
        one_to_first_23.setBackgroundColor(R.color.black);

        //2번객차
        TextView one_to_second_05 = findViewById(R.id.one_to_second_05);
        one_to_second_05.setBackgroundColor(R.color.black);
        TextView one_to_second_07 = findViewById(R.id.one_to_second_07);
        one_to_second_07.setBackgroundColor(R.color.black);
        TextView one_to_second_11 = findViewById(R.id.one_to_second_11);
        one_to_second_11.setBackgroundColor(R.color.black);
        TextView one_to_second_18 = findViewById(R.id.one_to_second_18);
        one_to_second_18.setBackgroundColor(R.color.black);
        TextView one_to_second_20 = findViewById(R.id.one_to_second_20);
        one_to_second_20.setBackgroundColor(R.color.black);
        TextView one_to_second_22 = findViewById(R.id.one_to_second_22);
        one_to_second_22.setBackgroundColor(R.color.black);
        TextView one_to_second_25 = findViewById(R.id.one_to_second_25);
        one_to_second_25.setBackgroundColor(R.color.black);

        //3번객차
        TextView one_to_third_05 = findViewById(R.id.one_to_third_05);
        one_to_third_05.setBackgroundColor(R.color.black);
        TextView one_to_third_06 = findViewById(R.id.one_to_third_06);
        one_to_third_06.setBackgroundColor(R.color.black);
        TextView one_to_third_09 = findViewById(R.id.one_to_third_09);
        one_to_third_09.setBackgroundColor(R.color.black);
        TextView one_to_third_12 = findViewById(R.id.one_to_third_12);
        one_to_third_12.setBackgroundColor(R.color.black);
        TextView one_to_third_18 = findViewById(R.id.one_to_third_18);
        one_to_third_18.setBackgroundColor(R.color.black);
        TextView one_to_third_20 = findViewById(R.id.one_to_third_20);
        one_to_third_20.setBackgroundColor(R.color.black);
        TextView one_to_third_22 = findViewById(R.id.one_to_third_22);
        one_to_third_22.setBackgroundColor(R.color.black);
        TextView one_to_third_25 = findViewById(R.id.one_to_third_25);
        one_to_third_25.setBackgroundColor(R.color.black);

        //4번객차
        TextView one_to_fourth_05 = findViewById(R.id.one_to_fourth_05);
        one_to_fourth_05.setBackgroundColor(R.color.black);
        TextView one_to_fourth_06 = findViewById(R.id.one_to_fourth_06);
        one_to_fourth_06.setBackgroundColor(R.color.black);
        TextView one_to_fourth_07 = findViewById(R.id.one_to_fourth_07);
        one_to_fourth_07.setBackgroundColor(R.color.black);
        TextView one_to_fourth_09 = findViewById(R.id.one_to_fourth_09);
        one_to_fourth_09.setBackgroundColor(R.color.black);
        TextView one_to_fourth_11 = findViewById(R.id.one_to_fourth_11);
        one_to_fourth_11.setBackgroundColor(R.color.black);
        TextView one_to_fourth_12 = findViewById(R.id.one_to_fourth_12);
        one_to_fourth_12.setBackgroundColor(R.color.black);
        TextView one_to_fourth_17 = findViewById(R.id.one_to_fourth_17);
        one_to_fourth_17.setBackgroundColor(R.color.black);
        TextView one_to_fourth_19 = findViewById(R.id.one_to_fourth_19);
        one_to_fourth_19.setBackgroundColor(R.color.black);
        TextView one_to_fourth_20 = findViewById(R.id.one_to_fourth_20);
        one_to_fourth_20.setBackgroundColor(R.color.black);
        TextView one_to_fourth_22 = findViewById(R.id.one_to_fourth_22);
        one_to_fourth_22.setBackgroundColor(R.color.black);
        TextView one_to_fourth_23 = findViewById(R.id.one_to_fourth_23);
        one_to_fourth_23.setBackgroundColor(R.color.black);
        TextView one_to_fourth_24 = findViewById(R.id.one_to_fourth_24);
        one_to_fourth_24.setBackgroundColor(R.color.black);


        //1번덮개 버튼 터치 시 1번객차 버튼 없애기
        subway_car1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subway_car1_button.setVisibility(View.GONE);
                subway_car2_button.setVisibility(View.VISIBLE);
                subway_car3_button.setVisibility(View.VISIBLE);
                subway_car4_button.setVisibility(View.VISIBLE);
            }
        });

        //2번덮개 버튼 터치 시 2번객차 버튼 없애기
        subway_car2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subway_car1_button.setVisibility(View.VISIBLE);
                subway_car2_button.setVisibility(View.GONE);
                subway_car3_button.setVisibility(View.VISIBLE);
                subway_car4_button.setVisibility(View.VISIBLE);
            }
        });

        //3번덮개 버튼 터치 시 3번객차 버튼 없애기
        subway_car3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subway_car1_button.setVisibility(View.VISIBLE);
                subway_car2_button.setVisibility(View.VISIBLE);
                subway_car3_button.setVisibility(View.GONE);
                subway_car4_button.setVisibility(View.VISIBLE);
            }
        });

        //4번덮개 버튼 터치 시 4번객차 버튼 없애기
        subway_car4_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subway_car1_button.setVisibility(View.VISIBLE);
                subway_car2_button.setVisibility(View.VISIBLE);
                subway_car3_button.setVisibility(View.VISIBLE);
                subway_car4_button.setVisibility(View.GONE);
            }
        });


        }
}
