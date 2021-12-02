// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.concurrent.TimeUnit;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003H\u0001\u001a(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003H\u0001\u001a(\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003H\u0001*\u001e\b\u0007\u0010\u000e\"\u00020\u00022\u00020\u0002B\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\fB\u0002\b\r¨\u0006\u000f" }, d2 = { "", "value", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "sourceUnit", "targetUnit", "b", "", "d", "c", "Lkotlin/e1;", "version", "1.3", "Lkotlin/time/j;", "DurationUnit", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/time/DurationUnitKt")
class h
{
    public h() {
    }
    
    @e1(version = "1.3")
    @j
    public static final double b(final double n, @e final TimeUnit sourceUnit, @e final TimeUnit sourceUnit2) {
        k0.p((Object)sourceUnit, "sourceUnit");
        k0.p((Object)sourceUnit2, "targetUnit");
        final long convert = sourceUnit2.convert(1L, sourceUnit);
        if (convert > 0L) {
            return n * convert;
        }
        return n / sourceUnit.convert(1L, sourceUnit2);
    }
    
    @e1(version = "1.5")
    @j
    public static final long c(final long sourceDuration, @e final TimeUnit sourceUnit, @e final TimeUnit timeUnit) {
        k0.p((Object)sourceUnit, "sourceUnit");
        k0.p((Object)timeUnit, "targetUnit");
        return timeUnit.convert(sourceDuration, sourceUnit);
    }
    
    @e1(version = "1.5")
    @j
    public static final long d(final long sourceDuration, @e final TimeUnit sourceUnit, @e final TimeUnit timeUnit) {
        k0.p((Object)sourceUnit, "sourceUnit");
        k0.p((Object)timeUnit, "targetUnit");
        return timeUnit.convert(sourceDuration, sourceUnit);
    }
}
