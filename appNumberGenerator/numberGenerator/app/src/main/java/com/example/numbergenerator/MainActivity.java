package com.example.numbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView txt = findViewById(R.id.number);
                int max=100;
                int min=0;
                int range=max-min;
                int rand = (int)(Math.random() * range) ;
                String random ="Random Number: "+rand;
                txt.setText(random);

            }
        });
    }


}