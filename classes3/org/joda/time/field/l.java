// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.f;
import org.joda.time.a;

public class l extends g
{
    private static final long L = 8714085824173290599L;
    private final a K;
    
    protected l(final f f, final a k) {
        super(f);
        this.K = k;
    }
    
    public static f a0(final f f, final a a) {
        if (f == null) {
            return null;
        }
        f z = f;
        if (f instanceof v) {
            z = ((v)f).Z();
        }
        if (z.L()) {
            return z;
        }
        return new l(z, a);
    }
    
    @Override
    public final boolean L() {
        return true;
    }
    
    @Override
    public long T(final long n, final int n2) {
        return this.K.s().c(this.J().G(this.K.R()).b(this.K.s().e(n), j.m(n2, this.g(n))), false, n);
    }
}
