package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate", "ENTER");

        findViewById(R.id.btn_move).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SubActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart", "ENTER");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume", "ENTER");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause", "ENTER");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop", "ENTER");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart", "ENTER");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "ENTER");
    }
}