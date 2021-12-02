// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.internal.f;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\b\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\r\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\u0014\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\r\u0010\u000b\u001a\u00020\u0001*\u00020\nH\u0087\b\u001a\r\u0010\f\u001a\u00020\u0001*\u00020\nH\u0087\b\u001a\r\u0010\r\u001a\u00020\u0001*\u00020\nH\u0087\b\u001a\r\u0010\u000e\u001a\u00020\n*\u00020\nH\u0087\b\u001a\r\u0010\u000f\u001a\u00020\n*\u00020\nH\u0087\b\u001a\u0014\u0010\u0010\u001a\u00020\n*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0011\u001a\u00020\n*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¨\u0006\u0012" }, d2 = { "", "", "V0", "T0", "X0", "d1", "f1", "bitCount", "Z0", "b1", "", "W0", "U0", "Y0", "e1", "g1", "a1", "c1", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/NumbersKt")
class o0 extends n0
{
    public o0() {
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final int T0(final byte b) {
        return Integer.numberOfLeadingZeros(b & 0xFF) - 24;
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final int U0(final short n) {
        return Integer.numberOfLeadingZeros(n & 0xFFFF) - 16;
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final int V0(final byte b) {
        return Integer.bitCount(b & 0xFF);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final int W0(final short n) {
        return Integer.bitCount(n & 0xFFFF);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final int X0(final byte b) {
        return Integer.numberOfTrailingZeros(b | 0x100);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final int Y0(final short n) {
        return Integer.numberOfTrailingZeros(n | 0x10000);
    }
    
    @e1(version = "1.3")
    @q
    public static final byte Z0(final byte b, int n) {
        n &= 0x7;
        return (byte)((b & 0xFF) >>> 8 - n | b << n);
    }
    
    @e1(version = "1.3")
    @q
    public static final short a1(final short n, int n2) {
        n2 &= 0xF;
        return (short)((n & 0xFFFF) >>> 16 - n2 | n << n2);
    }
    
    @e1(version = "1.3")
    @q
    public static final byte b1(final byte b, int n) {
        n &= 0x7;
        return (byte)((b & 0xFF) >>> n | b << 8 - n);
    }
    
    @e1(version = "1.3")
    @q
    public static final short c1(final short n, int n2) {
        n2 &= 0xF;
        return (short)((n & 0xFFFF) >>> n2 | n << 16 - n2);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final byte d1(final byte b) {
        return (byte)Integer.highestOneBit(b & 0xFF);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final short e1(final short n) {
        return (short)Integer.highestOneBit(n & 0xFFFF);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final byte f1(final byte i) {
        return (byte)Integer.lowestOneBit(i);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final short g1(final short i) {
        return (short)Integer.lowestOneBit(i);
    }
}
