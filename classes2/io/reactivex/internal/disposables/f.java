// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.disposables;

import io.reactivex.exceptions.a;
import io.reactivex.internal.util.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import io.reactivex.internal.functions.b;
import java.util.List;
import io.reactivex.disposables.c;

public final class f implements c, c
{
    List<c> G;
    volatile boolean H;
    
    public f() {
    }
    
    public f(final Iterable<? extends c> iterable) {
        b.g(iterable, "resources is null");
        this.G = new LinkedList<c>();
        for (final c c : iterable) {
            b.g(c, "Disposable item is null");
            this.G.add(c);
        }
    }
    
    public f(final c... array) {
        b.g(array, "resources is null");
        this.G = new LinkedList<c>();
        for (final c c : array) {
            b.g(c, "Disposable item is null");
            this.G.add(c);
        }
    }
    
    @Override
    public boolean a(final c c) {
        if (this.c(c)) {
            c.dispose();
            return true;
        }
        return false;
    }
    
    @Override
    public boolean b(final c c) {
        b.g(c, "d is null");
        if (!this.H) {
            synchronized (this) {
                if (!this.H) {
                    List<c> g;
                    if ((g = this.G) == null) {
                        g = new LinkedList<c>();
                        this.G = g;
                    }
                    g.add(c);
                    return true;
                }
            }
        }
        c.dispose();
        return false;
    }
    
    @Override
    public boolean c(final c c) {
        b.g(c, "Disposable item is null");
        if (this.H) {
            return false;
        }
        synchronized (this) {
            if (this.H) {
                return false;
            }
            final List<c> g = this.G;
            return g != null && g.remove(c);
        }
    }
    
    public boolean d(final c... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "ds is null"
        //     3: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     6: pop            
        //     7: aload_0        
        //     8: getfield        io/reactivex/internal/disposables/f.H:Z
        //    11: istore_2       
        //    12: iconst_0       
        //    13: istore_3       
        //    14: iload_2        
        //    15: ifne            111
        //    18: aload_0        
        //    19: monitorenter   
        //    20: aload_0        
        //    21: getfield        io/reactivex/internal/disposables/f.H:Z
        //    24: ifne            101
        //    27: aload_0        
        //    28: getfield        io/reactivex/internal/disposables/f.G:Ljava/util/List;
        //    31: astore          4
        //    33: aload           4
        //    35: astore          5
        //    37: aload           4
        //    39: ifnonnull       58
        //    42: new             Ljava/util/LinkedList;
        //    45: astore          5
        //    47: aload           5
        //    49: invokespecial   java/util/LinkedList.<init>:()V
        //    52: aload_0        
        //    53: aload           5
        //    55: putfield        io/reactivex/internal/disposables/f.G:Ljava/util/List;
        //    58: aload_1        
        //    59: arraylength    
        //    60: istore          6
        //    62: iload_3        
        //    63: iload           6
        //    65: if_icmpge       97
        //    68: aload_1        
        //    69: iload_3        
        //    70: aaload         
        //    71: astore          4
        //    73: aload           4
        //    75: ldc             "d is null"
        //    77: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //    80: pop            
        //    81: aload           5
        //    83: aload           4
        //    85: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    90: pop            
        //    91: iinc            3, 1
        //    94: goto            62
        //    97: aload_0        
        //    98: monitorexit    
        //    99: iconst_1       
        //   100: ireturn        
        //   101: aload_0        
        //   102: monitorexit    
        //   103: goto            111
        //   106: astore_1       
        //   107: aload_0        
        //   108: monitorexit    
        //   109: aload_1        
        //   110: athrow         
        //   111: aload_1        
        //   112: arraylength    
        //   113: istore          6
        //   115: iconst_0       
        //   116: istore_3       
        //   117: iload_3        
        //   118: iload           6
        //   120: if_icmpge       137
        //   123: aload_1        
        //   124: iload_3        
        //   125: aaload         
        //   126: invokeinterface io/reactivex/disposables/c.dispose:()V
        //   131: iinc            3, 1
        //   134: goto            117
        //   137: iconst_0       
        //   138: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  20     33     106    111    Any
        //  42     58     106    111    Any
        //  58     62     106    111    Any
        //  73     91     106    111    Any
        //  97     99     106    111    Any
        //  101    103    106    111    Any
        //  107    109    106    111    Any
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
            final List<c> g = this.G;
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
            final List<c> g = this.G;
            this.G = null;
            // monitorexit(this)
            this.f(g);
        }
    }
    
    void f(List<c> list) {
        if (list == null) {
            return;
        }
        final List<Throwable> list2 = null;
        final Iterator<Throwable> iterator = list.iterator();
        list = list2;
        while (iterator.hasNext()) {
            final c c = (c)iterator.next();
            try {
                c.dispose();
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                List<Throwable> list3 = list;
                if (list == null) {
                    list3 = new ArrayList<Throwable>();
                }
                list3.add(t);
                list = list3;
            }
        }
        if (list == null) {
            return;
        }
        if (list.size() == 1) {
            throw k.f(list.get(0));
        }
        throw new a(list);
    }
    
    @Override
    public boolean i() {
        return this.H;
    }
}
