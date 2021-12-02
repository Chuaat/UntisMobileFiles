// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Locale;
import c6.h;
import io.realm.internal.OsList;

final class b extends s<byte[]>
{
    b(final a a, final OsList list, final Class<byte[]> clazz) {
        super(a, list, clazz);
    }
    
    public void c(final Object o) {
        super.b.a((byte[])o);
    }
    
    @Override
    protected void d(@h final Object o) {
        if (o == null) {
            return;
        }
        if (o instanceof byte[]) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "byte[]", o.getClass().getName()));
    }
    
    @Override
    public boolean h() {
        return false;
    }
    
    public void m(final int n, final Object o) {
        super.b.x(n, (byte[])o);
    }
    
    @Override
    protected void u(final int n, final Object o) {
        super.b.Q(n, (byte[])o);
    }
    
    @h
    public byte[] w(final int n) {
        return (byte[])super.b.w(n);
    }
}
