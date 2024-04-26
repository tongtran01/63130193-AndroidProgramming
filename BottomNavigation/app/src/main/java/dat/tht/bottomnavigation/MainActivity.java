package dat.tht.bottomnavigation;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bottom_Navigation = findViewById(R.id.bottomNavigationView);

        frame_Layout = findViewById(R.id.fram_layout);
        bottom_Navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();

                if (itemId == R.id.home) {
                    replaceFragment(new HomeFragment(), false);


                } else if (itemId == R.id.profile) {
                    replaceFragment(new ProfileFragment(), false);

                } else if (itemId == R.id.settings) {
                    replaceFragment(new SettingsFragment(), false);

                }

                return true;
            }

        });
        replaceFragment(new HomeFragment(),true);
    }

    private void replaceFragment(Fragment fragment, boolean check){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if(check){
            fragmentTransaction.add(R.id.fram_layout, fragment);
        }
        else {

            Fragment currentFragment = fragmentManager.findFragmentById(R.id.fram_layout);
            if (currentFragment != null) {
                fragmentTransaction.remove(currentFragment);
            }

            fragmentTransaction.add(R.id.fram_layout, fragment);
        }
        fragmentTransaction.commit();
    }

}