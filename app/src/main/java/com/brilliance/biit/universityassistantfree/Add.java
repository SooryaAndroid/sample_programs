package com.brilliance.biit.universityassistantfree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Add extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

      final  EditText edt = (EditText)findViewById(R.id.edit);
        final  EditText edt1 = (EditText)findViewById(R.id.edit1);

        final TextView txt = (TextView)findViewById(R.id.textView);

        final Button check = (Button)findViewById(R.id.btn);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt.length()==0){
                    Toast.makeText(Add.this,"Enter first number",Toast.LENGTH_SHORT).show();
                return;
                }
                if(edt1.length()==0){
                    Toast.makeText(Add.this,"Enter second number",Toast.LENGTH_SHORT).show();
                    return;
                }





//                double num1,num2,sum;
//                num1 = Double.parseDouble(edt.getText().toString());
//                num2 = Double.parseDouble(edt1.getText().toString());


                int num1,num2,sum;
                num1=Integer.parseInt(edt.getText().toString());
                num2=Integer.parseInt(edt1.getText().toString());
                sum = num1 + num2;
                txt.setText(Double.toString(sum));







            }
        });
    }
}
