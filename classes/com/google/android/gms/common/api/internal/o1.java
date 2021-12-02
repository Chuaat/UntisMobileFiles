// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.net.Uri;
import android.content.Intent;
import androidx.annotation.k0;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class o1 extends BroadcastReceiver
{
    @k0
    private Context a;
    private final q1 b;
    
    public o1(final q1 b) {
        this.b = b;
    }
    
    public final void a() {
        synchronized (this) {
            final Context a = this.a;
            if (a != null) {
                a.unregisterReceiver((BroadcastReceiver)this);
            }
            this.a = null;
        }
    }
    
    public final void b(final Context a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final Uri data = intent.getData();
        String schemeSpecificPart;
        if (data != null) {
            schemeSpecificPart = data.getSchemeSpecificPart();
        }
        else {
            schemeSpecificPart = null;
        }
        if ("com.google.android.gms".equals(schemeSpecificPart)) {
            this.b.a();
            this.a();
        }
    }
}
