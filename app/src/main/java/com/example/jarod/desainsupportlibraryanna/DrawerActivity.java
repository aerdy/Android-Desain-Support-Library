package com.example.jarod.desainsupportlibraryanna;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


/**
 * Created by jarod on 8/4/15.
 */
public class DrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout dl;
    NavigationView nv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
//        Toolbar tb = (Toolbar) findViewById(R.id.app_bar);
//        setSupportActionBar(tb);
        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.mipmap.ic_launcher);
        ab.setDisplayHomeAsUpEnabled(true);
        dl = (DrawerLayout) findViewById(R.id.drLayour);
        nv = (NavigationView) findViewById(R.id.navigation);
        nv.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            dl.openDrawer(GravityCompat.START);
        }else{
            dl.closeDrawer(GravityCompat.START);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {

        if (menuItem.getItemId() == R.id.navigation_item_1) {
            getSupportFragmentManager().beginTransaction().add(R.id.frLayout, new DataActivity()).addToBackStack(null).commit();
            dl.closeDrawers();
            return true;
        } if (menuItem.getItemId() == R.id.navigation_item_2) {
            getSupportFragmentManager().beginTransaction().add(R.id.frLayout, new DataActivity()).addToBackStack(null).commit();
            dl.closeDrawers();
            return true;
        }

        return false;
    }
}
