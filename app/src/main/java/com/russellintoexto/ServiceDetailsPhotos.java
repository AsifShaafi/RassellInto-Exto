package com.russellintoexto;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.russellintoexto.Data.ExteriorSectorClass.ExtoCreative;
import com.russellintoexto.Data.ExteriorSectorClass.ExtoGarden;
import com.russellintoexto.Data.ExteriorSectorClass.ExtoGate;
import com.russellintoexto.Data.ExteriorSectorClass.ExtoLawn;
import com.russellintoexto.Data.ExteriorSectorClass.ExtoPool;
import com.russellintoexto.Data.ExteriorSectorClass.ExtoWall;
import com.russellintoexto.Data.InteriorSectorClass.IntoDinning;
import com.russellintoexto.Data.InteriorSectorClass.IntoHome;
import com.russellintoexto.Data.InteriorSectorClass.IntoKitchen;
import com.russellintoexto.Data.InteriorSectorClass.IntoLivingRoom;
import com.russellintoexto.Data.InteriorSectorClass.IntoMasterBed;
import com.russellintoexto.Data.InteriorSectorClass.IntoOffice;
import com.russellintoexto.Data.ServiceDetailsPhotoData;

import java.util.List;

public class ServiceDetailsPhotos extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<ServiceDetailsPhotoData> adapter;
    List<ServiceDetailsPhotoData> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_details_photos);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        decideListData();

        listView = (ListView) findViewById(R.id.service_detail_photo);

        adapter = new ServiceDetailLayout(this, R.layout.activity_service_details_photos, list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ServiceDetailsPhotoData e = list.get(position);

                Intent intent = new Intent(getBaseContext(), DetailsPhotoDisplay.class);

                intent.putExtra("Photo", e.getImgID());

                startActivity(intent);
            }
        });
    }

    public void decideListData() {
        int sectorId = getIntent().getIntExtra("sectorId", 0);

        //1 to ... for Exterior
        if (sectorId == 1) {
            list = ExtoGarden.getGardenImg();
        } else if (sectorId == 2) {
            list = ExtoPool.getPoolImg();
        } else if (sectorId == 3) {
            list = ExtoGate.getGateImg();
        } else if (sectorId == 4) {
            list = ExtoLawn.getLawnImg();
        } else if (sectorId == 5) {
            list = ExtoCreative.getCreativeImg();
        } else if (sectorId == 6) {
            list = ExtoWall.getWallImg();
        }

        //101 to .. is for Interior
        if(sectorId == 101){
            list = IntoHome.getIntoHomeList();
        }
        else if(sectorId == 102){
            list = IntoOffice.getIntoOfficeList();
        }
        else if(sectorId == 103){
            list = IntoMasterBed.getIntoMasterBedList();
        }
        else if(sectorId == 104){
            list = IntoDinning.getIntoDinningList();
        }
        else if(sectorId == 105){
            list = IntoKitchen.getIntoKitchenList();
        }
        else if(sectorId == 106){
            list = IntoLivingRoom.getIntoLivingRoomList();
        }
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


    public class ServiceDetailLayout extends ArrayAdapter<ServiceDetailsPhotoData> {

        protected Context context;
        protected List<ServiceDetailsPhotoData> objects;

        public ServiceDetailLayout(Context context, int resource, List<ServiceDetailsPhotoData> objects) {
            super(context, resource, objects);
            this.context = context;
            this.objects = objects;

        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ServiceDetailsPhotoData photoData = objects.get(position);

            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            View v = layoutInflater.inflate(R.layout.sector_detail_list_view, null);

            ImageView imageView = (ImageView) v.findViewById(R.id.sector_image);

            imageView.setImageResource(photoData.getImgID());


            return v;
        }
    }
}
