// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.connection;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.LinkedHashSet;
import okhttp3.i0;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000f" }, d2 = { "Lokhttp3/internal/connection/i;", "", "Lokhttp3/i0;", "failedRoute", "Lkotlin/j2;", "b", "route", "a", "", "c", "", "Ljava/util/Set;", "failedRoutes", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class i
{
    private final Set<i0> a;
    
    public i() {
        this.a = new LinkedHashSet<i0>();
    }
    
    public final void a(@e final i0 i0) {
        synchronized (this) {
            k0.p((Object)i0, "route");
            this.a.remove(i0);
        }
    }
    
    public final void b(@e final i0 i0) {
        synchronized (this) {
            k0.p((Object)i0, "failedRoute");
            this.a.add(i0);
        }
    }
    
    public final boolean c(@e final i0 i0) {
        synchronized (this) {
            k0.p((Object)i0, "route");
            return this.a.contains(i0);
        }
    }
}
