// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.f;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;

public interface d0 extends d
{
    public static final class a
    {
        @f
        public static kotlin.reflect.jvm.internal.impl.load.java.structure.a a(@e final d0 d0, @e final b b) {
            k0.p((Object)d0, "this");
            k0.p((Object)b, "fqName");
            final Iterator<Object> iterator = d0.getAnnotations().iterator();
            Object b2;
            kotlin.reflect.jvm.internal.impl.load.java.structure.a next;
            do {
                final boolean hasNext = iterator.hasNext();
                final kotlin.reflect.jvm.internal.impl.load.java.structure.a a = null;
                final Object o = null;
                if (!hasNext) {
                    return a;
                }
                next = iterator.next();
                final kotlin.reflect.jvm.internal.impl.name.a c = next.c();
                if (c == null) {
                    b2 = o;
                }
                else {
                    b2 = c.b();
                }
            } while (!k0.g(b2, (Object)b));
            return next;
        }
    }
}
