// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.collections.j1;
import java.util.Collection;
import kotlin.collections.v;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.m0;
import n6.l;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;

public abstract class a implements l0
{
    @e
    private final n a;
    @e
    private final s b;
    @e
    private final e0 c;
    protected j d;
    @e
    private final h<b, h0> e;
    
    public a(@e final n a, @e final s b, @e final e0 c) {
        k0.p((Object)a, "storageManager");
        k0.p((Object)b, "finder");
        k0.p((Object)c, "moduleDescriptor");
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = a.i((n6.l<? super b, ? extends h0>)new l<b, h0>() {
            final /* synthetic */ a G;
            
            @f
            public final h0 a(@e final b b) {
                k0.p((Object)b, "fqName");
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.n c = this.G.c(b);
                if (c == null) {
                    c = null;
                }
                else {
                    c.M0(this.G.d());
                }
                return (h0)c;
            }
        });
    }
    
    @e
    public List<h0> a(@e final b b) {
        k0.p((Object)b, "fqName");
        return (List<h0>)v.M(((l)this.e).invoke((Object)b));
    }
    
    public void b(@e final b b, @e final Collection<h0> collection) {
        k0.p((Object)b, "fqName");
        k0.p((Object)collection, "packageFragments");
        kotlin.reflect.jvm.internal.impl.utils.a.a((Collection<Object>)collection, ((l)this.e).invoke((Object)b));
    }
    
    @f
    protected abstract kotlin.reflect.jvm.internal.impl.serialization.deserialization.n c(@e final b p0);
    
    @e
    protected final j d() {
        final j d = this.d;
        if (d != null) {
            return d;
        }
        k0.S("components");
        throw null;
    }
    
    @e
    protected final s e() {
        return this.b;
    }
    
    @e
    protected final e0 f() {
        return this.c;
    }
    
    @e
    protected final n g() {
        return this.a;
    }
    
    protected final void h(@e final j d) {
        k0.p((Object)d, "<set-?>");
        this.d = d;
    }
    
    @e
    public Collection<b> z(@e final b b, @e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)b, "fqName");
        k0.p((Object)l, "nameFilter");
        return (Collection<b>)j1.k();
    }
}
