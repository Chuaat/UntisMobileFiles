// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.descriptors.java.a$a;
import kotlin.reflect.jvm.internal.impl.descriptors.java.a$b;
import kotlin.reflect.jvm.internal.impl.descriptors.java.a$c;
import kotlin.reflect.jvm.internal.impl.descriptors.i1$e;
import kotlin.reflect.jvm.internal.impl.descriptors.i1$h;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.s;

public interface t extends s
{
    int D();
    
    public static final class a
    {
        @e
        public static j1 a(@e final t t) {
            k0.p((Object)t, "this");
            final int d = t.D();
            Object o;
            if (Modifier.isPublic(d)) {
                o = i1$h.c;
            }
            else if (Modifier.isPrivate(d)) {
                o = i1$e.c;
            }
            else if (Modifier.isProtected(d)) {
                if (Modifier.isStatic(d)) {
                    o = a$c.c;
                }
                else {
                    o = a$b.c;
                }
            }
            else {
                o = a$a.c;
            }
            return (j1)o;
        }
        
        public static boolean b(@e final t t) {
            k0.p((Object)t, "this");
            return Modifier.isAbstract(t.D());
        }
        
        public static boolean c(@e final t t) {
            k0.p((Object)t, "this");
            return Modifier.isFinal(t.D());
        }
        
        public static boolean d(@e final t t) {
            k0.p((Object)t, "this");
            return Modifier.isStatic(t.D());
        }
    }
}
