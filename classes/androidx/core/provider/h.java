// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.provider;

import java.util.concurrent.Callable;
import androidx.annotation.b1;
import android.os.Message;
import android.os.Handler$Callback;
import android.os.Handler;
import androidx.annotation.w;
import android.os.HandlerThread;
import androidx.annotation.t0;

@Deprecated
@t0({ t0.a.I })
public class h
{
    private static final int i = 1;
    private static final int j = 0;
    private final Object a;
    @w("mLock")
    private HandlerThread b;
    @w("mLock")
    private Handler c;
    @w("mLock")
    private int d;
    private Handler$Callback e;
    private final int f;
    private final int g;
    private final String h;
    
    public h(final String h, final int g, final int f) {
        this.a = new Object();
        this.e = (Handler$Callback)new Handler$Callback() {
            public boolean handleMessage(final Message message) {
                final int what = message.what;
                if (what == 0) {
                    androidx.core.provider.h.this.c();
                    return true;
                }
                if (what != 1) {
                    return true;
                }
                androidx.core.provider.h.this.d((Runnable)message.obj);
                return true;
            }
        };
        this.h = h;
        this.g = g;
        this.f = f;
        this.d = 0;
    }
    
    private void e(final Runnable runnable) {
        synchronized (this.a) {
            if (this.b == null) {
                (this.b = new HandlerThread(this.h, this.g)).start();
                this.c = new Handler(this.b.getLooper(), this.e);
                ++this.d;
            }
            this.c.removeMessages(0);
            final Handler c = this.c;
            c.sendMessage(c.obtainMessage(1, (Object)runnable));
        }
    }
    
    @b1
    public int a() {
        synchronized (this.a) {
            return this.d;
        }
    }
    
    @b1
    public boolean b() {
        synchronized (this.a) {
            return this.b != null;
        }
    }
    
    void c() {
        synchronized (this.a) {
            if (this.c.hasMessages(1)) {
                return;
            }
            this.b.quit();
            this.b = null;
            this.c = null;
        }
    }
    
    void d(final Runnable runnable) {
        runnable.run();
        synchronized (this.a) {
            this.c.removeMessages(0);
            final Handler c = this.c;
            c.sendMessageDelayed(c.obtainMessage(0), (long)this.f);
        }
    }
    
    public <T> void f(final Callable<T> callable, final d<T> d) {
        this.e(new Runnable() {
            final /* synthetic */ Handler H = androidx.core.provider.b.a();
            
            @Override
            public void run() {
                Object call;
                try {
                    call = callable.call();
                }
                catch (Exception ex) {
                    call = null;
                }
                this.H.post((Runnable)new Runnable() {
                    @Override
                    public void run() {
                        d.a(call);
                    }
                });
            }
        });
    }
    
    public <T> T g(final Callable<T> p0, final int p1) throws InterruptedException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/concurrent/locks/ReentrantLock.<init>:()V
        //     7: astore_3       
        //     8: aload_3        
        //     9: invokevirtual   java/util/concurrent/locks/ReentrantLock.newCondition:()Ljava/util/concurrent/locks/Condition;
        //    12: astore          4
        //    14: new             Ljava/util/concurrent/atomic/AtomicReference;
        //    17: dup            
        //    18: invokespecial   java/util/concurrent/atomic/AtomicReference.<init>:()V
        //    21: astore          5
        //    23: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //    26: dup            
        //    27: iconst_1       
        //    28: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //    31: astore          6
        //    33: aload_0        
        //    34: new             Landroidx/core/provider/h$c;
        //    37: dup            
        //    38: aload_0        
        //    39: aload           5
        //    41: aload_1        
        //    42: aload_3        
        //    43: aload           6
        //    45: aload           4
        //    47: invokespecial   androidx/core/provider/h$c.<init>:(Landroidx/core/provider/h;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/Callable;Ljava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/locks/Condition;)V
        //    50: invokespecial   androidx/core/provider/h.e:(Ljava/lang/Runnable;)V
        //    53: aload_3        
        //    54: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //    57: aload           6
        //    59: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //    62: ifne            77
        //    65: aload           5
        //    67: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //    70: astore_1       
        //    71: aload_3        
        //    72: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //    75: aload_1        
        //    76: areturn        
        //    77: getstatic       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //    80: iload_2        
        //    81: i2l            
        //    82: invokevirtual   java/util/concurrent/TimeUnit.toNanos:(J)J
        //    85: lstore          7
        //    87: aload           4
        //    89: lload           7
        //    91: invokeinterface java/util/concurrent/locks/Condition.awaitNanos:(J)J
        //    96: lstore          9
        //    98: lload           9
        //   100: lstore          7
        //   102: aload           6
        //   104: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //   107: ifne            122
        //   110: aload           5
        //   112: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //   115: astore_1       
        //   116: aload_3        
        //   117: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   120: aload_1        
        //   121: areturn        
        //   122: lload           7
        //   124: lconst_0       
        //   125: lcmp           
        //   126: ifle            132
        //   129: goto            87
        //   132: new             Ljava/lang/InterruptedException;
        //   135: astore_1       
        //   136: aload_1        
        //   137: ldc             "timeout"
        //   139: invokespecial   java/lang/InterruptedException.<init>:(Ljava/lang/String;)V
        //   142: aload_1        
        //   143: athrow         
        //   144: astore_1       
        //   145: aload_3        
        //   146: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   149: aload_1        
        //   150: athrow         
        //   151: astore_1       
        //   152: goto            102
        //    Exceptions:
        //  throws java.lang.InterruptedException
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/util/concurrent/Callable<TT;>;I)TT;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  57     71     144    151    Any
        //  77     87     144    151    Any
        //  87     98     151    155    Ljava/lang/InterruptedException;
        //  87     98     144    151    Any
        //  102    116    144    151    Any
        //  132    144    144    151    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0087:
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
    
    public interface d<T>
    {
        void a(final T p0);
    }
}
