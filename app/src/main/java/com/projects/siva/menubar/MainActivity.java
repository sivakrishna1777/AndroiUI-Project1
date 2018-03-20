package com.projects.siva.menubar;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener{

    private DrawerLayout mdrawerlayout;
    private ActionBarDrawerToggle mtoggle;


    //card view home page on click listener
    private CardView bankcard, ideascard, addcard, linkcard;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mdrawerlayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        mtoggle = new ActionBarDrawerToggle(this,mdrawerlayout,R.string.open, R.string.close);

        mdrawerlayout.addDrawerListener(mtoggle);
        mtoggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        //card view
        bankcard = (CardView) findViewById(R.id.bankcardId);
        ideascard = (CardView) findViewById(R.id.ideasid);
        addcard = (CardView) findViewById(R.id.addid);
        linkcard = (CardView) findViewById(R.id.linkid);

        //add click listener to the cards
        bankcard.setOnClickListener(this);
        ideascard.setOnClickListener(this);
        addcard.setOnClickListener(this);
        linkcard.setOnClickListener(this);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mtoggle.onOptionsItemSelected(item)){
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

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.bankcardId:
                i = new Intent(this,bank.class);
                startActivity(i);
                break;
            case R.id.ideasid:
                i = new Intent(this,ideas.class);
                startActivity(i);
                break;
            case R.id.addid:
                i = new Intent(this,add.class);
                startActivity(i);
                break;
            case R.id.linkid:
                i = new Intent(this,link.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
