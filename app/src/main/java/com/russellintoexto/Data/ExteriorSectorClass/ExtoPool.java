package com.russellintoexto.Data.ExteriorSectorClass;

import com.russellintoexto.R;
import com.russellintoexto.Data.ServiceDetailsPhotoData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaafi on 24/02/2016.
 */
public class ExtoPool {
    private static List<ServiceDetailsPhotoData> poolImg = new ArrayList<>();

    public static List<ServiceDetailsPhotoData> getPoolImg() {
        return poolImg;
    }

    static {
        poolImg.add(new ServiceDetailsPhotoData(R.drawable.creative));
    }
}
