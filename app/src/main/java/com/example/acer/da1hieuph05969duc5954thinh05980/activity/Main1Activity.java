package com.example.acer.da1hieuph05969duc5954thinh05980.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.example.acer.da1hieuph05969duc5954thinh05980.R;
import com.example.acer.da1hieuph05969duc5954thinh05980.adapter.MainAdapter;
import com.example.acer.da1hieuph05969duc5954thinh05980.model.Main;

import java.util.ArrayList;
import java.util.List;

public class Main1Activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Main> mains;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        mains = new ArrayList<>();
        recyclerView = findViewById(R.id.RecylerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mains.add(
                new Main(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.cpu1));
        mains.add(
                new Main(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.cpu2));
        mains.add(
                new Main(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.cpu3));


        adapter = new MainAdapter(this,mains);
        recyclerView.setAdapter(adapter);
    }
}
