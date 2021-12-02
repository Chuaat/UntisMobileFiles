// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.g0;
import kotlin.i;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a@\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t" }, d2 = { "T", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/y;", "owner", "Lkotlin/Function1;", "Lkotlin/j2;", "onChanged", "Landroidx/lifecycle/l0;", "a", "lifecycle-livedata-core-ktx_release" }, k = 2, mv = { 1, 4, 1 })
public final class d0
{
    @i(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    @g0
    @e
    public static final <T> l0<T> a(@e final LiveData<T> liveData, @e final y y, @e final l<? super T, j2> l) {
        k0.p((Object)liveData, "$this$observe");
        k0.p((Object)y, "owner");
        k0.p((Object)l, "onChanged");
        final l0<T> l2 = new l0<Object>() {
            @Override
            public final void a(final T t) {
                l.invoke((Object)t);
            }
        };
        liveData.j(y, l2);
        return (l0<T>)l2;
    }
}
