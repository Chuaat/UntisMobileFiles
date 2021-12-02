// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.os.Handler;
import android.database.ContentObserver;

final class x extends ContentObserver
{
    private final /* synthetic */ v a;
    
    x(final v a, final Handler handler) {
        this.a = a;
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        this.a.c();
    }
}
