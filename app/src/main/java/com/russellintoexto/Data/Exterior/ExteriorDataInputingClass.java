package com.russellintoexto.Data.Exterior;


import com.russellintoexto.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaafi on 10/02/2016.
 */
public class ExteriorDataInputingClass {

    protected static List<ExteriorDataHolderClass> extoDataList = new ArrayList<>();

    public static List<ExteriorDataHolderClass> getExtoDataList() {
        return extoDataList;
    }

    static {
        extoDataList.add(new ExteriorDataHolderClass("garden", R.drawable.garden, 1));
        extoDataList.add(new ExteriorDataHolderClass("pool", R.drawable.pool1, 2));
        extoDataList.add(new ExteriorDataHolderClass("gate", R.drawable.gate, 3));
        extoDataList.add(new ExteriorDataHolderClass("lawn", R.drawable.lawn, 4));
        extoDataList.add(new ExteriorDataHolderClass("Creative", R.drawable.creative, 5));
        extoDataList.add(new ExteriorDataHolderClass("wall", R.drawable.wall, 6));
    }
}
