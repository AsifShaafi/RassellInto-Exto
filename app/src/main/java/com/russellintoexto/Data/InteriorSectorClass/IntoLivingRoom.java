package com.russellintoexto.Data.InteriorSectorClass;

import com.russellintoexto.Data.ServiceDetailsPhotoData;
import com.russellintoexto.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaafi on 01-Mar-16, 2016.
 */
public class IntoLivingRoom {
    public static List<ServiceDetailsPhotoData> IntoLivingRoomList = new ArrayList<>();

    public static List<ServiceDetailsPhotoData> getIntoLivingRoomList() {
        return IntoLivingRoomList;
    }

    static {
        IntoLivingRoomList.add(new ServiceDetailsPhotoData(R.drawable.background));
    }
}
