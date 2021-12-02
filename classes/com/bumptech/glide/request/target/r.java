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
import android.view.View;

@Deprecated
public abstract class r<T extends View, Z> extends com.bumptech.glide.request.target.b<Z>
{
    private static final String M = "ViewTarget";
    private static boolean N;
    private static int O;
    protected final T H;
    private final b I;
    @k0
    private View$OnAttachStateChangeListener J;
    private boolean K;
    private boolean L;
    
    static {
        r.O = com.bumptech.glide.i.e.l;
    }
    
    public r(@j0 final T t) {
        this.H = k.d(t);
        this.I = new b(t);
    }
    
    @Deprecated
    public r(@j0 final T t, final boolean b) {
        this(t);
        if (b) {
            this.v();
        }
    }
    
    @k0
    private Object l() {
        return this.H.getTag(r.O);
    }
    
    private void m() {
        final View$OnAttachStateChangeListener j = this.J;
        if (j != null) {
            if (!this.L) {
                this.H.addOnAttachStateChangeListener(j);
                this.L = true;
            }
        }
    }
    
    private void n() {
        final View$OnAttachStateChangeListener j = this.J;
        if (j != null) {
            if (this.L) {
                this.H.removeOnAttachStateChangeListener(j);
                this.L = false;
            }
        }
    }
    
    private void t(@k0 final Object o) {
        r.N = true;
        this.H.setTag(r.O, o);
    }
    
    @Deprecated
    public static void u(final int o) {
        if (!r.N) {
            r.O = o;
            return;
        }
        throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
    }
    
    @androidx.annotation.i
    @Override
    public void b(@j0 final o o) {
        this.I.k(o);
    }
    
    @Override
    public void e(@k0 final d d) {
        this.t(d);
    }
    
    @j0
    public T g() {
        return this.H;
    }
    
    @j0
    public final r<T, Z> j() {
        if (this.J != null) {
            return this;
        }
        this.J = (View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(final View view) {
                r.this.s();
            }
            
            public void onViewDetachedFromWindow(final View view) {
                r.this.q();
            }
        };
        this.m();
        return this;
    }
    
    @androidx.annotation.i
    @Override
    public void k(@k0 final Drawable drawable) {
        super.k(drawable);
        this.m();
    }
    
    @k0
    @Override
    public d o() {
        final Object l = this.l();
        d d;
        if (l != null) {
            if (!(l instanceof d)) {
                throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
            }
            d = (d)l;
        }
        else {
            d = null;
        }
        return d;
    }
    
    @androidx.annotation.i
    @Override
    public void p(@k0 final Drawable drawable) {
        super.p(drawable);
        this.I.b();
        if (!this.K) {
            this.n();
        }
    }
    
    void q() {
        final d o = this.o();
        if (o != null) {
            this.K = true;
            o.clear();
            this.K = false;
        }
    }
    
    @androidx.annotation.i
    @Override
    public void r(@j0 final o o) {
        this.I.d(o);
    }
    
    void s() {
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
    
    @j0
    public final r<T, Z> v() {
        this.I.c = true;
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
                if (Log.isLoggable("ViewTarget", 4)) {
                    Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
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
                if (Log.isLoggable("ViewTarget", 2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                    Log.v("ViewTarget", sb.toString());
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
