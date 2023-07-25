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
    public ArrayView(Activity context,String []maintitle){
        super(context,R.layout.item_list,maintitle);
        this.context=context;
        this.maintitle=maintitle;
    }
    public View getView(int pos, View view, ViewGroup viewgroup){

        LayoutInflater li=context.getLayoutInflater();
        View rowView=li.inflate(R.layout.item_list,null,true);
        TextView tv=rowView.findViewById(R.id.tv1);
        tv.setText(maintitle[pos]);
        return rowView;
    }
}
