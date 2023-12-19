package com.example.mixandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    GridLayout grid;
    Button btnt;
    TableLayout tt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = findViewById(R.id.GridLayout1);
        tt = findViewById(R.id.timetable);
        btnt = findViewById(R.id.btnt);
        Button btngr = (Button)findViewById(R.id.btngrid);
        
        btnt.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                    tt.setVisibility(View.VISIBLE);

           }
        });
        btngr.setOnLongClickListener(

                new Button.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                grid.setVisibility(View.VISIBLE);
                return true;
            }
        } );
            }
}