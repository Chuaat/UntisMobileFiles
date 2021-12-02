// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.target;

import java.lang.ref.WeakReference;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.util.Iterator;
import java.util.Collection;
import android.view.ViewGroup$LayoutParams;
import android.util.Log;
import android.view.Display;
import android.graphics.Point;
import android.view.WindowManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.b1;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.d;
import com.bumptech.glide.util.k;
import androidx.annotation.j0;
import com.bumptech.glide.i;
import androidx.annotation.k0;
import android.view.View$OnAttachStateChangeListener;
import androidx.annotation.y;
import android.view.View;

public abstract class f<T extends View, Z> implements p<Z>
{
    private static final String L = "CustomViewTarget";
    @y
    private static final int M;
    private final b G;
    protected final T H;
    @k0
    private View$OnAttachStateChangeListener I;
    private boolean J;
    private boolean K;
    
    static {
        M = com.bumptech.glide.i.e.l;
    }
    
    public f(@j0 final T t) {
        this.H = k.d(t);
        this.G = new b(t);
    }
    
    @k0
    private Object g() {
        return this.H.getTag(f.M);
    }
    
    private void j() {
        final View$OnAttachStateChangeListener i = this.I;
        if (i != null) {
            if (!this.K) {
                this.H.addOnAttachStateChangeListener(i);
                this.K = true;
            }
        }
    }
    
    private void l() {
        final View$OnAttachStateChangeListener i = this.I;
        if (i != null) {
            if (this.K) {
                this.H.removeOnAttachStateChangeListener(i);
                this.K = false;
            }
        }
    }
    
    private void t(@k0 final Object o) {
        this.H.setTag(f.M, o);
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public final void b(@j0 final o o) {
        this.G.k(o);
    }
    
    @j0
    public final f<T, Z> d() {
        if (this.I != null) {
            return this;
        }
        this.I = (View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(final View view) {
                f.this.s();
            }
            
            public void onViewDetachedFromWindow(final View view) {
                f.this.q();
            }
        };
        this.j();
        return this;
    }
    
    @Override
    public final void e(@k0 final d d) {
        this.t(d);
    }
    
    @Override
    public void f() {
    }
    
    @j0
    public final T i() {
        return this.H;
    }
    
    @Override
    public final void k(@k0 final Drawable drawable) {
        this.j();
        this.n(drawable);
    }
    
    protected abstract void m(@k0 final Drawable p0);
    
    protected void n(@k0 final Drawable drawable) {
    }
    
    @k0
    @Override
    public final d o() {
        final Object g = this.g();
        if (g == null) {
            return null;
        }
        if (g instanceof d) {
            return (d)g;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }
    
    @Override
    public void onDestroy() {
    }
    
    @Override
    public final void p(@k0 final Drawable drawable) {
        this.G.b();
        this.m(drawable);
        if (!this.J) {
            this.l();
        }
    }
    
    final void q() {
        final d o = this.o();
        if (o != null) {
            this.J = true;
            o.clear();
            this.J = false;
        }
    }
    
    @Override
    public final void r(@j0 final o o) {
        this.G.d(o);
    }
    
    final void s() {
        final d o = this.o();
        if (o != null && o.g()) {
            o.i();
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Target for: ");
        sb.append(this.H);
        return sb.toString();
    }
    
    @Deprecated
    public final f<T, Z> u(@y final int n) {
        return this;
    }
    
    @j0
    public final f<T, Z> v() {
        this.G.c = true;
        return this;
    }
    
    @b1
    static final class b
    {
        private static final int e = 0;
        @b1
        @k0
        static Integer f;
        private final View a;
        private final List<o> b;
        boolean c;
        @k0
        private a d;
        
        b(@j0 final View a) {
            this.b = new ArrayList<o>();
            this.a = a;
        }
        
        private static int c(@j0 final Context context) {
            if (b.f == null) {
                final Display defaultDisplay = k.d(context.getSystemService("window")).getDefaultDisplay();
                final Point point = new Point();
                defaultDisplay.getSize(point);
                b.f = Math.max(point.x, point.y);
            }
            return b.f;
        }
        
        private int e(int n, final int n2, final int n3) {
            final int n4 = n2 - n3;
            if (n4 > 0) {
                return n4;
            }
            if (this.c && this.a.isLayoutRequested()) {
                return 0;
            }
            n -= n3;
            if (n > 0) {
                return n;
            }
            if (!this.a.isLayoutRequested() && n2 == -2) {
                if (Log.isLoggable("CustomViewTarget", 4)) {
                    Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
                }
                return c(this.a.getContext());
            }
            return 0;
        }
        
        private int f() {
            final int paddingTop = this.a.getPaddingTop();
            final int paddingBottom = this.a.getPaddingBottom();
            final ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
            int height;
            if (layoutParams != null) {
                height = layoutParams.height;
            }
            else {
                height = 0;
            }
            return this.e(this.a.getHeight(), height, paddingTop + paddingBottom);
        }
        
        private int g() {
            final int paddingLeft = this.a.getPaddingLeft();
            final int paddingRight = this.a.getPaddingRight();
            final ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
            int width;
            if (layoutParams != null) {
                width = layoutParams.width;
            }
            else {
                width = 0;
            }
            return this.e(this.a.getWidth(), width, paddingLeft + paddingRight);
        }
        
        private boolean h(final int n) {
            return n > 0 || n == Integer.MIN_VALUE;
        }
        
        private boolean i(final int n, final int n2) {
            return this.h(n) && this.h(n2);
        }
        
        private void j(final int n, final int n2) {
            final Iterator<o> iterator = new ArrayList<o>(this.b).iterator();
            while (iterator.hasNext()) {
                iterator.next().f(n, n2);
            }
        }
        
        void a() {
            if (this.b.isEmpty()) {
                return;
            }
            final int g = this.g();
            final int f = this.f();
            if (!this.i(g, f)) {
                return;
            }
            this.j(g, f);
            this.b();
        }
        
        void b() {
            final ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.d);
            }
            this.d = null;
            this.b.clear();
        }
        
        void d(@j0 final o o) {
            final int g = this.g();
            final int f = this.f();
            if (this.i(g, f)) {
                o.f(g, f);
                return;
            }
            if (!this.b.contains(o)) {
                this.b.add(o);
            }
            if (this.d == null) {
                this.a.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)(this.d = new a(this)));
            }
        }
        
        void k(@j0 final o o) {
            this.b.remove(o);
        }
        
        private static final class a implements ViewTreeObserver$OnPreDrawListener
        {
            private final WeakReference<b> G;
            
            a(@j0 final b referent) {
                this.G = new WeakReference<b>(referent);
            }
            
            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                    Log.v("CustomViewTarget", sb.toString());
                }
                final b b = this.G.get();
                if (b != null) {
                    b.a();
                }
                return true;
            }
        }
    }
}
