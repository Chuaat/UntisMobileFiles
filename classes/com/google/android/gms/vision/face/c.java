// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.face;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import android.util.Log;
import com.google.android.gms.vision.face.internal.client.h;
import d6.a;
import com.google.android.gms.vision.face.internal.client.d;
import com.google.android.gms.vision.l;
import com.google.android.gms.vision.b;

public final class c extends b<b>
{
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    private final l c;
    @d6.a("lock")
    private final d d;
    private final Object e;
    @d6.a("lock")
    private boolean f;
    
    private c() {
        this.c = new l();
        this.e = new Object();
        this.f = true;
        throw new IllegalStateException("Default constructor called");
    }
    
    private c(final d d) {
        this.c = new l();
        this.e = new Object();
        this.f = true;
        this.d = d;
    }
    
    private static boolean h(final h h) {
        final int g = h.G;
        final boolean b = false;
        boolean b2;
        if (g != 2 && h.H == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            b2 = false;
        }
        else {
            b2 = true;
        }
        if (h.H == 2 && h.I == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
            b2 = b;
        }
        return b2;
    }
    
    @RecentlyNonNull
    @Override
    public final SparseArray<b> a(@RecentlyNonNull final com.google.android.gms.vision.d p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnull          298
        //     4: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     7: bipush          19
        //     9: if_icmplt       92
        //    12: aload_1        
        //    13: invokevirtual   com/google/android/gms/vision/d.d:()[Landroid/media/Image$Plane;
        //    16: ifnull          92
        //    19: aload_1        
        //    20: invokevirtual   com/google/android/gms/vision/d.d:()[Landroid/media/Image$Plane;
        //    23: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //    26: checkcast       [Landroid/media/Image$Plane;
        //    29: arraylength    
        //    30: iconst_3       
        //    31: if_icmpne       92
        //    34: aload_0        
        //    35: getfield        com/google/android/gms/vision/face/c.e:Ljava/lang/Object;
        //    38: astore_2       
        //    39: aload_2        
        //    40: monitorenter   
        //    41: aload_0        
        //    42: getfield        com/google/android/gms/vision/face/c.f:Z
        //    45: ifeq            75
        //    48: aload_0        
        //    49: getfield        com/google/android/gms/vision/face/c.d:Lcom/google/android/gms/vision/face/internal/client/d;
        //    52: aload_1        
        //    53: invokevirtual   com/google/android/gms/vision/d.d:()[Landroid/media/Image$Plane;
        //    56: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //    59: checkcast       [Landroid/media/Image$Plane;
        //    62: aload_1        
        //    63: invokestatic    com/google/android/gms/internal/vision/oa.M:(Lcom/google/android/gms/vision/d;)Lcom/google/android/gms/internal/vision/oa;
        //    66: invokevirtual   com/google/android/gms/vision/face/internal/client/d.i:([Landroid/media/Image$Plane;Lcom/google/android/gms/internal/vision/oa;)[Lcom/google/android/gms/vision/face/b;
        //    69: astore_1       
        //    70: aload_2        
        //    71: monitorexit    
        //    72: goto            157
        //    75: new             Ljava/lang/IllegalStateException;
        //    78: astore_1       
        //    79: aload_1        
        //    80: ldc             "Cannot use detector after release()"
        //    82: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    85: aload_1        
        //    86: athrow         
        //    87: astore_1       
        //    88: aload_2        
        //    89: monitorexit    
        //    90: aload_1        
        //    91: athrow         
        //    92: aload_1        
        //    93: invokevirtual   com/google/android/gms/vision/d.a:()Landroid/graphics/Bitmap;
        //    96: ifnull          117
        //    99: aload_1        
        //   100: invokevirtual   com/google/android/gms/vision/d.a:()Landroid/graphics/Bitmap;
        //   103: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //   106: checkcast       Landroid/graphics/Bitmap;
        //   109: iconst_1       
        //   110: invokestatic    com/google/android/gms/internal/vision/sa.b:(Landroid/graphics/Bitmap;Z)Ljava/nio/ByteBuffer;
        //   113: astore_2       
        //   114: goto            122
        //   117: aload_1        
        //   118: invokevirtual   com/google/android/gms/vision/d.b:()Ljava/nio/ByteBuffer;
        //   121: astore_2       
        //   122: aload_0        
        //   123: getfield        com/google/android/gms/vision/face/c.e:Ljava/lang/Object;
        //   126: astore_3       
        //   127: aload_3        
        //   128: monitorenter   
        //   129: aload_0        
        //   130: getfield        com/google/android/gms/vision/face/c.f:Z
        //   133: ifeq            281
        //   136: aload_0        
        //   137: getfield        com/google/android/gms/vision/face/c.d:Lcom/google/android/gms/vision/face/internal/client/d;
        //   140: aload_2        
        //   141: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //   144: checkcast       Ljava/nio/ByteBuffer;
        //   147: aload_1        
        //   148: invokestatic    com/google/android/gms/internal/vision/oa.M:(Lcom/google/android/gms/vision/d;)Lcom/google/android/gms/internal/vision/oa;
        //   151: invokevirtual   com/google/android/gms/vision/face/internal/client/d.h:(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/vision/oa;)[Lcom/google/android/gms/vision/face/b;
        //   154: astore_1       
        //   155: aload_3        
        //   156: monitorexit    
        //   157: new             Ljava/util/HashSet;
        //   160: dup            
        //   161: invokespecial   java/util/HashSet.<init>:()V
        //   164: astore_2       
        //   165: new             Landroid/util/SparseArray;
        //   168: dup            
        //   169: aload_1        
        //   170: arraylength    
        //   171: invokespecial   android/util/SparseArray.<init>:(I)V
        //   174: astore_3       
        //   175: aload_1        
        //   176: arraylength    
        //   177: istore          4
        //   179: iconst_0       
        //   180: istore          5
        //   182: iconst_0       
        //   183: istore          6
        //   185: iload           5
        //   187: iload           4
        //   189: if_icmpge       279
        //   192: aload_1        
        //   193: iload           5
        //   195: aaload         
        //   196: astore          7
        //   198: aload           7
        //   200: invokevirtual   com/google/android/gms/vision/face/b.f:()I
        //   203: istore          8
        //   205: iload           6
        //   207: iload           8
        //   209: invokestatic    java/lang/Math.max:(II)I
        //   212: istore          9
        //   214: iload           9
        //   216: istore          6
        //   218: iload           8
        //   220: istore          10
        //   222: aload_2        
        //   223: iload           8
        //   225: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   228: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   233: ifeq            246
        //   236: iload           9
        //   238: iconst_1       
        //   239: iadd           
        //   240: istore          10
        //   242: iload           10
        //   244: istore          6
        //   246: aload_2        
        //   247: iload           10
        //   249: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   252: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   257: pop            
        //   258: aload_3        
        //   259: aload_0        
        //   260: getfield        com/google/android/gms/vision/face/c.c:Lcom/google/android/gms/vision/l;
        //   263: iload           10
        //   265: invokevirtual   com/google/android/gms/vision/l.a:(I)I
        //   268: aload           7
        //   270: invokevirtual   android/util/SparseArray.append:(ILjava/lang/Object;)V
        //   273: iinc            5, 1
        //   276: goto            185
        //   279: aload_3        
        //   280: areturn        
        //   281: new             Ljava/lang/IllegalStateException;
        //   284: astore_1       
        //   285: aload_1        
        //   286: ldc             "Cannot use detector after release()"
        //   288: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   291: aload_1        
        //   292: athrow         
        //   293: astore_1       
        //   294: aload_3        
        //   295: monitorexit    
        //   296: aload_1        
        //   297: athrow         
        //   298: new             Ljava/lang/IllegalArgumentException;
        //   301: dup            
        //   302: ldc             "No frame supplied."
        //   304: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   307: athrow         
        //    Signature:
        //  (Lcom/google/android/gms/vision/d;)Landroid/util/SparseArray<Lcom/google/android/gms/vision/face/b;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  41     72     87     92     Any
        //  75     87     87     92     Any
        //  88     90     87     92     Any
        //  129    157    293    298    Any
        //  281    293    293    298    Any
        //  294    296    293    298    Any
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
    public final boolean b() {
        return this.d.c();
    }
    
    @Override
    public final void d() {
        super.d();
        synchronized (this.e) {
            if (!this.f) {
                return;
            }
            this.d.d();
            this.f = false;
        }
    }
    
    @Override
    public final boolean e(int b) {
        b = this.c.b(b);
        synchronized (this.e) {
            if (this.f) {
                return this.d.g(b);
            }
            throw new RuntimeException("Cannot use detector after release()");
        }
    }
    
    @Override
    protected final void finalize() throws Throwable {
        try {
            synchronized (this.e) {
                if (this.f) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    this.d();
                }
            }
        }
        finally {
            super.finalize();
        }
    }
    
