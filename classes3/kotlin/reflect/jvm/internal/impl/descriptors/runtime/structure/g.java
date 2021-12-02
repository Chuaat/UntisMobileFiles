// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.f;
import m6.a;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;
import java.lang.annotation.Annotation;

public final class g
{
    @f
    public static final c a(@e final Annotation[] array, @e final b b) {
        k0.p((Object)array, "<this>");
        k0.p((Object)b, "fqName");
        final int length = array.length;
        int n = 0;
        c c;
        Annotation annotation;
        while (true) {
            c = null;
            if (n >= length) {
                annotation = null;
                break;
            }
            final Annotation annotation2 = array[n];
            if (k0.g((Object)b.b(a.c(a.a(annotation2))).b(), (Object)b)) {
                annotation = annotation2;
                break;
            }
            ++n;
        }
        c c2;
        if (annotation == null) {
            c2 = c;
        }
        else {
            c2 = new c(annotation);
        }
        return c2;
    }
    
    @e
    public static final List<c> b(@e final Annotation[] array) {
        k0.p((Object)array, "<this>");
        final ArrayList<c> list = new ArrayList<c>(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(new c(array[i]));
        }
        return list;
    }
}
