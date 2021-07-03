package com.example.nguyenminhhieu_android43_day5_6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterContactBook extends BaseAdapter {
    public AdapterContactBook(List<Contactbook> contactbookList) {
        this.contactbookList = contactbookList;
    }

    List<Contactbook> contactbookList;
    @Override
    public int getCount() {
        return contactbookList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactbookList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.item_listview, parent, false);
        TextView tvtenDoAn;

        tvtenDoAn = view.findViewById(R.id.item_list);

        Contactbook contactbook =contactbookList.get(position);

        tvtenDoAn.setText(contactbook.getTenDoAn());


        return view;
    }
}
