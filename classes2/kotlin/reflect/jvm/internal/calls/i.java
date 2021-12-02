// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.calls;

import java.util.Objects;
import kotlin.collections.m;
import kotlin.collections.v;
import java.util.Arrays;
import org.jetbrains.annotations.f;
import java.lang.reflect.Member;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.jetbrains.annotations.e;
import java.lang.reflect.Type;
import kotlin.Metadata;
import java.lang.reflect.Method;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0012\fB\u001f\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0018\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002\u001b\u001c¨\u0006\u001d" }, d2 = { "Lkotlin/reflect/jvm/internal/calls/i;", "Lkotlin/reflect/jvm/internal/calls/d;", "Ljava/lang/reflect/Method;", "", "instance", "", "args", "c", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "e", "()Ljava/lang/reflect/Method;", "member", "b", "Ljava/lang/reflect/Method;", "unboxMethod", "", "Ljava/lang/reflect/Type;", "Ljava/util/List;", "a", "()Ljava/util/List;", "parameterTypes", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "<init>", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "Lkotlin/reflect/jvm/internal/calls/i$b;", "Lkotlin/reflect/jvm/internal/calls/i$a;", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public abstract class i implements d<Method>
{
    @e
    private final Type a;
    private final Method b;
    @e
    private final List<Type> c;
    
    private i(final Method b, final List<? extends Type> c) {
        this.b = b;
        this.c = (List<Type>)c;
        final Class<?> returnType = b.getReturnType();
        k0.o(returnType, "unboxMethod.returnType");
        this.a = returnType;
    }
    
    @e
    @Override
    public final List<Type> a() {
        return this.c;
    }
    
    @f
    protected final Object c(@f final Object obj, @e final Object[] original) {
        k0.p(original, "args");
        return this.b.invoke(obj, Arrays.copyOf(original, original.length));
    }
    
    public void d(@e final Object[] array) {
        k0.p(array, "args");
        d.a.a((d<? extends Member>)this, array);
    }
    
    @f
    public final Method e() {
        return null;
    }
    
    @e
    @Override
    public final Type getReturnType() {
        return this.a;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f" }, d2 = { "kotlin/reflect/jvm/internal/calls/i$a", "Lkotlin/reflect/jvm/internal/calls/i;", "Lkotlin/reflect/jvm/internal/calls/c;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "d", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class a extends i implements c
    {
        private final Object d;
        
        public a(@e final Method method, @f final Object d) {
            k0.p(method, "unboxMethod");
            super(method, v.E(), null);
            this.d = d;
        }
        
        @f
        @Override
        public Object call(@e final Object[] array) {
            k0.p(array, "args");
            this.d(array);
            return this.c(this.d, array);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b" }, d2 = { "kotlin/reflect/jvm/internal/calls/i$b", "Lkotlin/reflect/jvm/internal/calls/i;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class b extends i
    {
        public b(@e final Method method) {
            k0.p(method, "unboxMethod");
            super(method, v.k(method.getDeclaringClass()), null);
        }
        
        @f
        @Override
        public Object call(@e Object[] m1) {
            k0.p(m1, "args");
            this.d(m1);
            final Object o = m1[0];
            final kotlin.reflect.jvm.internal.calls.e.d e = kotlin.reflect.jvm.internal.calls.e.e;
            if (m1.length <= 1) {
                m1 = new Object[0];
            }
            else {
                m1 = m.M1(m1, 1, m1.length);
                Objects.requireNonNull(m1, "null cannot be cast to non-null type kotlin.Array<T>");
            }
            return this.c(o, m1);
        }
    }
}
