package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class OtherPage extends AppCompatActivity {

    //Variables
    private TextView NumberDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagetwo);

        //Get Reference from XML
        NumberDisplay = (TextView) findViewById(R.id.NumberDisplay);
    }

    public void GenerateNumber(View view) {
        int viewID = view.getId();
        switch (viewID) {
            case R.id.ClickHere:
                Random random = new Random();
                int randValue = random.nextInt(100);
                randValue += 1;
                NumberDisplay.setText(Integer.toString(randValue));
        }
    }
}
