// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Locale;
import c6.h;
import io.realm.internal.OsList;

final class m extends s<Float>
{
    m(final a a, final OsList list, final Class<Float> clazz) {
        super(a, list, clazz);
    }
    
    public void c(final Object o) {
        super.b.f(((Number)o).floatValue());
    }
    
    @Override
    protected void d(@h final Object o) {
        if (o == null) {
            return;
        }
        if (o instanceof Number) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Number", o.getClass().getName()));
    }
    
    @Override
    public boolean h() {
        return false;
    }
    
    public void m(final int n, final Object o) {
        super.b.C(n, ((Number)o).floatValue());
    }
    
    @Override
    protected void u(final int n, final Object o) {
        super.b.V(n, ((Number)o).floatValue());
    }
    
    @h
    public Float w(final int n) {
        return (Float)super.b.w(n);
    }
}
