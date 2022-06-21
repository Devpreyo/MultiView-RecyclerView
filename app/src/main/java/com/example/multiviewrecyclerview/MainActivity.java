package com.example.multiviewrecyclerview;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private ParentRecyclerAdapter parentRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvParent = findViewById(R.id.rvParent);

        parentRecyclerAdapter = new ParentRecyclerAdapter(MainActivity.this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        rvParent.setLayoutManager(linearLayoutManager);
        rvParent.setAdapter(parentRecyclerAdapter);
    }
}