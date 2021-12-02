// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import org.jetbrains.annotations.f;
import java.util.Collection;
import java.util.Set;
import kotlin.e1;
import kotlin.Metadata;
import o6.g;
import java.util.Map;
import java.util.AbstractMap;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "Lkotlin/collections/h;", "K", "V", "", "Ljava/util/AbstractMap;", "key", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.1")
public abstract class h<K, V> extends AbstractMap<K, V> implements Map<K, V>, g
{
    protected h() {
    }
    
    public abstract Set a();
    
    public /* bridge */ Set b() {
        return super.keySet();
    }
    
    public /* bridge */ int c() {
        return super.size();
    }
    
    public /* bridge */ Collection d() {
        return super.values();
    }
    
    @Override
    public final /* bridge */ Set<Entry<K, V>> entrySet() {
        return (Set<Entry<K, V>>)this.a();
    }
    
    @Override
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>)this.b();
    }
    
    @f
    @Override
    public abstract V put(final K p0, final V p1);
    
    @Override
    public final /* bridge */ int size() {
        return this.c();
    }
    
    @Override
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>)this.d();
    }
}
