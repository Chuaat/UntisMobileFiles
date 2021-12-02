// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.e1;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002R\u001c\u0010\r\u001a\u00020\b8\u0006@\u0007X\u0087T¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\u00020\u00028\u0006@\u0007X\u0087T¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\fR\u001c\u0010\u0014\u001a\u00020\u00028\u0006@\u0007X\u0087T¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u0012\u0004\b\u0013\u0010\fR\u001c\u0010\u0016\u001a\u00020\u00028\u0006@\u0007X\u0087T¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u0012\u0004\b\u0015\u0010\fR\u001c\u0010\u0018\u001a\u00020\u00028\u0006@\u0007X\u0087T¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u0012\u0004\b\u0017\u0010\fR\u001c\u0010\u001a\u001a\u00020\b8\u0006@\u0007X\u0087T¢\u0006\f\n\u0004\b\u0007\u0010\n\u0012\u0004\b\u0019\u0010\fR\u001c\u0010\u001c\u001a\u00020\u00028\u0006@\u0007X\u0087T¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u0012\u0004\b\u001b\u0010\f¨\u0006\u001e" }, d2 = { "Lkotlin/jvm/internal/a0;", "", "", "c", "a", "i", "e", "g", "", "f", "I", "getSIZE_BYTES$annotations", "()V", "SIZE_BYTES", "d", "F", "getNEGATIVE_INFINITY$annotations", "NEGATIVE_INFINITY", "b", "getMAX_VALUE$annotations", "MAX_VALUE", "getMIN_VALUE$annotations", "MIN_VALUE", "getNaN$annotations", "NaN", "getSIZE_BITS$annotations", "SIZE_BITS", "getPOSITIVE_INFINITY$annotations", "POSITIVE_INFINITY", "<init>", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class a0
{
    public static final float a = Float.MIN_VALUE;
    public static final float b = Float.MAX_VALUE;
    public static final float c = Float.POSITIVE_INFINITY;
    public static final float d = Float.NEGATIVE_INFINITY;
    public static final float e = Float.NaN;
    public static final int f = 4;
    public static final int g = 32;
    @e
    public static final a0 h;
    
    static {
        h = new a0();
    }
    
    private a0() {
    }
    
    public final float a() {
        return Float.MAX_VALUE;
    }
    
    public final float c() {
        return Float.MIN_VALUE;
    }
    
    public final float e() {
        return Float.NEGATIVE_INFINITY;
    }
    
    public final float g() {
        return Float.NaN;
    }
    
    public final float i() {
        return Float.POSITIVE_INFINITY;
    }
}
