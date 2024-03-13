package till.edu.ex_6_listviewdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //Hiển thị dữ liệu lên listView
        //b1+ cần dữ liệu
        //cần biến phù hợp để chứa dữ liệu

        dsTenTinhThanhVN = new ArrayList<String>();// tạo thể hiện cụ thể, xin mới
        // thêm dữ liệu ờ đây
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Tp Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nha Trang");
        // tạo adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                dsTenTinhThanhVN);
        //
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //lang nghe
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    // tao bo lang nghe xu ly xu kien ONItemclick
    // vd bo lang nghe xu ly
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            // code xu ly o dau
            //i la vi tri phan tu vua dc click
            //vd khac, thay vi hien vi tri thi ta hien gia tri
            // lay gia tri tu phan tu thu i
           String strTenTinhChon = dsTenTinhThanhVN.get(i);


            Toast.makeText(MainActivity.this, strTenTinhChon ,
                    Toast.LENGTH_LONG).show();



        }
    };


}