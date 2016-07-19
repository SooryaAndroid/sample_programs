package com.brilliance.biit.universityassistantfree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fibno extends AppCompatActivity{

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
                    Toast.makeText(Fibno.this,"Enter number",Toast.LENGTH_SHORT).show();
                return;
                }


            int n= Integer.valueOf(edt.getText().toString());

                int n1=0,n2=1,n3,i,count=10;
                System.out.print(n1+" "+n2);//printing 0 and 1

                for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
                {
                    n3=n1+n2;
                    System.out.print(" "+n3);
                    n1=n2;
                    n2=n3;
                }





                    Toast.makeText(Fibno.this,"palindrome",Toast.LENGTH_SHORT).show();



                    Toast.makeText(Fibno.this,"not palindrome",Toast.LENGTH_SHORT).show();








            }
        });
    }
}
