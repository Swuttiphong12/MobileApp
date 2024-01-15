package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox appleCheckBox, bananaCheckBox, grapeCheckBox, orangeCheckBox;
    Button btnSubmit;
    TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appleCheckBox = (CheckBox) findViewById(R.id.appleCheckBox);
        bananaCheckBox = (CheckBox) findViewById(R.id.bananaCheckBox);
        grapeCheckBox = (CheckBox) findViewById(R.id.grapeCheckBox);
        orangeCheckBox = (CheckBox) findViewById(R.id.orangeCheckBox);
        show = (TextView) findViewById(R.id.show);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String message = "";
        if (appleCheckBox.isChecked()) message += "Selected Apple\n";
        else message += "No selected CheckBox 1\n";
        if (bananaCheckBox.isChecked()) message += "Selected Banana\n";
        else message += "No selected CheckBox 2\n";
        if (grapeCheckBox.isChecked()) message += "Selected Grape\n";
        else message += "No selected CheckBox 3\n";
        if (orangeCheckBox.isChecked()) message += "Selected Orange\n";
        else message += "No selected CheckBox 4\n";
        show.setText(message);
    }
}