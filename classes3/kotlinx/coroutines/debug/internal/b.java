// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.debug.internal;

import kotlinx.coroutines.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002\u001a\b\u0010\u0004\u001a\u00020\u0003H\u0002\"\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0016\u0010\n\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\t\"\u0016\u0010\u000b\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\t\"\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007\"\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012" }, d2 = { "", "Lkotlinx/coroutines/debug/internal/j;", "d", "", "e", "", "a", "I", "MAGIC", "Lkotlinx/coroutines/debug/internal/j;", "MARKED_NULL", "MARKED_TRUE", "b", "MIN_CAPACITY", "Lkotlinx/coroutines/internal/k0;", "c", "Lkotlinx/coroutines/internal/k0;", "REHASH", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class b
{
    private static final int a = -1640531527;
    private static final int b = 16;
    private static final k0 c;
    private static final j d;
    private static final j e;
    
    static {
        c = new k0("REHASH");
        d = new j(null);
        e = new j(Boolean.TRUE);
    }
    
    private static final j d(final Object o) {
        j j;
        if (o == null) {
            j = kotlinx.coroutines.debug.internal.b.d;
        }
        else if (kotlin.jvm.internal.k0.g(o, (Object)Boolean.TRUE)) {
            j = kotlinx.coroutines.debug.internal.b.e;
        }
        else {
            j = new j(o);
        }
        return j;
    }
    
    private static final Void e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
