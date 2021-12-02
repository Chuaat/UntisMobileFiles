// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;

public class p implements r
{
    private static final double l = Double.MAX_VALUE;
    double a;
    private boolean b;
    private double c;
    private double d;
    private double e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private int k;
    
    public p() {
        this.a = 0.5;
        this.b = false;
        this.k = 0;
    }
    
    private void e(double n) {
        final double c = this.c;
        final double a = this.a;
        final int n2 = (int)(9.0 / (Math.sqrt(c / this.i) * n * 4.0) + 1.0);
        final double n3 = n / n2;
        int i = 0;
        n = a;
        while (i < n2) {
            final float g = this.g;
            final double n4 = g;
            final double d = this.d;
            final double n5 = -c;
            final float h = this.h;
            final double n6 = h;
            final float j = this.i;
            final double n7 = h + (n5 * (n4 - d) - n6 * n) / j * n3 / 2.0;
            final double n8 = (-(g + n3 * n7 / 2.0 - d) * c - n7 * n) / j * n3;
            final double n9 = h;
            final double n10 = n8 / 2.0;
            final float h2 = (float)(h + n8);
            this.h = h2;
            final float g2 = (float)(g + (n9 + n10) * n3);
            this.g = g2;
            final int k = this.k;
            if (k > 0) {
                if (g2 < 0.0f && (k & 0x1) == 0x1) {
                    this.g = -g2;
                    this.h = -h2;
                }
                final float g3 = this.g;
                if (g3 > 1.0f && (k & 0x2) == 0x2) {
                    this.g = 2.0f - g3;
                    this.h = -this.h;
                }
            }
            ++i;
        }
    }
    
    @Override
    public float a() {
        return 0.0f;
    }
    
    @Override
    public String b(final String s, final float n) {
        return null;
    }
    
    @Override
    public float c(final float n) {
        return this.h;
    }
    
    @Override
    public boolean d() {
        final double n = this.g - this.d;
        final double c = this.c;
        final double n2 = this.h;
        return Math.sqrt((n2 * n2 * this.i + c * n * n) / c) <= this.j;
    }
    
    public float f() {
        return (float)(-this.c * (this.g - this.d) - this.a * this.h) / this.i;
    }
    
    void g(final String str) {
        final StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        final StringBuilder sb = new StringBuilder();
        sb.append(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(") ");
        sb.append(stackTraceElement.getMethodName());
        sb.append("() ");
        final String string = sb.toString();
        final PrintStream out = System.out;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(str);
        out.println(sb2.toString());
    }
    
    @Override
    public float getInterpolation(final float f) {
        this.e(f - this.f);
        this.f = f;
        return this.g;
    }
    
    public void h(final float g, final float n, final float n2, final float i, final float n3, final float n4, final float j, final int k) {
        this.d = n;
        this.a = n4;
        this.b = false;
        this.g = g;
        this.e = n2;
        this.c = n3;
        this.i = i;
        this.j = j;
        this.k = k;
        this.f = 0.0f;
    }
}
