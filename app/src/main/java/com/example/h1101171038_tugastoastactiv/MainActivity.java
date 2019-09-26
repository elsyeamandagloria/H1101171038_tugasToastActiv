package com.example.h1101171038_tugastoastactiv;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount =38;
    private TextView mShowCount = findViewById(R.id.count_down);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.count_down);
    }


    @SuppressLint("SetTextI18n")
    public void countDown(View view) {
        --mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
