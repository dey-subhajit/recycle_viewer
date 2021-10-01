package com.app.reccyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myHolder> {

    String[] array;
    Context c;

    public MyAdapter(String[] array, Context c) {
        this.array = array;
        this.c = c;
    }

    @NonNull
    @Override
    public myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater lf = LayoutInflater.from(parent.getContext());
        View row = lf.inflate(R.layout.layout_show, null);
        myHolder holder = new myHolder(row);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull myHolder holder, int position) {
        holder.show_data.setText(array[position]);
    }

    @Override
    public int getItemCount() {
        return array.length;
    }

    class myHolder extends RecyclerView.ViewHolder{
        TextView show_data;
        public myHolder(@NonNull View itemView) {
            super(itemView);
            show_data = itemView.findViewById(R.id.show_data);
        }
    }
}
