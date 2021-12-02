// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.e0;
import okhttp3.internal.http.g;
import kotlin.jvm.internal.k0;
import okhttp3.g0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import okhttp3.x;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b" }, d2 = { "Lokhttp3/internal/connection/a;", "Lokhttp3/x;", "Lokhttp3/x$a;", "chain", "Lokhttp3/g0;", "intercept", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class a implements x
{
    public static final a b;
    
    static {
        b = new a();
    }
    
    private a() {
    }
    
    @e
    @Override
    public g0 intercept(@e final x.a a) throws IOException {
        k0.p((Object)a, "chain");
        final g g = (g)a;
        return okhttp3.internal.http.g.j(g, 0, g.l().w(g), null, 0, 0, 0, 61, null).e(g.p());
    }
}
