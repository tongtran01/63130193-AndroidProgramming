package dat.tht.vidu2_intent;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Activity_Login extends AppCompatActivity {
    EditText edtUserName;
    EditText edtPassWord;
    EditText edtMail;
    Button btnOK;
    TextView txtThongBao;

    void dieukhien(){
        edtUserName = findViewById(R.id.edtUserName);
        edtPassWord = findViewById(R.id.edtPass);
        edtMail = findViewById(R.id.edtMail);
        btnOK = findViewById(R.id.btnOK);
        txtThongBao = findViewById(R.id.tvThongBao);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        dieukhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        btnOK.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String userName = edtUserName.getText().toString();
                String passWord = edtPassWord.getText().toString();
                String Mail = edtMail.getText().toString();
                if(userName.equals("tongtran") && passWord.equals("123") &&
                        isValidEmail(Mail)){
                    Intent intent = new Intent(Activity_Login.this,Activity_Home.class);
                    intent.putExtra("USERNAME", userName);
                    startActivity(intent);
                }
                else {
                    txtThongBao.setText("Tên người dùng hoặc mật khẩu không đúng, hoặc định dạng email không hợp lệ.");
                }

            }
        });

    }
     boolean isValidEmail(String email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();

    }
}
