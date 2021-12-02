// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.jvm.internal.x;
import kotlin.internal.f;
import kotlin.jvm.internal.a0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0010\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\b\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\n\u001a\u00020\t*\u00020\u0000H\u0087\b\u001a\r\u0010\u000b\u001a\u00020\t*\u00020\u0000H\u0087\b\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u000f*\u00020\u0003H\u0087\b\u001a\r\u0010\u0011\u001a\u00020\u000f*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\r\u001a\u00020\u000fH\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u000f*\u00020\u000fH\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u000f*\u00020\u000fH\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u000f*\u00020\u000fH\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u000f*\u00020\u000fH\u0087\b\u001a\r\u0010\u0018\u001a\u00020\u000f*\u00020\u000fH\u0087\b\u001a\u0015\u0010\u001a\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0087\b\u001a\u0015\u0010\u001b\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0087\b\u001a\r\u0010\u001c\u001a\u00020\u000f*\u00020\tH\u0087\b\u001a\r\u0010\u001d\u001a\u00020\u000f*\u00020\tH\u0087\b\u001a\r\u0010\u001e\u001a\u00020\u000f*\u00020\tH\u0087\b\u001a\r\u0010\u001f\u001a\u00020\t*\u00020\tH\u0087\b\u001a\r\u0010 \u001a\u00020\t*\u00020\tH\u0087\b\u001a\u0015\u0010!\u001a\u00020\t*\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000fH\u0087\b\u001a\u0015\u0010\"\u001a\u00020\t*\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000fH\u0087\b¨\u0006#" }, d2 = { "", "", "F0", "", "G0", "D0", "E0", "B0", "C0", "", "Q0", "S0", "Lkotlin/Double$Companion;", "bits", "z0", "", "P0", "R0", "Lkotlin/Float$Companion;", "A0", "v0", "t0", "x0", "L0", "N0", "bitCount", "H0", "J0", "w0", "u0", "y0", "M0", "O0", "I0", "K0", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/NumbersKt")
class n0 extends m0
{
    public n0() {
    }
    
    @e1(version = "1.2")
    @f
    private static final float A0(final a0 a0, final int n) {
        return Float.intBitsToFloat(n);
    }
    
    @f
    private static final boolean B0(final double n) {
        return !Double.isInfinite(n) && !Double.isNaN(n);
    }
    
    @f
    private static final boolean C0(final float n) {
        return !Float.isInfinite(n) && !Float.isNaN(n);
    }
    
    @f
    private static final boolean D0(final double v) {
        return Double.isInfinite(v);
    }
    
    @f
    private static final boolean E0(final float v) {
        return Float.isInfinite(v);
    }
    
    @f
    private static final boolean F0(final double v) {
        return Double.isNaN(v);
    }
    
    @f
    private static final boolean G0(final float v) {
        return Float.isNaN(v);
    }
    
    @e1(version = "1.3")
    @f
    @q
    private static final int H0(final int i, final int distance) {
        return Integer.rotateLeft(i, distance);
    }
    
    @e1(version = "1.3")
    @f
    @q
    private static final long I0(final long i, final int distance) {
        return Long.rotateLeft(i, distance);
    }
    
    @e1(version = "1.3")
    @f
    @q
    private static final int J0(final int i, final int distance) {
        return Integer.rotateRight(i, distance);
    }
    
    @e1(version = "1.3")
    @f
    @q
    private static final long K0(final long i, final int distance) {
        return Long.rotateRight(i, distance);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final int L0(final int i) {
        return Integer.highestOneBit(i);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final long M0(final long i) {
        return Long.highestOneBit(i);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final int N0(final int i) {
        return Integer.lowestOneBit(i);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final long O0(final long i) {
        return Long.lowestOneBit(i);
    }
    
    @e1(version = "1.2")
    @f
    private static final int P0(final float value) {
        return Float.floatToIntBits(value);
    }
    
    @e1(version = "1.2")
    @f
    private static final long Q0(final double value) {
        return Double.doubleToLongBits(value);
    }
    
    @e1(version = "1.2")
    @f
    private static final int R0(final float n) {
        return Float.floatToRawIntBits(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final long S0(final double n) {
        return Double.doubleToRawLongBits(n);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final int t0(final int i) {
        return Integer.numberOfLeadingZeros(i);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final int u0(final long i) {
        return Long.numberOfLeadingZeros(i);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final int v0(final int i) {
        return Integer.bitCount(i);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final int w0(final long i) {
        return Long.bitCount(i);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final int x0(final int i) {
        return Integer.numberOfTrailingZeros(i);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final int y0(final long i) {
        return Long.numberOfTrailingZeros(i);
    }
    
    @e1(version = "1.2")
    @f
    private static final double z0(final x x, final long n) {
        return Double.longBitsToDouble(n);
    }
}
