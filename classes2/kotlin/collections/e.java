// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.jvm.internal.m0;
import n6.l;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.util.Collection;
import java.util.Set;
import kotlin.e1;
import kotlin.Metadata;
import o6.a;
import java.util.Map;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u000e\b'\u0018\u0000 0*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u00011B\t\b\u0004¢\u0006\u0004\b.\u0010/J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\bJ\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0010J!\u0010\u0013\u001a\u00020\u000e2\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0096\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00198V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010$8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010$8\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u00062" }, d2 = { "Lkotlin/collections/e;", "K", "V", "", "", "entry", "", "i", "", "o", "h", "key", "g", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "b", "(Ljava/util/Map$Entry;)Z", "other", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "isEmpty", "toString", "", "G", "Ljava/util/Set;", "_keys", "e", "()I", "size", "", "f", "()Ljava/util/Collection;", "values", "d", "()Ljava/util/Set;", "keys", "H", "Ljava/util/Collection;", "_values", "<init>", "()V", "I", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.1")
public abstract class e<K, V> implements Map<K, V>, o6.a
{
    @org.jetbrains.annotations.e
    public static final a I;
    private volatile Set<? extends K> G;
    private volatile Collection<? extends V> H;
    
    static {
        I = new a(null);
    }
    
    protected e() {
    }
    
    private final Entry<K, V> g(final K k) {
        for (final Entry<Object, V> next : this.entrySet()) {
            if (k0.g(next.getKey(), k)) {
                final Entry<Object, V> entry = next;
                return (Entry<K, V>)(Entry)entry;
            }
        }
        final Entry<Object, V> entry = null;
        return (Entry<K, V>)(Entry)entry;
    }
    
    private final String h(final Object obj) {
        String value;
        if (obj == this) {
            value = "(this Map)";
        }
        else {
            value = String.valueOf(obj);
        }
        return value;
    }
    
