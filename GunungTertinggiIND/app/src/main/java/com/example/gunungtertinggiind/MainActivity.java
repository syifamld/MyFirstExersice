package com.example.gunungtertinggiind;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvGunung;
    private ArrayList<Gunung> list = new ArrayList<>();
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#053E77")));

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Gunung Tertinggi di Indonesia");
        }

        rvGunung = findViewById(R.id.rv_gunung);
        rvGunung.setHasFixedSize(true);

        list.addAll(DataGunung.getListData());
        showRecycleList();
    }
    private void showRecycleList(){
        rvGunung.setLayoutManager(new LinearLayoutManager(this));
        CardGunungAdapter cardGunungAdapter = new CardGunungAdapter(this, list);
        rvGunung.setAdapter(cardGunungAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profilq:
                Intent MoveProfil = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(MoveProfil);
                return true;
        }
        return false;
    }
}
