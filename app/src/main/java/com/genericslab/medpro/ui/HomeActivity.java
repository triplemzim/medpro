package com.genericslab.medpro.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.genericslab.droidplate.ui.drawer.DrawerActivity_;
import com.genericslab.medpro.Doctor;
import com.genericslab.medpro.R;
import com.genericslab.medpro.patient;
import com.twitter.sdk.android.core.models.User;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.List;

@EActivity(R.layout.activity_home)
public class HomeActivity extends Activity {

    @ViewById(R.id.EditTextUsername)
    EditText Username;
    @ViewById(R.id.EditTextPassword)
    EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @AfterViews
    void afterViews() {
        Toast.makeText(HomeActivity.this, "Second Toast", Toast.LENGTH_SHORT).show();
        //patient p = patient.findById(patient.class,1);
        //Toast.makeText(HomeActivity.this, p.name, Toast.LENGTH_SHORT).show();


       // DrawerActivity_.intent(this).start();
       // finish();
    }

    @Click({R.id.ButtonLogin})
    void ButtonLoginClicked(){
        String usrname,passwd;
        usrname = Username.getText().toString();
        passwd = Password.getText().toString();

        //Toast.makeText(HomeActivity.this, usrname+"\n"+passwd, Toast.LENGTH_SHORT).show();
        List<Doctor> doc = Doctor.find(Doctor.class,"usrname=? and passwd=?",usrname,passwd);

        if(doc.size()>=1){
            Toast.makeText(HomeActivity.this, "Welcome, "+doc.get(0).name, Toast.LENGTH_LONG).show();
            Password.setText("");
            PatientSearchActivity_.intent(HomeActivity.this).start();

        }
        else{
            Toast.makeText(HomeActivity.this, "Incorrect Username or password!", Toast.LENGTH_SHORT).show();
            Username.setText("");
            Password.setText("");
        }


    }

}
