// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.os.Handler;
import android.database.ContentObserver;

final class u extends ContentObserver
{
    u(final Handler handler) {
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        r.e.set(true);
    }
}
