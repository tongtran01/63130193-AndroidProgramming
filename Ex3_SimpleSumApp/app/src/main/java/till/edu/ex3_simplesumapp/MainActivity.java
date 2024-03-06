package till.edu.ex3_simplesumapp;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        // gắn Layout tương ứng vơí file này
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    // Bộ lắng nghe và xử lý sự kiện click lên nút tính tổng
    public void XuLyCong(View view){
        // Tìm, tham chiếu đến điều khiển trên tệp XML, mapping sang java
        View editTextSoA = findViewById(R.id.edtA);
        View editTextSoB = findViewById(R.id.edtB);
        View editTextSoKetQua = findViewById(R.id.edtKQ);
        // lấy dữ liệu về ở đk số A
        String strA = editTextSoA.getText().ToString(); // strA = " 2 "
        // lấy dữ liệu về ở đk số B
        String strB = editTextSoA.getText().ToString(); // strA = " 4 "
        // Chuyển dữ liệu sang dạng số
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
        // tính toán theo y/c
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong);// chuyuen sang dang chuoi
        //Hiện ra màn hình
        editTextSoKetQua.setText(strTong);

    }
}