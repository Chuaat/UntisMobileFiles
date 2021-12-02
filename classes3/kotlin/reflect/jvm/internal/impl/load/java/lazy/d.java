// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import kotlin.sequences.m;
import kotlin.sequences.p;
import kotlin.collections.v;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$b;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.m0;
import n6.l;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.reflect.jvm.internal.impl.storage.h;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

public final class d implements g
{
    @e
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g G;
    @e
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.d H;
    private final boolean I;
    @e
    private final h<a, c> J;
    
    public d(@e final kotlin.reflect.jvm.internal.impl.load.java.lazy.g g, @e final kotlin.reflect.jvm.internal.impl.load.java.structure.d h, final boolean i) {
        k0.p((Object)g, "c");
        k0.p((Object)h, "annotationOwner");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = g.a().t().i((n6.l<? super a, ? extends c>)new l<a, c>() {
            final /* synthetic */ d G;
            
            @f
            public final c a(@e final a a) {
                k0.p((Object)a, "annotation");
                return kotlin.reflect.jvm.internal.impl.load.java.components.c.a.e(a, d.f(this.G), d.b(this.G));
            }
        });
    }
    
    public static final /* synthetic */ boolean b(final d d) {
        return d.I;
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.g f(final d d) {
        return d.G;
    }
    
    public boolean B4(@e final b b) {
        return g$b.b((g)this, b);
    }
    
    @f
    public c a0(@e final b b) {
        k0.p((Object)b, "fqName");
        final a a0 = this.H.a0(b);
        c c;
        if (a0 == null) {
            c = null;
        }
        else {
            c = (c)((l)this.J).invoke((Object)a0);
        }
        c a2 = c;
        if (c == null) {
            a2 = kotlin.reflect.jvm.internal.impl.load.java.components.c.a.a(b, this.H, this.G);
        }
        return a2;
    }
    
    public boolean isEmpty() {
        return this.H.getAnnotations().isEmpty() && !this.H.i();
    }
    
    @e
    public Iterator<c> iterator() {
        return p.o0((m<? extends c>)p.g2(p.d1((m<?>)v.n1((Iterable)this.H.getAnnotations()), (n6.l<? super Object, ? extends T>)this.J), (T)kotlin.reflect.jvm.internal.impl.load.java.components.c.a.a(StandardNames$FqNames.deprecated, this.H, this.G))).iterator();
    }
}
