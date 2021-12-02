// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import androidx.work.impl.model.s;
import androidx.work.impl.d;
import androidx.work.impl.WorkDatabase;
import androidx.work.c0;
import androidx.annotation.j0;
import androidx.work.q;
import androidx.work.impl.j;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class m implements Runnable
{
    private static final String J;
    private final j G;
    private final String H;
    private final boolean I;
    
    static {
        J = q.f("StopWorkRunnable");
    }
    
    public m(@j0 final j g, @j0 final String h, final boolean i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public void run() {
        final WorkDatabase m = this.G.M();
        final d j = this.G.J();
        final s u = m.U();
        m.e();
        try {
            final boolean i = j.i(this.H);
            boolean b;
            if (this.I) {
                b = this.G.J().o(this.H);
            }
            else {
                if (!i && u.s(this.H) == c0.a.H) {
                    u.a(c0.a.G, this.H);
                }
                b = this.G.J().p(this.H);
            }
            q.c().a(androidx.work.impl.utils.m.J, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.H, b), new Throwable[0]);
            m.I();
        }
        finally {
            m.k();
        }
    }
}
