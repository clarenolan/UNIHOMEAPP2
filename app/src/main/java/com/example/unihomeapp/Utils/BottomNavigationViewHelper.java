package com.example.unihomeapp.Utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.example.unihomeapp.Landlord.UserProfile;
import com.example.unihomeapp.R;
import com.example.unihomeapp.Student.StudentNav;
import com.example.unihomeapp.Student.StudentProfile;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, StudentNav.class);//ACTIVITY_NUM = 0
                        context.startActivity(intent1);
                        break;

//                    case R.id.ic_search:
//                        Intent intent2  = new Intent(context, SearchActivity.class);//ACTIVITY_NUM = 1
//                        context.startActivity(intent2);
//                        break;

                    case R.id.ic_android:
                        Intent intent5 = new Intent(context, StudentProfile.class);//ACTIVITY_NUM = 4
                        context.startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }
}