// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.os.Message;
import android.os.Looper;
import com.google.android.gms.internal.base.p;

final class a1 extends p
{
    private final /* synthetic */ t0 b;
    
    a1(final t0 b, final Looper looper) {
        this.b = b;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        final int what = message.what;
        if (what == 1) {
            this.b.W();
            return;
        }
        if (what != 2) {
            final StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(what);
            Log.w("GoogleApiClientImpl", sb.toString());
            return;
        }
        this.b.V();
    }
}
