// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.t0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0006R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014" }, d2 = { "Lkotlin/ranges/j;", "Lkotlin/collections/t0;", "", "hasNext", "", "b", "I", "next", "J", "c", "()I", "step", "G", "finalElement", "H", "Z", "first", "last", "<init>", "(III)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class j extends t0
{
    private final int G;
    private boolean H;
    private int I;
    private final int J;
    
    public j(int i, final int g, final int j) {
        this.J = j;
        this.G = g;
        boolean h = true;
        Label_0040: {
            if (j > 0) {
                if (i <= g) {
                    break Label_0040;
                }
            }
            else if (i >= g) {
                break Label_0040;
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
    public int b() {
        final int i = this.I;
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
    
    public final int c() {
        return this.J;
    }
    
    @Override
    public boolean hasNext() {
        return this.H;
    }
}
