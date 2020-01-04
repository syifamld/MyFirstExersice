package syifa.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HalActivity1 extends AppCompatActivity {

    Button btnnexthal;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal1);

        btnnexthal = findViewById(R.id.btnnexthal);

        final EditText editText = (EditText) findViewById(R.id.edittext);

        btnnexthal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        }

    }
    }
}
