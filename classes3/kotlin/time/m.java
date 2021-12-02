// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.e;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c1\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t" }, d2 = { "Lkotlin/time/m;", "Lkotlin/time/b;", "Lkotlin/time/p;", "", "c", "", "toString", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
@j
public final class m extends b implements p
{
    @e
    public static final m c;
    
    static {
        c = new m();
    }
    
    private m() {
        super(TimeUnit.NANOSECONDS);
    }
    
    @Override
    protected long c() {
        return System.nanoTime();
    }
    
    @e
    @Override
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
