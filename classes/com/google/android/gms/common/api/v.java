// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import f2.a;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

public abstract class v<R extends t> implements u<R>
{
    @a
    @Override
    public final void a(@RecentlyNonNull final R obj) {
        final Status h = obj.h();
        if (h.j3()) {
            this.c(obj);
            return;
        }
        this.b(h);
        if (obj instanceof p) {
            try {
                ((p)obj).release();
            }
            catch (RuntimeException ex) {
                final String value = String.valueOf(obj);
                final StringBuilder sb = new StringBuilder(value.length() + 18);
                sb.append("Unable to release ");
                sb.append(value);
                Log.w("ResultCallbacks", sb.toString(), (Throwable)ex);
            }
        }
    }
    
    public abstract void b(@RecentlyNonNull final Status p0);
    
    public abstract void c(@RecentlyNonNull final R p0);
}
