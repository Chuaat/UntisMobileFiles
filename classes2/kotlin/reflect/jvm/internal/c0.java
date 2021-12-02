// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\u001a\b\u0010\u0004\u001a\u00020\u0003H\u0000\"(\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\b¨\u0006\n" }, d2 = { "Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/k;", "b", "Lkotlin/j2;", "a", "Ljava/util/concurrent/ConcurrentMap;", "Lkotlin/reflect/jvm/internal/l0;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
public final class c0
{
    private static final ConcurrentMap<l0, WeakReference<k>> a;
    
    static {
        a = new ConcurrentHashMap<l0, WeakReference<k>>();
    }
    
    public static final void a() {
        c0.a.clear();
    }
    
    @e
    public static final k b(@e Class<?> l0) {
        k0.p(l0, "$this$getOrCreateModule");
        final ClassLoader g = b.g((Class)l0);
        l0 = new l0(g);
        final ConcurrentMap<l0, WeakReference<k>> a = c0.a;
        final WeakReference<k> weakReference = a.get(l0);
        if (weakReference != null) {
            final k k = weakReference.get();
            if (k != null) {
                k0.o(k, "it");
                return k;
            }
            a.remove(l0, weakReference);
        }
        final k a2 = k.c.a(g);
        try {
            while (true) {
                final ConcurrentMap<l0, WeakReference<k>> a3 = c0.a;
                final WeakReference<k> weakReference2 = a3.putIfAbsent(l0, new WeakReference<k>(a2));
                if (weakReference2 == null) {
                    return a2;
                }
                final k i = weakReference2.get();
                if (i != null) {
                    return i;
                }
                a3.remove(l0, weakReference2);
            }
        }
        finally {
            l0.a(null);
        }
    }
}
