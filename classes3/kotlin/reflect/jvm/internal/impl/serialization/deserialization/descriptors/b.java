// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$b;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import java.util.List;
import n6.a;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.o;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

public class b implements g
{
    static final /* synthetic */ o<Object>[] H;
    @e
    private final i G;
    
    static {
        H = new o[] { (o)k1.r((e1)new f1((h)k1.d((Class)b.class), "annotations", "getAnnotations()Ljava/util/List;")) };
    }
    
    public b(@e final n n, @e final a<? extends List<? extends c>> a) {
        k0.p((Object)n, "storageManager");
        k0.p((Object)a, "compute");
        this.G = n.g((n6.a<?>)a);
    }
    
    private final List<c> b() {
        return m.a((i<? extends List<c>>)this.G, (Object)this, (o<?>)b.H[0]);
    }
    
    public boolean B4(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        return g$b.b((g)this, b);
    }
    
    @f
    public c a0(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        return g$b.a((g)this, b);
    }
    
    public boolean isEmpty() {
        return this.b().isEmpty();
    }
    
    @e
    public Iterator<c> iterator() {
        return this.b().iterator();
    }
}
