// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.f2;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.w2;
import kotlin.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\t\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0003H\u0007\u001a \u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u001a\b\u0010\u000e\u001a\u00020\rH\u0000\"\u001c\u0010\u0013\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012\"\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0016" }, d2 = { "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "factories", "Lkotlinx/coroutines/w2;", "f", "", "d", "", "cause", "", "errorHint", "Lkotlinx/coroutines/internal/a0;", "a", "", "e", "b", "Z", "getSUPPORT_MISSING$annotations", "()V", "SUPPORT_MISSING", "Ljava/lang/String;", "FAST_SERVICE_LOADER_PROPERTY_NAME", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class z
{
    private static final String a = "kotlinx.coroutines.fast.service.loader";
    private static final boolean b = true;
    
    private static final a0 a(final Throwable t, final String s) {
        if (z.b) {
            return new a0(t, s);
        }
        if (t != null) {
            throw t;
        }
        e();
        throw new w();
    }
    
    @f2
    public static final boolean d(@e final w2 w2) {
        return w2 instanceof a0;
    }
    
    @e
    public static final Void e() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
    
    @f2
    @e
    public static final w2 f(@e MainDispatcherFactory dispatcher, @e final List<? extends MainDispatcherFactory> list) {
        a0 a = null;
        try {
            dispatcher = (MainDispatcherFactory)dispatcher.createDispatcher(list);
        }
        finally {
            final Throwable t;
            a = a(t, dispatcher.hintOnError());
        }
        return a;
    }
}
