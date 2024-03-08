package till.edu.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // Khai bao cac doi tuong gan voi dieu khien tuong ung
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru, nutNhan,nutChia;
    void TimDieuKhien(){
        editTextSo1 =(EditText)findViewById(R.id.edtSo1);
        editTextSo2 =(EditText)findViewById(R.id.edtSo2);
        editTextKQ =(EditText)findViewById(R.id.edtKetQua);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



    }

    // xu ly cong
    public void XuLyCong(View v) {
        // code xu ly cong o day
        // b1. lay du lieu 2 so
        // b1.1 Tim EditText so 1 va so 2

        // b1.2 Lay du lieu tu 2 dk do
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 . Chuyen du lieu tu chuoi sang con so
        float SoA = Float.parseFloat(soThu1);
        float SoB = Float.parseFloat(soThu2);
        // b2.Tinh toan

        float Tong = SoA + SoB;

        //b3.Hien ket qua
        // b3.1.

        // b3.2 Chuan bi du lieu xuat
        String chuoiKQ = String.valueOf(Tong);
        // b3.3 Gan ket qua len dieu khien
        editTextKQ.setText(chuoiKQ);

    }

    public void XuLyTru(View view) {

        // code xu ly cong o day
        // b1. lay du lieu 2 so
        // b1.1 Tim EditText so 1 va so 2
        // b1.2 Lay du lieu tu 2 dk do
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 . Chuyen du lieu tu chuoi sang con so
        float SoA = Float.parseFloat(soThu1);
        float SoB = Float.parseFloat(soThu2);
        // b2.Tinh toan

        float Hieu = SoA - SoB;

        //b3.Hien ket qua
        // b3.1.

        // b3.2 Chuan bi du lieu xuat
        String chuoiKQ = String.valueOf(Hieu);
        // b3.3 Gan ket qua len dieu khien
        editTextKQ.setText(chuoiKQ);
    }

    public void XuLyNhan(View view) {
        // code xu ly nhan o day
        // b1. lay du lieu 2 so
        // b1.1 Tim EditText so 1 va so 2

        // b1.2 Lay du lieu tu 2 dk do
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 . Chuyen du lieu tu chuoi sang con so
        float SoA = Float.parseFloat(soThu1);
        float SoB = Float.parseFloat(soThu2);
        // b2.Tinh toan

        float Tich = SoA * SoB;

        //b3.Hien ket qua
        // b3.1.

        // b3.2 Chuan bi du lieu xuat
        String chuoiKQ = String.valueOf(Tich);
        // b3.3 Gan ket qua len dieu khien
        editTextKQ.setText(chuoiKQ);
    }

    public void XuLyChia(View view) {
        // code xu ly chia o day
        // b1. lay du lieu 2 so
        // b1.1 Tim EditText so 1 va so 2
        // b1.2 Lay du lieu tu 2 dk do
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 . Chuyen du lieu tu chuoi sang con so
        float SoA = Float.parseFloat(soThu1);
        float SoB = Float.parseFloat(soThu2);
        // b2.Tinh toan

        float Thuong = SoA / SoB;

        //b3.Hien ket qua
        // b3.1.

        // b3.2 Chuan bi du lieu xuat
        String chuoiKQ = String.valueOf(Thuong);
        // b3.3 Gan ket qua len dieu khien
        editTextKQ.setText(chuoiKQ);
    }
}