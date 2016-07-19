package com.brilliance.biit.universityassistantfree;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by user-1 on 06-Apr-16.
 */
public class Radio extends Activity {

    String countryName[] = {"India", "Pakistan", "China", "Nepal",
            "Bangladesh"};

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio);

        LinearLayout mLinearLayout = (LinearLayout) findViewById(R.id.linear1);
        for (int k = 1; k <= 20; k++) {
            //create text button
            TextView title = new TextView(this);
            title.setText("Question Number:" + k);
            title.setTextColor(Color.BLUE);
            mLinearLayout.addView(title);
            // create radio button
            final RadioButton[] rb = new RadioButton[5];
            RadioGroup rg = new RadioGroup(this);
            rg.setOrientation(RadioGroup.VERTICAL);
            for (int i = 0; i < 5; i++) {
                rb[i] = new RadioButton(this);
                rg.addView(rb[i]);
                rb[i].setText(countryName[i]);

            }
            mLinearLayout.addView(rg);
        }
    }
}
