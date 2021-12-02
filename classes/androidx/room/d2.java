// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import java.util.ArrayList;
import java.util.List;
import androidx.sqlite.db.e;

final class d2 implements e
{
    private List<Object> G;
    
    d2() {
        this.G = new ArrayList<Object>();
    }
    
    private void b(int i, final Object o) {
        final int n = i - 1;
        if (n >= this.G.size()) {
            for (i = this.G.size(); i <= n; ++i) {
                this.G.add(null);
            }
        }
        this.G.set(n, o);
    }
    
    @Override
    public void H2(final int n, final byte[] array) {
        this.b(n, array);
    }
    
    @Override
    public void K0(final int n, final String s) {
        this.b(n, s);
    }
    
    List<Object> a() {
        return this.G;
    }
    
    @Override
    public void c4(final int n) {
        this.b(n, null);
    }
    
    @Override
    public void close() {
    }
    
    @Override
    public void l2(final int n, final long l) {
        this.b(n, l);
    }
    
    @Override
    public void m5() {
        this.G.clear();
    }
    
    @Override
    public void r1(final int n, final double d) {
        this.b(n, d);
    }
}
