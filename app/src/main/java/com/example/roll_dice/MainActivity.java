package com.example.roll_dice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.roll_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });

    }

    private void rollDice() {
        int randomInt = rand.nextInt(6) + 1;
        TextView tv = findViewById(R.id.textView);
        tv.setText(getString(R.string.roll_text) + randomInt);
        ImageView iv = findViewById(R.id.imageView);
        switch (randomInt) {
            case 1:
                iv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice_1));
                break;
            case 2:
                iv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice_2));
                break;
            case 3:
                iv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice_3));
                break;
            case 4:
                iv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice_4));
                break;
            case 5:
                iv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice_5));
                break;
            default:
                iv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice_6));
        }
    }

}