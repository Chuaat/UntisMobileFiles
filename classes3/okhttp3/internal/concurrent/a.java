// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.concurrent;

import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016R\u0019\u0010\u000f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0019\u0010\u001a\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c\"\u0004\b\u001d\u0010\b¨\u0006 " }, d2 = { "Lokhttp3/internal/concurrent/a;", "", "", "f", "Lokhttp3/internal/concurrent/c;", "queue", "Lkotlin/j2;", "e", "(Lokhttp3/internal/concurrent/c;)V", "", "toString", "c", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "name", "J", "()J", "g", "(J)V", "nextExecuteNanoTime", "", "d", "Z", "a", "()Z", "cancelable", "Lokhttp3/internal/concurrent/c;", "()Lokhttp3/internal/concurrent/c;", "h", "<init>", "(Ljava/lang/String;Z)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public abstract class a
{
    @f
    private c a;
    private long b;
    @e
    private final String c;
    private final boolean d;
    
    public a(@e final String c, final boolean d) {
        k0.p((Object)c, "name");
        this.c = c;
        this.d = d;
        this.b = -1L;
    }
    
    public final boolean a() {
        return this.d;
    }
    
    @e
    public final String b() {
        return this.c;
    }
    
    public final long c() {
        return this.b;
    }
    
    @f
    public final c d() {
        return this.a;
    }
    
    public final void e(@e final c a) {
        k0.p((Object)a, "queue");
        final c a2 = this.a;
        if (a2 == a) {
            return;
        }
        if (a2 == null) {
            this.a = a;
            return;
        }
        throw new IllegalStateException("task is in multiple queues".toString());
    }
    
    public abstract long f();
    
    public final void g(final long b) {
        this.b = b;
    }
    
    public final void h(@f final c a) {
        this.a = a;
    }
    
    @e
    @Override
    public String toString() {
        return this.c;
    }
}
