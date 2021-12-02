// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Iterator;
import io.realm.internal.q;
import java.util.LinkedHashSet;
import java.util.Set;
import io.realm.internal.Table;
import io.realm.internal.b;

class p extends t0
{
    private static final String i = "This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.";
    
    p(final a a, final b b) {
        super(a, b);
    }
    
    @Override
    public r0 e(final String s) {
        throw new UnsupportedOperationException("This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 g(final String s, final String s2, final Class<?> clazz, final l... array) {
        throw new UnsupportedOperationException("This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 h(final String s) {
        this.c(s, "Null or empty class names are not allowed");
        final String q = Table.Q(s);
        if (!super.f.J().hasTable(q)) {
            return null;
        }
        return new o(super.f, this, super.f.J().getTable(q), this.k(s));
    }
    
    @Override
    public Set<r0> i() {
        final q r = super.f.D().r();
        final Set<Class<? extends n0>> j = r.j();
        final LinkedHashSet set = new LinkedHashSet<r0>(j.size());
        final Iterator<Class<? extends n0>> iterator = j.iterator();
        while (iterator.hasNext()) {
            set.add(this.h(r.l(iterator.next())));
        }
        return (Set<r0>)set;
    }
    
    @Override
    public void u(final String s) {
        throw new UnsupportedOperationException("This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 w(final String s, final String s2) {
        throw new UnsupportedOperationException("This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
}
