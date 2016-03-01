package com.russellintoexto.Data.ExteriorSectorClass;

import com.russellintoexto.Data.ServiceDetailsPhotoData;
import com.russellintoexto.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaafi on 24/02/2016.
 */
public class ExtoGate {
    private static List<ServiceDetailsPhotoData> gateImg = new ArrayList<>();

    public static List<ServiceDetailsPhotoData> getGateImg() {
        return gateImg;
    }

    static {
        gateImg.add(new ServiceDetailsPhotoData(R.drawable.creative));
    }
}
