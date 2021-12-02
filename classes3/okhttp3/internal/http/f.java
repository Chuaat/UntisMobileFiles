// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http;

import m6.k;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f" }, d2 = { "Lokhttp3/internal/http/f;", "", "", "method", "", "e", "b", "a", "d", "c", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class f
{
    public static final f a;
    
    static {
        a = new f();
    }
    
    private f() {
    }
    
    @k
    public static final boolean b(@e final String s) {
        k0.p((Object)s, "method");
        return !k0.g((Object)s, (Object)"GET") && !k0.g((Object)s, (Object)"HEAD");
    }
    
    @k
    public static final boolean e(@e final String s) {
        k0.p((Object)s, "method");
        return k0.g((Object)s, (Object)"POST") || k0.g((Object)s, (Object)"PUT") || k0.g((Object)s, (Object)"PATCH") || k0.g((Object)s, (Object)"PROPPATCH") || k0.g((Object)s, (Object)"REPORT");
    }
    
    public final boolean a(@e final String s) {
        k0.p((Object)s, "method");
        return k0.g((Object)s, (Object)"POST") || k0.g((Object)s, (Object)"PATCH") || k0.g((Object)s, (Object)"PUT") || k0.g((Object)s, (Object)"DELETE") || k0.g((Object)s, (Object)"MOVE");
    }
    
    public final boolean c(@e final String s) {
        k0.p((Object)s, "method");
        return k0.g((Object)s, (Object)"PROPFIND") ^ true;
    }
    
    public final boolean d(@e final String s) {
        k0.p((Object)s, "method");
        return k0.g((Object)s, (Object)"PROPFIND");
    }
}
