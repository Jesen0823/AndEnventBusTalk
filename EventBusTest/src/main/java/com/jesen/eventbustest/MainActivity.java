package com.jesen.eventbustest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Button toSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EventBus.getDefault().register(this);

        toSecond = findViewById(R.id.toSecond);
        toSecond.setOnClickListener(view -> toSecondPage());
    }

    private void toSecondPage() {
       startActivity(new Intent(this,SencodActivity.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }

    }

    // 订阅方法
    @Subscribe
    public void event(String s){
        Log.d(TAG,"----event s: "+s);
    }
}