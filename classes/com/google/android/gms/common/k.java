// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import androidx.annotation.RecentlyNullable;
import f2.a;
import com.google.android.gms.common.internal.o;
import android.content.res.Resources;
import com.google.android.gms.common.util.d0;
import android.app.PendingIntent;
import android.app.Dialog;
import com.google.android.gms.common.internal.f0;
import android.content.Context;
import android.content.DialogInterface$OnCancelListener;
import androidx.annotation.k0;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import androidx.annotation.RecentlyNonNull;

public final class k extends l
{
    @RecentlyNonNull
    public static final String m = "GooglePlayServicesErrorDialog";
    @Deprecated
    @RecentlyNonNull
    public static final int n;
    @Deprecated
    @RecentlyNonNull
    public static final String o = "com.google.android.gms";
    @RecentlyNonNull
    public static final String p = "com.android.vending";
    
    static {
        n = com.google.android.gms.common.l.a;
    }
    
    private k() {
    }
    
    @RecentlyNonNull
    public static boolean A(@RecentlyNonNull final int n, @RecentlyNonNull final Activity activity, @k0 final Fragment fragment, @RecentlyNonNull final int n2, @k0 final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        int n3 = n;
        if (com.google.android.gms.common.l.o((Context)activity, n)) {
            n3 = 18;
        }
        final g y = com.google.android.gms.common.g.y();
        if (fragment == null) {
            return y.C(activity, n3, n2, dialogInterface$OnCancelListener);
        }
        final Dialog g = com.google.android.gms.common.g.G((Context)activity, n3, f0.b(fragment, com.google.android.gms.common.g.y().e((Context)activity, n3, "d"), n2), dialogInterface$OnCancelListener);
        if (g == null) {
            return false;
        }
        com.google.android.gms.common.g.L(activity, g, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener);
        return true;
    }
    
    @Deprecated
    public static void B(@RecentlyNonNull final int n, @RecentlyNonNull final Context context) {
        final g y = com.google.android.gms.common.g.y();
        if (!com.google.android.gms.common.l.o(context, n) && !com.google.android.gms.common.l.p(context, n)) {
            y.D(context, n);
            return;
        }
        y.M(context);
    }
    
    @Deprecated
    @RecentlyNonNull
    public static PendingIntent f(@RecentlyNonNull final int n, @RecentlyNonNull final Context context, @RecentlyNonNull final int n2) {
        return com.google.android.gms.common.l.f(n, context, n2);
    }
    
    @Deprecated
    @RecentlyNonNull
    @d0
    public static String g(@RecentlyNonNull final int n) {
        return com.google.android.gms.common.l.g(n);
    }
    
    @RecentlyNonNull
    public static Context i(@RecentlyNonNull final Context context) {
        return com.google.android.gms.common.l.i(context);
    }
    
    @RecentlyNonNull
    public static Resources j(@RecentlyNonNull final Context context) {
        return com.google.android.gms.common.l.j(context);
    }
    
    @Deprecated
    @RecentlyNonNull
    @o
    public static int l(@RecentlyNonNull final Context context) {
        return com.google.android.gms.common.l.l(context);
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static int m(@RecentlyNonNull final Context context, @RecentlyNonNull final int n) {
        return com.google.android.gms.common.l.m(context, n);
    }
    
    @Deprecated
    @RecentlyNonNull
    public static boolean s(@RecentlyNonNull final int n) {
        return com.google.android.gms.common.l.s(n);
    }
    
    @Deprecated
    @RecentlyNullable
    public static Dialog w(@RecentlyNonNull final int n, @RecentlyNonNull final Activity activity, @RecentlyNonNull final int n2) {
        return x(n, activity, n2, null);
    }
    
    @Deprecated
    @RecentlyNullable
    public static Dialog x(@RecentlyNonNull final int n, @RecentlyNonNull final Activity activity, @RecentlyNonNull final int n2, @k0 final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        int n3 = n;
        if (com.google.android.gms.common.l.o((Context)activity, n)) {
            n3 = 18;
        }
        return com.google.android.gms.common.g.y().u(activity, n3, n2, dialogInterface$OnCancelListener);
    }
    
    @Deprecated
    @RecentlyNonNull
    public static boolean y(@RecentlyNonNull final int n, @RecentlyNonNull final Activity activity, @RecentlyNonNull final int n2) {
        return z(n, activity, n2, null);
    }
    
    @Deprecated
    @RecentlyNonNull
    public static boolean z(@RecentlyNonNull final int n, @RecentlyNonNull final Activity activity, @RecentlyNonNull final int n2, @k0 final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        return A(n, activity, null, n2, dialogInterface$OnCancelListener);
    }
}
