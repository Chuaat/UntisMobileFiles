// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.calls;

import java.util.Arrays;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.ranges.o;
import kotlin.reflect.jvm.internal.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.l;
import java.lang.reflect.Method;
import kotlin.ranges.k;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.resolve.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.Metadata;
import java.lang.reflect.Member;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0011B%\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0016R\u0016\u0010\u0019\u001a\u00028\u00008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00158V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006!" }, d2 = { "Lkotlin/reflect/jvm/internal/calls/g;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/d;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "b", "Lkotlin/reflect/jvm/internal/calls/d;", "caller", "", "c", "Z", "isDefault", "Lkotlin/reflect/jvm/internal/calls/g$a;", "a", "Lkotlin/reflect/jvm/internal/calls/g$a;", "data", "", "Ljava/lang/reflect/Type;", "()Ljava/util/List;", "parameterTypes", "()Ljava/lang/reflect/Member;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "descriptor", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/d;Z)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public final class g<M extends Member> implements d<M>
{
    private final a a;
    private final d<M> b;
    private final boolean c;
    
    public g(@e final b obj, @e final d<? extends M> b, final boolean c) {
        k0.p(obj, "descriptor");
        k0.p(b, "caller");
        this.b = (d<M>)b;
        this.c = c;
        final c0 returnType = obj.getReturnType();
        k0.m(returnType);
        k0.o(returnType, "descriptor.returnType!!");
        final Class<?> i = h.i(returnType);
        Method d;
        if (i != null) {
            d = h.d(i, obj);
        }
        else {
            d = null;
        }
        final boolean a = f.a((kotlin.reflect.jvm.internal.impl.descriptors.a)obj);
        final int n = 0;
        a a2;
        if (a) {
            a2 = new a(k.L.a(), new Method[0], d);
        }
        else {
            final boolean b2 = b instanceof kotlin.reflect.jvm.internal.calls.e.h.c;
            int a3 = -1;
            int n2 = 1;
            Label_0194: {
                if (!b2) {
                    if (obj instanceof l) {
                        if (b instanceof c) {
                            break Label_0194;
                        }
                    }
                    else if (obj.j0() != null && !(b instanceof c)) {
                        final m c2 = obj.c();
                        k0.o(c2, "descriptor.containingDeclaration");
                        if (!f.b(c2)) {
                            a3 = 1;
                            break Label_0194;
                        }
                    }
                    a3 = 0;
                }
            }
            int n3;
            if (c) {
                n3 = 2;
            }
            else {
                n3 = 0;
            }
            if (!(obj instanceof y) || !((y)obj).isSuspend()) {
                n2 = 0;
            }
            final ArrayList<c0> list = new ArrayList<c0>();
            final t0 q0 = obj.q0();
            Object e;
            if (q0 != null) {
                e = q0.a();
            }
            else {
                e = null;
            }
            Label_0367: {
                if (e == null) {
                    m obj2;
                    if (obj instanceof l) {
                        final kotlin.reflect.jvm.internal.impl.descriptors.e j = ((l)obj).I();
                        k0.o(j, "descriptor.constructedClass");
                        if (!j.u()) {
                            break Label_0367;
                        }
                        obj2 = j.c();
                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    }
                    else {
                        obj2 = obj.c();
                        k0.o(obj2, "descriptor.containingDeclaration");
                        if (!(obj2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) || !f.b(obj2)) {
                            break Label_0367;
                        }
                    }
                    e = ((kotlin.reflect.jvm.internal.impl.descriptors.e)obj2).A();
                }
                list.add((c0)e);
            }
            final List<e1> m = obj.m();
            k0.o(m, "descriptor.valueParameters");
            final Iterator<Object> iterator = m.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().a());
            }
            final int k = list.size() + a3 + (n3 + n2);
            if (kotlin.reflect.jvm.internal.calls.f.a(this) != k) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent number of parameters in the descriptor and Java reflection object: ");
                sb.append(kotlin.reflect.jvm.internal.calls.f.a(this));
                sb.append(" != ");
                sb.append(k);
                sb.append('\n');
                sb.append("Calling: ");
                sb.append(obj);
                sb.append('\n');
                sb.append("Parameter types: ");
                sb.append(this.a());
                sb.append(")\n");
                sb.append("Default: ");
                sb.append(this.c);
                throw new b0(sb.toString());
            }
            final k n4 = o.n1(Math.max(a3, 0), list.size() + a3);
            final Method[] array = new Method[k];
            for (int l = n; l < k; ++l) {
                Method f = null;
                Label_0531: {
                    if (n4.r(l)) {
                        final Class<?> i2 = h.i(list.get(l - a3));
                        if (i2 != null) {
                            f = h.f(i2, obj);
                            break Label_0531;
                        }
                    }
                    f = null;
                }
                array[l] = f;
            }
            a2 = new a(n4, array, d);
        }
        this.a = a2;
    }
    
    @e
    @Override
    public List<Type> a() {
        return this.b.a();
    }
    
    @Override
    public M b() {
        return this.b.b();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object call(@e final Object[] original) {
        k0.p(original, "args");
        final a a = this.a;
        final k a2 = a.a();
        final Method[] b = a.b();
        final Method c = a.c();
        final Object[] copy = Arrays.copyOf(original, original.length);
        k0.o(copy, "java.util.Arrays.copyOf(this, size)");
        Objects.requireNonNull(copy, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int k = a2.k();
        final int n = a2.n();
        if (k <= n) {
            while (true) {
                final Method method = b[k];
                Object o;
                final Object obj = o = original[k];
                if (method != null) {
                    if (obj != null) {
                        o = method.invoke(obj, new Object[0]);
                    }
                    else {
                        final Class<?> returnType = method.getReturnType();
                        k0.o(returnType, "method.returnType");
                        o = kotlin.reflect.jvm.internal.k0.e(returnType);
                    }
                }
                copy[k] = o;
                if (k == n) {
                    break;
                }
                ++k;
            }
        }
        Object call;
        final Object o2 = call = this.b.call(copy);
        if (c != null) {
            final Object invoke = c.invoke(null, o2);
            call = o2;
            if (invoke != null) {
                call = invoke;
            }
        }
        return call;
    }
    
    @e
    @Override
    public Type getReturnType() {
        return this.b.getReturnType();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0086\u0002R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0016" }, d2 = { "kotlin/reflect/jvm/internal/calls/g$a", "", "Lkotlin/ranges/k;", "a", "", "Ljava/lang/reflect/Method;", "b", "()[Ljava/lang/reflect/Method;", "c", "Lkotlin/ranges/k;", "getArgumentRange", "()Lkotlin/ranges/k;", "argumentRange", "Ljava/lang/reflect/Method;", "getBox", "()Ljava/lang/reflect/Method;", "box", "[Ljava/lang/reflect/Method;", "getUnbox", "unbox", "<init>", "(Lkotlin/ranges/k;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    private static final class a
    {
        @e
        private final k a;
        @e
        private final Method[] b;
        @org.jetbrains.annotations.f
        private final Method c;
        
        public a(@e final k a, @e final Method[] b, @org.jetbrains.annotations.f final Method c) {
            k0.p(a, "argumentRange");
            k0.p(b, "unbox");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @e
        public final k a() {
            return this.a;
        }
        
        @e
        public final Method[] b() {
            return this.b;
        }
        
        @org.jetbrains.annotations.f
        public final Method c() {
            return this.c;
        }
    }
}
