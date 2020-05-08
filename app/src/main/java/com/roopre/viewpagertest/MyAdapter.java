package com.roopre.viewpagertest;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter {

    // 데이터 리스트
    ArrayList<String> dataList = new ArrayList<>();

    // 생성
    public MyAdapter(ArrayList<String> list){
        this.dataList = list;

    }

    // ViewHolder 레이아웃에 연결
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_viewpager, parent,false);
        MyAdapter.CustomViewHolder cholder = new MyAdapter.CustomViewHolder(view);
        return cholder;
    }


    // ViewHolder 에 데이터 연결하기
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {

        CustomViewHolder viewHolder = (CustomViewHolder) holder;
        viewHolder.textView.setText(dataList.get(position));

    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    // 사용할 ViewHolder 커스텀 하는 부분
    private class CustomViewHolder extends RecyclerView.ViewHolder{

        TextView textView;

        CustomViewHolder (View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }

    }
}
