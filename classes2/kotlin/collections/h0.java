// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import o6.a;
import java.util.ListIterator;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u00c0\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\t\u0010\t\u001a\u00020\u0002H\u0096\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\r" }, d2 = { "Lkotlin/collections/h0;", "", "", "", "hasNext", "hasPrevious", "", "nextIndex", "previousIndex", "b", "c", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class h0 implements ListIterator, a
{
    @e
    public static final h0 G;
    
    static {
        G = new h0();
    }
    
    private h0() {
    }
    
    public void a(final Void void1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @e
    public Void b() {
        throw new NoSuchElementException();
    }
    
    @e
    public Void c() {
        throw new NoSuchElementException();
    }
    
    public void d(final Void void1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean hasNext() {
        return false;
    }
    
    @Override
    public boolean hasPrevious() {
        return false;
    }
    
    @Override
    public int nextIndex() {
        return 0;
    }
    
    @Override
    public int previousIndex() {
        return -1;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
