// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

public class d0
{
    private static String g = "VelocityMatrix";
    float a;
    float b;
    float c;
    float d;
    float e;
    float f;
    
    public void a(float n, float n2, final int n3, final int n4, final float[] array) {
        final float n5 = array[0];
        final float n6 = array[1];
        n = (n - 0.5f) * 2.0f;
        final float n7 = (n2 - 0.5f) * 2.0f;
        final float c = this.c;
        final float d = this.d;
        final float a = this.a;
        final float b = this.b;
        final float n8 = (float)Math.toRadians(this.f);
        n2 = (float)Math.toRadians(this.e);
        final double n9 = -n3 * n;
        final double n10 = n8;
        final double sin = Math.sin(n10);
        final double n11 = n4 * n7;
        final float n12 = (float)(n9 * sin - Math.cos(n10) * n11);
        final float n13 = (float)(n3 * n * Math.cos(n10) - n11 * Math.sin(n10));
        array[0] = n5 + c + a * n + n12 * n2;
        array[1] = n6 + d + b * n7 + n2 * n13;
    }
    
    public void b() {
        this.e = 0.0f;
        this.d = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
        this.a = 0.0f;
    }
    
    public void c(final h h, final float n) {
        if (h != null) {
            this.e = h.c(n);
        }
    }
    
    public void d(final o o, final float n) {
        if (o != null) {
            this.e = o.c(n);
            this.f = o.a(n);
        }
    }
    
    public void e(final h h, final h h2, final float n) {
        if (h != null) {
            this.a = h.c(n);
        }
        if (h2 != null) {
            this.b = h2.c(n);
        }
    }
    
    public void f(final o o, final o o2, final float n) {
        if (o != null) {
            this.a = o.c(n);
        }
        if (o2 != null) {
            this.b = o2.c(n);
        }
    }
    
    public void g(final h h, final h h2, final float n) {
        if (h != null) {
            this.c = h.c(n);
        }
        if (h2 != null) {
            this.d = h2.c(n);
        }
    }
    
    public void h(final o o, final o o2, final float n) {
        if (o != null) {
            this.c = o.c(n);
        }
        if (o2 != null) {
            this.d = o2.c(n);
        }
    }
}
