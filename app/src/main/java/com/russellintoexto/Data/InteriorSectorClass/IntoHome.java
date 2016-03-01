package com.russellintoexto.Data.InteriorSectorClass;


import com.russellintoexto.Data.ServiceDetailsPhotoData;
import com.russellintoexto.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaafi on 01-Mar-16, 2016.
 */
public class IntoHome {

    public static List<ServiceDetailsPhotoData> IntoHomeList = new ArrayList<>();

    public static List<ServiceDetailsPhotoData> getIntoHomeList() {
        return IntoHomeList;
    }

    static {
        IntoHomeList.add(new ServiceDetailsPhotoData(R.drawable.background));
    }
}
