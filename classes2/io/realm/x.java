// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Locale;
import c6.h;
import io.realm.internal.OsList;
import org.bson.types.ObjectId;

final class x extends s<ObjectId>
{
    x(final a a, final OsList list, final Class<ObjectId> clazz) {
        super(a, list, clazz);
    }
    
    public void c(final Object o) {
        super.b.k((ObjectId)o);
    }
    
    @Override
    protected void d(@h final Object o) {
        if (o == null) {
            return;
        }
        if (o instanceof ObjectId) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "org.bson.types.ObjectId", o.getClass().getName()));
    }
    
    @Override
    public boolean h() {
        return false;
    }
    
    public void m(final int n, final Object o) {
        super.b.F(n, (ObjectId)o);
    }
    
    @Override
    protected void u(final int n, final Object o) {
        super.b.Y(n, (ObjectId)o);
    }
    
    @h
    public ObjectId w(final int n) {
        return (ObjectId)super.b.w(n);
    }
}
