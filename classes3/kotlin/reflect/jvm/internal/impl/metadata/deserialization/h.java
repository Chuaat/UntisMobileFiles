// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import m6.d;
import kotlin.h0;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.k;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import org.jetbrains.annotations.e;

public final class h
{
    @e
    public static final a f;
    @e
    private final b a;
    @e
    private final kotlin.reflect.jvm.internal.impl.metadata.a.v.d b;
    @e
    private final k c;
    @f
    private final Integer d;
    @f
    private final String e;
    
    static {
        f = new a(null);
    }
    
    public h(@e final b a, @e final kotlin.reflect.jvm.internal.impl.metadata.a.v.d b, @e final k c, @f final Integer d, @f final String e) {
        k0.p((Object)a, "version");
        k0.p((Object)b, "kind");
        k0.p((Object)c, "level");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.metadata.a.v.d a() {
        return this.b;
    }
    
    @e
    public final b b() {
        return this.a;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("since ");
        sb.append(this.a);
        sb.append(' ');
        sb.append(this.c);
        final Integer d = this.d;
        final String s = "";
        String c;
        if (d != null) {
            c = k0.C(" error ", (Object)d);
        }
        else {
            c = "";
        }
        sb.append(c);
        final String e = this.e;
        String c2 = s;
        if (e != null) {
            c2 = k0.C(": ", (Object)e);
        }
        sb.append(c2);
        return sb.toString();
    }
    
    public static final class a
    {
        private a() {
        }
        
        @e
        public final List<h> a(@e final q q, @e final c c, @e final i i) {
            k0.p((Object)q, "proto");
            k0.p((Object)c, "nameResolver");
            k0.p((Object)i, "table");
            List<Integer> list;
            if (q instanceof kotlin.reflect.jvm.internal.impl.metadata.a.c) {
                list = ((kotlin.reflect.jvm.internal.impl.metadata.a.c)q).J0();
            }
            else if (q instanceof kotlin.reflect.jvm.internal.impl.metadata.a.d) {
                list = ((kotlin.reflect.jvm.internal.impl.metadata.a.d)q).P();
            }
            else if (q instanceof kotlin.reflect.jvm.internal.impl.metadata.a.i) {
                list = ((kotlin.reflect.jvm.internal.impl.metadata.a.i)q).k0();
            }
            else if (q instanceof a.n) {
                list = ((a.n)q).h0();
            }
            else {
                if (!(q instanceof a.r)) {
                    throw new IllegalStateException(k0.C("Unexpected declaration: ", (Object)q.getClass()));
                }
                list = ((a.r)q).e0();
            }
            k0.o((Object)list, "ids");
            final ArrayList<h> list2 = new ArrayList<h>();
            for (final Integer n : list) {
                k0.o((Object)n, "id");
                final h b = this.b(n, c, i);
                if (b != null) {
                    list2.add(b);
                }
            }
            return list2;
        }
        
        @f
        public final h b(int n, @e final c c, @e final i i) {
            k0.p((Object)c, "nameResolver");
            k0.p((Object)i, "table");
            final a.v b = i.b(n);
            String string = null;
            if (b == null) {
                return null;
            }
            final b.a d = h.b.d;
            Integer value;
            if (b.M()) {
                value = b.G();
            }
            else {
                value = null;
            }
            Integer value2;
            if (b.N()) {
                value2 = b.H();
            }
            else {
                value2 = null;
            }
            final b a = d.a(value, value2);
            final kotlin.reflect.jvm.internal.impl.metadata.a.v.c e = b.E();
            k0.m((Object)e);
            n = h.a.a.a[e.ordinal()];
            k k;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new h0();
                    }
                    k = kotlin.k.I;
                }
                else {
                    k = kotlin.k.H;
                }
            }
            else {
                k = kotlin.k.G;
            }
            Integer value3;
            if (b.J()) {
                value3 = b.D();
            }
            else {
                value3 = null;
            }
            if (b.L()) {
                string = c.getString(b.F());
            }
            final kotlin.reflect.jvm.internal.impl.metadata.a.v.d j = b.I();
            k0.o((Object)j, "info.versionKind");
            return new h(a, j, k, value3, string);
        }
    }
    
    public static final class b
    {
        @e
        public static final a d;
        @d
        @e
        public static final b e;
        private final int a;
        private final int b;
        private final int c;
        
        static {
            d = new a(null);
            e = new b(256, 256, 256);
        }
        
        public b(final int a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @e
        public final String a() {
            StringBuilder sb;
            int i;
            if (this.c == 0) {
                sb = new StringBuilder();
                sb.append(this.a);
                sb.append('.');
                i = this.b;
            }
            else {
                sb = new StringBuilder();
                sb.append(this.a);
                sb.append('.');
                sb.append(this.b);
                sb.append('.');
                i = this.c;
            }
            sb.append(i);
            return sb.toString();
        }
        
        @Override
        public boolean equals(@f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return this.a == b.a && this.b == b.b && this.c == b.c;
        }
        
        @Override
        public int hashCode() {
            return (this.a * 31 + this.b) * 31 + this.c;
        }
        
        @e
        @Override
        public String toString() {
            return this.a();
        }
        
        public static final class a
        {
            private a() {
            }
            
            @e
            public final b a(@f final Integer n, @f final Integer n2) {
                b e;
                if (n2 != null) {
                    e = new b(n2 & 0xFF, n2 >> 8 & 0xFF, n2 >> 16 & 0xFF);
                }
                else if (n != null) {
                    e = new b(n & 0x7, n >> 3 & 0xF, n >> 7 & 0x7F);
                }
                else {
                    e = h.b.e;
                }
                return e;
            }
        }
    }
}
