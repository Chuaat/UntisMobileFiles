// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.database.ContentObserver;

final class g6 extends ContentObserver
{
    final /* synthetic */ i6 a;
    
    g6(final i6 a, final Handler handler) {
        this.a = a;
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        this.a.f();
    }
}
