// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;
import java.util.RandomAccess;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0018\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0011R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019" }, d2 = { "Lkotlin/collections/d1;", "E", "Lkotlin/collections/d;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "fromIndex", "toIndex", "Lkotlin/j2;", "f", "index", "get", "(I)Ljava/lang/Object;", "b", "()I", "size", "H", "I", "_size", "", "J", "Ljava/util/List;", "list", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class d1<E> extends d<E> implements RandomAccess
{
    private int H;
    private int I;
    private final List<E> J;
    
    public d1(@e final List<? extends E> j) {
        k0.p(j, "list");
        this.J = (List<E>)j;
    }
    
    @Override
    public int b() {
        return this.I;
    }
    
    public final void f(final int h, final int n) {
        d.G.d(h, n, this.J.size());
        this.H = h;
        this.I = n - h;
    }
    
    @Override
    public E get(final int n) {
        d.G.b(n, this.I);
        return this.J.get(this.H + n);
    }
}
