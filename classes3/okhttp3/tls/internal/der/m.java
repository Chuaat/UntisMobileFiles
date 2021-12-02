// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import okio.p;
import java.math.BigInteger;
import okio.r0;
import kotlin.j2;
import n6.l;
import n6.a;
import org.jetbrains.annotations.f;
import kotlin.ranges.i;
import kotlin.ranges.o;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import okio.n;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00105\u001a\u00020\u0002¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J2\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\rJ!\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010!\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010$\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\bJ\b\u0010%\u001a\u00020\bH\u0016R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010/\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b'\u0010.R(\u00102\u001a\u0004\u0018\u00010\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u00100\"\u0004\b*\u00101R\u001e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(¨\u00068" }, d2 = { "Lokhttp3/tls/internal/der/m;", "", "Lokio/n;", "e", "", "v", "Lkotlin/j2;", "p", "", "name", "", "tagClass", "tag", "Lkotlin/Function1;", "block", "g", "T", "Lkotlin/Function0;", "f", "(Ln6/a;)Ljava/lang/Object;", "", "b", "j", "Ljava/math/BigInteger;", "value", "h", "k", "Lokhttp3/tls/internal/der/g;", "bitString", "i", "Lokio/p;", "byteString", "m", "o", "s", "l", "n", "toString", "", "c", "Ljava/util/List;", "path", "d", "Z", "a", "()Z", "(Z)V", "constructed", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "typeHint", "typeHintStack", "stack", "sink", "<init>", "(Lokio/n;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class m
{
    private final List<n> a;
    private final List<Object> b;
    private final List<String> c;
    private boolean d;
    
    public m(@e final n n) {
        k0.p((Object)n, "sink");
        this.a = (List<n>)v.P((Object[])new n[] { n });
        this.b = new ArrayList<Object>();
        this.c = new ArrayList<String>();
    }
    
    private final n e() {
        final List<n> a = this.a;
        return a.get(a.size() - 1);
    }
    
    private final void p(final long i) {
        final n e = this.e();
        final i s0 = o.S0(o.W(((64 - Long.numberOfLeadingZeros(i) + 6) / 7 - 1) * 7, 0), 7);
        int k = s0.k();
        final int n = s0.n();
        final int o = s0.o();
        if (o >= 0) {
            if (k > n) {
                return;
            }
        }
        else if (k < n) {
            return;
        }
        while (true) {
            int n2;
            if (k == 0) {
                n2 = 0;
            }
            else {
                n2 = 128;
            }
            e.A(n2 | (int)(i >> k & 0x7FL));
            if (k == n) {
                break;
            }
            k += o;
        }
    }
    
    public final boolean a() {
        return this.d;
    }
    
    @f
    public final Object b() {
        return v.i3((List)this.b);
    }
    
    public final void c(final boolean d) {
        this.d = d;
    }
    
    public final void d(@f final Object o) {
        final List<Object> b = this.b;
        b.set(b.size() - 1, o);
    }
    
    public final <T> T f(@e final a<? extends T> a) {
        k0.p((Object)a, "block");
        this.b.add(null);
        try {
            final Object invoke = a.invoke();
            final List<Object> b = this.b;
            b.remove(b.size() - 1);
            return (T)invoke;
        }
        finally {
            this.b.remove(this.b.size() - 1);
        }
    }
    
    public final void g(@e final String s, int k, long h0, @e final l<? super n, j2> l) {
        k0.p((Object)s, "name");
        k0.p((Object)l, "block");
        final okio.m m = new okio.m();
        this.a.add(m);
        this.d = false;
        this.c.add(s);
        try {
            l.invoke((Object)m);
            int n;
            if (this.d) {
                n = 32;
            }
            else {
                n = 0;
            }
            this.d = true;
            final List<n> a = this.a;
            a.remove(a.size() - 1);
            final List<String> c = this.c;
            c.remove(c.size() - 1);
            final n e = this.e();
            final long n2 = 31;
            k |= n;
            if (h0 < n2) {
                e.A(k | (int)h0);
            }
            else {
                e.A(k | 0x1F);
                this.p(h0);
            }
            h0 = m.h0();
            Label_0311: {
                if (h0 < 128) {
                    e.A((int)h0);
                }
                else {
                    k = (64 - Long.numberOfLeadingZeros(h0) + 7) / 8;
                    e.A(k | 0x80);
                    final i s2 = o.S0(o.W((k - 1) * 8, 0), 8);
                    k = s2.k();
                    final int n3 = s2.n();
                    final int o = s2.o();
                    if (o >= 0) {
                        if (k > n3) {
                            break Label_0311;
                        }
                    }
                    else if (k < n3) {
                        break Label_0311;
                    }
                    while (true) {
                        e.A((int)(h0 >> k));
                        if (k == n3) {
                            break;
                        }
                        k += o;
                    }
                }
            }
            e.z3(m);
        }
        finally {
            final List<n> a2 = this.a;
            a2.remove(a2.size() - 1);
            final List<String> c2 = this.c;
            c2.remove(c2.size() - 1);
        }
    }
    
    public final void h(@e final BigInteger bigInteger) {
        k0.p((Object)bigInteger, "value");
        final n e = this.e();
        final byte[] byteArray = bigInteger.toByteArray();
        k0.o((Object)byteArray, "value.toByteArray()");
        e.G4(byteArray);
    }
    
    public final void i(@e final g g) {
        k0.p((Object)g, "bitString");
        final n e = this.e();
        e.A(g.f());
        e.L4(g.e());
    }
    
    public final void j(final boolean b) {
        final n e = this.e();
        int n;
        if (b) {
            n = -1;
        }
        else {
            n = 0;
        }
        e.A(n);
    }
    
    public final void k(final long i) {
        final n e = this.e();
        int n;
        if (i < 0L) {
            n = Long.numberOfLeadingZeros(~i);
        }
        else {
            n = Long.numberOfLeadingZeros(i);
        }
        final i s0 = o.S0(o.W(((65 - n + 7) / 8 - 1) * 8, 0), 8);
        int k = s0.k();
        final int n2 = s0.n();
        final int o = s0.o();
        if (o >= 0) {
            if (k > n2) {
                return;
            }
        }
        else if (k < n2) {
            return;
        }
        while (true) {
            e.A((int)(i >> k));
            if (k == n2) {
                break;
            }
            k += o;
        }
    }
    
    public final void l(@e final String s) {
        k0.p((Object)s, "s");
        final okio.m p = new okio.m().p1(s);
        final long b2 = p.b2();
        final byte byte1 = p.readByte();
        final byte b3 = 46;
        if (byte1 != b3) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long b4 = b2 * 40 + p.b2();
        while (true) {
            this.p(b4);
            if (p.D1()) {
                return;
            }
            if (p.readByte() != b3) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            b4 = p.b2();
        }
    }
    
    public final void m(@e final p p) {
        k0.p((Object)p, "byteString");
        this.e().L4(p);
    }
    
    public final void n(@e final String s) {
        k0.p((Object)s, "s");
        final okio.m m = new okio.m();
        final byte b = 46;
        final okio.m p = m.G0(b).p1(s);
        while (!p.D1()) {
            if (p.readByte() != b) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.p(p.b2());
        }
    }
    
    public final void o(@e final String s) {
        k0.p((Object)s, "value");
        this.e().Q2(s);
    }
    
    @e
    @Override
    public String toString() {
        return v.Z2((Iterable)this.c, (CharSequence)" / ", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 62, (Object)null);
    }
}
