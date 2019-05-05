package com.example.lat3uts_akb2_10116047_galihrestuseptia;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int waktuDelay  = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent   = new Intent(MainActivity.this, WalkthroughActivity.class);
                startActivity(intent);
                finish();
            }
        }, waktuDelay);
    }
}
