// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.collections.v;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.resolve.constants.j;
import kotlin.reflect.jvm.internal.impl.resolve.constants.q;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.k;
import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.y;
import kotlin.reflect.jvm.internal.impl.resolve.constants.r;
import kotlin.reflect.jvm.internal.impl.resolve.constants.z;
import kotlin.reflect.jvm.internal.impl.resolve.constants.u;
import kotlin.reflect.jvm.internal.impl.resolve.constants.w;
import kotlin.reflect.jvm.internal.impl.resolve.constants.d;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.h;
import kotlin.text.s;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;

public final class b extends a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, g<?>>
{
    @e
    private final e0 c;
    @e
    private final g0 d;
    @e
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.e e;
    
    public b(@e final e0 c, @e final g0 d, @e final n n, @e final m m) {
        k0.p((Object)c, "module");
        k0.p((Object)d, "notFoundClasses");
        k0.p((Object)n, "storageManager");
        k0.p((Object)m, "kotlinClassFinder");
        super(n, m);
        this.c = c;
        this.d = d;
        this.e = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.e(c, d);
    }
    
    private final kotlin.reflect.jvm.internal.impl.descriptors.e G(final kotlin.reflect.jvm.internal.impl.name.a a) {
        return x.c(this.c, a, this.d);
    }
    
    @f
    protected g<?> E(@e final String detailMessage, @e final Object o) {
        k0.p((Object)detailMessage, "desc");
        k0.p(o, "initializer");
        boolean b = false;
        Object o2 = o;
        if (s.V2("ZBCS", detailMessage, false, 2, null)) {
            final int intValue = (int)o;
            final int hashCode = detailMessage.hashCode();
            if (hashCode != 66) {
                if (hashCode != 67) {
                    if (hashCode != 83) {
                        if (hashCode == 90 && detailMessage.equals("Z")) {
                            if (intValue != 0) {
                                b = true;
                            }
                            o2 = b;
                            return h.a.c(o2);
                        }
                    }
                    else if (detailMessage.equals("S")) {
                        o2 = (short)intValue;
                        return h.a.c(o2);
                    }
                }
                else if (detailMessage.equals("C")) {
                    o2 = (char)intValue;
                    return h.a.c(o2);
                }
            }
            else if (detailMessage.equals("B")) {
                o2 = (byte)intValue;
                return h.a.c(o2);
            }
            throw new AssertionError((Object)detailMessage);
        }
        return h.a.c(o2);
    }
    
    @e
    protected kotlin.reflect.jvm.internal.impl.descriptors.annotations.c F(@e final kotlin.reflect.jvm.internal.impl.metadata.a.b b, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c c) {
        k0.p((Object)b, "proto");
        k0.p((Object)c, "nameResolver");
        return this.e.a(b, c);
    }
    
    @f
    protected g<?> H(@e final g<?> g) {
        k0.p((Object)g, "constant");
        Object o;
        if (g instanceof d) {
            o = new w(((g<Number>)g).b().byteValue());
        }
        else if (g instanceof u) {
            o = new z(((g<Number>)g).b().shortValue());
        }
        else if (g instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.m) {
            o = new kotlin.reflect.jvm.internal.impl.resolve.constants.x(((g<Number>)g).b().intValue());
        }
        else {
            final Object o2 = g;
            if (!(g instanceof r)) {
                return (g<?>)o2;
            }
            o = new y(((g<Number>)g).b().longValue());
        }
        final Object o2 = o;
        return (g<?>)o2;
    }
    
