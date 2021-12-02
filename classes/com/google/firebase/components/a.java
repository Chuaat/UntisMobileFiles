// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.components;

import java.util.Set;
import n3.b;

abstract class a implements g
{
    @Override
    public <T> T a(final Class<T> clazz) {
        final n3.b<T> b = this.b(clazz);
        if (b == null) {
            return null;
        }
        return (T)b.get();
    }
    
    @Override
    public <T> Set<T> e(final Class<T> clazz) {
        return (Set<T>)this.d(clazz).get();
    }
}
