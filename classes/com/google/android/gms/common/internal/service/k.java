// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal.service;

import android.os.IInterface;
import android.os.IBinder;
import com.google.android.gms.common.internal.g;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.common.internal.l;

public final class k extends l<com.google.android.gms.common.internal.service.l>
{
    public k(final Context context, final Looper looper, final g g, final com.google.android.gms.common.api.k.b b, final com.google.android.gms.common.api.k.c c) {
        super(context, looper, 39, g, b, c);
    }
    
    @Override
    protected final String L() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }
    
    public final String M() {
        return "com.google.android.gms.common.service.START";
    }
}
