// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.e1;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\b\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087T¢\u0006\f\n\u0004\b\u0003\u0010\b\u0012\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\u00020\u00028\u0006@\u0007X\u0087T¢\u0006\f\n\u0004\b\f\u0010\b\u0012\u0004\b\r\u0010\nR\u001c\u0010\u0010\u001a\u00020\u00028\u0006@\u0007X\u0087T¢\u0006\f\n\u0004\b\u0006\u0010\b\u0012\u0004\b\u000f\u0010\nR\u001c\u0010\u0012\u001a\u00020\u00028\u0006@\u0007X\u0087T¢\u0006\f\n\u0004\b\u0004\u0010\b\u0012\u0004\b\u0011\u0010\nR\u001c\u0010\u0015\u001a\u00020\u00028\u0006@\u0007X\u0087T¢\u0006\f\n\u0004\b\u0013\u0010\b\u0012\u0004\b\u0014\u0010\nR\u001c\u0010\u0019\u001a\u00020\u00168\u0006@\u0007X\u0087T¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u0012\u0004\b\u0018\u0010\nR\u001c\u0010\u001c\u001a\u00020\u00168\u0006@\u0007X\u0087T¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u0012\u0004\b\u001b\u0010\n¨\u0006\u001e" }, d2 = { "Lkotlin/jvm/internal/x;", "", "", "c", "a", "i", "e", "g", "D", "getPOSITIVE_INFINITY$annotations", "()V", "POSITIVE_INFINITY", "d", "getNEGATIVE_INFINITY$annotations", "NEGATIVE_INFINITY", "getNaN$annotations", "NaN", "getMIN_VALUE$annotations", "MIN_VALUE", "b", "getMAX_VALUE$annotations", "MAX_VALUE", "", "I", "getSIZE_BITS$annotations", "SIZE_BITS", "f", "getSIZE_BYTES$annotations", "SIZE_BYTES", "<init>", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class x
{
    public static final double a = Double.MIN_VALUE;
    public static final double b = Double.MAX_VALUE;
    public static final double c = Double.POSITIVE_INFINITY;
    public static final double d = Double.NEGATIVE_INFINITY;
    public static final double e = Double.NaN;
    public static final int f = 8;
    public static final int g = 64;
    @e
    public static final x h;
    
    static {
        h = new x();
    }
    
    private x() {
    }
    
    public final double a() {
        return Double.MAX_VALUE;
    }
    
    public final double c() {
        return Double.MIN_VALUE;
    }
    
    public final double e() {
        return Double.NEGATIVE_INFINITY;
    }
    
    public final double g() {
        return Double.NaN;
    }
    
    public final double i() {
        return Double.POSITIVE_INFINITY;
    }
}
