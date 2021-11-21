package com.example.gatemocktest;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gatemocktest.databinding.ActivityMainBinding;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    ListView listView;
    String[] Subjects = {"Engineering Mathematics", "Digital Logic", "Computer Organization and Architecture", "Programming and Data-Structures",
                         "Algorithms", "Theory of Computation", "Compiler Design", "Operating System", "Databases", "Computer Networks"};

    private BottomNavigationView bottomNavigationView;
//    private BottomNavigationView.OnNavigationItemSelectedListener listener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//        @Override
//        public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
//            switch (item.getItemId()){
//                case R.id.nav_home:
//                    setFragment(new HomeFragment());
//                    return true;
//                case R.id.nav_account:
//                    setFragment(new AccountFragment());
//                    return true;
//                case R.id.nav_leaderboard:
//                    setFragment(new LeaderboardFragment());
//                    return true;
//            }
//            return false;
//        }
//    };
//    private FrameLayout mainFrame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        setSupportActionBar(binding.appBarMain.toolbar);

//        bottomNavigationView.setOnNavigationItemSelectedListener(listener);
//        setFragment(new HomeFragment());
//        bottomNavigationView.findViewById(R.id.bottomNavigationBar);
//        mainFrame.findViewById(R.id.main_frame);
                // Built-in adapter
        listView = findViewById(R.id.list_View);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Subjects);
        listView.setAdapter(adapter);
        // Listener on ArrayAdapter listView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i;
//                switch (position){
                if(position == 0) {
                        i = new Intent(MainActivity.this, EM_Activity.class);
                        startActivity(i);
                        finish();
                        Toast.makeText(MainActivity.this, "Engineering Mathematics", Toast.LENGTH_SHORT).show();
                    }
                else if(position == 1) {
                    i = new Intent(MainActivity.this, DL_Activity.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(MainActivity.this, "Digital Logic", Toast.LENGTH_SHORT).show();
                }
                else if(position == 2) {
                    i = new Intent(MainActivity.this, COA_Activity.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(MainActivity.this, "Computer Organization and Architecture", Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {
                    i = new Intent(MainActivity.this, DS_Activity.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(MainActivity.this, "Programming and Data-Structures", Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {
                    i = new Intent(MainActivity.this, Algo_Activity.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(MainActivity.this, "Algorithms", Toast.LENGTH_SHORT).show();
                }
                else if(position == 5) {
                    i = new Intent(MainActivity.this, TOC_Activity.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(MainActivity.this, "Theory of Computation", Toast.LENGTH_SHORT).show();
                }
                else if(position == 6) {
                    i = new Intent(MainActivity.this, CD_Activity.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(MainActivity.this, "Compiler Design", Toast.LENGTH_SHORT).show();
                }
                else if(position == 7) {
                    i = new Intent(MainActivity.this, OS_Activity.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(MainActivity.this, "Operating System", Toast.LENGTH_SHORT).show();
                }
                else if(position == 8) {
                    i = new Intent(MainActivity.this, DBMS_Activity.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(MainActivity.this, "Databases", Toast.LENGTH_SHORT).show();
                }
                else if(position == 9) {
                    i = new Intent(MainActivity.this, CN_Activity.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(MainActivity.this, "Computer Networks", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

//    private void setFragment(Fragment fragment){
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(mainFrame.getId(), fragment);
//        fragmentTransaction.commit();
//    }
}