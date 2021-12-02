// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import androidx.work.u;
import androidx.work.impl.c;
import androidx.work.impl.j;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class h implements Runnable
{
    private final j G;
    private final c H;
    
    public h(final j g) {
        this.G = g;
        this.H = new c();
    }
    
    public u a() {
        return this.H;
    }
    
    @Override
    public void run() {
        try {
            this.G.M().U().b();
            this.H.b((u.b)u.a);
        }
        finally {
            final Throwable t;
            this.H.b((u.b)new u.b.a(t));
        }
    }
}
