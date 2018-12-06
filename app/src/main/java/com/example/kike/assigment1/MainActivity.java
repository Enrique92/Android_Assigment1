package com.example.kike.assigment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button leftBtn, rightBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        leftBtn = (Button) findViewById(R.id.leftbtn);
        rightBtn = (Button) findViewById(R.id.rightbtn);
    }

    public void buttonclick(View view) {
        if (view.getId() == R.id.leftbtn) {
            Toast.makeText(this, "LEFT", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "RIGHT", Toast.LENGTH_LONG).show();
        }
    }
}
