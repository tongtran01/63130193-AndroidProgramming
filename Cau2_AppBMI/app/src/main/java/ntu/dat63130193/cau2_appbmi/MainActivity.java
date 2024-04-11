package ntu.dat63130193.cau2_appbmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edWeight, edHeight;
    CardView cardBtn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edWeight = findViewById(R.id.edkq);
        edHeight = findViewById(R.id.edHeight);
        cardBtn = findViewById(R.id.cardBtn);
        textView = findViewById(R.id.textView);

        cardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weightStr = edWeight.getText().toString();
                String heightStr = edHeight.getText().toString();

                if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
                    float weight = Float.parseFloat(weightStr);
                    float height = Float.parseFloat(heightStr);

                    float bmiIndex = calculateBMI(weight, height);

                    if (bmiIndex > 24) {
                        textView.setText("Thừa cân: " + bmiIndex);
                    } else if (bmiIndex > 18.5) {
                        textView.setText("Cân đối: " + bmiIndex);
                    } else {
                        textView.setText("Thiếu cân: " + bmiIndex);
                    }
                } else {
                    textView.setText("Vui lòng nhập các giá trị.");
                }
            }
        });
    }

    private float calculateBMI(float weight, float height) {
        return weight / (height * height);
    }
}