package com.cricketer.hari.cricketers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;
import java.util.Arrays;


public class IndianPlayer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_player);
        final Class playersClass[]={Dhoni.class,Saurav.class};
        final ListView IndianCricketers= (ListView)findViewById(R.id.indiancaptainsView);
        final String[] IndianPlayers= new String[] {"DHONI","SAURAV GANGULY","KAPIL DEV","SUNIL GAVASKAR","SURESH RAINA","5","6","7"};
        ArrayAdapter<String> IndianPlayersAdapter=new ArrayAdapter<String>(this,R.layout.indianlist,IndianPlayers);
        IndianCricketers.setAdapter(IndianPlayersAdapter);
        IndianCricketers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(getApplicationContext(),playersClass[position]);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.indian_player, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
