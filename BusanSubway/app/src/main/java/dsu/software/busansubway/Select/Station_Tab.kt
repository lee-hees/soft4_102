package dsu.software.busansubway.Select

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.PagerTabStrip
import androidx.viewpager.widget.ViewPager
import dsu.software.busansubway.R
import java.util.*

class Station_Tab : AppCompatActivity() {
    var pager: ViewPager? = null
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_station_tab)
        pager = findViewById(R.id.pager)
        pager!!.setOffscreenPageLimit(6)
        tabs = findViewById(R.id.tabs)
        val adapter = MyPagerAdapter(supportFragmentManager)
        val first = first()
        adapter.addItem(first)
        val second = second()
        adapter.addItem(second)
        val third = third()
        adapter.addItem(third)
        val fourth = fourth()
        adapter.addItem(fourth)
        val dong = dong()
        adapter.addItem(dong)
        val kim = kim()
        adapter.addItem(kim)
        val blank = blank()
        adapter.addItem(blank)
        val app_detail = app_detail()
        adapter.addItem(app_detail)
        pager!!.setAdapter(adapter)
        pager!!.setCurrentItem(0)
    }

    internal class MyPagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm!!) {
        var items = ArrayList<Fragment>()
        fun addItem(item: Fragment) {
            items.add(item)
        }

        override fun getItem(position: Int): Fragment {
            return items[position]
        }

        override fun getCount(): Int {
            return items.size
        }

        @RequiresApi(api = Build.VERSION_CODES.P)
        override fun getPageTitle(position: Int): CharSequence {
            if (position == 0 + 1) {
                tabs!!.setTabIndicatorColorResource(R.color.first)
                //                tabs.setTextColor(Color.parseColor("#FC7F25"));
                tabs!!.setBackgroundColor(Color.parseColor("#55FC7F25"))
            }
            if (position == 1 + 1) {
                tabs!!.setTabIndicatorColorResource(R.color.second)
                //                tabs.setTextColor(Color.parseColor("#B2E419"));
                tabs!!.setBackgroundColor(Color.parseColor("#55B2E419"))
            }
            if (position == 2 + 1) {
                tabs!!.setTabIndicatorColorResource(R.color.third)
                //                tabs.setTextColor(Color.parseColor("#B77A56"));
                tabs!!.setBackgroundColor(Color.parseColor("#55B77A56"))
            }
            if (position == 3 + 1) {
                tabs!!.setTabIndicatorColorResource(R.color.fourth)
                //                tabs.setTextColor(Color.parseColor("#02A3E9"));
                tabs!!.setBackgroundColor(Color.parseColor("#5502A3E9"))
            }
            if (position == 4 + 1) {
                tabs!!.setTabIndicatorColorResource(R.color.dong)
                //                tabs.setTextColor(Color.parseColor("#98DAEA"));
                tabs!!.setBackgroundColor(Color.parseColor("#5598DAEA"))
            }
            if (position == 5 + 1) {
                tabs!!.setTabIndicatorColorResource(R.color.kim)
                //                tabs.setTextColor(Color.parseColor("#A04BA2"));
                tabs!!.setBackgroundColor(Color.parseColor("#55A04BA2"))
            }
            if (position == 6 + 1) {
                tabs!!.setTabIndicatorColorResource(R.color.darkgray)
                //                tabs.setTextColor(Color.parseColor("#A04BA2"));
                tabs!!.setBackgroundColor(Color.parseColor("#ffffff"))
            }
            return if (position == 4) {
                "동해선"
            } else if (position == 5) {
                "김해선"
            } else if (position == 6) {
                ""
            } else if (position == 7) {
                "세부 정보"
            } else {
                (position + 1).toString() + "호선"
            }
        }
    }

    companion object {
        var tabs: PagerTabStrip? = null
        var name: String? = null
    }
}