// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.internal.f;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\u001a\u0011\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\"!\u0010\u0001\u001a\u00020\u0000*\u00020\u00028\u00c6\u0002@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b" }, d2 = { "", "code", "", "a", "c", "(C)I", "getCode$annotations", "(C)V", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class d
{
    @e1(version = "1.5")
    @f
    @o2(markerClass = { q.class })
    private static final char a(final int i) {
        if (i >= c('\0') && i <= c('\uffff')) {
            return (char)i;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid Char code: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static final int c(final char c) {
        return c;
    }
}
