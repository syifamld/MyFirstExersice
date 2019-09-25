package syifa.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnMoveActivity;
    Button btnMoveActivityWithData;
    Button btndial;
    Button btnwebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityWithData = findViewById(R.id.btn_move_data);
        btnMoveActivityWithData.setOnClickListener(this);

        btndial = findViewById(R.id.btn_dial);
        btndial.setOnClickListener(this);

        btnwebsite = findViewById(R.id.btn_website);
        btnwebsite.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.btn_move_activity:
               Intent moveIntent = new Intent(MainActivity.this, NewActivity.class);
               startActivity(moveIntent);
               break;
           case R.id.btn_move_data:
           Intent moveData = new Intent(MainActivity.this,MoveActivityWithData.class);
           moveData.putExtra(MoveActivityWithData.EXTRA_NAME, "Syifa Maulida");
           moveData.putExtra(MoveActivityWithData.EXTRA_AGE, 19);
           startActivity(moveData);
           break;
           case R.id.btn_dial:
               String phoneNumber="085850195473";
               Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
               startActivity(dialPhone);
               break;
           case R.id.btn_website:
               String website = "https://www.polines.ac.id/id/";
               Intent towebsite = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
               startActivity(towebsite);
               break;
       }
    }
}
