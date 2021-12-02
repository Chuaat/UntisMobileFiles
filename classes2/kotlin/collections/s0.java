// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import o6.a;
import java.util.Iterator;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010" }, d2 = { "Lkotlin/collections/s0;", "T", "", "Lkotlin/collections/q0;", "", "hasNext", "a", "", "G", "I", "index", "H", "Ljava/util/Iterator;", "iterator", "<init>", "(Ljava/util/Iterator;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class s0<T> implements Iterator<q0<? extends T>>, a
{
    private int G;
    private final Iterator<T> H;
    
    public s0(@e final Iterator<? extends T> h) {
        k0.p(h, "iterator");
        this.H = (Iterator<T>)h;
    }
    
    @e
    public final q0<T> a() {
        final int n = this.G++;
        if (n < 0) {
            v.W();
        }
        return new q0<T>(n, this.H.next());
    }
    
    @Override
    public final boolean hasNext() {
        return this.H.hasNext();
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
