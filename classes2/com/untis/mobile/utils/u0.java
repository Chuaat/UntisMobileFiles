// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.annotation.s;
import androidx.annotation.n;
import android.view.View$OnClickListener;
import android.util.Log;
import java.util.concurrent.TimeoutException;
import h5.h;
import h5.g;
import h5.f;
import h5.e;
import h5.d;
import h5.c;
import h5.b;
import h5.a;
import javax.net.ssl.SSLHandshakeException;
import java.net.UnknownHostException;
import java.net.ConnectException;
import com.untis.mobile.api.error.JsonRpcErrorUnspecified;
import com.untis.mobile.api.error.JsonRpcError;
import androidx.annotation.k0;
import androidx.annotation.w0;
import androidx.annotation.j0;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;

public class u0
{
    public static void b(@j0 final View view, @w0 final int n) {
        c(view, view.getContext().getString(n));
    }
    
    public static void c(final View view, final String s) {
        l(j(view, s), 2131099937).f0();
    }
    
    public static void d(@k0 final View view, @k0 final Throwable t) {
        if (view != null) {
            if (view.getContext() != null) {
                try {
                    if (t instanceof RuntimeException) {
                        final Throwable cause = t.getCause();
                        if (cause != null) {
                            if (cause instanceof JsonRpcError) {
                                switch (u0$a.a[((JsonRpcError)cause).getType().ordinal()]) {
                                    default: {
                                        c(view, view.getContext().getString(2131886693).replace("{0}", String.valueOf(((JsonRpcError)cause).getType().getCode())));
                                        return;
                                    }
                                    case 27: {
                                        c(view, view.getContext().getString(2131886693).replace("{0}", "no result"));
                                        return;
                                    }
                                    case 26: {
                                        c(view, "method not found");
                                        return;
                                    }
                                    case 25: {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append("unspecified error(");
                                        sb.append(t.getMessage());
                                        sb.append(")");
                                        c(view, sb.toString());
                                        return;
                                    }
                                    case 24: {
                                        c(view, "invalid date");
                                        return;
                                    }
                                    case 23: {
                                        c(view, "invalid person type");
                                        return;
                                    }
                                    case 22: {
                                        c(view, "invalid element id");
                                        return;
                                    }
                                    case 21: {
                                        c(view, "invalid timetable type");
                                        return;
                                    }
                                    case 20: {
                                        c(view, "invalid user role");
                                        return;
                                    }
                                    case 19: {
                                        c(view, "invalid user status");
                                        return;
                                    }
                                    case 18: {
                                        c(view, "invalid client time");
                                        return;
                                    }
                                    case 17: {
                                        b(view, 2131886705);
                                        return;
                                    }
                                    case 16: {
                                        b(view, 2131886719);
                                        return;
                                    }
                                    case 15: {
                                        b(view, 2131886707);
                                        return;
                                    }
                                    case 12:
                                    case 13:
                                    case 14: {
                                        b(view, 2131886694);
                                        return;
                                    }
                                    case 11: {
                                        b(view, 2131886347);
                                        return;
                                    }
                                    case 10: {
                                        c(view, "no user specified");
                                        return;
                                    }
                                    case 9: {
                                        c(view, "invalid school");
                                    }
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8: {
                                        return;
                                    }
                                    case 3: {
                                        b(view, 2131886590);
                                        return;
                                    }
                                    case 2: {
                                        b(view, 2131886591);
                                        return;
                                    }
                                    case 1: {
                                        b(view, 2131886592);
                                        return;
                                    }
                                }
                            }
                            else {
                                if (cause instanceof JsonRpcErrorUnspecified) {
                                    c(view, view.getContext().getString(2131886693).replace("{0}", String.valueOf(((JsonRpcErrorUnspecified)cause).code)));
                                    return;
                                }
                                if (cause instanceof ConnectException) {
                                    c(view, view.getContext().getString(2131886703));
                                    return;
                                }
                                if (cause instanceof UnknownHostException) {
                                    b(view, 2131886703);
                                    return;
                                }
                                if (cause instanceof SSLHandshakeException) {
                                    b(view, 2131886709);
                                    return;
                                }
                            }
                        }
                        c(view, view.getContext().getString(2131886693).replace("{0}", "unknown error"));
                    }
                    if (t instanceof a) {
                        b(view, 2131886719);
                    }
                    else if (t instanceof b) {
                        b(view, 2131886711);
                    }
                    else if (t instanceof c) {
                        b(view, 2131886694);
                    }
                    else {
                        String s = null;
                        Label_0585: {
                            if (t instanceof d) {
                                s = view.getContext().getString(2131886693).replace("{0}", String.valueOf(((d)t).a()));
                            }
                            else {
                                if (!(t instanceof e)) {
                                    if (!(t instanceof f)) {
                                        if (t instanceof g) {
                                            b(view, 2131886705);
                                            return;
                                        }
                                        if (t instanceof h) {
                                            b(view, 2131886707);
                                            return;
                                        }
                                        if (t instanceof TimeoutException) {
                                            b(view, 2131886714);
                                            return;
                                        }
                                        if (!(t instanceof UnknownHostException)) {
                                            if (t instanceof SSLHandshakeException) {
                                                b(view, 2131886709);
                                                return;
                                            }
                                            s = view.getContext().getString(2131886693).replace("{0}", t.getClass().getSimpleName().toLowerCase());
                                            break Label_0585;
                                        }
                                    }
                                    b(view, 2131886703);
                                    return;
                                }
                                s = view.getContext().getString(2131886693).replace("{0}", "Tik Tak");
                            }
                        }
                        c(view, s);
                    }
                }
                catch (Exception ex) {
                    Log.e("untis_log", "error while snackbar error", (Throwable)ex);
                }
            }
        }
    }
    
