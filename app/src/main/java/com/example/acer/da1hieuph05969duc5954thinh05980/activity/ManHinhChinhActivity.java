package com.example.acer.da1hieuph05969duc5954thinh05980.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.acer.da1hieuph05969duc5954thinh05980.R;
import com.example.acer.da1hieuph05969duc5954thinh05980.adapter.GpuAdapter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ManHinhChinhActivity extends AppCompatActivity  {
    private DrawerLayout mDrawerLayout;
    private ViewFlipper viewfliper;
    private Toolbar toolbar;
    private FrameLayout contentFrame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Anhxa();
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayUseLogoEnabled(true);
            getSupportActionBar().setTitle("Bán linh kiện điện tử");
        }
//        ActionBar actionbar = getSupportActionBar();
//        actionbar.setDisplayHomeAsUpEnabled(true);
        ActionViewFliper();
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        switch(menuItem.getItemId()){
                            case R.id.nav_login:
                                Intent intent1 = new Intent(ManHinhChinhActivity.this,LoginActivity.class);
                                startActivity(intent1);
//                                Dialog dialog = new Dialog(ManHinhChinhActivity.this);
//                                dialog.setContentView(R.layout.activity_login);
//                                dialog.show();
                                break;
                            case R.id.nav_main:
                                Intent intent2 = new Intent(ManHinhChinhActivity.this,Main1Activity.class);
                                startActivity(intent2);
                                break;
                            case R.id.nav_cpu:
                                Intent intent3 = new Intent(ManHinhChinhActivity.this,CPUActivity.class);
                                startActivity(intent3);
                                break;
                            case R.id.nav_gpu:
                                Intent intent8 = new Intent(ManHinhChinhActivity.this,GpuAdapter.class);
                                startActivity(intent8);
                                break;
                            case R.id.nav_ram:
                                Intent intent5 = new Intent(ManHinhChinhActivity.this,RamActivity.class);
                                startActivity(intent5);
                                break;
                            case R.id.nav_psu:
                                Intent intent4 = new Intent(ManHinhChinhActivity.this,NguonActivity.class);
                                startActivity(intent4);
                                break;
                            case R.id.nav_ssd:
                                Intent intent6 = new Intent(ManHinhChinhActivity.this,SsdActivity.class);
                                startActivity(intent6);
                                break;
                            case R.id.nav_hdd:
                                Intent intent7 = new Intent(ManHinhChinhActivity.this,HddActivity.class);
                                startActivity(intent7);
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

    private void ActionViewFliper() {
        ArrayList<String> mangquangcao = new ArrayList<>();
        mangquangcao.add("http://www.pcworld.com.vn/files/articles/2015/1238315/01-flickr-large.jpg");
        mangquangcao.add("http://www.pcworld.com.vn/files/articles/2015/1238315/01-flickr-large.jpg");
        mangquangcao.add("http://www.pcworld.com.vn/files/articles/2015/1238315/01-flickr-large.jpg");
        mangquangcao.add("http://www.pcworld.com.vn/files/articles/2015/1238315/01-flickr-large.jpg");
        for (int i =0;i<mangquangcao.size();i++){
            ImageView imageView = new ImageView(getApplicationContext());
            Picasso.with(getApplicationContext()).load(mangquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewfliper.addView(imageView);

        }
        viewfliper.setFlipInterval(5000);
        viewfliper.setAutoStart(true);
        Animation animation_slide_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_right);
        Animation animation_slide_out = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_out_right);
        viewfliper.setInAnimation(animation_slide_in);
        viewfliper.setOutAnimation(animation_slide_out);
    }

    private void Anhxa() {
        viewfliper =  findViewById(R.id.viewfliper);
        contentFrame = findViewById(R.id.content_frame);
        toolbar =  findViewById(R.id.toolbar);
        mDrawerLayout = findViewById(R.id.drawer_layout);
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
