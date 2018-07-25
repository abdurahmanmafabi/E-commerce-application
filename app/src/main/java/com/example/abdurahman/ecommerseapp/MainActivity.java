package com.example.abdurahman.ecommerseapp;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView BusinessRecyclerView;
private BusinessAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MakeBusiness.class);
                startActivity(intent);
            }
        });
    }
    protected void onResum(){
        super.onResume();

        List<Business> businessList = getDb().businessDao().selectAllBusiness();
        mAdapter.setBusiness(businessList);

        }

    private AppDataBase getDb() {
        String dataName = "room_db";
        AppDataBase db = Room.databaseBuilder(getApplicationContext(), AppDataBase.class, dataName).allowMainThreadQueries().build();
        return db;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onItemClick(int itemId){
        Intent intent = new Intent(this,ItemsDetailsActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT,itemId);

        startActivity(intent);
    }
}
