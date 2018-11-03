package com.example.acer.da1hieuph05969duc5954thinh05980;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;

public class ManHinhChinhActivity extends AppCompatActivity  {
    private DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);

        mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        switch(menuItem.getItemId()){
                            case R.id.nav_login:
                                Intent intent1 = new Intent(ManHinhChinhActivity.this,LoginActivity.class);
                                startActivity(intent1);
//                                Dialog dialog = new Dialog(ManHinhChinhActivity.this);
//                                dialog.setContentView(R.layout.activity_login);
//                                dialog.show();
                                break;
                            case R.id.nav_information:
                                Intent intent = new Intent(ManHinhChinhActivity.this,InformationActivity.class);
                                startActivity(intent);
                                break;
                            case R.id.nav_exit:
                                Exit();
                                break;
                        }

                        menuItem.setChecked(true);

                        mDrawerLayout.closeDrawers();


                        return true;
                    }
                });

    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.nav_information:
//                Intent intent = new Intent(ManHinhChinhActivity.this,InformationActivity.class);
//                startActivity(intent);
//                break;
//            case R.id.nav_exit:
//                System.exit(1);
//                break;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    private void Exit() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Thoát");
        builder.setMessage("Bạn có muốn thoát không?");
        builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.show();



    }

}
