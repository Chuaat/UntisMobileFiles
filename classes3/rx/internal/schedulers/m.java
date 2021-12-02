// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.schedulers;

import rx.exceptions.c;
import rx.j;
import rx.functions.a;

class m implements a
{
    private final a G;
    private final j.a H;
    private final long I;
    
    public m(final a g, final j.a h, final long i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public void call() {
        if (this.H.g()) {
            return;
        }
        final long n = this.I - this.H.b();
        if (n > 0L) {
            try {
                Thread.sleep(n);
            }
            catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                c.c(ex);
            }
        }
        if (this.H.g()) {
            return;
        }
        this.G.call();
    }
}
