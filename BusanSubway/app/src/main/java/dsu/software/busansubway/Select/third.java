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

public class third extends Fragment {

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

        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_1)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_2)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_3)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_4)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_5)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_6)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_7)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_8)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_9)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_10)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_11)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_12)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_13)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_14)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_15)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_16)));
        list_itemArrayList.add(new ListViewItem(3,getString(R.string.third_17)));

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
                DetailActivity.which = 2; // 3호선 확인용
                if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_1))) {
                    DetailActivity.state = 0;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_2))) {
                    DetailActivity.state = 1;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_3))) {
                    DetailActivity.state = 2;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_4))) {
                    DetailActivity.state = 3;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_5))) {
                    DetailActivity.state = 4;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_6))) {
                    DetailActivity.state = 5;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_7))) {
                    DetailActivity.state = 6;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_8))) {
                    DetailActivity.state = 7;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_9))) {
                    DetailActivity.state = 8;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_10))) {
                    DetailActivity.state = 9;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_11))) {
                    DetailActivity.state = 10;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_12))) {
                    DetailActivity.state = 11;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_13))) {
                    DetailActivity.state = 12;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_14))) {
                    DetailActivity.state = 13;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_15))) {
                    DetailActivity.state = 14;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_16))) {
                    DetailActivity.state = 15;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.third_17))) {
                    DetailActivity.state = 16;
                    Station_Tab.name = getString(string.FS[DetailActivity.which][DetailActivity.state]);

                }
                reset(); // 원래 크기로 되돌리기
                list_itemArrayList.set(position, new ListViewItem(33, (list_itemArrayList.get(position).getContent().contents)));
                listView.setAdapter(myListAdapter);
                listView.setSelection(position);
                //Intent todetail = new Intent(getActivity(), Detail_Tab.class);
                //startActivity(todetail);
            }
        });

        return view;
    }
    public void reset() {
        list_itemArrayList.set(0,new ListViewItem(3,getString(R.string.third_1)));
        list_itemArrayList.set(1,new ListViewItem(3,getString(R.string.third_2)));
        list_itemArrayList.set(2,new ListViewItem(3,getString(R.string.third_3)));
        list_itemArrayList.set(3,new ListViewItem(3,getString(R.string.third_4)));
        list_itemArrayList.set(4,new ListViewItem(3,getString(R.string.third_5)));
        list_itemArrayList.set(5,new ListViewItem(3,getString(R.string.third_6)));
        list_itemArrayList.set(6,new ListViewItem(3,getString(R.string.third_7)));
        list_itemArrayList.set(7,new ListViewItem(3,getString(R.string.third_8)));
        list_itemArrayList.set(8,new ListViewItem(3,getString(R.string.third_9)));
        list_itemArrayList.set(9,new ListViewItem(3,getString(R.string.third_10)));
        list_itemArrayList.set(10,new ListViewItem(3,getString(R.string.third_11)));
        list_itemArrayList.set(11,new ListViewItem(3,getString(R.string.third_12)));
        list_itemArrayList.set(12,new ListViewItem(3,getString(R.string.third_13)));
        list_itemArrayList.set(13,new ListViewItem(3,getString(R.string.third_14)));
        list_itemArrayList.set(14,new ListViewItem(3,getString(R.string.third_15)));
        list_itemArrayList.set(15,new ListViewItem(3,getString(R.string.third_16)));
        list_itemArrayList.set(16,new ListViewItem(3,getString(R.string.third_17)));
    }
}