    public static void e(final View view, final String s) {
        l(k(view, s), 2131099937).f0();
    }
    
    public static void f(final View view, final String s, final View$OnClickListener view$OnClickListener) {
        final Snackbar l = l(k(view, s), 2131099937);
        l.u0(2131886660, view$OnClickListener);
        l.f0();
    }
    
    public static void g(final View view, final String s) {
        final Snackbar l = l(j(view, s), 2131099938);
        m(l, 2131230905);
        l.f0();
    }
    
    public static void h(final View view, final String s) {
        final Snackbar l = l(k(view, s), 2131099938);
        m(l, 2131230905);
        l.f0();
    }
    
    private static Snackbar j(final View view, final String s) {
        return Snackbar.s0(view, (CharSequence)s, 0);
    }
    
    private static Snackbar k(final View view, final String s) {
        final Snackbar j = j(view, s);
        ((BaseTransientBottomBar)j).a0(-2);
        j.u0(2131886660, (View$OnClickListener)new t0(j));
        j.w0(androidx.core.content.d.f(view.getContext(), 2131099704));
        return j;
    }
    
    private static Snackbar l(final Snackbar snackbar, @n final int n) {
        ((BaseTransientBottomBar)snackbar).J().setBackgroundColor(androidx.core.content.d.f(((BaseTransientBottomBar)snackbar).J().getContext(), n));
        return snackbar;
    }
    
    private static Snackbar m(final Snackbar snackbar, @s final int n) {
        final TextView textView = (TextView)((BaseTransientBottomBar)snackbar).J().findViewById(2131298805);
        textView.setCompoundDrawablePadding(textView.getContext().getResources().getDimensionPixelSize(2131165279));
        textView.setCompoundDrawablesWithIntrinsicBounds(androidx.core.content.d.i(textView.getContext(), n), (Drawable)null, (Drawable)null, (Drawable)null);
        return snackbar;
    }
    
    public static void n(final View view, final String s) {
        l(j(view, s), 2131099939).f0();
    }
    
    public static void o(final View view, final String s) {
        l(k(view, s), 2131099939).f0();
    }
    
    public static void p(final View view, final String s) {
        l(j(view, s), 2131099940).f0();
    }
    
    public static void q(final View view, final String s) {
        l(k(view, s), 2131099940).f0();
    }
    
    public static void r(final View view, final String s, final View$OnClickListener view$OnClickListener) {
        final Snackbar l = l(k(view, s), 2131099940);
        l.u0(2131886660, view$OnClickListener);
        l.f0();
    }
}
