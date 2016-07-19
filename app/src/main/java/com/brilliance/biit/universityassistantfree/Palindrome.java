package com.brilliance.biit.universityassistantfree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Palindrome extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        final  EditText edt = (EditText)findViewById(R.id.edit);
        final Button check = (Button)findViewById(R.id.btn);


        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt.length()==0){
                    Toast.makeText(Palindrome.this,"Enter number",Toast.LENGTH_SHORT).show();
                return;
                }

            int n= Integer.valueOf(edt.getText().toString());
                int  reverse = 0, temp;
                temp = n;

                while( temp != 0 )
                {
                    reverse = reverse * 10;
                    reverse = reverse + temp%10;
                    temp = temp/10;
                }

                if ( n == reverse )
                    Toast.makeText(Palindrome.this,"palindrome",Toast.LENGTH_SHORT).show();

              else Toast.makeText(Palindrome.this,"not palindrome",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
