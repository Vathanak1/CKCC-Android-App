package kh.edu.rupp.ckcc.ckcc;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Reference to toolbar in UI
        Toolbar toolbar = findViewById(R.id.toolbar);

        // Replace action with the toolbar
        setSupportActionBar(toolbar);

        // Customize actionbar
        getSupportActionBar().setTitle("CKCC Mobile App");

        // Integrate drawer layout with toolbar
        drawerLayout = findViewById(R.id.lyt_main);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        // NavigationView
        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.mnu_home) {
                    onHomeClick();
                }else if(item.getItemId() == R.id.mnu_news){
                    onNewsClick();
                } else if(item.getItemId() == R.id.mnu_events){
                    onEventsClick();
                }else{
                    Toast.makeText(MainActivity.this, "User clicks others", Toast.LENGTH_LONG).show();
                }


                return false;
            }
        });

    }

    private void onHomeClick(){
        // Close drawer
        drawerLayout.closeDrawers();

        // Replace home fragment
        HomeFragment homeFragment = new HomeFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.lyt_fragment, homeFragment);
        fragmentTransaction.commit();
    }

    private void onNewsClick(){
        // Close drawer
        drawerLayout.closeDrawers();

        // Replace fragment
        NewsFragment newsFragment = new NewsFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.lyt_fragment, newsFragment);
        fragmentTransaction.commit();
    }

    private void onEventsClick(){
        // Close drawer
        drawerLayout.closeDrawers();

        // Replace fragment
        EventsFragment eventsFragment = new EventsFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.lyt_fragment, eventsFragment);
        fragmentTransaction.commit();
    }

}
















