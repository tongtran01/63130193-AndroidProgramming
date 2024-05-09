package dat.tht.sqlitebookdb;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context mContext;
    private ArrayList<book> list;

    public Adapter(Context mContext, ArrayList<book> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.itembook, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        book book = list.get(position);
        holder.name.setText(book.getBookName());
        holder.page.setText(String.valueOf(book.getPage()));
        holder.price.setText(String.valueOf(book.getPrice()));
        holder.description.setText(book.getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,page,price,description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.Name);
            page = itemView.findViewById(R.id.Page);
            price = itemView.findViewById(R.id.Price);
            description = itemView.findViewById(R.id.Description);
        }
    }
}