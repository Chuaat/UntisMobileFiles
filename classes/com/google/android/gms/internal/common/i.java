// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.common;

import android.os.Handler$Callback;
import android.os.Looper;
import android.os.Handler;

public class i extends Handler
{
    private static k a;
    
    public i() {
    }
    
    public i(final Looper looper) {
        super(looper);
    }
    
    public i(final Looper looper, final Handler$Callback handler$Callback) {
        super(looper, handler$Callback);
    }
}
