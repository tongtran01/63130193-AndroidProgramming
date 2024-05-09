package dat.tht.sqlitebookdb;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.examViewHolder>{
    ArrayList<book> list;
    Context mcontext;

    public Adapter(ArrayList<book> list, Context mcontext) {
        this.list = list;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public bookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.itembook,parent,false);
        return new bookViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull bookViewHolder holder, int position) {
        book book = list.get(position);
        holder.name.setText(book.getBookName());
        holder.page.setText(book.getPage());
        holder.price.setText(book.getPrice());
        holder.description.setText(book.getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    final class bookViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView page;
        TextView price;
        View description;



        public bookViewHolder(@NonNull View itemView) {
            super(itemView);
            this.name = itemView.findViewById(R.id.Name);
            this.page = itemView.findViewById(R.id.Page);
            this.price = itemView.findViewById(R.id.Price);
            this.description = itemView.findViewById(R.id.Description);
        }



    }

}
