// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0006J \u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018" }, d2 = { "Lkotlin/collections/g1;", "T", "Lkotlin/collections/g;", "", "index", "get", "(I)Ljava/lang/Object;", "Lkotlin/j2;", "clear", "f", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "add", "(ILjava/lang/Object;)V", "", "G", "Ljava/util/List;", "delegate", "b", "()I", "size", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class g1<T> extends g<T>
{
    private final List<T> G;
    
    public g1(@org.jetbrains.annotations.e final List<T> g) {
        k0.p(g, "delegate");
        this.G = g;
    }
    
    @Override
    public void add(final int n, final T t) {
        this.G.add(d0.X0(this, n), t);
    }
    
    @Override
    public int b() {
        return this.G.size();
    }
    
    @Override
    public void clear() {
        this.G.clear();
    }
    
    @Override
    public T f(final int n) {
        return this.G.remove(d0.W0(this, n));
    }
    
    @Override
    public T get(final int n) {
        return this.G.get(d0.W0(this, n));
    }
    
    @Override
    public T set(final int n, final T t) {
        return this.G.set(d0.W0(this, n), t);
    }
}
