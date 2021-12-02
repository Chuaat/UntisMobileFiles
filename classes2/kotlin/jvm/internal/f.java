// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.collections.l0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010" }, d2 = { "Lkotlin/jvm/internal/f;", "Lkotlin/collections/l0;", "", "hasNext", "", "b", "", "G", "I", "index", "", "H", "[F", "array", "<init>", "([F)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class f extends l0
{
    private int G;
    private final float[] H;
    
    public f(@e final float[] h) {
        k0.p(h, "array");
        this.H = h;
    }
    
    @Override
    public float b() {
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
