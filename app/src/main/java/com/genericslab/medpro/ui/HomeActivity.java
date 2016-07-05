package com.genericslab.medpro.ui;

import android.app.Activity;

import com.genericslab.droidplate.ui.drawer.DrawerActivity_;
import com.genericslab.medpro.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_home)
public class HomeActivity extends Activity {

    @AfterViews
    void afterViews() {
        DrawerActivity_.intent(this).start();
        finish();
    }
}
