package com.brilliance.biit.universityassistantfree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Largest extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

      final  EditText edt = (EditText)findViewById(R.id.edit);
        final  EditText edt1 = (EditText)findViewById(R.id.edit1);

        final Button check = (Button)findViewById(R.id.btn);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt.length()==0){
                    Toast.makeText(Largest.this,"Enter first number",Toast.LENGTH_SHORT).show();
                return;
                }
                if(edt1.length()==0){
                    Toast.makeText(Largest.this,"Enter second number",Toast.LENGTH_SHORT).show();
                    return;
                }

                        int n= Integer.valueOf(edt.getText().toString());
                        int n1= Integer.valueOf(edt1.getText().toString());




                if(n>n1)



                    Toast.makeText(Largest.this,"first no greater",Toast.LENGTH_SHORT).show();

              else

                    Toast.makeText(Largest.this,"second no greater",Toast.LENGTH_SHORT).show();

                if(n==n1)
                    Toast.makeText(Largest.this,"equal",Toast.LENGTH_SHORT).show();









            }
        });
    }
}
