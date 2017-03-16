package com.example.yhisl.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private TextView textViewTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTitle = (TextView)findViewById(R.id.textViewTitle);
        textViewTitle.setText("hello,CardVmiew");
    }
}
