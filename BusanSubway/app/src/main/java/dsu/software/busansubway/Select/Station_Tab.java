package dsu.software.busansubway.Select;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerTabStrip;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import dsu.software.busansubway.R;

public class Station_Tab extends AppCompatActivity {

    ViewPager pager;
    static PagerTabStrip tabs;

    static String name;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_station_tab);

        pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(6);

        tabs = findViewById(R.id.tabs);

        final MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());

        first first = new first();
        adapter.addItem(first);

        second second = new second();
        adapter.addItem(second);

        third third = new third();
        adapter.addItem(third);

        fourth fourth = new fourth();
        adapter.addItem(fourth);

        dong dong = new dong();
        adapter.addItem(dong);

        kim kim = new kim();
        adapter.addItem(kim);

        blank blank = new blank();
        adapter.addItem(blank);
        app_detail app_detail = new app_detail();
        adapter.addItem(app_detail);


        pager.setAdapter(adapter);

        pager.setCurrentItem(0);

    }

    static class MyPagerAdapter extends FragmentStatePagerAdapter {
        ArrayList<Fragment> items = new ArrayList<>();

        MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        void addItem(Fragment item) {
            items.add(item);
        }

        @NonNull
        public Fragment getItem(int position) {
            return items.get(position);
        }

        public int getCount() {
            return items.size();
        }

        @RequiresApi(api = Build.VERSION_CODES.P)
        public CharSequence getPageTitle(int position) {

            if (position == 0 + 1) {
                tabs.setTabIndicatorColorResource(R.color.first);
//                tabs.setTextColor(Color.parseColor("#FC7F25"));
                tabs.setBackgroundColor(Color.parseColor("#55FC7F25"));
            }
            if (position == 1 + 1) {
                tabs.setTabIndicatorColorResource(R.color.second);
//                tabs.setTextColor(Color.parseColor("#B2E419"));
                tabs.setBackgroundColor(Color.parseColor("#55B2E419"));
            }
            if (position == 2 + 1) {
                tabs.setTabIndicatorColorResource(R.color.third);
//                tabs.setTextColor(Color.parseColor("#B77A56"));
                tabs.setBackgroundColor(Color.parseColor("#55B77A56"));
            }
            if (position == 3 + 1) {
                tabs.setTabIndicatorColorResource(R.color.fourth);
//                tabs.setTextColor(Color.parseColor("#02A3E9"));
                tabs.setBackgroundColor(Color.parseColor("#5502A3E9"));
            }
            if (position == 4 + 1) {
                tabs.setTabIndicatorColorResource(R.color.dong);
//                tabs.setTextColor(Color.parseColor("#98DAEA"));
                tabs.setBackgroundColor(Color.parseColor("#5598DAEA"));
            }
            if (position == 5 + 1) {
                tabs.setTabIndicatorColorResource(R.color.kim);
//                tabs.setTextColor(Color.parseColor("#A04BA2"));
                tabs.setBackgroundColor(Color.parseColor("#55A04BA2"));
            }
            if (position == 6 + 1) {
                tabs.setTabIndicatorColorResource(R.color.darkgray);
//                tabs.setTextColor(Color.parseColor("#A04BA2"));
                tabs.setBackgroundColor(Color.parseColor("#ffffff"));
            }

            if (position == 4) {
                return "동해선";
            } else if (position == 5) {
                return "김해선";
            } else if (position == 6) {
                return "";
            } else if (position == 7) {
                return "세부 정보";
            } else {
                return (position + 1) + "호선";
            }
        }
    }
}
