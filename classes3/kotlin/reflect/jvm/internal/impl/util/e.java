// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes$Companion;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.y;

final class e implements b
{
    @org.jetbrains.annotations.e
    public static final e a;
    @org.jetbrains.annotations.e
    private static final String b;
    
    static {
        a = new e();
        b = "second parameter must be of type KProperty<*> or its supertype";
    }
    
    private e() {
    }
    
    @f
    @Override
    public String a(@org.jetbrains.annotations.e final y y) {
        return kotlin.reflect.jvm.internal.impl.util.b.a.a(this, y);
    }
    
    @Override
    public boolean b(@org.jetbrains.annotations.e final y y) {
        k0.p((Object)y, "functionDescriptor");
        final e1 e1 = ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).m().get(1);
        final ReflectionTypes$Companion companion = ReflectionTypes.Companion;
        k0.o((Object)e1, "secondParameter");
        final c0 kPropertyStarType = companion.createKPropertyStarType(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.l((m)e1));
        boolean g;
        if (kPropertyStarType == null) {
            g = false;
        }
        else {
            final c0 a = ((d1)e1).a();
            k0.o((Object)a, "secondParameter.type");
            g = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.g(kPropertyStarType, kotlin.reflect.jvm.internal.impl.types.typeUtil.a.j(a));
        }
        return g;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String getDescription() {
        return e.b;
    }
}
