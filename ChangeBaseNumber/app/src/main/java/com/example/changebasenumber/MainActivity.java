package com.example.changebasenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnChange;                                       //ประกาศตัวแปร
    TextView decimalText, binaryText, octalText, hexatext;
    EditText enNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enNumber = (EditText) findViewById(R.id.enNumber);          //หา ID ของตัวแปรต่างๆ
        btnChange = (Button) findViewById(R.id.btnChange);
        decimalText = (TextView) findViewById(R.id.decimalText);
        binaryText = (TextView) findViewById(R.id.binaryText);
        octalText = (TextView) findViewById(R.id.octalText);
        hexatext = (TextView) findViewById(R.id.hexaText);
    }

    @SuppressLint("SetTextI18n")
    public void buttonChange(View view){
        if(enNumber.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter your number", Toast.LENGTH_SHORT).show();        //ไว้เช็คค่า ถ้าไม่ได้ใส่จะแสดงแจ้งเตือนโดย Toast
        }else {
            int number = Integer.parseInt(enNumber.getText().toString());   //แปลงเป็น int

            String binary = Integer.toBinaryString(number);     //แปลงเป็นฐาน 2
            String octal = Integer.toOctalString(number);       //แปลงเป็นฐาน 8
            String hex = Integer.toHexString(number);           //แปลงเป็นฐาน 16

            decimalText.setText("Decimal : " + number);     //แสดงค่า Decimal
            binaryText.setText("Binary : " + binary);       //แสดงค่า Binary
            octalText.setText("Octal : " + octal);          //แสดงค่า Octal
            hexatext.setText("Hexa : " + hex);              //แสดงค่า Hex
        }

    }
}