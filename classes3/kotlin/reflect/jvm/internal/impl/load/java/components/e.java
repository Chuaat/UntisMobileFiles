// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.storage.m;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.o;

public final class e extends b
{
    static final /* synthetic */ o<Object>[] h;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.storage.i g;
    
    static {
        h = new o[] { (o)k1.r((e1)new f1((h)k1.d((Class)e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;")) };
    }
    
    public e(@f final a a, @org.jetbrains.annotations.e final g g) {
        k0.p((Object)g, "c");
        super(g, a, StandardNames$FqNames.deprecated);
        this.g = g.e().g((n6.a<?>)e$a.G);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b() {
        return m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>>)this.g, (Object)this, (o<?>)e.h[0]);
    }
}
