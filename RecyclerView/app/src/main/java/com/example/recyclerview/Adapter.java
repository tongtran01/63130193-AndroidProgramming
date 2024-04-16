package com.example.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.examViewHolder>{
    @NonNull
    @Override
    public examViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull examViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    final class examViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView examTen;
        TextView examNgay;
        TextView examtBao;
        View view;



        public examViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            this.examTen = itemView.findViewById(R.id.examName);
            this.examNgay = itemView.findViewById(R.id.examDate);
            this.examtBao = itemView.findViewById(R.id.examMessage);
            this.view=itemView;
        }

        @Override
        public void onClick(View v) {

        }
    }

}
