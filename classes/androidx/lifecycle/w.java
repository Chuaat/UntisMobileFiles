// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import kotlin.coroutines.g;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.p3;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0017\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005" }, d2 = { "Landroidx/lifecycle/s;", "Landroidx/lifecycle/t;", "a", "(Landroidx/lifecycle/s;)Landroidx/lifecycle/t;", "coroutineScope", "lifecycle-runtime-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class w
{
    @e
    public static final t a(@e final s s) {
        k0.q((Object)s, "$this$coroutineScope");
        LifecycleCoroutineScopeImpl newValue;
        do {
            final LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = s.a.get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            newValue = new LifecycleCoroutineScopeImpl(s, ((g)p3.c((k2)null, 1, (Object)null)).plus((g)i1.e().M()));
        } while (!s.a.compareAndSet(null, newValue));
        newValue.m();
        return newValue;
    }
}
