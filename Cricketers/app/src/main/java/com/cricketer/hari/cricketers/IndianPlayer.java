package com.cricketer.hari.cricketers;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class IndianPlayer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_player);
        ListView IndianCricketers= (ListView)findViewById(R.id.indiancaptainsView);
        String[] IndianPlayers= new String[] {"DHONI","SAURAV GANGULY","KAPIL DEV","SUNIL GAVASKAR","4","5","6","7"};
        ArrayAdapter<String> IndianPlayersAdapter=new ArrayAdapter<String>(this,R.layout.indianlist,IndianPlayers);
        IndianCricketers.setAdapter(IndianPlayersAdapter);
        int a=IndianCricketers.getCount();
        Log.d("The value of a is ",""+a);
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
