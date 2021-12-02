// 
// Decompiled by Procyon v0.5.36
// 

package h6;

import kotlin.internal.f;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\f\u001a\r\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0006H\u0087\f\u001a\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0006H\u0087\f\u001a\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0006H\u0087\f\u001a\r\u0010\n\u001a\u00020\u0006*\u00020\u0006H\u0087\b¨\u0006\u000b" }, d2 = { "", "other", "a", "e", "g", "c", "", "b", "f", "h", "d", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class a
{
    @e1(version = "1.1")
    @f
    private static final byte a(final byte b, final byte b2) {
        return (byte)(b & b2);
    }
    
    @e1(version = "1.1")
    @f
    private static final short b(final short n, final short n2) {
        return (short)(n & n2);
    }
    
    @e1(version = "1.1")
    @f
    private static final byte c(final byte b) {
        return (byte)~b;
    }
    
    @e1(version = "1.1")
    @f
    private static final short d(final short n) {
        return (short)~n;
    }
    
    @e1(version = "1.1")
    @f
    private static final byte e(final byte b, final byte b2) {
        return (byte)(b | b2);
    }
    
    @e1(version = "1.1")
    @f
    private static final short f(final short n, final short n2) {
        return (short)(n | n2);
    }
    
    @e1(version = "1.1")
    @f
    private static final byte g(final byte b, final byte b2) {
        return (byte)(b ^ b2);
    }
    
    @e1(version = "1.1")
    @f
    private static final short h(final short n, final short n2) {
        return (short)(n ^ n2);
    }
}
