// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import m6.k;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0002R\u0013\u0010\f\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R$\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00070\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u001c\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018" }, d2 = { "Lokio/n0;", "", "Lokio/m0;", "e", "segment", "Lkotlin/j2;", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "", "b", "()I", "byteCount", "c", "I", "HASH_BUCKET_COUNT", "Lokio/m0;", "LOCK", "", "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "MAX_SIZE", "<init>", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class n0
{
    private static final int a;
    private static final m0 b;
    private static final int c;
    private static final AtomicReference<m0>[] d;
    @e
    public static final n0 e;
    
    static {
        e = new n0();
        a = 65536;
        int i = 0;
        b = new m0(new byte[0], 0, 0, false, false);
        final int n = c = Integer.highestOneBit(Runtime.getRuntime().availableProcessors() * 2 - 1);
        final AtomicReference[] d2 = new AtomicReference[n];
        while (i < n) {
            d2[i] = new AtomicReference<m0>();
            ++i;
        }
        d = d2;
    }
    
    private n0() {
    }
    
    private final AtomicReference<m0> a() {
        final Thread currentThread = Thread.currentThread();
        k0.o((Object)currentThread, "Thread.currentThread()");
        return n0.d[(int)(currentThread.getId() & n0.c - 1L)];
    }
    
    @k
    public static final void d(@e final m0 newValue) {
        k0.p((Object)newValue, "segment");
        if (newValue.f != null || newValue.g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (newValue.d) {
            return;
        }
        final AtomicReference<m0> a = n0.e.a();
        final m0 m0 = a.get();
        if (m0 == n0.b) {
            return;
        }
        int c;
        if (m0 != null) {
            c = m0.c;
        }
        else {
            c = 0;
        }
        if (c >= n0.a) {
            return;
        }
        newValue.f = m0;
        newValue.b = 0;
        newValue.c = c + 8192;
        if (!a.compareAndSet(m0, newValue)) {
            newValue.f = null;
        }
    }
    
    @k
    @e
    public static final m0 e() {
        final AtomicReference<m0> a = n0.e.a();
        final m0 b = n0.b;
        final m0 m0 = a.getAndSet(b);
        if (m0 == b) {
            return new m0();
        }
        if (m0 == null) {
            a.set(null);
            return new m0();
        }
        a.set(m0.f);
        m0.f = null;
        m0.c = 0;
        return m0;
    }
    
    public final int b() {
        final m0 m0 = this.a().get();
        if (m0 != null) {
            return m0.c;
        }
        return 0;
    }
    
    public final int c() {
        return n0.a;
    }
}
