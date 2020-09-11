package com.longest.ttsunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.longest.ttsunit.util.TTSUtil;

public class MainActivity extends AppCompatActivity {

    private TTSUtil ttsUtil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ttsUtil = new TTSUtil(getApplicationContext());
    }
}