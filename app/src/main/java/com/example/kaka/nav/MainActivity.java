package com.example.kaka.nav;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationView nav=(NavigationView)findViewById(R.id.drawer);
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id =menuItem.getItemId();
                if (id ==R.id.add){
          Toast.makeText(MainActivity.this, "add", Toast.LENGTH_SHORT).show();
                }
         switch (id) {
             case R.id.setting :
                 Toast.makeText(MainActivity.this, "setting", Toast.LENGTH_SHORT).show();
                 break;
             case R.id.edit:
                 Toast.makeText(MainActivity.this, "edit accout", Toast.LENGTH_SHORT).show();
                 break;
         }
                return true;
            }
        });



    }
}
