package com.russellintoexto.Data.InteriorSectorClass;

import com.russellintoexto.Data.ServiceDetailsPhotoData;
import com.russellintoexto.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaafi on 01-Mar-16, 2016.
 */
public class IntoDinning {
    public static List<ServiceDetailsPhotoData> IntoDinningList = new ArrayList<>();

    public static List<ServiceDetailsPhotoData> getIntoDinningList() {
        return IntoDinningList;
    }

    static {
        IntoDinningList.add(new ServiceDetailsPhotoData(R.drawable.background));
    }
}
