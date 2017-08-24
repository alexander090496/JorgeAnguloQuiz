package com.i015114.jorgeanguloquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainP2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p2);
    }

    public void irActividaduno(View vista){

        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);



    }
}
