// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import org.bson.codecs.configuration.a;

final class e0<T> implements d0<T>
{
    private final i0<T> a;
    
    e0(final i0<T> a) {
        this.a = a;
    }
    
    private a a(final Exception ex) {
        return new a(String.format("Unable to get value for property '%s' in %s", this.a.h(), this.a.d()), ex);
    }
    
    private a c(final Exception ex) {
        return new a(String.format("Unable to set value for property '%s' in %s", this.a.h(), this.a.d()), ex);
    }
    
    i0<T> b() {
        return this.a;
    }
    
    @Override
    public <S> void d(final S n, final T value) {
        try {
            if (this.a.o()) {
                if (this.a.j() != null) {
                    this.a.j().invoke(n, value);
                }
                else {
                    this.a.f().set(n, value);
                }
            }
        }
        catch (Exception ex) {
            throw this.c(ex);
        }
    }
    
    @Override
    public <S> T get(final S n) {
        try {
            if (!this.a.q()) {
                throw this.a(null);
            }
            if (this.a.g() != null) {
                return (T)this.a.g().invoke(n, new Object[0]);
            }
            return (T)this.a.f().get(n);
        }
        catch (Exception ex) {
            throw this.a(ex);
        }
    }
}
