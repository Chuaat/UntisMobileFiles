// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.collections.t0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f" }, d2 = { "Lkotlin/jvm/internal/g;", "Lkotlin/collections/t0;", "", "hasNext", "", "b", "G", "I", "index", "", "H", "[I", "array", "<init>", "([I)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class g extends t0
{
    private int G;
    private final int[] H;
    
    public g(@e final int[] h) {
        k0.p(h, "array");
        this.H = h;
    }
    
    @Override
    public int b() {
        try {
            return this.H[this.G++];
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            --this.G;
            throw new NoSuchElementException(ex.getMessage());
        }
    }
    
    @Override
    public boolean hasNext() {
        return this.G < this.H.length;
    }
}
