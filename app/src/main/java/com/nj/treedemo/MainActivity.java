package com.nj.treedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Peijlb> mList = new ArrayList<>();
    private ListView mListView;
    private MyTressAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = findViewById(R.id.listview);
        initData();
        try {
            mAdapter = new MyTressAdapter(mListView, this, mList, 0);
            mListView.setAdapter(mAdapter);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private void initData() {
        mList.add(new Peijlb(1, 0, "中国古代"));
        mList.add(new Peijlb(2, 1, "唐朝"));
        mList.add(new Peijlb(3, 1, "宋朝"));
        mList.add(new Peijlb(4, 1, "明朝"));
        mList.add(new Peijlb(5, 2, "李世民"));
        mList.add(new Peijlb(6, 2, "李白"));
        mList.add(new Peijlb(7, 3, "赵匡胤"));
        mList.add(new Peijlb(8, 3, "苏轼"));
        mList.add(new Peijlb(9, 4, "朱元璋"));
        mList.add(new Peijlb(10, 4, "唐伯虎"));
        mList.add(new Peijlb(11, 4, "文征明"));
        mList.add(new Peijlb(12, 7, "赵建立"));
        mList.add(new Peijlb(13, 8, "苏东东"));
        mList.add(new Peijlb(14, 10, "秋香"));

    }
}
