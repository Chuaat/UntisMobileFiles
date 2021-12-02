// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import okio.p;
import okio.m;
import java.math.BigInteger;
import kotlin.jvm.internal.h0;
import java.net.ProtocolException;
import org.jetbrains.annotations.f;
import kotlin.collections.v;
import n6.a;
import java.util.ArrayList;
import okio.d0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import okio.r0;
import kotlin.jvm.internal.w;
import java.util.List;
import okio.o;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 A2\u00020\u0001:\u00022;B\u000f\u0012\u0006\u0010=\u001a\u00020C¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000f\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\rH\u0080\b\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\u000bJ\u0006\u0010\u001d\u001a\u00020\u000bJ\u0006\u0010\u001e\u001a\u00020\u000bJ\u0006\u0010\u001f\u001a\u00020\u001aJ\b\u0010 \u001a\u00020\u000bH\u0016R\u001e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R(\u0010-\u001a\u0004\u0018\u00010\u00012\b\u0010(\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u000b0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010#R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010/\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006F" }, d2 = { "Lokhttp3/tls/internal/der/l;", "", "", "y", "", "l", "Lokhttp3/tls/internal/der/k;", "m", "r", "()Lokhttp3/tls/internal/der/k;", "T", "", "name", "Lkotlin/Function1;", "block", "n", "(Ljava/lang/String;Ln6/l;)Ljava/lang/Object;", "Lkotlin/Function0;", "A", "(Ln6/a;)Ljava/lang/Object;", "q", "Ljava/math/BigInteger;", "o", "s", "Lokhttp3/tls/internal/der/g;", "p", "Lokio/p;", "u", "x", "t", "v", "w", "toString", "", "d", "Ljava/util/List;", "typeHintStack", "g", "Lokhttp3/tls/internal/der/k;", "peekedHeader", "value", "k", "()Ljava/lang/Object;", "z", "(Ljava/lang/Object;)V", "typeHint", "j", "()J", "bytesLeft", "Lokhttp3/tls/internal/der/l$b;", "a", "Lokhttp3/tls/internal/der/l$b;", "countingSource", "c", "J", "limit", "e", "path", "Lokio/o;", "b", "Lokio/o;", "source", "f", "Z", "constructed", "i", "byteCount", "Lokio/r0;", "<init>", "(Lokio/r0;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class l
{
    private static final k h;
    public static final a i;
    private final b a;
    private final o b;
    private long c;
    private final List<Object> d;
    private final List<String> e;
    private boolean f;
    private k g;
    
    static {
        i = new a(null);
        h = new k(0, 0L, false, -1L);
    }
    
    public l(@e final r0 r0) {
        k0.p((Object)r0, "source");
        final b a = new b(r0);
        this.a = a;
        this.b = d0.d(a);
        this.c = -1L;
        this.d = new ArrayList<Object>();
        this.e = new ArrayList<String>();
    }
    
    public static final /* synthetic */ boolean b(final l l) {
        return l.f;
    }
    
    public static final /* synthetic */ long c(final l l) {
        return l.c;
    }
    
    public static final /* synthetic */ List d(final l l) {
        return l.e;
    }
    
    public static final /* synthetic */ k e(final l l) {
        return l.g;
    }
    
    public static final /* synthetic */ void f(final l l, final boolean f) {
        l.f = f;
    }
    
    public static final /* synthetic */ void g(final l l, final long c) {
        l.c = c;
    }
    
    public static final /* synthetic */ void h(final l l, final k g) {
        l.g = g;
    }
    
    private final long i() {
        return this.a.a() - this.b.z().h0();
    }
    
    private final long j() {
        final long c = this.c;
        long n = -1L;
        if (c != -1L) {
            n = c - this.i();
        }
        return n;
    }
    
    private final long y() {
        long n = 0L;
        long n2;
        while (true) {
            n2 = ((long)this.b.readByte() & 0xFFL);
            if ((n2 & 0x80L) != 0x80L) {
                break;
            }
            n = n + (n2 & 0x7FL) << 7;
        }
        return n + n2;
    }
    
    public final <T> T A(@e final n6.a<? extends T> a) {
        k0.p((Object)a, "block");
        this.d.add(null);
        try {
            final Object invoke = a.invoke();
            final List<Object> d = this.d;
            d.remove(d.size() - 1);
            return (T)invoke;
        }
        finally {
            this.d.remove(this.d.size() - 1);
        }
    }
    
    @f
    public final Object k() {
        return v.i3((List)this.d);
    }
    
    public final boolean l() {
        return this.m() != null;
    }
    
    @f
    public final k m() {
        k g;
        if ((g = this.g) == null) {
            g = this.r();
            this.g = g;
        }
        k k = g;
        if (g.k()) {
            k = null;
        }
        return k;
    }
    
    public final <T> T n(@f final String s, @e final n6.l<? super k, ? extends T> l) {
        k0.p((Object)l, "block");
        if (this.l()) {
            final k e = e(this);
            k0.m((Object)e);
            h(this, null);
            final long c = c(this);
            final boolean b = b(this);
            long n;
            if (e.h() != -1L) {
                n = this.i() + e.h();
            }
            else {
                n = -1L;
            }
            if (c != -1L && n > c) {
                throw new ProtocolException("enclosed object too large");
            }
            g(this, n);
            f(this, e.g());
            if (s != null) {
                d(this).add(s);
            }
            try {
                final Object invoke = l.invoke((Object)e);
                if (n != -1L && this.i() > n) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("unexpected byte count at ");
                    sb.append(this);
                    throw new ProtocolException(sb.toString());
                }
                return (T)invoke;
            }
            finally {
                h0.d(1);
                h(this, null);
                g(this, c);
                f(this, b);
                if (s != null) {
                    d(this).remove(d(this).size() - 1);
                }
                h0.c(1);
            }
        }
        throw new ProtocolException("expected a value");
    }
    
    @e
    public final BigInteger o() {
        if (this.j() != 0L) {
            return new BigInteger(this.b.v4(this.j()));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("unexpected length: ");
        sb.append(this.j());
        sb.append(" at ");
        sb.append(this);
        throw new ProtocolException(sb.toString());
    }
    
    @e
    public final g p() {
        if (this.j() == -1L || this.f) {
            throw new ProtocolException("constructed bit strings not supported for DER");
        }
        if (this.j() >= 1L) {
            return new g(this.b.E0(this.j()), this.b.readByte() & 0xFF);
        }
        throw new ProtocolException("malformed bit string");
    }
    
    public final boolean q() {
        if (this.j() == 1L) {
            return this.b.readByte() != 0;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("unexpected length: ");
        sb.append(this.j());
        sb.append(" at ");
        sb.append(this);
        throw new ProtocolException(sb.toString());
    }
    
    @e
    public final k r() {
        final k g = this.g;
        final int n = 1;
        if (g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        final long i = this.i();
        final long c = this.c;
        if (i == c) {
            return l.h;
        }
        if (c == -1L && this.b.D1()) {
            return l.h;
        }
        final int n2 = this.b.readByte() & 0xFF;
        final boolean b = (n2 & 0x20) == 0x20;
        final int n3 = n2 & 0x1F;
        long y;
        if (n3 != 31) {
            y = n3;
        }
        else {
            y = this.y();
        }
        final int n4 = this.b.readByte() & 0xFF;
        if (n4 != 128) {
            final int n5 = n4 & 0x7F;
            long n7;
            if ((n4 & 0x80) == 0x80) {
                if (n5 <= 8) {
                    final long n6 = (long)this.b.readByte() & 0xFFL;
                    if (n6 != 0L) {
                        int j = n;
                        n7 = n6;
                        if (n5 == 1) {
                            if ((0x80L & n6) == 0x0L) {
                                throw new ProtocolException("invalid encoding for length");
                            }
                            n7 = n6;
                            j = n;
                        }
                        while (j < n5) {
                            n7 = (n7 << 8) + (this.b.readByte() & 0xFF);
                            ++j;
                        }
                        if (n7 >= 0L) {
                            return new k(n2 & 0xC0, y, b, n7);
                        }
                        throw new ProtocolException("length > Long.MAX_VALUE");
                    }
                    throw new ProtocolException("invalid encoding for length");
                }
                throw new ProtocolException("length encoded with more than 8 bytes is not supported");
            }
            else {
                n7 = n5;
            }
            return new k(n2 & 0xC0, y, b, n7);
        }
        throw new ProtocolException("indefinite length not permitted for DER");
    }
    
    public final long s() {
        final long n = 8;
        final long j = this.j();
        if (1L <= j && n >= j) {
            long n2 = this.b.readByte();
            while (this.i() < this.c) {
                n2 = (n2 << 8) + (this.b.readByte() & 0xFF);
            }
            return n2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("unexpected length: ");
        sb.append(this.j());
        sb.append(" at ");
        sb.append(this);
        throw new ProtocolException(sb.toString());
    }
    
    @e
    public final String t() {
        final m m = new m();
        final byte b = 46;
        long n = this.y();
        while (true) {
            Label_0055: {
                if (0L > n) {
                    break Label_0055;
                }
                if (40L <= n) {
                    break Label_0055;
                }
                m.H0(0L);
                m.G0(b);
                while (true) {
                    m.H0(n);
                    if (this.i() >= this.c) {
                        break;
                    }
                    m.G0(b);
                    n = this.y();
                }
                return m.y4();
            }
            if (40L <= n) {
                if (80L > n) {
                    m.H0(1L);
                    m.G0(b);
                    n -= 40L;
                    continue;
                }
            }
            m.H0(2L);
            m.G0(b);
            n -= 80L;
            continue;
        }
    }
    
    @e
    @Override
    public String toString() {
        return v.Z2((Iterable)this.e, (CharSequence)" / ", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (n6.l)null, 62, (Object)null);
    }
    
    @e
    public final p u() {
        if (this.j() != -1L && !this.f) {
            return this.b.E0(this.j());
        }
        throw new ProtocolException("constructed octet strings not supported for DER");
    }
    
    @e
    public final String v() {
        final m m = new m();
        final byte b = 46;
        while (this.i() < this.c) {
            if (m.h0() > 0L) {
                m.G0(b);
            }
            m.H0(this.y());
        }
        return m.y4();
    }
    
    @e
    public final p w() {
        return this.b.E0(this.j());
    }
    
    @e
    public final String x() {
        if (this.j() != -1L && !this.f) {
            return this.b.t0(this.j());
        }
        throw new ProtocolException("constructed strings not supported for DER");
    }
    
    public final void z(@f final Object o) {
        final List<Object> d = this.d;
        d.set(d.size() - 1, o);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "okhttp3/tls/internal/der/l$a", "", "Lokhttp3/tls/internal/der/k;", "END_OF_DATA", "Lokhttp3/tls/internal/der/k;", "<init>", "()V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012" }, d2 = { "okhttp3/tls/internal/der/l$b", "Lokio/v;", "Lokio/m;", "sink", "", "byteCount", "read", "G", "J", "a", "()J", "b", "(J)V", "bytesRead", "Lokio/r0;", "source", "<init>", "(Lokio/r0;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
    private static final class b extends v
    {
        private long G;
        
        public b(@e final r0 r0) {
            k0.p((Object)r0, "source");
            super(r0);
        }
        
        public final long a() {
            return this.G;
        }
        
        public final void b(final long g) {
            this.G = g;
        }
        
        @Override
        public long read(@e final m m, long read) {
            k0.p((Object)m, "sink");
            read = this.delegate().read(m, read);
            if (read == -1L) {
                return -1L;
            }
            this.G += read;
            return read;
        }
    }
}
