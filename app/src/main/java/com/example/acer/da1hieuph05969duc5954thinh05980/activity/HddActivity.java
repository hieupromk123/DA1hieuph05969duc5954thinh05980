package com.example.acer.da1hieuph05969duc5954thinh05980.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.example.acer.da1hieuph05969duc5954thinh05980.R;
import com.example.acer.da1hieuph05969duc5954thinh05980.adapter.HddAdapter;
import com.example.acer.da1hieuph05969duc5954thinh05980.model.Hdd;

import java.util.ArrayList;
import java.util.List;

public class HddActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Hdd> hdds;
    private HddAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdd);

        hdds = new ArrayList<>();
        recyclerView = findViewById(R.id.RecylerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        hdds.add(
                new Hdd(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.cpu1));
        hdds.add(
                new Hdd(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.cpu2));
        hdds.add(
                new Hdd(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.cpu3));




        adapter = new HddAdapter(this,hdds);
        recyclerView.setAdapter(adapter);
    }
}
