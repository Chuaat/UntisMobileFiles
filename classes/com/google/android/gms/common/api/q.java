// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import android.content.IntentSender$SendIntentException;
import android.app.Activity;
import android.app.PendingIntent;
import androidx.annotation.RecentlyNonNull;

public class q extends b
{
    public q(@RecentlyNonNull final Status status) {
        super(status);
    }
    
    @RecentlyNonNull
    public PendingIntent d() {
        return this.a().g1();
    }
    
    public void e(@RecentlyNonNull final Activity activity, @RecentlyNonNull final int n) throws IntentSender$SendIntentException {
        this.a().O3(activity, n);
    }
}
