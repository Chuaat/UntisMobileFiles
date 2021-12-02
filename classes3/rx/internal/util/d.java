// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import rx.i;
import java.util.concurrent.atomic.AtomicLong;

public final class d extends AtomicLong implements i
{
    private static final long K = 2826241102729529449L;
    boolean G;
    volatile boolean H;
    Throwable I;
    final a J;
    
    public d(final a j) {
        this.J = j;
    }
    
    public void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        rx/internal/util/d.G:Z
        //     6: ifeq            12
        //     9: aload_0        
        //    10: monitorexit    
        //    11: return         
        //    12: iconst_1       
        //    13: istore_1       
        //    14: iconst_1       
        //    15: istore_2       
        //    16: aload_0        
        //    17: iconst_1       
        //    18: putfield        rx/internal/util/d.G:Z
        //    21: aload_0        
        //    22: getfield        rx/internal/util/d.H:Z
        //    25: istore_3       
        //    26: aload_0        
        //    27: monitorexit    
        //    28: aload_0        
        //    29: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //    32: lstore          4
        //    34: aload_0        
        //    35: getfield        rx/internal/util/d.J:Lrx/internal/util/d$a;
        //    38: astore          6
        //    40: iconst_0       
        //    41: istore          7
        //    43: lload           4
        //    45: lconst_0       
        //    46: lcmp           
        //    47: istore          8
        //    49: iload           8
        //    51: ifgt            58
        //    54: iload_3        
        //    55: ifeq            118
        //    58: iload_3        
        //    59: ifeq            104
        //    62: aload           6
        //    64: invokeinterface rx/internal/util/d$a.peek:()Ljava/lang/Object;
        //    69: astore          9
        //    71: aload           9
        //    73: ifnonnull       96
        //    76: iload_2        
        //    77: istore          7
        //    79: aload           6
        //    81: aload_0        
        //    82: getfield        rx/internal/util/d.I:Ljava/lang/Throwable;
        //    85: invokeinterface rx/internal/util/d$a.q:(Ljava/lang/Throwable;)V
        //    90: return         
        //    91: astore          6
        //    93: goto            304
        //    96: iload           8
        //    98: ifne            104
        //   101: goto            118
        //   104: aload           6
        //   106: invokeinterface rx/internal/util/d$a.poll:()Ljava/lang/Object;
        //   111: astore          9
        //   113: aload           9
        //   115: ifnonnull       270
        //   118: aload_0        
        //   119: monitorenter   
        //   120: aload_0        
        //   121: getfield        rx/internal/util/d.H:Z
        //   124: istore_3       
        //   125: aload           6
        //   127: invokeinterface rx/internal/util/d$a.peek:()Ljava/lang/Object;
        //   132: ifnull          141
        //   135: iconst_1       
        //   136: istore          8
        //   138: goto            144
        //   141: iconst_0       
        //   142: istore          8
        //   144: aload_0        
        //   145: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   148: lstore          4
        //   150: lload           4
        //   152: ldc2_w          9223372036854775807
        //   155: lcmp           
        //   156: ifne            190
        //   159: iload           8
        //   161: ifne            182
        //   164: iload_3        
        //   165: ifne            182
        //   168: iload_1        
        //   169: istore          8
        //   171: aload_0        
        //   172: iconst_0       
        //   173: putfield        rx/internal/util/d.G:Z
        //   176: iload_1        
        //   177: istore          8
        //   179: aload_0        
        //   180: monitorexit    
        //   181: return         
        //   182: ldc2_w          9223372036854775807
        //   185: lstore          4
        //   187: goto            228
        //   190: iload           7
        //   192: ineg           
        //   193: i2l            
        //   194: lstore          4
        //   196: aload_0        
        //   197: lload           4
        //   199: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   202: lstore          4
        //   204: lload           4
        //   206: lconst_0       
        //   207: lcmp           
        //   208: ifeq            216
        //   211: iload           8
        //   213: ifne            228
        //   216: iload_3        
        //   217: ifeq            233
        //   220: iload           8
        //   222: ifeq            228
        //   225: goto            233
        //   228: aload_0        
        //   229: monitorexit    
        //   230: goto            40
        //   233: iload_1        
        //   234: istore          8
        //   236: aload_0        
        //   237: iconst_0       
        //   238: putfield        rx/internal/util/d.G:Z
        //   241: iload_1        
        //   242: istore          8
        //   244: aload_0        
        //   245: monitorexit    
        //   246: return         
        //   247: astore          6
        //   249: iconst_0       
        //   250: istore          7
        //   252: iload           7
        //   254: istore          8
        //   256: aload_0        
        //   257: monitorexit    
        //   258: aload           6
        //   260: athrow         
        //   261: astore          6
        //   263: iload           8
        //   265: istore          7
        //   267: goto            252
        //   270: aload           6
        //   272: aload           9
        //   274: invokeinterface rx/internal/util/d$a.accept:(Ljava/lang/Object;)Z
        //   279: istore          10
        //   281: iload           10
        //   283: ifeq            287
        //   286: return         
        //   287: lload           4
        //   289: lconst_1       
        //   290: lsub           
        //   291: lstore          4
        //   293: iinc            7, 1
        //   296: goto            43
        //   299: astore          6
        //   301: iconst_0       
        //   302: istore          7
        //   304: iload           7
        //   306: ifne            328
        //   309: aload_0        
        //   310: monitorenter   
        //   311: aload_0        
        //   312: iconst_0       
        //   313: putfield        rx/internal/util/d.G:Z
        //   316: aload_0        
        //   317: monitorexit    
        //   318: goto            328
        //   321: astore          6
        //   323: aload_0        
        //   324: monitorexit    
        //   325: aload           6
        //   327: athrow         
        //   328: aload           6
        //   330: athrow         
        //   331: astore          6
        //   333: aload_0        
        //   334: monitorexit    
        //   335: aload           6
        //   337: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      11     331    338    Any
        //  16     28     331    338    Any
        //  34     40     299    304    Any
        //  62     71     299    304    Any
        //  79     90     91     96     Any
        //  104    113    299    304    Any
        //  118    120    299    304    Any
        //  120    135    247    252    Any
        //  144    150    247    252    Any
        //  171    176    261    270    Any
        //  179    181    261    270    Any
        //  196    204    247    252    Any
        //  228    230    247    252    Any
        //  236    241    261    270    Any
        //  244    246    261    270    Any
        //  256    258    261    270    Any
        //  258    261    91     96     Any
        //  270    281    299    304    Any
        //  311    318    321    328    Any
        //  323    325    321    328    Any
        //  333    335    331    338    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0182:
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
    
    public boolean b() {
        return this.H;
    }
    
    public void c() {
        this.H = true;
    }
    
    public void d(final Throwable i) {
        if (!this.H) {
            this.I = i;
            this.H = true;
        }
    }
    
    public void e() {
        this.H = true;
        this.a();
    }
    
    public void f(final Throwable i) {
        if (!this.H) {
            this.I = i;
            this.H = true;
            this.a();
        }
    }
    
    @Override
    public void v(final long n) {
        if (n == 0L) {
            return;
        }
        long value;
        long newValue;
        int n3;
        do {
            value = this.get();
            final int n2 = 1;
            if (value == 0L) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            newValue = Long.MAX_VALUE;
            if (value == Long.MAX_VALUE) {
                break;
            }
            if (n == Long.MAX_VALUE) {
                newValue = n;
                n3 = n2;
            }
            else {
                if (value > Long.MAX_VALUE - n) {
                    continue;
                }
                newValue = value + n;
            }
        } while (!this.compareAndSet(value, newValue));
        if (n3 != 0) {
            this.a();
        }
    }
    
    public interface a
    {
        boolean accept(final Object p0);
        
        Object peek();
        
        Object poll();
        
        void q(final Throwable p0);
    }
}
