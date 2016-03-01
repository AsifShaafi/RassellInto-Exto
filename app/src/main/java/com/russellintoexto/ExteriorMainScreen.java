package com.russellintoexto;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.russellintoexto.Data.Exterior.ExteriorDataHolderClass;
import com.russellintoexto.Data.Exterior.ExteriorDataInputingClass;

import java.util.List;


public class ExteriorMainScreen extends AppCompatActivity {

    protected List<ExteriorDataHolderClass> dataHolderClassList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extorior_main_screen);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dataHolderClassList = ExteriorDataInputingClass.getExtoDataList();

        ArrayAdapter<ExteriorDataHolderClass> dataHolderClassArrayAdapter = new ExtoDataListAdapter(this, R.layout.activity_extorior_main_screen, dataHolderClassList);
        ListView extoListView = (ListView) findViewById(R.id.listView);
        extoListView.setAdapter(dataHolderClassArrayAdapter);

        extoListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ExteriorDataHolderClass extoriorDataHolderClass = dataHolderClassList.get(position);

                Intent intent = new Intent(ExteriorMainScreen.this, ServiceDetailsPhotos.class);
                intent.putExtra("sectorId", extoriorDataHolderClass.getSectorID());
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home)
            finish();
        if (id == R.id.about)
            Toast.makeText(this, "about us", Toast.LENGTH_SHORT).show();


        return true;
    }


    public class ExtoDataListAdapter extends ArrayAdapter<ExteriorDataHolderClass> {

        protected Context context;
        protected List<ExteriorDataHolderClass> objects;

        public ExtoDataListAdapter(Context context, int resource, List<ExteriorDataHolderClass> objects) {
            super(context, resource, objects);
            this.context = context;
            this.objects = objects;

        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ExteriorDataHolderClass extoData = objects.get(position);

            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            View v = layoutInflater.inflate(R.layout.list_view, null);

            ImageView imageView = (ImageView) v.findViewById(R.id.list_imageView);

            imageView.setImageResource(extoData.getImgId());

            TextView textView = (TextView) v.findViewById(R.id.list_textView);
            textView.setText(extoData.toString());

            return v;
        }
    }
}
