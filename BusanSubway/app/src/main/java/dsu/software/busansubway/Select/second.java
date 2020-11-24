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

import dsu.software.busansubway.Details.DetailActivity_second;
import dsu.software.busansubway.R;

public class second extends Fragment {

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
                Intent intent = new Intent(getContext(), DetailActivity_second.class);
                startActivity(intent);
            }
        });

        final Station_string string = new Station_string();

        list_itemArrayList = new ArrayList<ListViewItem>();
        listView = (ListView) view.findViewById(R.id.list_view);

        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_1)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_2)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_3)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_4)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_5)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_6)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_7)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_8)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_9)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_10)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_11)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_12)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_13)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_14)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_15)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_16)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_17)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_18)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_19)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_20)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_21)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_22)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_23)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_24)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_25)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_26)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_27)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_28)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_29)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_30)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_31)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_32)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_33)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_34)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_35)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_36)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_37)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_38)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_39)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_40)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_41)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_42)));
        list_itemArrayList.add(new ListViewItem(2, getString(R.string.second_43)));

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
                st_name.setTextColor(Color.parseColor("#B2E419"));
                st_name.setText(list_itemArrayList.get(position).getContent().contents);
                DetailActivity_second.which = 1; // 2호선 확인용
                if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_1))) {
                    DetailActivity_second.state = 0;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_2))) {
                    DetailActivity_second.state = 1;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_3))) {
                    DetailActivity_second.state = 2;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_4))) {
                    DetailActivity_second.state = 3;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_5))) {
                    DetailActivity_second.state = 4;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_6))) {
                    DetailActivity_second.state = 5;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_7))) {
                    DetailActivity_second.state = 6;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_8))) {
                    DetailActivity_second.state = 7;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_9))) {
                    DetailActivity_second.state = 8;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_10))) {
                    DetailActivity_second.state = 9;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_11))) {
                    DetailActivity_second.state = 10;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_12))) {
                    DetailActivity_second.state = 11;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_13))) {
                    DetailActivity_second.state = 12;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_14))) {
                    DetailActivity_second.state = 13;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_15))) {
                    DetailActivity_second.state = 14;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_16))) {
                    DetailActivity_second.state = 15;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_17))) {
                    DetailActivity_second.state = 16;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_18))) {
                    DetailActivity_second.state = 17;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_19))) {
                    DetailActivity_second.state = 18;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_20))) {
                    DetailActivity_second.state = 19;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_21))) {
                    DetailActivity_second.state = 20;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_22))) {
                    DetailActivity_second.state = 21;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_23))) {
                    DetailActivity_second.state = 22;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_24))) {
                    DetailActivity_second.state = 23;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_25))) {
                    DetailActivity_second.state = 24;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_26))) {
                    DetailActivity_second.state = 25;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_27))) {
                    DetailActivity_second.state = 26;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_28))) {
                    DetailActivity_second.state = 27;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_29))) {
                    DetailActivity_second.state = 28;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_30))) {
                    DetailActivity_second.state = 29;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_31))) {
                    DetailActivity_second.state = 30;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_32))) {
                    DetailActivity_second.state = 31;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_33))) {
                    DetailActivity_second.state = 32;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_34))) {
                    DetailActivity_second.state = 33;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_35))) {
                    DetailActivity_second.state = 34;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_36))) {
                    DetailActivity_second.state = 35;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_37))) {
                    DetailActivity_second.state = 36;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_38))) {
                    DetailActivity_second.state = 37;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_39))) {
                    DetailActivity_second.state = 38;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_40))) {
                    DetailActivity_second.state = 39;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_41))) {
                    DetailActivity_second.state = 40;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_42))) {
                    DetailActivity_second.state = 41;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.second_43))) {
                    DetailActivity_second.state = 42;
                    Station_Tab.name = getString(string.FS[DetailActivity_second.which][DetailActivity_second.state]);

                }
                reset(); // 원래 크기로 되돌리기
                list_itemArrayList.set(position, new ListViewItem(22, (list_itemArrayList.get(position).getContent().contents)));
                listView.setAdapter(myListAdapter);
                listView.setSelection(position); // 클릭한거 제일 위로
                //Intent todetail = new Intent(getActivity(), Detail_Tab.class);
                //startActivity(todetail);
            }
        });

        return view;
    }

    public void reset() {
        list_itemArrayList.set(0, new ListViewItem(2, getString(R.string.second_1)));
        list_itemArrayList.set(1, new ListViewItem(2, getString(R.string.second_2)));
        list_itemArrayList.set(2, new ListViewItem(2, getString(R.string.second_3)));
        list_itemArrayList.set(3, new ListViewItem(2, getString(R.string.second_4)));
        list_itemArrayList.set(4, new ListViewItem(2, getString(R.string.second_5)));
        list_itemArrayList.set(5, new ListViewItem(2, getString(R.string.second_6)));
        list_itemArrayList.set(6, new ListViewItem(2, getString(R.string.second_7)));
        list_itemArrayList.set(7, new ListViewItem(2, getString(R.string.second_8)));
        list_itemArrayList.set(8, new ListViewItem(2, getString(R.string.second_9)));
        list_itemArrayList.set(9, new ListViewItem(2, getString(R.string.second_10)));
        list_itemArrayList.set(10, new ListViewItem(2, getString(R.string.second_11)));
        list_itemArrayList.set(11, new ListViewItem(2, getString(R.string.second_12)));
        list_itemArrayList.set(12, new ListViewItem(2, getString(R.string.second_13)));
        list_itemArrayList.set(13, new ListViewItem(2, getString(R.string.second_14)));
        list_itemArrayList.set(14, new ListViewItem(2, getString(R.string.second_15)));
        list_itemArrayList.set(15, new ListViewItem(2, getString(R.string.second_16)));
        list_itemArrayList.set(16, new ListViewItem(2, getString(R.string.second_17)));
        list_itemArrayList.set(17, new ListViewItem(2, getString(R.string.second_18)));
        list_itemArrayList.set(18, new ListViewItem(2, getString(R.string.second_19)));
        list_itemArrayList.set(19, new ListViewItem(2, getString(R.string.second_20)));
        list_itemArrayList.set(20, new ListViewItem(2, getString(R.string.second_21)));
        list_itemArrayList.set(21, new ListViewItem(2, getString(R.string.second_22)));
        list_itemArrayList.set(22, new ListViewItem(2, getString(R.string.second_23)));
        list_itemArrayList.set(23, new ListViewItem(2, getString(R.string.second_24)));
        list_itemArrayList.set(24, new ListViewItem(2, getString(R.string.second_25)));
        list_itemArrayList.set(25, new ListViewItem(2, getString(R.string.second_26)));
        list_itemArrayList.set(26, new ListViewItem(2, getString(R.string.second_27)));
        list_itemArrayList.set(27, new ListViewItem(2, getString(R.string.second_28)));
        list_itemArrayList.set(28, new ListViewItem(2, getString(R.string.second_29)));
        list_itemArrayList.set(29, new ListViewItem(2, getString(R.string.second_30)));
        list_itemArrayList.set(30, new ListViewItem(2, getString(R.string.second_31)));
        list_itemArrayList.set(31, new ListViewItem(2, getString(R.string.second_32)));
        list_itemArrayList.set(32, new ListViewItem(2, getString(R.string.second_33)));
        list_itemArrayList.set(33, new ListViewItem(2, getString(R.string.second_34)));
        list_itemArrayList.set(34, new ListViewItem(2, getString(R.string.second_35)));
        list_itemArrayList.set(35, new ListViewItem(2, getString(R.string.second_36)));
        list_itemArrayList.set(36, new ListViewItem(2, getString(R.string.second_37)));
        list_itemArrayList.set(37, new ListViewItem(2, getString(R.string.second_38)));
        list_itemArrayList.set(38, new ListViewItem(2, getString(R.string.second_39)));
        list_itemArrayList.set(39, new ListViewItem(2, getString(R.string.second_40)));
        list_itemArrayList.set(40, new ListViewItem(2, getString(R.string.second_41)));
        list_itemArrayList.set(41, new ListViewItem(2, getString(R.string.second_42)));
        list_itemArrayList.set(42, new ListViewItem(2, getString(R.string.second_43)));
    }
}
