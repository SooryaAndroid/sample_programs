package com.brilliance.biit.universityassistantfree;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

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
                    Toast.makeText(MainActivity.this,"Enter number",Toast.LENGTH_SHORT).show();
return;
                }
int n= Integer.valueOf(edt.getText().toString());

                if(n%2==0)

                    Toast.makeText(MainActivity.this,"Even",Toast.LENGTH_SHORT).show();

              else

                    Toast.makeText(MainActivity.this,"odd",Toast.LENGTH_SHORT).show();








            }
        });
    }
}
