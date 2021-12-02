// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.x;
import android.content.Context;
import com.google.android.gms.common.util.d0;

@d0
public final class aa
{
    final Context a;
    
    @d0
    public aa(Context applicationContext) {
        x.k(applicationContext);
        applicationContext = applicationContext.getApplicationContext();
        x.k(applicationContext);
        this.a = applicationContext;
    }
}
