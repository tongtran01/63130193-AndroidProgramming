package till.edu.lvnangcao.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import till.edu.lvnangcao.Model.Country;
import till.edu.lvnangcao.R;

public class CountryAdapter extends BaseAdapter {
    // Nguon du lieu cho Adapter nay
    ArrayList<Country> listQG;
    Context mContext;
    LayoutInflater mInflater;

    public CountryAdapter(Context mContext,ArrayList<Country> listQG) {
        this.listQG = listQG;
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);
    }


    @Override
    public int getCount() {
        return listQG.size();
    }

    @Override
    public Object getItem(int position) {
        return listQG.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CountryViewHolder viewTraVe;
        viewTraVe = new CountryViewHolder();
        if(convertView == null  ){
            convertView = mInflater.inflate(R.layout.country_item,null);

            viewTraVe.textViewNationName = convertView.findViewById(R.id.tvTenQG);
            viewTraVe.textViewPopulation = convertView.findViewById(R.id.tvSoLuongDan);
            viewTraVe.imageViewFlag= convertView.findViewById(R.id.imgLaCo);
            convertView.setTag(viewTraVe);
        }
        else{
            viewTraVe = (CountryViewHolder)convertView.getTag();
        }
        // dat du lieu len view
        Country quocGiaHienThi = listQG.get(position);
        String tenQG = quocGiaHienThi.getTenQG();
        int soDan = quocGiaHienThi.getSoLuongDan();
        String tenLaCo = quocGiaHienThi.getTenFileAnhLaCo();
        viewTraVe.textViewNationName.setText(tenQG);
        viewTraVe.textViewPopulation.setText(String.valueOf(soDan));
        // tim i file anh o day
        int idAnhLaCo = TimIDAnhTheoTenFile(tenLaCo);
        viewTraVe.imageViewFlag.setImageResource(idAnhLaCo);
        return convertView;
    }

    public int TimIDAnhTheoTenFile(String tenFileAnh) {
        String tenPak = mContext.getPackageName();
        int id = mContext.getResources().
                            getIdentifier(
                                    tenFileAnh,"mipmap",tenPak
                            );
        return id;

    }

    static class CountryViewHolder{
        ImageView imageViewFlag;
        TextView textViewNationName;
        TextView textViewPopulation;
    }
}
