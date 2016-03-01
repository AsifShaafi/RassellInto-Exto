package com.russellintoexto.Data.Exterior;

/**
 * Created by Shaafi on 10/02/2016.
 */
public class ExteriorDataHolderClass {

    private String sector;
    private int imgId;
    private int sectorID;


    public ExteriorDataHolderClass(String sector, int imgId, int sectorID) {
        this.sector = sector;
        this.imgId = imgId;
        this.sectorID = sectorID;
    }

    public String getSector() {
        return sector;
    }

    public int getImgId() {
        return imgId;
    }

    public int getSectorID() {
        return sectorID;
    }

    @Override
    public String toString() {
        return getSector();
    }
}
