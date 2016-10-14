package com.spirit.anew.App;

import android.content.Context;

import com.spirit.anew.Config;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

public class ApiClient {

    private static final String ENDPOINT = Config.LINK_STORE;
    private static StoreService storeService;

    public static void init(Context context){
        if(context == null)
            throw new IllegalArgumentException("context cannot be null");

        final Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(ENDPOINT)
                .build();

        storeService = retrofit.create(StoreService.class);
    }

    public static StoreService getStoreService(){
        if(storeService == null)
            throw new IllegalStateException("You must initialize API client before calling getStoreService()");

        return storeService;
    }

    public static StoreService getToolsService(){
        if(storeService == null)
            throw new IllegalStateException("You must initialize API client before calling getToolsService()");
        return storeService;
    }

}
