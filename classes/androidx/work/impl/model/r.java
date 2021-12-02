// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import java.util.UUID;
import androidx.room.m2;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.work.q;
import androidx.annotation.b0;
import androidx.room.r0;
import androidx.work.c;
import androidx.work.f;
import androidx.room.l1;
import androidx.room.i0;
import androidx.annotation.j0;
import androidx.work.c0;
import java.util.List;
import g.a;
import androidx.room.d1;
import androidx.room.s0;
import androidx.annotation.t0;

@t0({ t0.a.H })
@s0(indices = { @d1({ "schedule_requested_at" }), @d1({ "period_start_time" }) })
public final class r
{
    private static final String r;
    public static final long s = -1L;
    public static final a<List<c>, List<c0>> t;
    @j0
    @i0(name = "id")
    @l1
    public String a;
    @j0
    @i0(name = "state")
    public c0.a b;
    @j0
    @i0(name = "worker_class_name")
    public String c;
    @i0(name = "input_merger_class_name")
    public String d;
    @j0
    @i0(name = "input")
    public f e;
    @j0
    @i0(name = "output")
    public f f;
    @i0(name = "initial_delay")
    public long g;
    @i0(name = "interval_duration")
    public long h;
    @i0(name = "flex_duration")
    public long i;
    @j0
    @r0
    public androidx.work.c j;
    @b0(from = 0L)
    @i0(name = "run_attempt_count")
    public int k;
    @j0
    @i0(name = "backoff_policy")
    public androidx.work.a l;
    @i0(name = "backoff_delay_duration")
    public long m;
    @i0(name = "period_start_time")
    public long n;
    @i0(name = "minimum_retention_duration")
    public long o;
    @i0(name = "schedule_requested_at")
    public long p;
    @i0(name = "run_in_foreground")
    public boolean q;
    
    static {
        r = q.f("WorkSpec");
        t = new a<List<c>, List<c0>>() {
            public List<c0> a(final List<c> list) {
                if (list == null) {
                    return null;
                }
                final ArrayList<c0> list2 = new ArrayList<c0>(list.size());
                final Iterator<c> iterator = list.iterator();
                while (iterator.hasNext()) {
                    list2.add(iterator.next().a());
                }
                return list2;
            }
        };
    }
    
    public r(@j0 final r r) {
        this.b = c0.a.G;
        final f c = androidx.work.f.c;
        this.e = c;
        this.f = c;
        this.j = androidx.work.c.i;
        this.l = androidx.work.a.G;
        this.m = 30000L;
        this.p = -1L;
        this.a = r.a;
        this.c = r.c;
        this.b = r.b;
        this.d = r.d;
        this.e = new f(r.e);
        this.f = new f(r.f);
        this.g = r.g;
        this.h = r.h;
        this.i = r.i;
        this.j = new androidx.work.c(r.j);
        this.k = r.k;
        this.l = r.l;
        this.m = r.m;
        this.n = r.n;
        this.o = r.o;
        this.p = r.p;
        this.q = r.q;
    }
    
    public r(@j0 final String a, @j0 final String c) {
        this.b = c0.a.G;
        final f c2 = androidx.work.f.c;
        this.e = c2;
        this.f = c2;
        this.j = androidx.work.c.i;
        this.l = androidx.work.a.G;
        this.m = 30000L;
        this.p = -1L;
        this.a = a;
        this.c = c;
    }
    
    public long a() {
        final boolean c = this.c();
        final int n = 0;
        boolean b = false;
        if (c) {
            if (this.l == androidx.work.a.H) {
                b = true;
            }
            long b2;
            if (b) {
                b2 = this.m * this.k;
            }
            else {
                b2 = (long)Math.scalb((float)this.m, this.k - 1);
            }
            return this.n + Math.min(18000000L, b2);
        }
        final boolean d = this.d();
        long n2 = 0L;
        if (!d) {
            long n3;
            if ((n3 = this.n) == 0L) {
                n3 = System.currentTimeMillis();
            }
            return n3 + this.g;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final long n4 = this.n;
        long n5;
        if (n4 == 0L) {
            n5 = currentTimeMillis + this.g;
        }
        else {
            n5 = n4;
        }
        final long i = this.i;
        final long h = this.h;
        int n6 = n;
        if (i != h) {
            n6 = 1;
        }
        final long n7 = lcmp(n4, 0L);
        if (n6 != 0) {
            if (n7 == 0) {
                n2 = i * -1L;
            }
            return n5 + h + n2;
        }
        if (n7 != 0) {
            n2 = h;
        }
        return n5 + n2;
    }
    
    public boolean b() {
        return androidx.work.c.i.equals(this.j) ^ true;
    }
    
    public boolean c() {
        return this.b == c0.a.G && this.k > 0;
    }
    
    public boolean d() {
        return this.h != 0L;
    }
    
    public void e(long m) {
        long n = m;
        if (m > 18000000L) {
            androidx.work.q.c().h(androidx.work.impl.model.r.r, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            n = 18000000L;
        }
        m = n;
        if (n < 10000L) {
            androidx.work.q.c().h(androidx.work.impl.model.r.r, "Backoff delay duration less than minimum value", new Throwable[0]);
            m = 10000L;
        }
        this.m = m;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof r)) {
            return false;
        }
        final r r = (r)o;
        if (this.g != r.g) {
            return false;
        }
        if (this.h != r.h) {
            return false;
        }
        if (this.i != r.i) {
            return false;
        }
        if (this.k != r.k) {
            return false;
        }
        if (this.m != r.m) {
            return false;
        }
        if (this.n != r.n) {
            return false;
        }
        if (this.o != r.o) {
            return false;
        }
        if (this.p != r.p) {
            return false;
        }
        if (this.q != r.q) {
            return false;
        }
        if (!this.a.equals(r.a)) {
            return false;
        }
        if (this.b != r.b) {
            return false;
        }
        if (!this.c.equals(r.c)) {
            return false;
        }
        final String d = this.d;
        Label_0224: {
            if (d != null) {
                if (d.equals(r.d)) {
                    break Label_0224;
                }
            }
            else if (r.d == null) {
                break Label_0224;
            }
            return false;
        }
        if (!this.e.equals(r.e)) {
            return false;
        }
        if (!this.f.equals(r.f)) {
            return false;
        }
        if (!this.j.equals(r.j)) {
            return false;
        }
        if (this.l != r.l) {
            b = false;
        }
        return b;
    }
    