    @f
    @Override
    protected o.a w(@e final kotlin.reflect.jvm.internal.impl.name.a a, @e final w0 w0, @e final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list) {
        k0.p((Object)a, "annotationClassId");
        k0.p((Object)w0, "source");
        k0.p((Object)list, "result");
        return new o.a() {
            @org.jetbrains.annotations.e
            private final HashMap<kotlin.reflect.jvm.internal.impl.name.e, g<?>> a = new HashMap<kotlin.reflect.jvm.internal.impl.name.e, g<?>>();
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e b = b.this.G(a);
            final /* synthetic */ b c;
            
            public static final /* synthetic */ HashMap h(final b$a a) {
                return a.a;
            }
            
            private final g<?> i(final kotlin.reflect.jvm.internal.impl.name.e e, final Object o) {
                g<?> g;
                if ((g = h.a.c(o)) == null) {
                    g = k.b.a(k0.C("Unsupported annotation argument: ", (Object)e));
                }
                return g;
            }
            
            @Override
            public void a() {
                list.add((c)new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d((c0)this.b.A(), (Map)this.a, w0));
            }
            
            @Override
            public void b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.constants.f f) {
                k0.p((Object)e, "name");
                k0.p((Object)f, "value");
                this.a.put(e, new q(f));
            }
            
            @Override
            public void c(@f final kotlin.reflect.jvm.internal.impl.name.e e, @f final Object o) {
                if (e != null) {
                    this.a.put(e, this.i(e, o));
                }
            }
            
            @Override
            public void d(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a a, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e2) {
                k0.p((Object)e, "name");
                k0.p((Object)a, "enumClassId");
                k0.p((Object)e2, "enumEntryName");
                this.a.put(e, new j(a, e2));
            }
            
            @f
            @Override
            public o.a e(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a a) {
                k0.p((Object)e, "name");
                k0.p((Object)a, "classId");
                final ArrayList<c> list = new ArrayList<c>();
                final b c = this.c;
                final w0 a2 = w0.a;
                k0.o((Object)a2, "NO_SOURCE");
                final o.a w = c.w(a, a2, list);
                k0.m((Object)w);
                return new o.a() {
                    final /* synthetic */ b$a c;
                    
                    @Override
                    public void a() {
                        w.a();
                        b$a.h(this.c).put(e, new kotlin.reflect.jvm.internal.impl.resolve.constants.a((c)v.U4((List)list)));
                    }
                    
                    @Override
                    public void b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.constants.f f) {
                        k0.p((Object)e, "name");
                        k0.p((Object)f, "value");
                        w.b(e, f);
                    }
                    
                    @Override
                    public void c(@f final kotlin.reflect.jvm.internal.impl.name.e e, @f final Object o) {
                        w.c(e, o);
                    }
                    
                    @Override
                    public void d(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a a, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e2) {
                        k0.p((Object)e, "name");
                        k0.p((Object)a, "enumClassId");
                        k0.p((Object)e2, "enumEntryName");
                        w.d(e, a, e2);
                    }
                    
                    @f
                    @Override
                    public o.a e(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a a) {
                        k0.p((Object)e, "name");
                        k0.p((Object)a, "classId");
                        return w.e(e, a);
                    }
                    
                    @f
                    @Override
                    public o.b f(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
                        k0.p((Object)e, "name");
                        return w.f(e);
                    }
                };
            }
            
            @f
            @Override
            public o.b f(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
                k0.p((Object)e, "name");
                return new o.b() {
                    @org.jetbrains.annotations.e
                    private final ArrayList<g<?>> a = new ArrayList<g<?>>();
                    final /* synthetic */ b$a b;
                    final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e d = b$a.this.b;
                    
                    @Override
                    public void a() {
                        final e1 b = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(e, this.d);
                        if (b != null) {
                            final HashMap h = b$a.h(this.b);
                            final kotlin.reflect.jvm.internal.impl.name.e c = e;
                            final h a = kotlin.reflect.jvm.internal.impl.resolve.constants.h.a;
                            final List<g<?>> c2 = kotlin.reflect.jvm.internal.impl.utils.a.c(this.a);
                            final c0 a2 = ((d1)b).a();
                            k0.o((Object)a2, "parameter.type");
                            h.put(c, a.b(c2, a2));
                        }
                    }
                    
                    @Override
                    public void b(@f final Object o) {
                        this.a.add(b$a.this.i(e, o));
                    }
                    
                    @Override
                    public void c(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a a, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
                        k0.p((Object)a, "enumClassId");
                        k0.p((Object)e, "enumEntryName");
                        this.a.add(new j(a, e));
                    }
                    
                    @Override
                    public void d(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.constants.f f) {
                        k0.p((Object)f, "value");
                        this.a.add(new q(f));
                    }
                };
            }
        };
    }
}
