// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import kotlin.jvm.internal.m0;
import kotlin.j2;
import okio.n;
import java.util.List;
import okio.p;
import java.net.ProtocolException;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000bBM\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\b\u0002\u0010(\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010)\u001a\u00020\u0007¢\u0006\u0004\bA\u0010BJ\t\u0010\u0004\u001a\u00020\u0003H\u00c2\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u00c2\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c2\u0003J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018J\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\t\u0010!\u001a\u00020\u0016H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0018H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\u0012\u0010$\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003¢\u0006\u0004\b$\u0010%Jd\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010(\u001a\u00020\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010)\u001a\u00020\u0007H\u00c6\u0001¢\u0006\u0004\b*\u0010+J\u0013\u0010.\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003R\u0019\u0010\u0017\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u0016\u0010&\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0019\u0010\u0019\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010)\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010\u001b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010%R\u0019\u0010(\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010@¨\u0006C" }, d2 = { "Lokhttp3/tls/internal/der/f;", "T", "Lokhttp3/tls/internal/der/j;", "", "k", "Lokhttp3/tls/internal/der/f$a;", "n", "", "q", "Lokhttp3/tls/internal/der/k;", "header", "a", "Lokhttp3/tls/internal/der/l;", "reader", "b", "(Lokhttp3/tls/internal/der/l;)Ljava/lang/Object;", "Lokhttp3/tls/internal/der/m;", "writer", "value", "Lkotlin/j2;", "h", "(Lokhttp3/tls/internal/der/m;Ljava/lang/Object;)V", "", "tagClass", "", "tag", "z", "defaultValue", "x", "(Ljava/lang/Object;)Lokhttp3/tls/internal/der/f;", "j", "hashCode", "toString", "l", "m", "o", "p", "()Ljava/lang/Object;", "name", "codec", "isOptional", "typeHint", "r", "(Ljava/lang/String;IJLokhttp3/tls/internal/der/f$a;ZLjava/lang/Object;Z)Lokhttp3/tls/internal/der/f;", "", "other", "equals", "I", "v", "()I", "Ljava/lang/String;", "c", "J", "u", "()J", "d", "Lokhttp3/tls/internal/der/f$a;", "g", "Z", "f", "Ljava/lang/Object;", "t", "e", "w", "()Z", "<init>", "(Ljava/lang/String;IJLokhttp3/tls/internal/der/f$a;ZLjava/lang/Object;Z)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class f<T> implements j<T>
{
    private final String a;
    private final int b;
    private final long c;
    private final a<T> d;
    private final boolean e;
    @org.jetbrains.annotations.f
    private final T f;
    private final boolean g;
    
    public f(@e final String a, int b, final long c, @e final a<T> d, final boolean e, @org.jetbrains.annotations.f final T f, final boolean g) {
        k0.p((Object)a, "name");
        k0.p((Object)d, "codec");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final int n = 1;
        if (b >= 0) {
            b = 1;
        }
        else {
            b = 0;
        }
        if (b == 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (c >= 0L) {
            b = n;
        }
        else {
            b = 0;
        }
        if (b != 0) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public static final /* synthetic */ a i(final f f) {
        return f.d;
    }
    
    private final String k() {
        return this.a;
    }
    
    private final a<T> n() {
        return this.d;
    }
    
    private final boolean q() {
        return this.g;
    }
    
    public static /* synthetic */ f s(final f f, String a, int b, long c, a d, boolean e, Object f2, boolean g, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            a = f.a;
        }
        if ((n & 0x2) != 0x0) {
            b = f.b;
        }
        if ((n & 0x4) != 0x0) {
            c = f.c;
        }
        if ((n & 0x8) != 0x0) {
            d = (a<Object>)f.d;
        }
        if ((n & 0x10) != 0x0) {
            e = f.e;
        }
        if ((n & 0x20) != 0x0) {
            f2 = f.f;
        }
        if ((n & 0x40) != 0x0) {
            g = f.g;
        }
        return f.r(a, b, c, d, e, f2, g);
    }
    
    @Override
    public boolean a(@e final k k) {
        k0.p((Object)k, "header");
        return k.j() == this.b && k.i() == this.c;
    }
    
    @Override
    public T b(@e final l l) {
        k0.p((Object)l, "reader");
        final k m = l.m();
        if (m != null && m.j() == this.b && m.i() == this.c) {
            final String a = this.a;
            if (l.l()) {
                final k e = l.e(l);
                k0.m((Object)e);
                l.h(l, null);
                final long c = l.c(l);
                final boolean b = l.b(l);
                long n;
                if (e.h() != -1L) {
                    n = l.a(l) + e.h();
                }
                else {
                    n = -1L;
                }
                if (c != -1L && n > c) {
                    throw new ProtocolException("enclosed object too large");
                }
                l.g(l, n);
                l.f(l, e.g());
                if (a != null) {
                    l.d(l).add(a);
                }
                try {
                    final T a2 = this.d.a(l);
                    if (n != -1L && l.a(l) > n) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("unexpected byte count at ");
                        sb.append(l);
                        throw new ProtocolException(sb.toString());
                    }
                    l.h(l, null);
                    l.g(l, c);
                    l.f(l, b);
                    if (a != null) {
                        l.d(l).remove(l.d(l).size() - 1);
                    }
                    if (this.g) {
                        l.z(a2);
                    }
                    return a2;
                }
                finally {
                    l.h(l, null);
                    l.g(l, c);
                    l.f(l, b);
                    if (a != null) {
                        l.d(l).remove(l.d(l).size() - 1);
                    }
                }
            }
            throw new ProtocolException("expected a value");
        }
        if (this.e) {
            return this.f;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("expected ");
        sb2.append(this);
        sb2.append(" but was ");
        sb2.append(m);
        sb2.append(" at ");
        sb2.append(l);
        throw new ProtocolException(sb2.toString());
    }
    
    @Override
    public T c(@e final p p) {
        k0.p((Object)p, "byteString");
        return j.a.d((j<T>)this, p);
    }
    
    @e
    @Override
    public f<T> d(final int n, final long n2, @org.jetbrains.annotations.f final Boolean b) {
        return j.a.f((j<T>)this, n, n2, b);
    }
    
    @e
    @Override
    public f<List<T>> e() {
        return j.a.c((j<T>)this);
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        if (this != o) {
            if (o instanceof f) {
                final f f = (f)o;
                if (k0.g((Object)this.a, (Object)f.a) && this.b == f.b && this.c == f.c && k0.g((Object)this.d, (Object)f.d) && this.e == f.e && k0.g((Object)this.f, (Object)f.f) && this.g == f.g) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @e
    @Override
    public p f(final T t) {
        return j.a.e(this, t);
    }
    
    @e
    @Override
    public f<List<T>> g(@e final String s, final int n, final long n2) {
        k0.p((Object)s, "name");
        return j.a.a((j<T>)this, s, n, n2);
    }
    
    @Override
    public void h(@e final m m, final T t) {
        k0.p((Object)m, "writer");
        if (this.g) {
            m.d(t);
        }
        if (this.e && k0.g((Object)t, (Object)this.f)) {
            return;
        }
        m.g(this.a, this.b, this.c, (n6.l<? super n, j2>)new n6.l<n, j2>() {
            final /* synthetic */ f G;
            
            public final void a(@e final n n) {
                k0.p((Object)n, "it");
                okhttp3.tls.internal.der.f.i(this.G).b(m, t);
            }
        });
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        int hashCode2 = 0;
        final int b = this.b;
        final int n = (int)this.c;
        final int hashCode3 = this.d.hashCode();
        final int e = this.e ? 1 : 0;
        final T f = this.f;
        if (f != null) {
            hashCode2 = f.hashCode();
        }
        return ((((((hashCode + 0) * 31 + b) * 31 + n) * 31 + hashCode3) * 31 + e) * 31 + hashCode2) * 31 + (this.g ? 1 : 0);
    }
    
    @e
    public final f<T> j() {
        return s(this, null, 0, 0L, null, false, null, true, 63, null);
    }
    
    public final int l() {
        return this.b;
    }
    
    public final long m() {
        return this.c;
    }
    
    public final boolean o() {
        return this.e;
    }
    
    @org.jetbrains.annotations.f
    public final T p() {
        return this.f;
    }
    
    @e
    public final f<T> r(@e final String s, final int n, final long n2, @e final a<T> a, final boolean b, @org.jetbrains.annotations.f final T t, final boolean b2) {
        k0.p((Object)s, "name");
        k0.p((Object)a, "codec");
        return new f<T>(s, n, n2, a, b, t, b2);
    }
    
    @org.jetbrains.annotations.f
    public final T t() {
        return this.f;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" [");
        sb.append(this.b);
        sb.append('/');
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }
    
    public final long u() {
        return this.c;
    }
    
    public final int v() {
        return this.b;
    }
    
    public final boolean w() {
        return this.e;
    }
    
    @e
    public final f<T> x(@org.jetbrains.annotations.f final T t) {
        return s(this, null, 0, 0L, null, true, t, false, 79, null);
    }
    
    @e
    public final f<T> z(final int n, final long n2) {
        return s(this, null, n, n2, null, false, null, false, 121, null);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r" }, d2 = { "okhttp3/tls/internal/der/f$a", "T", "", "Lokhttp3/tls/internal/der/l;", "reader", "a", "(Lokhttp3/tls/internal/der/l;)Ljava/lang/Object;", "Lokhttp3/tls/internal/der/m;", "writer", "value", "Lkotlin/j2;", "b", "(Lokhttp3/tls/internal/der/m;Ljava/lang/Object;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
    public interface a<T>
    {
        T a(@e final l p0);
        
        void b(@e final m p0, final T p1);
    }
}
