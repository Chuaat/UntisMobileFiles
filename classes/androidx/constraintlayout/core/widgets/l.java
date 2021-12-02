// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets;

public class l
{
    public int a;
    public int b;
    public int c;
    public int d;
    
    public boolean a(int b, final int n) {
        final int a = this.a;
        if (b >= a && b < a + this.c) {
            b = this.b;
            if (n >= b && n < b + this.d) {
                return true;
            }
        }
        return false;
    }
    
    public int b() {
        return (this.a + this.c) / 2;
    }
    
    public int c() {
        return (this.b + this.d) / 2;
    }
    
    void d(final int n, final int n2) {
        this.a -= n;
        this.b -= n2;
        this.c += n * 2;
        this.d += n2 * 2;
    }
    
    boolean e(final l l) {
        final int a = this.a;
        final int a2 = l.a;
        if (a >= a2 && a < a2 + l.c) {
            final int b = this.b;
            final int b2 = l.b;
            if (b >= b2 && b < b2 + l.d) {
                return true;
            }
        }
        return false;
    }
    
    public void f(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
