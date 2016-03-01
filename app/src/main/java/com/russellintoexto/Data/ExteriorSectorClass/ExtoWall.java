package com.russellintoexto.Data.ExteriorSectorClass;

import com.russellintoexto.R;
import com.russellintoexto.Data.ServiceDetailsPhotoData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrislam on 24/02/2016.
 */
public class ExtoWall {

    private static List<ServiceDetailsPhotoData> wallImg = new ArrayList<>();

    public static List<ServiceDetailsPhotoData> getWallImg() {
        return wallImg;
    }

    static {
        wallImg.add(new ServiceDetailsPhotoData(R.drawable.creative));
    }
}
