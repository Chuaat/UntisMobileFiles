// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.util.Log;
import androidx.core.content.i;
import android.os.Handler;
import android.database.ContentObserver;
import c6.h;
import android.content.Context;
import androidx.annotation.w;

final class p6 implements m6
{
    @w("GservicesLoader.class")
    private static p6 c;
    @h
    private final Context a;
    @h
    private final ContentObserver b;
    
    private p6() {
        this.a = null;
        this.b = null;
    }
    
    private p6(final Context a) {
        this.a = a;
        final o6 b = new o6(this, null);
        this.b = b;
        a.getContentResolver().registerContentObserver(c6.a, true, (ContentObserver)b);
    }
    
    static p6 b(final Context context) {
        synchronized (p6.class) {
            if (p6.c == null) {
                p6 c;
                if (i.d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    c = new p6(context);
                }
                else {
                    c = new p6();
                }
                p6.c = c;
            }
            return p6.c;
        }
    }
    
    static void e() {
        synchronized (p6.class) {
            final p6 c = p6.c;
            if (c != null) {
                final Context a = c.a;
                if (a != null && c.b != null) {
                    a.getContentResolver().unregisterContentObserver(p6.c.b);
                }
            }
            p6.c = null;
        }
    }
    
    public final String c(String o) {
        if (this.a == null) {
            return null;
        }
        Object o2 = null;
        try {
            o2 = new n6(this, (String)o);
            o2 = k6.a((l6<String>)o2);
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
