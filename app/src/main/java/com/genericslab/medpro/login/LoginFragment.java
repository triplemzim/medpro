package com.genericslab.medpro.login;


import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.genericslab.droidplate.CoreFragment;
import com.genericslab.droidplate.ui.drawer.DrawerActivity_;
import com.genericslab.medpro.R;
import com.genericslab.medpro.ui.HomeActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import shem.com.materiallogin.MaterialLoginView;
import shem.com.materiallogin.MaterialLoginViewListener;

/**
 * A simple {@link Fragment} subclass.
 */
@EFragment(R.layout.fragment_login)
public class LoginFragment extends CoreFragment {

    @ViewById
    MaterialLoginView loginView;


    public LoginFragment() {
        // Required empty public constructor
    }

    @AfterViews
    void afterViews() {

        loginView.setListener(new MaterialLoginViewListener() {
            @Override
            public void onRegister(TextInputLayout registerUser, TextInputLayout registerPass, TextInputLayout registerPassRep) {

            }

            @Override
            public void onLogin(TextInputLayout loginUser, TextInputLayout loginPass) {
                DrawerActivity_.intent(getContext()).start();
            }
        });
    }

}
