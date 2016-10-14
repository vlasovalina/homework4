package com.spirit.anew.Realm;

import io.realm.RealmObject;

public class ToolsRealm extends RealmObject {

    public ToolsRealm(){}

    private int mId;
    private String mBrand;
    private String mModel;
    private String mImageUrl;
    private String mType;
    private double mPrice;
    private int mQuantity;

    public ToolsRealm(int mId, String mBrand, String mModel, String mImageUrl, String mType, double mPrice, int mQuantity) {
        this.mId = mId;
        this.mBrand = mBrand;
        this.mModel = mModel;
        this.mImageUrl = mImageUrl;
        this.mType = mType;
        this.mPrice = mPrice;
        this.mQuantity = mQuantity;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmBrand() {
        return mBrand;
    }

    public void setmBrand(String mBrand) {
        this.mBrand = mBrand;
    }

    public String getmModel() {
        return mModel;
    }

    public void setmModel(String mModel) {
        this.mModel = mModel;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public double getmPrice() {
        return mPrice;
    }

    public void setmPrice(double mPrice) {
        this.mPrice = mPrice;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public int getmQuantity() {
        return mQuantity;
    }

    public void setmQuantity(int mQuantity) {
        this.mQuantity = mQuantity;
    }

}
