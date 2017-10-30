package com.example.user.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by YUNAHKIM on 2017-10-31.
 */

public class huihyeonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.huihyeon);

        Button btn1 = (Button) findViewById(R.id.huihyeondongButtonGoogle);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(huihyeonActivity.this, GoogleActivity.class);
                startActivity(i);
            }
        });
    }
}
