package com.tj.jikbanglistviewexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tj.jikbanglistviewexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

        act.cleanRoomCountTxt.setText("32개");
    }
}
