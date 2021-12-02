// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services;

import android.content.Context;
import android.widget.RemoteViewsService$RemoteViewsFactory;
import androidx.annotation.k0;
import android.content.Intent;
import android.widget.RemoteViewsService;

public class ScheduleWidgetService extends RemoteViewsService
{
    public static final String G = "profile_id";
    
    public RemoteViewsService$RemoteViewsFactory onGetViewFactory(@k0 final Intent intent) {
        int intExtra = 0;
        if (intent != null) {
            intExtra = intent.getIntExtra("appWidgetId", 0);
        }
        return (RemoteViewsService$RemoteViewsFactory)new d((Context)this, intExtra);
    }
}
