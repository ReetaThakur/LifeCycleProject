package com.example.lifecycleproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","OnResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity","OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","OnDestroy");
    }
}