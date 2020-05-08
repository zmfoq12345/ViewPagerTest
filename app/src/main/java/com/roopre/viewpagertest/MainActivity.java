package com.roopre.viewpagertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    MyAdapter myAdapter;
    ArrayList<String> dataList = new ArrayList<>();
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewPager2);

        for(int i=0;i<30;i++){
            dataList.add("Page : "+i);
        }

        layoutManager = new LinearLayoutManager(this);

        myAdapter = new MyAdapter(dataList);
        viewPager2.setAdapter(myAdapter);


    }
}
