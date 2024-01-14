package com.example.countnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCountUp, btnCountDown, btnReset;          //ประกาศตัวแปร
    TextView number;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCountUp = findViewById(R.id.btnCountUp);         //หา ID ของตัวแปรต่างๆ
        btnCountDown = findViewById(R.id.btnCountDown);
        btnReset = findViewById(R.id.btnReset);
        number = findViewById(R.id.number);

        btnCountUp.setOnClickListener(this);
        btnCountDown.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }
    
    public void onClick(View view){
        if (view.getId() == R.id.btnCountUp){               //กดปุ่ม countup จะเพิ่มทีละ 1
            count++;
        }else if (view.getId() == R.id.btnCountDown){       //กดปุ่ม countdown จะลดทีละ 1
            count--;
        } else if (view.getId() == R.id.btnReset) {         //กดปุ่ม reset จะรีค่าไปเป็น 0
            count = 0;
        }
        number.setText(String.valueOf(count));              //แสดงค่าในช่อง
        
        if (count % 5 == 0){                                //ถ้าเลขในช่องหาร 5 ได้ลงตัวจะแสดงข้อความ
            Toast.makeText(this, "เลขนี้หาร 5 ได้ลงตัว", Toast.LENGTH_SHORT).show();
        }
    }
}