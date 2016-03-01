package com.russellintoexto.Data.ExteriorSectorClass;


import com.russellintoexto.R;
import com.russellintoexto.Data.ServiceDetailsPhotoData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaafi on 24/02/2016.
 */
public class ExtoLawn {
    private static List<ServiceDetailsPhotoData> lawnImg = new ArrayList<>();

    public static List<ServiceDetailsPhotoData> getLawnImg() {
        return lawnImg;
    }

    static {
        lawnImg.add(new ServiceDetailsPhotoData(R.drawable.creative));
    }
}
