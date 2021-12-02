// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import n6.l;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import java.util.Collection;
import kotlin.collections.v;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.structure.u;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.load.java.w;
import kotlin.b0;
import kotlin.d0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.storage.a;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;

public final class f implements l0
{
    @e
    private final g a;
    @e
    private final a<b, h> b;
    
    public f(@e final kotlin.reflect.jvm.internal.impl.load.java.lazy.b b) {
        k0.p((Object)b, "components");
        final g a = new g(b, k.a.a, (b0<w>)d0.e((Object)null));
        this.a = a;
        this.b = (a<b, h>)a.e().d();
    }
    
    public static final /* synthetic */ g c(final f f) {
        return f.a;
    }
    
    private final h d(final b b) {
        final u b2 = this.a.a().d().b(b);
        if (b2 == null) {
            return null;
        }
        return this.b.a(b, (n6.a<? extends h>)new n6.a<h>() {
            final /* synthetic */ f G;
            
            @e
            public final h a() {
                return new h(f.c(this.G), b2);
            }
        });
    }
    
    @e
    public List<h> a(@e final b b) {
        k0.p((Object)b, "fqName");
        return (List<h>)v.M((Object)this.d(b));
    }
    
    public void b(@e final b b, @e final Collection<h0> collection) {
        k0.p((Object)b, "fqName");
        k0.p((Object)collection, "packageFragments");
        kotlin.reflect.jvm.internal.impl.utils.a.a((Collection<h>)collection, this.d(b));
    }
    
    @e
    public List<b> e(@e final b b, @e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)b, "fqName");
        k0.p((Object)l, "nameFilter");
        final h d = this.d(b);
        List<b> list;
        if (d == null) {
            list = null;
        }
        else {
            list = d.P0();
        }
        if (list == null) {
            list = (List<b>)v.E();
        }
        return list;
    }
}
