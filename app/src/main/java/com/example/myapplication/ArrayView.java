package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ArrayView extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    public ArrayView(Activity context,String []maintitle,String []subtitle){
        super(context,R.layout.item_list,maintitle);
        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
    }
    public View getView(int pos, View view, ViewGroup viewgroup){

        LayoutInflater li=context.getLayoutInflater();
        View rowView=li.inflate(R.layout.item_list,null,true);
        TextView tv=rowView.findViewById(R.id.tv1);
        TextView tv2=rowView.findViewById(R.id.tv2);
        tv.setText(maintitle[pos]);
        tv2.setText(subtitle[pos]);
        return rowView;
    }
}
