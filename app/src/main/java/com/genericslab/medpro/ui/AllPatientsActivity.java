package com.genericslab.medpro.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.genericslab.medpro.R;
import com.genericslab.medpro.patient;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zim on 9/24/2016.
 */
@EActivity(R.layout.activity_all_patients)
public class AllPatientsActivity extends Activity {

    @ViewById(R.id.patientList)
    ListView patientList;



    @AfterViews
    void afterViews(){
        List<patient> AllPatient = patient.find(patient.class,"SELECT * FROM patient","");
        ArrayList<String> patientArray = new ArrayList<>();

        for(patient p : AllPatient){
            patientArray.add(p.name+"\n"+p.phone+"\n"+p.history);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.activity_all_patients,patientArray);
        patientList.setAdapter(adapter);
    }
}
