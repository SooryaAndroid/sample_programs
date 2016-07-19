package com.brilliance.biit.universityassistantfree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

import static java.lang.System.in;

public class PalindromeString extends AppCompatActivity{

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
                    Toast.makeText(PalindromeString.this,"Enter number",Toast.LENGTH_SHORT).show();
                return;
                }

            String str= String.valueOf(edt.getText().toString());

             //   Scanner in = new Scanner(System.in);
             //  String str=in.nextLine();
                StringBuffer strone=new StringBuffer(str);
                StringBuffer strtwo=new StringBuffer(strone);
                strone.reverse();
                if(str.valueOf(strone).compareTo(str.valueOf(strtwo))==0)
                    Toast.makeText(PalindromeString.this,"palindrome",Toast.LENGTH_SHORT).show();

              else
                    Toast.makeText(PalindromeString.this,"not palindrome",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
