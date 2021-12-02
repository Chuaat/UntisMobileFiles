// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.IOException;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import javax.crypto.Cipher;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0019\u0010\u001a\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c¨\u0006#" }, d2 = { "Lokio/q;", "Lokio/p0;", "Lokio/m;", "source", "", "remaining", "", "c", "", "a", "byteCount", "Lkotlin/j2;", "t3", "flush", "Lokio/t0;", "timeout", "close", "", "H", "Z", "closed", "Ljavax/crypto/Cipher;", "J", "Ljavax/crypto/Cipher;", "b", "()Ljavax/crypto/Cipher;", "cipher", "Lokio/n;", "I", "Lokio/n;", "sink", "G", "blockSize", "<init>", "(Lokio/n;Ljavax/crypto/Cipher;)V", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class q implements p0
{
    private final int G;
    private boolean H;
    private final n I;
    @e
    private final Cipher J;
    
    public q(@e final n i, @e final Cipher cipher) {
        k0.p((Object)i, "sink");
        k0.p((Object)cipher, "cipher");
        this.I = i;
        this.J = cipher;
        final int blockSize = cipher.getBlockSize();
        this.G = blockSize;
        if (blockSize > 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Block cipher required ");
        sb.append(cipher);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    private final Throwable a() {
        final int outputSize = this.J.getOutputSize(0);
        if (outputSize == 0) {
            return null;
        }
        final m z = this.I.z();
        final m0 m0 = z.m0(outputSize);
        try {
            final int doFinal = this.J.doFinal(m0.a, m0.c);
            m0.c += doFinal;
            z.d0(z.h0() + doFinal);
        }
        finally {}
        if (m0.b == m0.c) {
            z.G = m0.b();
            n0.d(m0);
        }
        return;
    }
    
    private final int c(final m m, final long a) {
        final m0 g = m.G;
        k0.m((Object)g);
        int i = (int)Math.min(a, g.c - g.b);
        final m z = this.I.z();
        while (true) {
            final int outputSize = this.J.getOutputSize(i);
            if (outputSize <= 8192) {
                final m0 m2 = z.m0(outputSize);
                final int update = this.J.update(g.a, g.b, i, m2.a, m2.c);
                m2.c += update;
                z.d0(z.h0() + update);
                if (m2.b == m2.c) {
                    z.G = m2.b();
                    n0.d(m2);
                }
                this.I.a2();
                m.d0(m.h0() - i);
                if ((g.b += i) == g.c) {
                    m.G = g.b();
                    n0.d(g);
                }
                return i;
            }
            final int g2 = this.G;
            if (i <= g2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unexpected output size ");
                sb.append(outputSize);
                sb.append(" for input size ");
                sb.append(i);
                throw new IllegalStateException(sb.toString().toString());
            }
            i -= g2;
        }
    }
    
    @e
    public final Cipher b() {
        return this.J;
    }
    
    @Override
    public void close() throws IOException {
        if (this.H) {
            return;
        }
        this.H = true;
        final Throwable a = this.a();
        Throwable t = null;
        try {
            this.I.close();
        }
        finally {
            t = a;
            if (a == null) {
                final Throwable t2;
                t = t2;
            }
        }
        if (t == null) {
            return;
        }
        throw t;
    }
    
    @Override
    public void flush() {
        this.I.flush();
    }
    
    @Override
    public void t3(@e final m m, long n) throws IOException {
        k0.p((Object)m, "source");
        j.e(m.h0(), 0L, n);
        if (this.H ^ true) {
            while (n > 0L) {
                n -= this.c(m, n);
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public t0 timeout() {
        return this.I.timeout();
    }
}
