package Utility;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.sd.saki.MedPro.ObjectActivity;
import com.sd.saki.MedPro.R;

/**
 * Created by Rakin on 05-Jul-16.
 */
public class NavBar {

    public static void setNavBarAndContentView(AppCompatActivity activity, int activity_layout) {


        activity.setContentView(R.layout.nav_drawer_main);

        Toolbar myToolbar = (Toolbar) activity.findViewById(R.id.toolbar);
        activity.setSupportActionBar(myToolbar);

        ActionBar actionBar = activity.getSupportActionBar();

        LayoutInflater inflater= (LayoutInflater) activity.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout linearLayout =(LinearLayout) activity.findViewById(R.id.empty_layout);
        inflater.inflate(activity_layout,linearLayout);

        FloatingActionButton fab = (FloatingActionButton) activity.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) activity.findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                activity, drawer, myToolbar, R.string.app_name, R.string.app_name);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) activity.findViewById(R.id.nav_view);
        //navigationView.setNavigationItemSelectedListener(this);


    }

}
