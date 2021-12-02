// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.api.n;
import android.util.Log;
import android.os.Message;
import android.os.Looper;
import com.google.android.gms.internal.base.p;

final class s2 extends p
{
    private final /* synthetic */ q2 b;
    
    public s2(final q2 b, final Looper looper) {
        this.b = b;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        final int what = message.what;
        if (what != 0) {
            if (what != 1) {
                final StringBuilder sb = new StringBuilder(70);
                sb.append("TransformationResultHandler received unknown message type: ");
                sb.append(what);
                Log.e("TransformedResultImpl", sb.toString());
                return;
            }
            final RuntimeException ex = (RuntimeException)message.obj;
            final String value = String.valueOf(ex.getMessage());
            String concat;
            if (value.length() != 0) {
                concat = "Runtime exception on the transformation worker thread: ".concat(value);
            }
            else {
                concat = new String("Runtime exception on the transformation worker thread: ");
            }
            Log.e("TransformedResultImpl", concat);
            throw ex;
        }
        else {
            final n n = (n)message.obj;
            synchronized (this.b.e) {
                final q2<t> q2 = x.k(this.b.b);
                Status k;
                if (n == null) {
                    k = new Status(13, "Transform returned null");
                }
                else {
                    if (!(n instanceof e2)) {
                        q2.f(n);
                        return;
                    }
                    k = ((e2<?>)n).k();
                }
                q2.h(k);
            }
        }
    }
}
