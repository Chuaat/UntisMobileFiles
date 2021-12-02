// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.collections.v;
import java.util.List;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;
import java.lang.reflect.AnnotatedElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.d;

public interface f extends d
{
    @org.jetbrains.annotations.f
    AnnotatedElement u();
    
    public static final class a
    {
        @org.jetbrains.annotations.f
        public static c a(@e final f f, @e final b b) {
            k0.p((Object)f, "this");
            k0.p((Object)b, "fqName");
            final AnnotatedElement u = f.u();
            c a = null;
            if (u != null) {
                final Annotation[] declaredAnnotations = u.getDeclaredAnnotations();
                if (declaredAnnotations != null) {
                    a = g.a(declaredAnnotations, b);
                }
            }
            return a;
        }
        
        @e
        public static List<c> b(@e final f f) {
            k0.p((Object)f, "this");
            final AnnotatedElement u = f.u();
            Annotation[] declaredAnnotations;
            if (u == null) {
                declaredAnnotations = null;
            }
            else {
                declaredAnnotations = u.getDeclaredAnnotations();
            }
            List<c> list;
            if (declaredAnnotations == null) {
                list = (List<c>)v.E();
            }
            else {
                list = g.b(declaredAnnotations);
            }
            return list;
        }
        
        public static boolean c(@e final f f) {
            k0.p((Object)f, "this");
            return false;
        }
    }
}
