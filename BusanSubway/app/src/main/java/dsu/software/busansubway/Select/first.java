package dsu.software.busansubway.Select;

import android.content.Intent;
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

import dsu.software.busansubway.Details.DetailActivity;
import dsu.software.busansubway.R;

public class first extends Fragment {

    ListView listView;
    ListviewAdapter myListAdapter;
    ArrayList<ListViewItem> list_itemArrayList;
    LinearLayout info30;

    static String name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_select_station_list, container, false);

        TableLayout gotoDetail = view.findViewById(R.id.gotoDetail);
        gotoDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), DetailActivity.class);
                startActivity(intent);
            }
        });

        final Station_string string = new Station_string();

        list_itemArrayList = new ArrayList<ListViewItem>();
        listView = (ListView) view.findViewById(R.id.list_view);

        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_1)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_2)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_3)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_4)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_5)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_6)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_7)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_8)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_9)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_10)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_11)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_12)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_13)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_14)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_15)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_16)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_17)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_18)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_19)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_20)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_21)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_22)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_23)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_24)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_25)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_26)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_27)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_28)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_29)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_30)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_31)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_32)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_33)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_34)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_35)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_36)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_37)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_38)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_39)));
        list_itemArrayList.add(new ListViewItem(1,getString(R.string.first_40)));

        info30 = view.findViewById(R.id.info30);
        final TextView exit = (TextView) view.findViewById(R.id.exit);
        exit.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                info30.setVisibility(view.GONE);
            }
        }) ;


        myListAdapter = new ListviewAdapter(getActivity(), list_itemArrayList);
        listView.setAdapter(myListAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                info30.setVisibility(view.VISIBLE);
                DetailActivity.which = 0; // 1호선 확인용
                if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_1))) {
                    DetailActivity.state = 0;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_2))) {
                    DetailActivity.state = 1;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_3))) {
                    DetailActivity.state = 2;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_4))) {
                    DetailActivity.state = 3;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_5))) {
                    DetailActivity.state = 4;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_6))) {
                    DetailActivity.state = 5;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_7))) {
                    DetailActivity.state = 6;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_8))) {
                    DetailActivity.state = 7;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_9))) {
                    DetailActivity.state = 8;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_10))) {
                    DetailActivity.state = 9;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_11))) {
                    DetailActivity.state = 10;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_12))) {
                    DetailActivity.state = 11;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_13))) {
                    DetailActivity.state = 12;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_14))) {
                    DetailActivity.state = 13;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_15))) {
                    DetailActivity.state = 14;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_16))) {
                    DetailActivity.state = 15;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_17))) {
                    DetailActivity.state = 16;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_18))) {
                    DetailActivity.state = 17;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_19))) {
                    DetailActivity.state = 18;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_20))) {
                    DetailActivity.state = 19;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_21))) {
                    DetailActivity.state = 20;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_22))) {
                    DetailActivity.state = 21;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_23))) {
                    DetailActivity.state = 22;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_24))) {
                    DetailActivity.state = 23;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_25))) {
                    DetailActivity.state = 24;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_26))) {
                    DetailActivity.state = 25;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_27))) {
                    DetailActivity.state = 26;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_28))) {
                    DetailActivity.state = 27;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_29))) {
                    DetailActivity.state = 28;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_30))) {
                    DetailActivity.state = 29;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_31))) {
                    DetailActivity.state = 30;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_32))) {
                    DetailActivity.state = 31;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_33))) {
                    DetailActivity.state = 32;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_34))) {
                    DetailActivity.state = 33;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_35))) {
                    DetailActivity.state = 34;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_36))) {
                    DetailActivity.state = 35;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_37))) {
                    DetailActivity.state = 36;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_38))) {
                    DetailActivity.state = 37;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_39))) {
                    DetailActivity.state = 38;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_40))) {
                    DetailActivity.state = 39;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                }

                reset(); // 원래 크기로 되돌리기
                list_itemArrayList.set(position, new ListViewItem(11, (list_itemArrayList.get(position).getContent().contents)));
                listView.setAdapter(myListAdapter);
                listView.setSelection(position); // 클릭한거 제일 위로

                //Intent todetail = new Intent(getActivity(), Detail_Tab.class);
                //startActivity(todetail);
            }
        });

        return view;
    }
    public void reset() {
        list_itemArrayList.set(0,new ListViewItem(1,getString(R.string.first_1)));
        list_itemArrayList.set(1,new ListViewItem(1,getString(R.string.first_2)));
        list_itemArrayList.set(2,new ListViewItem(1,getString(R.string.first_3)));
        list_itemArrayList.set(3,new ListViewItem(1,getString(R.string.first_4)));
        list_itemArrayList.set(4,new ListViewItem(1,getString(R.string.first_5)));
        list_itemArrayList.set(5,new ListViewItem(1,getString(R.string.first_6)));
        list_itemArrayList.set(6,new ListViewItem(1,getString(R.string.first_7)));
        list_itemArrayList.set(7,new ListViewItem(1,getString(R.string.first_8)));
        list_itemArrayList.set(8,new ListViewItem(1,getString(R.string.first_9)));
        list_itemArrayList.set(9,new ListViewItem(1,getString(R.string.first_10)));
        list_itemArrayList.set(10,new ListViewItem(1,getString(R.string.first_11)));
        list_itemArrayList.set(11,new ListViewItem(1,getString(R.string.first_12)));
        list_itemArrayList.set(12,new ListViewItem(1,getString(R.string.first_13)));
        list_itemArrayList.set(13,new ListViewItem(1,getString(R.string.first_14)));
        list_itemArrayList.set(14,new ListViewItem(1,getString(R.string.first_15)));
        list_itemArrayList.set(15,new ListViewItem(1,getString(R.string.first_16)));
        list_itemArrayList.set(16,new ListViewItem(1,getString(R.string.first_17)));
        list_itemArrayList.set(17,new ListViewItem(1,getString(R.string.first_18)));
        list_itemArrayList.set(18,new ListViewItem(1,getString(R.string.first_19)));
        list_itemArrayList.set(19,new ListViewItem(1,getString(R.string.first_20)));
        list_itemArrayList.set(20,new ListViewItem(1,getString(R.string.first_21)));
        list_itemArrayList.set(21,new ListViewItem(1,getString(R.string.first_22)));
        list_itemArrayList.set(22,new ListViewItem(1,getString(R.string.first_23)));
        list_itemArrayList.set(23,new ListViewItem(1,getString(R.string.first_24)));
        list_itemArrayList.set(24,new ListViewItem(1,getString(R.string.first_25)));
        list_itemArrayList.set(25,new ListViewItem(1,getString(R.string.first_26)));
        list_itemArrayList.set(26,new ListViewItem(1,getString(R.string.first_27)));
        list_itemArrayList.set(27,new ListViewItem(1,getString(R.string.first_28)));
        list_itemArrayList.set(28,new ListViewItem(1,getString(R.string.first_29)));
        list_itemArrayList.set(29,new ListViewItem(1,getString(R.string.first_30)));
        list_itemArrayList.set(30,new ListViewItem(1,getString(R.string.first_31)));
        list_itemArrayList.set(31,new ListViewItem(1,getString(R.string.first_32)));
        list_itemArrayList.set(32,new ListViewItem(1,getString(R.string.first_33)));
        list_itemArrayList.set(33,new ListViewItem(1,getString(R.string.first_34)));
        list_itemArrayList.set(34,new ListViewItem(1,getString(R.string.first_35)));
        list_itemArrayList.set(35,new ListViewItem(1,getString(R.string.first_36)));
        list_itemArrayList.set(36,new ListViewItem(1,getString(R.string.first_37)));
        list_itemArrayList.set(37,new ListViewItem(1,getString(R.string.first_38)));
        list_itemArrayList.set(38,new ListViewItem(1,getString(R.string.first_39)));
        list_itemArrayList.set(39,new ListViewItem(1,getString(R.string.first_40)));
    }
}
