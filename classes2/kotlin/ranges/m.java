// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.u0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0007\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014" }, d2 = { "Lkotlin/ranges/m;", "Lkotlin/collections/u0;", "", "hasNext", "", "b", "G", "J", "finalElement", "c", "()J", "step", "I", "next", "H", "Z", "first", "last", "<init>", "(JJJ)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class m extends u0
{
    private final long G;
    private boolean H;
    private long I;
    private final long J;
    
    public m(long i, final long g, final long j) {
        this.J = j;
        this.G = g;
        boolean h = true;
        final long n = lcmp(i, g);
        Label_0049: {
            if (j > 0L) {
                if (n <= 0) {
                    break Label_0049;
                }
            }
            else if (n >= 0) {
                break Label_0049;
            }
            h = false;
        }
        this.H = h;
        if (!h) {
            i = g;
        }
        this.I = i;
    }
    
    @Override
    public long b() {
        final long i = this.I;
        if (i == this.G) {
            if (!this.H) {
                throw new NoSuchElementException();
            }
            this.H = false;
        }
        else {
            this.I = this.J + i;
        }
        return i;
    }
    
    public final long c() {
        return this.J;
    }
    
    @Override
    public boolean hasNext() {
        return this.H;
    }
}
