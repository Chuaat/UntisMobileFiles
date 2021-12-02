// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.model.k;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.c;
import kotlin.reflect.jvm.internal.impl.types.model.p;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.model.i;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.model.o;
import kotlin.reflect.jvm.internal.impl.types.model.r;

public interface e1 extends r
{
    boolean L(@e final o p0);
    
    @f
    i M(@e final i p0);
    
    @f
    PrimitiveType R(@e final o p0);
    
    boolean U(@e final i p0, @e final b p1);
    
    boolean g(@e final o p0);
    
    @e
    i g0(@e final i p0);
    
    @f
    PrimitiveType j(@e final o p0);
    
    @e
    i k(@e final p p0);
    
    @f
    p u(@e final o p0);
    
    @f
    c x(@e final o p0);
    
    public static final class a
    {
        @e
        public static i a(@e final e1 e1, @e i c) {
            k0.p((Object)e1, "this");
            k0.p((Object)c, "receiver");
            final k a = e1.a(c);
            if (a != null) {
                c = e1.c(a, true);
            }
            return c;
        }
    }
}
