// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import java.lang.ref.WeakReference;
import android.view.ViewParent;
import androidx.core.app.a;
import android.app.Activity;
import android.view.View;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.os.Bundle;
import android.view.View$OnClickListener;
import androidx.annotation.y;

public final class t0
{
    private t0() {
    }
    
    @j0
    public static View$OnClickListener a(@y final int n) {
        return b(n, null);
    }
    
    @j0
    public static View$OnClickListener b(@y final int n, @k0 final Bundle bundle) {
        return (View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                t0.e(view).t(n, bundle);
            }
        };
    }
    
    @j0
    public static View$OnClickListener c(@j0 final d0 d0) {
        return (View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                t0.e(view).D(d0);
            }
        };
    }
    
    @j0
    public static NavController d(@j0 final Activity obj, @y final int i) {
        final NavController f = f(a.E(obj, i));
        if (f != null) {
            return f;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Activity ");
        sb.append(obj);
        sb.append(" does not have a NavController set on ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
    
    @j0
    public static NavController e(@j0 final View obj) {
        final NavController f = f(obj);
        if (f != null) {
            return f;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(obj);
        sb.append(" does not have a NavController set");
        throw new IllegalStateException(sb.toString());
    }
    
    @k0
    private static NavController f(@j0 View view) {
        while (view != null) {
            final NavController g = g(view);
            if (g != null) {
                return g;
            }
            final ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View)parent;
            }
            else {
                view = null;
            }
        }
        return null;
    }
    
    @k0
    private static NavController g(@j0 final View view) {
        Object o = view.getTag(z0.e.X);
        if (o instanceof WeakReference) {
            o = ((WeakReference<Object>)o).get();
        }
        else if (!(o instanceof NavController)) {
            return null;
        }
        return (NavController)o;
    }
    
    public static void h(@j0 final View view, @k0 final NavController navController) {
        view.setTag(z0.e.X, (Object)navController);
    }
}
