package com.example.listviewclick;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.BitSet;

import static com.example.listviewclick.R.id.text1;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = findViewById(R.id.listView);
        SingerAdapter  adapter = new SingerAdapter();
        adapter.addItem(new item("시간표"," 안녕하세요"));
        adapter.addItem(new item("좌석"," 안녕하세요"));
        adapter.addItem(new item("출구정보"," 안녕하세요"));
        adapter.addItem(new item("시설정보"," 안녕하세요"));
        adapter.addItem(new item("시설정보"," 안녕하세요"));
        adapter.addItem(new item("시설정보"," 안녕하세요"));
        adapter.addItem(new item("시설정보"," 안녕하세요"));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Toast.makeText(MainActivity.this,position + "아이탬 선택",Toast.LENGTH_LONG).show();
                }

        });


    }




    public  class SingerAdapter extends BaseAdapter {

        ArrayList<item> items = new ArrayList<item>();

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        public void addItem(item data) {
            items.add(data);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            itemView singleView = null;

            if (convertView == null) {
                singleView = new itemView(getApplicationContext());
            } else {
                singleView = (itemView) convertView;
            }

            item data = items.get(position);
            singleView.setBtn(data.getBtn());
            singleView.setText1(data.getText1());


            return singleView;






        }

    }
    }

