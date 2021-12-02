// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.pcollections;

final class d<V>
{
    private static final d<Object> b;
    private final c<V> a;
    
    static {
        b = new d<Object>(c.f);
    }
    
    private d(final c<V> a) {
        this.a = a;
    }
    
    public static <V> d<V> a() {
        return (d<V>)d.b;
    }
    
    private d<V> e(final c<V> c) {
        if (c == this.a) {
            return this;
        }
        return new d<V>(c);
    }
    
    public V b(final int n) {
        return this.a.a(n);
    }
    
    public d<V> c(final int n) {
        return this.e(this.a.c(n));
    }
    
    public d<V> d(final int n, final V v) {
        return this.e(this.a.d(n, v));
    }
}
