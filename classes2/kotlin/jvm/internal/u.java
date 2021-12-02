// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import java.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.reflect.x;
import java.lang.annotation.Annotation;
import kotlin.e1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedHashMap;
import kotlin.collections.y0;
import kotlin.n1;
import kotlin.s0;
import java.util.ArrayList;
import n6.o;
import n6.n;
import n6.m;
import n6.k;
import n6.j;
import n6.i;
import n6.h;
import n6.g;
import n6.f;
import n6.c;
import n6.b;
import n6.v;
import n6.s;
import n6.r;
import n6.q;
import n6.p;
import n6.l;
import n6.a;
import org.jetbrains.annotations.e;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001XB\u0013\u0012\n\u00106\u001a\u0006\u0012\u0002\b\u000301¢\u0006\u0004\bV\u0010WJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0017J\u0013\u0010\n\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001c\u0010\u0013\u001a\u00020\u00078V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00148V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a0\u00198V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u00020\u00078V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001e\u0010\u0010R\u001c\u0010\"\u001a\u00020\u00078V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0012\u001a\u0004\b \u0010\u0010R\"\u0010(\u001a\b\u0012\u0004\u0012\u00020$0#8V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0012\u001a\u0004\b%\u0010&R*\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010#8V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0012\u001a\u0004\b)\u0010&R\u001c\u0010.\u001a\u00020\u00078V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b-\u0010\u0012\u001a\u0004\b,\u0010\u0010R\u001c\u0010/\u001a\u00020\u00078V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0012\u001a\u0004\b/\u0010\u0010R \u00106\u001a\u0006\u0012\u0002\b\u0003018\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\r8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001c\u0010<\u001a\u00020\u00078V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b;\u0010\u0012\u001a\u0004\b:\u0010\u0010R\"\u0010@\u001a\b\u0012\u0004\u0012\u00020=0#8V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0012\u001a\u0004\b>\u0010&R\u001c\u0010A\u001a\u00020\u00078V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\bB\u0010\u0012\u001a\u0004\bA\u0010\u0010R\u0018\u0010D\u001a\u0004\u0018\u00010\r8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u00108R \u0010F\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00198V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u001cR\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020G0#8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010&R \u0010L\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030J0\u00198V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u001cR\u001c\u0010O\u001a\u00020\u00078V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\bN\u0010\u0012\u001a\u0004\bM\u0010\u0010R\u0018\u0010R\u001a\u0004\u0018\u00010\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001c\u0010U\u001a\u00020\u00078V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\bT\u0010\u0012\u001a\u0004\bS\u0010\u0010¨\u0006Y" }, d2 = { "Lkotlin/jvm/internal/u;", "Lkotlin/reflect/d;", "", "Lkotlin/jvm/internal/t;", "", "C", "value", "", "S", "other", "equals", "", "hashCode", "", "toString", "u", "()Z", "isInner$annotations", "()V", "isInner", "Lkotlin/reflect/x;", "getVisibility", "()Lkotlin/reflect/x;", "getVisibility$annotations", "visibility", "", "Lkotlin/reflect/i;", "j", "()Ljava/util/Collection;", "constructors", "isFinal", "isFinal$annotations", "M", "isCompanion$annotations", "isCompanion", "", "Lkotlin/reflect/t;", "getTypeParameters", "()Ljava/util/List;", "getTypeParameters$annotations", "typeParameters", "s", "getSealedSubclasses$annotations", "sealedSubclasses", "w", "isSealed$annotations", "isSealed", "isOpen", "isOpen$annotations", "Ljava/lang/Class;", "G", "Ljava/lang/Class;", "m", "()Ljava/lang/Class;", "jClass", "H", "()Ljava/lang/String;", "simpleName", "t", "isValue$annotations", "isValue", "Lkotlin/reflect/s;", "k", "getSupertypes$annotations", "supertypes", "isAbstract", "isAbstract$annotations", "E", "qualifiedName", "F", "nestedClasses", "", "getAnnotations", "annotations", "Lkotlin/reflect/c;", "x", "members", "D", "isData$annotations", "isData", "J", "()Ljava/lang/Object;", "objectInstance", "q", "isFun$annotations", "isFun", "<init>", "(Ljava/lang/Class;)V", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class u implements d<Object>, t
{
    private static final Map<Class<? extends kotlin.t<?>>, Integer> H;
    private static final HashMap<String, String> I;
    private static final HashMap<String, String> J;
    private static final HashMap<String, String> K;
    private static final Map<String, String> L;
    @e
    public static final a M;
    @e
    private final Class<?> G;
    
    static {
        M = new a(null);
        int i = 0;
        final List<Class> l = kotlin.collections.v.L(n6.a.class, l.class, p.class, q.class, r.class, s.class, n6.t.class, n6.u.class, v.class, n6.w.class, n6.b.class, c.class, n6.d.class, n6.e.class, f.class, n6.g.class, n6.h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        final ArrayList list = new ArrayList<s0<? extends Class<? extends kotlin.t<?>>, ? extends Integer>>(kotlin.collections.v.Y((Iterable<?>)l, 10));
        for (final Class next : l) {
            if (i < 0) {
                kotlin.collections.v.W();
            }
            list.add(n1.a(next, i));
            ++i;
        }
        H = y0.B0((Iterable<? extends s0<? extends Class<? extends kotlin.t<?>>, ? extends Integer>>)list);
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        I = hashMap;
        final HashMap<String, String> hashMap2 = new HashMap<String, String>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        J = hashMap2;
        final HashMap<String, String> k = new HashMap<String, String>();
        k.put("java.lang.Object", "kotlin.Any");
        k.put("java.lang.String", "kotlin.String");
        k.put("java.lang.CharSequence", "kotlin.CharSequence");
        k.put("java.lang.Throwable", "kotlin.Throwable");
        k.put("java.lang.Cloneable", "kotlin.Cloneable");
        k.put("java.lang.Number", "kotlin.Number");
        k.put("java.lang.Comparable", "kotlin.Comparable");
        k.put("java.lang.Enum", "kotlin.Enum");
        k.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        k.put("java.lang.Iterable", "kotlin.collections.Iterable");
        k.put("java.util.Iterator", "kotlin.collections.Iterator");
        k.put("java.util.Collection", "kotlin.collections.Collection");
        k.put("java.util.List", "kotlin.collections.List");
        k.put("java.util.Set", "kotlin.collections.Set");
        k.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        k.put("java.util.Map", "kotlin.collections.Map");
        k.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        k.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        k.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        k.putAll(hashMap);
        k.putAll(hashMap2);
        final Collection<String> values = hashMap.values();
        k0.o(values, "primitiveFqNames.values");
        for (final String str : values) {
            final StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            k0.o(str, "kotlinName");
            sb.append(kotlin.text.s.p5(str, '.', (String)null, 2, (Object)null));
            sb.append("CompanionObject");
            final String string = sb.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".Companion");
            final s0<String, B> a = n1.a(string, (B)sb2.toString());
            k.put((String)a.e(), a.f());
        }
        for (final Map.Entry<Class<? extends kotlin.t<?>>, Integer> entry : u.H.entrySet()) {
            final Class<? extends kotlin.t<?>> clazz = entry.getKey();
            final int intValue = entry.getValue().intValue();
            final String name = clazz.getName();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("kotlin.Function");
            sb3.append(intValue);
            k.put(name, sb3.toString());
        }
        K = k;
        final LinkedHashMap j = new LinkedHashMap<Object, String>(y0.j(k.size()));
        for (final Map.Entry<Object, V> entry2 : k.entrySet()) {
            j.put(entry2.getKey(), kotlin.text.s.p5((String)entry2.getValue(), '.', (String)null, 2, (Object)null));
        }
        L = j;
    }
    
    public u(@e final Class<?> g) {
        k0.p(g, "jClass");
        this.G = g;
    }
    
    public static final /* synthetic */ Map A() {
        return u.H;
    }
    
    public static final /* synthetic */ Map B() {
        return u.L;
    }
    
    private final Void C() {
        throw new m6.o();
    }
    
    public static final /* synthetic */ HashMap z() {
        return u.K;
    }
    
    @Override
    public boolean D() {
        this.C();
        throw new kotlin.w();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public String E() {
        return u.M.a(this.m());
    }
    
    @e
    @Override
    public Collection<d<?>> F() {
        this.C();
        throw new kotlin.w();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public String H() {
        return u.M.b(this.m());
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object J() {
        this.C();
        throw new kotlin.w();
    }
    
    @Override
    public boolean M() {
        this.C();
        throw new kotlin.w();
    }
    
    @e1(version = "1.1")
    @Override
    public boolean S(@org.jetbrains.annotations.f final Object o) {
        return u.M.c(o, this.m());
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        return o instanceof u && k0.g(m6.a.e((d<Object>)this), m6.a.e((d<Object>)o));
    }
    
    @e
    @Override
    public List<Annotation> getAnnotations() {
        this.C();
        throw new kotlin.w();
    }
    
    @e
    @Override
    public List<kotlin.reflect.t> getTypeParameters() {
        this.C();
        throw new kotlin.w();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public x getVisibility() {
        this.C();
        throw new kotlin.w();
    }
    
    @Override
    public int hashCode() {
        return m6.a.e((d<Object>)this).hashCode();
    }
    
    @Override
    public boolean isAbstract() {
        this.C();
        throw new kotlin.w();
    }
    
    @Override
    public boolean isFinal() {
        this.C();
        throw new kotlin.w();
    }
    
    @Override
    public boolean isOpen() {
        this.C();
        throw new kotlin.w();
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.i<Object>> j() {
        this.C();
        throw new kotlin.w();
    }
    
    @e
    @Override
    public List<kotlin.reflect.s> k() {
        this.C();
        throw new kotlin.w();
    }
    
    @e
    @Override
    public Class<?> m() {
        return this.G;
    }
    
    @Override
    public boolean q() {
        this.C();
        throw new kotlin.w();
    }
    
    @e
    @Override
    public List<d<?>> s() {
        this.C();
        throw new kotlin.w();
    }
    
    @Override
    public boolean t() {
        this.C();
        throw new kotlin.w();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.m().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
    
    @Override
    public boolean u() {
        this.C();
        throw new kotlin.w();
    }
    
    @Override
    public boolean w() {
        this.C();
        throw new kotlin.w();
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.c<?>> x() {
        this.C();
        throw new kotlin.w();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002R.\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0002\u0012\u0004\u0012\u00020\f0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR2\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R2\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R2\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0018" }, d2 = { "kotlin/jvm/internal/u$a", "", "Ljava/lang/Class;", "jClass", "", "b", "a", "value", "", "c", "", "Lkotlin/t;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "classFqNames", "Ljava/util/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.f
        public final String a(@e final Class<?> clazz) {
            k0.p(clazz, "jClass");
            final boolean anonymousClass = clazz.isAnonymousClass();
            final String s = null;
            final String s2 = null;
            String s3;
            if (anonymousClass) {
                s3 = s;
            }
            else if (clazz.isLocalClass()) {
                s3 = s;
            }
            else if (clazz.isArray()) {
                final Class componentType = clazz.getComponentType();
                k0.o(componentType, "componentType");
                s3 = s2;
                if (componentType.isPrimitive()) {
                    final String str = u.z().get(componentType.getName());
                    s3 = s2;
                    if (str != null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("Array");
                        s3 = sb.toString();
                    }
                }
                if (s3 == null) {
                    s3 = "kotlin.Array";
                }
            }
            else {
                final String s4 = u.z().get(clazz.getName());
                if (s4 != null) {
                    s3 = s4;
                }
                else {
                    s3 = clazz.getCanonicalName();
                }
            }
            return s3;
        }
        
        @org.jetbrains.annotations.f
        public final String b(@e final Class<?> clazz) {
            k0.p(clazz, "jClass");
            final boolean anonymousClass = clazz.isAnonymousClass();
            final String s = "Array";
            final String s2 = null;
            String string = null;
            if (!anonymousClass) {
                if (clazz.isLocalClass()) {
                    final String simpleName = clazz.getSimpleName();
                    final Method enclosingMethod = clazz.getEnclosingMethod();
                    String s3 = null;
                    Label_0171: {
                        if (enclosingMethod != null) {
                            k0.o(simpleName, "name");
                            final StringBuilder sb = new StringBuilder();
                            sb.append(enclosingMethod.getName());
                            sb.append("$");
                            final String m5 = kotlin.text.s.m5(simpleName, sb.toString(), (String)null, 2, (Object)null);
                            if (m5 != null) {
                                s3 = m5;
                                break Label_0171;
                            }
                        }
                        final Constructor enclosingConstructor = clazz.getEnclosingConstructor();
                        if (enclosingConstructor != null) {
                            k0.o(simpleName, "name");
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(enclosingConstructor.getName());
                            sb2.append("$");
                            s3 = kotlin.text.s.m5(simpleName, sb2.toString(), (String)null, 2, (Object)null);
                        }
                        else {
                            s3 = null;
                        }
                    }
                    if (s3 != null) {
                        return s3;
                    }
                    k0.o(simpleName, "name");
                    s3 = kotlin.text.s.l5(simpleName, '$', (String)null, 2, (Object)null);
                    return s3;
                }
                else if (clazz.isArray()) {
                    final Class componentType = clazz.getComponentType();
                    k0.o(componentType, "componentType");
                    string = s2;
                    if (componentType.isPrimitive()) {
                        final String str = u.B().get(componentType.getName());
                        string = s2;
                        if (str != null) {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append(str);
                            sb3.append("Array");
                            string = sb3.toString();
                        }
                    }
                    final String s3 = s;
                    if (string == null) {
                        return s3;
                    }
                }
                else {
                    final String s4 = u.B().get(clazz.getName());
                    if (s4 != null) {
                        return s4;
                    }
                    return clazz.getSimpleName();
                }
            }
            return string;
        }
        
        public final boolean c(@org.jetbrains.annotations.f final Object o, @e final Class<?> clazz) {
            k0.p(clazz, "jClass");
            final Map a = u.A();
            Objects.requireNonNull(a, "null cannot be cast to non-null type kotlin.collections.Map<K, V>");
            final Integer n = a.get(clazz);
            if (n != null) {
                return q1.B(o, n.intValue());
            }
            Class<?> e = clazz;
            if (clazz.isPrimitive()) {
                e = m6.a.e((d<?>)m6.a.g(clazz));
            }
            return e.isInstance(o);
        }
    }
}
