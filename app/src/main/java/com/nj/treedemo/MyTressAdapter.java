package com.nj.treedemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018-08-09.
 */

public class MyTressAdapter extends TreeListViewAdapter<Peijlb> {
    /**
     * @param mTree
     * @param context
     * @param datas
     * @param defaultExpandLevel 默认展开几级树
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    public MyTressAdapter(ListView mTree, Context context, List<Peijlb> datas, int defaultExpandLevel)
            throws IllegalArgumentException, IllegalAccessException {
        super(mTree, context, datas, defaultExpandLevel);
    }

    @Override
    public View getConvertView(Node node, int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_item, parent, false);
        TextView id = view.findViewById(R.id.tv_id);
        TextView name = view.findViewById(R.id.tv_name);
        ImageView image = view.findViewById(R.id.iv_image);
        TextView size = view.findViewById(R.id.tv_size);
        id.setText(node.getId() + ":");
        name.setText(node.getName());
        image.setImageResource(node.getIcon());
        if (node.getChildren().size() == 0) {
            size.setText("");
        } else {
            size.setText("有" + node.getChildren().size() + "个子类");
        }
        return view;
    }
}
