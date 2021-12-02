// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import kotlin.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.c;
import java.util.Iterator;
import kotlin.reflect.s;
import kotlin.h0;
import kotlin.collections.m;
import java.lang.reflect.WildcardType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.GenericArrayType;
import kotlin.b0;
import kotlin.reflect.jvm.internal.impl.types.y0;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b;
import kotlin.g0;
import kotlin.collections.v;
import kotlin.reflect.u;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.reflect.g;
import kotlin.jvm.internal.k0;
import n6.a;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import java.lang.reflect.Type;
import kotlin.reflect.o;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010/¢\u0006\u0004\b0\u00101J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00158\u0002@\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR#\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001b8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010+\u001a\u0004\u0018\u00010\u00048V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00062" }, d2 = { "Lkotlin/reflect/jvm/internal/x;", "Lkotlin/jvm/internal/l0;", "Lkotlin/reflect/jvm/internal/impl/types/c0;", "type", "Lkotlin/reflect/g;", "r", "", "nullable", "z", "(Z)Lkotlin/reflect/jvm/internal/x;", "", "other", "equals", "", "hashCode", "", "toString", "Ljava/lang/reflect/Type;", "g", "()Ljava/lang/reflect/Type;", "javaType", "Lkotlin/reflect/jvm/internal/d0$a;", "G", "Lkotlin/reflect/jvm/internal/d0$a;", "getComputeJavaType$annotations", "()V", "computeJavaType", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lkotlin/reflect/u;", "I", "getArguments", "arguments", "J", "Lkotlin/reflect/jvm/internal/impl/types/c0;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "H", "b", "()Lkotlin/reflect/g;", "classifier", "c", "()Z", "isMarkedNullable", "Lkotlin/Function0;", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Ln6/a;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public final class x implements l0
{
    static final /* synthetic */ o[] K;
    private final d0.a<Type> G;
    @f
    private final d0.a H;
    @e
    private final d0.a I;
    @e
    private final c0 J;
    
    static {
        K = new o[] { k1.r(new f1(k1.d(x.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), k1.r(new f1(k1.d(x.class), "arguments", "getArguments()Ljava/util/List;")) };
    }
    
    public x(@e final c0 j, @f final n6.a<? extends Type> a) {
        k0.p(j, "type");
        this.J = j;
        final boolean b = a instanceof d0.a;
        final d0.a<Type> a2 = null;
        d0.a<Type> a3;
        if (!b) {
            a3 = null;
        }
        else {
            a3 = (d0.a<Type>)a;
        }
        Object d = a3;
        if (d == null) {
            d = a2;
            if (a != null) {
                d = d0.d(a);
            }
        }
        this.G = (d0.a<Type>)d;
        this.H = (d0.a)d0.d((n6.a<Object>)new n6.a<g>() {
            final /* synthetic */ x G;
            
            @f
            public final g a() {
                final x g = this.G;
                return g.r(g.v());
            }
        });
        this.I = (d0.a)d0.d((n6.a<Object>)new n6.a<List<? extends u>>() {
            final /* synthetic */ x G;
            
            public final List<u> a() {
                final List m0 = this.G.v().M0();
                if (m0.isEmpty()) {
                    return v.E();
                }
                final b0<Object> b = kotlin.d0.b(g0.H, (a<?>)new a<List<? extends Type>>() {
                    final /* synthetic */ x$a G;
                    
                    @e
                    public final List<Type> a() {
                        final Type g = this.G.G.g();
                        k0.m(g);
                        return (List<Type>)kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.e(g);
                    }
                });
                final ArrayList list = new ArrayList<u>(v.Y((Iterable<?>)m0, 10));
                int n = 0;
                for (final y0 next : m0) {
                    if (n < 0) {
                        v.W();
                    }
                    final y0 y0 = next;
                    u u;
                    if (y0.d()) {
                        u = kotlin.reflect.u.d.c();
                    }
                    else {
                        final c0 a = y0.a();
                        k0.o(a, "typeProjection.type");
                        final a h = a;
                        a<? extends Type> a2 = null;
                        if (h != null) {
                            a2 = new a<Type>() {
                                final /* synthetic */ x$a H;
                                
                                @e
                                public final Type a() {
                                    final Type g = this.H.G.g();
                                    Type type;
                                    String s;
                                    if (g instanceof Class) {
                                        final Class clazz = (Class)g;
                                        if (clazz.isArray()) {
                                            type = clazz.getComponentType();
                                        }
                                        else {
                                            type = Object.class;
                                        }
                                        s = "if (javaType.isArray) ja\u2026Type else Any::class.java";
                                    }
                                    else if (g instanceof GenericArrayType) {
                                        if (n != 0) {
                                            final StringBuilder sb = new StringBuilder();
                                            sb.append("Array type has been queried for a non-0th argument: ");
                                            sb.append(this.H.G);
                                            throw new kotlin.reflect.jvm.internal.b0(sb.toString());
                                        }
                                        type = ((GenericArrayType)g).getGenericComponentType();
                                        s = "javaType.genericComponentType";
                                    }
                                    else {
                                        if (!(g instanceof ParameterizedType)) {
                                            final StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Non-generic type has been queried for arguments: ");
                                            sb2.append(this.H.G);
                                            throw new kotlin.reflect.jvm.internal.b0(sb2.toString());
                                        }
                                        type = b.getValue().get(n);
                                        if (type instanceof WildcardType) {
                                            final WildcardType wildcardType = (WildcardType)type;
                                            final Type[] lowerBounds = wildcardType.getLowerBounds();
                                            k0.o(lowerBounds, "argument.lowerBounds");
                                            type = m.Kb(lowerBounds);
                                            if (type == null) {
                                                final Type[] upperBounds = wildcardType.getUpperBounds();
                                                k0.o(upperBounds, "argument.upperBounds");
                                                type = m.ob(upperBounds);
                                            }
                                        }
                                        s = "if (argument !is Wildcar\u2026ument.upperBounds.first()";
                                    }
                                    k0.o(type, s);
                                    return type;
                                }
                            };
                        }
                        final x x = new x(a, a2);
                        final int n2 = w.a[((Enum)y0.c()).ordinal()];
                        if (n2 != 1) {
                            if (n2 != 2) {
                                if (n2 != 3) {
                                    throw new h0();
                                }
                                u = kotlin.reflect.u.d.b(x);
                            }
                            else {
                                u = kotlin.reflect.u.d.a(x);
                            }
                        }
                        else {
                            u = kotlin.reflect.u.d.e(x);
                        }
                    }
                    list.add(u);
                    ++n;
                }
                return (List<u>)list;
            }
        });
    }
    
    private final g r(c0 a) {
        final kotlin.reflect.jvm.internal.impl.descriptors.h c = a.N0().c();
        if (c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            final Class<?> n = kotlin.reflect.jvm.internal.k0.n((kotlin.reflect.jvm.internal.impl.descriptors.e)c);
            if (n == null) {
                return null;
            }
            if (n.isArray()) {
                final y0 y0 = v.X4((List<? extends y0>)a.M0());
                if (y0 != null) {
                    a = y0.a();
                    if (a != null) {
                        k0.o(a, "type.arguments.singleOrN\u2026return KClassImpl(jClass)");
                        final g r = this.r(a);
                        if (r != null) {
                            return new kotlin.reflect.jvm.internal.h<Object>(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.a((Class)m6.a.c(kotlin.reflect.jvm.c.a(r))));
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Cannot determine classifier for array element type: ");
                        sb.append(this);
                        throw new kotlin.reflect.jvm.internal.b0(sb.toString());
                    }
                }
                return new kotlin.reflect.jvm.internal.h<Object>((Class<Object>)n);
            }
            if (!kotlin.reflect.jvm.internal.impl.types.f1.l(a)) {
                final Class f = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.f((Class)n);
                Class<Object> clazz = (Class<Object>)n;
                if (f != null) {
                    clazz = (Class<Object>)f;
                }
                return new kotlin.reflect.jvm.internal.h<Object>(clazz);
            }
            return new kotlin.reflect.jvm.internal.h<Object>(n);
        }
        else {
            if (c instanceof b1) {
                return new z(null, (b1)c);
            }
            if (!(c instanceof a1)) {
                return null;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("An operation is not implemented: ");
            sb2.append("Type alias classifiers are not yet supported");
            throw new i0(sb2.toString());
        }
    }
    
    @f
    @Override
    public g b() {
        return (g)((d0.c)this.H).b(this, x.K[0]);
    }
    
    @Override
    public boolean c() {
        return this.J.O0();
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof x && k0.g(this.J, ((x)o).J);
    }
    
    @f
    @Override
    public Type g() {
        final d0.a<Type> g = this.G;
        Type type;
        if (g != null) {
            type = g.invoke();
        }
        else {
            type = null;
        }
        return type;
    }
    
    @e
    @Override
    public List<Annotation> getAnnotations() {
        return kotlin.reflect.jvm.internal.k0.d((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)this.J);
    }
    
    @e
    @Override
    public List<u> getArguments() {
        return (List<u>)((d0.c)this.I).b(this, x.K[1]);
    }
    
    @Override
    public int hashCode() {
        return this.J.hashCode();
    }
    
    @e
    @Override
    public String toString() {
        return kotlin.reflect.jvm.internal.g0.b.h(this.J);
    }
    
    @e
    public final c0 v() {
        return this.J;
    }
    
    @e
    public final x z(final boolean b) {
        if (!kotlin.reflect.jvm.internal.impl.types.z.b(this.J) && this.c() == b) {
            return this;
        }
        final c0 p = kotlin.reflect.jvm.internal.impl.types.f1.p(this.J, b);
        k0.o(p, "TypeUtils.makeNullableAsSpecified(type, nullable)");
        return new x(p, this.G);
    }
}
