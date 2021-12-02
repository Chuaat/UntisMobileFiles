// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import java.util.Iterator;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import java.util.List;
import n6.a;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.o;

public final class l extends i
{
    static final /* synthetic */ o<Object>[] d;
    @org.jetbrains.annotations.e
    private final e b;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.storage.i c;
    
    static {
        d = new o[] { (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)l.class), "functions", "getFunctions()Ljava/util/List;")) };
    }
    
    public l(@org.jetbrains.annotations.e final n n, @org.jetbrains.annotations.e final e b) {
        k0.p((Object)n, "storageManager");
        k0.p((Object)b, "containingClass");
        (this.b = b).n();
        final f i = f.I;
        this.c = n.g((n6.a<?>)new n6.a<List<? extends v0>>() {
            final /* synthetic */ l G;
            
            @org.jetbrains.annotations.e
            public final List<v0> a() {
                return (List<v0>)v.L((Object[])new v0[] { kotlin.reflect.jvm.internal.impl.resolve.c.d(l.i(this.G)), kotlin.reflect.jvm.internal.impl.resolve.c.e(l.i(this.G)) });
            }
        });
    }
    
    public static final /* synthetic */ e i(final l l) {
        return l.b;
    }
    
    private final List<v0> m() {
        return m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends List<v0>>)this.c, (Object)this, (o<?>)l.d[0]);
    }
    
    @org.jetbrains.annotations.f
    public Void j(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return null;
    }
    
    @org.jetbrains.annotations.e
    public List<v0> k(@org.jetbrains.annotations.e final d d, @org.jetbrains.annotations.e final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        k0.p((Object)l, "nameFilter");
        return this.m();
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.utils.i<v0> l(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        final List<v0> m = this.m();
        final kotlin.reflect.jvm.internal.impl.utils.i<v0> i = new kotlin.reflect.jvm.internal.impl.utils.i<v0>();
        for (final v0 next : m) {
            if (k0.g((Object)((f0)next).getName(), (Object)e)) {
                i.add(next);
            }
        }
        return i;
    }
}
