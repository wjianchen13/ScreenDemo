package com.example.screendemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.screendemo.hdpi.HdpiActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 测试屏幕的分辨率
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, HdpiActivity.class));
    }

}