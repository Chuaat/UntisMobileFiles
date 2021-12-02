// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.cloudmessaging;

import android.os.Message;
import android.os.Looper;
import com.google.android.gms.internal.cloudmessaging.e;

final class d0 extends e
{
    private final /* synthetic */ com.google.android.gms.cloudmessaging.e b;
    
    d0(final com.google.android.gms.cloudmessaging.e b, final Looper looper) {
        this.b = b;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        this.b.g(message);
    }
}