    public void f(final long n) {
        long n2 = n;
        if (n < 900000L) {
            androidx.work.q.c().h(androidx.work.impl.model.r.r, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            n2 = 900000L;
        }
        this.g(n2, n2);
    }
    
    public void g(long n, long i) {
        long n2 = n;
        if (n < 900000L) {
            androidx.work.q.c().h(androidx.work.impl.model.r.r, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            n2 = 900000L;
        }
        n = i;
        if (i < 300000L) {
            androidx.work.q.c().h(androidx.work.impl.model.r.r, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            n = 300000L;
        }
        i = n;
        if (n > n2) {
            androidx.work.q.c().h(androidx.work.impl.model.r.r, String.format("Flex duration greater than interval duration; Changed to %s", n2), new Throwable[0]);
            i = n2;
        }
        this.h = n2;
        this.i = i;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        final String d = this.d;
        int hashCode4;
        if (d != null) {
            hashCode4 = d.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int hashCode5 = this.e.hashCode();
        final int hashCode6 = this.f.hashCode();
        final long g = this.g;
        final int n = (int)(g ^ g >>> 32);
        final long h = this.h;
        final int n2 = (int)(h ^ h >>> 32);
        final long i = this.i;
        final int n3 = (int)(i ^ i >>> 32);
        final int hashCode7 = this.j.hashCode();
        final int k = this.k;
        final int hashCode8 = this.l.hashCode();
        final long m = this.m;
        final int n4 = (int)(m ^ m >>> 32);
        final long n5 = this.n;
        final int n6 = (int)(n5 ^ n5 >>> 32);
        final long o = this.o;
        final int n7 = (int)(o ^ o >>> 32);
        final long p = this.p;
        return (((((((((((((((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + n) * 31 + n2) * 31 + n3) * 31 + hashCode7) * 31 + k) * 31 + hashCode8) * 31 + n4) * 31 + n6) * 31 + n7) * 31 + (int)(p ^ p >>> 32)) * 31 + (this.q ? 1 : 0);
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{WorkSpec: ");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
    
    public static class b
    {
        @i0(name = "id")
        public String a;
        @i0(name = "state")
        public c0.a b;
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return this.b == b.b && this.a.equals(b.a);
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode() * 31 + this.b.hashCode();
        }
    }
    
    public static class c
    {
        @i0(name = "id")
        public String a;
        @i0(name = "state")
        public c0.a b;
        @i0(name = "output")
        public f c;
        @i0(name = "run_attempt_count")
        public int d;
        @m2(entity = u.class, entityColumn = "work_spec_id", parentColumn = "id", projection = { "tag" })
        public List<String> e;
        @m2(entity = o.class, entityColumn = "work_spec_id", parentColumn = "id", projection = { "progress" })
        public List<f> f;
        
        @j0
        public c0 a() {
            final List<f> f = this.f;
            f c;
            if (f != null && !f.isEmpty()) {
                c = this.f.get(0);
            }
            else {
                c = androidx.work.f.c;
            }
            return new c0(UUID.fromString(this.a), this.b, this.c, this.e, c, this.d);
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean equals = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            if (this.d != c.d) {
                return false;
            }
            final String a = this.a;
            Label_0068: {
                if (a != null) {
                    if (a.equals(c.a)) {
                        break Label_0068;
                    }
                }
                else if (c.a == null) {
                    break Label_0068;
                }
                return false;
            }
            if (this.b != c.b) {
                return false;
            }
            final f c2 = this.c;
            Label_0113: {
                if (c2 != null) {
                    if (c2.equals(c.c)) {
                        break Label_0113;
                    }
                }
                else if (c.c == null) {
                    break Label_0113;
                }
                return false;
            }
            final List<String> e = this.e;
            Label_0147: {
                if (e != null) {
                    if (e.equals(c.e)) {
                        break Label_0147;
                    }
                }
                else if (c.e == null) {
                    break Label_0147;
                }
                return false;
            }
            final List<f> f = this.f;
            final List<f> f2 = c.f;
            if (f != null) {
                equals = f.equals(f2);
            }
            else if (f2 != null) {
                equals = false;
            }
            return equals;
        }
        
        @Override
        public int hashCode() {
            final String a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a != null) {
                hashCode2 = a.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final c0.a b = this.b;
            int hashCode3;
            if (b != null) {
                hashCode3 = b.hashCode();
            }
            else {
                hashCode3 = 0;
            }
            final f c = this.c;
            int hashCode4;
            if (c != null) {
                hashCode4 = c.hashCode();
            }
            else {
                hashCode4 = 0;
            }
            final int d = this.d;
            final List<String> e = this.e;
            int hashCode5;
            if (e != null) {
                hashCode5 = e.hashCode();
            }
            else {
                hashCode5 = 0;
            }
            final List<f> f = this.f;
            if (f != null) {
                hashCode = f.hashCode();
            }
            return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + d) * 31 + hashCode5) * 31 + hashCode;
        }
    }
}
