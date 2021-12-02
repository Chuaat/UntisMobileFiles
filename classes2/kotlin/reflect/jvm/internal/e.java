// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.protobuf.i$g;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.protobuf.i$d;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.i;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e$a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a$c;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.g;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a$d;
import kotlin.reflect.jvm.internal.impl.metadata.a$n;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import org.jetbrains.annotations.f;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b;
import kotlin.reflect.jvm.internal.impl.load.java.x;
import kotlin.jvm.internal.k0;
import java.lang.reflect.Field;
import kotlin.jvm.internal.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r" }, d2 = { "Lkotlin/reflect/jvm/internal/e;", "", "", "a", "<init>", "()V", "b", "c", "d", "Lkotlin/reflect/jvm/internal/e$c;", "Lkotlin/reflect/jvm/internal/e$b;", "Lkotlin/reflect/jvm/internal/e$a;", "Lkotlin/reflect/jvm/internal/e$d;", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public abstract class e
{
    private e() {
    }
    
    @org.jetbrains.annotations.e
    public abstract String a();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "kotlin/reflect/jvm/internal/e$a", "Lkotlin/reflect/jvm/internal/e;", "", "a", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class a extends e
    {
        @org.jetbrains.annotations.e
        private final Field a;
        
        public a(@org.jetbrains.annotations.e final Field a) {
            k0.p(a, "field");
            super(null);
            this.a = a;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String a() {
            final StringBuilder sb = new StringBuilder();
            final String name = this.a.getName();
            k0.o(name, "field.name");
            sb.append(x.a(name));
            sb.append("()");
            final Class<?> type = this.a.getType();
            k0.o(type, "field.type");
            sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.c((Class)type));
            return sb.toString();
        }
        
        @org.jetbrains.annotations.e
        public final Field b() {
            return this.a;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\r" }, d2 = { "kotlin/reflect/jvm/internal/e$b", "Lkotlin/reflect/jvm/internal/e;", "", "a", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "c", "()Ljava/lang/reflect/Method;", "setterMethod", "getterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class b extends e
    {
        @org.jetbrains.annotations.e
        private final Method a;
        @f
        private final Method b;
        
        public b(@org.jetbrains.annotations.e final Method a, @f final Method b) {
            k0.p(a, "getterMethod");
            super(null);
            this.a = a;
            this.b = b;
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
        
        @f
        public final Method c() {
            return this.b;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\u0006\u0010\u001d\u001a\u00020\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0019\u0010\u0018\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001d\u001a\u00020\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010#\u001a\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&" }, d2 = { "kotlin/reflect/jvm/internal/e$c", "Lkotlin/reflect/jvm/internal/e;", "", "c", "a", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/g;", "f", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/g;", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/c;", "e", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/c;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "nameResolver", "Ljava/lang/String;", "string", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$d;", "d", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$d;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/a$n;", "Lkotlin/reflect/jvm/internal/impl/metadata/a$n;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "proto", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "b", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class c extends e
    {
        private final String a;
        @org.jetbrains.annotations.e
        private final q0 b;
        @org.jetbrains.annotations.e
        private final a$n c;
        @org.jetbrains.annotations.e
        private final a$d d;
        @org.jetbrains.annotations.e
        private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c e;
        @org.jetbrains.annotations.e
        private final g f;
        
        public c(@org.jetbrains.annotations.e final q0 q0, @org.jetbrains.annotations.e final a$n c, @org.jetbrains.annotations.e final a$d d, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c e, @org.jetbrains.annotations.e final g f) {
            k0.p(q0, "descriptor");
            k0.p(c, "proto");
            k0.p(d, "signature");
            k0.p(e, "nameResolver");
            k0.p(f, "typeTable");
            super(null);
            this.b = q0;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            String a;
            if (d.G()) {
                final StringBuilder sb = new StringBuilder();
                final a$c c2 = d.C();
                k0.o(c2, "signature.getter");
                sb.append(e.getString(c2.z()));
                final a$c c3 = d.C();
                k0.o(c3, "signature.getter");
                sb.append(e.getString(c3.y()));
                a = sb.toString();
            }
            else {
                final e$a d2 = h.d(h.a, c, e, f, false, 8, (Object)null);
                if (d2 == null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("No field signature for property: ");
                    sb2.append(q0);
                    throw new b0(sb2.toString());
                }
                final String d3 = d2.d();
                final String e2 = d2.e();
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(x.a(d3));
                sb3.append(this.c());
                sb3.append("()");
                sb3.append(e2);
                a = sb3.toString();
            }
            this.a = a;
        }
        
        private final String c() {
            final m c = this.b.c();
            k0.o(c, "descriptor.containingDeclaration");
            StringBuilder sb = null;
            String str = null;
            Label_0116: {
                if (!k0.g(this.b.getVisibility(), t.d) || !(c instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e)) {
                    if (k0.g(this.b.getVisibility(), t.a) && c instanceof h0) {
                        final q0 b = this.b;
                        Objects.requireNonNull(b, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g g0 = ((k)b).g0();
                        if (g0 instanceof i) {
                            final i i = (i)g0;
                            if (i.e() != null) {
                                sb = new StringBuilder();
                                sb.append("$");
                                str = i.g().d();
                                break Label_0116;
                            }
                        }
                    }
                    return "";
                }
                final kotlin.reflect.jvm.internal.impl.metadata.a$c y0 = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e)c).Y0();
                final i$g j = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.i;
                k0.o(j, "JvmProtoBuf.classModuleName");
                final Integer n = (Integer)kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a((i$d)y0, j);
                String string = null;
                Label_0096: {
                    if (n != null) {
                        string = this.e.getString(n.intValue());
                        if (string != null) {
                            break Label_0096;
                        }
                    }
                    string = "main";
                }
                sb = new StringBuilder();
                sb.append("$");
                str = kotlin.reflect.jvm.internal.impl.name.f.a(string);
            }
            sb.append(str);
            return sb.toString();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String a() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        public final q0 b() {
            return this.b;
        }
        
        @org.jetbrains.annotations.e
        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c d() {
            return this.e;
        }
        
        @org.jetbrains.annotations.e
        public final a$n e() {
            return this.c;
        }
        
        @org.jetbrains.annotations.e
        public final a$d f() {
            return this.d;
        }
        
        @org.jetbrains.annotations.e
        public final g g() {
            return this.f;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\r" }, d2 = { "kotlin/reflect/jvm/internal/e$d", "Lkotlin/reflect/jvm/internal/e;", "", "a", "Lkotlin/reflect/jvm/internal/d$e;", "Lkotlin/reflect/jvm/internal/d$e;", "b", "()Lkotlin/reflect/jvm/internal/d$e;", "getterSignature", "c", "setterSignature", "<init>", "(Lkotlin/reflect/jvm/internal/d$e;Lkotlin/reflect/jvm/internal/d$e;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class d extends e
    {
        @org.jetbrains.annotations.e
        private final kotlin.reflect.jvm.internal.d.e a;
        @f
        private final kotlin.reflect.jvm.internal.d.e b;
        
        public d(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.d.e a, @f final kotlin.reflect.jvm.internal.d.e b) {
            k0.p(a, "getterSignature");
            super(null);
            this.a = a;
            this.b = b;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String a() {
            return this.a.a();
        }
        
        @org.jetbrains.annotations.e
        public final kotlin.reflect.jvm.internal.d.e b() {
            return this.a;
        }
        
        @f
        public final kotlin.reflect.jvm.internal.d.e c() {
            return this.b;
        }
    }
}
