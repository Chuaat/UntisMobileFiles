// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.pcollections.b;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001a\b\u0010\u0007\u001a\u00020\u0006H\u0000\"2\u0010\f\u001a\u001e\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00000\u00000\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\r" }, d2 = { "", "T", "Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/h;", "b", "Lkotlin/j2;", "a", "Lkotlin/reflect/jvm/internal/pcollections/b;", "", "kotlin.jvm.PlatformType", "Lkotlin/reflect/jvm/internal/pcollections/b;", "K_CLASS_CACHE", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
public final class g
{
    private static b<String, Object> a;
    
    static {
        final b c = b.c();
        k0.o(c, "HashPMap.empty<String, Any>()");
        g.a = (b<String, Object>)c;
    }
    
    public static final void a() {
        final b c = b.c();
        k0.o(c, "HashPMap.empty()");
        g.a = (b<String, Object>)c;
    }
    
    @e
    public static final <T> h<T> b(@e final Class<T> clazz) {
        k0.p(clazz, "jClass");
        final String name = clazz.getName();
        final Object d = g.a.d((Object)name);
        final boolean b = d instanceof WeakReference;
        Object m = null;
        while (true) {
            Label_0211: {
                h<T> h3;
                b a;
                String s;
                if (b) {
                    final h<T> h = ((WeakReference<h>)d).get();
                    if (h != null) {
                        m = h.m();
                    }
                    if (k0.g(m, clazz)) {
                        return h;
                    }
                    break Label_0211;
                }
                else {
                    if (d == null) {
                        break Label_0211;
                    }
                    final WeakReference[] array = (WeakReference[])d;
                    for (int length = array.length, i = 0; i < length; ++i) {
                        final h h2 = (h)array[i].get();
                        Class<T> j;
                        if (h2 != null) {
                            j = h2.m();
                        }
                        else {
                            j = null;
                        }
                        if (k0.g(j, clazz)) {
                            return (h<T>)h2;
                        }
                    }
                    final int length2 = ((Object[])d).length;
                    final WeakReference[] array2 = new WeakReference[length2 + 1];
                    System.arraycopy(d, 0, array2, 0, length2);
                    h3 = new h<T>(clazz);
                    array2[length2] = new WeakReference(h3);
                    a = g.a.h((Object)name, (Object)array2);
                    s = "K_CLASS_CACHE.plus(name, newArray)";
                }
                k0.o(a, s);
                g.a = (b<String, Object>)a;
                return h3;
            }
            h<T> h3 = new h<T>(clazz);
            b a = g.a.h((Object)name, (Object)new WeakReference(h3));
            String s = "K_CLASS_CACHE.plus(name, WeakReference(newKClass))";
            continue;
        }
    }
}
