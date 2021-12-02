// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.n;
import kotlin.coroutines.g;
import kotlinx.coroutines.flow.internal.w;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.o2;
import kotlin.coroutines.g$c;
import kotlin.c1;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.f;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.collections.v;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlinx.coroutines.flow.internal.t;
import kotlinx.coroutines.flow.internal.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u00107\u001a\u00020\u0007¢\u0006\u0004\b8\u00101J!\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b!\u0010\"J-\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R*\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b2\u0010\u0017\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069" }, d2 = { "Lkotlinx/coroutines/flow/w0;", "T", "Lkotlinx/coroutines/flow/internal/b;", "Lkotlinx/coroutines/flow/y0;", "Lkotlinx/coroutines/flow/f0;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/t;", "", "expectedState", "newState", "", "w", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "expect", "update", "compareAndSet", "value", "j", "(Ljava/lang/Object;)Z", "Lkotlin/j2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "i", "()V", "Lkotlinx/coroutines/flow/j;", "collector", "c", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "t", "()Lkotlinx/coroutines/flow/y0;", "", "size", "", "u", "(I)[Lkotlinx/coroutines/flow/y0;", "Lkotlin/coroutines/g;", "context", "capacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", "d", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/n;)Lkotlinx/coroutines/flow/i;", "K", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "", "a", "()Ljava/util/List;", "replayCache", "initialState", "<init>", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class w0<T> extends b<y0> implements f0<T>, c<T>, t<T>
{
    private int K;
    private volatile /* synthetic */ Object _state;
    
    public w0(@e final Object state) {
        this._state = state;
    }
    
    private final boolean w(final Object p0, final Object p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   kotlinx/coroutines/flow/internal/b.r:()[Lkotlinx/coroutines/flow/internal/d;
        //     4: checkcast       [Lkotlinx/coroutines/flow/y0;
        //     7: astore_3       
        //     8: aload_0        
        //     9: monitorenter   
        //    10: aload_0        
        //    11: getfield        kotlinx/coroutines/flow/w0._state:Ljava/lang/Object;
        //    14: astore_3       
        //    15: aload_1        
        //    16: ifnull          37
        //    19: aload_3        
        //    20: aload_1        
        //    21: invokestatic    kotlin/jvm/internal/k0.g:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    24: istore          4
        //    26: iload           4
        //    28: iconst_1       
        //    29: ixor           
        //    30: ifeq            37
        //    33: aload_0        
        //    34: monitorexit    
        //    35: iconst_0       
        //    36: ireturn        
        //    37: aload_3        
        //    38: aload_2        
        //    39: invokestatic    kotlin/jvm/internal/k0.g:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    42: istore          4
        //    44: iload           4
        //    46: ifeq            53
        //    49: aload_0        
        //    50: monitorexit    
        //    51: iconst_1       
        //    52: ireturn        
        //    53: aload_0        
        //    54: aload_2        
        //    55: putfield        kotlinx/coroutines/flow/w0._state:Ljava/lang/Object;
        //    58: aload_0        
        //    59: getfield        kotlinx/coroutines/flow/w0.K:I
        //    62: istore          5
        //    64: iload           5
        //    66: iconst_1       
        //    67: iand           
        //    68: ifne            184
        //    71: iinc            5, 1
        //    74: aload_0        
        //    75: iload           5
        //    77: putfield        kotlinx/coroutines/flow/w0.K:I
        //    80: aload_0        
        //    81: invokevirtual   kotlinx/coroutines/flow/internal/b.r:()[Lkotlinx/coroutines/flow/internal/d;
        //    84: checkcast       [Lkotlinx/coroutines/flow/y0;
        //    87: astore_1       
        //    88: getstatic       kotlin/j2.a:Lkotlin/j2;
        //    91: astore_2       
        //    92: aload_0        
        //    93: monitorexit    
        //    94: aload_1        
        //    95: ifnull          131
        //    98: aload_1        
        //    99: arraylength    
        //   100: istore          6
        //   102: iconst_0       
        //   103: istore          7
        //   105: iload           7
        //   107: iload           6
        //   109: if_icmpge       131
        //   112: aload_1        
        //   113: iload           7
        //   115: aaload         
        //   116: astore_2       
        //   117: aload_2        
        //   118: ifnull          125
        //   121: aload_2        
        //   122: invokevirtual   kotlinx/coroutines/flow/y0.f:()V
        //   125: iinc            7, 1
        //   128: goto            105
        //   131: aload_0        
        //   132: monitorenter   
        //   133: aload_0        
        //   134: getfield        kotlinx/coroutines/flow/w0.K:I
        //   137: istore          7
        //   139: iload           7
        //   141: iload           5
        //   143: if_icmpne       158
        //   146: aload_0        
        //   147: iload           5
        //   149: iconst_1       
        //   150: iadd           
        //   151: putfield        kotlinx/coroutines/flow/w0.K:I
        //   154: aload_0        
        //   155: monitorexit    
        //   156: iconst_1       
        //   157: ireturn        
        //   158: aload_0        
        //   159: invokevirtual   kotlinx/coroutines/flow/internal/b.r:()[Lkotlinx/coroutines/flow/internal/d;
        //   162: checkcast       [Lkotlinx/coroutines/flow/y0;
        //   165: astore_1       
        //   166: getstatic       kotlin/j2.a:Lkotlin/j2;
        //   169: astore_2       
        //   170: aload_0        
        //   171: monitorexit    
        //   172: iload           7
        //   174: istore          5
        //   176: goto            94
        //   179: astore_1       
        //   180: aload_0        
        //   181: monitorexit    
        //   182: aload_1        
        //   183: athrow         
        //   184: aload_0        
        //   185: iload           5
        //   187: iconst_2       
        //   188: iadd           
        //   189: putfield        kotlinx/coroutines/flow/w0.K:I
        //   192: aload_0        
        //   193: monitorexit    
        //   194: iconst_1       
        //   195: ireturn        
        //   196: astore_1       
        //   197: aload_0        
        //   198: monitorexit    
        //   199: aload_1        
        //   200: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  10     15     196    201    Any
        //  19     26     196    201    Any
        //  37     44     196    201    Any
        //  53     64     196    201    Any
        //  74     92     196    201    Any
        //  133    139    179    184    Any
        //  146    154    179    184    Any
        //  158    170    179    184    Any
        //  184    192    196    201    Any
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
    
    @e
    @Override
    public List<T> a() {
        return (List<T>)v.k(this.getValue());
    }
    
    @f
    @Override
    public Object b(final T value, @e final d<? super j2> d) {
        this.setValue(value);
        return j2.a;
    }
    
    @f
    @Override
    public Object c(@e j<? super T> k, @e d<? super j2> o) {
        Object l = null;
        Label_0048: {
            if (o instanceof w0$a) {
                l = o;
                final int h = ((w0$a)l).H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    ((w0$a)l).H = h + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            l = new kotlin.coroutines.jvm.internal.d(o) {
                /* synthetic */ Object G;
                int H;
                final /* synthetic */ w0 I;
                Object J;
                Object K;
                Object L;
                Object M;
                Object N;
                
                @f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return this.I.c(null, (d<? super j2>)this);
                }
            };
        }
        Object g = ((w0$a)l).G;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int h3 = ((w0$a)l).H;
        Label_0332: {
            if (h3 != 0) {
                Label_0219: {
                    if (h3 == 1) {
                        break Label_0219;
                    }
                    Label_0157: {
                        if (h3 == 2) {
                            break Label_0157;
                        }
                        Label_0147: {
                            if (h3 != 3) {
                                break Label_0147;
                            }
                            final Object n = ((w0$a)l).N;
                            final k2 m = (k2)((w0$a)l).M;
                            Object o2 = ((w0$a)l).L;
                            Object i = ((w0$a)l).K;
                            Object j = ((w0$a)l).J;
                            o = o2;
                            k = j;
                            try {
                                c1.n(g);
                                g = l;
                                break Label_0332;
                                final Object n2 = ((w0$a)l).N;
                                final k2 m2 = (k2)((w0$a)l).M;
                                j = ((w0$a)l).L;
                                final Object k2 = ((w0$a)l).K;
                                final w0 j2 = (w0)((w0$a)l).J;
                                o = j;
                                k = j2;
                                c1.n(g);
                                final Object o3 = l;
                                break Label_0332;
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                o2 = ((w0$a)l).L;
                                i = ((w0$a)l).K;
                                j = ((w0$a)l).J;
                                o = o2;
                                k = j;
                                c1.n(g);
                                break Label_0332;
                            }
                            finally {
                                break Label_0332;
                            }
                        }
                    }
                }
            }
            c1.n(g);
            Object o2 = this.k();
            try {
                if (k instanceof z0) {
                    final z0 z0 = (z0)k;
                    ((w0$a)l).J = this;
                    ((w0$a)l).K = k;
                    ((w0$a)l).L = o2;
                    ((w0$a)l).H = 1;
                    if (z0.a((d)l) == h2) {
                        return h2;
                    }
                }
                Object j = this;
                Object i = k;
                k2 m = (k2)((d)l).getContext().get((g$c)k2.t);
                Object n = null;
                g = l;
                while (true) {
                    final Object state = ((w0)j)._state;
                    if (m != null) {
                        kotlinx.coroutines.o2.B(m);
                    }
                    if (n != null) {
                        final Object o3 = g;
                        final k2 m2 = m;
                        l = o2;
                        final Object k2 = i;
                        final w0 j2 = (w0)j;
                        final Object n2 = n;
                        if (!(k0.g(n, state) ^ true)) {
                            break Label_0332;
                        }
                    }
                    Object o4;
                    if (state == w.a) {
                        o4 = null;
                    }
                    else {
                        o4 = state;
                    }
                    ((w0$a)g).J = j;
                    ((w0$a)g).K = i;
                    ((w0$a)g).L = o2;
                    ((w0$a)g).M = m;
                    ((w0$a)g).N = state;
                    ((w0$a)g).H = 2;
                    if (((j<? super T>)i).b((Object)o4, (d<? super j2>)g) == h2) {
                        return h2;
                    }
                    final Object n2 = state;
                    final w0 j2 = (w0)j;
                    final Object k2 = i;
                    l = o2;
                    final k2 m2 = m;
                    final Object o3 = g;
                    g = o3;
                    m = m2;
                    o2 = l;
                    i = k2;
                    j = j2;
                    n = n2;
                    if (!((y0)l).g()) {
                        ((w0$a)o3).J = j2;
                        ((w0$a)o3).K = k2;
                        ((w0$a)o3).L = l;
                        ((w0$a)o3).M = m2;
                        ((w0$a)o3).N = n2;
                        ((w0$a)o3).H = 3;
                        final Object d = ((y0)l).d((d<? super j2>)o3);
                        g = o3;
                        m = m2;
                        o2 = l;
                        i = k2;
                        j = j2;
                        n = n2;
                        if (d == h2) {
                            return h2;
                        }
                        continue;
                    }
                }
            }
            finally {
                k = this;
                o = o2;
            }
        }
        ((b<kotlinx.coroutines.flow.internal.d>)k).p((kotlinx.coroutines.flow.internal.d)o);
        throw l;
    }
    
    @Override
    public boolean compareAndSet(T a, T a2) {
        if (a == null) {
            a = (T)w.a;
        }
        if (a2 == null) {
            a2 = (T)w.a;
        }
        return this.w(a, a2);
    }
    
    @e
    @Override
    public i<T> d(@e final g g, final int n, @e final n n2) {
        return x0.d((v0<? extends T>)this, g, n, n2);
    }
    
    @Override
    public T getValue() {
        Object state;
        if ((state = this._state) == w.a) {
            state = null;
        }
        return (T)state;
    }
    
    @Override
    public void i() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }
    
    @Override
    public boolean j(final T value) {
        this.setValue(value);
        return true;
    }
    
    @Override
    public void setValue(T a) {
        if (a == null) {
            a = (T)w.a;
        }
        this.w(null, a);
    }
    
    @e
    protected y0 t() {
        return new y0();
    }
    
    @e
    protected y0[] u(final int n) {
        return new y0[n];
    }
}
