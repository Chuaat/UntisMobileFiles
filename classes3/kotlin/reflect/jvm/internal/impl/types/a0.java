// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.jvm.internal.w;
import java.util.Objects;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.jetbrains.annotations.e;

public final class a0 extends b1
{
    @e
    private final kotlin.reflect.jvm.internal.impl.descriptors.b1[] c;
    @e
    private final y0[] d;
    private final boolean e;
    
    public a0(@e final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.b1> list, @e final List<? extends y0> list2) {
        k0.p((Object)list, "parameters");
        k0.p((Object)list2, "argumentsList");
        final Object[] array = list.toArray((Object[])new kotlin.reflect.jvm.internal.impl.descriptors.b1[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        final kotlin.reflect.jvm.internal.impl.descriptors.b1[] array2 = (kotlin.reflect.jvm.internal.impl.descriptors.b1[])array;
        final Object[] array3 = list2.toArray((Object[])new y0[0]);
        Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
        this(array2, (y0[])array3, false, 4, null);
    }
    
    public a0(@e final kotlin.reflect.jvm.internal.impl.descriptors.b1[] c, @e final y0[] d, final boolean e) {
        k0.p((Object)c, "parameters");
        k0.p((Object)d, "arguments");
        this.c = c;
        this.d = d;
        this.e = e;
        final int length = c.length;
        final int length2 = d.length;
    }
    
    @Override
    public boolean b() {
        return this.e;
    }
    
    @f
    @Override
    public y0 e(@e final c0 c0) {
        k0.p((Object)c0, "key");
        final h c2 = c0.N0().c();
        kotlin.reflect.jvm.internal.impl.descriptors.b1 b1;
        if (c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b1) {
            b1 = (kotlin.reflect.jvm.internal.impl.descriptors.b1)c2;
        }
        else {
            b1 = null;
        }
        if (b1 == null) {
            return null;
        }
        final int i = b1.i();
        final kotlin.reflect.jvm.internal.impl.descriptors.b1[] c3 = this.c;
        if (i < c3.length && k0.g((Object)c3[i].l(), (Object)b1.l())) {
            return this.d[i];
        }
        return null;
    }
    
    @Override
    public boolean f() {
        return this.d.length == 0;
    }
    
    @e
    public final y0[] h() {
        return this.d;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.descriptors.b1[] i() {
        return this.c;
    }
}
