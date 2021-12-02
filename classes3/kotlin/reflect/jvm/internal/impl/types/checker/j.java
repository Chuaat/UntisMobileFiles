// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.d0;
import kotlin.g0;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.j1;
import java.util.List;
import n6.a;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.y0;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b;

public final class j implements b
{
    @e
    private final y0 a;
    @f
    private a<? extends List<? extends j1>> b;
    @f
    private final j c;
    @f
    private final b1 d;
    @e
    private final b0 e;
    
    public j(@e final y0 y0, @e final List<? extends j1> list, @f final j j) {
        k0.p((Object)y0, "projection");
        k0.p((Object)list, "supertypes");
        this(y0, (a)new a<List<? extends j1>>() {
            @e
            public final List<j1> a() {
                return (List<j1>)list;
            }
        }, j, null, 8, null);
    }
    
    public j(@e final y0 a, @f final a<? extends List<? extends j1>> b, @f final j c, @f final b1 d) {
        k0.p((Object)a, "projection");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = d0.b(g0.H, (a)new a<List<? extends j1>>() {
            final /* synthetic */ j G;
            
            @f
            public final List<j1> a() {
                final a e = j.e(this.G);
                List<j1> list;
                if (e == null) {
                    list = null;
                }
                else {
                    list = (List<j1>)e.invoke();
                }
                return list;
            }
        });
    }
    
    public static final /* synthetic */ a e(final j j) {
        return j.b;
    }
    
    private final List<j1> g() {
        return (List<j1>)this.e.getValue();
    }
    
    @e
    @Override
    public y0 a() {
        return this.a;
    }
    
    @f
    @Override
    public h c() {
        return null;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean equals(@f final Object obj) {
        boolean b = true;
        if (this == obj) {
            return true;
        }
        Object class1;
        if (obj == null) {
            class1 = null;
        }
        else {
            class1 = obj.getClass();
        }
        if (!k0.g((Object)j.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        j j = (j)obj;
        j c;
        if ((c = this.c) == null) {
            c = this;
        }
        final j c2 = j.c;
        if (c2 != null) {
            j = c2;
        }
        if (c != j) {
            b = false;
        }
        return b;
    }
    
    @e
    public List<j1> f() {
        List<j1> list;
        if ((list = this.g()) == null) {
            list = (List<j1>)v.E();
        }
        return list;
    }
    
    @e
    @Override
    public List<b1> getParameters() {
        return (List<b1>)v.E();
    }
    
    public final void h(@e final List<? extends j1> list) {
        k0.p((Object)list, "supertypes");
        this.b = (a<? extends List<? extends j1>>)new a<List<? extends j1>>() {
            @e
            public final List<j1> a() {
                return (List<j1>)list;
            }
        };
    }
    
    @Override
    public int hashCode() {
        final j c = this.c;
        int n;
        if (c == null) {
            n = super.hashCode();
        }
        else {
            n = c.hashCode();
        }
        return n;
    }
    
    @e
    public j i(@e final g g) {
        k0.p((Object)g, "kotlinTypeRefiner");
        final y0 b = this.a().b(g);
        k0.o((Object)b, "projection.refine(kotlinTypeRefiner)");
        Object o;
        if (this.b == null) {
            o = null;
        }
        else {
            o = new a<List<? extends j1>>() {
                final /* synthetic */ j G;
                
                @e
                public final List<j1> a() {
                    final List<j1> f = this.G.f();
                    final g h = g;
                    final ArrayList list = new ArrayList<j1>(v.Y((Iterable)f, 10));
                    final Iterator<Object> iterator = f.iterator();
                    while (iterator.hasNext()) {
                        list.add(iterator.next().S0(h));
                    }
                    return (List<j1>)list;
                }
            };
        }
        j c;
        if ((c = this.c) == null) {
            c = this;
        }
        return new j(b, (a<? extends List<? extends j1>>)o, c, this.d);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CapturedType(");
        sb.append(this.a());
        sb.append(')');
        return sb.toString();
    }
    
    @e
    @Override
    public KotlinBuiltIns w() {
        final c0 a = this.a().a();
        k0.o((Object)a, "projection.type");
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.e(a);
    }
}
