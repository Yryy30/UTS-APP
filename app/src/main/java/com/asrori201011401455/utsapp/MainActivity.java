package com.asrori201011401455.utsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Loading();
    }

    void Loading(){
        new Thread(){
            public void run(){
                try{
                    Thread.sleep(5000);
                }catch (Exception ee){ }
                Intent i = new Intent(MainActivity.this, MenuUtama.class);
                MainActivity.this.finish();
                startActivity(i);
            }
        }.start();
    }
}