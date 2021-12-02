// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e$b;
import java.lang.reflect.Constructor;
import n6.l;
import kotlin.collections.v;
import kotlin.collections.m;
import kotlin.comparisons.a;
import java.util.Comparator;
import kotlin.jvm.internal.k0;
import java.lang.reflect.Method;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0003\u0006\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f" }, d2 = { "Lkotlin/reflect/jvm/internal/d;", "", "", "a", "<init>", "()V", "b", "c", "d", "e", "Lkotlin/reflect/jvm/internal/d$e;", "Lkotlin/reflect/jvm/internal/d$d;", "Lkotlin/reflect/jvm/internal/d$c;", "Lkotlin/reflect/jvm/internal/d$b;", "Lkotlin/reflect/jvm/internal/d$a;", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public abstract class d
{
    private d() {
    }
    
    @org.jetbrains.annotations.e
    public abstract String a();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R'\u0010\n\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012" }, d2 = { "kotlin/reflect/jvm/internal/d$a", "Lkotlin/reflect/jvm/internal/d;", "", "a", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "Ljava/util/List;", "b", "()Ljava/util/List;", "methods", "Ljava/lang/Class;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class a extends d
    {
        @org.jetbrains.annotations.e
        private final List<Method> a;
        @org.jetbrains.annotations.e
        private final Class<?> b;
        
        public a(@org.jetbrains.annotations.e final Class<?> b) {
            k0.p(b, "jClass");
            super(null);
            this.b = b;
            final Method[] declaredMethods = b.getDeclaredMethods();
            k0.o(declaredMethods, "jClass.declaredMethods");
            this.a = m.hv(declaredMethods, (Comparator<? super Method>)new Comparator<Object>() {
                @Override
                public final int compare(final T t, final T t2) {
                    final Method method = (Method)t;
                    k0.o(method, "it");
                    final String name = method.getName();
                    final Method method2 = (Method)t2;
                    k0.o(method2, "it");
                    return kotlin.comparisons.a.g(name, method2.getName());
                }
            });
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String a() {
            return v.Z2(this.a, "", "<init>(", ")V", 0, null, d$a$b.G, 24, null);
        }
        
        @org.jetbrains.annotations.e
        public final List<Method> b() {
            return this.a;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "kotlin/reflect/jvm/internal/d$b", "Lkotlin/reflect/jvm/internal/d;", "", "a", "Ljava/lang/reflect/Constructor;", "Ljava/lang/reflect/Constructor;", "b", "()Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class b extends d
    {
        @org.jetbrains.annotations.e
        private final Constructor<?> a;
        
        public b(@org.jetbrains.annotations.e final Constructor<?> a) {
            k0.p(a, "constructor");
            super(null);
            this.a = a;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String a() {
            final Class<?>[] parameterTypes = this.a.getParameterTypes();
            k0.o(parameterTypes, "constructor.parameterTypes");
            return m.Ig(parameterTypes, "", "<init>(", ")V", 0, null, d$b$a.G, 24, null);
        }
        
        @org.jetbrains.annotations.e
        public final Constructor<?> b() {
            return this.a;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "kotlin/reflect/jvm/internal/d$c", "Lkotlin/reflect/jvm/internal/d;", "", "a", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class c extends d
    {
        @org.jetbrains.annotations.e
        private final Method a;
        
        public c(@org.jetbrains.annotations.e final Method a) {
            k0.p(a, "method");
            super(null);
            this.a = a;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String a() {
            return i0.a(this.a);
        }
        
        @org.jetbrains.annotations.e
        public final Method b() {
            return this.a;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0013\u0010\r\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\f¨\u0006\u0010" }, d2 = { "kotlin/reflect/jvm/internal/d$d", "Lkotlin/reflect/jvm/internal/d;", "", "a", "Ljava/lang/String;", "_signature", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/e$b;", "b", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/e$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "()Ljava/lang/String;", "constructorDesc", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class d extends kotlin.reflect.jvm.internal.d
    {
        private final String a;
        @org.jetbrains.annotations.e
        private final e$b b;
        
        public d(@org.jetbrains.annotations.e final e$b b) {
            k0.p(b, "signature");
            super(null);
            this.b = b;
            this.a = b.a();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String a() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        public final String b() {
            return this.b.b();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\f\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0013\u0010\u000f\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0012" }, d2 = { "kotlin/reflect/jvm/internal/d$e", "Lkotlin/reflect/jvm/internal/d;", "", "a", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/e$b;", "b", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/e$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "c", "()Ljava/lang/String;", "methodName", "Ljava/lang/String;", "_signature", "methodDesc", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class e extends d
    {
        private final String a;
        @org.jetbrains.annotations.e
        private final e$b b;
        
        public e(@org.jetbrains.annotations.e final e$b b) {
            k0.p(b, "signature");
            super(null);
            this.b = b;
            this.a = b.a();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String a() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        public final String b() {
            return this.b.b();
        }
        
        @org.jetbrains.annotations.e
        public final String c() {
            return this.b.c();
        }
    }
}
