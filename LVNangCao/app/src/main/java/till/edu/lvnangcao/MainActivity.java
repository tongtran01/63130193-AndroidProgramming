package till.edu.lvnangcao;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import till.edu.lvnangcao.Model.Country;
import till.edu.lvnangcao.adapters.CountryAdapter;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> dsQG;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //b1
        dsQG = new ArrayList<Country>();
        dsQG .add(new Country("VietNam",90,"ngoisao"));
        dsQG .add(new Country("Russia",90,"russia"));
        dsQG .add(new Country("US",90,"us"));

        ListView listView = findViewById(R.id.lvQG);
        CountryAdapter adapter = new CountryAdapter(this,dsQG);
        listView.setAdapter(adapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}