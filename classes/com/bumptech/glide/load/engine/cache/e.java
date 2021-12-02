// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.load.g;
import java.io.IOException;
import java.io.File;

public class e implements a
{
    private static final String f = "DiskLruCacheWrapper";
    private static final int g = 1;
    private static final int h = 1;
    private static e i;
    private final m a;
    private final File b;
    private final long c;
    private final c d;
    private com.bumptech.glide.disklrucache.a e;
    
    @Deprecated
    protected e(final File b, final long c) {
        this.d = new c();
        this.b = b;
        this.c = c;
        this.a = new m();
    }
    
    public static a d(final File file, final long n) {
        return new e(file, n);
    }
    
    @Deprecated
    public static a e(final File file, final long n) {
        synchronized (e.class) {
            if (e.i == null) {
                e.i = new e(file, n);
            }
            return e.i;
        }
    }
    
    private com.bumptech.glide.disklrucache.a f() throws IOException {
        synchronized (this) {
            if (this.e == null) {
                this.e = com.bumptech.glide.disklrucache.a.H(this.b, 1, 1, this.c);
            }
            return this.e;
        }
    }
    
    private void g() {
        synchronized (this) {
            this.e = null;
        }
    }
    
    @Override
    public void a(g t, final b b) {
        final String b2 = this.a.b(t);
        this.d.a(b2);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(b2);
                sb.append(" for for Key: ");
                sb.append(t);
                Log.v("DiskLruCacheWrapper", sb.toString());
            }
            try {
                final com.bumptech.glide.disklrucache.a f = this.f();
                if (f.y(b2) != null) {
                    return;
                }
                t = (g)f.t(b2);
                if (t != null) {
                    try {
                        if (b.a(((com.bumptech.glide.disklrucache.a.c)t).f(0))) {
                            ((com.bumptech.glide.disklrucache.a.c)t).e();
                        }
                        return;
                    }
                    finally {
                        ((com.bumptech.glide.disklrucache.a.c)t).b();
                    }
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Had two simultaneous puts for: ");
                sb2.append(b2);
                throw new IllegalStateException(sb2.toString());
            }
            catch (IOException ex) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", (Throwable)ex);
                }
            }
        }
        finally {
            this.d.b(b2);
        }
    }
    
    @Override
    public File b(final g obj) {
        final String b = this.a.b(obj);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(b);
            sb.append(" for for Key: ");
            sb.append(obj);
            Log.v("DiskLruCacheWrapper", sb.toString());
        }
        final File file = null;
        File b2;
        try {
            final com.bumptech.glide.disklrucache.a.e y = this.f().y(b);
            b2 = file;
            if (y != null) {
                b2 = y.b(0);
            }
        }
        catch (IOException ex) {
            b2 = file;
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", (Throwable)ex);
                b2 = file;
            }
        }
        return b2;
    }
    
    @Override
    public void c(final g g) {
        final String b = this.a.b(g);
        try {
            this.f().N(b);
        }
        catch (IOException ex) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", (Throwable)ex);
            }
        }
    }
    
    @Override
    public void clear() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: invokespecial   com/bumptech/glide/load/engine/cache/e.f:()Lcom/bumptech/glide/disklrucache/a;
        //     6: invokevirtual   com/bumptech/glide/disklrucache/a.r:()V
        //     9: aload_0        
        //    10: invokespecial   com/bumptech/glide/load/engine/cache/e.g:()V
        //    13: goto            42
        //    16: astore_1       
        //    17: goto            45
        //    20: astore_1       
        //    21: ldc             "DiskLruCacheWrapper"
        //    23: iconst_5       
        //    24: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //    27: ifeq            9
        //    30: ldc             "DiskLruCacheWrapper"
        //    32: ldc             "Unable to clear disk cache or disk cache cleared externally"
        //    34: aload_1        
        //    35: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    38: pop            
        //    39: goto            9
        //    42: aload_0        
        //    43: monitorexit    
        //    44: return         
        //    45: aload_0        
        //    46: invokespecial   com/bumptech/glide/load/engine/cache/e.g:()V
        //    49: aload_1        
        //    50: athrow         
        //    51: astore_1       
        //    52: aload_0        
        //    53: monitorexit    
        //    54: aload_1        
        //    55: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      9      20     42     Ljava/io/IOException;
        //  2      9      16     20     Any
        //  9      13     51     56     Any
        //  21     39     16     20     Any
        //  45     51     51     56     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0009:
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
}
