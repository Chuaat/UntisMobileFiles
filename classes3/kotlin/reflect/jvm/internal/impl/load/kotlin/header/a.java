// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import m6.k;
import java.util.LinkedHashMap;
import kotlin.ranges.o;
import kotlin.collections.y0;
import kotlin.jvm.internal.w;
import java.util.Map;
import kotlin.collections.v;
import kotlin.collections.m;
import java.util.List;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.c;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f;
import org.jetbrains.annotations.e;

public final class a
{
    @e
    private final a a;
    @e
    private final f b;
    @e
    private final c c;
    @org.jetbrains.annotations.f
    private final String[] d;
    @org.jetbrains.annotations.f
    private final String[] e;
    @org.jetbrains.annotations.f
    private final String[] f;
    @org.jetbrains.annotations.f
    private final String g;
    private final int h;
    @org.jetbrains.annotations.f
    private final String i;
    
    public a(@e final a a, @e final f b, @e final c c, @org.jetbrains.annotations.f final String[] d, @org.jetbrains.annotations.f final String[] e, @org.jetbrains.annotations.f final String[] f, @org.jetbrains.annotations.f final String g, final int h, @org.jetbrains.annotations.f final String i) {
        k0.p((Object)a, "kind");
        k0.p((Object)b, "metadataVersion");
        k0.p((Object)c, "bytecodeVersion");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    private final boolean h(final int n, final int n2) {
        return (n & n2) != 0x0;
    }
    
    @org.jetbrains.annotations.f
    public final String[] a() {
        return this.d;
    }
    
    @org.jetbrains.annotations.f
    public final String[] b() {
        return this.e;
    }
    
    @e
    public final a c() {
        return this.a;
    }
    
    @e
    public final f d() {
        return this.b;
    }
    
    @org.jetbrains.annotations.f
    public final String e() {
        String g = this.g;
        if (this.c() != kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.O) {
            g = null;
        }
        return g;
    }
    
    @e
    public final List<String> f() {
        String[] d = this.d;
        final boolean b = this.c() == kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.N;
        final List<String> list = null;
        if (!b) {
            d = null;
        }
        List<String> list2;
        if (d == null) {
            list2 = list;
        }
        else {
            list2 = (List<String>)m.t((Object[])d);
        }
        if (list2 == null) {
            list2 = (List<String>)v.E();
        }
        return list2;
    }
    
    @org.jetbrains.annotations.f
    public final String[] g() {
        return this.f;
    }
    
    public final boolean i() {
        return this.h(this.h, 2);
    }
    
    public final boolean j() {
        return this.h(this.h, 64) && !this.h(this.h, 32);
    }
    
    public final boolean k() {
        return this.h(this.h, 16) && !this.h(this.h, 32);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" version=");
        sb.append(this.b);
        return sb.toString();
    }
    
    public enum a
    {
        @e
        public static final a H;
        @e
        private static final Map<Integer, a> I;
        
        J(0), 
        K(1), 
        L(2), 
        M(3), 
        N(4), 
        O(5);
        
        private final int G;
        
        static {
            int i = 0;
            H = new a(null);
            final a[] values = values();
            final LinkedHashMap j = new LinkedHashMap<Integer, a>(o.n(y0.j(values.length), 16));
            while (i < values.length) {
                final a a = values[i];
                j.put(Integer.valueOf(a.f()), a);
                ++i;
            }
            I = j;
        }
        
        private a(final int g) {
            this.G = g;
        }
        
        public static final /* synthetic */ Map b() {
            return a.I;
        }
        
        @k
        @e
        public static final a d(final int n) {
            return a.H.a(n);
        }
        
        public final int f() {
            return this.G;
        }
        
        public static final class a
        {
            private a() {
            }
            
            @k
            @e
            public final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a a(final int i) {
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a j;
                if ((j = kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.b().get(i)) == null) {
                    j = kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.J;
                }
                return j;
            }
        }
    }
}
