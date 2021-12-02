// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.w;
import kotlin.y1;
import kotlin.m2;
import kotlin.e1;
import kotlin.Metadata;
import kotlin.collections.w1;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0011\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0015\u0010\u0005\u001a\u00020\u0004H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\n\u0004\b\n\u0010\nR\u001c\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\n\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014" }, d2 = { "Lkotlin/ranges/v;", "Lkotlin/collections/w1;", "", "hasNext", "Lkotlin/y1;", "b", "()J", "H", "Z", "I", "J", "step", "next", "G", "finalElement", "first", "last", "", "<init>", "(JJJLkotlin/jvm/internal/w;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
final class v extends w1
{
    private final long G;
    private boolean H;
    private final long I;
    private long J;
    
    private v(long j, final long g, final long n) {
        this.G = g;
        boolean h = true;
        final int g2 = m2.g(j, g);
        Label_0045: {
            if (n > 0L) {
                if (g2 <= 0) {
                    break Label_0045;
                }
            }
            else if (g2 >= 0) {
                break Label_0045;
            }
            h = false;
        }
        this.H = h;
        this.I = y1.k(n);
        if (!this.H) {
            j = g;
        }
        this.J = j;
    }
    
    @Override
    public long b() {
        final long j = this.J;
        if (j == this.G) {
            if (!this.H) {
                throw new NoSuchElementException();
            }
            this.H = false;
        }
        else {
            this.J = y1.k(this.I + j);
        }
        return j;
    }
    
    @Override
    public boolean hasNext() {
        return this.H;
    }
}
