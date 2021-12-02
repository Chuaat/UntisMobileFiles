// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.internal;

import org.bson.codecs.n0;
import org.bson.codecs.configuration.d;

class b<T> implements d
{
    private final b<?> a;
    private final e b;
    private final Class<T> c;
    
    private b(final b<?> a, final Class<T> c) {
        this.a = a;
        this.c = c;
        this.b = a.b;
    }
    
    b(final e b, final Class<T> c) {
        this.c = c;
        this.a = null;
        this.b = b;
    }
    
    private <U> Boolean d(final Class<U> obj) {
        for (b<?> a = this; a != null; a = a.a) {
            if (a.c.equals(obj)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
    
    @Override
    public <U> n0<U> a(final Class<U> clazz) {
        if (this.d(clazz)) {
            return new f<U>(this.b, clazz);
        }
        return this.b.c(new b<U>(this, clazz));
    }
    
    public Class<T> b() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final b b = (b)o;
        if (!this.c.equals(b.c)) {
            return false;
        }
        final b<?> a = this.a;
        if (a != null) {
            if (a.equals(b.a)) {
                return this.b.equals(b.b);
            }
        }
        else if (b.a == null) {
            return this.b.equals(b.b);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final b<?> a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return (hashCode * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }
}
