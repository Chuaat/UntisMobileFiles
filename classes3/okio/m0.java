// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.util.Arrays;
import kotlin.collections.m;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import m6.d;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u000bB\t\b\u0016¢\u0006\u0004\b\u001b\u0010\u001cB1\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001dJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0003\u001a\u00020\u0000J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\u0010\u001a\u00020\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0012R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017¨\u0006\u001f" }, d2 = { "Lokio/m0;", "", "d", "f", "b", "segment", "c", "", "byteCount", "e", "Lkotlin/j2;", "a", "sink", "g", "", "[B", "data", "", "Z", "owner", "I", "pos", "shared", "Lokio/m0;", "next", "limit", "prev", "<init>", "()V", "([BIIZZ)V", "j", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class m0
{
    public static final int h = 8192;
    public static final int i = 1024;
    @e
    public static final a j;
    @d
    @e
    public final byte[] a;
    @d
    public int b;
    @d
    public int c;
    @d
    public boolean d;
    @d
    public boolean e;
    @d
    @f
    public m0 f;
    @d
    @f
    public m0 g;
    
    static {
        j = new a(null);
    }
    
    public m0() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
    
    public m0(@e final byte[] a, final int b, final int c, final boolean d, final boolean e) {
        k0.p((Object)a, "data");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a() {
        final m0 g = this.g;
        final int n = 0;
        if (g == this) {
            throw new IllegalStateException("cannot compact".toString());
        }
        k0.m((Object)g);
        if (!g.e) {
            return;
        }
        final int n2 = this.c - this.b;
        final m0 g2 = this.g;
        k0.m((Object)g2);
        final int c = g2.c;
        final m0 g3 = this.g;
        k0.m((Object)g3);
        int b;
        if (g3.d) {
            b = n;
        }
        else {
            final m0 g4 = this.g;
            k0.m((Object)g4);
            b = g4.b;
        }
        if (n2 > 8192 - c + b) {
            return;
        }
        final m0 g5 = this.g;
        k0.m((Object)g5);
        this.g(g5, n2);
        this.b();
        n0.d(this);
    }
    
    @f
    public final m0 b() {
        m0 f = this.f;
        if (f == this) {
            f = null;
        }
        final m0 g = this.g;
        k0.m((Object)g);
        g.f = this.f;
        final m0 f2 = this.f;
        k0.m((Object)f2);
        f2.g = this.g;
        this.f = null;
        this.g = null;
        return f;
    }
    
    @e
    public final m0 c(@e final m0 m0) {
        k0.p((Object)m0, "segment");
        m0.g = this;
        m0.f = this.f;
        final m0 f = this.f;
        k0.m((Object)f);
        f.g = m0;
        return this.f = m0;
    }
    
    @e
    public final m0 d() {
        this.d = true;
        return new m0(this.a, this.b, this.c, true, false);
    }
    
    @e
    public final m0 e(final int n) {
        if (n > 0 && n <= this.c - this.b) {
            m0 m0;
            if (n >= 1024) {
                m0 = this.d();
            }
            else {
                m0 = n0.e();
                final byte[] a = this.a;
                final byte[] a2 = m0.a;
                final int b = this.b;
                m.f1(a, a2, 0, b, b + n, 2, (Object)null);
            }
            m0.c = m0.b + n;
            this.b += n;
            final m0 g = this.g;
            k0.m((Object)g);
            g.c(m0);
            return m0;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }
    
    @e
    public final m0 f() {
        final byte[] a = this.a;
        final byte[] copy = Arrays.copyOf(a, a.length);
        k0.o((Object)copy, "java.util.Arrays.copyOf(this, size)");
        return new m0(copy, this.b, this.c, false, true);
    }
    
    public final void g(@e final m0 m0, final int n) {
        k0.p((Object)m0, "sink");
        if (m0.e) {
            final int c = m0.c;
            if (c + n > 8192) {
                if (m0.d) {
                    throw new IllegalArgumentException();
                }
                final int b = m0.b;
                if (c + n - b > 8192) {
                    throw new IllegalArgumentException();
                }
                final byte[] a = m0.a;
                m.f1(a, a, 0, b, c, 2, (Object)null);
                m0.c -= m0.b;
                m0.b = 0;
            }
            final byte[] a2 = this.a;
            final byte[] a3 = m0.a;
            final int c2 = m0.c;
            final int b2 = this.b;
            m.W0(a2, a3, c2, b2, b2 + n);
            m0.c += n;
            this.b += n;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b" }, d2 = { "okio/m0$a", "", "", "SHARE_MINIMUM", "I", "SIZE", "<init>", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
