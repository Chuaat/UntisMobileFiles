// 
// Decompiled by Procyon v0.5.36
// 

package i6;

import kotlin.collections.m;
import java.util.List;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.internal.k;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u000b" }, d2 = { "Li6/a;", "Lkotlin/internal/k;", "", "cause", "exception", "Lkotlin/j2;", "a", "", "d", "<init>", "()V", "kotlin-stdlib-jdk7" }, k = 1, mv = { 1, 5, 1 })
public class a extends k
{
    @Override
    public void a(@e final Throwable t, @e final Throwable exception) {
        k0.p(t, "cause");
        k0.p(exception, "exception");
        t.addSuppressed(exception);
    }
    
    @e
    @Override
    public List<Throwable> d(@e final Throwable t) {
        k0.p(t, "exception");
        final Throwable[] suppressed = t.getSuppressed();
        k0.o(suppressed, "exception.suppressed");
        return m.t(suppressed);
    }
}
