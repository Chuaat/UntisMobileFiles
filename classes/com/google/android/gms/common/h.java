// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import com.google.android.gms.common.internal.o;
import androidx.annotation.j0;
import android.app.PendingIntent;
import com.google.android.gms.common.internal.m1;
import androidx.annotation.RecentlyNullable;
import android.content.Intent;
import com.google.android.gms.common.util.d0;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.common.wrappers.c;
import android.text.TextUtils;
import androidx.annotation.k0;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import f2.a;
import com.google.android.gms.common.internal.b0;

@b0
@a
public class h
{
    @RecentlyNonNull
    @a
    public static final int a;
    @RecentlyNonNull
    @a
    public static final String b = "com.google.android.gms";
    @RecentlyNonNull
    @a
    public static final String c = "com.android.vending";
    @a
    static final String d = "d";
    @a
    static final String e = "n";
    private static final h f;
    
    static {
        a = l.a;
        f = new h();
    }
    
    @a
    h() {
    }
    
    @RecentlyNonNull
    @a
    public static h i() {
        return h.f;
    }
    
    @d0
    private static String q(@k0 final Context context, @k0 final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(h.a);
        sb.append("-");
        if (!TextUtils.isEmpty((CharSequence)str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        Label_0094: {
            if (context == null) {
                break Label_0094;
            }
            try {
                sb.append(com.google.android.gms.common.wrappers.c.a(context).e(context.getPackageName(), 0).versionCode);
                return sb.toString();
            }
            catch (PackageManager$NameNotFoundException ex) {
                return sb.toString();
            }
        }
    }
    
    @a
    public void a(@RecentlyNonNull final Context context) {
        l.a(context);
    }
    
    @RecentlyNonNull
    @b0
    @a
    public int b(@RecentlyNonNull final Context context) {
        return l.d(context);
    }
    
    @RecentlyNonNull
    @b0
    @a
    public int c(@RecentlyNonNull final Context context) {
        return l.e(context);
    }
    
    @Deprecated
    @RecentlyNullable
    @b0
    @a
    public Intent d(@RecentlyNonNull final int n) {
        return this.e(null, n, null);
    }
    
    @RecentlyNullable
    @b0
    @a
    public Intent e(@k0 final Context context, @RecentlyNonNull final int n, @k0 final String s) {
        if (n != 1 && n != 2) {
            if (n != 3) {
                return null;
            }
            return m1.b("com.google.android.gms");
        }
        else {
            if (context != null && com.google.android.gms.common.util.l.l(context)) {
                return m1.a();
            }
            return m1.c("com.google.android.gms", q(context, s));
        }
    }
    
    @RecentlyNullable
    @a
    public PendingIntent f(@RecentlyNonNull final Context context, @RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        return this.g(context, n, n2, null);
    }
    
    @RecentlyNullable
    @b0
    @a
    public PendingIntent g(@RecentlyNonNull final Context context, @RecentlyNonNull final int n, @RecentlyNonNull final int n2, @k0 final String s) {
        final Intent e = this.e(context, n, s);
        if (e == null) {
            return null;
        }
        return PendingIntent.getActivity(context, n2, e, 134217728);
    }
    
    @j0
    @a
    public String h(@RecentlyNonNull final int n) {
        return l.g(n);
    }
    
    @RecentlyNonNull
    @o
    @a
    public int j(@RecentlyNonNull final Context context) {
        return this.k(context, h.a);
    }
    
    @RecentlyNonNull
    @a
    public int k(@RecentlyNonNull final Context context, @RecentlyNonNull int m) {
        if (l.o(context, m = l.m(context, m))) {
            m = 18;
        }
        return m;
    }
    
    @RecentlyNonNull
    @b0
    @a
    public boolean l(@RecentlyNonNull final Context context, @RecentlyNonNull final int n) {
        return l.o(context, n);
    }
    
    @RecentlyNonNull
    @b0
    @a
    public boolean m(@RecentlyNonNull final Context context, @RecentlyNonNull final int n) {
        return l.p(context, n);
    }
    
    @RecentlyNonNull
    @a
    public boolean n(@RecentlyNonNull final Context context, @RecentlyNonNull final String s) {
        return l.v(context, s);
    }
    
    @RecentlyNonNull
    @a
    public boolean o(@RecentlyNonNull final int n) {
        return l.s(n);
    }
    
    @a
    public void p(@RecentlyNonNull final Context context, @RecentlyNonNull final int n) throws j, i {
        l.c(context, n);
    }
}
