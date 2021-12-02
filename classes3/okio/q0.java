// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.net.SocketTimeoutException;
import org.jetbrains.annotations.f;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.net.Socket;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r" }, d2 = { "Lokio/q0;", "Lokio/k;", "Ljava/io/IOException;", "cause", "z", "Lkotlin/j2;", "D", "Ljava/net/Socket;", "n", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "okio" }, k = 1, mv = { 1, 4, 1 })
final class q0 extends k
{
    private final Socket n;
    
    public q0(@e final Socket n) {
        k0.p((Object)n, "socket");
        this.n = n;
    }
    
    @Override
    protected void D() {
        Logger logger;
        Level level;
        StringBuilder sb;
        try {
            this.n.close();
            return;
        }
        catch (AssertionError thrown) {
            if (!d0.k(thrown)) {
                throw thrown;
            }
            logger = e0.a();
            level = Level.WARNING;
            sb = new StringBuilder();
        }
        catch (Exception thrown) {
            logger = e0.a();
            level = Level.WARNING;
            sb = new StringBuilder();
        }
        sb.append("Failed to close timed out socket ");
        sb.append(this.n);
        final AssertionError thrown;
        logger.log(level, sb.toString(), thrown);
    }
    
    @e
    @Override
    protected IOException z(@f final IOException cause) {
        final SocketTimeoutException ex = new SocketTimeoutException("timeout");
        if (cause != null) {
            ex.initCause(cause);
        }
        return ex;
    }
}
