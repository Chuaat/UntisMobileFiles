// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.f;

public class v extends g
{
    private static final long K = 3154803964207950910L;
    
    protected v(final f f) {
        super(f);
    }
    
    public static f a0(final f f) {
        if (f == null) {
            return null;
        }
        f z = f;
        if (f instanceof l) {
            z = ((l)f).Z();
        }
        if (!z.L()) {
            return z;
        }
        return new v(z);
    }
    
    @Override
    public final boolean L() {
        return false;
    }
    
    @Override
    public long T(final long n, final int n2) {
        j.p(this, n2, this.E(n), this.z(n));
        return super.T(n, n2);
    }
}
