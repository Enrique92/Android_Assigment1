package com.example.kike.assigment1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button leftBtn, rightBtn;
    TextView mColour, mScore;
    private int mPoints = 0;
    private int mRandomNumber1, mRandomNumber2, mRandomNum;
    Random rnd;
    int[] mColors;
    String[] mNamesColours;


    public MainActivity() {
        this.mColors = new int[]{Color.RED, Color.BLUE, Color.GREEN, Color.MAGENTA, Color.YELLOW, Color.BLACK, Color.WHITE, Color.GRAY, Color.CYAN, Color.LTGRAY};
        this.mNamesColours = new String[]{"Red", "Blue", "Green", "Magenta", "Yellow", "Black", "White", "Gray", "Cyan", "Light Gray"};;
        this.rnd = new Random();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        leftBtn = findViewById(R.id.leftbtn);
        rightBtn = findViewById(R.id.rightbtn);
        mColour = findViewById(R.id.colour);
        mScore = findViewById(R.id.score);

        // Call the constructor that initialized the arrays
        new MainActivity();
        // Call the random values
        mRandomValues();
        // Initialized the colours
        mInitializedColours();
    }

    private void mChangeColourButtons(View v) {
        if (v.getId() == R.id.leftbtn) {
            if (mRandomNumber1 == mRandomNumber2) {
                Toast.makeText(this, "Right", Toast.LENGTH_LONG).show();
                mPoints++;
            } else if (mRandomNum == 1) {
                Toast.makeText(this, "Right", Toast.LENGTH_LONG).show();
                mPoints++;
            } else {
                Toast.makeText(this, "Wrong", Toast.LENGTH_LONG).show();
                mPoints--;
            }
        } else if (v.getId() == R.id.rightbtn) {
            if (mRandomNumber1 == mRandomNumber2) {
                Toast.makeText(this, "Right", Toast.LENGTH_LONG).show();
                mPoints++;
            } else if (mRandomNum != 1) {
                Toast.makeText(this, "Right", Toast.LENGTH_LONG).show();
                mPoints++;
            } else {
                Toast.makeText(this, "Wrong", Toast.LENGTH_LONG).show();
                mPoints--;
            }
        }
        mScore.setText(getString(R.string.Score) + mPoints);
        mRandomValues();
        leftBtn.setBackgroundColor(mColors[mRandomNumber1]);
        rightBtn.setBackgroundColor(mColors[mRandomNumber2]);
        if (mRandomNum == 1) {
            mColour.setText(mNamesColours[mRandomNumber1]);
        } else {
            mColour.setText(mNamesColours[mRandomNumber2]);
        }
    }

    public void mRandomValues() {
        // Random number value
        mRandomNum = rnd.nextInt(2) + 1;
        // Random values between 0 and 9 for the colours
        mRandomNumber1 = rnd.nextInt(10);
        mRandomNumber2 = rnd.nextInt(10);
    }

    public void mInitializedColours() {
        leftBtn.setBackgroundColor(mColors[mRandomNumber1]);
        rightBtn.setBackgroundColor(mColors[mRandomNumber2]);

        if (mRandomNum == 1) {
            mColour.setText(mNamesColours[mRandomNumber1]);
        } else {
            mColour.setText(mNamesColours[mRandomNumber2]);
        }
    }
}
