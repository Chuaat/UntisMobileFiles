// 
// Decompiled by Procyon v0.5.36
// 

package rx;

import rx.internal.schedulers.i;
import java.util.concurrent.TimeUnit;
import rx.functions.a;
import rx.internal.schedulers.l;
import rx.functions.p;

public abstract class j
{
    public abstract a a();
    
    public long b() {
        return System.currentTimeMillis();
    }
    
    public <S extends rx.j> S c(final p<g<g<b>>, b> p) {
        return (S)new l(p, this);
    }
    
    public abstract static class a implements o
    {
        public long b() {
            return System.currentTimeMillis();
        }
        
        public abstract o c(final rx.functions.a p0);
        
        public abstract o d(final rx.functions.a p0, final long p1, final TimeUnit p2);
        
        public o e(final rx.functions.a a, final long n, final long n2, final TimeUnit timeUnit) {
            return i.a(this, a, n, n2, timeUnit, null);
        }
    }
}
