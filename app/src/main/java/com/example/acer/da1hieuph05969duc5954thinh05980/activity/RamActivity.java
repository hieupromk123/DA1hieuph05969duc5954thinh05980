package com.example.acer.da1hieuph05969duc5954thinh05980.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.example.acer.da1hieuph05969duc5954thinh05980.R;
import com.example.acer.da1hieuph05969duc5954thinh05980.adapter.RamAdapter;
import com.example.acer.da1hieuph05969duc5954thinh05980.model.Ram;

import java.util.ArrayList;
import java.util.List;

public class RamActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Ram> rams;
    private RamAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ram);

        rams = new ArrayList<>();
        recyclerView = findViewById(R.id.RecylerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        rams.add(
                new Ram(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.cpu1));
        rams.add(
                new Ram(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.cpu2));
        rams.add(
                new Ram(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.cpu3));




        adapter = new RamAdapter(this,rams);
        recyclerView.setAdapter(adapter);
    }
}
