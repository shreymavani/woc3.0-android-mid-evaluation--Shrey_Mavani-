package com.shrey_m.time_table;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void monday(View view){
        Intent intent=new Intent(this,Mond.class);
        startActivity(intent);
    }

    public void tuesday(View view){
        Intent intent=new Intent(this,Tus.class);
        startActivity(intent);
    }

    public void wednesday(View view){
        Intent intent=new Intent(this,Wed.class);
        startActivity(intent);
    }

    public void Thursday(View view){
        Intent intent=new Intent(this,Thur.class);
        startActivity(intent);
    }

    public void Friday(View view){
        Intent intent=new Intent(this,Fri.class);
        startActivity(intent);
    }

    public void Satday(View view){
        Intent intent=new Intent(this,Sat.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}