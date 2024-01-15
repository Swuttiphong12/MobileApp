package com.example.hellologcatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MY_APP";
    private int data = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnError = (Button) findViewById(R.id.btnError);
        btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Show Logcat Error", Toast.LENGTH_LONG).show();
                Log.e(TAG, "Test log.e data = " + data); // error
            }
        });

        Button btnWarning = (Button) findViewById(R.id.btnWarning);
        btnWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Show Logcat Warning", Toast.LENGTH_LONG).show();
                Log.w(TAG, "Test log.w data = " + data); //warning
            }
        });

        Button btnInformation = (Button) findViewById(R.id.btnInformation);
        btnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Show Logcat Information", Toast.LENGTH_LONG).show();
                Log.i(TAG, "Test log.i data = " + data); //information
            }
        });

        Button btnDebug = (Button) findViewById(R.id.btnDebug);
        btnDebug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Show Logcat Debug", Toast.LENGTH_LONG).show();
                Log.d(TAG, "Test log.d data = " + data); //debug
            }
        });

        Button btnVerbose =(Button) findViewById(R.id.btnVerbose);
        btnVerbose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Show Logcat Verbose", Toast.LENGTH_LONG).show();
                Log.v(TAG, "Test log.v data = " + data); //verbose
            }
        });
    }
}