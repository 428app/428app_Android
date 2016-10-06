package com.example.yihang.a428app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class coverpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coverpage);

        Button advancetosignup=(Button) findViewById(R.id.signup);
        advancetosignup.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent=new Intent(coverpage.this, bio_info1.class);
                startActivity(intent);
            }
        });

        Button advancetonext=(Button) findViewById(R.id.signinbutton);
        advancetonext.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent=new Intent(coverpage.this, matchlist.class);
                startActivity(intent);
            }
        });
    }
}
