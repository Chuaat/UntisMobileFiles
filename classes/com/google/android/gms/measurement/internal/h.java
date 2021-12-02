// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class h
{
    public static final h c;
    private final Boolean a;
    private final Boolean b;
    
    static {
        c = new h(null, null);
    }
    
    public h(final Boolean a, final Boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public static h a(final Bundle bundle) {
        if (bundle == null) {
            return h.c;
        }
        return new h(o(bundle.getString("ad_storage")), o(bundle.getString("analytics_storage")));
    }
    
    public static h b(final String s) {
        final Boolean b = null;
        Boolean p = null;
        Boolean b2;
        if (s != null) {
            Boolean p2;
            if (s.length() >= 3) {
                p2 = p(s.charAt(2));
            }
            else {
                p2 = null;
            }
            if (s.length() >= 4) {
                p = p(s.charAt(3));
            }
            b2 = p2;
        }
        else {
            p = null;
            b2 = b;
        }
        return new h(b2, p);
    }
    
    static Boolean g(final Boolean b, final Boolean b2) {
        if (b == null) {
            return b2;
        }
        if (b2 == null) {
            return b;
        }
        final boolean booleanValue = b;
        boolean b3 = false;
        if (booleanValue) {
            b3 = b3;
            if (b2) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public static String h(final Bundle bundle) {
        final String string = bundle.getString("ad_storage");
        if (string != null && o(string) == null) {
            return string;
        }
        final String string2 = bundle.getString("analytics_storage");
        if (string2 != null && o(string2) == null) {
            return string2;
        }
        return null;
    }
    
    public static boolean l(final int n, final int n2) {
        return n <= n2;
    }
    
    static final int n(final Boolean b) {
        if (b == null) {
            return 0;
        }
        if (b) {
            return 1;
        }
        return 2;
    }
    
    private static Boolean o(final String s) {
        if (s == null) {
            return null;
        }
        if (s.equals("granted")) {
            return Boolean.TRUE;
        }
        if (s.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }
    
    private static Boolean p(final char c) {
        if (c == '0') {
            return Boolean.FALSE;
        }
        if (c != '1') {
            return null;
        }
        return Boolean.TRUE;
    }
    
    private static final char q(final Boolean b) {
        if (b == null) {
            return '-';
        }
        if (b) {
            return '1';
        }
        return '0';
    }
    
    public final h c(final h h) {
        return new h(g(this.a, h.a), g(this.b, h.b));
    }
    
    public final h d(final h h) {
        Boolean b;
        if ((b = this.a) == null) {
            b = h.a;
        }
        Boolean b2;
        if ((b2 = this.b) == null) {
            b2 = h.b;
        }
        return new h(b, b2);
    }
    
    public final Boolean e() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof h)) {
            return false;
        }
        final h h = (h)o;
        return n(this.a) == n(h.a) && n(this.b) == n(h.b);
    }
    
    public final Boolean f() {
        return this.b;
    }
    
    @Override
    public final int hashCode() {
        return (n(this.a) + 527) * 31 + n(this.b);
    }
    
    public final String i() {
        final StringBuilder sb = new StringBuilder("G1");
        sb.append(q(this.a));
        sb.append(q(this.b));
        return sb.toString();
    }
    
    public final boolean j() {
        final Boolean a = this.a;
        return a == null || a;
    }
    
    public final boolean k() {
        final Boolean b = this.b;
        return b == null || b;
    }
    
    public final boolean m(final h h) {
        final Boolean a = this.a;
        final Boolean false = Boolean.FALSE;
        final boolean b = true;
        if (a == false) {
            final boolean b2 = b;
            if (h.a != false) {
                return b2;
            }
        }
        boolean b2;
        if (this.b == false) {
            if (h.b == false) {
                return false;
            }
            b2 = b;
        }
        else {
            b2 = false;
        }
        return b2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        final Boolean a = this.a;
        final String s = "denied";
        if (a == null) {
            sb.append("uninitialized");
        }
        else {
            String str;
            if (!a) {
                str = "denied";
            }
            else {
                str = "granted";
            }
            sb.append(str);
        }
        sb.append(", analyticsStorage=");
        final Boolean b = this.b;
        if (b == null) {
            sb.append("uninitialized");
        }
        else {
            String str2;
            if (!b) {
                str2 = s;
            }
            else {
                str2 = "granted";
            }
            sb.append(str2);
        }
        return sb.toString();
    }
}
