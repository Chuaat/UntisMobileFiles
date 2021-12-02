// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.cache;

import kotlin.text.s;
import okhttp3.v;
import okio.p0;
import okhttp3.h0;
import okhttp3.internal.http.h;
import okio.t0;
import org.jetbrains.annotations.e;
import okio.m;
import java.io.IOException;
import okhttp3.internal.d;
import java.util.concurrent.TimeUnit;
import okio.n;
import okio.o;
import okio.r0;
import okio.d0;
import kotlin.jvm.internal.k0;
import okhttp3.g0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import okhttp3.c;
import kotlin.Metadata;
import okhttp3.x;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0012" }, d2 = { "Lokhttp3/internal/cache/a;", "Lokhttp3/x;", "Lokhttp3/internal/cache/b;", "cacheRequest", "Lokhttp3/g0;", "response", "a", "Lokhttp3/x$a;", "chain", "intercept", "Lokhttp3/c;", "b", "Lokhttp3/c;", "()Lokhttp3/c;", "cache", "<init>", "(Lokhttp3/c;)V", "c", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class a implements x
{
    public static final a c;
    @f
    private final c b;
    
    static {
        c = new a(null);
    }
    
    public a(@f final c b) {
        this.b = b;
    }
    
    private final g0 a(final okhttp3.internal.cache.b b, final g0 g0) throws IOException {
        if (b == null) {
            return g0;
        }
        final p0 body = b.body();
        final h0 r = g0.r();
        k0.m((Object)r);
        return g0.Q().b(new h(g0.G(g0, "Content-Type", null, 2, null), g0.r().contentLength(), d0.d(new r0() {
            private boolean G;
            final /* synthetic */ o H = r.source();
            final /* synthetic */ n J = d0.c(body);
            
            @Override
            public void close() throws IOException {
                if (!this.G && !d.t(this, 100, TimeUnit.MILLISECONDS)) {
                    this.G = true;
                    b.a();
                }
                this.H.close();
            }
            
            @Override
            public long read(@e final m m, long read) throws IOException {
                k0.p((Object)m, "sink");
                try {
                    read = this.H.read(m, read);
                    if (read == -1L) {
                        if (!this.G) {
                            this.G = true;
                            this.J.close();
                        }
                        return -1L;
                    }
                    m.s(this.J.z(), m.h0() - read, read);
                    this.J.a2();
                    return read;
                }
                catch (IOException ex) {
                    if (!this.G) {
                        this.G = true;
                        b.a();
                    }
                    throw ex;
                }
            }
            
            @e
            @Override
            public t0 timeout() {
                return this.H.timeout();
            }
        }))).c();
    }
    
    @f
    public final c b() {
        return this.b;
    }
    
    @e
    @Override
    public g0 intercept(@e final x.a p0) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "chain"
        //     3: invokestatic    kotlin/jvm/internal/k0.p:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1        
        //     7: invokeinterface okhttp3/x$a.call:()Lokhttp3/e;
        //    12: astore_2       
        //    13: aload_0        
        //    14: getfield        okhttp3/internal/cache/a.b:Lokhttp3/c;
        //    17: astore_3       
        //    18: aconst_null    
        //    19: astore          4
        //    21: aload_3        
        //    22: ifnull          39
        //    25: aload_3        
        //    26: aload_1        
        //    27: invokeinterface okhttp3/x$a.k:()Lokhttp3/e0;
        //    32: invokevirtual   okhttp3/c.f:(Lokhttp3/e0;)Lokhttp3/g0;
        //    35: astore_3       
        //    36: goto            41
        //    39: aconst_null    
        //    40: astore_3       
        //    41: new             Lokhttp3/internal/cache/c$b;
        //    44: dup            
        //    45: invokestatic    java/lang/System.currentTimeMillis:()J
        //    48: aload_1        
        //    49: invokeinterface okhttp3/x$a.k:()Lokhttp3/e0;
        //    54: aload_3        
        //    55: invokespecial   okhttp3/internal/cache/c$b.<init>:(JLokhttp3/e0;Lokhttp3/g0;)V
        //    58: invokevirtual   okhttp3/internal/cache/c$b.b:()Lokhttp3/internal/cache/c;
        //    61: astore          5
        //    63: aload           5
        //    65: invokevirtual   okhttp3/internal/cache/c.b:()Lokhttp3/e0;
        //    68: astore          6
        //    70: aload           5
        //    72: invokevirtual   okhttp3/internal/cache/c.a:()Lokhttp3/g0;
        //    75: astore          7
        //    77: aload_0        
        //    78: getfield        okhttp3/internal/cache/a.b:Lokhttp3/c;
        //    81: astore          8
        //    83: aload           8
        //    85: ifnull          95
        //    88: aload           8
        //    90: aload           5
        //    92: invokevirtual   okhttp3/c.F:(Lokhttp3/internal/cache/c;)V
        //    95: aload_2        
        //    96: instanceof      Lokhttp3/internal/connection/e;
        //    99: ifne            105
        //   102: goto            108
        //   105: aload_2        
        //   106: astore          4
        //   108: aload           4
        //   110: checkcast       Lokhttp3/internal/connection/e;
        //   113: astore          4
        //   115: aload           4
        //   117: ifnull          135
        //   120: aload           4
        //   122: invokevirtual   okhttp3/internal/connection/e.r:()Lokhttp3/s;
        //   125: astore          4
        //   127: aload           4
        //   129: ifnull          135
        //   132: goto            140
        //   135: getstatic       okhttp3/s.a:Lokhttp3/s;
        //   138: astore          4
        //   140: aload_3        
        //   141: ifnull          165
        //   144: aload           7
        //   146: ifnonnull       165
        //   149: aload_3        
        //   150: invokevirtual   okhttp3/g0.r:()Lokhttp3/h0;
        //   153: astore          8
        //   155: aload           8
        //   157: ifnull          165
        //   160: aload           8
        //   162: invokestatic    okhttp3/internal/d.l:(Ljava/io/Closeable;)V
        //   165: aload           6
        //   167: ifnonnull       239
        //   170: aload           7
        //   172: ifnonnull       239
        //   175: new             Lokhttp3/g0$a;
        //   178: dup            
        //   179: invokespecial   okhttp3/g0$a.<init>:()V
        //   182: aload_1        
        //   183: invokeinterface okhttp3/x$a.k:()Lokhttp3/e0;
        //   188: invokevirtual   okhttp3/g0$a.E:(Lokhttp3/e0;)Lokhttp3/g0$a;
        //   191: getstatic       okhttp3/d0.I:Lokhttp3/d0;
        //   194: invokevirtual   okhttp3/g0$a.B:(Lokhttp3/d0;)Lokhttp3/g0$a;
        //   197: sipush          504
        //   200: invokevirtual   okhttp3/g0$a.g:(I)Lokhttp3/g0$a;
        //   203: ldc             "Unsatisfiable Request (only-if-cached)"
        //   205: invokevirtual   okhttp3/g0$a.y:(Ljava/lang/String;)Lokhttp3/g0$a;
        //   208: getstatic       okhttp3/internal/d.c:Lokhttp3/h0;
        //   211: invokevirtual   okhttp3/g0$a.b:(Lokhttp3/h0;)Lokhttp3/g0$a;
        //   214: ldc2_w          -1
        //   217: invokevirtual   okhttp3/g0$a.F:(J)Lokhttp3/g0$a;
        //   220: invokestatic    java/lang/System.currentTimeMillis:()J
        //   223: invokevirtual   okhttp3/g0$a.C:(J)Lokhttp3/g0$a;
        //   226: invokevirtual   okhttp3/g0$a.c:()Lokhttp3/g0;
        //   229: astore_1       
        //   230: aload           4
        //   232: aload_2        
        //   233: aload_1        
        //   234: invokevirtual   okhttp3/s.A:(Lokhttp3/e;Lokhttp3/g0;)V
        //   237: aload_1        
        //   238: areturn        
        //   239: aload           6
        //   241: ifnonnull       278
        //   244: aload           7
        //   246: invokestatic    kotlin/jvm/internal/k0.m:(Ljava/lang/Object;)V
        //   249: aload           7
        //   251: invokevirtual   okhttp3/g0.Q:()Lokhttp3/g0$a;
        //   254: getstatic       okhttp3/internal/cache/a.c:Lokhttp3/internal/cache/a$a;
        //   257: aload           7
        //   259: invokestatic    okhttp3/internal/cache/a$a.b:(Lokhttp3/internal/cache/a$a;Lokhttp3/g0;)Lokhttp3/g0;
        //   262: invokevirtual   okhttp3/g0$a.d:(Lokhttp3/g0;)Lokhttp3/g0$a;
        //   265: invokevirtual   okhttp3/g0$a.c:()Lokhttp3/g0;
        //   268: astore_1       
        //   269: aload           4
        //   271: aload_2        
        //   272: aload_1        
        //   273: invokevirtual   okhttp3/s.b:(Lokhttp3/e;Lokhttp3/g0;)V
        //   276: aload_1        
        //   277: areturn        
        //   278: aload           7
        //   280: ifnull          294
        //   283: aload           4
        //   285: aload_2        
        //   286: aload           7
        //   288: invokevirtual   okhttp3/s.a:(Lokhttp3/e;Lokhttp3/g0;)V
        //   291: goto            307
        //   294: aload_0        
        //   295: getfield        okhttp3/internal/cache/a.b:Lokhttp3/c;
        //   298: ifnull          307
        //   301: aload           4
        //   303: aload_2        
        //   304: invokevirtual   okhttp3/s.c:(Lokhttp3/e;)V
        //   307: aload_1        
        //   308: aload           6
        //   310: invokeinterface okhttp3/x$a.e:(Lokhttp3/e0;)Lokhttp3/g0;
        //   315: astore_1       
        //   316: aload_1        
        //   317: ifnonnull       337
        //   320: aload_3        
        //   321: ifnull          337
        //   324: aload_3        
        //   325: invokevirtual   okhttp3/g0.r:()Lokhttp3/h0;
        //   328: astore_3       
        //   329: aload_3        
        //   330: ifnull          337
        //   333: aload_3        
        //   334: invokestatic    okhttp3/internal/d.l:(Ljava/io/Closeable;)V
        //   337: aload           7
        //   339: ifnull          481
        //   342: aload_1        
        //   343: ifnull          467
        //   346: aload_1        
        //   347: invokevirtual   okhttp3/g0.x:()I
        //   350: sipush          304
        //   353: if_icmpne       467
        //   356: aload           7
        //   358: invokevirtual   okhttp3/g0.Q:()Lokhttp3/g0$a;
        //   361: astore_3       
        //   362: getstatic       okhttp3/internal/cache/a.c:Lokhttp3/internal/cache/a$a;
        //   365: astore          6
        //   367: aload_3        
        //   368: aload           6
        //   370: aload           7
        //   372: invokevirtual   okhttp3/g0.J:()Lokhttp3/v;
        //   375: aload_1        
        //   376: invokevirtual   okhttp3/g0.J:()Lokhttp3/v;
        //   379: invokestatic    okhttp3/internal/cache/a$a.a:(Lokhttp3/internal/cache/a$a;Lokhttp3/v;Lokhttp3/v;)Lokhttp3/v;
        //   382: invokevirtual   okhttp3/g0$a.w:(Lokhttp3/v;)Lokhttp3/g0$a;
        //   385: aload_1        
        //   386: invokevirtual   okhttp3/g0.X:()J
        //   389: invokevirtual   okhttp3/g0$a.F:(J)Lokhttp3/g0$a;
        //   392: aload_1        
        //   393: invokevirtual   okhttp3/g0.V:()J
        //   396: invokevirtual   okhttp3/g0$a.C:(J)Lokhttp3/g0$a;
        //   399: aload           6
        //   401: aload           7
        //   403: invokestatic    okhttp3/internal/cache/a$a.b:(Lokhttp3/internal/cache/a$a;Lokhttp3/g0;)Lokhttp3/g0;
        //   406: invokevirtual   okhttp3/g0$a.d:(Lokhttp3/g0;)Lokhttp3/g0$a;
        //   409: aload           6
        //   411: aload_1        
        //   412: invokestatic    okhttp3/internal/cache/a$a.b:(Lokhttp3/internal/cache/a$a;Lokhttp3/g0;)Lokhttp3/g0;
        //   415: invokevirtual   okhttp3/g0$a.z:(Lokhttp3/g0;)Lokhttp3/g0$a;
        //   418: invokevirtual   okhttp3/g0$a.c:()Lokhttp3/g0;
        //   421: astore_3       
        //   422: aload_1        
        //   423: invokevirtual   okhttp3/g0.r:()Lokhttp3/h0;
        //   426: astore_1       
        //   427: aload_1        
        //   428: invokestatic    kotlin/jvm/internal/k0.m:(Ljava/lang/Object;)V
        //   431: aload_1        
        //   432: invokevirtual   okhttp3/h0.close:()V
        //   435: aload_0        
        //   436: getfield        okhttp3/internal/cache/a.b:Lokhttp3/c;
        //   439: astore_1       
        //   440: aload_1        
        //   441: invokestatic    kotlin/jvm/internal/k0.m:(Ljava/lang/Object;)V
        //   444: aload_1        
        //   445: invokevirtual   okhttp3/c.D:()V
        //   448: aload_0        
        //   449: getfield        okhttp3/internal/cache/a.b:Lokhttp3/c;
        //   452: aload           7
        //   454: aload_3        
        //   455: invokevirtual   okhttp3/c.G:(Lokhttp3/g0;Lokhttp3/g0;)V
        //   458: aload           4
        //   460: aload_2        
        //   461: aload_3        
        //   462: invokevirtual   okhttp3/s.b:(Lokhttp3/e;Lokhttp3/g0;)V
        //   465: aload_3        
        //   466: areturn        
        //   467: aload           7
        //   469: invokevirtual   okhttp3/g0.r:()Lokhttp3/h0;
        //   472: astore_3       
        //   473: aload_3        
        //   474: ifnull          481
        //   477: aload_3        
        //   478: invokestatic    okhttp3/internal/d.l:(Ljava/io/Closeable;)V
        //   481: aload_1        
        //   482: invokestatic    kotlin/jvm/internal/k0.m:(Ljava/lang/Object;)V
        //   485: aload_1        
        //   486: invokevirtual   okhttp3/g0.Q:()Lokhttp3/g0$a;
        //   489: astore          8
        //   491: getstatic       okhttp3/internal/cache/a.c:Lokhttp3/internal/cache/a$a;
        //   494: astore_3       
        //   495: aload           8
        //   497: aload_3        
        //   498: aload           7
        //   500: invokestatic    okhttp3/internal/cache/a$a.b:(Lokhttp3/internal/cache/a$a;Lokhttp3/g0;)Lokhttp3/g0;
        //   503: invokevirtual   okhttp3/g0$a.d:(Lokhttp3/g0;)Lokhttp3/g0$a;
        //   506: aload_3        
        //   507: aload_1        
        //   508: invokestatic    okhttp3/internal/cache/a$a.b:(Lokhttp3/internal/cache/a$a;Lokhttp3/g0;)Lokhttp3/g0;
        //   511: invokevirtual   okhttp3/g0$a.z:(Lokhttp3/g0;)Lokhttp3/g0$a;
        //   514: invokevirtual   okhttp3/g0$a.c:()Lokhttp3/g0;
        //   517: astore_1       
        //   518: aload_0        
        //   519: getfield        okhttp3/internal/cache/a.b:Lokhttp3/c;
        //   522: ifnull          594
        //   525: aload_1        
        //   526: invokestatic    okhttp3/internal/http/e.c:(Lokhttp3/g0;)Z
        //   529: ifeq            571
        //   532: getstatic       okhttp3/internal/cache/c.c:Lokhttp3/internal/cache/c$a;
        //   535: aload_1        
        //   536: aload           6
        //   538: invokevirtual   okhttp3/internal/cache/c$a.a:(Lokhttp3/g0;Lokhttp3/e0;)Z
        //   541: ifeq            571
        //   544: aload_0        
        //   545: aload_0        
        //   546: getfield        okhttp3/internal/cache/a.b:Lokhttp3/c;
        //   549: aload_1        
        //   550: invokevirtual   okhttp3/c.s:(Lokhttp3/g0;)Lokhttp3/internal/cache/b;
        //   553: aload_1        
        //   554: invokespecial   okhttp3/internal/cache/a.a:(Lokhttp3/internal/cache/b;Lokhttp3/g0;)Lokhttp3/g0;
        //   557: astore_1       
        //   558: aload           7
        //   560: ifnull          569
        //   563: aload           4
        //   565: aload_2        
        //   566: invokevirtual   okhttp3/s.c:(Lokhttp3/e;)V
        //   569: aload_1        
        //   570: areturn        
        //   571: getstatic       okhttp3/internal/http/f.a:Lokhttp3/internal/http/f;
        //   574: aload           6
        //   576: invokevirtual   okhttp3/e0.m:()Ljava/lang/String;
        //   579: invokevirtual   okhttp3/internal/http/f.a:(Ljava/lang/String;)Z
        //   582: ifeq            594
        //   585: aload_0        
        //   586: getfield        okhttp3/internal/cache/a.b:Lokhttp3/c;
        //   589: aload           6
        //   591: invokevirtual   okhttp3/c.t:(Lokhttp3/e0;)V
        //   594: aload_1        
        //   595: areturn        
        //   596: astore_1       
        //   597: aload_3        
        //   598: ifnull          617
        //   601: aload_3        
        //   602: invokevirtual   okhttp3/g0.r:()Lokhttp3/h0;
        //   605: astore          4
        //   607: aload           4
        //   609: ifnull          617
        //   612: aload           4
        //   614: invokestatic    okhttp3/internal/d.l:(Ljava/io/Closeable;)V
        //   617: aload_1        
        //   618: athrow         
        //   619: astore          4
        //   621: goto            594
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  307    316    596    619    Any
        //  585    594    619    624    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0594:
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
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u0010" }, d2 = { "okhttp3/internal/cache/a$a", "", "Lokhttp3/g0;", "response", "f", "Lokhttp3/v;", "cachedHeaders", "networkHeaders", "c", "", "fieldName", "", "e", "d", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        private final v c(final v v, final v v2) {
            final v.a a = new v.a();
            final int size = v.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                final String n2 = v.n(i);
                final String v3 = v.v(i);
                if (!s.K1("Warning", n2, true) || !s.u2(v3, "1", false, 2, null)) {
                    if (this.d(n2) || !this.e(n2) || v2.h(n2) == null) {
                        a.g(n2, v3);
                    }
                }
            }
            for (int size2 = v2.size(), j = n; j < size2; ++j) {
                final String n3 = v2.n(j);
                if (!this.d(n3) && this.e(n3)) {
                    a.g(n3, v2.v(j));
                }
            }
            return a.i();
        }
        
        private final boolean d(final String s) {
            boolean b2;
            final boolean b = b2 = true;
            if (!s.K1("Content-Length", s, true)) {
                b2 = b;
                if (!s.K1("Content-Encoding", s, true)) {
                    b2 = (s.K1("Content-Type", s, true) && b);
                }
            }
            return b2;
        }
        
        private final boolean e(final String s) {
            boolean b = true;
            if (s.K1("Connection", s, true) || s.K1("Keep-Alive", s, true) || s.K1("Proxy-Authenticate", s, true) || s.K1("Proxy-Authorization", s, true) || s.K1("TE", s, true) || s.K1("Trailers", s, true) || s.K1("Transfer-Encoding", s, true) || s.K1("Upgrade", s, true)) {
                b = false;
            }
            return b;
        }
        
        private final g0 f(final g0 g0) {
            h0 r;
            if (g0 != null) {
                r = g0.r();
            }
            else {
                r = null;
            }
            g0 c = g0;
            if (r != null) {
                c = g0.Q().b(null).c();
            }
            return c;
        }
    }
}
