package com.brilliance.biit.universityassistantfree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculator extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

      final  EditText edt = (EditText)findViewById(R.id.edit);
        final  EditText edt1 = (EditText)findViewById(R.id.edit1);

        final TextView txt = (TextView)findViewById(R.id.textView);

        final Button plus = (Button)findViewById(R.id.btn);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt.length()==0){
                    Toast.makeText(calculator.this,"Enter first number",Toast.LENGTH_SHORT).show();
                return;
                }
                if(edt1.length()==0){
                    Toast.makeText(calculator.this,"Enter second number",Toast.LENGTH_SHORT).show();
                    return;
                }



                double num1,num2,sum;
                num1 = Double.parseDouble(edt.getText().toString());
                num2 = Double.parseDouble(edt1.getText().toString());
                sum = num1 + num2;
                txt.setText(Double.toString(sum));


            }
        });



        final Button minus = (Button)findViewById(R.id.btn1);

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt.length()==0){
                    Toast.makeText(calculator.this,"Enter first number",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(edt1.length()==0){
                    Toast.makeText(calculator.this,"Enter second number",Toast.LENGTH_SHORT).show();
                    return;
                }



                double num1,num2,sum;
                num1 = Double.parseDouble(edt.getText().toString());
                num2 = Double.parseDouble(edt1.getText().toString());
                sum = num1 - num2;
                txt.setText(Double.toString(sum));


            }
        });



        final Button mult = (Button)findViewById(R.id.btn2);

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt.length()==0){
                    Toast.makeText(calculator.this,"Enter first number",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(edt1.length()==0){
                    Toast.makeText(calculator.this,"Enter second number",Toast.LENGTH_SHORT).show();
                    return;
                }



                double num1,num2,sum;
                num1 = Double.parseDouble(edt.getText().toString());
                num2 = Double.parseDouble(edt1.getText().toString());
                sum = num1 * num2;
                txt.setText(Double.toString(sum));


            }
        });



        final Button div = (Button)findViewById(R.id.btn3);

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt.length()==0){
                    Toast.makeText(calculator.this,"Enter first number",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(edt1.length()==0){
                    Toast.makeText(calculator.this,"Enter second number",Toast.LENGTH_SHORT).show();
                    return;
                }



                double num1,num2,sum;
                num1 = Double.parseDouble(edt.getText().toString());
                num2 = Double.parseDouble(edt1.getText().toString());
                sum = num1 / num2;
                txt.setText(Double.toString(sum));


            }
        });
    }
}
