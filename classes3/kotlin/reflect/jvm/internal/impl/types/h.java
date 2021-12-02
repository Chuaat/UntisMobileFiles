// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.d0;
import kotlin.g0;
import kotlin.b0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import java.util.List;
import kotlin.collections.v;
import kotlin.j2;
import n6.l;
import java.util.Collection;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.i;

public abstract class h implements w0
{
    @e
    private final i<b> a;
    private final boolean b;
    
    public h(@e final n n) {
        k0.p((Object)n, "storageManager");
        this.a = n.h((n6.a<? extends b>)new n6.a<b>() {
            final /* synthetic */ h G;
            
            @e
            public final b a() {
                return new b(this.G.g());
            }
        }, (n6.l<? super Boolean, ? extends b>)h$d.G, (n6.l<? super b, j2>)new l<b, j2>() {
            final /* synthetic */ h G;
            
            public final void a(@e final b b) {
                k0.p((Object)b, "supertypes");
                Collection<c0> collection = (Collection<c0>)this.G.l().a((w0)this.G, (Collection)b.a(), (l)new l<w0, Iterable<? extends c0>>() {
                    final /* synthetic */ h G = h$e.this.G;
                    
                    @e
                    public final Iterable<c0> a(@e final w0 w0) {
                        k0.p((Object)w0, "it");
                        return this.G.f(w0, false);
                    }
                }, (l)new l<c0, j2>() {
                    final /* synthetic */ h G = h$e.this.G;
                    
                    public final void a(@e final c0 c0) {
                        k0.p((Object)c0, "it");
                        this.G.p(c0);
                    }
                });
                final boolean empty = collection.isEmpty();
                List<c0> list = null;
                if (empty) {
                    final c0 h = this.G.h();
                    if (h == null) {
                        collection = null;
                    }
                    else {
                        collection = (Collection<c0>)v.k((Object)h);
                    }
                    if (collection == null) {
                        collection = (Collection<c0>)v.E();
                    }
                }
                if (this.G.j()) {
                    final z0 l = this.G.l();
                    final h g = this.G;
                    l.a((w0)g, (Collection)collection, (l)new l<w0, Iterable<? extends c0>>() {
                        @e
                        public final Iterable<c0> a(@e final w0 w0) {
                            k0.p((Object)w0, "it");
                            return g.f(w0, true);
                        }
                    }, (l)new l<c0, j2>() {
                        final /* synthetic */ h G = h$e.this.G;
                        
                        public final void a(@e final c0 c0) {
                            k0.p((Object)c0, "it");
                            this.G.o(c0);
                        }
                    });
                }
                final h g2 = this.G;
                if (collection instanceof List) {
                    list = (List<c0>)collection;
                }
                List<c0> i5;
                if ((i5 = list) == null) {
                    i5 = (List<c0>)v.I5((Iterable)collection);
                }
                b.c(g2.n(i5));
            }
        });
    }
    
    private final Collection<c0> f(final w0 w0, final boolean b) {
        final boolean b2 = w0 instanceof h;
        final List<c0> list = null;
        h h;
        if (b2) {
            h = (h)w0;
        }
        else {
            h = null;
        }
        List<c0> q4;
        if (h == null) {
            q4 = list;
        }
        else {
            q4 = (List<c0>)v.q4((Collection)((b)((n6.a)h.a).invoke()).a(), (Iterable)h.i(b));
        }
        Collection<c0> k = q4;
        if (q4 == null) {
            k = w0.k();
            k0.o((Object)k, "supertypes");
        }
        return k;
    }
    
    @e
    @Override
    public w0 b(@e final g g) {
        k0.p((Object)g, "kotlinTypeRefiner");
        return new a(g);
    }
    
    @e
    @Override
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.h c();
    
    @e
    protected abstract Collection<c0> g();
    
    @f
    protected c0 h() {
        return null;
    }
    
    @e
    protected Collection<c0> i(final boolean b) {
        return (Collection<c0>)v.E();
    }
    
    protected boolean j() {
        return this.b;
    }
    
    @e
    protected abstract z0 l();
    
    @e
    public List<c0> m() {
        return ((b)((n6.a)this.a).invoke()).b();
    }
    
    @e
    protected List<c0> n(@e final List<c0> list) {
        k0.p((Object)list, "supertypes");
        return list;
    }
    
    protected void o(@e final c0 c0) {
        k0.p((Object)c0, "type");
    }
    
    protected void p(@e final c0 c0) {
        k0.p((Object)c0, "type");
    }
    
    private final class a implements w0
    {
        @e
        private final g a;
        @e
        private final b0 b;
        
        public a(final g a) {
            k0.p((Object)h.this, "this$0");
            k0.p((Object)a, "kotlinTypeRefiner");
            this.a = a;
            this.b = d0.b(g0.H, (n6.a)new n6.a<List<? extends c0>>() {
                final /* synthetic */ a G;
                
                @e
                public final List<c0> a() {
                    return kotlin.reflect.jvm.internal.impl.types.checker.h.b(h.a.e(this.G), h.this.m());
                }
            });
        }
        
        public static final /* synthetic */ g e(final a a) {
            return a.a;
        }
        
        private final List<c0> f() {
            return (List<c0>)this.b.getValue();
        }
        
        @e
        @Override
        public w0 b(@e final g g) {
            k0.p((Object)g, "kotlinTypeRefiner");
            return h.this.b(g);
        }
        
        @e
        @Override
        public kotlin.reflect.jvm.internal.impl.descriptors.h c() {
            return h.this.c();
        }
        
        @Override
        public boolean d() {
            return h.this.d();
        }
        
        @Override
        public boolean equals(@f final Object obj) {
            return h.this.equals(obj);
        }
        
        @e
        public List<c0> g() {
            return this.f();
        }
        
        @e
        @Override
        public List<b1> getParameters() {
            final List<b1> parameters = h.this.getParameters();
            k0.o((Object)parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }
        
        @Override
        public int hashCode() {
            return h.this.hashCode();
        }
        
        @e
        @Override
        public String toString() {
            return h.this.toString();
        }
        
        @e
        @Override
        public KotlinBuiltIns w() {
            final KotlinBuiltIns w = h.this.w();
            k0.o((Object)w, "this@AbstractTypeConstructor.builtIns");
            return w;
        }
    }
    
    private static final class b
    {
        @e
        private final Collection<c0> a;
        @e
        private List<? extends c0> b;
        
        public b(@e final Collection<? extends c0> a) {
            k0.p((Object)a, "allSupertypes");
            this.a = (Collection<c0>)a;
            this.b = (List<? extends c0>)v.k((Object)u.c);
        }
        
        @e
        public final Collection<c0> a() {
            return this.a;
        }
        
        @e
        public final List<c0> b() {
            return (List<c0>)this.b;
        }
        
        public final void c(@e final List<? extends c0> b) {
            k0.p((Object)b, "<set-?>");
            this.b = b;
        }
    }
}
