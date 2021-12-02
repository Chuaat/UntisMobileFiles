// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.util.Log;
import androidx.core.content.i;
import android.os.Handler;
import android.database.ContentObserver;
import c6.h;
import android.content.Context;
import androidx.annotation.w;

final class f0 implements z
{
    @w("GservicesLoader.class")
    private static f0 c;
    @h
    private final Context a;
    @h
    private final ContentObserver b;
    
    private f0() {
        this.a = null;
        this.b = null;
    }
    
    private f0(final Context a) {
        this.a = a;
        final h0 b = new h0(this, null);
        this.b = b;
        a.getContentResolver().registerContentObserver(r.a, true, (ContentObserver)b);
    }
    
    static f0 b(final Context context) {
        synchronized (f0.class) {
            if (f0.c == null) {
                f0 c;
                if (i.d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    c = new f0(context);
                }
                else {
                    c = new f0();
                }
                f0.c = c;
            }
            return f0.c;
        }
    }
    
    static void c() {
        synchronized (f0.class) {
            final f0 c = f0.c;
            if (c != null) {
                final Context a = c.a;
                if (a != null && c.b != null) {
                    a.getContentResolver().unregisterContentObserver(f0.c.b);
                }
            }
            f0.c = null;
        }
    }
    
    private final String e(String o) {
        if (this.a == null) {
            return null;
        }
        Object o2 = null;
        try {
            o2 = new e0(this, (String)o);
            o2 = d0.a((c0<String>)o2);
            return (String)o2;
        }
        catch (SecurityException o2) {}
        catch (IllegalStateException ex) {}
        o = String.valueOf(o);
        if (((String)o).length() != 0) {
            o = "Unable to read GServices for: ".concat((String)o);
        }
        else {
            o = new String("Unable to read GServices for: ");
        }
        Log.e("GservicesLoader", (String)o, (Throwable)o2);
        return null;
    }
}