    private final String i(final Entry<? extends K, ? extends V> entry) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.h(entry.getKey()));
        sb.append("=");
        sb.append(this.h(entry.getValue()));
        return sb.toString();
    }
    
    public final boolean b(@f final Entry<?, ?> entry) {
        if (!(entry instanceof Entry)) {
            return false;
        }
        final Object key = entry.getKey();
        final Object value = entry.getValue();
        final V value2 = this.get(key);
        return !(k0.g(value, value2) ^ true) && (value2 != null || this.containsKey(key));
    }
    
    public abstract Set c();
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.g(o) != null;
    }
    
    @Override
    public boolean containsValue(final Object o) {
        final Set<Entry<K, Object>> entrySet = (Set<Entry<K, Object>>)this.entrySet();
        final boolean b = entrySet instanceof Collection;
        final boolean b2 = false;
        boolean b3;
        if (b && entrySet.isEmpty()) {
            b3 = b2;
        }
        else {
            final Iterator<Object> iterator = entrySet.iterator();
            do {
                b3 = b2;
                if (iterator.hasNext()) {
                    continue;
                }
                return b3;
            } while (!k0.g(iterator.next().getValue(), o));
            b3 = true;
        }
        return b3;
    }
    
    @org.jetbrains.annotations.e
    public Set<K> d() {
        if (this.G == null) {
            this.G = (Set<? extends K>)new j<K>() {
                final /* synthetic */ e H;
                
                @Override
                public int b() {
                    return this.H.size();
                }
                
                @Override
                public boolean contains(final Object o) {
                    return this.H.containsKey(o);
                }
                
                @org.jetbrains.annotations.e
                @Override
                public Iterator<K> iterator() {
                    return new Iterator<K>() {
                        final /* synthetic */ Iterator G = e$b.this.H.entrySet().iterator();
                        
                        @Override
                        public boolean hasNext() {
                            return this.G.hasNext();
                        }
                        
                        @Override
                        public K next() {
                            return this.G.next().getKey();
                        }
                        
                        @Override
                        public void remove() {
                            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        }
                    };
                }
            };
        }
        final Set<? extends K> g = this.G;
        k0.m(g);
        return (Set<K>)g;
    }
    
    public int e() {
        return this.entrySet().size();
    }
    
    @Override
    public final /* bridge */ Set<Entry<K, V>> entrySet() {
        return (Set<Entry<K, V>>)this.c();
    }
    
    @Override
    public boolean equals(@f final Object o) {
        final boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof Map)) {
            return false;
        }
        final int size = this.size();
        final Map map = (Map)o;
        if (size != map.size()) {
            return false;
        }
        final Set entrySet = map.entrySet();
        boolean b2;
        if (entrySet instanceof Collection && entrySet.isEmpty()) {
            b2 = b;
        }
        else {
            final Iterator<Entry> iterator = entrySet.iterator();
            do {
                b2 = b;
                if (iterator.hasNext()) {
                    continue;
                }
                return b2;
            } while (this.b(iterator.next()));
            b2 = false;
        }
        return b2;
    }
    
    @org.jetbrains.annotations.e
    public Collection<V> f() {
        if (this.H == null) {
            this.H = (Collection<? extends V>)new kotlin.collections.a<V>() {
                final /* synthetic */ e G;
                
                @Override
                public int b() {
                    return this.G.size();
                }
                
                @Override
                public boolean contains(final Object o) {
                    return this.G.containsValue(o);
                }
                
                @org.jetbrains.annotations.e
                @Override
                public Iterator<V> iterator() {
                    return new Iterator<V>() {
                        final /* synthetic */ Iterator G = e$d.this.G.entrySet().iterator();
                        
                        @Override
                        public boolean hasNext() {
                            return this.G.hasNext();
                        }
                        
                        @Override
                        public V next() {
                            return this.G.next().getValue();
                        }
                        
                        @Override
                        public void remove() {
                            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        }
                    };
                }
            };
        }
        final Collection<? extends V> h = this.H;
        k0.m(h);
        return (Collection<V>)h;
    }
    
    @f
    @Override
    public V get(Object value) {
        final Entry<K, Object> g = this.g((K)value);
        if (g != null) {
            value = g.getValue();
        }
        else {
            value = null;
        }
        return (V)value;
    }
    
    @Override
    public int hashCode() {
        return this.entrySet().hashCode();
    }
    
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    @Override
    public final /* bridge */ Set<K> keySet() {
        return this.d();
    }
    
    @Override
    public V put(final K k, final V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void putAll(final Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public V remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.e();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        return v.Z2(this.entrySet(), ", ", "{", "}", 0, null, new l<Entry<? extends K, ? extends V>, CharSequence>() {
            @org.jetbrains.annotations.e
            public final CharSequence a(@org.jetbrains.annotations.e final Entry<? extends K, ? extends V> entry) {
                k0.p(entry, "it");
                return e.this.i(entry);
            }
        }, 24, null);
    }
    
    @Override
    public final /* bridge */ Collection<V> values() {
        return this.f();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010&\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010" }, d2 = { "kotlin/collections/e$a", "", "", "e", "", "b", "(Ljava/util/Map$Entry;)I", "", "c", "(Ljava/util/Map$Entry;)Ljava/lang/String;", "other", "", "a", "(Ljava/util/Map$Entry;Ljava/lang/Object;)Z", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        public final boolean a(@org.jetbrains.annotations.e final Entry<?, ?> entry, @f final Object o) {
            k0.p(entry, "e");
            final boolean b = o instanceof Entry;
            final boolean b2 = false;
            if (!b) {
                return false;
            }
            final Object key = entry.getKey();
            final Entry entry2 = (Entry)o;
            boolean b3 = b2;
            if (k0.g(key, entry2.getKey())) {
                b3 = b2;
                if (k0.g(entry.getValue(), entry2.getValue())) {
                    b3 = true;
                }
            }
            return b3;
        }
        
        public final int b(@org.jetbrains.annotations.e final Entry<?, ?> entry) {
            k0.p(entry, "e");
            final Object key = entry.getKey();
            int hashCode = 0;
            int hashCode2;
            if (key != null) {
                hashCode2 = key.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final Object value = entry.getValue();
            if (value != null) {
                hashCode = value.hashCode();
            }
            return hashCode2 ^ hashCode;
        }
        
        @org.jetbrains.annotations.e
        public final String c(@org.jetbrains.annotations.e final Entry<?, ?> entry) {
            k0.p(entry, "e");
            final StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            return sb.toString();
        }
    }
}
