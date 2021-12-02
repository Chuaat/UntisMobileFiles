// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.connection;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import okhttp3.l;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0018" }, d2 = { "Lokhttp3/internal/connection/b;", "", "Ljavax/net/ssl/SSLSocket;", "socket", "", "c", "sslSocket", "Lokhttp3/l;", "a", "Ljava/io/IOException;", "e", "b", "", "d", "Ljava/util/List;", "connectionSpecs", "", "I", "nextModeIndex", "Z", "isFallback", "isFallbackPossible", "<init>", "(Ljava/util/List;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class b
{
    private int a;
    private boolean b;
    private boolean c;
    private final List<l> d;
    
    public b(@e final List<l> d) {
        k0.p((Object)d, "connectionSpecs");
        this.d = d;
    }
    
    private final boolean c(final SSLSocket sslSocket) {
        for (int i = this.a; i < this.d.size(); ++i) {
            if (this.d.get(i).h(sslSocket)) {
                return true;
            }
        }
        return false;
    }
    
    @e
    public final l a(@e final SSLSocket sslSocket) throws IOException {
        k0.p((Object)sslSocket, "sslSocket");
        int i = this.a;
        while (true) {
            while (i < this.d.size()) {
                final l l = this.d.get(i);
                final boolean h = l.h(sslSocket);
                final int a = ++i;
                if (h) {
                    this.a = a;
                    if (l != null) {
                        this.b = this.c(sslSocket);
                        l.f(sslSocket, this.c);
                        return l;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unable to find acceptable protocols. isFallback=");
                    sb.append(this.c);
                    sb.append(',');
                    sb.append(" modes=");
                    sb.append(this.d);
                    sb.append(',');
                    sb.append(" supported protocols=");
                    final String[] enabledProtocols = sslSocket.getEnabledProtocols();
                    k0.m((Object)enabledProtocols);
                    final String string = Arrays.toString(enabledProtocols);
                    k0.o((Object)string, "java.util.Arrays.toString(this)");
                    sb.append(string);
                    throw new UnknownServiceException(sb.toString());
                }
            }
            final l l = null;
            continue;
        }
    }
    
    public final boolean b(@e final IOException ex) {
        k0.p((Object)ex, "e");
        boolean b = true;
        this.c = true;
        if (this.b) {
            if (!(ex instanceof ProtocolException)) {
                if (!(ex instanceof InterruptedIOException)) {
                    if (!(ex instanceof SSLHandshakeException) || !(ex.getCause() instanceof CertificateException)) {
                        if (!(ex instanceof SSLPeerUnverifiedException)) {
                            if (ex instanceof SSLException) {
                                return b;
                            }
                        }
                    }
                }
            }
        }
        b = false;
        return b;
    }
}
