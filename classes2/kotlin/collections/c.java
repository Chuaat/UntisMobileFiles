// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import o6.a;
import java.util.Iterator;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH$J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\bH\u0004R\u0018\u0010\u0010\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017" }, d2 = { "Lkotlin/collections/c;", "T", "", "", "d", "hasNext", "next", "()Ljava/lang/Object;", "Lkotlin/j2;", "a", "value", "c", "(Ljava/lang/Object;)V", "b", "H", "Ljava/lang/Object;", "nextValue", "Lkotlin/collections/p1;", "G", "Lkotlin/collections/p1;", "state", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public abstract class c<T> implements Iterator<T>, a
{
    private p1 G;
    private T H;
    
    public c() {
        this.G = p1.H;
    }
    
    private final boolean d() {
        this.G = p1.J;
        this.a();
        return this.G == p1.G;
    }
    
    protected abstract void a();
    
    protected final void b() {
        this.G = p1.I;
    }
    
    protected final void c(final T h) {
        this.H = h;
        this.G = p1.G;
    }
    
    @Override
    public boolean hasNext() {
        final p1 g = this.G;
        final p1 j = p1.J;
        boolean b = false;
        if (g != j) {
            final int n = kotlin.collections.b.a[g.ordinal()];
            if (n != 1) {
                b = (n == 2 || this.d());
            }
            return b;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    @Override
    public T next() {
        if (this.hasNext()) {
            this.G = p1.H;
            return this.H;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
