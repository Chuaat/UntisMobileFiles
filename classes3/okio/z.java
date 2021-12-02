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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001!B\u0019\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019B\u0019\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cB\u0019\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u001dB!\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u00020\t8G@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000b¨\u0006\"" }, d2 = { "Lokio/z;", "Lokio/u;", "Lokio/p0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/j2;", "t3", "Lokio/p;", "c", "()Lokio/p;", "Ljavax/crypto/Mac;", "I", "Ljavax/crypto/Mac;", "mac", "Ljava/security/MessageDigest;", "H", "Ljava/security/MessageDigest;", "messageDigest", "d", "hash", "sink", "digest", "<init>", "(Lokio/p0;Ljava/security/MessageDigest;)V", "", "algorithm", "(Lokio/p0;Ljava/lang/String;)V", "(Lokio/p0;Ljavax/crypto/Mac;)V", "key", "(Lokio/p0;Lokio/p;Ljava/lang/String;)V", "J", "a", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class z extends u implements p0
{
    @e
    public static final a J;
    private final MessageDigest H;
    private final Mac I;
    
    static {
        J = new a(null);
    }
    
    public z(@e final p0 p2, @e final String algorithm) {
        k0.p((Object)p2, "sink");
        k0.p((Object)algorithm, "algorithm");
        final MessageDigest instance = MessageDigest.getInstance(algorithm);
        k0.o((Object)instance, "MessageDigest.getInstance(algorithm)");
        this(p2, instance);
    }
    
    public z(@e final p0 p2, @e final MessageDigest h) {
        k0.p((Object)p2, "sink");
        k0.p((Object)h, "digest");
        super(p2);
        this.H = h;
        this.I = null;
    }
    
    public z(@e final p0 p2, @e final Mac i) {
        k0.p((Object)p2, "sink");
        k0.p((Object)i, "mac");
        super(p2);
        this.I = i;
        this.H = null;
    }
    
    public z(@e final p0 p3, @e final p p4, @e final String s) {
        k0.p((Object)p3, "sink");
        k0.p((Object)p4, "key");
        k0.p((Object)s, "algorithm");
        try {
            final Mac instance = Mac.getInstance(s);
            instance.init(new SecretKeySpec(p4.T0(), s));
            final j2 a = j2.a;
            k0.o((Object)instance, "try {\n      Mac.getInsta\u2026rgumentException(e)\n    }");
            this(p3, instance);
        }
        catch (InvalidKeyException cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    @k
    @e
    public static final z e(@e final p0 p2, @e final p p3) {
        return z.J.a(p2, p3);
    }
    
    @k
    @e
    public static final z f(@e final p0 p2, @e final p p3) {
        return z.J.b(p2, p3);
    }
    
    @k
    @e
    public static final z g(@e final p0 p2, @e final p p3) {
        return z.J.c(p2, p3);
    }
    
    @k
    @e
    public static final z h(@e final p0 p) {
        return z.J.d(p);
    }
    
    @k
    @e
    public static final z j(@e final p0 p) {
        return z.J.e(p);
    }
    
    @k
    @e
    public static final z k(@e final p0 p) {
        return z.J.f(p);
    }
    
    @k
    @e
    public static final z n(@e final p0 p) {
        return z.J.g(p);
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "hash", imports = {}))
    @g(name = "-deprecated_hash")
    @e
    public final p c() {
        return this.d();
    }
    
    @g(name = "hash")
    @e
    public final p d() {
        final MessageDigest h = this.H;
        byte[] array;
        if (h != null) {
            array = h.digest();
        }
        else {
            final Mac i = this.I;
            k0.m((Object)i);
            array = i.doFinal();
        }
        k0.o((Object)array, "result");
        return new p(array);
    }
    
    @Override
    public void t3(@e final m m, final long n) throws IOException {
        k0.p((Object)m, "source");
        j.e(m.h0(), 0L, n);
        m0 m2 = m.G;
        k0.m((Object)m2);
        long n2 = 0L;
        while (n2 < n) {
            final int n3 = (int)Math.min(n - n2, m2.c - m2.b);
            final MessageDigest h = this.H;
            if (h != null) {
                h.update(m2.a, m2.b, n3);
            }
            else {
                final Mac i = this.I;
                k0.m((Object)i);
                i.update(m2.a, m2.b, n3);
            }
            n2 += n3;
            m2 = m2.f;
            k0.m((Object)m2);
        }
        super.t3(m, n);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u0010" }, d2 = { "okio/z$a", "", "Lokio/p0;", "sink", "Lokio/z;", "d", "e", "f", "g", "Lokio/p;", "key", "a", "b", "c", "<init>", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final z a(@e final p0 p2, @e final p p3) {
            k0.p((Object)p2, "sink");
            k0.p((Object)p3, "key");
            return new z(p2, p3, "HmacSHA1");
        }
        
        @k
        @e
        public final z b(@e final p0 p2, @e final p p3) {
            k0.p((Object)p2, "sink");
            k0.p((Object)p3, "key");
            return new z(p2, p3, "HmacSHA256");
        }
        
        @k
        @e
        public final z c(@e final p0 p2, @e final p p3) {
            k0.p((Object)p2, "sink");
            k0.p((Object)p3, "key");
            return new z(p2, p3, "HmacSHA512");
        }
        
        @k
        @e
        public final z d(@e final p0 p) {
            k0.p((Object)p, "sink");
            return new z(p, "MD5");
        }
        
        @k
        @e
        public final z e(@e final p0 p) {
            k0.p((Object)p, "sink");
            return new z(p, "SHA-1");
        }
        
        @k
        @e
        public final z f(@e final p0 p) {
            k0.p((Object)p, "sink");
            return new z(p, "SHA-256");
        }
        
        @k
        @e
        public final z g(@e final p0 p) {
            k0.p((Object)p, "sink");
            return new z(p, "SHA-512");
        }
    }
}
