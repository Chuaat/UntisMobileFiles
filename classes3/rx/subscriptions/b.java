// 
// Decompiled by Procyon v0.5.36
// 

package rx.subscriptions;

import java.util.Iterator;
import java.util.List;
import rx.exceptions.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import rx.o;

public final class b implements o
{
    private Set<o> G;
    private volatile boolean H;
    
    public b() {
    }
    
    public b(final o... a) {
        this.G = new HashSet<o>(Arrays.asList(a));
    }
    
    private static void h(Collection<o> o) {
        if (o == null) {
            return;
        }
        final Collection<o> collection = null;
        final Iterator<o> iterator = ((Collection<o>)o).iterator();
        o = collection;
        while (iterator.hasNext()) {
            final o o2 = iterator.next();
            try {
                o2.i();
            }
            finally {
                Collection<o> collection2 = (Collection<o>)o;
                if (o == null) {
                    collection2 = new ArrayList<o>();
                }
                final Throwable t;
                ((List<o>)collection2).add((o)t);
                o = collection2;
            }
        }
        c.d((List<? extends Throwable>)o);
    }
    
    public void a(final o o) {
        if (o.g()) {
            return;
        }
        if (!this.H) {
            synchronized (this) {
                if (!this.H) {
                    if (this.G == null) {
                        this.G = new HashSet<o>(4);
                    }
                    this.G.add(o);
                    return;
                }
            }
        }
        o.i();
    }
    
    public void b(final o... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        rx/subscriptions/b.H:Z
        //     4: istore_2       
        //     5: iconst_0       
        //     6: istore_3       
        //     7: iconst_0       
        //     8: istore          4
        //    10: iload_2        
        //    11: ifne            104
        //    14: aload_0        
        //    15: monitorenter   
        //    16: aload_0        
        //    17: getfield        rx/subscriptions/b.H:Z
        //    20: ifne            94
        //    23: aload_0        
        //    24: getfield        rx/subscriptions/b.G:Ljava/util/Set;
        //    27: ifnonnull       48
        //    30: new             Ljava/util/HashSet;
        //    33: astore          5
        //    35: aload           5
        //    37: aload_1        
        //    38: arraylength    
        //    39: invokespecial   java/util/HashSet.<init>:(I)V
        //    42: aload_0        
        //    43: aload           5
        //    45: putfield        rx/subscriptions/b.G:Ljava/util/Set;
        //    48: aload_1        
        //    49: arraylength    
        //    50: istore_3       
        //    51: iload           4
        //    53: iload_3        
        //    54: if_icmpge       91
        //    57: aload_1        
        //    58: iload           4
        //    60: aaload         
        //    61: astore          5
        //    63: aload           5
        //    65: invokeinterface rx/o.g:()Z
        //    70: ifne            85
        //    73: aload_0        
        //    74: getfield        rx/subscriptions/b.G:Ljava/util/Set;
        //    77: aload           5
        //    79: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    84: pop            
        //    85: iinc            4, 1
        //    88: goto            51
        //    91: aload_0        
        //    92: monitorexit    
        //    93: return         
        //    94: aload_0        
        //    95: monitorexit    
        //    96: goto            104
        //    99: astore_1       
        //   100: aload_0        
        //   101: monitorexit    
        //   102: aload_1        
        //   103: athrow         
        //   104: aload_1        
        //   105: arraylength    
        //   106: istore          6
        //   108: iload_3        
        //   109: istore          4
        //   111: iload           4
        //   113: iload           6
        //   115: if_icmpge       133
        //   118: aload_1        
        //   119: iload           4
        //   121: aaload         
        //   122: invokeinterface rx/o.i:()V
        //   127: iinc            4, 1
        //   130: goto            111
        //   133: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  16     48     99     104    Any
        //  48     51     99     104    Any
        //  63     85     99     104    Any
        //  91     93     99     104    Any
        //  94     96     99     104    Any
        //  100    102    99     104    Any
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
    
    public void c() {
        if (!this.H) {
            synchronized (this) {
                if (!this.H) {
                    final Set<o> g = this.G;
                    if (g != null) {
                        this.G = null;
                        // monitorexit(this)
                        h(g);
                    }
                }
            }
        }
    }
    
    public boolean d() {
        final boolean h = this.H;
        final boolean b = false;
        if (!h) {
            // monitorenter(this)
            boolean b2 = b;
            try {
                if (!this.H) {
                    final Set<o> g = this.G;
                    b2 = b;
                    if (g != null) {
                        b2 = b;
                        if (!g.isEmpty()) {
                            b2 = true;
                        }
                    }
                }
                return b2;
            }
            finally {
            }
            // monitorexit(this)
        }
        return false;
    }
    
    public void e(final o o) {
        if (!this.H) {
            synchronized (this) {
                if (!this.H) {
                    final Set<o> g = this.G;
                    if (g != null) {
                        final boolean remove = g.remove(o);
                        // monitorexit(this)
                        if (remove) {
                            o.i();
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public boolean g() {
        return this.H;
    }
    
    @Override
    public void i() {
        if (!this.H) {
            synchronized (this) {
                if (this.H) {
                    return;
                }
                this.H = true;
                final Set<o> g = this.G;
                this.G = null;
                // monitorexit(this)
                h(g);
            }
        }
    }
}