    public static class a
    {
        private final Context a;
        private int b;
        private boolean c;
        private int d;
        private boolean e;
        private int f;
        private float g;
        
        public a(@RecentlyNonNull final Context a) {
            this.b = 0;
            this.c = false;
            this.d = 0;
            this.e = true;
            this.f = 0;
            this.g = -1.0f;
            this.a = a;
        }
        
        @RecentlyNonNull
        public c a() {
            final h h = new h();
            h.G = this.f;
            h.H = this.b;
            h.I = this.d;
            h.J = this.c;
            h.K = this.e;
            h.L = this.g;
            if (h(h)) {
                return new c(new d(this.a, h), null);
            }
            throw new IllegalArgumentException("Invalid build options");
        }
        
        @RecentlyNonNull
        public a b(final int n) {
            if (n != 0 && n != 1) {
                final StringBuilder sb = new StringBuilder(40);
                sb.append("Invalid classification type: ");
                sb.append(n);
                throw new IllegalArgumentException(sb.toString());
            }
            this.d = n;
            return this;
        }
        
        @RecentlyNonNull
        public a c(final int n) {
            if (n != 0 && n != 1 && n != 2) {
                final StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid landmark type: ");
                sb.append(n);
                throw new IllegalArgumentException(sb.toString());
            }
            this.b = n;
            return this;
        }
        
        @RecentlyNonNull
        public a d(final float n) {
            if (n >= 0.0f && n <= 1.0f) {
                this.g = n;
                return this;
            }
            final StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid proportional face size: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        
        @RecentlyNonNull
        public a e(final int n) {
            if (n != 0 && n != 1 && n != 2) {
                final StringBuilder sb = new StringBuilder(25);
                sb.append("Invalid mode: ");
                sb.append(n);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f = n;
            return this;
        }
        
        @RecentlyNonNull
        public a f(final boolean c) {
            this.c = c;
            return this;
        }
        
        @RecentlyNonNull
        public a g(final boolean e) {
            this.e = e;
            return this;
        }
    }
}
