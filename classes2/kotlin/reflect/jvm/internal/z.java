// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.h0;
import kotlin.jvm.internal.s1;
import kotlin.reflect.s;
import kotlin.reflect.jvm.internal.impl.load.kotlin.i;
import kotlin.reflect.d;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.j2;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import java.util.Iterator;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.m0;
import java.util.List;
import n6.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import org.jetbrains.annotations.e;
import kotlin.reflect.o;
import kotlin.Metadata;
import kotlin.reflect.t;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004*\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007*\u00020\u0006H\u0002J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0016\u0010\u0014\u001a\u00020\u00118V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u00020\u00158\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u000f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u000b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R#\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006." }, d2 = { "Lkotlin/reflect/jvm/internal/z;", "Lkotlin/reflect/t;", "Lkotlin/reflect/jvm/internal/j;", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "Lkotlin/reflect/jvm/internal/h;", "c", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/h;", "Ljava/lang/Class;", "a", "", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/reflect/w;", "v", "()Lkotlin/reflect/w;", "variance", "Lkotlin/reflect/jvm/internal/impl/descriptors/b1;", "I", "Lkotlin/reflect/jvm/internal/impl/descriptors/b1;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "descriptor", "getName", "()Ljava/lang/String;", "name", "Lkotlin/reflect/jvm/internal/a0;", "H", "Lkotlin/reflect/jvm/internal/a0;", "container", "r", "()Z", "isReified", "", "Lkotlin/reflect/s;", "G", "Lkotlin/reflect/jvm/internal/d0$a;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "<init>", "(Lkotlin/reflect/jvm/internal/a0;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public final class z implements t, j
{
    static final /* synthetic */ o[] J;
    @e
    private final d0.a G;
    private final a0 H;
    @e
    private final b1 I;
    
    static {
        J = new o[] { k1.r(new f1(k1.d(z.class), "upperBounds", "getUpperBounds()Ljava/util/List;")) };
    }
    
    public z(@f a0 h, @e final b1 i) {
        k0.p(i, "descriptor");
        this.I = i;
        this.G = (d0.a)d0.d((a<Object>)new a<List<? extends x>>() {
            final /* synthetic */ z G;
            
            public final List<x> a() {
                final List<c0> upperBounds = this.G.b().getUpperBounds();
                k0.o(upperBounds, "descriptor.upperBounds");
                final ArrayList list = new ArrayList<x>(v.Y((Iterable<?>)upperBounds, 10));
                final Iterator<Object> iterator = upperBounds.iterator();
                while (iterator.hasNext()) {
                    list.add(new x(iterator.next(), null, 2, null));
                }
                return (List<x>)list;
            }
        });
        if (h == null) {
            final m c = this.b().c();
            k0.o(c, "descriptor.containingDeclaration");
            kotlin.reflect.jvm.internal.h<?> h2;
            if (c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                h2 = this.c((kotlin.reflect.jvm.internal.impl.descriptors.e)c);
            }
            else {
                if (!(c instanceof b)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown type parameter container: ");
                    sb.append(c);
                    throw new b0(sb.toString());
                }
                final m c2 = ((b)c).c();
                k0.o(c2, "declaration.containingDeclaration");
                kotlin.reflect.jvm.internal.h<?> c3;
                if (c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                    c3 = this.c((kotlin.reflect.jvm.internal.impl.descriptors.e)c2);
                }
                else {
                    Object o;
                    if (!(c instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h)) {
                        o = null;
                    }
                    else {
                        o = c;
                    }
                    final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h h3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h)o;
                    if (h3 == null) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Non-class callable descriptor must be deserialized: ");
                        sb2.append(c);
                        throw new b0(sb2.toString());
                    }
                    final d<?> g = m6.a.g(this.a(h3));
                    Objects.requireNonNull(g, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    c3 = (kotlin.reflect.jvm.internal.h<?>)g;
                }
                h2 = c.P((kotlin.reflect.jvm.internal.impl.descriptors.o<kotlin.reflect.jvm.internal.h<?>, j2>)new kotlin.reflect.jvm.internal.a(c3), j2.a);
            }
            k0.o(h2, "when (val declaration = \u2026 $declaration\")\n        }");
            h = h2;
        }
        this.H = h;
    }
    
    private final Class<?> a(final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h obj) {
        Object g0 = obj.g0();
        final boolean b = g0 instanceof i;
        final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f f = null;
        if (!b) {
            g0 = null;
        }
        final i i = (i)g0;
        Object f2;
        if (i != null) {
            f2 = i.f();
        }
        else {
            f2 = null;
        }
        if (!(f2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f)) {
            f2 = f;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f f3 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f)f2;
        if (f3 != null) {
            final Class f4 = f3.f();
            if (f4 != null) {
                return (Class<?>)f4;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Container of deserialized member is not resolved: ");
        sb.append(obj);
        throw new b0(sb.toString());
    }
    
    private final kotlin.reflect.jvm.internal.h<?> c(final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        final Class<?> n = kotlin.reflect.jvm.internal.k0.n(e);
        Object g;
        if (n != null) {
            g = m6.a.g(n);
        }
        else {
            g = null;
        }
        final kotlin.reflect.jvm.internal.h<?> h = (kotlin.reflect.jvm.internal.h<?>)g;
        if (h != null) {
            return h;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Type parameter container is not resolved: ");
        sb.append(e.c());
        throw new b0(sb.toString());
    }
    
    @e
    public b1 b() {
        return this.I;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof z) {
            final a0 h = this.H;
            final z z = (z)o;
            if (k0.g(h, z.H) && k0.g(this.getName(), z.getName())) {
                return true;
            }
        }
        return false;
    }
    
    @e
    @Override
    public String getName() {
        final String d = this.b().getName().d();
        k0.o(d, "descriptor.name.asString()");
        return d;
    }
    
    @e
    @Override
    public List<s> getUpperBounds() {
        return (List<s>)((d0.c)this.G).b(this, z.J[0]);
    }
    
    @Override
    public int hashCode() {
        return this.H.hashCode() * 31 + this.getName().hashCode();
    }
    
    @Override
    public boolean r() {
        return this.b().r();
    }
    
    @e
    @Override
    public String toString() {
        return s1.L.a(this);
    }
    
    @e
    @Override
    public kotlin.reflect.w v() {
        final int n = y.a[((Enum)this.b().v()).ordinal()];
        kotlin.reflect.w w;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new h0();
                }
                w = kotlin.reflect.w.I;
            }
            else {
                w = kotlin.reflect.w.H;
            }
        }
        else {
            w = kotlin.reflect.w.G;
        }
        return w;
    }
}
