// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import android.os.Handler;
import android.database.ContentObserver;

final class b7 extends ContentObserver
{
    b7(final Handler handler) {
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        a7.e.set(true);
    }
}
