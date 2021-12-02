// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.collections.y0;
import kotlin.n1;
import kotlin.jvm.internal.m0;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.o;

public final class h extends b
{
    static final /* synthetic */ o<Object>[] h;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.i g;
    
    static {
        h = new o[] { (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;")) };
    }
    
    public h(@e final a a, @e final g g) {
        k0.p((Object)a, "annotation");
        k0.p((Object)g, "c");
        super(g, a, StandardNames$FqNames.retention);
        this.g = g.e().g((n6.a<?>)new n6.a<Map<kotlin.reflect.jvm.internal.impl.name.e, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>>() {
            final /* synthetic */ h G;
            
            @e
            public final Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
                final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> a = kotlin.reflect.jvm.internal.impl.load.java.components.d.a.a(this.G.c());
                Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map;
                if (a == null) {
                    map = null;
                }
                else {
                    map = (Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>)y0.k(n1.a((Object)kotlin.reflect.jvm.internal.impl.load.java.components.c.a.c(), (Object)a));
                }
                if (map == null) {
                    map = (Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>)y0.z();
                }
                return map;
            }
        });
    }
    
    @e
    @Override
    public Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b() {
        return m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>>)this.g, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.load.java.components.h.h[0]);
    }
}
