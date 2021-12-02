// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.content.res.Configuration;
import android.view.MenuInflater;
import androidx.annotation.y;
import android.util.AttributeSet;
import androidx.annotation.i;
import androidx.appcompat.view.b;
import androidx.annotation.x0;
import androidx.appcompat.widget.Toolbar;
import androidx.annotation.p0;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.annotation.e0;
import android.os.Bundle;
import android.view.Window;
import android.content.Context;
import android.app.Dialog;
import androidx.annotation.k0;
import android.app.Activity;
import android.util.Log;
import androidx.appcompat.widget.z0;
import java.util.Iterator;
import androidx.annotation.j0;
import java.lang.ref.WeakReference;
import androidx.collection.c;

public abstract class g
{
    static final boolean G = false;
    static final String H = "AppCompatDelegate";
    public static final int I = -1;
    @Deprecated
    public static final int J = 0;
    @Deprecated
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = 3;
    public static final int O = -100;
    private static int P = -100;
    private static final c<WeakReference<g>> Q;
    private static final Object R;
    public static final int S = 108;
    public static final int T = 109;
    public static final int U = 10;
    
    static {
        Q = new c<WeakReference<g>>();
        R = new Object();
    }
    
    g() {
    }
    
    static void G(@j0 final g g) {
        synchronized (g.R) {
            H(g);
        }
    }
    
    private static void H(@j0 final g g) {
        synchronized (g.R) {
            final Iterator<WeakReference<g>> iterator = g.Q.iterator();
            while (iterator.hasNext()) {
                final g g2 = iterator.next().get();
                if (g2 == g || g2 == null) {
                    iterator.remove();
                }
            }
        }
    }
    
    public static void J(final boolean b) {
        z0.b(b);
    }
    
    public static void N(final int p) {
        if (p != -1 && p != 0 && p != 1 && p != 2 && p != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        }
        else if (g.P != p) {
            g.P = p;
            f();
        }
    }
    
    static void c(@j0 final g referent) {
        synchronized (g.R) {
            H(referent);
            g.Q.add(new WeakReference<g>(referent));
        }
    }
    
    private static void f() {
        synchronized (g.R) {
            final Iterator<WeakReference<g>> iterator = g.Q.iterator();
            while (iterator.hasNext()) {
                final g g = iterator.next().get();
                if (g != null) {
                    g.e();
                }
            }
        }
    }
    
    @j0
    public static g i(@j0 final Activity activity, @k0 final f f) {
        return new h(activity, f);
    }
    
    @j0
    public static g j(@j0 final Dialog dialog, @k0 final f f) {
        return new h(dialog, f);
    }
    
    @j0
    public static g k(@j0 final Context context, @j0 final Activity activity, @k0 final f f) {
        return new h(context, activity, f);
    }
    
    @j0
    public static g l(@j0 final Context context, @j0 final Window window, @k0 final f f) {
        return new h(context, window, f);
    }
    
    public static int o() {
        return g.P;
    }
    
    public static boolean w() {
        return z0.a();
    }
    
    public abstract void A();
    
    public abstract void B(final Bundle p0);
    
    public abstract void C();
    
    public abstract void D(final Bundle p0);
    
    public abstract void E();
    
    public abstract void F();
    
    public abstract boolean I(final int p0);
    
    public abstract void K(@e0 final int p0);
    
    public abstract void L(final View p0);
    
    public abstract void M(final View p0, final ViewGroup$LayoutParams p1);
    
    public abstract void O(final boolean p0);
    
    @p0(17)
    public abstract void P(final int p0);
    
    public abstract void Q(@k0 final Toolbar p0);
    
    public void R(@x0 final int n) {
    }
    
    public abstract void S(@k0 final CharSequence p0);
    
    @k0
    public abstract b T(@j0 final b.a p0);
    
    public abstract void d(final View p0, final ViewGroup$LayoutParams p1);
    
    public abstract boolean e();
    
    @Deprecated
    public void g(final Context context) {
    }
    
    @i
    @j0
    public Context h(@j0 final Context context) {
        this.g(context);
        return context;
    }
    
    public abstract View m(@k0 final View p0, final String p1, @j0 final Context p2, @j0 final AttributeSet p3);
    
    @k0
    public abstract <T extends View> T n(@y final int p0);
    
    @k0
    public abstract androidx.appcompat.app.b.b p();
    
    public int q() {
        return -100;
    }
    
    public abstract MenuInflater r();
    
    @k0
    public abstract androidx.appcompat.app.a s();
    
    public abstract boolean t(final int p0);
    
    public abstract void u();
    
    public abstract void v();
    
    public abstract boolean x();
    
    public abstract void y(final Configuration p0);
    
    public abstract void z(final Bundle p0);
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface a {
    }
}
