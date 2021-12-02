// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.t;
import java.util.Collection;
import java.util.Arrays;
import java.util.Objects;
import kotlin.collections.m;
import java.lang.reflect.WildcardType;
import java.lang.reflect.ParameterizedType;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import java.lang.reflect.Array;
import kotlin.reflect.s;
import kotlin.reflect.jvm.internal.calls.d;
import java.util.Map;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.lang.reflect.Type;
import kotlin.collections.v;
import java.util.Comparator;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.n0;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.reflect.n;
import java.util.ArrayList;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\bM\u0010NJ%\u0010\b\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J'\u0010\u0010\u001a\u00028\u00002\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u000f\"\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\tJ3\u0010\u0015\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R0\u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$ %*\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001b0\u001b0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R0\u0010+\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 %*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010)0)0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u001a\u0010/\u001a\u0006\u0012\u0002\b\u00030,8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u001f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010!R\u001c\u00104\u001a\b\u0012\u0004\u0012\u0002020\u001b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u001dR\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020$0\u001b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001dR$\u00109\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u000107070#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010'R\u0016\u0010:\u001a\u00020\u001f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010!R\u0016\u0010;\u001a\u00020\u001f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010!R\u0018\u0010?\u001a\u0004\u0018\u00010<8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020\u001f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010!R0\u0010C\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020A %*\n\u0012\u0004\u0012\u00020A\u0018\u00010\u001b0\u001b0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010'R\u001c\u0010E\u001a\b\u0012\u0002\b\u0003\u0018\u00010,8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010.R\u0016\u0010H\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006O" }, d2 = { "Lkotlin/reflect/jvm/internal/f;", "R", "Lkotlin/reflect/c;", "Lkotlin/reflect/jvm/internal/a0;", "", "Lkotlin/reflect/n;", "", "args", "d0", "(Ljava/util/Map;)Ljava/lang/Object;", "Lkotlin/reflect/s;", "type", "g0", "Ljava/lang/reflect/Type;", "h0", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "callBy", "Lkotlin/coroutines/d;", "continuationArgument", "f0", "(Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/k;", "j0", "()Lkotlin/reflect/jvm/internal/k;", "container", "", "getParameters", "()Ljava/util/List;", "parameters", "", "m0", "()Z", "isAnnotationConstructor", "Lkotlin/reflect/jvm/internal/d0$a;", "", "kotlin.jvm.PlatformType", "G", "Lkotlin/reflect/jvm/internal/d0$a;", "_annotations", "Ljava/util/ArrayList;", "H", "_parameters", "Lkotlin/reflect/jvm/internal/calls/d;", "i0", "()Lkotlin/reflect/jvm/internal/calls/d;", "caller", "n0", "isBound", "Lkotlin/reflect/t;", "getTypeParameters", "typeParameters", "getAnnotations", "annotations", "Lkotlin/reflect/jvm/internal/x;", "I", "_returnType", "isAbstract", "isFinal", "Lkotlin/reflect/x;", "getVisibility", "()Lkotlin/reflect/x;", "visibility", "isOpen", "Lkotlin/reflect/jvm/internal/z;", "J", "_typeParameters", "k0", "defaultCaller", "getReturnType", "()Lkotlin/reflect/s;", "returnType", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public abstract class f<R> implements c<R>, a0
{
    private final d0.a<List<Annotation>> G;
    private final d0.a<ArrayList<n>> H;
    private final d0.a<x> I;
    private final d0.a<List<z>> J;
    
    public f() {
        final d0.a<List<Annotation>> d = d0.d((n6.a<List<Annotation>>)new n6.a<List<? extends Annotation>>() {
            final /* synthetic */ f G;
            
            public final List<Annotation> a() {
                return k0.d(this.G.l0());
            }
        });
        kotlin.jvm.internal.k0.o(d, "ReflectProperties.lazySo\u2026or.computeAnnotations() }");
        this.G = d;
        final d0.a<ArrayList<n>> d2 = d0.d((n6.a<ArrayList<n>>)new n6.a<ArrayList<n>>() {
            final /* synthetic */ f G;
            
            public final ArrayList<n> a() {
                final kotlin.reflect.jvm.internal.impl.descriptors.b l0 = this.G.l0();
                final ArrayList list = new ArrayList<n>();
                final boolean n0 = this.G.n0();
                final int n2 = 0;
                int n4;
                if (!n0) {
                    final t0 g = k0.g(l0);
                    int n3;
                    if (g != null) {
                        list.add(new q(this.G, 0, n.b.G, new a<n0>() {
                            @e
                            public final n0 a() {
                                return g;
                            }
                        }));
                        n3 = 1;
                    }
                    else {
                        n3 = 0;
                    }
                    final t0 q0 = l0.q0();
                    n4 = n3;
                    if (q0 != null) {
                        list.add(new q(this.G, n3, n.b.H, new a<n0>() {
                            @e
                            public final n0 a() {
                                return q0;
                            }
                        }));
                        n4 = n3 + 1;
                    }
                }
                else {
                    n4 = 0;
                }
                final List<e1> m = l0.m();
                kotlin.jvm.internal.k0.o(m, "descriptor.valueParameters");
                for (int size = m.size(), i = n2; i < size; ++i, ++n4) {
                    list.add(new q(this.G, n4, n.b.I, new a<n0>() {
                        @e
                        public final n0 a() {
                            final e1 value = l0.m().get(i);
                            kotlin.jvm.internal.k0.o(value, "descriptor.valueParameters[i]");
                            return value;
                        }
                    }));
                }
                if (this.G.m0() && l0 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.b && list.size() > 1) {
                    v.p0((List<Object>)list, new Comparator<Object>() {
                        @Override
                        public final int compare(final T t, final T t2) {
                            return kotlin.comparisons.a.g(((n)t).getName(), ((n)t2).getName());
                        }
                    });
                }
                list.trimToSize();
                return (ArrayList<n>)list;
            }
        });
        kotlin.jvm.internal.k0.o(d2, "ReflectProperties.lazySo\u2026ze()\n        result\n    }");
        this.H = d2;
        final d0.a<x> d3 = d0.d((n6.a<x>)new n6.a<x>() {
            final /* synthetic */ f G;
            
            public final x a() {
                final c0 returnType = this.G.l0().getReturnType();
                kotlin.jvm.internal.k0.m(returnType);
                kotlin.jvm.internal.k0.o(returnType, "descriptor.returnType!!");
                return new x(returnType, new a<Type>() {
                    final /* synthetic */ f$c G;
                    
                    @e
                    public final Type a() {
                        Type type = f.this.h0();
                        if (type == null) {
                            type = this.G.G.i0().getReturnType();
                        }
                        return type;
                    }
                });
            }
        });
        kotlin.jvm.internal.k0.o(d3, "ReflectProperties.lazySo\u2026eturnType\n        }\n    }");
        this.I = d3;
        final d0.a<List<z>> d4 = d0.d((n6.a<List<z>>)new n6.a<List<? extends z>>() {
            final /* synthetic */ f G;
            
            public final List<z> a() {
                final List<b1> typeParameters = this.G.l0().getTypeParameters();
                kotlin.jvm.internal.k0.o(typeParameters, "descriptor.typeParameters");
                final ArrayList list = new ArrayList<z>(v.Y((Iterable<?>)typeParameters, 10));
                for (final b1 b1 : typeParameters) {
                    final f g = this.G;
                    kotlin.jvm.internal.k0.o(b1, "descriptor");
                    list.add(new z(g, b1));
                }
                return (List<z>)list;
            }
        });
        kotlin.jvm.internal.k0.o(d4, "ReflectProperties.lazySo\u2026this, descriptor) }\n    }");
        this.J = d4;
    }
    
    private final R d0(final Map<n, ?> map) {
        final List<n> parameters = this.getParameters();
        final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)parameters, 10));
        for (final n n : parameters) {
            Object o;
            if (map.containsKey(n)) {
                o = map.get(n);
                if (o == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Annotation argument value cannot be null (");
                    sb.append(n);
                    sb.append(')');
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            else if (n.Z()) {
                o = null;
            }
            else {
                if (!n.l()) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("No argument provided for a required parameter: ");
                    sb2.append(n);
                    throw new IllegalArgumentException(sb2.toString());
                }
                o = this.g0(n.a());
            }
            list.add(o);
        }
        final d<?> k0 = this.k0();
        if (k0 != null) {
            try {
                final Object[] array = list.toArray(new Object[0]);
                if (array != null) {
                    return (R)k0.call(array);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            catch (IllegalAccessException ex) {
                throw new kotlin.reflect.full.a(ex);
            }
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("This callable does not support a default call: ");
        sb3.append(this.l0());
        throw new b0(sb3.toString());
    }
    
    private final Object g0(final s s) {
        final Class<?> c = m6.a.c(kotlin.reflect.jvm.c.b(s));
        if (c.isArray()) {
            final Object instance = Array.newInstance(c.getComponentType(), 0);
            kotlin.jvm.internal.k0.o(instance, "type.jvmErasure.java.run\u2026\"\n            )\n        }");
            return instance;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot instantiate the default empty array of type ");
        sb.append(c.getSimpleName());
        sb.append(", because it is not an array type");
        throw new b0(sb.toString());
    }
    
    private final Type h0() {
        kotlin.reflect.jvm.internal.impl.descriptors.b l0 = this.l0();
        final boolean b = l0 instanceof y;
        final Type type = null;
        if (!b) {
            l0 = null;
        }
        final y y = (y)l0;
        Type type2 = type;
        if (y != null) {
            type2 = type;
            if (y.isSuspend()) {
                ParameterizedType i3;
                if (!((i3 = v.i3((List<? extends ParameterizedType>)this.i0().a())) instanceof ParameterizedType)) {
                    i3 = null;
                }
                final ParameterizedType parameterizedType = i3;
                Type rawType;
                if (parameterizedType != null) {
                    rawType = parameterizedType.getRawType();
                }
                else {
                    rawType = null;
                }
                type2 = type;
                if (kotlin.jvm.internal.k0.g(rawType, kotlin.coroutines.d.class)) {
                    final Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    kotlin.jvm.internal.k0.o(actualTypeArguments, "continuationType.actualTypeArguments");
                    WildcardType cs;
                    if (!((cs = m.Cs(actualTypeArguments)) instanceof WildcardType)) {
                        cs = null;
                    }
                    final WildcardType wildcardType = cs;
                    type2 = type;
                    if (wildcardType != null) {
                        final Type[] lowerBounds = wildcardType.getLowerBounds();
                        type2 = type;
                        if (lowerBounds != null) {
                            type2 = m.ob(lowerBounds);
                        }
                    }
                }
            }
        }
        return type2;
    }
    
    @Override
    public R call(@e final Object... array) {
        kotlin.jvm.internal.k0.p(array, "args");
        try {
            return (R)this.i0().call(array);
        }
        catch (IllegalAccessException ex) {
            throw new kotlin.reflect.full.a(ex);
        }
    }
    
    @Override
    public R callBy(@e final Map<n, ?> map) {
        kotlin.jvm.internal.k0.p(map, "args");
        R r;
        if (this.m0()) {
            r = this.d0(map);
        }
        else {
            r = this.f0(map, null);
        }
        return r;
    }
    
    public final R f0(@e final Map<n, ?> map, @org.jetbrains.annotations.f final kotlin.coroutines.d<?> e) {
        kotlin.jvm.internal.k0.p(map, "args");
        final List<n> parameters = this.getParameters();
        final ArrayList list = new ArrayList<kotlin.coroutines.d<?>>(parameters.size());
        final ArrayList<Integer> c = new ArrayList<Integer>(1);
        final Iterator<n> iterator = parameters.iterator();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            Object e2 = null;
            if (hasNext) {
                final n obj = iterator.next();
                int n4 = n3;
                if (n != 0) {
                    n4 = n3;
                    if (n % 32 == 0) {
                        c.add(n3);
                        n4 = 0;
                    }
                }
                int n5 = 0;
                Label_0241: {
                    Object e3;
                    if (map.containsKey(obj)) {
                        e3 = map.get(obj);
                    }
                    else {
                        if (obj.Z()) {
                            if (!k0.i(obj.a())) {
                                e2 = k0.e(kotlin.reflect.jvm.e.g(obj.a()));
                            }
                            list.add((kotlin.coroutines.d<?>)e2);
                            n4 |= 1 << n % 32;
                            n5 = 1;
                            break Label_0241;
                        }
                        if (!obj.l()) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("No argument provided for a required parameter: ");
                            sb.append(obj);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        e3 = this.g0(obj.a());
                    }
                    list.add((kotlin.coroutines.d<?>)e3);
                    n5 = n2;
                }
                n2 = n5;
                n3 = n4;
                if (obj.n() != kotlin.reflect.n.b.I) {
                    continue;
                }
                ++n;
                n2 = n5;
                n3 = n4;
            }
            else {
                if (e != null) {
                    list.add(e);
                }
                if (n2 == 0) {
                    final Object[] array = list.toArray(new Object[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    return this.call(Arrays.copyOf(array, array.length));
                }
                c.add(n3);
                final d<?> k0 = this.k0();
                if (k0 != null) {
                    list.addAll(c);
                    list.add(null);
                    try {
                        final Object[] array2 = list.toArray(new Object[0]);
                        if (array2 != null) {
                            return (R)k0.call(array2);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    catch (IllegalAccessException ex) {
                        throw new kotlin.reflect.full.a(ex);
                    }
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("This callable does not support a default call: ");
                sb2.append(this.l0());
                throw new b0(sb2.toString());
            }
        }
    }
    
    @e
    @Override
    public List<Annotation> getAnnotations() {
        final List<Annotation> invoke = this.G.invoke();
        kotlin.jvm.internal.k0.o(invoke, "_annotations()");
        return invoke;
    }
    
    @e
    @Override
    public List<n> getParameters() {
        final ArrayList<n> invoke = this.H.invoke();
        kotlin.jvm.internal.k0.o(invoke, "_parameters()");
        return invoke;
    }
    
    @e
    @Override
    public s getReturnType() {
        final x invoke = this.I.invoke();
        kotlin.jvm.internal.k0.o(invoke, "_returnType()");
        return invoke;
    }
    
    @e
    @Override
    public List<t> getTypeParameters() {
        final List<z> invoke = this.J.invoke();
        kotlin.jvm.internal.k0.o(invoke, "_typeParameters()");
        return (List<t>)invoke;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public kotlin.reflect.x getVisibility() {
        final u visibility = this.l0().getVisibility();
        kotlin.jvm.internal.k0.o(visibility, "descriptor.visibility");
        return k0.o(visibility);
    }
    
    @e
    public abstract d<?> i0();
    
    @Override
    public boolean isAbstract() {
        return this.l0().o() == kotlin.reflect.jvm.internal.impl.descriptors.b0.K;
    }
    
    @Override
    public boolean isFinal() {
        return this.l0().o() == kotlin.reflect.jvm.internal.impl.descriptors.b0.H;
    }
    
    @Override
    public boolean isOpen() {
        return this.l0().o() == kotlin.reflect.jvm.internal.impl.descriptors.b0.J;
    }
    
    @e
    public abstract k j0();
    
    @org.jetbrains.annotations.f
    public abstract d<?> k0();
    
    @e
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.b l0();
    
    protected final boolean m0() {
        return kotlin.jvm.internal.k0.g(this.getName(), "<init>") && this.j0().m().isAnnotation();
    }
    
    public abstract boolean n0();
}
