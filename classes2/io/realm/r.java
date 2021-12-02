// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Locale;
import c6.h;
import io.realm.internal.OsList;

final class r<T> extends s<T>
{
    r(final a a, final OsList list, final Class<T> clazz) {
        super(a, list, clazz);
    }
    
    public void c(final Object o) {
        super.b.i(((Number)o).longValue());
    }
    
    @Override
    protected void d(@h final Object o) {
        if (o == null) {
            return;
        }
        if (o instanceof Number) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Long, java.lang.Integer, java.lang.Short, java.lang.Byte", o.getClass().getName()));
    }
    
    @Override
    public boolean h() {
        return false;
    }
    
    @h
    @Override
    public T i(final int n) {
        final Long n2 = (Long)super.b.w(n);
        if (n2 == null) {
            return null;
        }
        final Class<T> c = (Class<T>)super.c;
        if (c == Long.class) {
            return (T)n2;
        }
        Number obj;
        if (c == Integer.class) {
            obj = n2.intValue();
        }
        else if (c == Short.class) {
            obj = n2.shortValue();
        }
        else {
            if (c != Byte.class) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unexpected element type: ");
                sb.append(super.c.getName());
                throw new IllegalStateException(sb.toString());
            }
            obj = n2.byteValue();
        }
        return c.cast(obj);
    }
    
    public void m(final int n, final Object o) {
        super.b.D(n, ((Number)o).longValue());
    }
    
    @Override
    protected void u(final int n, final Object o) {
        super.b.W(n, ((Number)o).longValue());
    }
}
