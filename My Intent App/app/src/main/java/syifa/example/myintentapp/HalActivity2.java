package syifa.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HalActivity2 extends AppCompatActivity {

    public static String KEY_DATA = "data";
    private String receivedData = null;
    private TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal2);

        editText = (TextView) findViewById(R.id.edittext);
        receivedData = getIntent().getStringExtra(KEY_DATA);
        editText.setText(receivedData);
    }
}
