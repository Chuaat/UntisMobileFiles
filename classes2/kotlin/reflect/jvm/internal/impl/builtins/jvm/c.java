// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Objects;
import org.jetbrains.annotations.f;
import kotlin.text.s;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.g;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import java.lang.annotation.Annotation;
import kotlin.collections.v;
import java.util.Map;
import java.util.ListIterator;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.name.d;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.jvm.internal.k0;
import java.util.List;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.a;
import org.jetbrains.annotations.e;

public final class c
{
    @e
    public static final c a;
    @e
    private static final String b;
    @e
    private static final String c;
    @e
    private static final String d;
    @e
    private static final String e;
    @e
    private static final kotlin.reflect.jvm.internal.impl.name.a f;
    @e
    private static final b g;
    @e
    private static final kotlin.reflect.jvm.internal.impl.name.a h;
    @e
    private static final kotlin.reflect.jvm.internal.impl.name.a i;
    @e
    private static final kotlin.reflect.jvm.internal.impl.name.a j;
    @e
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.a> k;
    @e
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.a> l;
    @e
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.c, b> m;
    @e
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.c, b> n;
    @e
    private static final List<a> o;
    
    static {
        final c c2 = a = new c();
        final StringBuilder sb = new StringBuilder();
        final kotlin.reflect.jvm.internal.impl.builtins.functions.c j2 = kotlin.reflect.jvm.internal.impl.builtins.functions.c.J;
        sb.append(j2.d().toString());
        sb.append('.');
        sb.append(j2.b());
        b = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        final kotlin.reflect.jvm.internal.impl.builtins.functions.c l2 = kotlin.reflect.jvm.internal.impl.builtins.functions.c.L;
        sb2.append(l2.d().toString());
        sb2.append('.');
        sb2.append(l2.b());
        c = sb2.toString();
        final StringBuilder sb3 = new StringBuilder();
        final kotlin.reflect.jvm.internal.impl.builtins.functions.c k2 = kotlin.reflect.jvm.internal.impl.builtins.functions.c.K;
        sb3.append(k2.d().toString());
        sb3.append('.');
        sb3.append(k2.b());
        d = sb3.toString();
        final StringBuilder sb4 = new StringBuilder();
        final kotlin.reflect.jvm.internal.impl.builtins.functions.c m2 = kotlin.reflect.jvm.internal.impl.builtins.functions.c.M;
        sb4.append(m2.d().toString());
        sb4.append('.');
        sb4.append(m2.b());
        e = sb4.toString();
        final kotlin.reflect.jvm.internal.impl.name.a m3 = kotlin.reflect.jvm.internal.impl.name.a.m(new b("kotlin.jvm.functions.FunctionN"));
        k0.o(m3, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        f = m3;
        final b b2 = m3.b();
        k0.o(b2, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        g = b2;
        final kotlin.reflect.jvm.internal.impl.name.a m4 = kotlin.reflect.jvm.internal.impl.name.a.m(new b("kotlin.reflect.KFunction"));
        k0.o(m4, "topLevel(FqName(\"kotlin.reflect.KFunction\"))");
        h = m4;
        final kotlin.reflect.jvm.internal.impl.name.a m5 = kotlin.reflect.jvm.internal.impl.name.a.m(new b("kotlin.reflect.KClass"));
        k0.o(m5, "topLevel(FqName(\"kotlin.reflect.KClass\"))");
        i = m5;
        j = c2.h(Class.class);
        k = new HashMap<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.a>();
        l = new HashMap<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.a>();
        m = new HashMap<kotlin.reflect.jvm.internal.impl.name.c, b>();
        n = new HashMap<kotlin.reflect.jvm.internal.impl.name.c, b>();
        final kotlin.reflect.jvm.internal.impl.name.a m6 = kotlin.reflect.jvm.internal.impl.name.a.m(StandardNames.FqNames.iterable);
        k0.o(m6, "topLevel(FqNames.iterable)");
        final b mutableIterable = StandardNames.FqNames.mutableIterable;
        final b h2 = m6.h();
        final b h3 = m6.h();
        k0.o(h3, "kotlinReadOnly.packageFqName");
        final b d2 = kotlin.reflect.jvm.internal.impl.name.d.d(mutableIterable, h3);
        final int n2 = 0;
        final a a2 = new a(c2.h(Iterable.class), m6, new kotlin.reflect.jvm.internal.impl.name.a(h2, d2, false));
        final kotlin.reflect.jvm.internal.impl.name.a m7 = kotlin.reflect.jvm.internal.impl.name.a.m(StandardNames.FqNames.iterator);
        k0.o(m7, "topLevel(FqNames.iterator)");
        final b mutableIterator = StandardNames.FqNames.mutableIterator;
        final b h4 = m7.h();
        final b h5 = m7.h();
        k0.o(h5, "kotlinReadOnly.packageFqName");
        final a a3 = new a(c2.h(Iterator.class), m7, new kotlin.reflect.jvm.internal.impl.name.a(h4, kotlin.reflect.jvm.internal.impl.name.d.d(mutableIterator, h5), false));
        final kotlin.reflect.jvm.internal.impl.name.a m8 = kotlin.reflect.jvm.internal.impl.name.a.m(StandardNames.FqNames.collection);
        k0.o(m8, "topLevel(FqNames.collection)");
        final b mutableCollection = StandardNames.FqNames.mutableCollection;
        final b h6 = m8.h();
        final b h7 = m8.h();
        k0.o(h7, "kotlinReadOnly.packageFqName");
        final a a4 = new a(c2.h(Collection.class), m8, new kotlin.reflect.jvm.internal.impl.name.a(h6, kotlin.reflect.jvm.internal.impl.name.d.d(mutableCollection, h7), false));
        final kotlin.reflect.jvm.internal.impl.name.a m9 = kotlin.reflect.jvm.internal.impl.name.a.m(StandardNames.FqNames.list);
        k0.o(m9, "topLevel(FqNames.list)");
        final b mutableList = StandardNames.FqNames.mutableList;
        final b h8 = m9.h();
        final b h9 = m9.h();
        k0.o(h9, "kotlinReadOnly.packageFqName");
        final a a5 = new a(c2.h(List.class), m9, new kotlin.reflect.jvm.internal.impl.name.a(h8, kotlin.reflect.jvm.internal.impl.name.d.d(mutableList, h9), false));
        final kotlin.reflect.jvm.internal.impl.name.a m10 = kotlin.reflect.jvm.internal.impl.name.a.m(StandardNames.FqNames.set);
        k0.o(m10, "topLevel(FqNames.set)");
        final b mutableSet = StandardNames.FqNames.mutableSet;
        final b h10 = m10.h();
        final b h11 = m10.h();
        k0.o(h11, "kotlinReadOnly.packageFqName");
        final a a6 = new a(c2.h(Set.class), m10, new kotlin.reflect.jvm.internal.impl.name.a(h10, kotlin.reflect.jvm.internal.impl.name.d.d(mutableSet, h11), false));
        final kotlin.reflect.jvm.internal.impl.name.a m11 = kotlin.reflect.jvm.internal.impl.name.a.m(StandardNames.FqNames.listIterator);
        k0.o(m11, "topLevel(FqNames.listIterator)");
        final b mutableListIterator = StandardNames.FqNames.mutableListIterator;
        final b h12 = m11.h();
        final b h13 = m11.h();
        k0.o(h13, "kotlinReadOnly.packageFqName");
        final a a7 = new a(c2.h(ListIterator.class), m11, new kotlin.reflect.jvm.internal.impl.name.a(h12, kotlin.reflect.jvm.internal.impl.name.d.d(mutableListIterator, h13), false));
        final b map = StandardNames.FqNames.map;
        final kotlin.reflect.jvm.internal.impl.name.a m12 = kotlin.reflect.jvm.internal.impl.name.a.m(map);
        k0.o(m12, "topLevel(FqNames.map)");
        final b mutableMap = StandardNames.FqNames.mutableMap;
        final b h14 = m12.h();
        final b h15 = m12.h();
        k0.o(h15, "kotlinReadOnly.packageFqName");
        final a a8 = new a(c2.h(Map.class), m12, new kotlin.reflect.jvm.internal.impl.name.a(h14, kotlin.reflect.jvm.internal.impl.name.d.d(mutableMap, h15), false));
        final kotlin.reflect.jvm.internal.impl.name.a d3 = kotlin.reflect.jvm.internal.impl.name.a.m(map).d(StandardNames.FqNames.mapEntry.g());
        k0.o(d3, "topLevel(FqNames.map).createNestedClassId(FqNames.mapEntry.shortName())");
        final b mutableMapEntry = StandardNames.FqNames.mutableMapEntry;
        final b h16 = d3.h();
        final b h17 = d3.h();
        k0.o(h17, "kotlinReadOnly.packageFqName");
        final List<a> list = (List<a>)(o = v.L(a2, a3, a4, a5, a6, a7, a8, new a(c2.h(Map.Entry.class), d3, new kotlin.reflect.jvm.internal.impl.name.a(h16, kotlin.reflect.jvm.internal.impl.name.d.d(mutableMapEntry, h17), false))));
        c2.g(Object.class, StandardNames.FqNames.any);
        c2.g(String.class, StandardNames.FqNames.string);
        c2.g(CharSequence.class, StandardNames.FqNames.charSequence);
        c2.f(Throwable.class, StandardNames.FqNames.throwable);
        c2.g(Cloneable.class, StandardNames.FqNames.cloneable);
        c2.g(Number.class, StandardNames.FqNames.number);
        c2.f(Comparable.class, StandardNames.FqNames.comparable);
        c2.g(Enum.class, StandardNames.FqNames._enum);
        c2.f(Annotation.class, StandardNames.FqNames.annotation);
        final Iterator<a> iterator = list.iterator();
        while (iterator.hasNext()) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a.e(iterator.next());
        }
        final kotlin.reflect.jvm.internal.impl.resolve.jvm.d[] values = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.values();
        final int length = values.length;
        int n3 = 0;
        while (n3 < length) {
            final kotlin.reflect.jvm.internal.impl.resolve.jvm.d d4 = values[n3];
            ++n3;
            final c a9 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a;
            final kotlin.reflect.jvm.internal.impl.name.a m13 = kotlin.reflect.jvm.internal.impl.name.a.m(d4.j());
            k0.o(m13, "topLevel(jvmType.wrapperFqName)");
            final StandardNames instance = StandardNames.INSTANCE;
            final PrimitiveType i2 = d4.i();
            k0.o(i2, "jvmType.primitiveType");
            final kotlin.reflect.jvm.internal.impl.name.a m14 = kotlin.reflect.jvm.internal.impl.name.a.m(StandardNames.getPrimitiveFqName(i2));
            k0.o(m14, "topLevel(StandardNames.getPrimitiveFqName(jvmType.primitiveType))");
            a9.b(m13, m14);
        }
        for (final kotlin.reflect.jvm.internal.impl.name.a a10 : CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            final c a11 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a;
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("kotlin.jvm.internal.");
            sb5.append(a10.j().d());
            sb5.append("CompanionObject");
            final kotlin.reflect.jvm.internal.impl.name.a m15 = kotlin.reflect.jvm.internal.impl.name.a.m(new b(sb5.toString()));
            k0.o(m15, "topLevel(FqName(\"kotlin.jvm.internal.\" + classId.shortClassName.asString() + \"CompanionObject\"))");
            final kotlin.reflect.jvm.internal.impl.name.a d5 = a10.d(kotlin.reflect.jvm.internal.impl.name.g.c);
            k0.o(d5, "classId.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT)");
            a11.b(m15, d5);
        }
        int n4 = 0;
        while (true) {
            final int n5 = n4 + 1;
            final c a12 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a;
            final kotlin.reflect.jvm.internal.impl.name.a m16 = kotlin.reflect.jvm.internal.impl.name.a.m(new b(k0.C("kotlin.jvm.functions.Function", n4)));
            k0.o(m16, "topLevel(FqName(\"kotlin.jvm.functions.Function$i\"))");
            final StandardNames instance2 = StandardNames.INSTANCE;
            a12.b(m16, StandardNames.getFunctionClassId(n4));
            a12.d(new b(k0.C(kotlin.reflect.jvm.internal.impl.builtins.jvm.c.c, n4)), kotlin.reflect.jvm.internal.impl.builtins.jvm.c.h);
            if (n5 >= 23) {
                break;
            }
            n4 = n5;
        }
        int i3 = n2;
        c a13;
        while (true) {
            final int n6 = i3 + 1;
            final kotlin.reflect.jvm.internal.impl.builtins.functions.c m17 = kotlin.reflect.jvm.internal.impl.builtins.functions.c.M;
            final StringBuilder sb6 = new StringBuilder();
            sb6.append(m17.d().toString());
            sb6.append('.');
            sb6.append(m17.b());
            final String string = sb6.toString();
            a13 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a;
            a13.d(new b(k0.C(string, i3)), kotlin.reflect.jvm.internal.impl.builtins.jvm.c.h);
            if (n6 >= 22) {
                break;
            }
            i3 = n6;
        }
        final b l3 = StandardNames.FqNames.nothing.l();
        k0.o(l3, "nothing.toSafe()");
        a13.d(l3, a13.h(Void.class));
    }
    
    private c() {
    }
    
    private final void b(final kotlin.reflect.jvm.internal.impl.name.a a, final kotlin.reflect.jvm.internal.impl.name.a a2) {
        this.c(a, a2);
        final b b = a2.b();
        k0.o(b, "kotlinClassId.asSingleFqName()");
        this.d(b, a);
    }
    
    private final void c(final kotlin.reflect.jvm.internal.impl.name.a a, final kotlin.reflect.jvm.internal.impl.name.a a2) {
        final HashMap<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.a> k = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.k;
        final kotlin.reflect.jvm.internal.impl.name.c j = a.b().j();
        k0.o(j, "javaClassId.asSingleFqName().toUnsafe()");
        k.put(j, a2);
    }
    
    private final void d(final b b, final kotlin.reflect.jvm.internal.impl.name.a a) {
        final HashMap<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.a> l = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.l;
        final kotlin.reflect.jvm.internal.impl.name.c j = b.j();
        k0.o(j, "kotlinFqNameUnsafe.toUnsafe()");
        l.put(j, a);
    }
    
    private final void e(final a a) {
        final kotlin.reflect.jvm.internal.impl.name.a a2 = a.a();
        final kotlin.reflect.jvm.internal.impl.name.a b = a.b();
        final kotlin.reflect.jvm.internal.impl.name.a c = a.c();
        this.b(a2, b);
        final b b2 = c.b();
        k0.o(b2, "mutableClassId.asSingleFqName()");
        this.d(b2, a2);
        final b b3 = b.b();
        k0.o(b3, "readOnlyClassId.asSingleFqName()");
        final b b4 = c.b();
        k0.o(b4, "mutableClassId.asSingleFqName()");
        final HashMap<kotlin.reflect.jvm.internal.impl.name.c, b> m = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.m;
        final kotlin.reflect.jvm.internal.impl.name.c j = c.b().j();
        k0.o(j, "mutableClassId.asSingleFqName().toUnsafe()");
        m.put(j, b3);
        final HashMap<kotlin.reflect.jvm.internal.impl.name.c, b> n = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.n;
        final kotlin.reflect.jvm.internal.impl.name.c i = b3.j();
        k0.o(i, "readOnlyFqName.toUnsafe()");
        n.put(i, b4);
    }
    
    private final void f(final Class<?> clazz, final b b) {
        final kotlin.reflect.jvm.internal.impl.name.a h = this.h(clazz);
        final kotlin.reflect.jvm.internal.impl.name.a m = kotlin.reflect.jvm.internal.impl.name.a.m(b);
        k0.o(m, "topLevel(kotlinFqName)");
        this.b(h, m);
    }
    
    private final void g(final Class<?> clazz, final kotlin.reflect.jvm.internal.impl.name.c c) {
        final b l = c.l();
        k0.o(l, "kotlinFqName.toSafe()");
        this.f(clazz, l);
    }
    
    private final kotlin.reflect.jvm.internal.impl.name.a h(final Class<?> clazz) {
        if (!clazz.isPrimitive()) {
            clazz.isArray();
        }
        final Class declaringClass = clazz.getDeclaringClass();
        kotlin.reflect.jvm.internal.impl.name.a a;
        String s;
        if (declaringClass == null) {
            a = kotlin.reflect.jvm.internal.impl.name.a.m(new b(clazz.getCanonicalName()));
            s = "topLevel(FqName(clazz.canonicalName))";
        }
        else {
            a = this.h(declaringClass).d(kotlin.reflect.jvm.internal.impl.name.e.i(clazz.getSimpleName()));
            s = "classId(outer).createNestedClassId(Name.identifier(clazz.simpleName))";
        }
        k0.o(a, s);
        return a;
    }
    
    private final boolean k(final kotlin.reflect.jvm.internal.impl.name.c c, final String s) {
        final String b = c.b();
        k0.o(b, "kotlinFqName.asString()");
        final String k5 = s.k5(b, s, "");
        final int length = k5.length();
        boolean b2 = true;
        if (length > 0 && !s.a5((CharSequence)k5, '0', false, 2, (Object)null)) {
            final Integer x0 = s.X0(k5);
            if (x0 == null || x0 < 23) {
                b2 = false;
            }
            return b2;
        }
        return false;
    }
    
    @e
    public final b i() {
        return kotlin.reflect.jvm.internal.impl.builtins.jvm.c.g;
    }
    
    @e
    public final List<a> j() {
        return kotlin.reflect.jvm.internal.impl.builtins.jvm.c.o;
    }
    
    public final boolean l(@f final kotlin.reflect.jvm.internal.impl.name.c c) {
        final HashMap<kotlin.reflect.jvm.internal.impl.name.c, b> m = c.m;
        Objects.requireNonNull(m, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return m.containsKey(c);
    }
    
    public final boolean m(@f final kotlin.reflect.jvm.internal.impl.name.c c) {
        final HashMap<kotlin.reflect.jvm.internal.impl.name.c, b> n = c.n;
        Objects.requireNonNull(n, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return n.containsKey(c);
    }
    
    @f
    public final kotlin.reflect.jvm.internal.impl.name.a n(@e final b b) {
        k0.p(b, "fqName");
        return kotlin.reflect.jvm.internal.impl.builtins.jvm.c.k.get(b.j());
    }
    
    @f
    public final kotlin.reflect.jvm.internal.impl.name.a o(@e final kotlin.reflect.jvm.internal.impl.name.c key) {
        k0.p(key, "kotlinFqName");
        kotlin.reflect.jvm.internal.impl.name.a a;
        if (!this.k(key, kotlin.reflect.jvm.internal.impl.builtins.jvm.c.b) && !this.k(key, kotlin.reflect.jvm.internal.impl.builtins.jvm.c.d)) {
            if (!this.k(key, kotlin.reflect.jvm.internal.impl.builtins.jvm.c.c) && !this.k(key, kotlin.reflect.jvm.internal.impl.builtins.jvm.c.e)) {
                a = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.l.get(key);
            }
            else {
                a = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.h;
            }
        }
        else {
            a = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f;
        }
        return a;
    }
    
    @f
    public final b p(@f final kotlin.reflect.jvm.internal.impl.name.c c) {
        return c.m.get(c);
    }
    
    @f
    public final b q(@f final kotlin.reflect.jvm.internal.impl.name.c c) {
        return c.n.get(c);
    }
    
    public static final class a
    {
        @e
        private final kotlin.reflect.jvm.internal.impl.name.a a;
        @e
        private final kotlin.reflect.jvm.internal.impl.name.a b;
        @e
        private final kotlin.reflect.jvm.internal.impl.name.a c;
        
        public a(@e final kotlin.reflect.jvm.internal.impl.name.a a, @e final kotlin.reflect.jvm.internal.impl.name.a b, @e final kotlin.reflect.jvm.internal.impl.name.a c) {
            k0.p(a, "javaClass");
            k0.p(b, "kotlinReadOnly");
            k0.p(c, "kotlinMutable");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.name.a a() {
            return this.a;
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.name.a b() {
            return this.b;
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.name.a c() {
            return this.c;
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.name.a d() {
            return this.a;
        }
        
        @Override
        public boolean equals(@f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return k0.g(this.a, a.a) && k0.g(this.b, a.b) && k0.g(this.c, a.c);
        }
        
        @Override
        public int hashCode() {
            return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("PlatformMutabilityMapping(javaClass=");
            sb.append(this.a);
            sb.append(", kotlinReadOnly=");
            sb.append(this.b);
            sb.append(", kotlinMutable=");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }
    }
}
