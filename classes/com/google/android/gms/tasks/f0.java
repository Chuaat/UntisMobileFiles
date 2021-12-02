// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import java.util.concurrent.CancellationException;

final class f0 implements Runnable
{
    private final /* synthetic */ m G;
    private final /* synthetic */ g0 H;
    
    f0(final g0 h, final m g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        try {
            final m<Object> a = this.H.b.a(this.G.r());
            if (a == null) {
                this.H.c(new NullPointerException("Continuation returned null"));
                return;
            }
            final Executor b = o.b;
            a.l(b, this.H);
            a.i(b, this.H);
            a.c(b, this.H);
        }
        catch (Exception ex) {
            this.H.c(ex);
        }
        catch (CancellationException ex2) {
            this.H.a();
        }
        catch (k k) {
            if (k.getCause() instanceof Exception) {
                this.H.c((Exception)k.getCause());
                return;
            }
            this.H.c(k);
        }
    }
}
