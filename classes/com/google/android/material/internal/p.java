// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import androidx.core.util.n;
import android.text.StaticLayout$Builder;
import android.text.TextUtils;
import androidx.annotation.b0;
import androidx.annotation.j0;
import android.text.TextDirectionHeuristics;
import android.text.TextDirectionHeuristic;
import android.os.Build$VERSION;
import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import android.text.TextPaint;
import androidx.annotation.k0;
import android.text.StaticLayout;
import java.lang.reflect.Constructor;
import androidx.annotation.t0;

@t0({ t0.a.H })
final class p
{
    static final int n;
    static final float o = 0.0f;
    static final float p = 1.0f;
    private static final String q = "android.text.TextDirectionHeuristic";
    private static final String r = "android.text.TextDirectionHeuristics";
    private static final String s = "LTR";
    private static final String t = "RTL";
    private static boolean u;
    @k0
    private static Constructor<StaticLayout> v;
    @k0
    private static Object w;
    private CharSequence a;
    private final TextPaint b;
    private final int c;
    private int d;
    private int e;
    private Layout$Alignment f;
    private int g;
    private float h;
    private float i;
    private int j;
    private boolean k;
    private boolean l;
    @k0
    private TextUtils$TruncateAt m;
    
    static {
        n = ((Build$VERSION.SDK_INT >= 23) ? 1 : 0);
    }
    
    private p(final CharSequence a, final TextPaint b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = 0;
        this.e = a.length();
        this.f = Layout$Alignment.ALIGN_NORMAL;
        this.g = Integer.MAX_VALUE;
        this.h = 0.0f;
        this.i = 1.0f;
        this.j = com.google.android.material.internal.p.n;
        this.k = true;
        this.m = null;
    }
    
    private void b() throws a {
        if (com.google.android.material.internal.p.u) {
            return;
        }
        try {
            final boolean b = this.l && Build$VERSION.SDK_INT >= 23;
            Class<TextDirectionHeuristic> clazz2;
            if (Build$VERSION.SDK_INT >= 18) {
                final Class<TextDirectionHeuristic> clazz = TextDirectionHeuristic.class;
                TextDirectionHeuristic w;
                if (b) {
                    w = TextDirectionHeuristics.RTL;
                }
                else {
                    w = TextDirectionHeuristics.LTR;
                }
                com.google.android.material.internal.p.w = w;
                clazz2 = clazz;
            }
            else {
                final ClassLoader classLoader = p.class.getClassLoader();
                String name;
                if (this.l) {
                    name = "RTL";
                }
                else {
                    name = "LTR";
                }
                final Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                final Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                com.google.android.material.internal.p.w = loadClass2.getField(name).get(loadClass2);
                clazz2 = (Class<TextDirectionHeuristic>)loadClass;
            }
            final Class<Integer> type = Integer.TYPE;
            final Class<Float> type2 = Float.TYPE;
            (com.google.android.material.internal.p.v = StaticLayout.class.getDeclaredConstructor(CharSequence.class, type, type, TextPaint.class, type, Layout$Alignment.class, clazz2, type2, type2, Boolean.TYPE, TextUtils$TruncateAt.class, type, type)).setAccessible(true);
            com.google.android.material.internal.p.u = true;
        }
        catch (Exception ex) {
            throw new a(ex);
        }
    }
    
    @j0
    public static p c(@j0 final CharSequence charSequence, @j0 final TextPaint textPaint, @b0(from = 0L) final int n) {
        return new p(charSequence, textPaint, n);
    }
    
    public StaticLayout a() throws a {
        if (this.a == null) {
            this.a = "";
        }
        final int max = Math.max(0, this.c);
        CharSequence charSequence2;
        final CharSequence charSequence = charSequence2 = this.a;
        if (this.g == 1) {
            charSequence2 = TextUtils.ellipsize(charSequence, this.b, (float)max, this.m);
        }
        final int min = Math.min(charSequence2.length(), this.e);
        this.e = min;
        if (Build$VERSION.SDK_INT >= 23) {
            if (this.l && this.g == 1) {
                this.f = Layout$Alignment.ALIGN_OPPOSITE;
            }
            final StaticLayout$Builder obtain = StaticLayout$Builder.obtain(charSequence2, this.d, min, this.b, max);
            obtain.setAlignment(this.f);
            obtain.setIncludePad(this.k);
            TextDirectionHeuristic textDirection;
            if (this.l) {
                textDirection = TextDirectionHeuristics.RTL;
            }
            else {
                textDirection = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirection);
            final TextUtils$TruncateAt m = this.m;
            if (m != null) {
                obtain.setEllipsize(m);
            }
            obtain.setMaxLines(this.g);
            final float h = this.h;
            if (h != 0.0f || this.i != 1.0f) {
                obtain.setLineSpacing(h, this.i);
            }
            if (this.g > 1) {
                obtain.setHyphenationFrequency(this.j);
            }
            return obtain.build();
        }
        this.b();
        try {
            return androidx.core.util.n.g(com.google.android.material.internal.p.v).newInstance(charSequence2, this.d, this.e, this.b, max, this.f, androidx.core.util.n.g(com.google.android.material.internal.p.w), 1.0f, 0.0f, this.k, null, max, this.g);
        }
        catch (Exception ex) {
            throw new a(ex);
        }
    }
    
    @j0
    public p d(@j0 final Layout$Alignment f) {
        this.f = f;
        return this;
    }
    
    @j0
    public p e(@k0 final TextUtils$TruncateAt m) {
        this.m = m;
        return this;
    }
    
    @j0
    public p f(@b0(from = 0L) final int e) {
        this.e = e;
        return this;
    }
    
    @j0
    public p g(final int j) {
        this.j = j;
        return this;
    }
    
    @j0
    public p h(final boolean k) {
        this.k = k;
        return this;
    }
    
    public p i(final boolean l) {
        this.l = l;
        return this;
    }
    
    @j0
    public p j(final float h, final float i) {
        this.h = h;
        this.i = i;
        return this;
    }
    
    @j0
    public p k(@b0(from = 0L) final int g) {
        this.g = g;
        return this;
    }
    
    @j0
    public p l(@b0(from = 0L) final int d) {
        this.d = d;
        return this;
    }
    
    static class a extends Exception
    {
        a(final Throwable cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Error thrown initializing StaticLayout ");
            sb.append(cause.getMessage());
            super(sb.toString(), cause);
        }
    }
}
