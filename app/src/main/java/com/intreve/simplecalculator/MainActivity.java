package com.intreve.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNum1, etNum2;
    AppCompatButton btnPlus, btnMinus, btnDivide, btnMultiply;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1=findViewById(R.id.etNum1);
        etNum2=findViewById(R.id.etNum2);
        btnPlus=findViewById(R.id.btnPlus);
        btnMinus=findViewById(R.id.btnMinus);
        btnDivide=findViewById(R.id.btnDivide);
        btnMultiply=findViewById(R.id.btnMultiply);
        tvResult=findViewById(R.id.tvResult);


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1, num2;
                num1=etNum1.getText().toString();
                num2=etNum2.getText().toString();

                double n1=Double.parseDouble(num1);
                double n2=Double.parseDouble(num2);
                double result=n1+n2;

                String res=Double.toString(result);


                tvResult.setText("Answer: "+res);

                Toast.makeText(MainActivity.this, "Answer: "+res, Toast.LENGTH_SHORT).show();
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1, num2;
                num1=etNum1.getText().toString();
                num2=etNum2.getText().toString();

                double n1=Double.parseDouble(num1);
                double n2=Double.parseDouble(num2);
                double result=n1-n2;

                String res=Double.toString(result);


                tvResult.setText("Answer: "+res);

                Toast.makeText(MainActivity.this, "Answer: "+res, Toast.LENGTH_SHORT).show();
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1, num2;
                num1=etNum1.getText().toString();
                num2=etNum2.getText().toString();

                double n1=Double.parseDouble(num1);
                double n2=Double.parseDouble(num2);
                double result=n1*n2;

                String res=Double.toString(result);


                tvResult.setText("Answer: "+res);

                Toast.makeText(MainActivity.this, "Answer: "+res, Toast.LENGTH_SHORT).show();
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1, num2;
                num1=etNum1.getText().toString();
                num2=etNum2.getText().toString();

                double n1=Double.parseDouble(num1);
                double n2=Double.parseDouble(num2);
                double result=n1/n2;

                String res=Double.toString(result);


                tvResult.setText("Answer: "+res);

                Toast.makeText(MainActivity.this, "Answer: "+res, Toast.LENGTH_SHORT).show();
            }
        });






    }
}