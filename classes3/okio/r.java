// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.IOException;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import javax.crypto.Cipher;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0019\u0010 \u001a\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&" }, d2 = { "Lokio/r;", "Lokio/r0;", "Lkotlin/j2;", "c", "d", "a", "Lokio/m;", "sink", "", "byteCount", "read", "Lokio/t0;", "timeout", "close", "", "J", "Z", "closed", "Lokio/o;", "K", "Lokio/o;", "source", "", "G", "I", "blockSize", "final", "Ljavax/crypto/Cipher;", "L", "Ljavax/crypto/Cipher;", "b", "()Ljavax/crypto/Cipher;", "cipher", "H", "Lokio/m;", "buffer", "<init>", "(Lokio/o;Ljavax/crypto/Cipher;)V", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class r implements r0
{
    private final int G;
    private final m H;
    private boolean I;
    private boolean J;
    private final o K;
    @e
    private final Cipher L;
    
    public r(@e final o k, @e final Cipher cipher) {
        k0.p((Object)k, "source");
        k0.p((Object)cipher, "cipher");
        this.K = k;
        this.L = cipher;
        final int blockSize = cipher.getBlockSize();
        this.G = blockSize;
        this.H = new m();
        if (blockSize > 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Block cipher required ");
        sb.append(cipher);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    private final void a() {
        final int outputSize = this.L.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        final m0 m0 = this.H.m0(outputSize);
        final int doFinal = this.L.doFinal(m0.a, m0.b);
        m0.c += doFinal;
        final m h = this.H;
        h.d0(h.h0() + doFinal);
        if (m0.b == m0.c) {
            this.H.G = m0.b();
            n0.d(m0);
        }
    }
    
    private final void c() {
        while (this.H.h0() == 0L) {
            if (this.K.D1()) {
                this.I = true;
                this.a();
                break;
            }
            this.d();
        }
    }
    
    private final void d() {
        final m0 g = this.K.z().G;
        k0.m((Object)g);
        int i = g.c - g.b;
        while (true) {
            final int outputSize = this.L.getOutputSize(i);
            if (outputSize <= 8192) {
                final m0 m0 = this.H.m0(outputSize);
                final int update = this.L.update(g.a, g.b, i, m0.a, m0.b);
                this.K.skip(i);
                m0.c += update;
                final m h = this.H;
                h.d0(h.h0() + update);
                if (m0.b == m0.c) {
                    this.H.G = m0.b();
                    n0.d(m0);
                }
                return;
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
        return this.L;
    }
    
    @Override
    public void close() throws IOException {
        this.J = true;
        this.K.close();
    }
    
    @Override
    public long read(@e final m m, final long lng) throws IOException {
        k0.p((Object)m, "sink");
        final long n = lcmp(lng, 0L);
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (!(true ^ this.J)) {
            throw new IllegalStateException("closed".toString());
        }
        if (n == 0) {
            return 0L;
        }
        if (!this.I) {
            this.c();
        }
        return this.H.read(m, lng);
    }
    
    @e
    @Override
    public t0 timeout() {
        return this.K.timeout();
    }
}
