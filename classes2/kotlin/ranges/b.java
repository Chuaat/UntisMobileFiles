// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.k0;
import kotlin.Metadata;
import kotlin.collections.u;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\bR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015" }, d2 = { "Lkotlin/ranges/b;", "Lkotlin/collections/u;", "", "hasNext", "", "b", "", "J", "I", "c", "()I", "step", "next", "G", "finalElement", "H", "Z", "first", "last", "<init>", "(CCI)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class b extends u
{
    private final int G;
    private boolean H;
    private int I;
    private final int J;
    
    public b(char i, final char g, final int j) {
        this.J = j;
        this.G = g;
        boolean h = true;
        Label_0046: {
            if (j > 0) {
                if (k0.t(i, g) <= 0) {
                    break Label_0046;
                }
            }
            else if (k0.t(i, g) >= 0) {
                break Label_0046;
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
    public char b() {
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
        return (char)i;
    }
    
    public final int c() {
        return this.J;
    }
    
    @Override
    public boolean hasNext() {
        return this.H;
    }
}
