package com.behang.BehangBLinkExtension;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by anthony on 4/8/14.
 */
public abstract class BLinkExtension extends IntentService {

    public BLinkExtension(String name){
        super(name);
    }



    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
    }
}
