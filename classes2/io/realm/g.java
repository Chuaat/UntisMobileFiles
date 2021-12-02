// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Locale;
import c6.h;
import io.realm.internal.OsList;
import org.bson.types.Decimal128;

final class g extends s<Decimal128>
{
    g(final a a, final OsList list, final Class<Decimal128> clazz) {
        super(a, list, clazz);
    }
    
    public void c(final Object o) {
        super.b.d((Decimal128)o);
    }
    
    @Override
    protected void d(@h final Object o) {
        if (o == null) {
            return;
        }
        if (o instanceof Decimal128) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "org.bson.types.Decimal128", o.getClass().getName()));
    }
    
    @Override
    public boolean h() {
        return false;
    }
    
    public void m(final int n, final Object o) {
        super.b.A(n, (Decimal128)o);
    }
    
    @Override
    protected void u(final int n, final Object o) {
        super.b.T(n, (Decimal128)o);
    }
    
    @h
    public Decimal128 w(final int n) {
        return (Decimal128)super.b.w(n);
    }
}
