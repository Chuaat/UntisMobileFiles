// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Locale;
import c6.h;
import io.realm.internal.OsList;

final class c extends s<Boolean>
{
    c(final a a, final OsList list, final Class<Boolean> clazz) {
        super(a, list, clazz);
    }
    
    public void c(final Object o) {
        super.b.b((boolean)o);
    }
    
    @Override
    protected void d(@h final Object o) {
        if (o == null) {
            return;
        }
        if (o instanceof Boolean) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Boolean", o.getClass().getName()));
    }
    
    @Override
    public boolean h() {
        return false;
    }
    
    public void m(final int n, final Object o) {
        super.b.y(n, (boolean)o);
    }
    
    @Override
    protected void u(final int n, final Object o) {
        super.b.R(n, (boolean)o);
    }
    
    @h
    public Boolean w(final int n) {
        return (Boolean)super.b.w(n);
    }
}
