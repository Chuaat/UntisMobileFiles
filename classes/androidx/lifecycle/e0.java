// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import o7.b;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\b¨\u0006\u0007" }, d2 = { "T", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/y;", "lifecycle", "Lo7/b;", "b", "a", "lifecycle-reactivestreams-ktx_release" }, k = 2, mv = { 1, 4, 1 })
public final class e0
{
    @e
    public static final <T> LiveData<T> a(@e final b<T> b) {
        k0.p((Object)b, "$this$toLiveData");
        final LiveData<T> a = f0.a(b);
        k0.o((Object)a, "LiveDataReactiveStreams.fromPublisher(this)");
        return a;
    }
    
    @e
    public static final <T> b<T> b(@e final LiveData<T> liveData, @e final y y) {
        k0.p((Object)liveData, "$this$toPublisher");
        k0.p((Object)y, "lifecycle");
        final o7.b<T> b = f0.b(y, liveData);
        k0.o((Object)b, "LiveDataReactiveStreams.\u2026ublisher(lifecycle, this)");
        return b;
    }
}
