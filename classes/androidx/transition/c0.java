// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.view.LayoutInflater;
import android.util.SparseArray;
import androidx.annotation.e0;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

public class c0
{
    private Context a;
    private int b;
    private ViewGroup c;
    private View d;
    private Runnable e;
    private Runnable f;
    
    public c0(@j0 final ViewGroup c) {
        this.b = -1;
        this.c = c;
    }
    
    private c0(final ViewGroup c, final int b, final Context a) {
        this.b = -1;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public c0(@j0 final ViewGroup c, @j0 final View d) {
        this.b = -1;
        this.c = c;
        this.d = d;
    }
    
    @k0
    public static c0 c(@j0 final ViewGroup viewGroup) {
        return (c0)viewGroup.getTag(a0.g.R1);
    }
    
    @j0
    public static c0 d(@j0 final ViewGroup viewGroup, @e0 final int n, @j0 final Context context) {
        final int u1 = a0.g.U1;
        SparseArray sparseArray;
        if ((sparseArray = (SparseArray)viewGroup.getTag(u1)) == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(u1, (Object)sparseArray);
        }
        final c0 c0 = (c0)sparseArray.get(n);
        if (c0 != null) {
            return c0;
        }
        final c0 c2 = new c0(viewGroup, n, context);
        sparseArray.put(n, (Object)c2);
        return c2;
    }
    
    static void g(@j0 final ViewGroup viewGroup, @k0 final c0 c0) {
        viewGroup.setTag(a0.g.R1, (Object)c0);
    }
    
    public void a() {
        if (this.b > 0 || this.d != null) {
            this.e().removeAllViews();
            if (this.b > 0) {
                LayoutInflater.from(this.a).inflate(this.b, this.c);
            }
            else {
                this.c.addView(this.d);
            }
        }
        final Runnable e = this.e;
        if (e != null) {
            e.run();
        }
        g(this.c, this);
    }
    
    public void b() {
        if (c(this.c) == this) {
            final Runnable f = this.f;
            if (f != null) {
                f.run();
            }
        }
    }
    
    @j0
    public ViewGroup e() {
        return this.c;
    }
    
    boolean f() {
        return this.b > 0;
    }
    
    public void h(@k0 final Runnable e) {
        this.e = e;
    }
    
    public void i(@k0 final Runnable f) {
        this.f = f;
    }
}
