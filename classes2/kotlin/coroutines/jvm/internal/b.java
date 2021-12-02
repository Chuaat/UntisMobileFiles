// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.jvm.internal;

import org.jetbrains.annotations.e;
import kotlin.y0;
import kotlin.e1;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0004H\u0001\u001a\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0007H\u0001\u001a\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\nH\u0001\u001a\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\rH\u0001\u001a\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0010H\u0001\u001a\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u0013H\u0001\u001a\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u0016H\u0001¨\u0006\u0019" }, d2 = { "", "primitive", "Ljava/lang/Boolean;", "a", "", "Ljava/lang/Byte;", "b", "", "Ljava/lang/Short;", "h", "", "Ljava/lang/Integer;", "f", "", "Ljava/lang/Long;", "g", "", "Ljava/lang/Float;", "e", "", "Ljava/lang/Double;", "d", "", "Ljava/lang/Character;", "c", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "Boxing")
public final class b
{
    @e1(version = "1.3")
    @y0
    @e
    public static final Boolean a(final boolean b) {
        return b;
    }
    
    @e1(version = "1.3")
    @y0
    @e
    public static final Byte b(final byte b) {
        return b;
    }
    
    @e1(version = "1.3")
    @y0
    @e
    public static final Character c(final char value) {
        return new Character(value);
    }
    
    @e1(version = "1.3")
    @y0
    @e
    public static final Double d(final double value) {
        return new Double(value);
    }
    
    @e1(version = "1.3")
    @y0
    @e
    public static final Float e(final float value) {
        return new Float(value);
    }
    
    @e1(version = "1.3")
    @y0
    @e
    public static final Integer f(final int value) {
        return new Integer(value);
    }
    
    @e1(version = "1.3")
    @y0
    @e
    public static final Long g(final long value) {
        return new Long(value);
    }
    
    @e1(version = "1.3")
    @y0
    @e
    public static final Short h(final short value) {
        return new Short(value);
    }
}
