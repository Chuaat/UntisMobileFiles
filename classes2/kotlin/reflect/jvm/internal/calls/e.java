// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import kotlin.j2;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.k0;
import kotlin.collections.m;
import kotlin.collections.v;
import kotlin.jvm.internal.o1;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import java.lang.reflect.Member;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u000e*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\u0018\b\u0012\u0007\u000e !\"B5\b\u0002\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004R\u0019\u0010\u000b\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0016\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00178\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\u0082\u0001\u0007#$%&'()¨\u0006*" }, d2 = { "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/d;", "", "obj", "Lkotlin/j2;", "d", "b", "Ljava/lang/reflect/Member;", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/Class;", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "instanceClass", "Ljava/lang/reflect/Type;", "c", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "", "valueParameterTypes", "<init>", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "f", "g", "h", "Lkotlin/reflect/jvm/internal/calls/e$e;", "Lkotlin/reflect/jvm/internal/calls/e$c;", "Lkotlin/reflect/jvm/internal/calls/e$b;", "Lkotlin/reflect/jvm/internal/calls/e$a;", "Lkotlin/reflect/jvm/internal/calls/e$h;", "Lkotlin/reflect/jvm/internal/calls/e$f;", "Lkotlin/reflect/jvm/internal/calls/e$g;", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public abstract class e<M extends Member> implements kotlin.reflect.jvm.internal.calls.d<M>
{
    @e
    public static final d e;
    @e
    private final List<Type> a;
    @e
    private final M b;
    @e
    private final Type c;
    @org.jetbrains.annotations.f
    private final Class<?> d;
    
    static {
        e = new d(null);
    }
    
    private e(final M b, final Type c, final Class<?> d, final Type[] array) {
        this.b = b;
        this.c = c;
        this.d = d;
        List<Type> a = null;
        Label_0074: {
            if (d != null) {
                final o1 o1 = new o1(2);
                o1.a(d);
                o1.b(array);
                a = v.L((Type[])o1.d(new Type[o1.c()]));
                if (a != null) {
                    break Label_0074;
                }
            }
            a = m.ey(array);
        }
        this.a = a;
    }
    
    @e
    @Override
    public List<Type> a() {
        return this.a;
    }
    
    @e
    @Override
    public final M b() {
        return this.b;
    }
    
    public void c(@e final Object[] array) {
        k0.p(array, "args");
        kotlin.reflect.jvm.internal.calls.d.a.a((kotlin.reflect.jvm.internal.calls.d<? extends Member>)this, array);
    }
    
    protected final void d(@org.jetbrains.annotations.f final Object o) {
        if (o != null && this.b.getDeclaringClass().isInstance(o)) {
            return;
        }
        throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
    }
    
    @org.jetbrains.annotations.f
    public final Class<?> e() {
        return this.d;
    }
    
    @e
    @Override
    public final Type getReturnType() {
        return this.c;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001d\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$a", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/calls/c;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class a extends e<Constructor<?>> implements c
    {
        private final Object f;
        
        public a(@e final Constructor<?> constructor, @f final Object f) {
            k0.p(constructor, "constructor");
            final Class<?> declaringClass = constructor.getDeclaringClass();
            k0.o(declaringClass, "constructor.declaringClass");
            final Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            k0.o(genericParameterTypes, "constructor.genericParameterTypes");
            Type[] m1;
            if (genericParameterTypes.length <= 2) {
                m1 = new Type[0];
            }
            else {
                m1 = m.M1(genericParameterTypes, 1, genericParameterTypes.length - 1);
                Objects.requireNonNull(m1, "null cannot be cast to non-null type kotlin.Array<T>");
            }
            super(constructor, declaringClass, null, m1, null);
            this.f = f;
        }
        
        @f
        @Override
        public Object call(@e final Object[] array) {
            k0.p(array, "args");
            this.c(array);
            final Constructor<Object> constructor = ((e<Constructor<Object>>)this).b();
            final o1 o1 = new o1(3);
            o1.a(this.f);
            o1.b(array);
            o1.a(null);
            return constructor.newInstance(o1.d(new Object[o1.c()]));
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$b", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Constructor;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class b extends e<Constructor<?>>
    {
        public b(@e final Constructor<?> constructor) {
            k0.p(constructor, "constructor");
            final Class<?> declaringClass = constructor.getDeclaringClass();
            k0.o(declaringClass, "constructor.declaringClass");
            final Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            k0.o(genericParameterTypes, "constructor.genericParameterTypes");
            Type[] m1;
            if (genericParameterTypes.length <= 1) {
                m1 = new Type[0];
            }
            else {
                m1 = m.M1(genericParameterTypes, 0, genericParameterTypes.length - 1);
                Objects.requireNonNull(m1, "null cannot be cast to non-null type kotlin.Array<T>");
            }
            super(constructor, declaringClass, null, m1, null);
        }
        
        @f
        @Override
        public Object call(@e final Object[] array) {
            k0.p(array, "args");
            this.c(array);
            final Constructor<Object> constructor = ((e<Constructor<Object>>)this).b();
            final o1 o1 = new o1(2);
            o1.b(array);
            o1.a(null);
            return constructor.newInstance(o1.d(new Object[o1.c()]));
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001d\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$c", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Constructor;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class c extends e<Constructor<?>> implements kotlin.reflect.jvm.internal.calls.c
    {
        private final Object f;
        
        public c(@e final Constructor<?> constructor, @f final Object f) {
            k0.p(constructor, "constructor");
            final Class<?> declaringClass = constructor.getDeclaringClass();
            k0.o(declaringClass, "constructor.declaringClass");
            final Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            k0.o(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.f = f;
        }
        
        @f
        @Override
        public Object call(@e final Object[] array) {
            k0.p(array, "args");
            this.c(array);
            final Constructor<Object> constructor = ((e<Constructor<Object>>)this).b();
            final o1 o1 = new o1(2);
            o1.a(this.f);
            o1.b(array);
            return constructor.newInstance(o1.d(new Object[o1.c()]));
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0005J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\n" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$d", "", "T", "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirstAndLast", "dropLast", "<init>", "()V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class d
    {
        private d() {
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$e", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Constructor;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class e extends kotlin.reflect.jvm.internal.calls.e<Constructor<?>>
    {
        public e(@org.jetbrains.annotations.e final Constructor<?> constructor) {
            k0.p(constructor, "constructor");
            final Class<?> declaringClass = constructor.getDeclaringClass();
            k0.o(declaringClass, "constructor.declaringClass");
            final Class<?> declaringClass2 = constructor.getDeclaringClass();
            k0.o(declaringClass2, "klass");
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            if (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) {
                declaringClass3 = null;
            }
            final Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            k0.o(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, declaringClass3, genericParameterTypes, null);
        }
        
        @f
        @Override
        public Object call(@org.jetbrains.annotations.e final Object[] original) {
            k0.p(original, "args");
            this.c(original);
            return ((kotlin.reflect.jvm.internal.calls.e<Constructor<Object>>)this).b().newInstance(Arrays.copyOf(original, original.length));
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u0019\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$f", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Field;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "field", "", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;Z)V", "a", "b", "c", "d", "e", "Lkotlin/reflect/jvm/internal/calls/e$f$e;", "Lkotlin/reflect/jvm/internal/calls/e$f$c;", "Lkotlin/reflect/jvm/internal/calls/e$f$d;", "Lkotlin/reflect/jvm/internal/calls/e$f$a;", "Lkotlin/reflect/jvm/internal/calls/e$f$b;", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public abstract static class f extends kotlin.reflect.jvm.internal.calls.e<Field>
    {
        private f(final Field field, final boolean b) {
            final Type genericType = field.getGenericType();
            k0.o(genericType, "field.genericType");
            Class<?> declaringClass;
            if (b) {
                declaringClass = field.getDeclaringClass();
            }
            else {
                declaringClass = null;
            }
            super(field, genericType, declaringClass, new Type[0], null);
        }
        
        @org.jetbrains.annotations.f
        @Override
        public Object call(@org.jetbrains.annotations.e final Object[] array) {
            k0.p(array, "args");
            this.c(array);
            final Field field = this.b();
            Object ob;
            if (this.e() != null) {
                ob = m.ob(array);
            }
            else {
                ob = null;
            }
            return field.get(ob);
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$f$a", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e$f;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class a extends f implements c
        {
            private final Object f;
            
            public a(@org.jetbrains.annotations.e final Field field, @org.jetbrains.annotations.f final Object f) {
                k0.p(field, "field");
                super(field, false, null);
                this.f = f;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public Object call(@org.jetbrains.annotations.e final Object[] array) {
                k0.p(array, "args");
                this.c(array);
                return this.b().get(this.f);
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$f$b", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class b extends f implements c
        {
            public b(@org.jetbrains.annotations.e final Field field) {
                k0.p(field, "field");
                super(field, false, null);
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$f$c", "Lkotlin/reflect/jvm/internal/calls/e$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class c extends f
        {
            public c(@org.jetbrains.annotations.e final Field field) {
                k0.p(field, "field");
                super(field, true, null);
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$f$d", "Lkotlin/reflect/jvm/internal/calls/e$f;", "", "args", "Lkotlin/j2;", "c", "([Ljava/lang/Object;)V", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class d extends f
        {
            public d(@org.jetbrains.annotations.e final Field field) {
                k0.p(field, "field");
                super(field, true, null);
            }
            
            @Override
            public void c(@org.jetbrains.annotations.e final Object[] array) {
                k0.p(array, "args");
                super.c(array);
                this.d(m.Kb(array));
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$f$e", "Lkotlin/reflect/jvm/internal/calls/e$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class e extends f
        {
            public e(@org.jetbrains.annotations.e final Field field) {
                k0.p(field, "field");
                super(field, false, null);
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0013\u0014\u0006\u0015\u0016B!\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$g", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Field;", "", "args", "Lkotlin/j2;", "c", "([Ljava/lang/Object;)V", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "f", "Z", "notNull", "field", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;ZZ)V", "a", "b", "d", "e", "Lkotlin/reflect/jvm/internal/calls/e$g$e;", "Lkotlin/reflect/jvm/internal/calls/e$g$c;", "Lkotlin/reflect/jvm/internal/calls/e$g$d;", "Lkotlin/reflect/jvm/internal/calls/e$g$a;", "Lkotlin/reflect/jvm/internal/calls/e$g$b;", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public abstract static class g extends kotlin.reflect.jvm.internal.calls.e<Field>
    {
        private final boolean f;
        
        private g(final Field field, final boolean f, final boolean b) {
            final Class<Void> type = Void.TYPE;
            k0.o(type, "Void.TYPE");
            Class<?> declaringClass;
            if (b) {
                declaringClass = field.getDeclaringClass();
            }
            else {
                declaringClass = null;
            }
            final Type genericType = field.getGenericType();
            k0.o(genericType, "field.genericType");
            super(field, type, declaringClass, new Type[] { genericType }, null);
            this.f = f;
        }
        
        @Override
        public void c(@org.jetbrains.annotations.e final Object[] array) {
            k0.p(array, "args");
            super.c(array);
            if (this.f && m.Xg(array) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }
        
        @f
        @Override
        public Object call(@org.jetbrains.annotations.e final Object[] array) {
            k0.p(array, "args");
            this.c(array);
            final Field field = this.b();
            Object ob;
            if (this.e() != null) {
                ob = m.ob(array);
            }
            else {
                ob = null;
            }
            field.set(ob, m.Xg(array));
            return j2.a;
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$g$a", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e$g;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class a extends g implements c
        {
            private final Object g;
            
            public a(@org.jetbrains.annotations.e final Field field, final boolean b, @f final Object g) {
                k0.p(field, "field");
                super(field, b, false, null);
                this.g = g;
            }
            
            @f
            @Override
            public Object call(@org.jetbrains.annotations.e final Object[] array) {
                k0.p(array, "args");
                this.c(array);
                this.b().set(this.g, m.ob(array));
                return j2.a;
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$g$b", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e$g;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class b extends g implements c
        {
            public b(@org.jetbrains.annotations.e final Field field, final boolean b) {
                k0.p(field, "field");
                super(field, b, false, null);
            }
            
            @f
            @Override
            public Object call(@org.jetbrains.annotations.e final Object[] array) {
                k0.p(array, "args");
                this.c(array);
                this.b().set(null, m.Xg(array));
                return j2.a;
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$g$c", "Lkotlin/reflect/jvm/internal/calls/e$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class c extends g
        {
            public c(@org.jetbrains.annotations.e final Field field, final boolean b) {
                k0.p(field, "field");
                super(field, b, true, null);
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$g$d", "Lkotlin/reflect/jvm/internal/calls/e$g;", "", "args", "Lkotlin/j2;", "c", "([Ljava/lang/Object;)V", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class d extends g
        {
            public d(@org.jetbrains.annotations.e final Field field, final boolean b) {
                k0.p(field, "field");
                super(field, b, true, null);
            }
            
            @Override
            public void c(@org.jetbrains.annotations.e final Object[] array) {
                k0.p(array, "args");
                super.c(array);
                this.d(m.Kb(array));
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$g$e", "Lkotlin/reflect/jvm/internal/calls/e$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class e extends g
        {
            public e(@org.jetbrains.annotations.e final Field field, final boolean b) {
                k0.p(field, "field");
                super(field, b, false, null);
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0007B+\b\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n\u0082\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$h", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Method;", "", "instance", "", "args", "f", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "", "Z", "isVoidMethod", "method", "requiresInstance", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "a", "b", "c", "d", "e", "Lkotlin/reflect/jvm/internal/calls/e$h$f;", "Lkotlin/reflect/jvm/internal/calls/e$h$d;", "Lkotlin/reflect/jvm/internal/calls/e$h$e;", "Lkotlin/reflect/jvm/internal/calls/e$h$c;", "Lkotlin/reflect/jvm/internal/calls/e$h$a;", "Lkotlin/reflect/jvm/internal/calls/e$h$b;", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public abstract static class h extends kotlin.reflect.jvm.internal.calls.e<Method>
    {
        private final boolean f;
        
        private h(final Method method, final boolean b, final Type[] array) {
            final Type genericReturnType = method.getGenericReturnType();
            k0.o(genericReturnType, "method.genericReturnType");
            Class<?> declaringClass;
            if (b) {
                declaringClass = method.getDeclaringClass();
            }
            else {
                declaringClass = null;
            }
            super(method, genericReturnType, declaringClass, array, null);
            this.f = k0.g(this.getReturnType(), Void.TYPE);
        }
        
        @org.jetbrains.annotations.f
        protected final Object f(@org.jetbrains.annotations.f Object obj, @org.jetbrains.annotations.e final Object[] original) {
            k0.p(original, "args");
            obj = this.b().invoke(obj, Arrays.copyOf(original, original.length));
            if (this.f) {
                obj = j2.a;
            }
            return obj;
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$h$a", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class a extends h implements c
        {
            private final Object g;
            
            public a(@org.jetbrains.annotations.e final Method method, @org.jetbrains.annotations.f final Object g) {
                k0.p(method, "method");
                super(method, false, null, 4, null);
                this.g = g;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public Object call(@org.jetbrains.annotations.e final Object[] array) {
                k0.p(array, "args");
                this.c(array);
                return this.f(this.g, array);
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$h$b", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class b extends h implements c
        {
            public b(@org.jetbrains.annotations.e final Method method) {
                k0.p(method, "method");
                super(method, false, null, 4, null);
            }
            
            @org.jetbrains.annotations.f
            @Override
            public Object call(@org.jetbrains.annotations.e final Object[] array) {
                k0.p(array, "args");
                this.c(array);
                return this.f(null, array);
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$h$c", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class c extends h implements kotlin.reflect.jvm.internal.calls.c
        {
            private final Object g;
            
            public c(@org.jetbrains.annotations.e final Method method, @org.jetbrains.annotations.f final Object g) {
                k0.p(method, "method");
                final Type[] genericParameterTypes = method.getGenericParameterTypes();
                k0.o(genericParameterTypes, "method.genericParameterTypes");
                Type[] m1;
                if (genericParameterTypes.length <= 1) {
                    m1 = new Type[0];
                }
                else {
                    m1 = m.M1(genericParameterTypes, 1, genericParameterTypes.length);
                    Objects.requireNonNull(m1, "null cannot be cast to non-null type kotlin.Array<T>");
                }
                super(method, false, m1, null);
                this.g = g;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public Object call(@org.jetbrains.annotations.e final Object[] array) {
                k0.p(array, "args");
                this.c(array);
                final o1 o1 = new o1(2);
                o1.a(this.g);
                o1.b(array);
                return this.f(null, o1.d(new Object[o1.c()]));
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$h$d", "Lkotlin/reflect/jvm/internal/calls/e$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class d extends h
        {
            public d(@org.jetbrains.annotations.e final Method method) {
                k0.p(method, "method");
                super(method, false, null, 6, null);
            }
            
            @org.jetbrains.annotations.f
            @Override
            public Object call(@org.jetbrains.annotations.e Object[] m1) {
                k0.p(m1, "args");
                this.c(m1);
                final Object o = m1[0];
                if (m1.length <= 1) {
                    m1 = new Object[0];
                }
                else {
                    m1 = m.M1(m1, 1, m1.length);
                    Objects.requireNonNull(m1, "null cannot be cast to non-null type kotlin.Array<T>");
                }
                return this.f(o, m1);
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$h$e", "Lkotlin/reflect/jvm/internal/calls/e$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class e extends h
        {
            public e(@org.jetbrains.annotations.e final Method method) {
                k0.p(method, "method");
                super(method, true, null, 4, null);
            }
            
            @org.jetbrains.annotations.f
            @Override
            public Object call(@org.jetbrains.annotations.e Object[] m1) {
                k0.p(m1, "args");
                this.c(m1);
                this.d(m.Kb(m1));
                if (m1.length <= 1) {
                    m1 = new Object[0];
                }
                else {
                    m1 = m.M1(m1, 1, m1.length);
                    Objects.requireNonNull(m1, "null cannot be cast to non-null type kotlin.Array<T>");
                }
                return this.f(null, m1);
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b" }, d2 = { "kotlin/reflect/jvm/internal/calls/e$h$f", "Lkotlin/reflect/jvm/internal/calls/e$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
        public static final class f extends h
        {
            public f(@org.jetbrains.annotations.e final Method method) {
                k0.p(method, "method");
                super(method, false, null, 6, null);
            }
            
            @org.jetbrains.annotations.f
            @Override
            public Object call(@org.jetbrains.annotations.e final Object[] array) {
                k0.p(array, "args");
                this.c(array);
                return this.f(null, array);
            }
        }
    }
}
