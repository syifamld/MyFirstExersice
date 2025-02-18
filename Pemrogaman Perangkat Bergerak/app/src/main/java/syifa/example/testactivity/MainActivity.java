package syifa.example.testactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String msg = "Android : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(msg, "OnCreate() dijalankan");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(msg, "onStart() dijalankan");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(msg, "onPause() sedang dijalankan");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(msg,"onStop() sedang berjalan");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(msg,"onDestroy() dijalankan");
    }
}
