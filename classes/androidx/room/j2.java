// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import java.io.IOException;
import java.util.ArrayList;
import androidx.annotation.j0;
import java.util.concurrent.Executor;
import java.util.List;
import androidx.sqlite.db.h;

final class j2 implements h
{
    private final h G;
    private final r2.f H;
    private final String I;
    private final List<Object> J;
    private final Executor K;
    
    j2(@j0 final h g, @j0 final r2.f h, final String i, @j0 final Executor k) {
        this.J = new ArrayList<Object>();
        this.G = g;
        this.H = h;
        this.I = i;
        this.K = k;
    }
    
    private void n(int i, final Object o) {
        final int n = i - 1;
        if (n >= this.J.size()) {
            for (i = this.J.size(); i <= n; ++i) {
                this.J.add(null);
            }
        }
        this.J.set(n, o);
    }
    
    @Override
    public long F5() {
        this.K.execute(new g2(this));
        return this.G.F5();
    }
    
    @Override
    public void H2(final int n, final byte[] array) {
        this.n(n, array);
        this.G.H2(n, array);
    }
    
    @Override
    public void K0(final int n, final String s) {
        this.n(n, s);
        this.G.K0(n, s);
    }
    
    @Override
    public String R2() {
        this.K.execute(new e2(this));
        return this.G.R2();
    }
    
    @Override
    public int c1() {
        this.K.execute(new h2(this));
        return this.G.c1();
    }
    
    @Override
    public void c4(final int n) {
        this.n(n, this.J.toArray());
        this.G.c4(n);
    }
    
    @Override
    public void close() throws IOException {
        this.G.close();
    }
    
    @Override
    public void l2(final int n, final long l) {
        this.n(n, l);
        this.G.l2(n, l);
    }
    
    @Override
    public void m5() {
        this.J.clear();
        this.G.m5();
    }
    
    @Override
    public void p() {
        this.K.execute(new f2(this));
        this.G.p();
    }
    
    @Override
    public void r1(final int n, final double d) {
        this.n(n, d);
        this.G.r1(n, d);
    }
    
    @Override
    public long z0() {
        this.K.execute(new i2(this));
        return this.G.z0();
    }
}
