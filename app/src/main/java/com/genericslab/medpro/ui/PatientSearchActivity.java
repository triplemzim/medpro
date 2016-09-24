package com.genericslab.medpro.ui;

import android.app.Activity;
import android.os.Bundle;

import com.genericslab.medpro.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

/**
 * Created by Zim on 9/24/2016.
 */
@EActivity(R.layout.activity_patient_search)
public class PatientSearchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @AfterViews
    void afterViews(){



    }
}


