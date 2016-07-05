package com.genericslab.medpro;

import com.genericslab.droidplate.app.CoreApplication;
import com.genericslab.droidplate.log.Tracer;

import org.androidannotations.annotations.EApplication;

/**
 * Created by shahab on 7/5/16.
 */
@EApplication
public class App extends CoreApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        Tracer.i("Application Id: " + BuildConfig.APPLICATION_ID
                + " || Version code: " + BuildConfig.VERSION_CODE
                + " || Version name: " + BuildConfig.VERSION_NAME
                + " || Git Sha: " + com.genericslab.droidplate.BuildConfig.GIT_SHA
                + " || Build time:  " + com.genericslab.droidplate.BuildConfig.BUILD_TIME
                + " || Build flavor: " + BuildConfig.FLAVOR
                + " || Build type: " + BuildConfig.BUILD_TYPE);
    }
}