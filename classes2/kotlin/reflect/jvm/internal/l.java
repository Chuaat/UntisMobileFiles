// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.q;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import java.util.Objects;
import java.lang.reflect.Executable;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import java.lang.reflect.Modifier;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.jvm.internal.w;
import java.util.List;
import kotlin.reflect.n;
import java.util.ArrayList;
import kotlin.collections.v;
import java.lang.reflect.Member;
import kotlin.reflect.jvm.internal.calls.d;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.e;
import kotlin.reflect.o;
import kotlin.Metadata;
import kotlin.reflect.i;
import kotlin.jvm.internal.d0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u0010+\u001a\u00020&\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bB\u0010CB7\b\u0002\u0012\u0006\u0010+\u001a\u00020&\u0012\u0006\u0010%\u001a\u00020\u0016\u0012\u0006\u00105\u001a\u00020\u0016\u0012\b\u0010D\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bB\u0010EB+\b\u0016\u0012\u0006\u0010+\u001a\u00020&\u0012\u0006\u0010%\u001a\u00020\u0016\u0012\u0006\u00105\u001a\u00020\u0016\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bB\u0010FJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0016\u0010\u001a\u001a\u00020\u00128V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00128V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R!\u0010!\u001a\u0006\u0012\u0002\b\u00030\u001c8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u00128V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019R\u0016\u0010%\u001a\u00020\u00168V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001c\u0010+\u001a\u00020&8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u000e\u001a\u00020\r8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u00020\u00128V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0019R\u0018\u00109\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020\u00128V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0019R\u0016\u0010>\u001a\u00020\u00128V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0019R#\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u001e\u001a\u0004\b@\u0010 ¨\u0006G" }, d2 = { "Lkotlin/reflect/jvm/internal/l;", "Lkotlin/reflect/jvm/internal/f;", "", "Lkotlin/reflect/i;", "Lkotlin/jvm/internal/d0;", "Lkotlin/reflect/jvm/internal/c;", "Ljava/lang/reflect/Method;", "member", "Lkotlin/reflect/jvm/internal/calls/e$h;", "w0", "v0", "u0", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "descriptor", "Lkotlin/reflect/jvm/internal/calls/e;", "t0", "other", "", "equals", "", "hashCode", "", "toString", "n0", "()Z", "isBound", "isSuspend", "Lkotlin/reflect/jvm/internal/calls/d;", "L", "Lkotlin/reflect/jvm/internal/d0$b;", "i0", "()Lkotlin/reflect/jvm/internal/calls/d;", "caller", "isInfix", "getName", "()Ljava/lang/String;", "name", "Lkotlin/reflect/jvm/internal/k;", "N", "Lkotlin/reflect/jvm/internal/k;", "j0", "()Lkotlin/reflect/jvm/internal/k;", "container", "K", "Lkotlin/reflect/jvm/internal/d0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "getArity", "()I", "arity", "O", "Ljava/lang/String;", "signature", "isOperator", "P", "Ljava/lang/Object;", "rawBoundReceiver", "x0", "()Ljava/lang/Object;", "boundReceiver", "isInline", "isExternal", "M", "k0", "defaultCaller", "<init>", "(Lkotlin/reflect/jvm/internal/k;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "descriptorInitialValue", "(Lkotlin/reflect/jvm/internal/k;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "(Lkotlin/reflect/jvm/internal/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public final class l extends f<Object> implements d0<Object>, i<Object>, c
{
    static final /* synthetic */ kotlin.reflect.o[] Q;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.d0.a K;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.d0.b L;
    @org.jetbrains.annotations.f
    private final kotlin.reflect.jvm.internal.d0.b M;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.k N;
    private final String O;
    private final Object P;
    
    static {
        Q = new kotlin.reflect.o[] { k1.r(new f1(k1.d(l.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), k1.r(new f1(k1.d(l.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), k1.r(new f1(k1.d(l.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")) };
    }
    
    public l(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.k k, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, @org.jetbrains.annotations.f final Object o) {
        k0.p(k, "container");
        k0.p(s, "name");
        k0.p(s2, "signature");
        this(k, s, s2, null, o);
    }
    
    private l(final kotlin.reflect.jvm.internal.k n, final String s, final String o, final y y, final Object p5) {
        this.N = n;
        this.O = o;
        this.P = p5;
        this.K = (kotlin.reflect.jvm.internal.d0.a)kotlin.reflect.jvm.internal.d0.c(y, new a<y>() {
            final /* synthetic */ l G;
            
            public final y a() {
                return this.G.j0().K(s, l.s0(this.G));
            }
        });
        this.L = (kotlin.reflect.jvm.internal.d0.b)kotlin.reflect.jvm.internal.d0.b((a<Object>)new a<kotlin.reflect.jvm.internal.calls.d<? extends Member>>() {
            final /* synthetic */ l G;
            
            public final kotlin.reflect.jvm.internal.calls.d<Member> a() {
                final kotlin.reflect.jvm.internal.d g = h0.b.g(this.G.y0());
                Executable obj;
                if (g instanceof kotlin.reflect.jvm.internal.d.d) {
                    if (this.G.m0()) {
                        final Class<?> m = this.G.j0().m();
                        final List<kotlin.reflect.n> parameters = this.G.getParameters();
                        final ArrayList list = new ArrayList<String>(kotlin.collections.v.Y((Iterable<?>)parameters, 10));
                        final Iterator<Object> iterator = parameters.iterator();
                        while (iterator.hasNext()) {
                            final String name = iterator.next().getName();
                            k0.m(name);
                            list.add(name);
                        }
                        return (kotlin.reflect.jvm.internal.calls.d<Member>)new kotlin.reflect.jvm.internal.calls.a(m, list, a.a.H, a.b.H, null, 16, null);
                    }
                    obj = this.G.j0().C(((kotlin.reflect.jvm.internal.d.d)g).b());
                }
                else if (g instanceof kotlin.reflect.jvm.internal.d.e) {
                    final kotlin.reflect.jvm.internal.k j0 = this.G.j0();
                    final kotlin.reflect.jvm.internal.d.e e = (kotlin.reflect.jvm.internal.d.e)g;
                    obj = j0.L(e.c(), e.b());
                }
                else if (g instanceof kotlin.reflect.jvm.internal.d.c) {
                    obj = ((kotlin.reflect.jvm.internal.d.c)g).b();
                }
                else if (g instanceof kotlin.reflect.jvm.internal.d.b) {
                    obj = ((kotlin.reflect.jvm.internal.d.b)g).b();
                }
                else {
                    if (g instanceof kotlin.reflect.jvm.internal.d.a) {
                        final List<Method> b = ((kotlin.reflect.jvm.internal.d.a)g).b();
                        final Class<?> i = this.G.j0().m();
                        final ArrayList list2 = new ArrayList<String>(kotlin.collections.v.Y((Iterable<?>)b, 10));
                        for (final Method method : b) {
                            k0.o(method, "it");
                            list2.add(method.getName());
                        }
                        return (kotlin.reflect.jvm.internal.calls.d<Member>)new kotlin.reflect.jvm.internal.calls.a(i, (List<String>)list2, a.a.H, kotlin.reflect.jvm.internal.calls.a.b.G, b);
                    }
                    throw new kotlin.h0();
                }
                kotlin.reflect.jvm.internal.calls.e e2;
                if (obj instanceof Constructor) {
                    final l g2 = this.G;
                    e2 = g2.t0((Constructor)obj, g2.y0());
                }
                else {
                    if (!(obj instanceof Method)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Could not compute caller for function: ");
                        sb.append(this.G.y0());
                        sb.append(" (member = ");
                        sb.append(obj);
                        sb.append(')');
                        throw new b0(sb.toString());
                    }
                    final Method method2 = (Method)obj;
                    if (!Modifier.isStatic(method2.getModifiers())) {
                        e2 = l.this.u0(method2);
                    }
                    else if (this.G.y0().getAnnotations().a0(kotlin.reflect.jvm.internal.k0.h()) != null) {
                        e2 = l.this.v0(method2);
                    }
                    else {
                        e2 = l.this.w0(method2);
                    }
                }
                return (kotlin.reflect.jvm.internal.calls.d<Member>)kotlin.reflect.jvm.internal.calls.h.c(e2, this.G.y0(), false, 2, null);
            }
        });
        this.M = (kotlin.reflect.jvm.internal.d0.b)kotlin.reflect.jvm.internal.d0.b((a<Object>)new a<kotlin.reflect.jvm.internal.calls.d<? extends Member>>() {
            final /* synthetic */ l G;
            
            @org.jetbrains.annotations.f
            public final kotlin.reflect.jvm.internal.calls.d<Member> a() {
                final kotlin.reflect.jvm.internal.d g = h0.b.g(this.G.y0());
                final boolean b = g instanceof kotlin.reflect.jvm.internal.d.e;
                kotlin.reflect.jvm.internal.calls.d<Member> b2 = null;
                Executable executable;
                if (b) {
                    final kotlin.reflect.jvm.internal.k j0 = this.G.j0();
                    final kotlin.reflect.jvm.internal.d.e e = (kotlin.reflect.jvm.internal.d.e)g;
                    final String c = e.c();
                    final String b3 = e.b();
                    final Object b4 = this.G.i0().b();
                    k0.m(b4);
                    executable = j0.I(c, b3, Modifier.isStatic(((Member)b4).getModifiers()) ^ true);
                }
                else if (g instanceof kotlin.reflect.jvm.internal.d.d) {
                    if (this.G.m0()) {
                        final Class<?> m = this.G.j0().m();
                        final List<kotlin.reflect.n> parameters = this.G.getParameters();
                        final ArrayList list = new ArrayList<String>(kotlin.collections.v.Y((Iterable<?>)parameters, 10));
                        final Iterator<Object> iterator = parameters.iterator();
                        while (iterator.hasNext()) {
                            final String name = iterator.next().getName();
                            k0.m(name);
                            list.add(name);
                        }
                        return (kotlin.reflect.jvm.internal.calls.d<Member>)new kotlin.reflect.jvm.internal.calls.a(m, list, a.a.G, kotlin.reflect.jvm.internal.calls.a.b.H, null, 16, null);
                    }
                    executable = this.G.j0().G(((kotlin.reflect.jvm.internal.d.d)g).b());
                }
                else {
                    if (g instanceof kotlin.reflect.jvm.internal.d.a) {
                        final List<Method> b5 = ((kotlin.reflect.jvm.internal.d.a)g).b();
                        final Class<?> i = this.G.j0().m();
                        final ArrayList list2 = new ArrayList<String>(kotlin.collections.v.Y((Iterable<?>)b5, 10));
                        for (final Method method : b5) {
                            k0.o(method, "it");
                            list2.add(method.getName());
                        }
                        return (kotlin.reflect.jvm.internal.calls.d<Member>)new kotlin.reflect.jvm.internal.calls.a(i, (List<String>)list2, a.a.G, kotlin.reflect.jvm.internal.calls.a.b.G, b5);
                    }
                    executable = null;
                }
                kotlin.reflect.jvm.internal.calls.e<? extends M> e2 = null;
                Label_0489: {
                    if (executable instanceof Constructor) {
                        final l g2 = this.G;
                        e2 = (kotlin.reflect.jvm.internal.calls.e<? extends M>)g2.t0((Constructor)executable, g2.y0());
                    }
                    else if (executable instanceof Method) {
                        if (this.G.y0().getAnnotations().a0(kotlin.reflect.jvm.internal.k0.h()) != null) {
                            final kotlin.reflect.jvm.internal.impl.descriptors.m c2 = this.G.y0().c();
                            Objects.requireNonNull(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            if (!((kotlin.reflect.jvm.internal.impl.descriptors.e)c2).G()) {
                                e2 = (kotlin.reflect.jvm.internal.calls.e<? extends M>)l.this.v0((Method)executable);
                                break Label_0489;
                            }
                        }
                        e2 = (kotlin.reflect.jvm.internal.calls.e<? extends M>)l.this.w0((Method)executable);
                    }
                    else {
                        e2 = null;
                    }
                }
                if (e2 != null) {
                    b2 = kotlin.reflect.jvm.internal.calls.h.b((kotlin.reflect.jvm.internal.calls.d<? extends Member>)e2, (b)this.G.y0(), true);
                }
                return b2;
            }
        });
    }
    
    public l(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.k k, @org.jetbrains.annotations.e final y y) {
        k0.p(k, "container");
        k0.p(y, "descriptor");
        final String d = y.getName().d();
        k0.o(d, "descriptor.name.asString()");
        this(k, d, h0.b.g(y).a(), y, null, 16, null);
    }
    
    public static final /* synthetic */ String s0(final l l) {
        return l.O;
    }
    
    private final kotlin.reflect.jvm.internal.calls.e<Constructor<?>> t0(final Constructor<?> constructor, final y y) {
        kotlin.reflect.jvm.internal.calls.e<Constructor<?>> e;
        if (kotlin.reflect.jvm.internal.impl.resolve.jvm.a.f((b)y)) {
            if (this.n0()) {
                e = new kotlin.reflect.jvm.internal.calls.e.a(constructor, this.x0());
            }
            else {
                e = new kotlin.reflect.jvm.internal.calls.e.b(constructor);
            }
        }
        else if (this.n0()) {
            e = new kotlin.reflect.jvm.internal.calls.e.c(constructor, this.x0());
        }
        else {
            e = new kotlin.reflect.jvm.internal.calls.e.e(constructor);
        }
        return e;
    }
    
    private final kotlin.reflect.jvm.internal.calls.e.h u0(final Method method) {
        kotlin.reflect.jvm.internal.calls.e.h h;
        if (this.n0()) {
            h = new kotlin.reflect.jvm.internal.calls.e.h.a(method, this.x0());
        }
        else {
            h = new kotlin.reflect.jvm.internal.calls.e.h.d(method);
        }
        return h;
    }
    
    private final kotlin.reflect.jvm.internal.calls.e.h v0(final Method method) {
        kotlin.reflect.jvm.internal.calls.e.h h;
        if (this.n0()) {
            h = new kotlin.reflect.jvm.internal.calls.e.h.b(method);
        }
        else {
            h = new kotlin.reflect.jvm.internal.calls.e.h.e(method);
        }
        return h;
    }
    
    private final kotlin.reflect.jvm.internal.calls.e.h w0(final Method method) {
        kotlin.reflect.jvm.internal.calls.e.h h;
        if (this.n0()) {
            h = new kotlin.reflect.jvm.internal.calls.e.h.c(method, this.x0());
        }
        else {
            h = new kotlin.reflect.jvm.internal.calls.e.h.f(method);
        }
        return h;
    }
    
    private final Object x0() {
        return kotlin.reflect.jvm.internal.calls.h.a(this.P, this.y0());
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object C(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7, @org.jetbrains.annotations.f final Object o8, @org.jetbrains.annotations.f final Object o9, @org.jetbrains.annotations.f final Object o10, @org.jetbrains.annotations.f final Object o11, @org.jetbrains.annotations.f final Object o12, @org.jetbrains.annotations.f final Object o13, @org.jetbrains.annotations.f final Object o14, @org.jetbrains.annotations.f final Object o15, @org.jetbrains.annotations.f final Object o16, @org.jetbrains.annotations.f final Object o17, @org.jetbrains.annotations.f final Object o18, @org.jetbrains.annotations.f final Object o19) {
        return a.t(this, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object G(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7, @org.jetbrains.annotations.f final Object o8, @org.jetbrains.annotations.f final Object o9, @org.jetbrains.annotations.f final Object o10, @org.jetbrains.annotations.f final Object o11, @org.jetbrains.annotations.f final Object o12, @org.jetbrains.annotations.f final Object o13, @org.jetbrains.annotations.f final Object o14, @org.jetbrains.annotations.f final Object o15, @org.jetbrains.annotations.f final Object o16) {
        return a.q(this, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object I(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4) {
        return a.e(this, o, o2, o3, o4);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object K(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7, @org.jetbrains.annotations.f final Object o8) {
        return a.i(this, o, o2, o3, o4, o5, o6, o7, o8);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object L(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7, @org.jetbrains.annotations.f final Object o8, @org.jetbrains.annotations.f final Object o9, @org.jetbrains.annotations.f final Object o10, @org.jetbrains.annotations.f final Object o11, @org.jetbrains.annotations.f final Object o12, @org.jetbrains.annotations.f final Object o13, @org.jetbrains.annotations.f final Object o14, @org.jetbrains.annotations.f final Object o15, @org.jetbrains.annotations.f final Object o16, @org.jetbrains.annotations.f final Object o17, @org.jetbrains.annotations.f final Object o18, @org.jetbrains.annotations.f final Object o19, @org.jetbrains.annotations.f final Object o20) {
        return a.u(this, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object N(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7, @org.jetbrains.annotations.f final Object o8, @org.jetbrains.annotations.f final Object o9, @org.jetbrains.annotations.f final Object o10, @org.jetbrains.annotations.f final Object o11, @org.jetbrains.annotations.f final Object o12, @org.jetbrains.annotations.f final Object o13, @org.jetbrains.annotations.f final Object o14, @org.jetbrains.annotations.f final Object o15, @org.jetbrains.annotations.f final Object o16, @org.jetbrains.annotations.f final Object o17, @org.jetbrains.annotations.f final Object o18, @org.jetbrains.annotations.f final Object o19, @org.jetbrains.annotations.f final Object o20, @org.jetbrains.annotations.f final Object o21, @org.jetbrains.annotations.f final Object o22) {
        return a.w(this, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object O(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7, @org.jetbrains.annotations.f final Object o8, @org.jetbrains.annotations.f final Object o9, @org.jetbrains.annotations.f final Object o10, @org.jetbrains.annotations.f final Object o11, @org.jetbrains.annotations.f final Object o12, @org.jetbrains.annotations.f final Object o13) {
        return a.n(this, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object P(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6) {
        return a.g(this, o, o2, o3, o4, o5, o6);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object Q(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7, @org.jetbrains.annotations.f final Object o8, @org.jetbrains.annotations.f final Object o9, @org.jetbrains.annotations.f final Object o10, @org.jetbrains.annotations.f final Object o11, @org.jetbrains.annotations.f final Object o12, @org.jetbrains.annotations.f final Object o13, @org.jetbrains.annotations.f final Object o14) {
        return a.o(this, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object R(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7, @org.jetbrains.annotations.f final Object o8, @org.jetbrains.annotations.f final Object o9, @org.jetbrains.annotations.f final Object o10, @org.jetbrains.annotations.f final Object o11, @org.jetbrains.annotations.f final Object o12, @org.jetbrains.annotations.f final Object o13, @org.jetbrains.annotations.f final Object o14, @org.jetbrains.annotations.f final Object o15, @org.jetbrains.annotations.f final Object o16, @org.jetbrains.annotations.f final Object o17) {
        return a.r(this, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object T(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7, @org.jetbrains.annotations.f final Object o8, @org.jetbrains.annotations.f final Object o9) {
        return a.j(this, o, o2, o3, o4, o5, o6, o7, o8, o9);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object U(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5) {
        return a.f(this, o, o2, o3, o4, o5);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object V(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7, @org.jetbrains.annotations.f final Object o8, @org.jetbrains.annotations.f final Object o9, @org.jetbrains.annotations.f final Object o10, @org.jetbrains.annotations.f final Object o11, @org.jetbrains.annotations.f final Object o12, @org.jetbrains.annotations.f final Object o13, @org.jetbrains.annotations.f final Object o14, @org.jetbrains.annotations.f final Object o15, @org.jetbrains.annotations.f final Object o16, @org.jetbrains.annotations.f final Object o17, @org.jetbrains.annotations.f final Object o18, @org.jetbrains.annotations.f final Object o19, @org.jetbrains.annotations.f final Object o20, @org.jetbrains.annotations.f final Object o21) {
        return a.v(this, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object Y(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7) {
        return a.h(this, o, o2, o3, o4, o5, o6, o7);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object a0(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7, @org.jetbrains.annotations.f final Object o8, @org.jetbrains.annotations.f final Object o9, @org.jetbrains.annotations.f final Object o10) {
        return a.k(this, o, o2, o3, o4, o5, o6, o7, o8, o9, o10);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object e0(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7, @org.jetbrains.annotations.f final Object o8, @org.jetbrains.annotations.f final Object o9, @org.jetbrains.annotations.f final Object o10, @org.jetbrains.annotations.f final Object o11, @org.jetbrains.annotations.f final Object o12, @org.jetbrains.annotations.f final Object o13, @org.jetbrains.annotations.f final Object o14, @org.jetbrains.annotations.f final Object o15) {
        return a.p(this, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        final l b = kotlin.reflect.jvm.internal.k0.b(o);
        boolean b3;
        final boolean b2 = b3 = false;
        if (b != null) {
            b3 = b2;
            if (k0.g(this.j0(), b.j0())) {
                b3 = b2;
                if (k0.g(this.getName(), b.getName())) {
                    b3 = b2;
                    if (k0.g(this.O, b.O)) {
                        b3 = b2;
                        if (k0.g(this.P, b.P)) {
                            b3 = true;
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public int getArity() {
        return kotlin.reflect.jvm.internal.calls.f.a(this.i0());
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String getName() {
        final String d = this.y0().getName().d();
        k0.o(d, "descriptor.name.asString()");
        return d;
    }
    
    @Override
    public int hashCode() {
        return (this.j0().hashCode() * 31 + this.getName().hashCode()) * 31 + this.O.hashCode();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.calls.d<?> i0() {
        return (kotlin.reflect.jvm.internal.calls.d<?>)((kotlin.reflect.jvm.internal.d0.c)this.L).b(this, l.Q[1]);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object invoke() {
        return a.a(this);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object invoke(@org.jetbrains.annotations.f final Object o) {
        return a.b(this, o);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object invoke(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2) {
        return a.c(this, o, o2);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object invoke(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3) {
        return a.d(this, o, o2, o3);
    }
    
    @Override
    public boolean isExternal() {
        return this.y0().isExternal();
    }
    
    @Override
    public boolean isInfix() {
        return this.y0().isInfix();
    }
    
    @Override
    public boolean isInline() {
        return this.y0().isInline();
    }
    
    @Override
    public boolean isOperator() {
        return this.y0().isOperator();
    }
    
    @Override
    public boolean isSuspend() {
        return this.y0().isSuspend();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.k j0() {
        return this.N;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public kotlin.reflect.jvm.internal.calls.d<?> k0() {
        return (kotlin.reflect.jvm.internal.calls.d<?>)((kotlin.reflect.jvm.internal.d0.c)this.M).b(this, l.Q[2]);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object m(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7, @org.jetbrains.annotations.f final Object o8, @org.jetbrains.annotations.f final Object o9, @org.jetbrains.annotations.f final Object o10, @org.jetbrains.annotations.f final Object o11) {
        return a.l(this, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
    }
    
    @Override
    public boolean n0() {
        return k0.g(this.P, kotlin.jvm.internal.q.NO_RECEIVER) ^ true;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object r(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7, @org.jetbrains.annotations.f final Object o8, @org.jetbrains.annotations.f final Object o9, @org.jetbrains.annotations.f final Object o10, @org.jetbrains.annotations.f final Object o11, @org.jetbrains.annotations.f final Object o12, @org.jetbrains.annotations.f final Object o13, @org.jetbrains.annotations.f final Object o14, @org.jetbrains.annotations.f final Object o15, @org.jetbrains.annotations.f final Object o16, @org.jetbrains.annotations.f final Object o17, @org.jetbrains.annotations.f final Object o18) {
        return a.s(this, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        return g0.b.d(this.y0());
    }
    
    @org.jetbrains.annotations.e
    public y y0() {
        return (y)((kotlin.reflect.jvm.internal.d0.c)this.K).b(this, l.Q[0]);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object z(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2, @org.jetbrains.annotations.f final Object o3, @org.jetbrains.annotations.f final Object o4, @org.jetbrains.annotations.f final Object o5, @org.jetbrains.annotations.f final Object o6, @org.jetbrains.annotations.f final Object o7, @org.jetbrains.annotations.f final Object o8, @org.jetbrains.annotations.f final Object o9, @org.jetbrains.annotations.f final Object o10, @org.jetbrains.annotations.f final Object o11, @org.jetbrains.annotations.f final Object o12) {
        return a.m(this, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
    }
}
