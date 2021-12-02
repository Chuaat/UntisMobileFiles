// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http2;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;
import java.io.IOException;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lokhttp3/internal/http2/n;", "Ljava/io/IOException;", "Lokhttp3/internal/http2/b;", "G", "Lokhttp3/internal/http2/b;", "errorCode", "<init>", "(Lokhttp3/internal/http2/b;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class n extends IOException
{
    @d
    @e
    public final b G;
    
    public n(@e final b b) {
        k0.p((Object)b, "errorCode");
        final StringBuilder sb = new StringBuilder();
        sb.append("stream was reset: ");
        sb.append(b);
        super(sb.toString());
        this.G = b;
    }
}
