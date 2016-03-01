package com.russellintoexto;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

import com.russellintoexto.Data.Interior.InteriorDataHolderClass;
import com.russellintoexto.Data.Interior.InteriorDataInputingClass;

import java.util.List;

public class InteriorMainScreen extends AppCompatActivity {


    protected List<InteriorDataHolderClass> dataHolderClassList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interior_main_screen);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dataHolderClassList = InteriorDataInputingClass.getExtoDataList();

        final ArrayAdapter<InteriorDataHolderClass> dataHolderClassArrayAdapter = new IntoDataListAdapter
                (this, R.layout.activity_interior_main_screen, dataHolderClassList);
        ListView intoListView = (ListView) findViewById(R.id.listView2);

        intoListView.setAdapter(dataHolderClassArrayAdapter);


        intoListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                InteriorDataHolderClass interiorDataHolderClass = dataHolderClassList.get(position);

                Intent intent = new Intent(InteriorMainScreen.this, ServiceDetailsPhotos.class);
                intent.putExtra("sectorId", interiorDataHolderClass.getSectorID());
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


    public class IntoDataListAdapter extends ArrayAdapter<InteriorDataHolderClass> {

        protected Context context;
        protected List<InteriorDataHolderClass> objects;

        public IntoDataListAdapter(Context context, int resource, List<InteriorDataHolderClass> objects) {
            super(context, resource, objects);
            this.context = context;
            this.objects = objects;

        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            InteriorDataHolderClass intoData = objects.get(position);

            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            View v = layoutInflater.inflate(R.layout.list_view, null);

            ImageView imageView = (ImageView) v.findViewById(R.id.list_imageView);

            imageView.setImageResource(intoData.getImgId());

            TextView textView = (TextView) v.findViewById(R.id.list_textView);
            textView.setText(intoData.toString());

            return v;
        }
    }
}
