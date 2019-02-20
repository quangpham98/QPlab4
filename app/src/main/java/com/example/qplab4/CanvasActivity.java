package com.example.qplab4;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        setTitle("Canvas Activity");
        ConstraintLayout canvas_layout = findViewById(R.id.canvas_layout);
        canvas_layout.setBackgroundColor(Color.parseColor(getIntent().getStringExtra("color")));
    }
}
