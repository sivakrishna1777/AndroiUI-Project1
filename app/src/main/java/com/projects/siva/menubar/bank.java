package com.projects.siva.menubar;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class bank extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mdrawerlayout2;
    private ActionBarDrawerToggle mtoggle1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        mdrawerlayout2 = (DrawerLayout) findViewById(R.id.drawerlayout);
        mtoggle1 = new ActionBarDrawerToggle(this,mdrawerlayout2,R.string.open, R.string.close);

        mdrawerlayout2.addDrawerListener(mtoggle1);
        mtoggle1.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mtoggle1.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.My_Account){
            startActivity(new Intent(this, MyAccount.class));
            Toast.makeText(this,"you clicked my account button",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.My_Settings){
            Toast.makeText(this,"you clicked settings button",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.My_logout){
            Toast.makeText(this,"you clicked logout button",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.video){
            startActivity(new Intent(this, video.class));
        }

        return false;
    }
}
