package dsu.software.busansubway.Select;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import dsu.software.busansubway.Details.DetailActivity_kim;
import dsu.software.busansubway.R;

public class kim extends Fragment {

    ListView listView;
    ListviewAdapter myListAdapter;
    ArrayList<ListViewItem> list_itemArrayList;
    LinearLayout info30;
    TextView st_name;
    static String name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_select_station_list, container, false);

        TableLayout gotoDetail = view.findViewById(R.id.gotoDetail);
        gotoDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), DetailActivity_kim.class);
                startActivity(intent);
            }
        });

        final Station_string string = new Station_string();

        list_itemArrayList = new ArrayList<ListViewItem>();
        listView = (ListView) view.findViewById(R.id.list_view);

        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_1)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_2)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_3)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_4)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_5)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_6)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_7)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_8)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_9)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_10)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_11)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_12)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_13)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_14)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_15)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_16)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_17)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_18)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_19)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_20)));
        list_itemArrayList.add(new ListViewItem(6, getString(R.string.kim_21)));

        info30 = view.findViewById(R.id.info30);
        st_name = view.findViewById(R.id.st_name);

        final TextView exit = (TextView) view.findViewById(R.id.exit);
        exit.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                info30.setVisibility(View.GONE);
            }
        });

        myListAdapter = new ListviewAdapter(getActivity(), list_itemArrayList);
        listView.setAdapter(myListAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                info30.setVisibility(View.VISIBLE);
                st_name.setTextColor(Color.parseColor("#A04BA2"));
                st_name.setText(list_itemArrayList.get(position).getContent().contents);
                DetailActivity_kim.which = 5; // 김해선 확인용
                if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_1))) {
                    DetailActivity_kim.state = 0;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_2))) {
                    DetailActivity_kim.state = 1;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_3))) {
                    DetailActivity_kim.state = 2;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_4))) {
                    DetailActivity_kim.state = 3;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_5))) {
                    DetailActivity_kim.state = 4;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_6))) {
                    DetailActivity_kim.state = 5;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_7))) {
                    DetailActivity_kim.state = 6;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_8))) {
                    DetailActivity_kim.state = 7;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_9))) {
                    DetailActivity_kim.state = 8;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_10))) {
                    DetailActivity_kim.state = 9;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_11))) {
                    DetailActivity_kim.state = 10;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_12))) {
                    DetailActivity_kim.state = 11;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_13))) {
                    DetailActivity_kim.state = 12;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_14))) {
                    DetailActivity_kim.state = 13;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_15))) {
                    DetailActivity_kim.state = 14;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_16))) {
                    DetailActivity_kim.state = 15;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_17))) {
                    DetailActivity_kim.state = 16;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_18))) {
                    DetailActivity_kim.state = 17;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_19))) {
                    DetailActivity_kim.state = 18;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_20))) {
                    DetailActivity_kim.state = 19;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.kim_21))) {
                    DetailActivity_kim.state = 20;
                    Station_Tab.name = getString(string.FS[DetailActivity_kim.which][DetailActivity_kim.state]);
                }
                reset(); // 원래 크기로 되돌리기
                list_itemArrayList.set(position, new ListViewItem(66, (list_itemArrayList.get(position).getContent().contents)));
                listView.setAdapter(myListAdapter);
                listView.setSelection(position);
                //Intent todetail = new Intent(getActivity(), Detail_Tab.class);
                //startActivity(todetail);
            }
        });

        return view;
    }

    public void reset() {
        list_itemArrayList.set(0, new ListViewItem(6, getString(R.string.kim_1)));
        list_itemArrayList.set(1, new ListViewItem(6, getString(R.string.kim_2)));
        list_itemArrayList.set(2, new ListViewItem(6, getString(R.string.kim_3)));
        list_itemArrayList.set(3, new ListViewItem(6, getString(R.string.kim_4)));
        list_itemArrayList.set(4, new ListViewItem(6, getString(R.string.kim_5)));
        list_itemArrayList.set(5, new ListViewItem(6, getString(R.string.kim_6)));
        list_itemArrayList.set(6, new ListViewItem(6, getString(R.string.kim_7)));
        list_itemArrayList.set(7, new ListViewItem(6, getString(R.string.kim_8)));
        list_itemArrayList.set(8, new ListViewItem(6, getString(R.string.kim_9)));
        list_itemArrayList.set(9, new ListViewItem(6, getString(R.string.kim_10)));
        list_itemArrayList.set(10, new ListViewItem(6, getString(R.string.kim_11)));
        list_itemArrayList.set(11, new ListViewItem(6, getString(R.string.kim_12)));
        list_itemArrayList.set(12, new ListViewItem(6, getString(R.string.kim_13)));
        list_itemArrayList.set(13, new ListViewItem(6, getString(R.string.kim_14)));
        list_itemArrayList.set(14, new ListViewItem(6, getString(R.string.kim_15)));
        list_itemArrayList.set(15, new ListViewItem(6, getString(R.string.kim_16)));
        list_itemArrayList.set(16, new ListViewItem(6, getString(R.string.kim_17)));
        list_itemArrayList.set(17, new ListViewItem(6, getString(R.string.kim_18)));
        list_itemArrayList.set(18, new ListViewItem(6, getString(R.string.kim_19)));
        list_itemArrayList.set(19, new ListViewItem(6, getString(R.string.kim_20)));
        list_itemArrayList.set(20, new ListViewItem(6, getString(R.string.kim_21)));
    }
}
