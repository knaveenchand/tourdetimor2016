package com.matenek.tourdetimor2016;

import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity
        implements PhoneFragment.OnFragmentInteractionListener, MapFragment.OnFragmentInteractionListener,
        RegistrationFragment.OnFragmentInteractionListener,TimorlodgeFragment.OnFragmentInteractionListener,
        PrizesFragment.OnFragmentInteractionListener, PartyFormFragment.OnFragmentInteractionListener,
        MapsHomeFragment.OnFragmentInteractionListener, MapGPXFragment.OnFragmentInteractionListener,
        MapKMLFragment.OnFragmentInteractionListener {
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /**
         *Setup the DrawerLayout and NavigationView
         */

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.shitstuff);


        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the TabFragment as the first Fragment
         */

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView,new MainHome()).commit();

        /**
         * Setup click events on the Navigation View Items.
         */

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();



                if (menuItem.getItemId() == R.id.nav_item_home) {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView,new MainHome()).commit();

                }

                if (menuItem.getItemId() == R.id.nav_item_call) {
                    FragmentTransaction callfragmentTransaction = mFragmentManager.beginTransaction();
                    callfragmentTransaction.replace(R.id.containerView,new PhoneFragment()).commit();
                }

                if (menuItem.getItemId() == R.id.nav_item_maps) {
                    FragmentTransaction mapsfragmentTransaction = mFragmentManager.beginTransaction();
                    mapsfragmentTransaction.replace(R.id.containerView,new MapsHomeFragment()).commit();
                }

                if (menuItem.getItemId() == R.id.nav_item_event) {
                    FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                    xfragmentTransaction.replace(R.id.containerView,new TabFragment()).commit();
                }

                if (menuItem.getItemId() == R.id.nav_item_prize) {
                    FragmentTransaction prizefragmentTransaction = mFragmentManager.beginTransaction();
                    prizefragmentTransaction.replace(R.id.containerView,new PrizesFragment()).commit();
                }
                if (menuItem.getItemId() == R.id.nav_item_registration) {
                    FragmentTransaction registrationfragmentTransaction = mFragmentManager.beginTransaction();
                    registrationfragmentTransaction.replace(R.id.containerView,new RegistrationFragment()).commit();
                }
                if (menuItem.getItemId() == R.id.nav_item_timorlodge) {
                    FragmentTransaction callfragmentTransaction = mFragmentManager.beginTransaction();
                    callfragmentTransaction.replace(R.id.containerView,new TimorlodgeFragment()).commit();
                }

                return false;
            }

        });


        /**
         * Setup Drawer Toggle of the Toolbar
         */

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
                R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();

    }

    public void openDrawer(View view) {
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mDrawerLayout.openDrawer(Gravity.LEFT);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
