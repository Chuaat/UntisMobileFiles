// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.fields.c;

class u0 implements a
{
    private final t0 a;
    
    u0(final t0 a) {
        this.a = a;
    }
    
    @Override
    public io.realm.internal.c a(final String s) {
        return this.a.k(s);
    }
    
    @Override
    public boolean b() {
        return this.a.q();
    }
    
    @Override
    public long c(final String s) {
        return this.a.p(s).getNativePtr();
    }
}
