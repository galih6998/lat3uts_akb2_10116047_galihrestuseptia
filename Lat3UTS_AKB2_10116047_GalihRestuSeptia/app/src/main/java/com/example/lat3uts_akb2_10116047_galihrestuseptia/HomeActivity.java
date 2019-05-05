package com.example.lat3uts_akb2_10116047_galihrestuseptia;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;



public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragment    = new HomeFragment();
                    break;
                case R.id.navigation_daily:
                    fragment    = new DailyActivityFragment();
                    break;
                case R.id.navigation_gallery:
                    fragment    = new GalleryFragment();
                    break;
                case R.id.navigation_music_video:
                    fragment    = new MusicVideoFragment();
                    break;
                case R.id.navigation_profil:
                    fragment    = new ProfileFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragment).commit();

            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new HomeFragment()).commit();
    }


}
