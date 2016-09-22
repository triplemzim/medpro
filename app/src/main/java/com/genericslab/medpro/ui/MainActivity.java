package com.genericslab.medpro.ui;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.widget.Toast;

import com.genericslab.droidplate.CoreActivity;
import com.genericslab.droidplate.config.Config;
import com.genericslab.medpro.R;
import com.genericslab.medpro.login.LoginFragment_;
import com.genericslab.medpro.patient;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Trace;

/**
 * Created by shahab on 7/5/16.
 */
@EActivity(R.layout.activity_home)
public class MainActivity extends CoreActivity {


    // manual storage permission for API level 23+
    protected final String TRACE_TAG = Config.TRACE_TAG + "MainActivity";

    patient p=new patient();
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    public static void verifyStoragePermissions(Activity activity) {
        // Check if we have write permission
        int permission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (permission != PackageManager.PERMISSION_GRANTED) {
            // We don't have permission so prompt the user
            ActivityCompat.requestPermissions(
                    activity,
                    PERMISSIONS_STORAGE,
                    REQUEST_EXTERNAL_STORAGE
            );
        }

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);

    }

    @Trace(tag = TRACE_TAG)
    @AfterViews
    void afterViews() {
        verifyStoragePermissions(MainActivity.this);
        Toast.makeText(MainActivity.this, "First Toast", Toast.LENGTH_SHORT).show();
       // Intent intent = new Intent(this, HomeActivity.class);
        p = new patient("zim","male","67348","This patient is from Bogra and has a fibroid in stomach");



        //patient g = patient.findById(patient.class,1);
        //Toast.makeText(MainActivity.this,"patient= ",Toast.LENGTH_LONG).show();
       // startActivity(intent);
        //loadFragment(LoginFragment_.builder().build());
        p.save();

        patient ret = patient.findById(patient.class,1);

        Toast.makeText(MainActivity.this, ret.name+" "+ret.history, Toast.LENGTH_LONG).show();
    }
}