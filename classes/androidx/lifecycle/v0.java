// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import g.a;
import n6.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a>\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\b\u00f8\u0001\u0000\u001aD\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0003H\u0086\b\u00f8\u0001\u0000\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b" }, d2 = { "X", "Y", "Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "transform", "b", "c", "a", "lifecycle-livedata-ktx_release" }, k = 2, mv = { 1, 4, 1 })
public final class v0
{
    @e
    public static final <X> LiveData<X> a(@e final LiveData<X> liveData) {
        k0.p((Object)liveData, "$this$distinctUntilChanged");
        final LiveData<X> a = u0.a(liveData);
        k0.o((Object)a, "Transformations.distinctUntilChanged(this)");
        return a;
    }
    
    @e
    public static final <X, Y> LiveData<Y> b(@e final LiveData<X> liveData, @e final l<? super X, ? extends Y> l) {
        k0.p((Object)liveData, "$this$map");
        k0.p((Object)l, "transform");
        final LiveData<Y> b = u0.b(liveData, new a<Object, Object>() {
            @Override
            public final Y apply(final X x) {
                return (Y)l.invoke((Object)x);
            }
        });
        k0.o((Object)b, "Transformations.map(this) { transform(it) }");
        return b;
    }
    
    @e
    public static final <X, Y> LiveData<Y> c(@e final LiveData<X> liveData, @e final l<? super X, ? extends LiveData<Y>> l) {
        k0.p((Object)liveData, "$this$switchMap");
        k0.p((Object)l, "transform");
        final LiveData<Y> c = u0.c(liveData, (a<X, LiveData<Y>>)new a<Object, Object>() {
            public final LiveData<Y> a(final X x) {
                return (LiveData<Y>)l.invoke((Object)x);
            }
        });
        k0.o((Object)c, "Transformations.switchMap(this) { transform(it) }");
        return c;
    }
}
