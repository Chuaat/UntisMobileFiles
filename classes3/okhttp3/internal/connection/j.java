// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.connection;

import kotlin.m;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R\u0019\u0010\u000b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n¨\u0006\u0012" }, d2 = { "Lokhttp3/internal/connection/j;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "e", "Lkotlin/j2;", "a", "H", "Ljava/io/IOException;", "b", "()Ljava/io/IOException;", "firstConnectException", "<set-?>", "G", "c", "lastConnectException", "<init>", "(Ljava/io/IOException;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class j extends RuntimeException
{
    @e
    private IOException G;
    @e
    private final IOException H;
    
    public j(@e final IOException g) {
        k0.p((Object)g, "firstConnectException");
        super(g);
        this.H = g;
        this.G = g;
    }
    
    public final void a(@e final IOException g) {
        k0.p((Object)g, "e");
        m.a((Throwable)this.H, (Throwable)g);
        this.G = g;
    }
    
    @e
    public final IOException b() {
        return this.H;
    }
    
    @e
    public final IOException c() {
        return this.G;
    }
}
