package dat.tht.bottomnavigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottom_Navigation;
    private FrameLayout frame_Layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bottom_Navigation = findViewById(R.id.bottomNavigationView);

        frame_Layout = findViewById(R.id.fram_layout);
        bottom_Navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();

                if (itemId == R.id.home) {
                    LoadFragment(new HomeFragment(), false);


                } else if (itemId == R.id.profile) {
                    LoadFragment(new ProfileFragment(), false);

                } else if (itemId == R.id.settings) {
                    LoadFragment(new SettingsFragment(), false);

                }


                return true;
            }

        });
        LoadFragment(new HomeFragment(),true);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void LoadFragment(Fragment fragment, boolean check){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if(check){
            fragmentTransaction.add(R.id.fram_layout, fragment);
        }
        else {
            fragmentTransaction.replace(R.id.fram_layout, fragment);
        }
        fragmentTransaction.commit();
    }
}