package com.example.additionnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //กำหนดค่าตัวแปร
    private EditText num1;
    private EditText num2;
    private Button btnCal;
    private TextView sumValue;
    private TextView minValue;
    private TextView maxValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        btnCal = (Button) findViewById(R.id.btnCal);
        sumValue = (EditText) findViewById(R.id.sumValue);
        minValue = (EditText) findViewById(R.id.minValue);
        maxValue = (EditText) findViewById(R.id.maxValue);


        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1Str = num1.getText().toString();
                String num2Str = num2.getText().toString();

                if (!num1Str.isEmpty() && !num2Str.isEmpty()) {         //ตรวจสอบค่าว่ามีหรือไม่ และถ้ามีจะเปลี่ยนจาก String เป็น int
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);

                    calSum(num1, num2);
                    calMin(num1, num2);
                    calMax(num1, num2);

                } else {
                    Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();

                    sumValue.setText("");           //แสดงค่าในช่อง
                    minValue.setText("");
                    maxValue.setText("");
                }
            }
        });
    }
    private void calSum(int num1, int num2) {           //num1 + num2
        int sum = num1 + num2;
        sumValue.setText(String.valueOf(sum));
    }

    private void calMin(int num1, int num2) {           //หาค่าน้อยสุดระหว่าง num1, num2
        int min = Math.min(num1, num2);
        minValue.setText(String.valueOf(min));
    }

    private void calMax(int num1, int num2) {           //หาค่ามากสุดระหว่างค่า num1, num2
        int max = Math.max(num1, num2);
        maxValue.setText(String.valueOf(max));
    }
}
