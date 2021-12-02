// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import org.jetbrains.annotations.f;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.k0;
import n6.l;
import org.jetbrains.annotations.e;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B>\u0012\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+\u0012!\u00104\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u000101¢\u0006\u0004\b5\u00106J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u001e\u0010\u001a\u001a\u00020\u00192\u0014\u0010\u0018\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\u0017\u0010\u001c\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u0013R\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001d8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR(\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"0!8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000!8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010$R(\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00067" }, d2 = { "Lkotlin/collections/f1;", "K", "V", "Lkotlin/collections/e1;", "", "other", "", "equals", "", "hashCode", "", "toString", "isEmpty", "key", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "", "from", "Lkotlin/j2;", "putAll", "clear", "m", "", "d", "()Ljava/util/Collection;", "values", "", "", "a", "()Ljava/util/Set;", "entries", "c", "()I", "size", "b", "keys", "", "G", "Ljava/util/Map;", "l", "()Ljava/util/Map;", "map", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "default", "<init>", "(Ljava/util/Map;Ln6/l;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class f1<K, V> implements e1<K, V>
{
    @e
    private final Map<K, V> G;
    private final l<K, V> H;
    
    public f1(@e final Map<K, V> g, @e final l<? super K, ? extends V> h) {
        k0.p(g, "map");
        k0.p(h, "default");
        this.G = g;
        this.H = (l<K, V>)h;
    }
    
    @e
    public Set<Entry<K, V>> a() {
        return this.l().entrySet();
    }
    
    @e
    public Set<K> b() {
        return this.l().keySet();
    }
    
    public int c() {
        return this.l().size();
    }
    
    @Override
    public void clear() {
        this.l().clear();
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.l().containsKey(o);
    }
    
    @Override
    public boolean containsValue(final Object o) {
        return this.l().containsValue(o);
    }
    
    @e
    public Collection<V> d() {
        return this.l().values();
    }
    
    @Override
    public final /* bridge */ Set<Entry<K, V>> entrySet() {
        return this.a();
    }
    
    @Override
    public boolean equals(@f final Object obj) {
        return this.l().equals(obj);
    }
    
    @f
    @Override
    public V get(final Object o) {
        return this.l().get(o);
    }
    
    @Override
    public int hashCode() {
        return this.l().hashCode();
    }
    
    @Override
    public boolean isEmpty() {
        return this.l().isEmpty();
    }
    
    @Override
    public final /* bridge */ Set<K> keySet() {
        return this.b();
    }
    
    @e
    @Override
    public Map<K, V> l() {
        return this.G;
    }
    
    @Override
    public V m(final K k) {
        final Map<K, Object> l = this.l();
        Object o2;
        final Object o = o2 = l.get(k);
        if (o == null) {
            o2 = o;
            if (!l.containsKey(k)) {
                o2 = this.H.invoke(k);
            }
        }
        return (V)o2;
    }
    
    @f
    @Override
    public V put(final K k, final V v) {
        return this.l().put(k, v);
    }
    
    @Override
    public void putAll(@e final Map<? extends K, ? extends V> map) {
        k0.p(map, "from");
        this.l().putAll(map);
    }
    
    @f
    @Override
    public V remove(final Object o) {
        return this.l().remove(o);
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.c();
    }
    
    @e
    @Override
    public String toString() {
        return this.l().toString();
    }
    
    @Override
    public final /* bridge */ Collection<V> values() {
        return this.d();
    }
}
