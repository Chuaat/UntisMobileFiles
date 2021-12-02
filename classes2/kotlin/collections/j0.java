// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import java.util.Collection;
import java.util.Set;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import o6.a;
import java.io.Serializable;
import java.util.Map;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\b\b\u00c2\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00060\u0004j\u0002`\u0005B\t\b\u0002¢\u0006\u0004\b&\u0010'J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR*\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030 0\u001f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"¨\u0006(" }, d2 = { "Lkotlin/collections/j0;", "", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "h", "other", "", "equals", "", "hashCode", "", "toString", "isEmpty", "key", "containsKey", "value", "a", "b", "", "f", "()Ljava/util/Collection;", "values", "", "G", "J", "serialVersionUID", "e", "()I", "size", "", "", "c", "()Ljava/util/Set;", "entries", "d", "keys", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class j0 implements Map, Serializable, a
{
    private static final long G = 8246714829545688274L;
    @e
    public static final j0 H;
    
    static {
        H = new j0();
    }
    
    private j0() {
    }
    
    private final Object h() {
        return j0.H;
    }
    
    public boolean a(@e final Void void1) {
        k0.p(void1, "value");
        return false;
    }
    
    @f
    public Void b(@f final Object o) {
        return null;
    }
    
    @e
    public Set<Entry> c() {
        return (Set<Entry>)kotlin.collections.k0.H;
    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean containsKey(@f final Object o) {
        return false;
    }
    
    @Override
    public final /* bridge */ boolean containsValue(final Object o) {
        return o instanceof Void && this.a((Void)o);
    }
    
    @e
    public Set<Object> d() {
        return (Set<Object>)kotlin.collections.k0.H;
    }
    
    public int e() {
        return 0;
    }
    
    @Override
    public final /* bridge */ Set<Entry> entrySet() {
        return this.c();
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof Map && ((Map)o).isEmpty();
    }
    
    @e
    public Collection f() {
        return i0.H;
    }
    
    public Void g(final Object o, final Void void1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ Object get(final Object o) {
        return this.b(o);
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public boolean isEmpty() {
        return true;
    }
    
    @Override
    public final /* bridge */ Set<Object> keySet() {
        return this.d();
    }
    
    @Override
    public void putAll(final Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public Object remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.e();
    }
    
    @e
    @Override
    public String toString() {
        return "{}";
    }
    
    @Override
    public final /* bridge */ Collection values() {
        return this.f();
    }
}
