// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.jvm.internal.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u001b\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\u00020\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007j\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015" }, d2 = { "Lkotlin/text/q;", "", "Lkotlin/text/i;", "", "G", "I", "getValue", "()I", "value", "H", "b", "mask", "<init>", "(Ljava/lang/String;III)V", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public enum q implements i
{
    I(2, 0, 2, (w)null), 
    J(8, 0, 2, (w)null), 
    K(16, 0, 2, (w)null), 
    L(1, 0, 2, (w)null), 
    M(4, 0, 2, (w)null), 
    N(32, 0, 2, (w)null), 
    O(128, 0, 2, (w)null);
    
    private final int G;
    private final int H;
    
    private q(final int g, final int h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public int b() {
        return this.H;
    }
    
    @Override
    public int getValue() {
        return this.G;
    }
}
