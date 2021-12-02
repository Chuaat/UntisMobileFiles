// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.calls;

import org.jetbrains.annotations.f;
import java.util.Map;
import kotlin.s0;
import kotlin.collections.y0;
import java.lang.reflect.Member;
import kotlin.jvm.internal.w;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import java.lang.reflect.Method;
import org.jetbrains.annotations.e;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\"\u0019BA\u0012\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u0018\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010&\u001a\u00020%\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b'\u0010(J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000bR\u0018\u0010!\u001a\u0004\u0018\u00010\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010 R\"\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b\"\u0010#¨\u0006)" }, d2 = { "Lkotlin/reflect/jvm/internal/calls/a;", "Lkotlin/reflect/jvm/internal/calls/d;", "", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Ljava/lang/reflect/Method;", "g", "Ljava/util/List;", "methods", "", "e", "parameterNames", "Lkotlin/reflect/jvm/internal/calls/a$a;", "f", "Lkotlin/reflect/jvm/internal/calls/a$a;", "callMode", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "Ljava/lang/Class;", "b", "erasedParameterTypes", "d", "Ljava/lang/Class;", "jClass", "c", "defaultValues", "()Ljava/lang/Void;", "member", "a", "()Ljava/util/List;", "parameterTypes", "Lkotlin/reflect/jvm/internal/calls/a$b;", "origin", "<init>", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/a$a;Lkotlin/reflect/jvm/internal/calls/a$b;Ljava/util/List;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public final class a implements d
{
    @e
    private final List<Type> a;
    private final List<Class<?>> b;
    private final List<Object> c;
    private final Class<?> d;
    private final List<String> e;
    private final a f;
    private final List<Method> g;
    
    public a(@e final Class<?> d, @e final List<String> e, @e final a f, @e final b b, @e final List<Method> g) {
        k0.p(d, "jClass");
        k0.p(e, "parameterNames");
        k0.p(f, "callMode");
        k0.p(b, "origin");
        k0.p(g, "methods");
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final ArrayList<Type> a = new ArrayList<Type>(v.Y((Iterable<?>)g, 10));
        final Iterator<? extends T> iterator = g.iterator();
        while (iterator.hasNext()) {
            a.add(((Method)iterator.next()).getGenericReturnType());
        }
        this.a = a;
        final List<Method> g2 = this.g;
        final ArrayList b2 = new ArrayList<Class<?>>(v.Y((Iterable<?>)g2, 10));
        final Iterator<Object> iterator2 = g2.iterator();
        while (iterator2.hasNext()) {
            Class<?> returnType = iterator2.next().getReturnType();
            k0.o(returnType, "it");
            final Class h = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.h((Class)returnType);
            if (h != null) {
                returnType = (Class<?>)h;
            }
            b2.add(returnType);
        }
        this.b = (List<Class<?>>)b2;
        final List<Method> g3 = this.g;
        final ArrayList c = new ArrayList<Object>(v.Y((Iterable<?>)g3, 10));
        final Iterator<Object> iterator3 = g3.iterator();
        while (iterator3.hasNext()) {
            c.add(iterator3.next().getDefaultValue());
        }
        this.c = (List<Object>)c;
        if (this.f == kotlin.reflect.jvm.internal.calls.a.a.H && b == kotlin.reflect.jvm.internal.calls.a.b.G && (v.d4(this.e, "value").isEmpty() ^ true)) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }
    
    @e
    @Override
    public List<Type> a() {
        return this.a;
    }
    
    public void c(@e final Object[] array) {
        k0.p(array, "args");
        kotlin.reflect.jvm.internal.calls.d.a.a((d<? extends Member>)this, array);
    }
    
    @f
    @Override
    public Object call(@e final Object[] array) {
        k0.p(array, "args");
        this.c(array);
        final ArrayList<Object> list = new ArrayList<Object>(array.length);
        for (int length = array.length, i = 0, n = 0; i < length; ++i, ++n) {
            final Object o = array[i];
            Object o2;
            if (o == null && this.f == kotlin.reflect.jvm.internal.calls.a.a.G) {
                o2 = this.c.get(n);
            }
            else {
                o2 = kotlin.reflect.jvm.internal.calls.b.b(o, this.b.get(n));
            }
            if (o2 == null) {
                kotlin.reflect.jvm.internal.calls.b.a(n, this.e.get(n), this.b.get(n));
                throw null;
            }
            list.add(o2);
        }
        return kotlin.reflect.jvm.internal.calls.b.c(this.d, (Map<String, ?>)y0.B0((Iterable<? extends s0<?, ?>>)v.V5((Iterable<?>)this.e, (Iterable<?>)list)), this.g);
    }
    
    @f
    public Void d() {
        return null;
    }
    
    @e
    @Override
    public Type getReturnType() {
        return this.d;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007" }, d2 = { "kotlin/reflect/jvm/internal/calls/a$a", "", "Lkotlin/reflect/jvm/internal/calls/a$a;", "<init>", "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public enum a
    {
        G, 
        H;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007" }, d2 = { "kotlin/reflect/jvm/internal/calls/a$b", "", "Lkotlin/reflect/jvm/internal/calls/a$b;", "<init>", "(Ljava/lang/String;I)V", "JAVA", "KOTLIN", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public enum b
    {
        G, 
        H;
    }
}
