// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import java.util.List;
import java.util.Iterator;
import kotlin.sequences.p;
import java.util.ServiceLoader;
import org.jetbrains.annotations.e;
import m6.d;
import kotlinx.coroutines.w2;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f" }, d2 = { "Lkotlinx/coroutines/internal/y;", "", "Lkotlinx/coroutines/w2;", "a", "", "Z", "FAST_SERVICE_LOADER_ENABLED", "b", "Lkotlinx/coroutines/w2;", "dispatcher", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class y
{
    private static final boolean a;
    @d
    @e
    public static final w2 b;
    @e
    public static final y c;
    
    static {
        final y y = c = new y();
        a = m0.e("kotlinx.coroutines.fast.service.loader", true);
        b = y.a();
    }
    
    private y() {
    }
    
    private final w2 a() {
        a0 b = null;
        try {
            Object o;
            if (y.a) {
                o = m.b.d();
            }
            else {
                o = p.V2(p.h((Iterator<?>)ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            }
            final Iterator<MainDispatcherFactory> iterator = ((Iterable<MainDispatcherFactory>)o).iterator();
            MainDispatcherFactory next;
            if (!iterator.hasNext()) {
                next = null;
            }
            else {
                next = iterator.next();
                if (iterator.hasNext()) {
                    int loadPriority = next.getLoadPriority();
                    MainDispatcherFactory mainDispatcherFactory = next;
                    do {
                        final MainDispatcherFactory next2 = iterator.next();
                        final int loadPriority2 = next2.getLoadPriority();
                        next = mainDispatcherFactory;
                        int n;
                        if ((n = loadPriority) < loadPriority2) {
                            next = next2;
                            n = loadPriority2;
                        }
                        mainDispatcherFactory = next;
                        loadPriority = n;
                    } while (iterator.hasNext());
                }
            }
            final MainDispatcherFactory mainDispatcherFactory2 = next;
            if (mainDispatcherFactory2 == null || z.f(mainDispatcherFactory2, (List<? extends MainDispatcherFactory>)o) == null) {
                z.b(null, null, 3, null);
            }
        }
        finally {
            final Throwable t;
            b = z.b(t, null, 2, null);
        }
        return b;
    }
}
