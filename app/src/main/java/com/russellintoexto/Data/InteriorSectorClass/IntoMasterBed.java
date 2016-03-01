package com.russellintoexto.Data.InteriorSectorClass;

import com.russellintoexto.Data.ServiceDetailsPhotoData;
import com.russellintoexto.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaafi on 01-Mar-16, 2016.
 */
public class IntoMasterBed {
    public static List<ServiceDetailsPhotoData> IntoMasterBedList = new ArrayList<>();

    public static List<ServiceDetailsPhotoData> getIntoMasterBedList() {
        return IntoMasterBedList;
    }

    static {
        IntoMasterBedList.add(new ServiceDetailsPhotoData(R.drawable.background));
    }
}
