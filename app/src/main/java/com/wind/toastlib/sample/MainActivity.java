package com.wind.toastlib.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wind.toastlib.ToastUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ToastUtil.showToast(this,"hello");
    }
}
