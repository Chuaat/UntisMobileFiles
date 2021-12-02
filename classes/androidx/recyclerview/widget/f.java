// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import androidx.annotation.j0;

public class f implements v
{
    private static final int L = 0;
    private static final int M = 1;
    private static final int N = 2;
    private static final int O = 3;
    final v G;
    int H;
    int I;
    int J;
    Object K;
    
    public f(@j0 final v g) {
        this.H = 0;
        this.I = -1;
        this.J = -1;
        this.K = null;
        this.G = g;
    }
    
    @Override
    public void a(final int n, final int n2) {
        this.e();
        this.G.a(n, n2);
    }
    
    @Override
    public void b(final int n, final int j) {
        if (this.H == 1) {
            final int i = this.I;
            if (n >= i) {
                final int k = this.J;
                if (n <= i + k) {
                    this.J = k + j;
                    this.I = Math.min(n, i);
                    return;
                }
            }
        }
        this.e();
        this.I = n;
        this.J = j;
        this.H = 1;
    }
    
    @Override
    public void c(final int n, final int j) {
        if (this.H == 2) {
            final int i = this.I;
            if (i >= n && i <= n + j) {
                this.J += j;
                this.I = n;
                return;
            }
        }
        this.e();
        this.I = n;
        this.J = j;
        this.H = 2;
    }
    
    @Override
    public void d(final int n, final int j, final Object k) {
        if (this.H == 3) {
            final int i = this.I;
            final int l = this.J;
            if (n <= i + l) {
                final int b = n + j;
                if (b >= i && this.K == k) {
                    this.I = Math.min(n, i);
                    this.J = Math.max(l + i, b) - this.I;
                    return;
                }
            }
        }
        this.e();
        this.I = n;
        this.J = j;
        this.K = k;
        this.H = 3;
    }
    
    public void e() {
        final int h = this.H;
        if (h == 0) {
            return;
        }
        if (h != 1) {
            if (h != 2) {
                if (h == 3) {
                    this.G.d(this.I, this.J, this.K);
                }
            }
            else {
                this.G.c(this.I, this.J);
            }
        }
        else {
            this.G.b(this.I, this.J);
        }
        this.K = null;
        this.H = 0;
    }
}
