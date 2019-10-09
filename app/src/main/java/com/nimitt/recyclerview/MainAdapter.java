package com.nimitt.recyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.sql.Array;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainHolder> {
    String[] DocID;

    MainAdapter(String[] options) {
        this.DocID = options;
        Log.d("text1",DocID[0]);
    }

    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text, parent,false);
        Log.d("text1","in create");
        return new MainHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainHolder holder, int position) {
        holder.textView.setText(DocID[position]);
        Log.d("text1","inholder");
    }

    @Override
    public int getItemCount() {
        Log.d("text1","itemcount"+DocID.length);
        return DocID.length;
    }

    public class MainHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public MainHolder(@NonNull View itemView)
        {
            super(itemView);
            Log.d("text1","MainHolder");
            textView=itemView.findViewById(R.id.textView);
        }
    }
}
