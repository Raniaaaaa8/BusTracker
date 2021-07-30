package com.example.win81.bustracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView) findViewById(R.id.image1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennextbus();
            }
        });
        imageView2=(ImageView) findViewById(R.id.image2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennallbus();
            }
        });
        imageView3=(ImageView) findViewById(R.id.image3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openaboutus();
            }
        });


    }
    public void opennextbus(){
        Intent intent= new Intent(this,nextbus.class) ;
        startActivity(intent);
    }
    public void opennallbus(){
        Intent intent2= new Intent(this,allbus.class) ;
        startActivity(intent2);
    }
    public void openaboutus(){
        Intent intent3= new Intent(this,AboutUs.class) ;
        startActivity(intent3);
    }

}
