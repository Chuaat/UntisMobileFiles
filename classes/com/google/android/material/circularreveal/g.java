// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.circularreveal;

import android.util.Property;
import w2.a;
import androidx.annotation.j0;
import android.animation.TypeEvaluator;
import androidx.annotation.l;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;

public interface g extends a
{
    void a();
    
    void b();
    
    void draw(final Canvas p0);
    
    @k0
    Drawable getCircularRevealOverlayDrawable();
    
    @l
    int getCircularRevealScrimColor();
    
    @k0
    e getRevealInfo();
    
    boolean isOpaque();
    
    void setCircularRevealOverlayDrawable(@k0 final Drawable p0);
    
    void setCircularRevealScrimColor(@l final int p0);
    
    void setRevealInfo(@k0 final e p0);
    
    public static class b implements TypeEvaluator<e>
    {
        public static final TypeEvaluator<e> b;
        private final e a;
        
        static {
            b = (TypeEvaluator)new b();
        }
        
        public b() {
            this.a = new e();
        }
        
        @j0
        public e a(final float n, @j0 final e e, @j0 final e e2) {
            this.a.b(w2.a.f(e.a, e2.a, n), w2.a.f(e.b, e2.b, n), w2.a.f(e.c, e2.c, n));
            return this.a;
        }
    }
    
    public static class c extends Property<g, e>
    {
        public static final Property<g, e> a;
        
        static {
            a = new c("circularReveal");
        }
        
        private c(final String s) {
            super((Class)e.class, s);
        }
        
        @k0
        public e a(@j0 final g g) {
            return g.getRevealInfo();
        }
        
        public void b(@j0 final g g, @k0 final e revealInfo) {
            g.setRevealInfo(revealInfo);
        }
    }
    
    public static class d extends Property<g, Integer>
    {
        public static final Property<g, Integer> a;
        
        static {
            a = new d("circularRevealScrimColor");
        }
        
        private d(final String s) {
            super((Class)Integer.class, s);
        }
        
        @j0
        public Integer a(@j0 final g g) {
            return g.getCircularRevealScrimColor();
        }
        
        public void b(@j0 final g g, @j0 final Integer n) {
            g.setCircularRevealScrimColor(n);
        }
    }
    
    public static class e
    {
        public static final float d = Float.MAX_VALUE;
        public float a;
        public float b;
        public float c;
        
        private e() {
        }
        
        public e(final float a, final float b, final float c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public e(@j0 final e e) {
            this(e.a, e.b, e.c);
        }
        
        public boolean a() {
            return this.c == Float.MAX_VALUE;
        }
        
        public void b(final float a, final float b, final float c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public void c(@j0 final e e) {
            this.b(e.a, e.b, e.c);
        }
    }
}
