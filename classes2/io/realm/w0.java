// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Locale;
import c6.h;
import io.realm.internal.OsList;

final class w0 extends s<String>
{
    w0(final a a, final OsList list, final Class<String> clazz) {
        super(a, list, clazz);
    }
    
    public void c(final Object o) {
        super.b.m((String)o);
    }
    
    @Override
    protected void d(@h final Object o) {
        if (o == null) {
            return;
        }
        if (o instanceof String) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.String", o.getClass().getName()));
    }
    
    @Override
    public boolean h() {
        return false;
    }
    
    public void m(final int n, final Object o) {
        super.b.H(n, (String)o);
    }
    
    @Override
    protected void u(final int n, final Object o) {
        super.b.a0(n, (String)o);
    }
    
    @h
    public String w(final int n) {
        return (String)super.b.w(n);
    }
}
