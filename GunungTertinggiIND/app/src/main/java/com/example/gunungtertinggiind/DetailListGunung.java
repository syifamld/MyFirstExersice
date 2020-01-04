package com.example.gunungtertinggiind;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListGunung extends AppCompatActivity {
    private int gunung_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Gunung> listgunung = new ArrayList<>();
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_gunung);
        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#053E77")));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        gunung_id = getIntent().getIntExtra("gunung_id", 0);
        tvName = findViewById(R.id.nama_gunung);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listgunung.addAll(DataGunung.getListData());
        setLayou();
    }

    void setLayou() {
        tvName.setText(listgunung.get(gunung_id).getName());
        tvDesc.setText(listgunung.get(gunung_id).getDescription());
        Glide.with(this)
                .load(listgunung.get(gunung_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profilq:
                Intent MoveProfil = new Intent(DetailListGunung.this, ProfilActivity.class);
                startActivity(MoveProfil);

                return true;
        }
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }
}
