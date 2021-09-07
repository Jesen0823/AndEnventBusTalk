package com.jesen.andenventbustalk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;

public class SencodActivity extends AppCompatActivity {

    private Button postBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sencod);


        postBtn = findViewById(R.id.postBtn);
        postBtn.setOnClickListener(view -> post());
    }

    // 发送事件
    private void post() {
        EventBus.getDefault().post("用post发送事件");

    }
}