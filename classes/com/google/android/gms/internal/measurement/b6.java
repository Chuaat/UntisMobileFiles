// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.database.ContentObserver;

final class b6 extends ContentObserver
{
    b6(final Handler handler) {
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        c6.e.set(true);
    }
}
