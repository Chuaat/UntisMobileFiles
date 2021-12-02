// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class w implements Runnable
{
    private final /* synthetic */ m G;
    private final /* synthetic */ u H;
    
    w(final u h, final m g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        try {
            final m m = this.H.b.a(this.G);
            if (m == null) {
                this.H.c(new NullPointerException("Continuation returned null"));
                return;
            }
            final Executor b = o.b;
            m.l(b, this.H);
            m.i(b, this.H);
            m.c(b, this.H);
        }
        catch (Exception ex) {
            this.H.c.y(ex);
        }
        catch (k k) {
            if (k.getCause() instanceof Exception) {
                this.H.c.y((Exception)k.getCause());
                return;
            }
            this.H.c.y(k);
        }
    }
}
