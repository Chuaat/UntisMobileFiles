// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shape;

import androidx.annotation.q;
import androidx.annotation.t0;
import android.graphics.RectF;
import android.util.TypedValue;
import androidx.annotation.f;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import androidx.annotation.x0;
import android.content.Context;
import androidx.annotation.j0;

public class o
{
    public static final d m;
    e a;
    e b;
    e c;
    e d;
    d e;
    d f;
    d g;
    d h;
    g i;
    g j;
    g k;
    g l;
    
    static {
        m = new m(0.5f);
    }
    
    public o() {
        this.a = com.google.android.material.shape.k.b();
        this.b = com.google.android.material.shape.k.b();
        this.c = com.google.android.material.shape.k.b();
        this.d = com.google.android.material.shape.k.b();
        this.e = new a(0.0f);
        this.f = new a(0.0f);
        this.g = new a(0.0f);
        this.h = new a(0.0f);
        this.i = com.google.android.material.shape.k.c();
        this.j = com.google.android.material.shape.k.c();
        this.k = com.google.android.material.shape.k.c();
        this.l = com.google.android.material.shape.k.c();
    }
    
    private o(@j0 final b b) {
        this.a = b.a;
        this.b = b.b;
        this.c = b.c;
        this.d = b.d;
        this.e = b.e;
        this.f = b.f;
        this.g = b.g;
        this.h = b.h;
        this.i = b.i;
        this.j = b.j;
        this.k = b.k;
        this.l = b.l;
    }
    
    @j0
    public static b a() {
        return new b();
    }
    
    @j0
    public static b b(final Context context, @x0 final int n, @x0 final int n2) {
        return c(context, n, n2, 0);
    }
    
    @j0
    private static b c(final Context context, @x0 final int n, @x0 final int n2, final int n3) {
        return d(context, n, n2, new a((float)n3));
    }
    
    @j0
    private static b d(Context obtainStyledAttributes, @x0 int int1, @x0 int int2, @j0 d m) {
        Object o = obtainStyledAttributes;
        int n = int1;
        if (int2 != 0) {
            o = new ContextThemeWrapper(obtainStyledAttributes, int1);
            n = int2;
        }
        obtainStyledAttributes = (Context)((Context)o).obtainStyledAttributes(n, o2.a.o.Kp);
        try {
            final int int3 = ((TypedArray)obtainStyledAttributes).getInt(o2.a.o.Lp, 0);
            int1 = ((TypedArray)obtainStyledAttributes).getInt(o2.a.o.Op, int3);
            int2 = ((TypedArray)obtainStyledAttributes).getInt(o2.a.o.Pp, int3);
            final int int4 = ((TypedArray)obtainStyledAttributes).getInt(o2.a.o.Np, int3);
            final int int5 = ((TypedArray)obtainStyledAttributes).getInt(o2.a.o.Mp, int3);
            final d i = m((TypedArray)obtainStyledAttributes, o2.a.o.Qp, m);
            final d j = m((TypedArray)obtainStyledAttributes, o2.a.o.Tp, i);
            final d k = m((TypedArray)obtainStyledAttributes, o2.a.o.Up, i);
            m = m((TypedArray)obtainStyledAttributes, o2.a.o.Sp, i);
            return new b().I(int1, j).N(int2, k).A(int4, m).v(int5, m((TypedArray)obtainStyledAttributes, o2.a.o.Rp, i));
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    @j0
    public static b e(@j0 final Context context, final AttributeSet set, @f final int n, @x0 final int n2) {
        return f(context, set, n, n2, 0);
    }
    
    @j0
    public static b f(@j0 final Context context, final AttributeSet set, @f final int n, @x0 final int n2, final int n3) {
        return g(context, set, n, n2, new a((float)n3));
    }
    
    @j0
    public static b g(@j0 final Context context, final AttributeSet set, @f int resourceId, @x0 int resourceId2, @j0 final d d) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o2.a.o.Hl, resourceId, resourceId2);
        resourceId = obtainStyledAttributes.getResourceId(o2.a.o.Il, 0);
        resourceId2 = obtainStyledAttributes.getResourceId(o2.a.o.Jl, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, d);
    }
    
