package com.xilin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button customView, customView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customView = (Button) findViewById(R.id.btn_customview);
        customView2 = (Button) findViewById(R.id.btn_customview2);
        customView.setOnClickListener(this);
        customView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_customview:
                startActivity(new Intent(MainActivity.this,CustomViewAct.class));
                break;
            case R.id.btn_customview2:
                break;
            default:
                break;
        }
    }
}
