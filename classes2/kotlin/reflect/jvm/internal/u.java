// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.j;
import kotlin.j2;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.i;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.calls.d;
import kotlin.jvm.internal.q;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e$a;
import kotlin.reflect.jvm.internal.impl.load.java.l;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import java.lang.reflect.Field;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.reflect.o;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b \u0018\u0000 L*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004MNOPB\u0019\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010F\u001a\u000202¢\u0006\u0004\bG\u0010HB5\b\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010=\u001a\u00020\u000f\u0012\u0006\u0010C\u001a\u00020\u000f\u0012\b\u0010I\u001a\u0004\u0018\u000102\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bG\u0010JB+\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010=\u001a\u00020\u000f\u0012\u0006\u0010C\u001a\u00020\u000f\u0012\b\u00100\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bG\u0010KJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004J\u001e\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0004J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0016\u0010\u0013\u001a\u00020\u000b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u000b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u001c\u0010\u001f\u001a\u00020\u001a8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u0006\u0012\u0002\b\u00030 8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0015\u0010)\u001a\u0004\u0018\u00010\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0015\u00100\u001a\u0004\u0018\u00010\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b.\u0010/R$\u00106\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010202018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00108\u001a\b\u0012\u0002\b\u0003\u0018\u00010 8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\"R\u001c\u0010=\u001a\u00020\u000f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020\u000b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0012R\u0016\u0010@\u001a\u00020\u000b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0012R\u0019\u0010C\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bB\u0010<R\u0016\u0010F\u001a\u0002028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006Q" }, d2 = { "Lkotlin/reflect/jvm/internal/u;", "V", "Lkotlin/reflect/jvm/internal/f;", "Lkotlin/reflect/o;", "Ljava/lang/reflect/Field;", "p0", "field", "", "receiver", "r0", "other", "", "equals", "", "hashCode", "", "toString", "n0", "()Z", "isBound", "Lkotlin/reflect/jvm/internal/u$c;", "t0", "()Lkotlin/reflect/jvm/internal/u$c;", "getter", "p", "isConst", "Lkotlin/reflect/jvm/internal/k;", "M", "Lkotlin/reflect/jvm/internal/k;", "j0", "()Lkotlin/reflect/jvm/internal/k;", "container", "Lkotlin/reflect/jvm/internal/calls/d;", "i0", "()Lkotlin/reflect/jvm/internal/calls/d;", "caller", "P", "Ljava/lang/Object;", "rawBoundReceiver", "u0", "()Ljava/lang/reflect/Field;", "javaField", "Lkotlin/reflect/jvm/internal/d0$b;", "K", "Lkotlin/reflect/jvm/internal/d0$b;", "_javaField", "q0", "()Ljava/lang/Object;", "boundReceiver", "Lkotlin/reflect/jvm/internal/d0$a;", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "kotlin.jvm.PlatformType", "L", "Lkotlin/reflect/jvm/internal/d0$a;", "_descriptor", "k0", "defaultCaller", "N", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "isSuspend", "X", "isLateinit", "O", "v0", "signature", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/k;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "(Lkotlin/reflect/jvm/internal/k;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "(Lkotlin/reflect/jvm/internal/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "R", "a", "b", "c", "d", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public abstract class u<V> extends f<V> implements o<V>
{
    @e
    private static final Object Q;
    @e
    public static final b R;
    private final d0.b<Field> K;
    private final d0.a<q0> L;
    @e
    private final k M;
    @e
    private final String N;
    @e
    private final String O;
    private final Object P;
    
    static {
        R = new b(null);
        Q = new Object();
    }
    
    public u(@e final k k, @e final String s, @e final String s2, @org.jetbrains.annotations.f final Object o) {
        k0.p(k, "container");
        k0.p(s, "name");
        k0.p(s2, "signature");
        this(k, s, s2, null, o);
    }
    
    private u(final k m, final String n, final String o, final q0 q0, final Object p5) {
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p5;
        final d0.b<Field> b = d0.b((n6.a<Field>)new n6.a<Field>() {
            final /* synthetic */ u G;
            
            @org.jetbrains.annotations.f
            public final Field a() {
                final kotlin.reflect.jvm.internal.e f = h0.b.f(this.G.s0());
                final boolean b = f instanceof kotlin.reflect.jvm.internal.e.c;
                final Field field = null;
                Label_0176: {
                    if (!b) {
                        break Label_0176;
                    }
                    final kotlin.reflect.jvm.internal.e.c c = (kotlin.reflect.jvm.internal.e.c)f;
                    final q0 b2 = c.b();
                    final e$a d = h.d(h.a, c.e(), c.d(), c.g(), false, 8, (Object)null);
                    Field field2 = field;
                    if (d == null) {
                        return field2;
                    }
                    Class<?> clazz;
                    if (!l.e(b2) && !h.f(c.e())) {
                        final m c2 = b2.c();
                        if (c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                            clazz = kotlin.reflect.jvm.internal.k0.n((kotlin.reflect.jvm.internal.impl.descriptors.e)c2);
                        }
                        else {
                            clazz = this.G.j0().m();
                        }
                    }
                    else {
                        clazz = this.G.j0().m().getEnclosingClass();
                    }
                    field2 = field;
                    if (clazz == null) {
                        return field2;
                    }
                    try {
                        field2 = clazz.getDeclaredField(d.c());
                        return field2;
                        Label_0206: {
                            return field;
                        }
                        // iftrue(Label_0217:, !f instanceof e.d)
                        Label_0194: {
                            return field;
                        }
                        // iftrue(Label_0206:, !f instanceof e.b)
                        field2 = field;
                        return field2;
                        Label_0217: {
                            throw new kotlin.h0();
                        }
                        // iftrue(Label_0194:, !f instanceof e.a)
                        field2 = ((kotlin.reflect.jvm.internal.e.a)f).b();
                        return field2;
                        field2 = field;
                        return field2;
                    }
                    catch (NoSuchFieldException ex) {
                        field2 = field;
                        return field2;
                    }
                }
            }
        });
        k0.o(b, "ReflectProperties.lazy {\u2026y -> null\n        }\n    }");
        this.K = b;
        final d0.a<q0> c = d0.c(q0, new n6.a<q0>() {
            final /* synthetic */ u G;
            
            public final q0 a() {
                return this.G.j0().N(this.G.getName(), this.G.v0());
            }
        });
        k0.o(c, "ReflectProperties.lazySo\u2026or(name, signature)\n    }");
        this.L = c;
    }
    
    public u(@e final k k, @e final q0 q0) {
        k0.p(k, "container");
        k0.p(q0, "descriptor");
        final String d = q0.getName().d();
        k0.o(d, "descriptor.name.asString()");
        this(k, d, h0.b.f(q0).a(), q0, q.NO_RECEIVER);
    }
    
    public static final /* synthetic */ Object o0() {
        return u.Q;
    }
    
    @Override
    public boolean X() {
        return this.s0().v0();
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        final u<?> c = kotlin.reflect.jvm.internal.k0.c(o);
        boolean b2;
        final boolean b = b2 = false;
        if (c != null) {
            b2 = b;
            if (k0.g(this.j0(), c.j0())) {
                b2 = b;
                if (k0.g(this.getName(), c.getName())) {
                    b2 = b;
                    if (k0.g(this.O, c.O)) {
                        b2 = b;
                        if (k0.g(this.P, c.P)) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    @e
    @Override
    public String getName() {
        return this.N;
    }
    
    @Override
    public int hashCode() {
        return (this.j0().hashCode() * 31 + this.getName().hashCode()) * 31 + this.O.hashCode();
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.calls.d<?> i0() {
        return this.t0().i0();
    }
    
    @Override
    public boolean isSuspend() {
        return false;
    }
    
    @e
    @Override
    public k j0() {
        return this.M;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public kotlin.reflect.jvm.internal.calls.d<?> k0() {
        return this.t0().k0();
    }
    
    @Override
    public boolean n0() {
        return k0.g(this.P, q.NO_RECEIVER) ^ true;
    }
    
    @Override
    public boolean p() {
        return this.s0().p();
    }
    
    @org.jetbrains.annotations.f
    protected final Field p0() {
        Field u0;
        if (this.s0().S()) {
            u0 = this.u0();
        }
        else {
            u0 = null;
        }
        return u0;
    }
    
    @org.jetbrains.annotations.f
    public final Object q0() {
        return kotlin.reflect.jvm.internal.calls.h.a(this.P, this.s0());
    }
    
    @org.jetbrains.annotations.f
    protected final Object r0(@org.jetbrains.annotations.f final Field field, @org.jetbrains.annotations.f Object obj) {
        try {
            if (obj == u.Q && this.s0().q0() == null) {
                obj = new StringBuilder();
                ((StringBuilder)obj).append('\'');
                ((StringBuilder)obj).append(this);
                ((StringBuilder)obj).append("' is not an extension property and thus getExtensionDelegate() ");
                ((StringBuilder)obj).append("is not going to work, use getDelegate() instead");
                throw new RuntimeException(((StringBuilder)obj).toString());
            }
            Object value;
            if (field != null) {
                value = field.get(obj);
            }
            else {
                value = null;
            }
            return value;
        }
        catch (IllegalAccessException ex) {
            throw new kotlin.reflect.full.b(ex);
        }
    }
    
    @e
    public q0 s0() {
        final q0 invoke = this.L.invoke();
        k0.o(invoke, "_descriptor()");
        return invoke;
    }
    
    @e
    public abstract c<V> t0();
    
    @e
    @Override
    public String toString() {
        return g0.b.g(this.s0());
    }
    
    @org.jetbrains.annotations.f
    public final Field u0() {
        return this.K.invoke();
    }
    
    @e
    public final String v0() {
        return this.O;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0007\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0016\u0010\u0011\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0016\u0010\u0012\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u001c\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00138V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!" }, d2 = { "kotlin/reflect/jvm/internal/u$a", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/f;", "Lkotlin/reflect/o$a;", "Lkotlin/reflect/i;", "", "isInline", "()Z", "isExternal", "isOperator", "Lkotlin/reflect/jvm/internal/u;", "p0", "()Lkotlin/reflect/jvm/internal/u;", "property", "isSuspend", "n0", "isBound", "isInfix", "Lkotlin/reflect/jvm/internal/calls/d;", "k0", "()Lkotlin/reflect/jvm/internal/calls/d;", "defaultCaller", "Lkotlin/reflect/jvm/internal/k;", "j0", "()Lkotlin/reflect/jvm/internal/k;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/p0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public abstract static class a<PropertyType, ReturnType> extends f<ReturnType> implements i<ReturnType>, o.a<PropertyType>
    {
        @Override
        public boolean isExternal() {
            return this.o0().isExternal();
        }
        
        @Override
        public boolean isInfix() {
            return this.o0().isInfix();
        }
        
        @Override
        public boolean isInline() {
            return this.o0().isInline();
        }
        
        @Override
        public boolean isOperator() {
            return this.o0().isOperator();
        }
        
        @Override
        public boolean isSuspend() {
            return this.o0().isSuspend();
        }
        
        @e
        @Override
        public k j0() {
            return this.p0().j0();
        }
        
        @org.jetbrains.annotations.f
        @Override
        public kotlin.reflect.jvm.internal.calls.d<?> k0() {
            return null;
        }
        
        @Override
        public boolean n0() {
            return this.p0().n0();
        }
        
        @e
        public abstract p0 o0();
        
        @e
        public abstract u<PropertyType> p0();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0002\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b" }, d2 = { "kotlin/reflect/jvm/internal/u$b", "", "EXTENSION_PROPERTY_DELEGATE", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "<init>", "()V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class b
    {
        private b() {
        }
        
        @e
        public final Object a() {
            return u.o0();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0014\u0010\u0015R!\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00048V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\u00020\u000e8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016" }, d2 = { "kotlin/reflect/jvm/internal/u$c", "V", "Lkotlin/reflect/jvm/internal/u$a;", "Lkotlin/reflect/o$c;", "Lkotlin/reflect/jvm/internal/calls/d;", "L", "Lkotlin/reflect/jvm/internal/d0$b;", "i0", "()Lkotlin/reflect/jvm/internal/calls/d;", "caller", "", "getName", "()Ljava/lang/String;", "name", "Lkotlin/reflect/jvm/internal/impl/descriptors/r0;", "K", "Lkotlin/reflect/jvm/internal/d0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public abstract static class c<V> extends u.a<V, V> implements o.c<V>
    {
        static final /* synthetic */ o[] M;
        @e
        private final d0.a K;
        @e
        private final d0.b L;
        
        static {
            M = new o[] { k1.r(new f1(k1.d(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), k1.r(new f1(k1.d(c.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")) };
        }
        
        public c() {
            this.K = (d0.a)d0.d((a<Object>)new a<r0>() {
                final /* synthetic */ c G;
                
                public final r0 a() {
                    r0 r0 = this.G.p0().s0().e();
                    if (r0 == null) {
                        r0 = kotlin.reflect.jvm.internal.impl.resolve.c.b(this.G.p0().s0(), g.r.b());
                    }
                    return r0;
                }
            });
            this.L = (d0.b)d0.b((a<Object>)new a<kotlin.reflect.jvm.internal.calls.d<?>>() {
                final /* synthetic */ c G;
                
                public final kotlin.reflect.jvm.internal.calls.d<?> a() {
                    return (kotlin.reflect.jvm.internal.calls.d<?>)v.a(this.G, true);
                }
            });
        }
        
        @e
        @Override
        public String getName() {
            final StringBuilder sb = new StringBuilder();
            sb.append("<get-");
            sb.append(this.p0().getName());
            sb.append('>');
            return sb.toString();
        }
        
        @e
        @Override
        public kotlin.reflect.jvm.internal.calls.d<?> i0() {
            return (kotlin.reflect.jvm.internal.calls.d<?>)((d0.c)this.L).b(this, c.M[1]);
        }
        
        @e
        public r0 q0() {
            return (r0)((d0.c)this.K).b(this, c.M[0]);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0015\u0010\u0016R!\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00058V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0010\u001a\u00020\u000b8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017" }, d2 = { "kotlin/reflect/jvm/internal/u$d", "V", "Lkotlin/reflect/jvm/internal/u$a;", "Lkotlin/j2;", "Lkotlin/reflect/j$a;", "Lkotlin/reflect/jvm/internal/calls/d;", "L", "Lkotlin/reflect/jvm/internal/d0$b;", "i0", "()Lkotlin/reflect/jvm/internal/calls/d;", "caller", "Lkotlin/reflect/jvm/internal/impl/descriptors/s0;", "K", "Lkotlin/reflect/jvm/internal/d0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor", "", "getName", "()Ljava/lang/String;", "name", "<init>", "()V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public abstract static class d<V> extends u.a<V, j2> implements j.a<V>
    {
        static final /* synthetic */ o[] M;
        @e
        private final d0.a K;
        @e
        private final d0.b L;
        
        static {
            M = new o[] { k1.r(new f1(k1.d(d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), k1.r(new f1(k1.d(d.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")) };
        }
        
        public d() {
            this.K = (d0.a)d0.d((a<Object>)new a<s0>() {
                final /* synthetic */ d G;
                
                public final s0 a() {
                    s0 s0 = this.G.p0().s0().h();
                    if (s0 == null) {
                        final q0 s2 = this.G.p0().s0();
                        final g.a r = g.r;
                        s0 = c.c(s2, r.b(), r.b());
                    }
                    return s0;
                }
            });
            this.L = (d0.b)d0.b((a<Object>)new a<kotlin.reflect.jvm.internal.calls.d<?>>() {
                final /* synthetic */ d G;
                
                public final kotlin.reflect.jvm.internal.calls.d<?> a() {
                    return (kotlin.reflect.jvm.internal.calls.d<?>)v.a(this.G, false);
                }
            });
        }
        
        @e
        @Override
        public String getName() {
            final StringBuilder sb = new StringBuilder();
            sb.append("<set-");
            sb.append(this.p0().getName());
            sb.append('>');
            return sb.toString();
        }
        
        @e
        @Override
        public kotlin.reflect.jvm.internal.calls.d<?> i0() {
            return (kotlin.reflect.jvm.internal.calls.d<?>)((d0.c)this.L).b(this, d.M[1]);
        }
        
        @e
        public s0 q0() {
            return (s0)((d0.c)this.K).b(this, d.M[0]);
        }
    }
}
