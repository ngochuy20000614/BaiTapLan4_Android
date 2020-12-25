package com.example.myprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListViewBeanAdapter listViewBeanAdapter;
    List<ListViewBean> list;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listview_profile);
        list = new ArrayList<ListViewBean>();
        list.add(new ListViewBean(R.drawable.ic_lock,"Lock"));
        list.add(new ListViewBean(R.drawable.ic_photo,"Photo"));
        list.add(new ListViewBean(R.drawable.ic_search,"Search"));
        list.add(new ListViewBean(R.drawable.ic_style,"Style"));
        list.add(new ListViewBean(R.drawable.ic_username,"Username"));
        list.add(new ListViewBean(R.drawable.ic_user,"User"));
        listViewBeanAdapter = new ListViewBeanAdapter(list,this);
        listView.setAdapter(listViewBeanAdapter);
    }
}