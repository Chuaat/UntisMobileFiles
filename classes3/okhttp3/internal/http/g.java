// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http;

import okhttp3.j;
import java.io.IOException;
import okhttp3.g0;
import okhttp3.internal.d;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k0;
import okhttp3.e0;
import org.jetbrains.annotations.f;
import okhttp3.internal.connection.c;
import java.util.List;
import okhttp3.internal.connection.e;
import kotlin.Metadata;
import okhttp3.x;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0019\u001a\u00020#\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b1\u00102JM\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0018\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u001c\u0010\b\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0019\u001a\u00020#8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u001c\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b.\u0010\"R\u001c\u0010\n\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b/\u0010\"R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010 ¨\u00063" }, d2 = { "Lokhttp3/internal/http/g;", "Lokhttp3/x$a;", "", "index", "Lokhttp3/internal/connection/c;", "exchange", "Lokhttp3/e0;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "i", "(ILokhttp3/internal/connection/c;Lokhttp3/e0;III)Lokhttp3/internal/http/g;", "Lokhttp3/j;", "f", "h", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "d", "b", "g", "c", "a", "Lokhttp3/e;", "call", "k", "Lokhttp3/g0;", "e", "Lokhttp3/internal/connection/c;", "n", "()Lokhttp3/internal/connection/c;", "I", "m", "()I", "Lokhttp3/internal/connection/e;", "Lokhttp3/internal/connection/e;", "l", "()Lokhttp3/internal/connection/e;", "", "Lokhttp3/x;", "Ljava/util/List;", "interceptors", "Lokhttp3/e0;", "p", "()Lokhttp3/e0;", "o", "q", "calls", "<init>", "(Lokhttp3/internal/connection/e;Ljava/util/List;ILokhttp3/internal/connection/c;Lokhttp3/e0;III)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class g implements a
{
    private int a;
    @org.jetbrains.annotations.e
    private final e b;
    private final List<x> c;
    private final int d;
    @f
    private final c e;
    @org.jetbrains.annotations.e
    private final e0 f;
    private final int g;
    private final int h;
    private final int i;
    
    public g(@org.jetbrains.annotations.e final e b, @org.jetbrains.annotations.e final List<? extends x> c, final int d, @f final c e, @org.jetbrains.annotations.e final e0 f, final int g, final int h, final int i) {
        k0.p((Object)b, "call");
        k0.p((Object)c, "interceptors");
        k0.p((Object)f, "request");
        this.b = b;
        this.c = (List<x>)c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static /* synthetic */ g j(final g g, int d, c e, e0 f, int g2, int h, int i, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            d = g.d;
        }
        if ((n & 0x2) != 0x0) {
            e = g.e;
        }
        if ((n & 0x4) != 0x0) {
            f = g.f;
        }
        if ((n & 0x8) != 0x0) {
            g2 = g.g;
        }
        if ((n & 0x10) != 0x0) {
            h = g.h;
        }
        if ((n & 0x20) != 0x0) {
            i = g.i;
        }
        return g.i(d, e, f, g2, h, i);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public a a(final int n, @org.jetbrains.annotations.e final TimeUnit timeUnit) {
        k0.p((Object)timeUnit, "unit");
        if (this.e == null) {
            return j(this, 0, null, null, 0, 0, okhttp3.internal.d.j("writeTimeout", n, timeUnit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }
    
    @Override
    public int b() {
        return this.h;
    }
    
    @Override
    public int c() {
        return this.i;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public okhttp3.e call() {
        return this.b;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public a d(final int n, @org.jetbrains.annotations.e final TimeUnit timeUnit) {
        k0.p((Object)timeUnit, "unit");
        if (this.e == null) {
            return j(this, 0, null, null, okhttp3.internal.d.j("connectTimeout", n, timeUnit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }
    
    @org.jetbrains.annotations.e
    @Override
    public g0 e(@org.jetbrains.annotations.e final e0 e0) throws IOException {
        k0.p((Object)e0, "request");
        final int d = this.d;
        final int size = this.c.size();
        final int n = 0;
        if (d >= size) {
            throw new IllegalStateException("Check failed.".toString());
        }
        ++this.a;
        final c e2 = this.e;
        if (e2 != null) {
            if (!e2.j().g(e0.q())) {
                final StringBuilder sb = new StringBuilder();
                sb.append("network interceptor ");
                sb.append(this.c.get(this.d - 1));
                sb.append(" must retain the same host and port");
                throw new IllegalStateException(sb.toString().toString());
            }
            if (this.a != 1) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("network interceptor ");
                sb2.append(this.c.get(this.d - 1));
                sb2.append(" must call proceed() exactly once");
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        final g j = j(this, this.d + 1, null, e0, 0, 0, 0, 58, null);
        final x obj = this.c.get(this.d);
        final g0 intercept = obj.intercept((x.a)j);
        if (intercept == null) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("interceptor ");
            sb3.append(obj);
            sb3.append(" returned null");
            throw new NullPointerException(sb3.toString());
        }
        if (this.e != null && (this.d + 1 < this.c.size() && j.a != 1)) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("network interceptor ");
            sb4.append(obj);
            sb4.append(" must call proceed() exactly once");
            throw new IllegalStateException(sb4.toString().toString());
        }
        int n2 = n;
        if (intercept.r() != null) {
            n2 = 1;
        }
        if (n2 != 0) {
            return intercept;
        }
        final StringBuilder sb5 = new StringBuilder();
        sb5.append("interceptor ");
        sb5.append(obj);
        sb5.append(" returned a response with no body");
        throw new IllegalStateException(sb5.toString().toString());
    }
    
    @f
    @Override
    public j f() {
        final c e = this.e;
        okhttp3.internal.connection.f h;
        if (e != null) {
            h = e.h();
        }
        else {
            h = null;
        }
        return h;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public a g(final int n, @org.jetbrains.annotations.e final TimeUnit timeUnit) {
        k0.p((Object)timeUnit, "unit");
        if (this.e == null) {
            return j(this, 0, null, null, 0, okhttp3.internal.d.j("readTimeout", n, timeUnit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }
    
    @Override
    public int h() {
        return this.g;
    }
    
    @org.jetbrains.annotations.e
    public final g i(final int n, @f final c c, @org.jetbrains.annotations.e final e0 e0, final int n2, final int n3, final int n4) {
        k0.p((Object)e0, "request");
        return new g(this.b, this.c, n, c, e0, n2, n3, n4);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public e0 k() {
        return this.f;
    }
    
    @org.jetbrains.annotations.e
    public final e l() {
        return this.b;
    }
    
    public final int m() {
        return this.g;
    }
    
    @f
    public final c n() {
        return this.e;
    }
    
    public final int o() {
        return this.h;
    }
    
    @org.jetbrains.annotations.e
    public final e0 p() {
        return this.f;
    }
    
    public final int q() {
        return this.i;
    }
}
