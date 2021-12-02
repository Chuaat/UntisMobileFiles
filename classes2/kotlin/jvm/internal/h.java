// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import o6.a;
import java.util.Iterator;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013" }, d2 = { "Lkotlin/jvm/internal/h;", "T", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "G", "I", "index", "", "H", "[Ljava/lang/Object;", "a", "()[Ljava/lang/Object;", "array", "<init>", "([Ljava/lang/Object;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class h<T> implements Iterator<T>, a
{
    private int G;
    @e
    private final T[] H;
    
    public h(@e final T[] h) {
        k0.p(h, "array");
        this.H = h;
    }
    
    @e
    public final T[] a() {
        return this.H;
    }
    
    @Override
    public boolean hasNext() {
        return this.G < this.H.length;
    }
    
    @Override
    public T next() {
        try {
            return this.H[this.G++];
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            --this.G;
            throw new NoSuchElementException(ex.getMessage());
        }
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
