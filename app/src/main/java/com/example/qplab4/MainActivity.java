package com.example.qplab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String [] colorList=getResources().getStringArray(R.array.Colors);



        final View layout = findViewById(R.id.layout);
        Spinner spin = (Spinner) findViewById(R.id.spinner);

        ColorAdapter pa = new ColorAdapter(this,colors);
        spin.setAdapter(pa);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean isFirstChoice=true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this,CanvasActivity.class);
                if(isFirstChoice){
                    isFirstChoice = false;
                    return;
                }
                else {
                    intent.putExtra("color", colors.get(position));
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                layout.setBackgroundColor(Color.WHITE);
            }


        }








        );

    }



}