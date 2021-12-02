// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.h0;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class h1
{
    @f
    public static final c0 a(@e c0 m) {
        k0.p((Object)m, "<this>");
        if (m instanceof g1) {
            m = ((g1)m).M();
        }
        else {
            m = null;
        }
        return m;
    }
    
    @e
    public static final j1 b(@e final j1 j1, @e final c0 c0) {
        k0.p((Object)j1, "<this>");
        k0.p((Object)c0, "origin");
        return d(j1, a(c0));
    }
    
    @e
    public static final c0 c(@e c0 c0) {
        k0.p((Object)c0, "<this>");
        final c0 a = a(c0);
        if (a != null) {
            c0 = a;
        }
        return c0;
    }
    
    @e
    public static final j1 d(@e final j1 j1, @f final c0 c0) {
        k0.p((Object)j1, "<this>");
        if (c0 == null) {
            return j1;
        }
        g1 g1;
        if (j1 instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
            g1 = new m0((kotlin.reflect.jvm.internal.impl.types.k0)j1, c0);
        }
        else {
            if (!(j1 instanceof w)) {
                throw new h0();
            }
            g1 = new y((w)j1, c0);
        }
        return (j1)g1;
    }
}
