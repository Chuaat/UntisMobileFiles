// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.billing;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class a extends BroadcastReceiver
{
    public static final String b = "com.android.vending.billing.PURCHASES_UPDATED";
    private final a a;
    
    public a(final a a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final a a = this.a;
        if (a != null) {
            a.a();
        }
    }
    
    public interface a
    {
        void a();
    }
}
