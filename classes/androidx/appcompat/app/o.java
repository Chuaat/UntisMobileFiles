// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

class o
{
    private static o d;
    public static final int e = 0;
    public static final int f = 1;
    private static final float g = 0.017453292f;
    private static final float h = 9.0E-4f;
    private static final float i = -0.10471976f;
    private static final float j = 0.0334196f;
    private static final float k = 3.49066E-4f;
    private static final float l = 5.236E-6f;
    private static final float m = 0.4092797f;
    private static final long n = 946728000000L;
    public long a;
    public long b;
    public int c;
    
    static o b() {
        if (o.d == null) {
            o.d = new o();
        }
        return o.d;
    }
    
    public void a(final long n, double a, double n2) {
        final float n3 = (n - 946728000000L) / 8.64E7f;
        final float n4 = 0.01720197f * n3 + 6.24006f;
        final double n5 = n4;
        final double a2 = Math.sin(n5) * 0.03341960161924362 + n5 + Math.sin(2.0f * n4) * 3.4906598739326E-4 + Math.sin(n4 * 3.0f) * 5.236000106378924E-6 + 1.796593063 + 3.141592653589793;
        n2 = -n2 / 360.0;
        n2 = Math.round(n3 - 9.0E-4f - n2) + 9.0E-4f + n2 + Math.sin(n5) * 0.0053 + Math.sin(2.0 * a2) * -0.0069;
        final double asin = Math.asin(Math.sin(a2) * Math.sin(0.4092797040939331));
        a *= 0.01745329238474369;
        a = (Math.sin(-0.10471975803375244) - Math.sin(a) * Math.sin(asin)) / (Math.cos(a) * Math.cos(asin));
        if (a >= 1.0) {
            this.c = 1;
        }
        else {
            if (a > -1.0) {
                a = (float)(Math.acos(a) / 6.283185307179586);
                this.a = Math.round((n2 + a) * 8.64E7) + 946728000000L;
                final long b = Math.round((n2 - a) * 8.64E7) + 946728000000L;
                this.b = b;
                if (b < n && this.a > n) {
                    this.c = 0;
                }
                else {
                    this.c = 1;
                }
                return;
            }
            this.c = 0;
        }
        this.a = -1L;
        this.b = -1L;
    }
}
