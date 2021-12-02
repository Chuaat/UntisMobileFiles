// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import android.os.IInterface;
import android.os.IBinder;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.g;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.common.internal.l;

public final class l6 extends l<p6>
{
    public l6(final Context context, final Looper looper, final g g, final com.google.android.gms.common.api.k.b b, final com.google.android.gms.common.api.k.c c) {
        super(context, looper, 40, g, b, c);
    }
    
    @Override
    protected final String L() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }
    
    @Override
    protected final String M() {
        return "com.google.android.gms.clearcut.service.START";
    }
    
    @Override
    public final int s() {
        return 11925000;
    }
}
