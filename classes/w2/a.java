// 
// Decompiled by Procyon v0.5.36
// 

package w2;

public final class a
{
    public static final float a = 1.0E-4f;
    
    private a() {
    }
    
    public static float a(final float n, final float n2, final float n3, final float n4) {
        return (float)Math.hypot(n3 - n, n4 - n2);
    }
    
    public static float b(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        return g(a(n, n2, n3, n4), a(n, n2, n5, n4), a(n, n2, n5, n6), a(n, n2, n3, n6));
    }
    
    public static float c(final float f, final int n) {
        final float n2 = (float)n;
        int n4;
        final int n3 = n4 = (int)(f / n2);
        if (Math.signum(f) * n2 < 0.0f) {
            n4 = n3;
            if (n3 * n != f) {
                n4 = n3 - 1;
            }
        }
        return f - n4 * n;
    }
    
    public static int d(final int n, final int n2) {
        int n4;
        final int n3 = n4 = n / n2;
        if ((n ^ n2) < 0) {
            n4 = n3;
            if (n3 * n2 != n) {
                n4 = n3 - 1;
            }
        }
        return n - n4 * n2;
    }
    
    public static boolean e(final float n, final float n2, final float n3) {
        return n + n3 >= n2;
    }
    
    public static float f(final float n, final float n2, final float n3) {
        return (1.0f - n3) * n + n3 * n2;
    }
    
    private static float g(float n, final float n2, final float n3, final float n4) {
        if (n <= n2 || n <= n3 || n <= n4) {
            if (n2 > n3 && n2 > n4) {
                n = n2;
            }
            else if (n3 > n4) {
                n = n3;
            }
            else {
                n = n4;
            }
        }
        return n;
    }
}
