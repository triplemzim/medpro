package com.genericslab.medpro.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.genericslab.medpro.R;
import com.genericslab.medpro.patient;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zim on 9/24/2016.
 */
@EActivity(R.layout.activity_patient_search)
public class PatientSearchActivity extends Activity {

    @ViewById(R.id.EditTextPatientName)
    EditText P_name;
    @ViewById(R.id.EditTextPatientPhone)
    EditText P_phone;
    @ViewById(R.id.ButtonRegisterPatient)
    Button btn_RegisterPatient;
    @ViewById(R.id.ButtonShowAll)
    Button btn_ShowAll_Patients;
    @ViewById(R.id.ButtonSearchByName)
    Button btn_SearchByName;
    @ViewById(R.id.ButtonSearchByPhone)
    Button btn_SearchByPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @AfterViews
    void afterViews(){



    }

    @Click(R.id.ButtonSearchByName)
    void ButtonSearchByNameClicked(){
        String patient_name = P_name.getText().toString();
        List<patient> patient_list = patient.find(patient.class,"name like ?",patient_name);
        ArrayList<String> output = new ArrayList<>();
        for(patient p : patient_list){
            output.add(p.name+"\n"+p.sex+"\n"+p.history+"\n");
        }
        Toast.makeText(PatientSearchActivity.this, output.toString(), Toast.LENGTH_SHORT).show();
    }

    @Click(R.id.ButtonSearchByPhone)
    void ButtonSearchByPhoneClicked(){
        String patient_phone = P_phone.getText().toString();
        List<patient> patient_list = patient.find(patient.class,"phone=?",patient_phone);
        ArrayList<String> output = new ArrayList<>();
        for(patient p : patient_list){
            output.add(p.name+"\n"+p.sex+"\n"+p.history+"\n");
        }
        Toast.makeText(PatientSearchActivity.this, output.toString(), Toast.LENGTH_SHORT).show();
    }

    @Click(R.id.ButtonShowAll)
    void ButtonShowAllClicked(){
        P_name.setText("");
        P_phone.setText("");
        PatientSearchActivity_.intent(PatientSearchActivity.this).start();
    }

}


