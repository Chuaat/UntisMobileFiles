// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n6.l;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.f;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import kotlin.s0;
import m6.k;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.b;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.protobuf.g;
import org.jetbrains.annotations.e;

public final class h
{
    @e
    public static final h a;
    @e
    private static final g b;
    
    static {
        a = new h();
        final g d = g.d();
        kotlin.reflect.jvm.internal.impl.metadata.jvm.a.a(d);
        k0.o((Object)d, "newInstance().apply(JvmProtoBuf::registerAllExtensions)");
        b = d;
    }
    
    private h() {
    }
    
    @k
    public static final boolean f(@e final kotlin.reflect.jvm.internal.impl.metadata.a.n n) {
        k0.p((Object)n, "proto");
        final b.b a = d.a.a();
        final Integer v = ((i.d<kotlin.reflect.jvm.internal.impl.metadata.a.n>)n).v(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e);
        k0.o((Object)v, "proto.getExtension(JvmProtoBuf.flags)");
        final Boolean g = a.g(v.intValue());
        k0.o((Object)g, "JvmFlags.IS_MOVED_FROM_INTERFACE_COMPANION.get(proto.getExtension(JvmProtoBuf.flags))");
        return g;
    }
    
    private final String g(final kotlin.reflect.jvm.internal.impl.metadata.a.q q, final c c) {
        String b;
        if (q.n0()) {
            final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b a = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.a;
            b = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b(c.a(q.Y()));
        }
        else {
            b = null;
        }
        return b;
    }
    
