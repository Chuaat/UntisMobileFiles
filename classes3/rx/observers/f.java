// 
// Decompiled by Procyon v0.5.36
// 

package rx.observers;

import rx.internal.operators.x;
import rx.exceptions.c;
import rx.h;

public class f<T> implements h<T>
{
    private final h<? super T> G;
    private boolean H;
    private volatile boolean I;
    private a J;
    
    public f(final h<? super T> g) {
        this.G = g;
    }
    
    @Override
    public void b(final Throwable t) {
        c.e(t);
        if (this.I) {
            return;
        }
        synchronized (this) {
            if (this.I) {
                return;
            }
            this.I = true;
            if (this.H) {
                a j;
                if ((j = this.J) == null) {
                    j = new a();
                    this.J = j;
                }
                j.a(x.c(t));
                return;
            }
            this.H = true;
            // monitorexit(this)
            this.G.b(t);
        }
    }
    
    @Override
    public void c() {
        if (this.I) {
            return;
        }
        synchronized (this) {
            if (this.I) {
                return;
            }
            this.I = true;
            if (this.H) {
                a j;
                if ((j = this.J) == null) {
                    j = new a();
                    this.J = j;
                }
                j.a(x.b());
                return;
            }
            this.H = true;
            // monitorexit(this)
            this.G.c();
        }
    }
    
    @Override
    public void m(final T p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        rx/observers/f.I:Z
        //     4: ifeq            8
        //     7: return         
        //     8: aload_0        
        //     9: monitorenter   
        //    10: aload_0        
        //    11: getfield        rx/observers/f.I:Z
        //    14: ifeq            20
        //    17: aload_0        
        //    18: monitorexit    
        //    19: return         
        //    20: aload_0        
        //    21: getfield        rx/observers/f.H:Z
        //    24: ifeq            62
        //    27: aload_0        
        //    28: getfield        rx/observers/f.J:Lrx/observers/f$a;
        //    31: astore_2       
        //    32: aload_2        
        //    33: astore_3       
        //    34: aload_2        
        //    35: ifnonnull       51
        //    38: new             Lrx/observers/f$a;
        //    41: astore_3       
        //    42: aload_3        
        //    43: invokespecial   rx/observers/f$a.<init>:()V
        //    46: aload_0        
        //    47: aload_3        
        //    48: putfield        rx/observers/f.J:Lrx/observers/f$a;
        //    51: aload_3        
        //    52: aload_1        
        //    53: invokestatic    rx/internal/operators/x.j:(Ljava/lang/Object;)Ljava/lang/Object;
        //    56: invokevirtual   rx/observers/f$a.a:(Ljava/lang/Object;)V
        //    59: aload_0        
        //    60: monitorexit    
        //    61: return         
        //    62: aload_0        
        //    63: iconst_1       
        //    64: putfield        rx/observers/f.H:Z
        //    67: aload_0        
        //    68: monitorexit    
        //    69: aload_0        
        //    70: getfield        rx/observers/f.G:Lrx/h;
        //    73: aload_1        
        //    74: invokeinterface rx/h.m:(Ljava/lang/Object;)V
        //    79: aload_0        
        //    80: monitorenter   
        //    81: aload_0        
        //    82: getfield        rx/observers/f.J:Lrx/observers/f$a;
        //    85: astore_3       
        //    86: iconst_0       
        //    87: istore          4
        //    89: aload_3        
        //    90: ifnonnull       101
        //    93: aload_0        
        //    94: iconst_0       
        //    95: putfield        rx/observers/f.H:Z
        //    98: aload_0        
        //    99: monitorexit    
        //   100: return         
        //   101: aload_0        
        //   102: aconst_null    
        //   103: putfield        rx/observers/f.J:Lrx/observers/f$a;
        //   106: aload_0        
        //   107: monitorexit    
        //   108: aload_3        
        //   109: getfield        rx/observers/f$a.a:[Ljava/lang/Object;
        //   112: astore_3       
        //   113: aload_3        
        //   114: arraylength    
        //   115: istore          5
        //   117: iload           4
        //   119: iload           5
        //   121: if_icmpge       79
        //   124: aload_3        
        //   125: iload           4
        //   127: aaload         
        //   128: astore_2       
        //   129: aload_2        
        //   130: ifnonnull       136
        //   133: goto            79
        //   136: aload_0        
        //   137: getfield        rx/observers/f.G:Lrx/h;
        //   140: aload_2        
        //   141: invokestatic    rx/internal/operators/x.a:(Lrx/h;Ljava/lang/Object;)Z
        //   144: ifeq            153
        //   147: aload_0        
        //   148: iconst_1       
        //   149: putfield        rx/observers/f.I:Z
        //   152: return         
        //   153: iinc            4, 1
        //   156: goto            117
        //   159: astore_3       
        //   160: aload_0        
        //   161: iconst_1       
        //   162: putfield        rx/observers/f.I:Z
        //   165: aload_3        
        //   166: invokestatic    rx/exceptions/c.e:(Ljava/lang/Throwable;)V
        //   169: aload_0        
        //   170: getfield        rx/observers/f.G:Lrx/h;
        //   173: aload_3        
        //   174: aload_1        
        //   175: invokestatic    rx/exceptions/h.a:(Ljava/lang/Throwable;Ljava/lang/Object;)Ljava/lang/Throwable;
        //   178: invokeinterface rx/h.b:(Ljava/lang/Throwable;)V
        //   183: return         
        //   184: astore_1       
        //   185: aload_0        
        //   186: monitorexit    
        //   187: aload_1        
        //   188: athrow         
        //   189: astore_3       
        //   190: aload_0        
        //   191: iconst_1       
        //   192: putfield        rx/observers/f.I:Z
        //   195: aload_3        
        //   196: aload_0        
        //   197: getfield        rx/observers/f.G:Lrx/h;
        //   200: aload_1        
        //   201: invokestatic    rx/exceptions/c.g:(Ljava/lang/Throwable;Lrx/h;Ljava/lang/Object;)V
        //   204: return         
        //   205: astore_1       
        //   206: aload_0        
        //   207: monitorexit    
        //   208: aload_1        
        //   209: athrow         
        //    Signature:
        //  (TT;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  10     19     205    210    Any
        //  20     32     205    210    Any
        //  38     51     205    210    Any
        //  51     61     205    210    Any
        //  62     69     205    210    Any
        //  69     79     189    205    Any
        //  81     86     184    189    Any
        //  93     100    184    189    Any
        //  101    108    184    189    Any
        //  136    152    159    184    Any
        //  185    187    184    189    Any
        //  206    208    205    210    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
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
    
    static final class a
    {
        Object[] a;
        int b;
        
        public void a(final Object o) {
            final int b = this.b;
            final Object[] a = this.a;
            Object[] array;
            if (a == null) {
                array = new Object[16];
                this.a = array;
            }
            else {
                array = a;
                if (b == a.length) {
                    array = new Object[(b >> 2) + b];
                    System.arraycopy(a, 0, array, 0, b);
                    this.a = array;
                }
            }
            array[b] = o;
            this.b = b + 1;
        }
    }
}
