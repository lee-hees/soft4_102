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
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import dsu.software.busansubway.Details.DetailActivity_first;
import dsu.software.busansubway.R;

public class first extends Fragment {

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
                Intent intent = new Intent(getContext(), DetailActivity_first.class);
                startActivity(intent);
            }
        });

        final Station_string string = new Station_string();

        list_itemArrayList = new ArrayList<ListViewItem>();
        listView = (ListView) view.findViewById(R.id.list_view);

        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_1)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_2)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_3)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_4)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_5)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_6)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_7)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_8)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_9)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_10)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_11)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_12)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_13)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_14)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_15)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_16)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_17)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_18)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_19)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_20)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_21)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_22)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_23)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_24)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_25)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_26)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_27)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_28)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_29)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_30)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_31)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_32)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_33)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_34)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_35)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_36)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_37)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_38)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_39)));
        list_itemArrayList.add(new ListViewItem(1, getString(R.string.first_40)));

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
                st_name.setTextColor(Color.parseColor("#FC7F25"));
                st_name.setText(list_itemArrayList.get(position).getContent().contents);
                DetailActivity_first.which = 0; // 1호선 확인용
                if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_1))) {
                    DetailActivity_first.state = 0;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_2))) {
                    DetailActivity_first.state = 1;
//                    Toast.makeText(string, DetailActivity_first.which + DetailActivity_first.state+"", Toast.LENGTH_SHORT).show();
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_3))) {
                    DetailActivity_first.state = 2;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_4))) {
                    DetailActivity_first.state = 3;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_5))) {
                    DetailActivity_first.state = 4;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_6))) {
                    DetailActivity_first.state = 5;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_7))) {
                    DetailActivity_first.state = 6;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_8))) {
                    DetailActivity_first.state = 7;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_9))) {
                    DetailActivity_first.state = 8;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_10))) {
                    DetailActivity_first.state = 9;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_11))) {
                    DetailActivity_first.state = 10;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_12))) {
                    DetailActivity_first.state = 11;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_13))) {
                    DetailActivity_first.state = 12;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_14))) {
                    DetailActivity_first.state = 13;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_15))) {
                    DetailActivity_first.state = 14;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_16))) {
                    DetailActivity_first.state = 15;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_17))) {
                    DetailActivity_first.state = 16;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_18))) {
                    DetailActivity_first.state = 17;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_19))) {
                    DetailActivity_first.state = 18;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_20))) {
                    DetailActivity_first.state = 19;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_21))) {
                    DetailActivity_first.state = 20;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_22))) {
                    DetailActivity_first.state = 21;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_23))) {
                    DetailActivity_first.state = 22;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_24))) {
                    DetailActivity_first.state = 23;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_25))) {
                    DetailActivity_first.state = 24;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_26))) {
                    DetailActivity_first.state = 25;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_27))) {
                    DetailActivity_first.state = 26;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_28))) {
                    DetailActivity_first.state = 27;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_29))) {
                    DetailActivity_first.state = 28;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_30))) {
                    DetailActivity_first.state = 29;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_31))) {
                    DetailActivity_first.state = 30;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_32))) {
                    DetailActivity_first.state = 31;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_33))) {
                    DetailActivity_first.state = 32;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_34))) {
                    DetailActivity_first.state = 33;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_35))) {
                    DetailActivity_first.state = 34;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_36))) {
                    DetailActivity_first.state = 35;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_37))) {
                    DetailActivity_first.state = 36;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_38))) {
                    DetailActivity_first.state = 37;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_39))) {
                    DetailActivity_first.state = 38;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

                } else if (list_itemArrayList.get(position).getContent().contents.equals(getString(R.string.first_40))) {
                    DetailActivity_first.state = 39;
                    Station_Tab.name = getString(string.FS[DetailActivity_first.which][DetailActivity_first.state]);

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
        list_itemArrayList.set(0, new ListViewItem(1, getString(R.string.first_1)));
        list_itemArrayList.set(1, new ListViewItem(1, getString(R.string.first_2)));
        list_itemArrayList.set(2, new ListViewItem(1, getString(R.string.first_3)));
        list_itemArrayList.set(3, new ListViewItem(1, getString(R.string.first_4)));
        list_itemArrayList.set(4, new ListViewItem(1, getString(R.string.first_5)));
        list_itemArrayList.set(5, new ListViewItem(1, getString(R.string.first_6)));
        list_itemArrayList.set(6, new ListViewItem(1, getString(R.string.first_7)));
        list_itemArrayList.set(7, new ListViewItem(1, getString(R.string.first_8)));
        list_itemArrayList.set(8, new ListViewItem(1, getString(R.string.first_9)));
        list_itemArrayList.set(9, new ListViewItem(1, getString(R.string.first_10)));
        list_itemArrayList.set(10, new ListViewItem(1, getString(R.string.first_11)));
        list_itemArrayList.set(11, new ListViewItem(1, getString(R.string.first_12)));
        list_itemArrayList.set(12, new ListViewItem(1, getString(R.string.first_13)));
        list_itemArrayList.set(13, new ListViewItem(1, getString(R.string.first_14)));
        list_itemArrayList.set(14, new ListViewItem(1, getString(R.string.first_15)));
        list_itemArrayList.set(15, new ListViewItem(1, getString(R.string.first_16)));
        list_itemArrayList.set(16, new ListViewItem(1, getString(R.string.first_17)));
        list_itemArrayList.set(17, new ListViewItem(1, getString(R.string.first_18)));
        list_itemArrayList.set(18, new ListViewItem(1, getString(R.string.first_19)));
        list_itemArrayList.set(19, new ListViewItem(1, getString(R.string.first_20)));
        list_itemArrayList.set(20, new ListViewItem(1, getString(R.string.first_21)));
        list_itemArrayList.set(21, new ListViewItem(1, getString(R.string.first_22)));
        list_itemArrayList.set(22, new ListViewItem(1, getString(R.string.first_23)));
        list_itemArrayList.set(23, new ListViewItem(1, getString(R.string.first_24)));
        list_itemArrayList.set(24, new ListViewItem(1, getString(R.string.first_25)));
        list_itemArrayList.set(25, new ListViewItem(1, getString(R.string.first_26)));
        list_itemArrayList.set(26, new ListViewItem(1, getString(R.string.first_27)));
        list_itemArrayList.set(27, new ListViewItem(1, getString(R.string.first_28)));
        list_itemArrayList.set(28, new ListViewItem(1, getString(R.string.first_29)));
        list_itemArrayList.set(29, new ListViewItem(1, getString(R.string.first_30)));
        list_itemArrayList.set(30, new ListViewItem(1, getString(R.string.first_31)));
        list_itemArrayList.set(31, new ListViewItem(1, getString(R.string.first_32)));
        list_itemArrayList.set(32, new ListViewItem(1, getString(R.string.first_33)));
        list_itemArrayList.set(33, new ListViewItem(1, getString(R.string.first_34)));
        list_itemArrayList.set(34, new ListViewItem(1, getString(R.string.first_35)));
        list_itemArrayList.set(35, new ListViewItem(1, getString(R.string.first_36)));
        list_itemArrayList.set(36, new ListViewItem(1, getString(R.string.first_37)));
        list_itemArrayList.set(37, new ListViewItem(1, getString(R.string.first_38)));
        list_itemArrayList.set(38, new ListViewItem(1, getString(R.string.first_39)));
        list_itemArrayList.set(39, new ListViewItem(1, getString(R.string.first_40)));
    }
}
