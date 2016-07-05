package com.sd.saki.MedPro;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import Utility.NavBar;

public class ObjectActivity extends AppCompatActivity {

    Button btn;
    TextView tV;
    EditText passCode;
    String pC;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        NavBar.setNavBarAndContentView(this,R.layout.activity_object);


        tV = (TextView) findViewById(R.id.passwordHint);
        btn = (Button) findViewById(R.id.myButton);
        passCode = (EditText) findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
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
