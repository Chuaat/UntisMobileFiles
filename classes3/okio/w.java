// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import m6.g;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0017J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019" }, d2 = { "Lokio/w;", "Lokio/t0;", "delegate", "m", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "i", "j", "", "f", "d", "deadlineNanoTime", "e", "b", "a", "Lkotlin/j2;", "h", "Lokio/t0;", "l", "()Lokio/t0;", "n", "(Lokio/t0;)V", "<init>", "okio" }, k = 1, mv = { 1, 4, 1 })
public class w extends t0
{
    @e
    private t0 f;
    
    public w(@e final t0 f) {
        k0.p((Object)f, "delegate");
        this.f = f;
    }
    
    @e
    @Override
    public t0 a() {
        return this.f.a();
    }
    
    @e
    @Override
    public t0 b() {
        return this.f.b();
    }
    
    @Override
    public long d() {
        return this.f.d();
    }
    
    @e
    @Override
    public t0 e(final long n) {
        return this.f.e(n);
    }
    
    @Override
    public boolean f() {
        return this.f.f();
    }
    
    @Override
    public void h() throws IOException {
        this.f.h();
    }
    
    @e
    @Override
    public t0 i(final long n, @e final TimeUnit timeUnit) {
        k0.p((Object)timeUnit, "unit");
        return this.f.i(n, timeUnit);
    }
    
    @Override
    public long j() {
        return this.f.j();
    }
    
    @g(name = "delegate")
    @e
    public final t0 l() {
        return this.f;
    }
    
    @e
    public final w m(@e final t0 f) {
        k0.p((Object)f, "delegate");
        this.f = f;
        return this;
    }
}
