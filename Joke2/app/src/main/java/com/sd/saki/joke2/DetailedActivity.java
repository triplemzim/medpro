package com.sd.saki.joke2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Saki on 5/22/2016.
 */

public class DetailedActivity extends Activity {
    Button mB = null;
    TextView tV = null;
    EditText backCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        mB = (Button) findViewById(R.id.myButton);
        backCode = (EditText) findViewById(R.id.backText);
        tV = (TextView) findViewById(R.id.detailText);

        mB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(backCode.getText().toString().equals("Back")) {

                    Intent i = new Intent(v.getContext(),ObjectActivity.class);
                    startActivity(i);

                    //tV.setText("Welcome!");
                    //tV.setTextColor(Color.parseColor("#64dd17"));
                }
                else {
                    tV.setText("Wrong passcode!\nPlease type 'Back' and press the button" );
                    tV.setTextColor(Color.parseColor("#ff9800"));
                }
            }
        });
    }
}
