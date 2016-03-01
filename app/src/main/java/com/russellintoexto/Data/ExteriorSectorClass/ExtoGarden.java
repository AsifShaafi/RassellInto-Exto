package com.russellintoexto.Data.ExteriorSectorClass;


import com.russellintoexto.Data.ServiceDetailsPhotoData;
import com.russellintoexto.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaafi on 24/02/2016.
 */
public class ExtoGarden {

    private static List<ServiceDetailsPhotoData> gardenImg = new ArrayList<>();

    public static List<ServiceDetailsPhotoData> getGardenImg() {
        return gardenImg;
    }

    static {
        gardenImg.add(new ServiceDetailsPhotoData(R.drawable.creative));
    }
}
