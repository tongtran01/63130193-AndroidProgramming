package till.edu.ex5_addsubmuldiv_var;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtSoA;
    EditText edtSoB;
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimView();
        //
        btnCong.setOnClickListener(boLangNgheXuLyCong);
        btnTru.setOnClickListener(boLangNgheXuLyTru);
        btnNhan.setOnClickListener(boLangNgheXuLyNhan);

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code xu ly cong
                String strSo1 = edtSoA.getText().toString();
                String strSo2 = edtSoB.getText().toString();
                //
                double soA = Double.parseDouble(strSo1);
                double soB = Double.parseDouble(strSo2);
                // tinh
                double tong = soA / soB;
                String strKQ = String.valueOf(tong);
                tvKetQua.setText(strKQ);

            }

        });

    }
    // TAO CAC BO LANG NGHE
    View.OnClickListener boLangNgheXuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // code xu ly cong
            String strSo1 = edtSoA.getText().toString();
            String strSo2 = edtSoB.getText().toString();
            //
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            // tinh
            double tong = soA + soB;
            String strKQ = String.valueOf(tong);
            tvKetQua.setText(strKQ);

        }
    };
    View.OnClickListener boLangNgheXuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // code xu ly cong
            String strSo1 = edtSoA.getText().toString();
            String strSo2 = edtSoB.getText().toString();
            //
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            // tinh
            double tong = soA - soB;
            String strKQ = String.valueOf(tong);
            tvKetQua.setText(strKQ);

        }
    };
    View.OnClickListener boLangNgheXuLyNhan = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // code xu ly cong
            String strSo1 = edtSoA.getText().toString();
            String strSo2 = edtSoB.getText().toString();
            //
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            // tinh
            double tong = soA * soB;
            String strKQ = String.valueOf(tong);
            tvKetQua.setText(strKQ);

        }
    };


    //Tim view
    void TimView() {
        edtSoA = (EditText) findViewById(R.id.editTextA);
        edtSoB = (EditText) findViewById(R.id.editTextB);
        btnCong = (Button) findViewById(R.id.buttonCong);
        btnTru = (Button) findViewById(R.id.buttonTru);
        btnNhan = (Button) findViewById(R.id.buttonNhan);
        btnChia = (Button) findViewById(R.id.buttonChia);


    }
}




