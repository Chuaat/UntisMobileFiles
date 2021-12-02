// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.IOException;
import m6.g;
import kotlin.z0;
import kotlin.i;
import m6.k;
import java.security.InvalidKeyException;
import kotlin.j2;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import javax.crypto.Mac;
import java.security.MessageDigest;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\tB\u0019\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bB\u0019\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u001cB!\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0013\u0010\u0010\u001a\u00020\b8G@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006 " }, d2 = { "Lokio/a0;", "Lokio/v;", "Lokio/r0;", "Lokio/m;", "sink", "", "byteCount", "read", "Lokio/p;", "a", "()Lokio/p;", "Ljavax/crypto/Mac;", "H", "Ljavax/crypto/Mac;", "mac", "b", "hash", "Ljava/security/MessageDigest;", "G", "Ljava/security/MessageDigest;", "messageDigest", "source", "digest", "<init>", "(Lokio/r0;Ljava/security/MessageDigest;)V", "", "algorithm", "(Lokio/r0;Ljava/lang/String;)V", "(Lokio/r0;Ljavax/crypto/Mac;)V", "key", "(Lokio/r0;Lokio/p;Ljava/lang/String;)V", "I", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class a0 extends v implements r0
{
    @e
    public static final a I;
    private final MessageDigest G;
    private final Mac H;
    
    static {
        I = new a(null);
    }
    
    public a0(@e final r0 r0, @e final String algorithm) {
        k0.p((Object)r0, "source");
        k0.p((Object)algorithm, "algorithm");
        final MessageDigest instance = MessageDigest.getInstance(algorithm);
        k0.o((Object)instance, "MessageDigest.getInstance(algorithm)");
        this(r0, instance);
    }
    
    public a0(@e final r0 r0, @e final MessageDigest g) {
        k0.p((Object)r0, "source");
        k0.p((Object)g, "digest");
        super(r0);
        this.G = g;
        this.H = null;
    }
    
    public a0(@e final r0 r0, @e final Mac h) {
        k0.p((Object)r0, "source");
        k0.p((Object)h, "mac");
        super(r0);
        this.H = h;
        this.G = null;
    }
    
    public a0(@e final r0 r0, @e final p p3, @e final String s) {
        k0.p((Object)r0, "source");
        k0.p((Object)p3, "key");
        k0.p((Object)s, "algorithm");
        try {
            final Mac instance = Mac.getInstance(s);
            instance.init(new SecretKeySpec(p3.T0(), s));
            final j2 a = j2.a;
            k0.o((Object)instance, "try {\n      Mac.getInsta\u2026rgumentException(e)\n    }");
            this(r0, instance);
        }
        catch (InvalidKeyException cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    @k
    @e
    public static final a0 c(@e final r0 r0, @e final p p2) {
        return a0.I.a(r0, p2);
    }
    
    @k
    @e
    public static final a0 d(@e final r0 r0, @e final p p2) {
        return a0.I.b(r0, p2);
    }
    
    @k
    @e
    public static final a0 e(@e final r0 r0, @e final p p2) {
        return a0.I.c(r0, p2);
    }
    
    @k
    @e
    public static final a0 f(@e final r0 r0) {
        return a0.I.d(r0);
    }
    
    @k
    @e
    public static final a0 g(@e final r0 r0) {
        return a0.I.e(r0);
    }
    
    @k
    @e
    public static final a0 h(@e final r0 r0) {
        return a0.I.f(r0);
    }
    
    @k
    @e
    public static final a0 j(@e final r0 r0) {
        return a0.I.g(r0);
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "hash", imports = {}))
    @g(name = "-deprecated_hash")
    @e
    public final p a() {
        return this.b();
    }
    
    @g(name = "hash")
    @e
    public final p b() {
        final MessageDigest g = this.G;
        byte[] array;
        if (g != null) {
            array = g.digest();
        }
        else {
            final Mac h = this.H;
            k0.m((Object)h);
            array = h.doFinal();
        }
        k0.o((Object)array, "result");
        return new p(array);
    }
    
    @Override
    public long read(@e final m m, long h0) throws IOException {
        k0.p((Object)m, "sink");
        final long read = super.read(m, h0);
        if (read != -1L) {
            final long n = m.h0() - read;
            h0 = m.h0();
            m0 m2 = m.G;
            k0.m((Object)m2);
            long n2;
            long n3;
            m0 f;
            while (true) {
                n2 = n;
                n3 = h0;
                f = m2;
                if (h0 <= n) {
                    break;
                }
                m2 = m2.g;
                k0.m((Object)m2);
                h0 -= m2.c - m2.b;
            }
            while (n3 < m.h0()) {
                final int n4 = (int)(f.b + n2 - n3);
                final MessageDigest g = this.G;
                if (g != null) {
                    g.update(f.a, n4, f.c - n4);
                }
                else {
                    final Mac h2 = this.H;
                    k0.m((Object)h2);
                    h2.update(f.a, n4, f.c - n4);
                }
                n3 += f.c - f.b;
                f = f.f;
                k0.m((Object)f);
                n2 = n3;
            }
        }
        return read;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u0010" }, d2 = { "okio/a0$a", "", "Lokio/r0;", "source", "Lokio/a0;", "d", "e", "f", "g", "Lokio/p;", "key", "a", "b", "c", "<init>", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final a0 a(@e final r0 r0, @e final p p2) {
            k0.p((Object)r0, "source");
            k0.p((Object)p2, "key");
            return new a0(r0, p2, "HmacSHA1");
        }
        
        @k
        @e
        public final a0 b(@e final r0 r0, @e final p p2) {
            k0.p((Object)r0, "source");
            k0.p((Object)p2, "key");
            return new a0(r0, p2, "HmacSHA256");
        }
        
        @k
        @e
        public final a0 c(@e final r0 r0, @e final p p2) {
            k0.p((Object)r0, "source");
            k0.p((Object)p2, "key");
            return new a0(r0, p2, "HmacSHA512");
        }
        
        @k
        @e
        public final a0 d(@e final r0 r0) {
            k0.p((Object)r0, "source");
            return new a0(r0, "MD5");
        }
        
        @k
        @e
        public final a0 e(@e final r0 r0) {
            k0.p((Object)r0, "source");
            return new a0(r0, "SHA-1");
        }
        
        @k
        @e
        public final a0 f(@e final r0 r0) {
            k0.p((Object)r0, "source");
            return new a0(r0, "SHA-256");
        }
        
        @k
        @e
        public final a0 g(@e final r0 r0) {
            k0.p((Object)r0, "source");
            return new a0(r0, "SHA-512");
        }
    }
}
