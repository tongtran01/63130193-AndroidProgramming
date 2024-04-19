package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.Collections;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.examViewHolder>{
    List<exam> list = Collections.emptyList();
    Context mcontext;

    public Adapter(List<exam> list, Context mcontext) {
        this.list = list;
        this.mcontext= mcontext;
    }


    @NonNull
    @Override
    public examViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context1 = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context1);

        View imgView = inflater.inflate(R.layout.examcard,parent,false);
        examViewHolder examViewHolder = new examViewHolder(imgView);
        return examViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull examViewHolder holder, int position) {
        holder.examTen.setText(list.get(position).ten);
        holder.examNgay.setText(list.get(position).ngay);
        holder.examtBao.setText(list.get(position).thongBao);
    }

    @Override
    public int getItemCount() {
        return list.size();
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
            this.view = itemView;
        }

        @Override
        public void onClick(View v) {
            int clicked = getAdapterPosition();
            exam exam = list.get(clicked);
            Toast.makeText(v.getContext(),"Clicked: "+ exam.getTen(),Toast.LENGTH_SHORT).show();
        }
    }

}
