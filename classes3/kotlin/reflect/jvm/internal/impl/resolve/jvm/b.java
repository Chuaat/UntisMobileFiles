// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;
import java.util.List;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h;
import kotlin.reflect.jvm.internal.impl.incremental.components.d;
import kotlin.reflect.jvm.internal.impl.load.java.structure.c0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.components.g;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.f;

public final class b
{
    @e
    private final f a;
    @e
    private final g b;
    
    public b(@e final f a, @e final g b) {
        k0.p((Object)a, "packageFragmentProvider");
        k0.p((Object)b, "javaResolverCache");
        this.a = a;
        this.b = b;
    }
    
    @e
    public final f a() {
        return this.a;
    }
    
    @org.jetbrains.annotations.f
    public final kotlin.reflect.jvm.internal.impl.descriptors.e b(@e final kotlin.reflect.jvm.internal.impl.load.java.structure.g g) {
        k0.p((Object)g, "javaClass");
        final kotlin.reflect.jvm.internal.impl.name.b f = g.f();
        if (f != null && g.H() == c0.G) {
            return this.b.a(f);
        }
        final kotlin.reflect.jvm.internal.impl.load.java.structure.g e = g.e();
        final kotlin.reflect.jvm.internal.impl.descriptors.e e2 = null;
        final kotlin.reflect.jvm.internal.impl.descriptors.e e3 = null;
        if (e != null) {
            final kotlin.reflect.jvm.internal.impl.descriptors.e b = this.b(e);
            k b2;
            if (b == null) {
                b2 = null;
            }
            else {
                b2 = b.B0();
            }
            Object g2;
            if (b2 == null) {
                g2 = null;
            }
            else {
                g2 = b2.g(g.getName(), d.Y);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e e4 = e2;
            if (g2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                e4 = (kotlin.reflect.jvm.internal.impl.descriptors.e)g2;
            }
            return e4;
        }
        if (f == null) {
            return null;
        }
        final f a = this.a;
        final kotlin.reflect.jvm.internal.impl.name.b e5 = f.e();
        k0.o((Object)e5, "fqName.parent()");
        final h h = (h)v.t2((List)a.a(e5));
        kotlin.reflect.jvm.internal.impl.descriptors.e m0;
        if (h == null) {
            m0 = e3;
        }
        else {
            m0 = h.M0(g);
        }
        return m0;
    }
}
