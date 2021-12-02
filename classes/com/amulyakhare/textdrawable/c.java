// 
// Decompiled by Procyon v0.5.36
// 

package com.amulyakhare.textdrawable;

import android.graphics.Typeface;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Color;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;

public class c extends ShapeDrawable
{
    private static final float k = 0.9f;
    private final Paint a;
    private final Paint b;
    private final String c;
    private final int d;
    private final RectShape e;
    private final int f;
    private final int g;
    private final int h;
    private final float i;
    private final int j;
    
    private c(final b b) {
        super((Shape)b.g);
        this.e = b.g;
        this.f = b.e;
        this.g = b.d;
        this.i = b.l;
        String c;
        if (b.k) {
            c = b.a.toUpperCase();
        }
        else {
            c = b.a;
        }
        this.c = c;
        final int w = b.b;
        this.d = w;
        this.h = b.i;
        final Paint a = new Paint();
        (this.a = a).setColor(b.h);
        a.setAntiAlias(true);
        a.setFakeBoldText(b.j);
        a.setStyle(Paint$Style.FILL);
        a.setTypeface(b.f);
        a.setTextAlign(Paint$Align.CENTER);
        a.setStrokeWidth((float)b.c);
        final int a2 = b.c;
        this.j = a2;
        final Paint b2 = new Paint();
        (this.b = b2).setColor(this.c(w));
        b2.setStyle(Paint$Style.STROKE);
        b2.setStrokeWidth((float)a2);
        this.getPaint().setColor(w);
    }
    
    public static e a() {
        return (e)new b();
    }
    
    private void b(final Canvas canvas) {
        final RectF rectF = new RectF(this.getBounds());
        final int j = this.j;
        rectF.inset((float)(j / 2), (float)(j / 2));
        final RectShape e = this.e;
        if (e instanceof OvalShape) {
            canvas.drawOval(rectF, this.b);
        }
        else if (e instanceof RoundRectShape) {
            final float i = this.i;
            canvas.drawRoundRect(rectF, i, i, this.b);
        }
        else {
            canvas.drawRect(rectF, this.b);
        }
    }
    
    private int c(final int n) {
        return Color.rgb((int)(Color.red(n) * 0.9f), (int)(Color.green(n) * 0.9f), (int)(Color.blue(n) * 0.9f));
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        final Rect bounds = this.getBounds();
        if (this.j > 0) {
            this.b(canvas);
        }
        final int save = canvas.save();
        canvas.translate((float)bounds.left, (float)bounds.top);
        int a;
        if ((a = this.g) < 0) {
            a = bounds.width();
        }
        int b;
        if ((b = this.f) < 0) {
            b = bounds.height();
        }
        int h;
        if ((h = this.h) < 0) {
            h = Math.min(a, b) / 2;
        }
        this.a.setTextSize((float)h);
        canvas.drawText(this.c, (float)(a / 2), b / 2 - (this.a.descent() + this.a.ascent()) / 2.0f, this.a);
        canvas.restoreToCount(save);
    }
    
    public int getIntrinsicHeight() {
        return this.f;
    }
    
    public int getIntrinsicWidth() {
        return this.g;
    }
    
    public int getOpacity() {
        return -3;
    }
    
    public void setAlpha(final int alpha) {
        this.a.setAlpha(alpha);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
    
    public static class b implements d, e, c
    {
        private String a;
        private int b;
        private int c;
        private int d;
        private int e;
        private Typeface f;
        private RectShape g;
        public int h;
        private int i;
        private boolean j;
        private boolean k;
        public float l;
        
        private b() {
            this.a = "";
            this.b = -7829368;
            this.h = -1;
            this.c = 0;
            this.d = -1;
            this.e = -1;
            this.g = new RectShape();
            this.f = Typeface.create("sans-serif-light", 0);
            this.i = -1;
            this.j = false;
            this.k = false;
        }
        
        @Override
        public c a(final String s, final int n) {
            this.l();
            return this.j(s, n);
        }
        
        @Override
        public e b() {
            return this;
        }
        
        @Override
        public c c(final String s, final int n) {
            this.k();
            return this.j(s, n);
        }
        
        @Override
        public d d(final int c) {
            this.c = c;
            return this;
        }
        
        @Override
        public d e(final int d) {
            this.d = d;
            return this;
        }
        
        @Override
        public c f(final int n) {
            final float l = (float)n;
            this.l = l;
            this.g = (RectShape)new RoundRectShape(new float[] { l, l, l, l, l, l, l, l }, (RectF)null, (float[])null);
            return this;
        }
        
        @Override
        public d g() {
            this.k = true;
            return this;
        }
        
        @Override
        public d h() {
            this.j = true;
            return this;
        }
        
        @Override
        public d i(final int i) {
            this.i = i;
            return this;
        }
        
        @Override
        public c j(final String a, final int b) {
            this.b = b;
            this.a = a;
            return new c(this, null);
        }
        
        @Override
        public c k() {
            this.g = (RectShape)new OvalShape();
            return this;
        }
        
        @Override
        public c l() {
            this.g = new RectShape();
            return this;
        }
        
        @Override
        public c m(final String s, final int n, final int n2) {
            this.f(n2);
            return this.j(s, n);
        }
        
        @Override
        public d n() {
            return this;
        }
        
        @Override
        public d o(final int e) {
            this.e = e;
            return this;
        }
        
        @Override
        public d p(final int h) {
            this.h = h;
            return this;
        }
        
        @Override
        public d q(final Typeface f) {
            this.f = f;
            return this;
        }
    }
    
    public interface c
    {
        com.amulyakhare.textdrawable.c j(final String p0, final int p1);
    }
    
    public interface d
    {
        e b();
        
        d d(final int p0);
        
        d e(final int p0);
        
        d g();
        
        d h();
        
        d i(final int p0);
        
        d o(final int p0);
        
        d p(final int p0);
        
        d q(final Typeface p0);
    }
    
    public interface e
    {
        c a(final String p0, final int p1);
        
        c c(final String p0, final int p1);
        
        c f(final int p0);
        
        c k();
        
        c l();
        
        c m(final String p0, final int p1, final int p2);
        
        d n();
    }
}
