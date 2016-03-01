package com.russellintoexto.Data.Interior;

import com.russellintoexto.R;
import com.russellintoexto.Data.Interior.InteriorDataHolderClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaafi on 10/02/2016.
 */
public class InteriorDataInputingClass {
    protected static List<InteriorDataHolderClass> intoDataList = new ArrayList<>();

    public static List<InteriorDataHolderClass> getExtoDataList() {
        return intoDataList;
    }

    static {
        intoDataList.add(new InteriorDataHolderClass("Home Design", R.drawable.home, 101));
        intoDataList.add(new InteriorDataHolderClass("Office Room Design", R.drawable.office_room, 102));
        intoDataList.add(new InteriorDataHolderClass("Master Bedroom", R.drawable.master_bedroom, 103));
        intoDataList.add(new InteriorDataHolderClass("Dinning Room", R.drawable.dining_room, 104));
        intoDataList.add(new InteriorDataHolderClass("Kitchen", R.drawable.kitchen, 105));
        intoDataList.add(new InteriorDataHolderClass("Living Room Design", R.drawable.living_room, 106));
    }
}
