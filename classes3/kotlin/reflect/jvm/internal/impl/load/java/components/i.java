// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.collections.y0;
import kotlin.n1;
import java.util.List;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.load.java.structure.m;
import kotlin.jvm.internal.m0;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.e;
import kotlin.reflect.o;

public final class i extends b
{
    static final /* synthetic */ o<Object>[] h;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.i g;
    
    static {
        h = new o[] { (o)k1.r((e1)new f1((h)k1.d((Class)i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;")) };
    }
    
    public i(@e final a a, @e final g g) {
        k0.p((Object)a, "annotation");
        k0.p((Object)g, "c");
        super(g, a, StandardNames$FqNames.target);
        this.g = g.e().g((n6.a<?>)new n6.a<Map<kotlin.reflect.jvm.internal.impl.name.e, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>>() {
            final /* synthetic */ i G;
            
            @e
            public final Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<Object>> a() {
                final kotlin.reflect.jvm.internal.impl.load.java.structure.b c = this.G.c();
                final boolean b = c instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.e;
                final Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<Object>> map = null;
                kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> c2 = null;
                Label_0078: {
                    d d;
                    List<kotlin.reflect.jvm.internal.impl.load.java.structure.b> list;
                    if (b) {
                        d = kotlin.reflect.jvm.internal.impl.load.java.components.d.a;
                        list = ((kotlin.reflect.jvm.internal.impl.load.java.structure.e)this.G.c()).e();
                    }
                    else {
                        if (!(c instanceof m)) {
                            c2 = null;
                            break Label_0078;
                        }
                        d = kotlin.reflect.jvm.internal.impl.load.java.components.d.a;
                        list = (List<kotlin.reflect.jvm.internal.impl.load.java.structure.b>)v.k((Object)this.G.c());
                    }
                    c2 = d.c(list);
                }
                Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<Object>> map2;
                if (c2 == null) {
                    map2 = map;
                }
                else {
                    map2 = (Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<Object>>)y0.k(n1.a((Object)kotlin.reflect.jvm.internal.impl.load.java.components.c.a.d(), (Object)c2));
                }
                if (map2 == null) {
                    map2 = (Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<Object>>)y0.z();
                }
                return map2;
            }
        });
    }
    
    @e
    @Override
    public Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<Object>> b() {
        return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<Object>>>)this.g, (Object)this, (o<?>)i.h[0]);
    }
}
