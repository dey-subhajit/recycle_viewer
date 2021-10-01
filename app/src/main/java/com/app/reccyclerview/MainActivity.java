package com.app.reccyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_view;
    String[] month = {"Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb","Jan", "Feb"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_view = findViewById(R.id.recycler_view);

        /*RecyclerView.LayoutManager r_l_m = new LinearLayoutManager(MainActivity.this);
        recycler_view.setLayoutManager(r_l_m);*/

        RecyclerView.LayoutManager r_l_m = new GridLayoutManager(MainActivity.this, 5);
        recycler_view.setLayoutManager(r_l_m);

        MyAdapter obj = new MyAdapter(month, MainActivity.this);
        recycler_view.setAdapter(obj);
    }
}