package com.russellintoexto;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends FragmentActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager = (ViewPager) findViewById(R.id.container);

        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }


    public void Ex(View view) {
        Toast.makeText(MainActivity.this, "Exterior!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ExteriorMainScreen.class);
        startActivity(intent);
    }

    public void In(View view) {
        Toast.makeText(MainActivity.this, "Interior!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, InteriorMainScreen.class));
    }

    public void webSite(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.russellintoexto.com"));
        startActivity(intent);

    }
}

class MyAdapter extends FragmentPagerAdapter {

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        if (position == 0) {
            return fragment = new HomePage();
        }

        if (position == 1) {
            return fragment = new Interior_Exterior();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return "Russell Interior and Exterior";
        }

        if (position == 1) {
            return "Sectors";
        }

        return null;
    }
}
