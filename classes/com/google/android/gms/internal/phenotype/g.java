// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.phenotype;

import android.os.Handler;
import android.database.ContentObserver;

final class g extends ContentObserver
{
    g(final Handler handler) {
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        f.e.set(true);
    }
}
