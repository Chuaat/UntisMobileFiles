// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.c;
import io.realm.internal.Table;

class o extends r0
{
    private static final String g = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.";
    
    o(final io.realm.a a, final t0 t0, final Table table) {
        super(a, t0, table, new a(table));
    }
    
    o(final io.realm.a a, final t0 t0, final Table table, final io.realm.internal.c c) {
        super(a, t0, table, c);
    }
    
    @Override
    public r0 E(final String s) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 F(final String s) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 G() {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 H(final String s, final String s2) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 I(final String s) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 K(final String s, final boolean b) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 L(final String s, final boolean b) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 M(final c c) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 c(final String s, final Class<?> clazz, final l... array) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 d(final String s) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 e(final String s) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 f(final String s, final r0 r0) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 g(final String s, final Class<?> clazz) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    public r0 h(final String s, final r0 r0) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
    
    @Override
    io.realm.internal.fields.c o(final String s, final RealmFieldType... array) {
        return io.realm.internal.fields.c.d((io.realm.internal.fields.c.a)this.t(), this.v(), s, array);
    }
    
    @Override
    String s(final String s) {
        final io.realm.internal.c.b f = super.d.f(s);
        if (f != null) {
            return f.c;
        }
        throw new IllegalArgumentException(String.format("Property '%s' not found.", s));
    }
}
