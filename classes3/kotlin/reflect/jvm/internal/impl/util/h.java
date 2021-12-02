// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import java.util.Collection;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import org.jetbrains.annotations.e;

final class h implements b
{
    @e
    public static final h a;
    @e
    private static final String b;
    
    static {
        a = new h();
        b = "should not have varargs or parameters with default values";
    }
    
    private h() {
    }
    
    @f
    @Override
    public String a(@e final y y) {
        return kotlin.reflect.jvm.internal.impl.util.b.a.a(this, y);
    }
    
    @Override
    public boolean b(@e final y y) {
        k0.p((Object)y, "functionDescriptor");
        final List m = ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).m();
        k0.o((Object)m, "functionDescriptor.valueParameters");
        final boolean b = m instanceof Collection;
        boolean b2 = false;
        if (!b || !m.isEmpty()) {
            for (final e1 e1 : m) {
                k0.o((Object)e1, "it");
                if (kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.a(e1) || e1.p0() != null) {
                    return b2;
                }
            }
        }
        b2 = true;
        return b2;
    }
    
    @e
    @Override
    public String getDescription() {
        return h.b;
    }
}