    @j0
    private static d m(final TypedArray typedArray, int type, @j0 final d d) {
        final TypedValue peekValue = typedArray.peekValue(type);
        if (peekValue == null) {
            return d;
        }
        type = peekValue.type;
        if (type == 5) {
            return new a((float)TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (type == 6) {
            return new m(peekValue.getFraction(1.0f, 1.0f));
        }
        return d;
    }
    
    @j0
    public g h() {
        return this.k;
    }
    
    @j0
    public e i() {
        return this.d;
    }
    
    @j0
    public d j() {
        return this.h;
    }
    
    @j0
    public e k() {
        return this.c;
    }
    
    @j0
    public d l() {
        return this.g;
    }
    
    @j0
    public g n() {
        return this.l;
    }
    
    @j0
    public g o() {
        return this.j;
    }
    
    @j0
    public g p() {
        return this.i;
    }
    
    @j0
    public e q() {
        return this.a;
    }
    
    @j0
    public d r() {
        return this.e;
    }
    
    @j0
    public e s() {
        return this.b;
    }
    
    @j0
    public d t() {
        return this.f;
    }
    
    @t0({ t0.a.H })
    public boolean u(@j0 final RectF rectF) {
        final boolean equals = this.l.getClass().equals(g.class);
        boolean b = true;
        final boolean b2 = equals && this.j.getClass().equals(g.class) && this.i.getClass().equals(g.class) && this.k.getClass().equals(g.class);
        final float a = this.e.a(rectF);
        final boolean b3 = this.f.a(rectF) == a && this.h.a(rectF) == a && this.g.a(rectF) == a;
        final boolean b4 = this.b instanceof n && this.a instanceof n && this.c instanceof n && this.d instanceof n;
        if (!b2 || !b3 || !b4) {
            b = false;
        }
        return b;
    }
    
    @j0
    public b v() {
        return new b(this);
    }
    
    @j0
    public o w(final float n) {
        return this.v().o(n).m();
    }
    
    @j0
    public o x(@j0 final d d) {
        return this.v().p(d).m();
    }
    
    @j0
    @t0({ t0.a.H })
    public o y(@j0 final c c) {
        return this.v().L(c.a(this.r())).Q(c.a(this.t())).y(c.a(this.j())).D(c.a(this.l())).m();
    }
    
    public static final class b
    {
        @j0
        private e a;
        @j0
        private e b;
        @j0
        private e c;
        @j0
        private e d;
        @j0
        private d e;
        @j0
        private d f;
        @j0
        private d g;
        @j0
        private d h;
        @j0
        private g i;
        @j0
        private g j;
        @j0
        private g k;
        @j0
        private g l;
        
        public b() {
            this.a = k.b();
            this.b = k.b();
            this.c = k.b();
            this.d = k.b();
            this.e = new a(0.0f);
            this.f = new a(0.0f);
            this.g = new a(0.0f);
            this.h = new a(0.0f);
            this.i = k.c();
            this.j = k.c();
            this.k = k.c();
            this.l = k.c();
        }
        
        public b(@j0 final o o) {
            this.a = k.b();
            this.b = k.b();
            this.c = k.b();
            this.d = k.b();
            this.e = new a(0.0f);
            this.f = new a(0.0f);
            this.g = new a(0.0f);
            this.h = new a(0.0f);
            this.i = k.c();
            this.j = k.c();
            this.k = k.c();
            this.l = k.c();
            this.a = o.a;
            this.b = o.b;
            this.c = o.c;
            this.d = o.d;
            this.e = o.e;
            this.f = o.f;
            this.g = o.g;
            this.h = o.h;
            this.i = o.i;
            this.j = o.j;
            this.k = o.k;
            this.l = o.l;
        }
        
        private static float n(final e e) {
            if (e instanceof n) {
                return ((n)e).a;
            }
            if (e instanceof com.google.android.material.shape.f) {
                return ((com.google.android.material.shape.f)e).a;
            }
            return -1.0f;
        }
        
        @j0
        public b A(final int n, @j0 final d d) {
            return this.B(com.google.android.material.shape.k.a(n)).D(d);
        }
        
        @j0
        public b B(@j0 final e c) {
            this.c = c;
            final float n = n(c);
            if (n != -1.0f) {
                this.C(n);
            }
            return this;
        }
        
        @j0
        public b C(@q final float n) {
            this.g = new a(n);
            return this;
        }
        
        @j0
        public b D(@j0 final d g) {
            this.g = g;
            return this;
        }
        
        @j0
        public b E(@j0 final g l) {
            this.l = l;
            return this;
        }
        
        @j0
        public b F(@j0 final g j) {
            this.j = j;
            return this;
        }
        
        @j0
        public b G(@j0 final g i) {
            this.i = i;
            return this;
        }
        
        @j0
        public b H(final int n, @q final float n2) {
            return this.J(com.google.android.material.shape.k.a(n)).K(n2);
        }
        
        @j0
        public b I(final int n, @j0 final d d) {
            return this.J(com.google.android.material.shape.k.a(n)).L(d);
        }
        
        @j0
        public b J(@j0 final e a) {
            this.a = a;
            final float n = n(a);
            if (n != -1.0f) {
                this.K(n);
            }
            return this;
        }
        
        @j0
        public b K(@q final float n) {
            this.e = new a(n);
            return this;
        }
        
        @j0
        public b L(@j0 final d e) {
            this.e = e;
            return this;
        }
        
        @j0
        public b M(final int n, @q final float n2) {
            return this.O(com.google.android.material.shape.k.a(n)).P(n2);
        }
        
        @j0
        public b N(final int n, @j0 final d d) {
            return this.O(com.google.android.material.shape.k.a(n)).Q(d);
        }
        
        @j0
        public b O(@j0 final e b) {
            this.b = b;
            final float n = n(b);
            if (n != -1.0f) {
                this.P(n);
            }
            return this;
        }
        
        @j0
        public b P(@q final float n) {
            this.f = new a(n);
            return this;
        }
        
        @j0
        public b Q(@j0 final d f) {
            this.f = f;
            return this;
        }
        
        @j0
        public o m() {
            return new o(this, null);
        }
        
        @j0
        public b o(@q final float n) {
            return this.K(n).P(n).C(n).x(n);
        }
        
        @j0
        public b p(@j0 final d d) {
            return this.L(d).Q(d).D(d).y(d);
        }
        
        @j0
        public b q(final int n, @q final float n2) {
            return this.r(com.google.android.material.shape.k.a(n)).o(n2);
        }
        
        @j0
        public b r(@j0 final e e) {
            return this.J(e).O(e).B(e).w(e);
        }
        
        @j0
        public b s(@j0 final g g) {
            return this.E(g).G(g).F(g).t(g);
        }
        
        @j0
        public b t(@j0 final g k) {
            this.k = k;
            return this;
        }
        
        @j0
        public b u(final int n, @q final float n2) {
            return this.w(com.google.android.material.shape.k.a(n)).x(n2);
        }
        
        @j0
        public b v(final int n, @j0 final d d) {
            return this.w(com.google.android.material.shape.k.a(n)).y(d);
        }
        
        @j0
        public b w(@j0 final e d) {
            this.d = d;
            final float n = n(d);
            if (n != -1.0f) {
                this.x(n);
            }
            return this;
        }
        
        @j0
        public b x(@q final float n) {
            this.h = new a(n);
            return this;
        }
        
        @j0
        public b y(@j0 final d h) {
            this.h = h;
            return this;
        }
        
        @j0
        public b z(final int n, @q final float n2) {
            return this.B(com.google.android.material.shape.k.a(n)).C(n2);
        }
    }
    
    @t0({ t0.a.H })
    public interface c
    {
        @j0
        d a(@j0 final d p0);
    }
}
