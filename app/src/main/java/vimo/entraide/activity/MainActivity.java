package vimo.entraide.activity;

import vimo.entraide.R;
import vimo.entraide.helper.SQLiteHandler;
import vimo.entraide.helper.SessionManager;

import java.util.HashMap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{



    /*Creation du burger */
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    /*fin*/

    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        /*Creation de la bare du haut*/
        toolbar= (Toolbar) findViewById(R.id.nav_bar);
        setSupportActionBar(toolbar);

        /*Creation burger (ico menu)*/

        mDrawerLayout= (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle= new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        /* fin creation burger */
    }


     /* Pour permetre d'ouvrir le menu */


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_acceuil) {

        } else if (id == R.id.nav_acount) {

        } else if (id == R.id.nav_logout) {



        } else if (id== R.id.nav_publications){

        }

        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}