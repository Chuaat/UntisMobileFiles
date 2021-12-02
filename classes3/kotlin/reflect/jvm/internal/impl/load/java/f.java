// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import m6.k;
import kotlin.jvm.internal.m0;
import n6.l;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import org.jetbrains.annotations.e;

public final class f extends c0
{
    @e
    public static final f n;
    
    static {
        n = new f();
    }
    
    private f() {
    }
    
    private final boolean j(final kotlin.reflect.jvm.internal.impl.descriptors.b b) {
        return v.J1((Iterable)c0.a.d(), (Object)t.d((a)b));
    }
    
    @k
    @org.jetbrains.annotations.f
    public static final y k(@e final y y) {
        k0.p((Object)y, "functionDescriptor");
        final f n = f.n;
        final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)y).getName();
        k0.o((Object)name, "functionDescriptor.name");
        if (!n.l(name)) {
            return null;
        }
        return (y)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.d((kotlin.reflect.jvm.internal.impl.descriptors.b)y, false, (l)new l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean>() {
            public final boolean a(@e final kotlin.reflect.jvm.internal.impl.descriptors.b b) {
                k0.p((Object)b, "it");
                return f.this.j(b);
            }
        }, 1, null);
    }
    
    @k
    @org.jetbrains.annotations.f
    public static final b m(@e kotlin.reflect.jvm.internal.impl.descriptors.b d) {
        k0.p((Object)d, "<this>");
        final c0.a a = c0.a;
        if (!a.c().contains(((f0)d).getName())) {
            return null;
        }
        d = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.d(d, false, (l)new l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean>() {
            final /* synthetic */ f G = f.n;
            
            public final boolean a(@e final kotlin.reflect.jvm.internal.impl.descriptors.b b) {
                k0.p((Object)b, "it");
                return b instanceof y && f.this.j(b);
            }
        }, 1, null);
        String d2;
        if (d == null) {
            d2 = null;
        }
        else {
            d2 = t.d((a)d);
        }
        if (d2 == null) {
            return null;
        }
        return a.j(d2);
    }
    
    public final boolean l(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)e, "<this>");
        return c0.a.c().contains(e);
    }
}
