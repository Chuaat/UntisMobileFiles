// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http;

import okhttp3.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.net.Proxy;
import okhttp3.e0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000f" }, d2 = { "Lokhttp3/internal/http/i;", "", "Lokhttp3/e0;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "b", "", "a", "Lokhttp3/w;", "url", "c", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class i
{
    public static final i a;
    
    static {
        a = new i();
    }
    
    private i() {
    }
    
    private final boolean b(final e0 e0, final Proxy.Type type) {
        return !e0.l() && type == Proxy.Type.HTTP;
    }
    
    @e
    public final String a(@e final e0 e0, @e final Proxy.Type type) {
        k0.p((Object)e0, "request");
        k0.p((Object)type, "proxyType");
        final StringBuilder sb = new StringBuilder();
        sb.append(e0.m());
        sb.append(' ');
        final i a = i.a;
        final boolean b = a.b(e0, type);
        final w q = e0.q();
        if (b) {
            sb.append(q);
        }
        else {
            sb.append(a.c(q));
        }
        sb.append(" HTTP/1.1");
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @e
    public final String c(@e final w w) {
        k0.p((Object)w, "url");
        final String x = w.x();
        final String z = w.z();
        String string = x;
        if (z != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(x);
            sb.append('?');
            sb.append(z);
            string = sb.toString();
        }
        return string;
    }
}
