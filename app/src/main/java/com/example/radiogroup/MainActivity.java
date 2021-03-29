package com.example.radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    Switch sw;
    Button btn;
    LinearLayout lay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         r1 = findViewById(R.id.radioButton);
         r2 = findViewById(R.id.radioButton2);
         r3 = findViewById(R.id.radioButton3);
         r4 = findViewById(R.id.radioButton4);
         sw = findViewById(R.id.switch1);
         btn = findViewById(R.id.button);
         lay = findViewById(R.id.nice);

    }

    public void click1(View view) {
        if (sw.isChecked()){
            lay.setBackgroundResource(R.drawable.blue);
        }
    }

    public void click2(View view) {
        if (sw.isChecked()){
            lay.setBackgroundResource(R.drawable.red);
        }
    }

    public void click3(View view) {
        if (sw.isChecked()){
            lay.setBackgroundResource(R.drawable.green);
        }
    }

    public void click4(View view) {
        if (sw.isChecked()){
            lay.setBackgroundResource(R.drawable.yellow);
        }
    }

    public void click0(View view) {
        if (!(sw.isChecked())){
            if (r1.isChecked()){
                lay.setBackgroundResource(R.drawable.blue);
            }
            if (r2.isChecked()){
                lay.setBackgroundResource(R.drawable.red);
            }
            if (r3.isChecked()){
                lay.setBackgroundResource(R.drawable.green);
            }
            if (r4.isChecked()){
                lay.setBackgroundResource(R.drawable.yellow);
            }
        }

    }
}

