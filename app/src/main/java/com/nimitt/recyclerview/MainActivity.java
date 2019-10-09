package com.nimitt.recyclerview;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainAdapter adapter;
    String[] options = {"dvregr", "ergrgreb","drgrg","ergtrgtg","ergrtb5yh","ergthyth","ergtrgtr","dfgtrgt","ergtrgtg","frgtrgrg"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler1);
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        adapter = new MainAdapter(options);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, true));
        recyclerView.setAdapter(adapter);
        recyclerView=findViewById(R.id.recycler2);
        setRecyclerView();
        Log.e("rec_view","fgdfg");
    }

    private void setRecyclerView() {
        adapter = new MainAdapter(options);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        Log.e("rec_view","vertical");
    }
}