    @k
    @e
    public static final s0<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g, kotlin.reflect.jvm.internal.impl.metadata.a.c> h(@e final byte[] buf, @e final String[] array) {
        k0.p((Object)buf, "bytes");
        k0.p((Object)array, "strings");
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buf);
        return (s0<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g, kotlin.reflect.jvm.internal.impl.metadata.a.c>)new s0((Object)h.a.k(byteArrayInputStream, array), (Object)kotlin.reflect.jvm.internal.impl.metadata.a.c.U0(byteArrayInputStream, h.b));
    }
    
    @k
    @e
    public static final s0<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g, kotlin.reflect.jvm.internal.impl.metadata.a.c> i(@e final String[] array, @e final String[] array2) {
        k0.p((Object)array, "data");
        k0.p((Object)array2, "strings");
        final byte[] e = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.a.e(array);
        k0.o((Object)e, "decodeBytes(data)");
        return h(e, array2);
    }
    
    @k
    @e
    public static final s0<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g, kotlin.reflect.jvm.internal.impl.metadata.a.i> j(@e final String[] array, @e final String[] array2) {
        k0.p((Object)array, "data");
        k0.p((Object)array2, "strings");
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.a.e(array));
        return (s0<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g, kotlin.reflect.jvm.internal.impl.metadata.a.i>)new s0((Object)h.a.k(byteArrayInputStream, array2), (Object)kotlin.reflect.jvm.internal.impl.metadata.a.i.y0(byteArrayInputStream, h.b));
    }
    
    private final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g k(final InputStream inputStream, final String[] array) {
        final a.e g = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.G(inputStream, h.b);
        k0.o((Object)g, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g(g, array);
    }
    
    @k
    @e
    public static final s0<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g, kotlin.reflect.jvm.internal.impl.metadata.a.l> l(@e final byte[] buf, @e final String[] array) {
        k0.p((Object)buf, "bytes");
        k0.p((Object)array, "strings");
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buf);
        return (s0<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g, kotlin.reflect.jvm.internal.impl.metadata.a.l>)new s0((Object)h.a.k(byteArrayInputStream, array), (Object)kotlin.reflect.jvm.internal.impl.metadata.a.l.f0(byteArrayInputStream, h.b));
    }
    
    @k
    @e
    public static final s0<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g, kotlin.reflect.jvm.internal.impl.metadata.a.l> m(@e final String[] array, @e final String[] array2) {
        k0.p((Object)array, "data");
        k0.p((Object)array2, "strings");
        final byte[] e = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.a.e(array);
        k0.o((Object)e, "decodeBytes(data)");
        return l(e, array2);
    }
    
    @e
    public final g a() {
        return h.b;
    }
    
    @org.jetbrains.annotations.f
    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.b b(@e final kotlin.reflect.jvm.internal.impl.metadata.a.d d, @e final c c, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g g) {
        k0.p((Object)d, "proto");
        k0.p((Object)c, "nameResolver");
        k0.p((Object)g, "typeTable");
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.d, a.c> a = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.a;
        k0.o((Object)a, "constructorSignature");
        final a.c c2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a((i.d<i.d>)d, (i.g<i.d, a.c>)a);
        String string;
        if (c2 != null && c2.C()) {
            string = c.getString(c2.z());
        }
        else {
            string = "<init>";
        }
        String s;
        if (c2 != null && c2.B()) {
            s = c.getString(c2.y());
        }
        else {
            final List<kotlin.reflect.jvm.internal.impl.metadata.a.u> o = d.O();
            k0.o((Object)o, "proto.valueParameterList");
            final ArrayList list = new ArrayList<String>(v.Y((Iterable)o, 10));
            for (final kotlin.reflect.jvm.internal.impl.metadata.a.u u : o) {
                k0.o((Object)u, "it");
                final String g2 = this.g(f.m(u, g), c);
                if (g2 == null) {
                    return null;
                }
                list.add(g2);
            }
            s = v.Z2((Iterable)list, (CharSequence)"", (CharSequence)"(", (CharSequence)")V", 0, (CharSequence)null, (l)null, 56, (Object)null);
        }
        return new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.b(string, s);
    }
    
    @org.jetbrains.annotations.f
    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.a c(@e final kotlin.reflect.jvm.internal.impl.metadata.a.n n, @e final c c, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g g, final boolean b) {
        k0.p((Object)n, "proto");
        k0.p((Object)c, "nameResolver");
        k0.p((Object)g, "typeTable");
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.n, a.d> d = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d;
        k0.o((Object)d, "propertySignature");
        final a.d d2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a((i.d<i.d>)n, (i.g<i.d, a.d>)d);
        if (d2 == null) {
            return null;
        }
        a.b b2;
        if (d2.F()) {
            b2 = d2.B();
        }
        else {
            b2 = null;
        }
        if (b2 == null && b) {
            return null;
        }
        int n2;
        if (b2 != null && b2.C()) {
            n2 = b2.z();
        }
        else {
            n2 = n.W();
        }
        String s;
        if (b2 != null && b2.B()) {
            s = c.getString(b2.y());
        }
        else if ((s = this.g(f.j(n, g), c)) == null) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.a(c.getString(n2), s);
    }
    
    @org.jetbrains.annotations.f
    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.b e(@e final kotlin.reflect.jvm.internal.impl.metadata.a.i i, @e final c c, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g g) {
        k0.p((Object)i, "proto");
        k0.p((Object)c, "nameResolver");
        k0.p((Object)g, "typeTable");
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.i, a.c> b = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b;
        k0.o((Object)b, "methodSignature");
        final a.c c2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a((i.d<i.d>)i, (i.g<i.d, a.c>)b);
        int n;
        if (c2 != null && c2.C()) {
            n = c2.z();
        }
        else {
            n = i.X();
        }
        String s;
        if (c2 != null && c2.B()) {
            s = c.getString(c2.y());
        }
        else {
            final List m = v.M((Object)f.g(i, g));
            final List<kotlin.reflect.jvm.internal.impl.metadata.a.u> j0 = i.j0();
            k0.o((Object)j0, "proto.valueParameterList");
            final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.metadata.a.q>(v.Y((Iterable)j0, 10));
            for (final kotlin.reflect.jvm.internal.impl.metadata.a.u u : j0) {
                k0.o((Object)u, "it");
                list.add(f.m(u, g));
            }
            final List q4 = v.q4((Collection)m, (Iterable)list);
            final ArrayList list2 = new ArrayList<String>(v.Y((Iterable)q4, 10));
            final Iterator<kotlin.reflect.jvm.internal.impl.metadata.a.q> iterator2 = q4.iterator();
            while (iterator2.hasNext()) {
                final String g2 = this.g(iterator2.next(), c);
                if (g2 == null) {
                    return null;
                }
                list2.add(g2);
            }
            final String g3 = this.g(f.i(i, g), c);
            if (g3 == null) {
                return null;
            }
            s = k0.C(v.Z2((Iterable)list2, (CharSequence)"", (CharSequence)"(", (CharSequence)")", 0, (CharSequence)null, (l)null, 56, (Object)null), (Object)g3);
        }
        return new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.b(c.getString(n), s);
    }
}
