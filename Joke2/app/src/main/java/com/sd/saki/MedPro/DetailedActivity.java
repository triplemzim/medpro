package com.sd.saki.MedPro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import Utility.NavBar;

/**
 * Created by Saki on 5/22/2016.
 */

public class DetailedActivity extends AppCompatActivity {
    Button mB = null;
    TextView tV = null;
    EditText backCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NavBar.setNavBarAndContentView(this,R.layout.activity_detailed);

        mB = (Button) findViewById(R.id.myButton);
        backCode = (EditText) findViewById(R.id.backText);
        tV = (TextView) findViewById(R.id.detailText);

        mB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(backCode.getText().toString().equals("012345")) {
                    backCode.setText("");
                    Intent i = new Intent(v.getContext(),PatientInfoActivity.class);
                    startActivity(i);

                }
                else {
                    backCode.setText("");

                }
            }
        });
    }
}
