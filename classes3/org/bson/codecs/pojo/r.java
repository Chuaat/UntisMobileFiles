// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import org.bson.codecs.configuration.a;

final class r<I>
{
    private final j0<I> a;
    private final p<I> b;
    
    private r(final j0<I> a, final p<I> b) {
        this.a = a;
        this.b = b;
    }
    
    static <T, I, V> r<I> a(final Class<T> clazz, final j0<I> j0, final p<V> p3) {
        if (j0 == null && p3 != null) {
            throw new a(String.format("Invalid IdGenerator. There is no IdProperty set for: %s", clazz));
        }
        if (p3 != null && !j0.j().a().isAssignableFrom(p3.a())) {
            throw new a(String.format("Invalid IdGenerator. Mismatching types, the IdProperty type is: %s but the IdGenerator type is: %s", j0.j().a(), p3.a()));
        }
        return new r<I>((j0<Object>)j0, (p<Object>)p3);
    }
    
    static <T, I> r<I> b(final b<T> b, final j0<I> j0) {
        return a(b.l(), j0, b.e().c());
    }
    
    p<I> c() {
        return this.b;
    }
    
    j0<I> d() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean equals = true;
        if (this == o) {
            return true;
        }
        if (o != null && r.class == o.getClass()) {
            final r r = (r)o;
            final j0<I> a = this.a;
            Label_0062: {
                if (a != null) {
                    if (a.equals(r.a)) {
                        break Label_0062;
                    }
                }
                else if (r.a == null) {
                    break Label_0062;
                }
                return false;
            }
            final p<I> b = this.b;
            final p<I> b2 = r.b;
            if (b != null) {
                equals = b.equals(b2);
            }
            else if (b2 != null) {
                equals = false;
            }
            return equals;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final j0<I> a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final p<I> b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
}
