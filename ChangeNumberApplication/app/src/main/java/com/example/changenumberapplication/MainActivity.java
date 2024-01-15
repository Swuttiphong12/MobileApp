package com.example.changenumberapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText decText;
    private Button btnCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        decText = (EditText) findViewById(R.id.decText);
        btnCal = (Button) findViewById(R.id.btnCal);

        btnCal.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dec;
                String textDec = decText.getText().toString();
                if (textDec.isEmpty()){
                    Toast.makeText(MainActivity.this, "Data not correct", Toast.LENGTH_SHORT).show();
                }else {
                    dec = Integer.parseInt(textDec);
                    String binText = "";
                    binText = decToBin(dec);
                    Toast.makeText(MainActivity.this, binText, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private String decToBin(int dec){
        return ("Binary Number: " + Integer.toBinaryString(dec));
    }
}