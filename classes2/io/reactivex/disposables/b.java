// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.disposables;

import java.util.List;
import io.reactivex.exceptions.a;
import io.reactivex.internal.util.k;
import java.util.ArrayList;
import java.util.Iterator;
import io.reactivex.annotations.f;
import io.reactivex.internal.util.s;

public final class b implements c, io.reactivex.internal.disposables.c
{
    s<c> G;
    volatile boolean H;
    
    public b() {
    }
    
    public b(@f final Iterable<? extends c> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "disposables is null");
        this.G = new s<c>();
        for (final c c : iterable) {
            io.reactivex.internal.functions.b.g(c, "A Disposable item in the disposables sequence is null");
            this.G.a(c);
        }
    }
    
    public b(@f final c... array) {
        io.reactivex.internal.functions.b.g(array, "disposables is null");
        this.G = new s<c>(array.length + 1);
        for (final c c : array) {
            io.reactivex.internal.functions.b.g(c, "A Disposable in the disposables array is null");
            this.G.a(c);
        }
    }
    
    @Override
    public boolean a(@f final c c) {
        if (this.c(c)) {
            c.dispose();
            return true;
        }
        return false;
    }
    
    @Override
    public boolean b(@f final c c) {
        io.reactivex.internal.functions.b.g(c, "disposable is null");
        if (!this.H) {
            synchronized (this) {
                if (!this.H) {
                    s<c> g;
                    if ((g = this.G) == null) {
                        g = new s<c>();
                        this.G = g;
                    }
                    g.a(c);
                    return true;
                }
            }
        }
        c.dispose();
        return false;
    }
    
    @Override
    public boolean c(@f final c c) {
        io.reactivex.internal.functions.b.g(c, "disposables is null");
        if (this.H) {
            return false;
        }
        synchronized (this) {
            if (this.H) {
                return false;
            }
            final s<c> g = this.G;
            return g != null && g.e(c);
        }
    }
    
    public boolean d(@f final c... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "disposables is null"
        //     3: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     6: pop            
        //     7: aload_0        
        //     8: getfield        io/reactivex/disposables/b.H:Z
        //    11: istore_2       
        //    12: iconst_0       
        //    13: istore_3       
        //    14: iload_2        
        //    15: ifne            113
        //    18: aload_0        
        //    19: monitorenter   
        //    20: aload_0        
        //    21: getfield        io/reactivex/disposables/b.H:Z
        //    24: ifne            103
        //    27: aload_0        
        //    28: getfield        io/reactivex/disposables/b.G:Lio/reactivex/internal/util/s;
        //    31: astore          4
        //    33: aload           4
        //    35: astore          5
        //    37: aload           4
        //    39: ifnonnull       62
        //    42: new             Lio/reactivex/internal/util/s;
        //    45: astore          5
        //    47: aload           5
        //    49: aload_1        
        //    50: arraylength    
        //    51: iconst_1       
        //    52: iadd           
        //    53: invokespecial   io/reactivex/internal/util/s.<init>:(I)V
        //    56: aload_0        
        //    57: aload           5
        //    59: putfield        io/reactivex/disposables/b.G:Lio/reactivex/internal/util/s;
        //    62: aload_1        
        //    63: arraylength    
        //    64: istore          6
        //    66: iload_3        
        //    67: iload           6
        //    69: if_icmpge       99
        //    72: aload_1        
        //    73: iload_3        
        //    74: aaload         
        //    75: astore          4
        //    77: aload           4
        //    79: ldc             "A Disposable in the disposables array is null"
        //    81: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //    84: pop            
        //    85: aload           5
        //    87: aload           4
        //    89: invokevirtual   io/reactivex/internal/util/s.a:(Ljava/lang/Object;)Z
        //    92: pop            
        //    93: iinc            3, 1
        //    96: goto            66
        //    99: aload_0        
        //   100: monitorexit    
        //   101: iconst_1       
        //   102: ireturn        
        //   103: aload_0        
        //   104: monitorexit    
        //   105: goto            113
        //   108: astore_1       
        //   109: aload_0        
        //   110: monitorexit    
        //   111: aload_1        
        //   112: athrow         
        //   113: aload_1        
        //   114: arraylength    
        //   115: istore          6
        //   117: iconst_0       
        //   118: istore_3       
        //   119: iload_3        
        //   120: iload           6
        //   122: if_icmpge       139
        //   125: aload_1        
        //   126: iload_3        
        //   127: aaload         
        //   128: invokeinterface io/reactivex/disposables/c.dispose:()V
        //   133: iinc            3, 1
        //   136: goto            119
        //   139: iconst_0       
        //   140: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  20     33     108    113    Any
        //  42     62     108    113    Any
        //  62     66     108    113    Any
        //  77     93     108    113    Any
        //  99     101    108    113    Any
        //  103    105    108    113    Any
        //  109    111    108    113    Any
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
    
    @Override
    public void dispose() {
        if (this.H) {
            return;
        }
        synchronized (this) {
            if (this.H) {
                return;
            }
            this.H = true;
            final s<c> g = this.G;
            this.G = null;
            // monitorexit(this)
            this.f(g);
        }
    }
    
    public void e() {
        if (this.H) {
            return;
        }
        synchronized (this) {
            if (this.H) {
                return;
            }
            final s<c> g = this.G;
            this.G = null;
            // monitorexit(this)
            this.f(g);
        }
    }
    
    void f(s<c> o) {
        if (o == null) {
            return;
        }
        final List<Object> list = null;
        final Object[] b = ((s)o).b();
        final int length = b.length;
        int i = 0;
        o = list;
        while (i < length) {
            final Object o2 = b[i];
            Object o3 = o;
            if (o2 instanceof c) {
                try {
                    ((c)o2).dispose();
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    o3 = o;
                    if (o == null) {
                        o3 = new ArrayList<Object>();
                    }
                    ((List<Throwable>)o3).add(t);
                }
            }
            ++i;
            o = o3;
        }
        if (o == null) {
            return;
        }
        if (((List)o).size() == 1) {
            throw k.f(((List<Throwable>)o).get(0));
        }
        throw new a((Iterable<? extends Throwable>)o);
    }
    
    public int g() {
        final boolean h = this.H;
        int g = 0;
        if (h) {
            return 0;
        }
        synchronized (this) {
            if (this.H) {
                return 0;
            }
            final s<c> g2 = this.G;
            if (g2 != null) {
                g = g2.g();
            }
            return g;
        }
    }
    
    @Override
    public boolean i() {
        return this.H;
    }
}
