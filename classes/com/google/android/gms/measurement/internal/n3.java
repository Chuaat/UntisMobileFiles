// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import com.google.android.gms.common.internal.x;
import android.util.Log;
import com.google.android.gms.common.util.d0;
import android.text.TextUtils;
import androidx.annotation.w;

public final class n3 extends u5
{
    private char c;
    private long d;
    @w("this")
    private String e;
    private final l3 f;
    private final l3 g;
    private final l3 h;
    private final l3 i;
    private final l3 j;
    private final l3 k;
    private final l3 l;
    private final l3 m;
    private final l3 n;
    
    n3(final z4 z4) {
        super(z4);
        this.c = 0;
        this.d = -1L;
        this.f = new l3(this, 6, false, false);
        this.g = new l3(this, 6, true, false);
        this.h = new l3(this, 6, false, true);
        this.i = new l3(this, 5, false, false);
        this.j = new l3(this, 5, true, false);
        this.k = new l3(this, 5, false, true);
        this.l = new l3(this, 4, false, false);
        this.m = new l3(this, 3, false, false);
        this.n = new l3(this, 2, false, false);
    }
    
    private static String D(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return "";
        }
        final int lastIndex = s.lastIndexOf(46);
        if (lastIndex == -1) {
            return s;
        }
        return s.substring(0, lastIndex);
    }
    
    protected static Object w(final String s) {
        if (s == null) {
            return null;
        }
        return new m3(s);
    }
    
    static String x(final boolean b, String str, final Object o, final Object o2, Object o3) {
        final String s = "";
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        final String y = y(b, o);
        final String y2 = y(b, o2);
        final String y3 = y(b, o3);
        o3 = new StringBuilder();
        str = s;
        if (!TextUtils.isEmpty((CharSequence)str2)) {
            ((StringBuilder)o3).append(str2);
            str = ": ";
        }
        final boolean empty = TextUtils.isEmpty((CharSequence)y);
        final String s2 = ", ";
        String s3 = str;
        if (!empty) {
            ((StringBuilder)o3).append(str);
            ((StringBuilder)o3).append(y);
            s3 = ", ";
        }
        if (!TextUtils.isEmpty((CharSequence)y2)) {
            ((StringBuilder)o3).append(s3);
            ((StringBuilder)o3).append(y2);
            s3 = s2;
        }
        if (!TextUtils.isEmpty((CharSequence)y3)) {
            ((StringBuilder)o3).append(s3);
            ((StringBuilder)o3).append(y3);
        }
        return ((StringBuilder)o3).toString();
    }
    
    @d0
    static String y(final boolean b, Object o) {
        final String s = "";
        if (o == null) {
            return "";
        }
        Object value = o;
        if (o instanceof Integer) {
            value = o;
        }
        final boolean b2 = value instanceof Long;
        int i = 0;
        if (b2) {
            if (!b) {
                return String.valueOf(value);
            }
            final Long n = (Long)value;
            if (Math.abs(n) < 100L) {
                return String.valueOf(value);
            }
            String s2 = s;
            if (String.valueOf(value).charAt(0) == '-') {
                s2 = "-";
            }
            final String value2 = String.valueOf(Math.abs(n));
            final long round = Math.round(Math.pow(10.0, value2.length() - 1));
            final long round2 = Math.round(Math.pow(10.0, value2.length()) - 1.0);
            final StringBuilder sb = new StringBuilder(s2.length() + 43 + s2.length());
            sb.append(s2);
            sb.append(round);
            sb.append("...");
            sb.append(s2);
            sb.append(round2);
            return sb.toString();
        }
        else {
            if (value instanceof Boolean) {
                return String.valueOf(value);
            }
            if (value instanceof Throwable) {
                final Throwable t = (Throwable)value;
                String str;
                if (b) {
                    str = t.getClass().getName();
                }
                else {
                    str = t.toString();
                }
                o = new StringBuilder(str);
                final String d = D(z4.class.getCanonicalName());
                for (StackTraceElement[] stackTrace = t.getStackTrace(); i < stackTrace.length; ++i) {
                    final StackTraceElement obj = stackTrace[i];
                    if (!obj.isNativeMethod()) {
                        final String className = obj.getClassName();
                        if (className != null && D(className).equals(d)) {
                            ((StringBuilder)o).append(": ");
                            ((StringBuilder)o).append(obj);
                            break;
                        }
                    }
                }
                return ((StringBuilder)o).toString();
            }
            if (value instanceof m3) {
                return m3.a((m3)value);
            }
            if (b) {
                return "-";
            }
            return String.valueOf(value);
        }
    }
    
    protected final void C(int n, final boolean b, final boolean b2, final String s, final Object o, final Object o2, final Object o3) {
        if (!b && Log.isLoggable(this.z(), n)) {
            Log.println(n, this.z(), x(false, s, o, o2, o3));
        }
        if (!b2 && n >= 5) {
            x.k(s);
            final w4 d = super.a.D();
            if (d == null) {
                Log.println(6, this.z(), "Scheduler not set. Not logging error/warn");
                return;
            }
            if (!d.k()) {
                Log.println(6, this.z(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (n >= 9) {
                n = 8;
            }
            d.w(new k3(this, n, s, o, o2, o3));
        }
    }
    
    @Override
    protected final boolean g() {
        return false;
    }
    
    public final l3 n() {
        return this.m;
    }
    
    public final l3 o() {
        return this.f;
    }
    
    public final l3 p() {
        return this.h;
    }
    
    public final l3 q() {
        return this.g;
    }
    
    public final l3 r() {
        return this.l;
    }
    
    public final l3 s() {
        return this.n;
    }
    
    public final l3 t() {
        return this.i;
    }
    
    public final l3 u() {
        return this.k;
    }
    
    public final l3 v() {
        return this.j;
    }
    
    @EnsuresNonNull({ "logTagDoNotUseDirectly" })
    @d0
    protected final String z() {
        synchronized (this) {
            if (this.e == null) {
                String e;
                if (super.a.P() != null) {
                    e = super.a.P();
                }
                else {
                    e = super.a.w().t();
                }
                this.e = e;
            }
            x.k(this.e);
            return this.e;
        }
    }
}
