// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Locale;
import c6.h;
import io.realm.internal.OsList;
import java.util.Date;

final class f extends s<Date>
{
    f(final a a, final OsList list, final Class<Date> clazz) {
        super(a, list, clazz);
    }
    
    public void c(final Object o) {
        super.b.c((Date)o);
    }
    
    @Override
    protected void d(@h final Object o) {
        if (o == null) {
            return;
        }
        if (o instanceof Date) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.util.Date", o.getClass().getName()));
    }
    
    @Override
    public boolean h() {
        return false;
    }
    
    public void m(final int n, final Object o) {
        super.b.z(n, (Date)o);
    }
    
    @Override
    protected void u(final int n, final Object o) {
        super.b.S(n, (Date)o);
    }
    
    @h
    public Date w(final int n) {
        return (Date)super.b.w(n);
    }
}
