// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import okio.p0;
import kotlin.j2;
import java.security.cert.CertificateEncodingException;
import okio.n;
import java.security.cert.CertificateException;
import okio.m;
import java.util.ArrayList;
import java.security.cert.CertificateFactory;
import java.security.cert.Certificate;
import java.util.List;
import okhttp3.internal.platform.h;
import java.util.Collection;
import okio.p;
import kotlin.collections.j1;
import java.util.Comparator;
import java.util.TreeSet;
import kotlin.jvm.internal.p1;
import kotlin.text.s;
import java.util.Set;
import okio.r0;
import okio.v;
import okio.o;
import okhttp3.internal.cache.b;
import org.jetbrains.annotations.f;
import m6.g;
import kotlin.z0;
import kotlin.i;
import okio.d0;
import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.Objects;
import m6.k;
import java.io.IOException;
import okhttp3.internal.io.a;
import kotlin.jvm.internal.k0;
import java.io.File;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import okhttp3.internal.cache.d;
import kotlin.Metadata;
import java.io.Flushable;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0004&\u0007\u0018BB!\b\u0000\u0012\u0006\u0010C\u001a\u00020%\u0012\u0006\u0010G\u001a\u00020 \u0012\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KB\u0019\b\u0016\u0012\u0006\u0010C\u001a\u00020%\u0012\u0006\u0010G\u001a\u00020 ¢\u0006\u0004\bJ\u0010LJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004H\u0002J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u0006J\u0006\u0010\u0019\u001a\u00020\u0006J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020 J\u0006\u0010\"\u001a\u00020 J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\u000f\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0000¢\u0006\u0004\b,\u0010-J\u0006\u0010.\u001a\u00020\u001dJ\u0006\u0010/\u001a\u00020\u001dJ\u0006\u00100\u001a\u00020\u001dR\u0016\u00102\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00101R\"\u00107\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00101\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010;\u001a\u00020\u00048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00101R\u0013\u0010?\u001a\u00020>8F@\u0006¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00101R\u0013\u0010C\u001a\u00020%8G@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010'R\"\u0010F\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u00101\u001a\u0004\bD\u00104\"\u0004\bE\u00106¨\u0006N" }, d2 = { "Lokhttp3/c;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/cache/d$b;", "Lokhttp3/internal/cache/d;", "editor", "Lkotlin/j2;", "b", "Lokhttp3/e0;", "request", "Lokhttp3/g0;", "f", "(Lokhttp3/e0;)Lokhttp3/g0;", "response", "Lokhttp3/internal/cache/b;", "s", "(Lokhttp3/g0;)Lokhttp3/internal/cache/b;", "t", "(Lokhttp3/e0;)V", "cached", "network", "G", "(Lokhttp3/g0;Lokhttp3/g0;)V", "n", "c", "e", "", "", "H", "", "J", "K", "", "C", "q", "flush", "close", "Ljava/io/File;", "a", "()Ljava/io/File;", "Lokhttp3/internal/cache/c;", "cacheStrategy", "F", "(Lokhttp3/internal/cache/c;)V", "D", "()V", "r", "k", "w", "I", "networkCount", "h", "()I", "x", "(I)V", "writeAbortCount", "Lokhttp3/internal/cache/d;", "g", "()Lokhttp3/internal/cache/d;", "cache", "L", "requestCount", "", "isClosed", "()Z", "hitCount", "d", "directory", "j", "y", "writeSuccessCount", "maxSize", "Lokhttp3/internal/io/a;", "fileSystem", "<init>", "(Ljava/io/File;JLokhttp3/internal/io/a;)V", "(Ljava/io/File;J)V", "Q", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class c implements Closeable, Flushable
{
    private static final int M = 201105;
    private static final int N = 0;
    private static final int O = 1;
    private static final int P = 2;
    public static final b Q;
    @e
    private final okhttp3.internal.cache.d G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    
    static {
        Q = new b(null);
    }
    
    public c(@e final File file, final long n) {
        k0.p((Object)file, "directory");
        this(file, n, okhttp3.internal.io.a.a);
    }
    
    public c(@e final File file, final long n, @e final okhttp3.internal.io.a a) {
        k0.p((Object)file, "directory");
        k0.p((Object)a, "fileSystem");
        this.G = new okhttp3.internal.cache.d(a, file, 201105, 2, n, okhttp3.internal.concurrent.d.h);
    }
    
    private final void b(final okhttp3.internal.cache.d.b b) {
        if (b == null) {
            return;
        }
        try {
            b.a();
        }
        catch (IOException ex) {}
    }
    
    @k
    @e
    public static final String o(@e final okhttp3.w w) {
        return c.Q.b(w);
    }
    
    public final long C() throws IOException {
        return this.G.f0();
    }
    
    public final void D() {
        synchronized (this) {
            ++this.K;
        }
    }
    
    public final void F(@e final c c) {
        synchronized (this) {
            k0.p((Object)c, "cacheStrategy");
            ++this.L;
            if (c.b() != null) {
                ++this.J;
            }
            else if (c.a() != null) {
                ++this.K;
            }
        }
    }
    
    public final void G(@e g0 g0, @e final g0 g2) {
        k0.p((Object)g0, "cached");
        k0.p((Object)g2, "network");
        final c c = new c(g2);
        final h0 r = g0.r();
        Objects.requireNonNull(r, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        final okhttp3.internal.cache.d.d a = ((a)r).a();
        g0 = null;
        try {
            final Object a2 = a.a();
            if (a2 == null) {
                return;
            }
            g0 = (g0)a2;
            c.f((okhttp3.internal.cache.d.b)a2);
            g0 = (g0)a2;
            ((okhttp3.internal.cache.d.b)a2).b();
        }
        catch (IOException ex) {
            this.b((okhttp3.internal.cache.d.b)g0);
        }
    }
    
    @e
    public final Iterator<String> H() throws IOException {
        return new Iterator<String>() {
            private final Iterator<okhttp3.internal.cache.d.d> G = c.this.g().g0();
            private String H;
            private boolean I;
            
            @e
            public String a() {
                if (this.hasNext()) {
                    final String h = this.H;
                    k0.m((Object)h);
                    this.H = null;
                    this.I = true;
                    return h;
                }
                throw new NoSuchElementException();
            }
            
            @Override
            public boolean hasNext() {
                if (this.H != null) {
                    return true;
                }
                this.I = false;
                while (this.G.hasNext()) {
                    try {
                        final okhttp3.internal.cache.d.d d = this.G.next();
                        try {
                            this.H = d0.d(d.c(0)).e4();
                            kotlin.io.c.a((Closeable)d, (Throwable)null);
                            return true;
                        }
                        finally {
                            try {}
                            finally {
                                final Throwable t;
                                kotlin.io.c.a((Closeable)d, t);
                            }
                        }
                    }
                    catch (IOException ex) {
                        continue;
                    }
                    break;
                }
                return false;
            }
            
            @Override
            public void remove() {
                if (this.I) {
                    this.G.remove();
                    return;
                }
                throw new IllegalStateException("remove() before next()".toString());
            }
        };
    }
    
    public final int J() {
        synchronized (this) {
            return this.I;
        }
    }
    
    public final int K() {
        synchronized (this) {
            return this.H;
        }
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "directory", imports = {}))
    @g(name = "-deprecated_directory")
    @e
    public final File a() {
        return this.G.J();
    }
    
    public final void c() throws IOException {
        this.G.x();
    }
    
    @Override
    public void close() throws IOException {
        this.G.close();
    }
    
    @g(name = "directory")
    @e
    public final File d() {
        return this.G.J();
    }
    
    public final void e() throws IOException {
        this.G.F();
    }
    
    @f
    public final g0 f(@e final e0 e0) {
        k0.p((Object)e0, "request");
        final String b = c.Q.b(e0.q());
        try {
            Closeable closeable = this.G.G(b);
            if (closeable != null) {
                try {
                    final c c = new c(((okhttp3.internal.cache.d.d)closeable).c(0));
                    closeable = c.d((okhttp3.internal.cache.d.d)closeable);
                    if (!c.b(e0, (g0)closeable)) {
                        final h0 r = ((g0)closeable).r();
                        if (r != null) {
                            okhttp3.internal.d.l(r);
                        }
                        return null;
                    }
                    return (g0)closeable;
                }
                catch (IOException ex) {
                    okhttp3.internal.d.l(closeable);
                }
            }
            return null;
        }
        catch (IOException ex2) {
            return null;
        }
    }
    
    @Override
    public void flush() throws IOException {
        this.G.flush();
    }
    
    @e
    public final okhttp3.internal.cache.d g() {
        return this.G;
    }
    
    public final int h() {
        return this.I;
    }
    
    public final boolean isClosed() {
        return this.G.isClosed();
    }
    
    public final int j() {
        return this.H;
    }
    
    public final int k() {
        synchronized (this) {
            return this.K;
        }
    }
    
    public final void n() throws IOException {
        this.G.Q();
    }
    
    public final long q() {
        return this.G.M();
    }
    
    public final int r() {
        synchronized (this) {
            return this.J;
        }
    }
    
    @f
    public final okhttp3.internal.cache.b s(@e final g0 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "response"
        //     4: invokestatic    kotlin/jvm/internal/k0.p:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_1        
        //     8: invokevirtual   okhttp3/g0.W:()Lokhttp3/e0;
        //    11: invokevirtual   okhttp3/e0.m:()Ljava/lang/String;
        //    14: astore_2       
        //    15: getstatic       okhttp3/internal/http/f.a:Lokhttp3/internal/http/f;
        //    18: aload_1        
        //    19: invokevirtual   okhttp3/g0.W:()Lokhttp3/e0;
        //    22: invokevirtual   okhttp3/e0.m:()Ljava/lang/String;
        //    25: invokevirtual   okhttp3/internal/http/f.a:(Ljava/lang/String;)Z
        //    28: ifeq            41
        //    31: aload_0        
        //    32: aload_1        
        //    33: invokevirtual   okhttp3/g0.W:()Lokhttp3/e0;
        //    36: invokevirtual   okhttp3/c.t:(Lokhttp3/e0;)V
        //    39: aconst_null    
        //    40: areturn        
        //    41: aload_2        
        //    42: ldc_w           "GET"
        //    45: invokestatic    kotlin/jvm/internal/k0.g:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    48: iconst_1       
        //    49: ixor           
        //    50: ifeq            55
        //    53: aconst_null    
        //    54: areturn        
        //    55: getstatic       okhttp3/c.Q:Lokhttp3/c$b;
        //    58: astore_3       
        //    59: aload_3        
        //    60: aload_1        
        //    61: invokevirtual   okhttp3/c$b.a:(Lokhttp3/g0;)Z
        //    64: ifeq            69
        //    67: aconst_null    
        //    68: areturn        
        //    69: new             Lokhttp3/c$c;
        //    72: dup            
        //    73: aload_1        
        //    74: invokespecial   okhttp3/c$c.<init>:(Lokhttp3/g0;)V
        //    77: astore_2       
        //    78: aload_0        
        //    79: getfield        okhttp3/c.G:Lokhttp3/internal/cache/d;
        //    82: aload_3        
        //    83: aload_1        
        //    84: invokevirtual   okhttp3/g0.W:()Lokhttp3/e0;
        //    87: invokevirtual   okhttp3/e0.q:()Lokhttp3/w;
        //    90: invokevirtual   okhttp3/c$b.b:(Lokhttp3/w;)Ljava/lang/String;
        //    93: lconst_0       
        //    94: iconst_2       
        //    95: aconst_null    
        //    96: invokestatic    okhttp3/internal/cache/d.D:(Lokhttp3/internal/cache/d;Ljava/lang/String;JILjava/lang/Object;)Lokhttp3/internal/cache/d$b;
        //    99: astore_1       
        //   100: aload_1        
        //   101: ifnull          121
        //   104: aload_2        
        //   105: aload_1        
        //   106: invokevirtual   okhttp3/c$c.f:(Lokhttp3/internal/cache/d$b;)V
        //   109: new             Lokhttp3/c$d;
        //   112: dup            
        //   113: aload_0        
        //   114: aload_1        
        //   115: invokespecial   okhttp3/c$d.<init>:(Lokhttp3/c;Lokhttp3/internal/cache/d$b;)V
        //   118: astore_2       
        //   119: aload_2        
        //   120: areturn        
        //   121: aconst_null    
        //   122: areturn        
        //   123: astore_1       
        //   124: aconst_null    
        //   125: astore_1       
        //   126: aload_0        
        //   127: aload_1        
        //   128: invokespecial   okhttp3/c.b:(Lokhttp3/internal/cache/d$b;)V
        //   131: aconst_null    
        //   132: areturn        
        //   133: astore_1       
        //   134: goto            39
        //   137: astore_2       
        //   138: goto            126
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  31     39     133    137    Ljava/io/IOException;
        //  78     100    123    126    Ljava/io/IOException;
        //  104    119    137    141    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0121:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void t(@e final e0 e0) throws IOException {
        k0.p((Object)e0, "request");
        this.G.Y(c.Q.b(e0.q()));
    }
    
    public final int w() {
        synchronized (this) {
            return this.L;
        }
    }
    
    public final void x(final int i) {
        this.I = i;
    }
    
    public final void y(final int h) {
        this.H = h;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0015\u001a\u00060\u000fR\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001d\u0010\u0015\u001a\u00060\u000fR\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018" }, d2 = { "okhttp3/c$a", "Lokhttp3/h0;", "Lokhttp3/y;", "contentType", "", "contentLength", "Lokio/o;", "source", "G", "Lokio/o;", "bodySource", "", "J", "Ljava/lang/String;", "I", "Lokhttp3/internal/cache/d$d;", "Lokhttp3/internal/cache/d;", "H", "Lokhttp3/internal/cache/d$d;", "a", "()Lokhttp3/internal/cache/d$d;", "snapshot", "<init>", "(Lokhttp3/internal/cache/d$d;Ljava/lang/String;Ljava/lang/String;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    private static final class a extends h0
    {
        private final o G;
        @e
        private final okhttp3.internal.cache.d.d H;
        private final String I;
        private final String J;
        
        public a(@e final okhttp3.internal.cache.d.d h, @f final String i, @f final String j) {
            k0.p((Object)h, "snapshot");
            this.H = h;
            this.I = i;
            this.J = j;
            final r0 c = h.c(1);
            this.G = d0.d(new v(c) {
                final /* synthetic */ a G;
                
                @Override
                public void close() throws IOException {
                    this.G.a().close();
                    super.close();
                }
            });
        }
        
        @e
        public final okhttp3.internal.cache.d.d a() {
            return this.H;
        }
        
        @Override
        public long contentLength() {
            final String j = this.J;
            long e0 = -1L;
            if (j != null) {
                e0 = okhttp3.internal.d.e0(j, -1L);
            }
            return e0;
        }
        
        @f
        @Override
        public y contentType() {
            final String i = this.I;
            y d;
            if (i != null) {
                d = y.i.d(i);
            }
            else {
                d = null;
            }
            return d;
        }
        
        @e
        @Override
        public o source() {
            return this.G;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\n\u0010\u0018\u001a\u00020\u0016*\u00020\u0011J\n\u0010\u0019\u001a\u00020\u0002*\u00020\u0011R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006!" }, d2 = { "okhttp3/c$b", "", "Lokhttp3/v;", "", "", "d", "requestHeaders", "responseHeaders", "e", "Lokhttp3/w;", "url", "b", "Lokio/o;", "source", "", "c", "(Lokio/o;)I", "Lokhttp3/g0;", "cachedResponse", "cachedRequest", "Lokhttp3/e0;", "newRequest", "", "g", "a", "f", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
        
        private final Set<String> d(final okhttp3.v v) {
            final int size = v.size();
            Set<String> k = null;
            for (int i = 0; i < size; ++i) {
                if (s.K1("Vary", v.n(i), true)) {
                    final String v2 = v.v(i);
                    Set<String> set;
                    if ((set = k) == null) {
                        set = new TreeSet<String>(s.S1(p1.a));
                    }
                    final Iterator iterator = s.R4(v2, new char[] { ',' }, false, 0, 6, null).iterator();
                    while (true) {
                        k = set;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final String obj = iterator.next();
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                        set.add(s.B5(obj).toString());
                    }
                }
            }
            if (k == null) {
                k = (Set<String>)j1.k();
            }
            return k;
        }
        
        private final okhttp3.v e(final okhttp3.v v, final okhttp3.v v2) {
            final Set<String> d = this.d(v2);
            if (d.isEmpty()) {
                return okhttp3.internal.d.b;
            }
            final okhttp3.v.a a = new okhttp3.v.a();
            for (int i = 0; i < v.size(); ++i) {
                final String n = v.n(i);
                if (d.contains(n)) {
                    a.b(n, v.v(i));
                }
            }
            return a.i();
        }
        
        public final boolean a(@e final g0 g0) {
            k0.p((Object)g0, "$this$hasVaryAll");
            return this.d(g0.J()).contains("*");
        }
        
        @k
        @e
        public final String b(@e final okhttp3.w w) {
            k0.p((Object)w, "url");
            return p.L.l(w.toString()).q0().E();
        }
        
        public final int c(@e final o o) throws IOException {
            k0.p((Object)o, "source");
            try {
                final long b2 = o.b2();
                final String e4 = o.e4();
                if (b2 >= 0L && b2 <= Integer.MAX_VALUE && e4.length() <= 0) {
                    return (int)b2;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("expected an int but was \"");
                sb.append(b2);
                sb.append(e4);
                sb.append('\"');
                throw new IOException(sb.toString());
            }
            catch (NumberFormatException ex) {
                throw new IOException(ex.getMessage());
            }
        }
        
        @e
        public final okhttp3.v f(@e final g0 g0) {
            k0.p((Object)g0, "$this$varyHeaders");
            final g0 n = g0.N();
            k0.m((Object)n);
            return this.e(n.W().k(), g0.J());
        }
        
        public final boolean g(@e final g0 g0, @e final okhttp3.v v, @e final e0 e0) {
            k0.p((Object)g0, "cachedResponse");
            k0.p((Object)v, "cachedRequest");
            k0.p((Object)e0, "newRequest");
            final Set<String> d = this.d(g0.J());
            final boolean b = d instanceof Collection;
            final boolean b2 = true;
            boolean b3;
            if (b && d.isEmpty()) {
                b3 = b2;
            }
            else {
                final Iterator<Object> iterator = d.iterator();
                String s;
                do {
                    b3 = b2;
                    if (!iterator.hasNext()) {
                        return b3;
                    }
                    s = iterator.next();
                } while (!(k0.g((Object)v.w(s), (Object)e0.j(s)) ^ true));
                b3 = false;
            }
            return b3;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 ;2\u00020\u0001:\u0001!B\u0011\b\u0016\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b8\u0010:J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fR\u00020\rJ\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0016R\u00020\rR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00148B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010)R\u0016\u0010+\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0016\u0010/\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102¨\u0006<" }, d2 = { "okhttp3/c$c", "", "Lokio/o;", "source", "", "Ljava/security/cert/Certificate;", "c", "Lokio/n;", "sink", "certificates", "Lkotlin/j2;", "e", "Lokhttp3/internal/cache/d$b;", "Lokhttp3/internal/cache/d;", "editor", "f", "Lokhttp3/e0;", "request", "Lokhttp3/g0;", "response", "", "b", "Lokhttp3/internal/cache/d$d;", "snapshot", "d", "Lokhttp3/v;", "g", "Lokhttp3/v;", "responseHeaders", "Lokhttp3/d0;", "Lokhttp3/d0;", "protocol", "", "a", "Ljava/lang/String;", "url", "requestMethod", "Lokhttp3/u;", "h", "Lokhttp3/u;", "handshake", "()Z", "isHttps", "varyHeaders", "", "I", "code", "message", "", "j", "J", "receivedResponseMillis", "i", "sentRequestMillis", "Lokio/r0;", "rawSource", "<init>", "(Lokio/r0;)V", "(Lokhttp3/g0;)V", "m", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    private static final class c
    {
        private static final String k;
        private static final String l;
        public static final a m;
        private final String a;
        private final okhttp3.v b;
        private final String c;
        private final okhttp3.d0 d;
        private final int e;
        private final String f;
        private final okhttp3.v g;
        private final u h;
        private final long i;
        private final long j;
        
        static {
            m = new a(null);
            final StringBuilder sb = new StringBuilder();
            final h.a e = h.e;
            sb.append(e.g().i());
            sb.append("-Sent-Millis");
            k = sb.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(e.g().i());
            sb2.append("-Received-Millis");
            l = sb2.toString();
        }
        
        public c(@e final g0 g0) {
            k0.p((Object)g0, "response");
            this.a = g0.W().q().toString();
            this.b = okhttp3.c.Q.f(g0);
            this.c = g0.W().m();
            this.d = g0.T();
            this.e = g0.x();
            this.f = g0.M();
            this.g = g0.J();
            this.h = g0.C();
            this.i = g0.X();
            this.j = g0.V();
        }
        
        public c(@e final r0 r0) throws IOException {
            k0.p((Object)r0, "rawSource");
            try {
                final o d = d0.d(r0);
                this.a = d.e4();
                this.c = d.e4();
                final okhttp3.v.a a = new okhttp3.v.a();
                final int c = okhttp3.c.Q.c(d);
                final int n = 0;
                for (int i = 0; i < c; ++i) {
                    a.f(d.e4());
                }
                this.b = a.i();
                final okhttp3.internal.http.k b = okhttp3.internal.http.k.h.b(d.e4());
                this.d = b.a;
                this.e = b.b;
                this.f = b.c;
                final okhttp3.v.a a2 = new okhttp3.v.a();
                for (int c2 = okhttp3.c.Q.c(d), j = 0; j < c2; ++j) {
                    a2.f(d.e4());
                }
                final String k = okhttp3.c.c.k;
                final String l = a2.j(k);
                final String m = okhttp3.c.c.l;
                final String j2 = a2.j(m);
                a2.l(k);
                a2.l(m);
                final long n2 = 0L;
                long long1;
                if (l != null) {
                    long1 = Long.parseLong(l);
                }
                else {
                    long1 = 0L;
                }
                this.i = long1;
                long long2 = n2;
                if (j2 != null) {
                    long2 = Long.parseLong(j2);
                }
                this.j = long2;
                this.g = a2.i();
                u c5;
                if (this.a()) {
                    final String e4 = d.e4();
                    int n3 = n;
                    if (e4.length() > 0) {
                        n3 = 1;
                    }
                    if (n3 != 0) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("expected \"\" but was \"");
                        sb.append(e4);
                        sb.append('\"');
                        throw new IOException(sb.toString());
                    }
                    final okhttp3.i b2 = okhttp3.i.s1.b(d.e4());
                    final List<Certificate> c3 = this.c(d);
                    final List<Certificate> c4 = this.c(d);
                    j0 j3;
                    if (!d.D1()) {
                        j3 = j0.N.a(d.e4());
                    }
                    else {
                        j3 = j0.L;
                    }
                    c5 = u.e.c(j3, b2, c3, c4);
                }
                else {
                    c5 = null;
                }
                this.h = c5;
            }
            finally {
                r0.close();
            }
        }
        
        private final boolean a() {
            return s.u2(this.a, "https://", false, 2, null);
        }
        
        private final List<Certificate> c(final o o) throws IOException {
            final int c = okhttp3.c.Q.c(o);
            if (c == -1) {
                return (List<Certificate>)kotlin.collections.v.E();
            }
            try {
                final CertificateFactory instance = CertificateFactory.getInstance("X.509");
                final ArrayList list = new ArrayList<Certificate>(c);
                for (int i = 0; i < c; ++i) {
                    final String e4 = o.e4();
                    final m m = new m();
                    final p h = p.L.h(e4);
                    k0.m((Object)h);
                    m.p0(h);
                    list.add(instance.generateCertificate(m.N5()));
                }
                return (List<Certificate>)list;
            }
            catch (CertificateException ex) {
                throw new IOException(ex.getMessage());
            }
        }
        
        private final void e(final n n, final List<? extends Certificate> list) throws IOException {
            try {
                n.D5(list.size()).A(10);
                for (int i = 0; i < list.size(); ++i) {
                    final byte[] encoded = ((Certificate)list.get(i)).getEncoded();
                    final p.a l = p.L;
                    k0.o((Object)encoded, "bytes");
                    n.Q2(p.a.p(l, encoded, 0, 0, 3, null).g()).A(10);
                }
            }
            catch (CertificateEncodingException ex) {
                throw new IOException(ex.getMessage());
            }
        }
        
        public final boolean b(@e final e0 e0, @e final g0 g0) {
            k0.p((Object)e0, "request");
            k0.p((Object)g0, "response");
            return k0.g((Object)this.a, (Object)e0.q().toString()) && k0.g((Object)this.c, (Object)e0.m()) && okhttp3.c.Q.g(g0, this.b, e0);
        }
        
        @e
        public final g0 d(@e final okhttp3.internal.cache.d.d d) {
            k0.p((Object)d, "snapshot");
            return new g0.a().E(new e0.a().B(this.a).p(this.c, null).o(this.b).b()).B(this.d).g(this.e).y(this.f).w(this.g).b(new okhttp3.c.a(d, this.g.h("Content-Type"), this.g.h("Content-Length"))).u(this.h).F(this.i).C(this.j).c();
        }
        
        public final void f(@e okhttp3.internal.cache.d.b c) throws IOException {
            k0.p((Object)c, "editor");
            final int n = 0;
            c = (okhttp3.internal.cache.d.b)d0.c(c.f(0));
            try {
                ((n)c).Q2(this.a).A(10);
                ((n)c).Q2(this.c).A(10);
                ((n)c).D5(this.b.size()).A(10);
                for (int size = this.b.size(), i = 0; i < size; ++i) {
                    ((n)c).Q2(this.b.n(i)).Q2(": ").Q2(this.b.v(i)).A(10);
                }
                ((n)c).Q2(new okhttp3.internal.http.k(this.d, this.e, this.f).toString()).A(10);
                ((n)c).D5(this.g.size() + 2).A(10);
                for (int size2 = this.g.size(), j = n; j < size2; ++j) {
                    ((n)c).Q2(this.g.n(j)).Q2(": ").Q2(this.g.v(j)).A(10);
                }
                ((n)c).Q2(c.k).Q2(": ").D5(this.i).A(10);
                ((n)c).Q2(c.l).Q2(": ").D5(this.j).A(10);
                if (this.a()) {
                    ((n)c).A(10);
                    final u h = this.h;
                    k0.m((Object)h);
                    ((n)c).Q2(h.g().e()).A(10);
                    this.e((n)c, this.h.m());
                    this.e((n)c, this.h.k());
                    ((n)c).Q2(this.h.o().f()).A(10);
                }
                final j2 a = j2.a;
                kotlin.io.c.a((Closeable)c, (Throwable)null);
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    kotlin.io.c.a((Closeable)c, t);
                }
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b" }, d2 = { "okhttp3/c$c$a", "", "", "RECEIVED_MILLIS", "Ljava/lang/String;", "SENT_MILLIS", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
        public static final class a
        {
            private a() {
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u00060\u0006R\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\n\u001a\u00060\u0006R\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\"\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\b\u0010\u0012¨\u0006\u0016" }, d2 = { "okhttp3/c$d", "Lokhttp3/internal/cache/b;", "Lkotlin/j2;", "a", "Lokio/p0;", "body", "Lokhttp3/internal/cache/d$b;", "Lokhttp3/internal/cache/d;", "d", "Lokhttp3/internal/cache/d$b;", "editor", "Lokio/p0;", "cacheOut", "b", "", "c", "Z", "()Z", "(Z)V", "done", "<init>", "(Lokhttp3/c;Lokhttp3/internal/cache/d$b;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    private final class d implements b
    {
        private final p0 a;
        private final p0 b;
        private boolean c;
        private final okhttp3.internal.cache.d.b d;
        final /* synthetic */ c e;
        
        public d(final okhttp3.internal.cache.d.b d) {
            k0.p((Object)d, "editor");
            this.d = d;
            final p0 f = d.f(1);
            this.a = f;
            this.b = new okio.u(f) {
                final /* synthetic */ d H;
                
                @Override
                public void close() throws IOException {
                    synchronized (this.H.e) {
                        if (this.H.c()) {
                            return;
                        }
                        this.H.d(true);
                        final c e = this.H.e;
                        e.y(e.j() + 1);
                        // monitorexit(this.H.e)
                        super.close();
                        okhttp3.c.d.b(this.H).b();
                    }
                }
            };
        }
        
        public static final /* synthetic */ okhttp3.internal.cache.d.b b(final d d) {
            return d.d;
        }
        
        @Override
        public void a() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        okhttp3/c$d.e:Lokhttp3/c;
            //     4: astore_1       
            //     5: aload_1        
            //     6: monitorenter   
            //     7: aload_0        
            //     8: getfield        okhttp3/c$d.c:Z
            //    11: istore_2       
            //    12: iload_2        
            //    13: ifeq            19
            //    16: aload_1        
            //    17: monitorexit    
            //    18: return         
            //    19: aload_0        
            //    20: iconst_1       
            //    21: putfield        okhttp3/c$d.c:Z
            //    24: aload_0        
            //    25: getfield        okhttp3/c$d.e:Lokhttp3/c;
            //    28: astore_3       
            //    29: aload_3        
            //    30: aload_3        
            //    31: invokevirtual   okhttp3/c.h:()I
            //    34: iconst_1       
            //    35: iadd           
            //    36: invokevirtual   okhttp3/c.x:(I)V
            //    39: aload_1        
            //    40: monitorexit    
            //    41: aload_0        
            //    42: getfield        okhttp3/c$d.a:Lokio/p0;
            //    45: invokestatic    okhttp3/internal/d.l:(Ljava/io/Closeable;)V
            //    48: aload_0        
            //    49: getfield        okhttp3/c$d.d:Lokhttp3/internal/cache/d$b;
            //    52: invokevirtual   okhttp3/internal/cache/d$b.a:()V
            //    55: return         
            //    56: astore_3       
            //    57: aload_1        
            //    58: monitorexit    
            //    59: aload_3        
            //    60: athrow         
            //    61: astore_1       
            //    62: goto            55
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  7      12     56     61     Any
            //  19     39     56     61     Any
            //  48     55     61     65     Ljava/io/IOException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0055:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @e
        @Override
        public p0 body() {
            return this.b;
        }
        
        public final boolean c() {
            return this.c;
        }
        
        public final void d(final boolean c) {
            this.c = c;
        }
    }
}
