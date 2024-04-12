package till.edu.tuanhoconl_usingrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> listData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem  =   cai_bom.inflate(R.layout.itemland, parent,false);
        ItemLandHolder viewholderCreate =  new ItemLandHolder(vItem);
        return viewholderCreate;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        // Lấy đối tượng hiển thị
        LandScape landScapeHienThi = listData.get(position);
        // Trích thông tin
        String caption = landScapeHienThi.getLandCation();
        String tenAnh = landScapeHienThi.getLandImageFileName();
        //Đặt vào các trường thông tin
        holder.tvCaption.setText(caption);
        // đặt ảnh
        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenAnh,"mipmap",packageName);
        holder.ivLandScape.setImageResource(imageID);

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvCaption;
        ImageView ivLandScape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandScape = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            //code o day
            int viTriDuocClick = getAdapterPosition();
            LandScape phanTuDuocChon = listData.get(viTriDuocClick);
            // Bóc thông tin
            String ten = phanTuDuocChon.getLandCation();
            String tenFile = phanTuDuocChon.getLandImageFileName();
            //Toast Name
            String chuoiThongBao ="Bạn vừa click vào: " + ten;
            Toast.makeText(view.getContext(), chuoiThongBao, Toast.LENGTH_SHORT).show();


        }
    }

}
