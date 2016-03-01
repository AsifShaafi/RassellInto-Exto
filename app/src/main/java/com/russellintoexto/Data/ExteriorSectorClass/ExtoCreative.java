package com.russellintoexto.Data.ExteriorSectorClass;

import com.russellintoexto.Data.ServiceDetailsPhotoData;
import com.russellintoexto.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaafi on 24/02/2016.
 */
public class ExtoCreative {
    private static List<ServiceDetailsPhotoData> creativeImg = new ArrayList<>();

    public static List<ServiceDetailsPhotoData> getCreativeImg() {
        return creativeImg;
    }

    static {
        creativeImg.add(new ServiceDetailsPhotoData(R.drawable.creative));
    }
}
