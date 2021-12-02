// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import java.lang.reflect.Type;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.lang.reflect.Field;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMappingUtilsKt;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.k$a;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.reflect.o;
import kotlin.reflect.c;
import kotlin.reflect.s;
import kotlin.reflect.x;
import kotlin.reflect.t;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.q1;
import kotlin.reflect.jvm.internal.impl.protobuf.i$g;
import kotlin.reflect.jvm.internal.impl.metadata.a$c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.u;
import n6.p;
import kotlin.reflect.jvm.internal.impl.protobuf.i$d;
import kotlin.reflect.jvm.internal.impl.metadata.a$n;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.l;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.reflect.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001kB\u0015\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000)¢\u0006\u0004\bi\u0010jJ\b\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0016J\u0013\u0010\u0017\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0016\u0010\u001b\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0016\u0010#\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001cR\u0016\u0010%\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0018\u0010(\u001a\u0004\u0018\u00018\u00008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\"\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000)8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u00198V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001cR;\u0010:\u001a$\u0012 \u0012\u001e 6*\u000e\u0018\u000105R\b\u0012\u0004\u0012\u00028\u00000\u000005R\b\u0012\u0004\u0012\u00028\u00000\u0000048\u0006@\u0006¢\u0006\f\n\u0004\b&\u00107\u001a\u0004\b8\u00109R$\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040\u001d8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010 R\u0016\u0010>\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u001cR\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020?0\u001d8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010 R \u0010D\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u000b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR \u0010K\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030I0\u000b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010CR\"\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000L0\u000b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010CR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020O0\u001d8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010 R\u0016\u0010S\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u001cR\u0018\u0010U\u001a\u0004\u0018\u00010\u00198V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u00100R\u001c\u0010X\u001a\b\u0012\u0004\u0012\u00020V0\u000b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010CR\u0016\u0010Z\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\u001cR\u0016\u0010^\u001a\u00020[8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0016\u0010b\u001a\u00020_8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0016\u0010f\u001a\u00020c8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0016\u0010h\u001a\u00020c8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010e¨\u0006l" }, d2 = { "Lkotlin/reflect/jvm/internal/h;", "", "T", "Lkotlin/reflect/jvm/internal/k;", "Lkotlin/reflect/d;", "Lkotlin/reflect/jvm/internal/j;", "Lkotlin/reflect/jvm/internal/a0;", "", "m0", "Lkotlin/reflect/jvm/internal/impl/name/e;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "U", "Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "P", "", "index", "Q", "value", "", "S", "other", "equals", "hashCode", "", "toString", "isAbstract", "()Z", "", "Lkotlin/reflect/s;", "k", "()Ljava/util/List;", "supertypes", "isOpen", "isFinal", "M", "isCompanion", "J", "()Ljava/lang/Object;", "objectInstance", "Ljava/lang/Class;", "K", "Ljava/lang/Class;", "m", "()Ljava/lang/Class;", "jClass", "H", "()Ljava/lang/String;", "simpleName", "D", "isData", "Lkotlin/reflect/jvm/internal/d0$b;", "Lkotlin/reflect/jvm/internal/h$a;", "kotlin.jvm.PlatformType", "Lkotlin/reflect/jvm/internal/d0$b;", "i0", "()Lkotlin/reflect/jvm/internal/d0$b;", "data", "s", "sealedSubclasses", "q", "isFun", "Lkotlin/reflect/t;", "getTypeParameters", "typeParameters", "F", "()Ljava/util/Collection;", "nestedClasses", "Lkotlin/reflect/x;", "getVisibility", "()Lkotlin/reflect/x;", "visibility", "Lkotlin/reflect/c;", "x", "members", "Lkotlin/reflect/i;", "j", "constructors", "", "getAnnotations", "annotations", "w", "isSealed", "E", "qualifiedName", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "O", "constructorDescriptors", "u", "isInner", "Lkotlin/reflect/jvm/internal/impl/name/a;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "<init>", "(Ljava/lang/Class;)V", "a", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public final class h<T> extends k implements d<T>, j, a0
{
    @e
    private final d0.b<a> J;
    @e
    private final Class<T> K;
    
    public h(@e final Class<T> k) {
        k0.p(k, "jClass");
        this.K = k;
        final d0.b<a> b = d0.b((n6.a<a>)new n6.a<a>() {
            public final h.a a() {
                return new h.a();
            }
        });
        k0.o(b, "ReflectProperties.lazy { Data() }");
        this.J = b;
    }
    
    private final kotlin.reflect.jvm.internal.impl.name.a h0() {
        return h0.b.c(this.m());
    }
    
    private final Void m0() {
        final f a = f.c.a((Class)this.m());
        Object c = null;
        Label_0034: {
            if (a != null) {
                final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a2 = a.a();
                if (a2 != null) {
                    c = a2.c();
                    break Label_0034;
                }
            }
            c = null;
        }
        if (c != null) {
            switch (i.a[((Enum)c).ordinal()]) {
                default: {
                    throw new kotlin.h0();
                }
                case 5: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown class: ");
                    sb.append(this.m());
                    sb.append(" (kind = ");
                    sb.append(c);
                    sb.append(')');
                    throw new b0(sb.toString());
                }
                case 4: {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection ");
                    sb2.append("library has no idea what declarations does it have. Please use Java reflection to inspect this class: ");
                    sb2.append(this.m());
                    throw new UnsupportedOperationException(sb2.toString());
                }
                case 1:
                case 2:
                case 3: {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Packages and file facades are not yet supported in Kotlin reflection. ");
                    sb3.append("Meanwhile please use Java reflection to inspect this class: ");
                    sb3.append(this.m());
                    throw new UnsupportedOperationException(sb3.toString());
                }
                case 6: {
                    break;
                }
            }
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Unresolved class: ");
        sb4.append(this.m());
        throw new b0(sb4.toString());
    }
    
    @Override
    public boolean D() {
        return this.j0().D();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public String E() {
        return this.J.invoke().t();
    }
    
    @e
    @Override
    public Collection<d<?>> F() {
        return this.J.invoke().r();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public String H() {
        return this.J.invoke().v();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public T J() {
        return this.J.invoke().s();
    }
    
    @Override
    public boolean M() {
        return this.j0().G();
    }
    
    @e
    @Override
    public Collection<l> O() {
        final kotlin.reflect.jvm.internal.impl.descriptors.e j0 = this.j0();
        if (j0.n() != kotlin.reflect.jvm.internal.impl.descriptors.f.H && j0.n() != kotlin.reflect.jvm.internal.impl.descriptors.f.L) {
            final Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> i = j0.j();
            k0.o(i, "descriptor.constructors");
            return (Collection<l>)i;
        }
        return (Collection<l>)v.E();
    }
    
    @e
    @Override
    public Collection<y> P(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p(e, "name");
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h k0 = this.k0();
        final kotlin.reflect.jvm.internal.impl.incremental.components.d n = kotlin.reflect.jvm.internal.impl.incremental.components.d.N;
        return (Collection<y>)v.q4((Collection<?>)k0.a(e, (b)n), (Iterable<?>)this.l0().a(e, (b)n));
    }
    
    @org.jetbrains.annotations.f
    @Override
    public q0 Q(final int n) {
        if (k0.g(this.m().getSimpleName(), "DefaultImpls")) {
            final Class<?> declaringClass = this.m().getDeclaringClass();
            if (declaringClass != null && declaringClass.isInterface()) {
                final d<Object> g = m6.a.g(declaringClass);
                Objects.requireNonNull(g, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                return ((h<Object>)g).Q(n);
            }
        }
        Object j0 = this.j0();
        final boolean b = j0 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e;
        final q0 q0 = null;
        if (!b) {
            j0 = null;
        }
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e e = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e)j0;
        q0 q2 = q0;
        if (e != null) {
            final a$c y0 = e.Y0();
            final i$g i = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.j;
            k0.o(i, "JvmProtoBuf.classLocalVariable");
            final a$n a$n = (a$n)kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.b((i$d)y0, i, n);
            q2 = q0;
            if (a$n != null) {
                q2 = (q0)kotlin.reflect.jvm.internal.k0.f(this.m(), a$n, e.X0().g(), e.X0().j(), e.a1(), (p<? super u, ? super a$n, ? extends kotlin.reflect.jvm.internal.impl.descriptors.a>)h$c.G);
            }
        }
        return q2;
    }
    
    @Override
    public boolean S(@org.jetbrains.annotations.f final Object o) {
        final Integer d = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.d((Class)this.m());
        if (d != null) {
            return q1.B(o, d.intValue());
        }
        Class<T> clazz = (Class<T>)kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.h((Class)this.m());
        if (clazz == null) {
            clazz = this.m();
        }
        return clazz.isInstance(o);
    }
    
    @e
    @Override
    public Collection<q0> U(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p(e, "name");
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h k0 = this.k0();
        final kotlin.reflect.jvm.internal.impl.incremental.components.d n = kotlin.reflect.jvm.internal.impl.incremental.components.d.N;
        return (Collection<q0>)v.q4((Collection<?>)k0.c(e, (b)n), (Iterable<?>)this.l0().c(e, (b)n));
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        return o instanceof h && k0.g(m6.a.e((d<Object>)this), m6.a.e((d<Object>)o));
    }
    
    @e
    @Override
    public List<Annotation> getAnnotations() {
        return this.J.invoke().j();
    }
    
    @e
    @Override
    public List<kotlin.reflect.t> getTypeParameters() {
        return this.J.invoke().x();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public x getVisibility() {
        final kotlin.reflect.jvm.internal.impl.descriptors.u visibility = this.j0().getVisibility();
        k0.o(visibility, "descriptor.visibility");
        return kotlin.reflect.jvm.internal.k0.o(visibility);
    }
    
    @Override
    public int hashCode() {
        return m6.a.e((d<Object>)this).hashCode();
    }
    
    @e
    public final d0.b<a> i0() {
        return this.J;
    }
    
    @Override
    public boolean isAbstract() {
        return this.j0().o() == kotlin.reflect.jvm.internal.impl.descriptors.b0.K;
    }
    
    @Override
    public boolean isFinal() {
        return this.j0().o() == kotlin.reflect.jvm.internal.impl.descriptors.b0.H;
    }
    
    @Override
    public boolean isOpen() {
        return this.j0().o() == kotlin.reflect.jvm.internal.impl.descriptors.b0.J;
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.i<T>> j() {
        return this.J.invoke().k();
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.descriptors.e j0() {
        return this.J.invoke().o();
    }
    
    @e
    @Override
    public List<s> k() {
        return this.J.invoke().w();
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h k0() {
        return ((c0)this.j0().A()).x();
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h l0() {
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h v = this.j0().V();
        k0.o(v, "descriptor.staticScope");
        return v;
    }
    
    @e
    @Override
    public Class<T> m() {
        return this.K;
    }
    
    @Override
    public boolean q() {
        return this.j0().q();
    }
    
    @e
    @Override
    public List<d<? extends T>> s() {
        return this.J.invoke().u();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class ");
        final kotlin.reflect.jvm.internal.impl.name.a h0 = this.h0();
        final kotlin.reflect.jvm.internal.impl.name.b h2 = h0.h();
        k0.o(h2, "classId.packageFqName");
        String string;
        if (h2.d()) {
            string = "";
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(h2.b());
            sb2.append(".");
            string = sb2.toString();
        }
        final String b = h0.i().b();
        k0.o(b, "classId.relativeClassName.asString()");
        final String j2 = kotlin.text.s.j2(b, '.', '$', false, 4, (Object)null);
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append(j2);
        sb.append(sb3.toString());
        return sb.toString();
    }
    
    @Override
    public boolean u() {
        return this.j0().u();
    }
    
    @Override
    public boolean w() {
        return this.j0().o() == kotlin.reflect.jvm.internal.impl.descriptors.b0.I;
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.c<?>> x() {
        return (Collection<kotlin.reflect.c<?>>)this.J.invoke().g();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\bA\u0010BJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002R'\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR/\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u00078F@\u0006X\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\u000bR#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0015\u0010\u0016R'\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\u000bR'\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0018\u0010\u000bR'\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\u000bR\u001d\u0010$\u001a\u00020 8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010#R#\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u00138F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b'\u0010\u0016R\u001f\u0010+\u001a\u0004\u0018\u00010\u00058F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b)\u0010*R+\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000,0\u00138F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001d\u0010\u0016R'\u00100\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030,0\u00078F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\n\u001a\u0004\b/\u0010\u000bR'\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b1\u0010\u000bR#\u00105\u001a\b\u0012\u0004\u0012\u0002030\u00138F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b4\u0010\u0016R'\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u001f\u00108\u001a\u0004\u0018\u00010\u00058F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b7\u0010*R'\u0010:\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b9\u0010\u000bR'\u0010<\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b.\u0010\u000bR%\u0010@\u001a\u0004\u0018\u00018\u00008F@\u0006X\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b'\u0010=\u0012\u0004\b?\u0010\u0011\u001a\u0004\b;\u0010>¨\u0006C" }, d2 = { "kotlin/reflect/jvm/internal/h$a", "Lkotlin/reflect/jvm/internal/k$b;", "Lkotlin/reflect/jvm/internal/k;", "Ljava/lang/Class;", "jClass", "", "f", "", "Lkotlin/reflect/jvm/internal/f;", "q", "Lkotlin/reflect/jvm/internal/d0$a;", "()Ljava/util/Collection;", "inheritedStaticMembers", "Lkotlin/reflect/i;", "h", "k", "getConstructors$annotations", "()V", "constructors", "", "Lkotlin/reflect/t;", "x", "()Ljava/util/List;", "typeParameters", "n", "m", "declaredNonStaticMembers", "o", "declaredStaticMembers", "u", "g", "allMembers", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "d", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "e", "j", "annotations", "t", "()Ljava/lang/String;", "qualifiedName", "Lkotlin/reflect/d;", "sealedSubclasses", "i", "r", "nestedClasses", "l", "declaredMembers", "Lkotlin/reflect/s;", "w", "supertypes", "allNonStaticMembers", "v", "simpleName", "p", "inheritedNonStaticMembers", "s", "allStaticMembers", "Lkotlin/reflect/jvm/internal/d0$b;", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "<init>", "(Lkotlin/reflect/jvm/internal/h;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public final class a extends k.b
    {
        static final /* synthetic */ o[] w;
        @e
        private final d0.a d;
        @e
        private final d0.a e;
        @org.jetbrains.annotations.f
        private final d0.a f;
        @org.jetbrains.annotations.f
        private final d0.a g;
        @e
        private final d0.a h;
        @e
        private final d0.a i;
        @org.jetbrains.annotations.f
        private final d0.b j;
        @e
        private final d0.a k;
        @e
        private final d0.a l;
        @e
        private final d0.a m;
        @e
        private final d0.a n;
        private final d0.a o;
        private final d0.a p;
        private final d0.a q;
        @e
        private final d0.a r;
        @e
        private final d0.a s;
        @e
        private final d0.a t;
        @e
        private final d0.a u;
        final /* synthetic */ h v;
        
        static {
            w = new o[] { k1.r(new f1(k1.d(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), k1.r(new f1(k1.d(a.class), "annotations", "getAnnotations()Ljava/util/List;")), k1.r(new f1(k1.d(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), k1.r(new f1(k1.d(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), k1.r(new f1(k1.d(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), k1.r(new f1(k1.d(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), k1.r(new f1(k1.d(a.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), k1.r(new f1(k1.d(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), k1.r(new f1(k1.d(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), k1.r(new f1(k1.d(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), k1.r(new f1(k1.d(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), k1.r(new f1(k1.d(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), k1.r(new f1(k1.d(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), k1.r(new f1(k1.d(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), k1.r(new f1(k1.d(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), k1.r(new f1(k1.d(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), k1.r(new f1(k1.d(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), k1.r(new f1(k1.d(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;")) };
        }
        
        public a() {
            this.d = (d0.a)d0.d((n6.a<Object>)new n6.a<kotlin.reflect.jvm.internal.impl.descriptors.e>() {
                final /* synthetic */ a G;
                
                public final kotlin.reflect.jvm.internal.impl.descriptors.e a() {
                    final kotlin.reflect.jvm.internal.impl.name.a f0 = kotlin.reflect.jvm.internal.h.this.h0();
                    final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k a = ((k.b)this.G.v.i0().invoke()).a();
                    kotlin.reflect.jvm.internal.impl.descriptors.e e;
                    if (f0.k()) {
                        e = a.a().b(f0);
                    }
                    else {
                        e = kotlin.reflect.jvm.internal.impl.descriptors.x.a(a.b(), f0);
                    }
                    if (e != null) {
                        return e;
                    }
                    kotlin.reflect.jvm.internal.h.this.m0();
                    throw null;
                }
            });
            this.e = (d0.a)d0.d((n6.a<Object>)new n6.a<List<? extends Annotation>>() {
                final /* synthetic */ a G;
                
                public final List<Annotation> a() {
                    return kotlin.reflect.jvm.internal.k0.d(this.G.o());
                }
            });
            this.f = (d0.a)d0.d((n6.a<Object>)new n6.a<String>() {
                final /* synthetic */ a G;
                
                @org.jetbrains.annotations.f
                public final String a() {
                    if (this.G.v.m().isAnonymousClass()) {
                        return null;
                    }
                    final kotlin.reflect.jvm.internal.impl.name.a f0 = kotlin.reflect.jvm.internal.h.this.h0();
                    String s;
                    if (f0.k()) {
                        final a g = this.G;
                        s = g.f(g.v.m());
                    }
                    else {
                        s = f0.j().d();
                        k0.o(s, "classId.shortClassName.asString()");
                    }
                    return s;
                }
            });
            this.g = (d0.a)d0.d((n6.a<Object>)new n6.a<String>() {
                final /* synthetic */ a G;
                
                @org.jetbrains.annotations.f
                public final String a() {
                    final boolean anonymousClass = this.G.v.m().isAnonymousClass();
                    String b = null;
                    if (anonymousClass) {
                        return null;
                    }
                    final kotlin.reflect.jvm.internal.impl.name.a f0 = kotlin.reflect.jvm.internal.h.this.h0();
                    if (!f0.k()) {
                        b = f0.b().b();
                    }
                    return b;
                }
            });
            this.h = (d0.a)d0.d((n6.a<Object>)new n6.a<List<? extends kotlin.reflect.i<? extends T>>>() {
                final /* synthetic */ a G;
                
                public final List<kotlin.reflect.i<T>> a() {
                    final Collection<l> o = this.G.v.O();
                    final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.l>(kotlin.collections.v.Y((Iterable<?>)o, 10));
                    final Iterator<Object> iterator = o.iterator();
                    while (iterator.hasNext()) {
                        list.add(new kotlin.reflect.jvm.internal.l(this.G.v, iterator.next()));
                    }
                    return (List<kotlin.reflect.i<T>>)list;
                }
            });
            this.i = (d0.a)d0.d((n6.a<Object>)new n6.a<List<? extends h<?>>>() {
                final /* synthetic */ a G;
                
                public final List<h<?>> a() {
                    final Collection a = k$a.a((kotlin.reflect.jvm.internal.impl.resolve.scopes.k)this.G.o().B0(), (kotlin.reflect.jvm.internal.impl.resolve.scopes.d)null, (n6.l)null, 3, (Object)null);
                    final ArrayList<m> list = new ArrayList<m>();
                    for (final m next : a) {
                        if (!kotlin.reflect.jvm.internal.impl.resolve.d.B((m)next)) {
                            list.add(next);
                        }
                    }
                    final ArrayList<Object> list2 = new ArrayList<Object>();
                    for (final m obj : list) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        final Class<?> n = kotlin.reflect.jvm.internal.k0.n((kotlin.reflect.jvm.internal.impl.descriptors.e)obj);
                        Object o;
                        if (n != null) {
                            o = new h((Class<Object>)n);
                        }
                        else {
                            o = null;
                        }
                        if (o != null) {
                            list2.add(o);
                        }
                    }
                    return (List<h<?>>)list2;
                }
            });
            this.j = (d0.b)d0.b((n6.a<Object>)new n6.a<T>() {
                final /* synthetic */ a G;
                
                @org.jetbrains.annotations.f
                @Override
                public final T invoke() {
                    final kotlin.reflect.jvm.internal.impl.descriptors.e o = this.G.o();
                    if (o.n() != kotlin.reflect.jvm.internal.impl.descriptors.f.L) {
                        return null;
                    }
                    Field field;
                    if (o.G() && !CompanionObjectMappingUtilsKt.isMappedIntrinsicCompanionObject(CompanionObjectMapping.INSTANCE, o)) {
                        field = this.G.v.m().getEnclosingClass().getDeclaredField(o.getName().d());
                    }
                    else {
                        field = this.G.v.m().getDeclaredField("INSTANCE");
                    }
                    final Object value = field.get(null);
                    Objects.requireNonNull(value, "null cannot be cast to non-null type T");
                    return (T)value;
                }
            });
            this.k = (d0.a)d0.d((n6.a<Object>)new n6.a<List<? extends z>>() {
                final /* synthetic */ a G;
                
                public final List<z> a() {
                    final List<b1> c = this.G.o().C();
                    k0.o(c, "descriptor.declaredTypeParameters");
                    final ArrayList list = new ArrayList<z>(kotlin.collections.v.Y((Iterable<?>)c, 10));
                    for (final b1 b1 : c) {
                        final h v = this.G.v;
                        k0.o(b1, "descriptor");
                        list.add(new z(v, b1));
                    }
                    return (List<z>)list;
                }
            });
            this.l = (d0.a)d0.d((n6.a<Object>)new n6.a<List<? extends kotlin.reflect.jvm.internal.x>>() {
                final /* synthetic */ a G;
                
                public final List<kotlin.reflect.jvm.internal.x> a() {
                    final w0 l = this.G.o().l();
                    k0.o(l, "descriptor.typeConstructor");
                    final Collection k = l.k();
                    k0.o(k, "descriptor.typeConstructor.supertypes");
                    final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.x>(k.size());
                    for (final c0 c0 : k) {
                        k0.o(c0, "kotlinType");
                        list.add(new kotlin.reflect.jvm.internal.x(c0, new a<Type>() {
                            final /* synthetic */ h$a$q H;
                            
                            @e
                            public final Type a() {
                                final kotlin.reflect.jvm.internal.impl.descriptors.h c = c0.N0().c();
                                if (!(c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Supertype not a class: ");
                                    sb.append(c);
                                    throw new b0(sb.toString());
                                }
                                final Class<?> n = kotlin.reflect.jvm.internal.k0.n((kotlin.reflect.jvm.internal.impl.descriptors.e)c);
                                if (n != null) {
                                    Type genericSuperclass;
                                    String s;
                                    if (k0.g(this.H.G.v.m().getSuperclass(), n)) {
                                        genericSuperclass = this.H.G.v.m().getGenericSuperclass();
                                        s = "jClass.genericSuperclass";
                                    }
                                    else {
                                        final Class<?>[] interfaces = this.H.G.v.m().getInterfaces();
                                        k0.o(interfaces, "jClass.interfaces");
                                        final int ff = kotlin.collections.m.ff(interfaces, n);
                                        if (ff < 0) {
                                            final StringBuilder sb2 = new StringBuilder();
                                            sb2.append("No superclass of ");
                                            sb2.append(this.H.G);
                                            sb2.append(" in Java reflection for ");
                                            sb2.append(c);
                                            throw new b0(sb2.toString());
                                        }
                                        genericSuperclass = this.H.G.v.m().getGenericInterfaces()[ff];
                                        s = "jClass.genericInterfaces[index]";
                                    }
                                    k0.o(genericSuperclass, s);
                                    return genericSuperclass;
                                }
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("Unsupported superclass of ");
                                sb3.append(this.H.G);
                                sb3.append(": ");
                                sb3.append(c);
                                throw new b0(sb3.toString());
                            }
                        }));
                    }
                    if (!KotlinBuiltIns.isSpecialClassWithNoSupertypes(this.G.o())) {
                        final boolean empty = list.isEmpty();
                        final int n = 0;
                        int n3 = 0;
                        Label_0226: {
                            if (!empty) {
                                final Iterator<kotlin.reflect.jvm.internal.x> iterator2 = (Iterator<kotlin.reflect.jvm.internal.x>)list.iterator();
                                while (iterator2.hasNext()) {
                                    final kotlin.reflect.jvm.internal.impl.descriptors.e e = kotlin.reflect.jvm.internal.impl.resolve.d.e(iterator2.next().v());
                                    k0.o(e, "DescriptorUtils.getClassDescriptorForType(it.type)");
                                    final kotlin.reflect.jvm.internal.impl.descriptors.f n2 = e.n();
                                    k0.o(n2, "DescriptorUtils.getClass\u2026ptorForType(it.type).kind");
                                    if (n2 != kotlin.reflect.jvm.internal.impl.descriptors.f.H && n2 != kotlin.reflect.jvm.internal.impl.descriptors.f.K) {
                                        n3 = n;
                                        break Label_0226;
                                    }
                                }
                            }
                            n3 = 1;
                        }
                        if (n3 != 0) {
                            final kotlin.reflect.jvm.internal.impl.types.k0 anyType = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)this.G.o()).getAnyType();
                            k0.o(anyType, "descriptor.builtIns.anyType");
                            list.add(new kotlin.reflect.jvm.internal.x((c0)anyType, h$a$q$b.G));
                        }
                    }
                    return (List<kotlin.reflect.jvm.internal.x>)kotlin.reflect.jvm.internal.impl.utils.a.c(list);
                }
            });
            this.m = (d0.a)d0.d((n6.a<Object>)new n6.a<List<? extends h<? extends T>>>() {
                final /* synthetic */ a G;
                
                public final List<h<? extends T>> a() {
                    final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> s = this.G.o().s();
                    k0.o(s, "descriptor.sealedSubclasses");
                    final ArrayList<h> list = (ArrayList<h>)new ArrayList<h<? extends T>>();
                    for (final kotlin.reflect.jvm.internal.impl.descriptors.e obj : s) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        final Class<?> n = kotlin.reflect.jvm.internal.k0.n(obj);
                        h<? extends T> h;
                        if (n != null) {
                            h = (h<? extends T>)new h<T>((Class<? extends T>)n);
                        }
                        else {
                            h = null;
                        }
                        if (h != null) {
                            list.add(h);
                        }
                    }
                    return (List<h<? extends T>>)list;
                }
            });
            this.n = (d0.a)d0.d((n6.a<Object>)new n6.a<Collection<? extends kotlin.reflect.jvm.internal.f<?>>>() {
                final /* synthetic */ a G;
                
                public final Collection<kotlin.reflect.jvm.internal.f<?>> a() {
                    final h v = this.G.v;
                    return v.R(v.k0(), kotlin.reflect.jvm.internal.k.c.G);
                }
            });
            this.o = (d0.a)d0.d((n6.a<Object>)new n6.a<Collection<? extends kotlin.reflect.jvm.internal.f<?>>>() {
                final /* synthetic */ a G;
                
                public final Collection<kotlin.reflect.jvm.internal.f<?>> a() {
                    final h v = this.G.v;
                    return v.R(v.l0(), kotlin.reflect.jvm.internal.k.c.G);
                }
            });
            this.p = (d0.a)d0.d((n6.a<Object>)new n6.a<Collection<? extends kotlin.reflect.jvm.internal.f<?>>>() {
                final /* synthetic */ a G;
                
                public final Collection<kotlin.reflect.jvm.internal.f<?>> a() {
                    final h v = this.G.v;
                    return v.R(v.k0(), kotlin.reflect.jvm.internal.k.c.H);
                }
            });
            this.q = (d0.a)d0.d((n6.a<Object>)new n6.a<Collection<? extends kotlin.reflect.jvm.internal.f<?>>>() {
                final /* synthetic */ a G;
                
                public final Collection<kotlin.reflect.jvm.internal.f<?>> a() {
                    final h v = this.G.v;
                    return v.R(v.l0(), kotlin.reflect.jvm.internal.k.c.H);
                }
            });
            this.r = (d0.a)d0.d((n6.a<Object>)new n6.a<List<? extends kotlin.reflect.jvm.internal.f<?>>>() {
                final /* synthetic */ a G;
                
                public final List<kotlin.reflect.jvm.internal.f<?>> a() {
                    return kotlin.collections.v.q4((Collection<? extends kotlin.reflect.jvm.internal.f<?>>)this.G.m(), (Iterable<? extends kotlin.reflect.jvm.internal.f<?>>)kotlin.reflect.jvm.internal.h.a.this.p());
                }
            });
            this.s = (d0.a)d0.d((n6.a<Object>)new n6.a<List<? extends kotlin.reflect.jvm.internal.f<?>>>() {
                public final List<kotlin.reflect.jvm.internal.f<?>> a() {
                    return kotlin.collections.v.q4((Collection<? extends kotlin.reflect.jvm.internal.f<?>>)kotlin.reflect.jvm.internal.h.a.this.n(), (Iterable<? extends kotlin.reflect.jvm.internal.f<?>>)kotlin.reflect.jvm.internal.h.a.this.q());
                }
            });
            this.t = (d0.a)d0.d((n6.a<Object>)new n6.a<List<? extends kotlin.reflect.jvm.internal.f<?>>>() {
                final /* synthetic */ a G;
                
                public final List<kotlin.reflect.jvm.internal.f<?>> a() {
                    return kotlin.collections.v.q4((Collection<? extends kotlin.reflect.jvm.internal.f<?>>)this.G.m(), (Iterable<? extends kotlin.reflect.jvm.internal.f<?>>)kotlin.reflect.jvm.internal.h.a.this.n());
                }
            });
            this.u = (d0.a)d0.d((n6.a<Object>)new n6.a<List<? extends kotlin.reflect.jvm.internal.f<?>>>() {
                final /* synthetic */ a G;
                
                public final List<kotlin.reflect.jvm.internal.f<?>> a() {
                    return kotlin.collections.v.q4((Collection<? extends kotlin.reflect.jvm.internal.f<?>>)this.G.h(), (Iterable<? extends kotlin.reflect.jvm.internal.f<?>>)this.G.i());
                }
            });
        }
        
        private final String f(final Class<?> clazz) {
            final String simpleName = clazz.getSimpleName();
            final Method enclosingMethod = clazz.getEnclosingMethod();
            if (enclosingMethod != null) {
                k0.o(simpleName, "name");
                final StringBuilder sb = new StringBuilder();
                sb.append(enclosingMethod.getName());
                sb.append("$");
                return kotlin.text.s.m5(simpleName, sb.toString(), (String)null, 2, (Object)null);
            }
            final Constructor enclosingConstructor = clazz.getEnclosingConstructor();
            k0.o(simpleName, "name");
            if (enclosingConstructor != null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(enclosingConstructor.getName());
                sb2.append("$");
                return kotlin.text.s.m5(simpleName, sb2.toString(), (String)null, 2, (Object)null);
            }
            return kotlin.text.s.l5(simpleName, '$', (String)null, 2, (Object)null);
        }
        
        private final Collection<kotlin.reflect.jvm.internal.f<?>> n() {
            return (Collection<kotlin.reflect.jvm.internal.f<?>>)((d0.c)this.o).b(this, a.w[11]);
        }
        
        private final Collection<kotlin.reflect.jvm.internal.f<?>> p() {
            return (Collection<kotlin.reflect.jvm.internal.f<?>>)((d0.c)this.p).b(this, a.w[12]);
        }
        
        private final Collection<kotlin.reflect.jvm.internal.f<?>> q() {
            return (Collection<kotlin.reflect.jvm.internal.f<?>>)((d0.c)this.q).b(this, a.w[13]);
        }
        
        @e
        public final Collection<kotlin.reflect.jvm.internal.f<?>> g() {
            return (Collection<kotlin.reflect.jvm.internal.f<?>>)((d0.c)this.u).b(this, a.w[17]);
        }
        
        @e
        public final Collection<kotlin.reflect.jvm.internal.f<?>> h() {
            return (Collection<kotlin.reflect.jvm.internal.f<?>>)((d0.c)this.r).b(this, a.w[14]);
        }
        
        @e
        public final Collection<kotlin.reflect.jvm.internal.f<?>> i() {
            return (Collection<kotlin.reflect.jvm.internal.f<?>>)((d0.c)this.s).b(this, a.w[15]);
        }
        
        @e
        public final List<Annotation> j() {
            return (List<Annotation>)((d0.c)this.e).b(this, a.w[1]);
        }
        
        @e
        public final Collection<kotlin.reflect.i<T>> k() {
            return (Collection<kotlin.reflect.i<T>>)((d0.c)this.h).b(this, a.w[4]);
        }
        
        @e
        public final Collection<kotlin.reflect.jvm.internal.f<?>> l() {
            return (Collection<kotlin.reflect.jvm.internal.f<?>>)((d0.c)this.t).b(this, a.w[16]);
        }
        
        @e
        public final Collection<kotlin.reflect.jvm.internal.f<?>> m() {
            return (Collection<kotlin.reflect.jvm.internal.f<?>>)((d0.c)this.n).b(this, a.w[10]);
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.descriptors.e o() {
            return (kotlin.reflect.jvm.internal.impl.descriptors.e)((d0.c)this.d).b(this, a.w[0]);
        }
        
        @e
        public final Collection<d<?>> r() {
            return (Collection<d<?>>)((d0.c)this.i).b(this, a.w[5]);
        }
        
        @org.jetbrains.annotations.f
        public final T s() {
            return (T)((d0.c)this.j).b(this, a.w[6]);
        }
        
        @org.jetbrains.annotations.f
        public final String t() {
            return (String)((d0.c)this.g).b(this, a.w[3]);
        }
        
        @e
        public final List<d<? extends T>> u() {
            return (List<d<? extends T>>)((d0.c)this.m).b(this, a.w[9]);
        }
        
        @org.jetbrains.annotations.f
        public final String v() {
            return (String)((d0.c)this.f).b(this, a.w[2]);
        }
        
        @e
        public final List<s> w() {
            return (List<s>)((d0.c)this.l).b(this, a.w[8]);
        }
        
        @e
        public final List<kotlin.reflect.t> x() {
            return (List<kotlin.reflect.t>)((d0.c)this.k).b(this, a.w[7]);
        }
    }
}
