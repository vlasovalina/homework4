package com.spirit.anew.Realm;

import io.realm.RealmObject;

public class LocationRealm extends RealmObject{

    public LocationRealm() {}

    private int mLatitude;
    private int mLongitude;

    public LocationRealm(int mLatitude, int mLongitude){
        this.mLatitude = mLatitude;
        this.mLongitude = mLongitude;
    }

    public int getmLatitude() {
        return mLatitude;
    }

    public void setmLatitude(int mLatitude) {
        this.mLatitude = mLatitude;
    }

    public int getmLongitude() {
        return mLongitude;
    }

    public void setmLongitude(int mLongitude) {
        this.mLongitude = mLongitude;
    }

}
