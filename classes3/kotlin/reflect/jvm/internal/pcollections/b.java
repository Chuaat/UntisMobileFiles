// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.pcollections;

public final class b<K, V>
{
    private static final b<Object, Object> c;
    private final d<a<e<K, V>>> a;
    private final int b;
    
    static {
        c = new b<Object, Object>(d.a(), 0);
    }
    
    private b(final d<a<e<K, V>>> a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    private static /* synthetic */ void a(final int n) {
        final Object[] args = { "kotlin/reflect/jvm/internal/pcollections/HashPMap", null };
        if (n != 1) {
            args[1] = "empty";
        }
        else {
            args[1] = "minus";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", args));
    }
    
    @org.jetbrains.annotations.e
    public static <K, V> b<K, V> c() {
        final b<Object, Object> c = b.c;
        if (c == null) {
            a(0);
        }
        return (b<K, V>)c;
    }
    
    private a<e<K, V>> e(final int n) {
        a<e<K, V>> f;
        if ((f = this.a.b(n)) == null) {
            f = kotlin.reflect.jvm.internal.pcollections.a.f();
        }
        return f;
    }
    
    private static <K, V> int f(a<e<K, V>> h, final Object obj) {
        for (int n = 0; h != null && h.size() > 0; h = h.H, ++n) {
            if (((e<K, V>)h.G).G.equals(obj)) {
                return n;
            }
        }
        return -1;
    }
    
    public boolean b(final Object o) {
        return f(this.e(o.hashCode()), o) != -1;
    }
    
    public V d(final Object obj) {
        for (a<e<K, V>> a = this.e(obj.hashCode()); a != null && a.size() > 0; a = a.H) {
            final e<K, V> e = a.G;
            if (e.G.equals(obj)) {
                return e.H;
            }
        }
        return null;
    }
    
    @org.jetbrains.annotations.e
    public b<K, V> g(final Object o) {
        final a<e<Object, Object>> e = this.e(o.hashCode());
        final int f = f(e, o);
        if (f == -1) {
            return this;
        }
        final a<e<Object, Object>> i = e.i(f);
        if (i.size() == 0) {
            return new b<K, V>(this.a.c(o.hashCode()), this.b - 1);
        }
        return new b<K, V>((d<a<e<Object, Object>>>)this.a.d(o.hashCode(), (a<e<K, V>>)i), this.b - 1);
    }
    
    @org.jetbrains.annotations.e
    public b<K, V> h(final K k, final V v) {
        final a<e<K, V>> e = this.e(k.hashCode());
        final int size = e.size();
        final int f = f(e, k);
        a<e<K, V>> i = e;
        if (f != -1) {
            i = e.i(f);
        }
        final a<e<K, V>> l = i.l(new e<K, V>(k, v));
        return new b<K, V>((d<a<e<Object, Object>>>)this.a.d(k.hashCode(), l), this.b - size + l.size());
    }
    
    public int i() {
        return this.b;
    }
}
