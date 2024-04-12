package till.edu.tuanhoconl_usingrecycler;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recylerViewDatas;
    RecyclerView recyclerViewLandScape;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //3
        recylerViewDatas = getDataForRecyclerView();
        //4
        recyclerViewLandScape = findViewById(R.id.RecyclerLand);
        //5
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        //6
        landScapeAdapter = new LandScapeAdapter(this,recylerViewDatas);
        //7
        recyclerViewLandScape.setAdapter(landScapeAdapter);




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("cauvangdanang","Cầu vàng Đà Nẵng");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("ruongbacthang","Ruộng bậc thang"));
        dsDuLieu.add(new LandScape("thitransuongmosapa","Thị trấn sương mờ Sapa"));
        dsDuLieu.add(new LandScape("vinhhalong","Vịnh Hạ Long"));
        return dsDuLieu;
    }
}