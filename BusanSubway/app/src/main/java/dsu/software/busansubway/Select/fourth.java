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

import dsu.software.busansubway.Details.DetailActivity_fourth;
import dsu.software.busansubway.R;

public class fourth extends Fragment {

    ListView listView;
    ListviewAdapter myListAdapter;
    ArrayList<ListViewItem> list_itemArrayList;
    LinearLayout info30;
    TextView st_name;
    TextView station_start, station_end, time_start, time_end;
    static String name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_select_station_list, container, false);

        TableLayout gotoDetail = view.findViewById(R.id.gotoDetail);
        gotoDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), DetailActivity_fourth.class);
                startActivity(intent);
            }
        });

        final Station_string string = new Station_string();

        list_itemArrayList = new ArrayList<ListViewItem>();
        listView = (ListView) view.findViewById(R.id.list_view);

        list_itemArrayList.add(new ListViewItem(4, getString(R.string.fourth_1)));
        list_itemArrayList.add(new ListViewItem(4, getString(R.string.fourth_2)));
        list_itemArrayList.add(new ListViewItem(4, getString(R.string.fourth_3)));
        list_itemArrayList.add(new ListViewItem(4, getString(R.string.fourth_4)));
        list_itemArrayList.add(new ListViewItem(4, getString(R.string.fourth_5)));
        list_itemArrayList.add(new ListViewItem(4, getString(R.string.fourth_6)));
        list_itemArrayList.add(new ListViewItem(4, getString(R.string.fourth_7)));
        list_itemArrayList.add(new ListViewItem(4, getString(R.string.fourth_8)));
        list_itemArrayList.add(new ListViewItem(4, getString(R.string.fourth_9)));
        list_itemArrayList.add(new ListViewItem(4, getString(R.string.fourth_10)));
        list_itemArrayList.add(new ListViewItem(4, getString(R.string.fourth_11)));
        list_itemArrayList.add(new ListViewItem(4, getString(R.string.fourth_12)));
        list_itemArrayList.add(new ListViewItem(4, getString(R.string.fourth_13)));
        list_itemArrayList.add(new ListViewItem(4, getString(R.string.fourth_14)));

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
                st_name.setTextColor(Color.parseColor("#02A3E9"));
                st_name.setText(list_itemArrayList.get(position).getContent().contents);
                DetailActivity_fourth.which = 3; // 4호선 확인용
                if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.fourth_1))) {
                    DetailActivity_fourth.state = 0;
                    Station_Tab.name = getString(string.FS[DetailActivity_fourth.which][DetailActivity_fourth.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.fourth_2))) {
                    DetailActivity_fourth.state = 1;
                    Station_Tab.name = getString(string.FS[DetailActivity_fourth.which][DetailActivity_fourth.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.fourth_3))) {
                    DetailActivity_fourth.state = 2;
                    Station_Tab.name = getString(string.FS[DetailActivity_fourth.which][DetailActivity_fourth.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.fourth_4))) {
                    DetailActivity_fourth.state = 3;
                    Station_Tab.name = getString(string.FS[DetailActivity_fourth.which][DetailActivity_fourth.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.fourth_5))) {
                    DetailActivity_fourth.state = 4;
                    Station_Tab.name = getString(string.FS[DetailActivity_fourth.which][DetailActivity_fourth.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.fourth_6))) {
                    DetailActivity_fourth.state = 5;
                    Station_Tab.name = getString(string.FS[DetailActivity_fourth.which][DetailActivity_fourth.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.fourth_7))) {
                    DetailActivity_fourth.state = 6;
                    Station_Tab.name = getString(string.FS[DetailActivity_fourth.which][DetailActivity_fourth.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.fourth_8))) {
                    DetailActivity_fourth.state = 7;
                    Station_Tab.name = getString(string.FS[DetailActivity_fourth.which][DetailActivity_fourth.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.fourth_9))) {
                    DetailActivity_fourth.state = 8;
                    Station_Tab.name = getString(string.FS[DetailActivity_fourth.which][DetailActivity_fourth.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.fourth_10))) {
                    DetailActivity_fourth.state = 9;
                    Station_Tab.name = getString(string.FS[DetailActivity_fourth.which][DetailActivity_fourth.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.fourth_11))) {
                    DetailActivity_fourth.state = 10;
                    Station_Tab.name = getString(string.FS[DetailActivity_fourth.which][DetailActivity_fourth.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.fourth_12))) {
                    DetailActivity_fourth.state = 11;
                    Station_Tab.name = getString(string.FS[DetailActivity_fourth.which][DetailActivity_fourth.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.fourth_13))) {
                    DetailActivity_fourth.state = 12;
                    Station_Tab.name = getString(string.FS[DetailActivity_fourth.which][DetailActivity_fourth.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.fourth_14))) {
                    DetailActivity_fourth.state = 13;
                    Station_Tab.name = getString(string.FS[DetailActivity_fourth.which][DetailActivity_fourth.state]);

                }
                reset(); // 원래 크기로 되돌리기
                list_itemArrayList.set(position, new ListViewItem(44, (list_itemArrayList.get(position).getContent().contents)));
                listView.setAdapter(myListAdapter);
                listView.setSelection(position);
                //Intent todetail = new Intent(getActivity(), Detail_Tab.class);
                //startActivity(todetail);
            }
        });

        station_start = view.findViewById(R.id.station_start);
        station_end = view.findViewById(R.id.station_end);
        station_end.setText("안평행");
        station_start.setText("미남행");

        time_start = view.findViewById(R.id.time_start);
        time_end = view.findViewById(R.id.time_end);

        return view;
    }

    public void reset() {
        list_itemArrayList.set(0, new ListViewItem(4, getString(R.string.fourth_1)));
        list_itemArrayList.set(1, new ListViewItem(4, getString(R.string.fourth_2)));
        list_itemArrayList.set(2, new ListViewItem(4, getString(R.string.fourth_3)));
        list_itemArrayList.set(3, new ListViewItem(4, getString(R.string.fourth_4)));
        list_itemArrayList.set(4, new ListViewItem(4, getString(R.string.fourth_5)));
        list_itemArrayList.set(5, new ListViewItem(4, getString(R.string.fourth_6)));
        list_itemArrayList.set(6, new ListViewItem(4, getString(R.string.fourth_7)));
        list_itemArrayList.set(7, new ListViewItem(4, getString(R.string.fourth_8)));
        list_itemArrayList.set(8, new ListViewItem(4, getString(R.string.fourth_9)));
        list_itemArrayList.set(9, new ListViewItem(4, getString(R.string.fourth_10)));
        list_itemArrayList.set(10, new ListViewItem(4, getString(R.string.fourth_11)));
        list_itemArrayList.set(11, new ListViewItem(4, getString(R.string.fourth_12)));
        list_itemArrayList.set(12, new ListViewItem(4, getString(R.string.fourth_13)));
        list_itemArrayList.set(13, new ListViewItem(4, getString(R.string.fourth_14)));
    }
}