// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import android.os.Handler;
import android.database.ContentObserver;

final class d extends ContentObserver
{
    private final /* synthetic */ c a;
    
    d(final c a, final Handler handler) {
        this.a = a;
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        this.a.d();
        this.a.f();
    }
}
