package com.sematecjavaproject.logtestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("CheckProcess","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("CheckProcess","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("CheckProcess","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("CheckProcess", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("CheckProcess","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("CheckProcess","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("CheckProcess","onDestroy");
    }
}
