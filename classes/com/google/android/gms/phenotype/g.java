// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.phenotype;

import android.os.Handler;
import android.database.ContentObserver;

final class g extends ContentObserver
{
    private final /* synthetic */ f a;
    
    g(final f a, final Handler handler) {
        this.a = a;
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        this.a.c();
    }
}
