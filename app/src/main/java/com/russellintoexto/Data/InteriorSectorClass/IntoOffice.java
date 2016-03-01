package com.russellintoexto.Data.InteriorSectorClass;

import com.russellintoexto.Data.ServiceDetailsPhotoData;
import com.russellintoexto.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaafi on 01-Mar-16, 2016.
 */
public class IntoOffice {
    public static List<ServiceDetailsPhotoData> IntoOfficeList = new ArrayList<>();

    public static List<ServiceDetailsPhotoData> getIntoOfficeList() {
        return IntoOfficeList;
    }

    static {
        IntoOfficeList.add(new ServiceDetailsPhotoData(R.drawable.background));
    }
}
