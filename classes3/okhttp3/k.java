// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import okhttp3.internal.concurrent.d;
import kotlin.jvm.internal.k0;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.e;
import okhttp3.internal.connection.h;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rB!\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013B\t\b\u0016¢\u0006\u0004\b\f\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\u001c\u0010\u000b\u001a\u00020\u00078\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lokhttp3/k;", "", "", "d", "a", "Lkotlin/j2;", "b", "Lokhttp3/internal/connection/h;", "Lokhttp3/internal/connection/h;", "c", "()Lokhttp3/internal/connection/h;", "delegate", "<init>", "(Lokhttp3/internal/connection/h;)V", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class k
{
    @e
    private final h a;
    
    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }
    
    public k(final int n, final long n2, @e final TimeUnit timeUnit) {
        k0.p((Object)timeUnit, "timeUnit");
        this(new h(d.h, n, n2, timeUnit));
    }
    
    public k(@e final h a) {
        k0.p((Object)a, "delegate");
        this.a = a;
    }
    
    public final int a() {
        return this.a.d();
    }
    
    public final void b() {
        this.a.e();
    }
    
    @e
    public final h c() {
        return this.a;
    }
    
    public final int d() {
        return this.a.f();
    }
}
