// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import java.util.Map;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;

public interface c
{
    @e
    c0 a();
    
    @e
    Map<kotlin.reflect.jvm.internal.impl.name.e, g<?>> b();
    
    @f
    b f();
    
    @e
    w0 k();
    
    public static final class a
    {
        @f
        public static b a(@e final c c) {
            k0.p(c, "this");
            kotlin.reflect.jvm.internal.impl.descriptors.e f = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.f(c);
            final b b = null;
            b e;
            if (f == null) {
                e = b;
            }
            else {
                if (u.r((m)f)) {
                    f = null;
                }
                if (f == null) {
                    e = b;
                }
                else {
                    e = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.e((m)f);
                }
            }
            return e;
        }
    }
}
