package com.sd.saki.joke2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class ObjectActivity extends AppCompatActivity {

    Button mB = null;
    TextView tV = null;
    EditText passCode;
    String pC = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object);

        tV = (TextView) findViewById(R.id.passwordHint);
        mB = (Button) findViewById(R.id.myButton);
        passCode = (EditText) findViewById(R.id.editText);

        mB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(passCode.getText().toString().equals("123")) {
                    passCode.setText("");
                    Intent i = new Intent(v.getContext(),DetailedActivity.class);
                    startActivity(i);

                }
                else {
                    passCode.setText("");
                   tV.setText("Wrong passcode! Please try again.");
                   tV.setTextColor(Color.parseColor("#ff4400"));
                }
            }
        });

    }
}
