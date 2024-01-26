package com.example.screendemo.hdpi;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.screendemo.R;
import com.example.screendemo.Utils;

public class HdpiActivity extends AppCompatActivity {

    private TextView tvTest;
    private TextView tvTest1;
    private TextView tvTest2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdpi);
        tvTest = findViewById(R.id.tv_test);
        tvTest.setText(R.string.screen_dpi);
        tvTest1 = findViewById(R.id.tv_test1);
        tvTest1.setText("屏幕宽度: " + Utils.getScreenWidth(this));
        tvTest2 = findViewById(R.id.tv_test2);
        tvTest2.setText(Utils.getDisplayMetrics(this));
    }
}