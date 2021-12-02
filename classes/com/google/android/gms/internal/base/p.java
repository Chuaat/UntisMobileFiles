// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.base;

import android.os.Handler$Callback;
import android.os.Looper;
import android.os.Handler;

public class p extends Handler
{
    private static r a;
    
    public p() {
    }
    
    public p(final Looper looper) {
        super(looper);
    }
    
    public p(final Looper looper, final Handler$Callback handler$Callback) {
        super(looper, handler$Callback);
    }
}
