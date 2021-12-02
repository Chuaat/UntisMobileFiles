// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request;

import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.util.m;
import com.bumptech.glide.load.resource.bitmap.l;
import androidx.annotation.t;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.resource.bitmap.u;
import androidx.annotation.s;
import androidx.annotation.b0;
import com.bumptech.glide.util.k;
import com.bumptech.glide.load.resource.bitmap.e;
import android.graphics.Bitmap$CompressFormat;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.p;
import com.bumptech.glide.util.b;
import com.bumptech.glide.signature.c;
import android.content.res.Resources$Theme;
import com.bumptech.glide.load.n;
import java.util.Map;
import com.bumptech.glide.load.g;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.h;
import androidx.annotation.j0;
import com.bumptech.glide.load.engine.j;

public abstract class a<T extends a<T>> implements Cloneable
{
    private static final int A0 = 1048576;
    private static final int g0 = -1;
    private static final int h0 = 2;
    private static final int i0 = 4;
    private static final int j0 = 8;
    private static final int k0 = 16;
    private static final int l0 = 32;
    private static final int m0 = 64;
    private static final int n0 = 128;
    private static final int o0 = 256;
    private static final int p0 = 512;
    private static final int q0 = 1024;
    private static final int r0 = 2048;
    private static final int s0 = 4096;
    private static final int t0 = 8192;
    private static final int u0 = 16384;
    private static final int v0 = 32768;
    private static final int w0 = 65536;
    private static final int x0 = 131072;
    private static final int y0 = 262144;
    private static final int z0 = 524288;
    private int G;
    private float H;
    @j0
    private j I;
    @j0
    private h J;
    @k0
    private Drawable K;
    private int L;
    @k0
    private Drawable M;
    private int N;
    private boolean O;
    private int P;
    private int Q;
    @j0
    private g R;
    private boolean S;
    private boolean T;
    @k0
    private Drawable U;
    private int V;
    @j0
    private com.bumptech.glide.load.j W;
    @j0
    private Map<Class<?>, n<?>> X;
    @j0
    private Class<?> Y;
    private boolean Z;
    @k0
    private Resources$Theme a0;
    private boolean b0;
    private boolean c0;
    private boolean d0;
    private boolean e0;
    private boolean f0;
    
    public a() {
        this.H = 1.0f;
        this.I = j.e;
        this.J = h.I;
        this.O = true;
        this.P = -1;
        this.Q = -1;
        this.R = c.c();
        this.T = true;
        this.W = new com.bumptech.glide.load.j();
        this.X = new b<Class<?>, n<?>>();
        this.Y = Object.class;
        this.e0 = true;
    }
    
    @j0
    private T H0(@j0 final p p2, @j0 final n<Bitmap> n) {
        return this.I0(p2, n, true);
    }
    
    @j0
    private T I0(@j0 final p p3, @j0 final n<Bitmap> n, final boolean b) {
        a<T> a;
        if (b) {
            a = (a<T>)this.T0(p3, n);
        }
        else {
            a = (a<T>)this.A0(p3, n);
        }
        a.e0 = true;
        return (T)a;
    }
    
    private T J0() {
        return (T)this;
    }
    
    @j0
    private T K0() {
        if (!this.Z) {
            return this.J0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }
    
    private boolean l0(final int n) {
        return m0(this.G, n);
    }
    
    private static boolean m0(final int n, final int n2) {
        return (n & n2) != 0x0;
    }
    
    @j0
    private T y0(@j0 final p p2, @j0 final n<Bitmap> n) {
        return this.I0(p2, n, false);
    }
    
    @j0
    @androidx.annotation.j
    public T A(@j0 final Bitmap$CompressFormat bitmap$CompressFormat) {
        return this.L0(e.c, (Bitmap$CompressFormat)k.d((Y)bitmap$CompressFormat));
    }
    
    @j0
    final T A0(@j0 final p p0, @j0 final n<Bitmap> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            17
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: aload_1        
        //    12: aload_2        
        //    13: invokevirtual   com/bumptech/glide/request/a.A0:(Lcom/bumptech/glide/load/resource/bitmap/p;Lcom/bumptech/glide/load/n;)Lcom/bumptech/glide/request/a;
        //    16: areturn        
        //    17: aload_0        
        //    18: aload_1        
        //    19: invokevirtual   com/bumptech/glide/request/a.z:(Lcom/bumptech/glide/load/resource/bitmap/p;)Lcom/bumptech/glide/request/a;
        //    22: pop            
        //    23: aload_0        
        //    24: aload_2        
        //    25: iconst_0       
        //    26: invokevirtual   com/bumptech/glide/request/a.S0:(Lcom/bumptech/glide/load/n;Z)Lcom/bumptech/glide/request/a;
        //    29: areturn        
        //    Signature:
        //  (Lcom/bumptech/glide/load/resource/bitmap/p;Lcom/bumptech/glide/load/n<Landroid/graphics/Bitmap;>;)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T B(@b0(from = 0L, to = 100L) final int i) {
        return this.L0(e.b, i);
    }
    
    @j0
    @androidx.annotation.j
    public <Y> T B0(@j0 final Class<Y> clazz, @j0 final n<Y> n) {
        return this.V0(clazz, n, false);
    }
    
    @j0
    @androidx.annotation.j
    public T C(@s final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: iload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.C:(I)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_0        
        //    17: iload_1        
        //    18: putfield        com/bumptech/glide/request/a.L:I
        //    21: aload_0        
        //    22: getfield        com/bumptech/glide/request/a.G:I
        //    25: bipush          32
        //    27: ior            
        //    28: istore_1       
        //    29: aload_0        
        //    30: iload_1        
        //    31: putfield        com/bumptech/glide/request/a.G:I
        //    34: aload_0        
        //    35: aconst_null    
        //    36: putfield        com/bumptech/glide/request/a.K:Landroid/graphics/drawable/Drawable;
        //    39: aload_0        
        //    40: iload_1        
        //    41: bipush          -17
        //    43: iand           
        //    44: putfield        com/bumptech/glide/request/a.G:I
        //    47: aload_0        
        //    48: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    51: areturn        
        //    Signature:
        //  (I)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T C0(final int n) {
        return this.D0(n, n);
    }
    
    @j0
    @androidx.annotation.j
    public T D(@k0 final Drawable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: aload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.D:(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_0        
        //    17: aload_1        
        //    18: putfield        com/bumptech/glide/request/a.K:Landroid/graphics/drawable/Drawable;
        //    21: aload_0        
        //    22: getfield        com/bumptech/glide/request/a.G:I
        //    25: bipush          16
        //    27: ior            
        //    28: istore_2       
        //    29: aload_0        
        //    30: iload_2        
        //    31: putfield        com/bumptech/glide/request/a.G:I
        //    34: aload_0        
        //    35: iconst_0       
        //    36: putfield        com/bumptech/glide/request/a.L:I
        //    39: aload_0        
        //    40: iload_2        
        //    41: bipush          -33
        //    43: iand           
        //    44: putfield        com/bumptech/glide/request/a.G:I
        //    47: aload_0        
        //    48: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    51: areturn        
        //    Signature:
        //  (Landroid/graphics/drawable/Drawable;)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T D0(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            17
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: iload_1        
        //    12: iload_2        
        //    13: invokevirtual   com/bumptech/glide/request/a.D0:(II)Lcom/bumptech/glide/request/a;
        //    16: areturn        
        //    17: aload_0        
        //    18: iload_1        
        //    19: putfield        com/bumptech/glide/request/a.Q:I
        //    22: aload_0        
        //    23: iload_2        
        //    24: putfield        com/bumptech/glide/request/a.P:I
        //    27: aload_0        
        //    28: aload_0        
        //    29: getfield        com/bumptech/glide/request/a.G:I
        //    32: sipush          512
        //    35: ior            
        //    36: putfield        com/bumptech/glide/request/a.G:I
        //    39: aload_0        
        //    40: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    43: areturn        
        //    Signature:
        //  (II)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T E(@s final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: iload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.E:(I)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_0        
        //    17: iload_1        
        //    18: putfield        com/bumptech/glide/request/a.V:I
        //    21: aload_0        
        //    22: getfield        com/bumptech/glide/request/a.G:I
        //    25: sipush          16384
        //    28: ior            
        //    29: istore_1       
        //    30: aload_0        
        //    31: iload_1        
        //    32: putfield        com/bumptech/glide/request/a.G:I
        //    35: aload_0        
        //    36: aconst_null    
        //    37: putfield        com/bumptech/glide/request/a.U:Landroid/graphics/drawable/Drawable;
        //    40: aload_0        
        //    41: iload_1        
        //    42: sipush          -8193
        //    45: iand           
        //    46: putfield        com/bumptech/glide/request/a.G:I
        //    49: aload_0        
        //    50: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    53: areturn        
        //    Signature:
        //  (I)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T E0(@s final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: iload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.E0:(I)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_0        
        //    17: iload_1        
        //    18: putfield        com/bumptech/glide/request/a.N:I
        //    21: aload_0        
        //    22: getfield        com/bumptech/glide/request/a.G:I
        //    25: sipush          128
        //    28: ior            
        //    29: istore_1       
        //    30: aload_0        
        //    31: iload_1        
        //    32: putfield        com/bumptech/glide/request/a.G:I
        //    35: aload_0        
        //    36: aconst_null    
        //    37: putfield        com/bumptech/glide/request/a.M:Landroid/graphics/drawable/Drawable;
        //    40: aload_0        
        //    41: iload_1        
        //    42: bipush          -65
        //    44: iand           
        //    45: putfield        com/bumptech/glide/request/a.G:I
        //    48: aload_0        
        //    49: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    52: areturn        
        //    Signature:
        //  (I)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T F(@k0 final Drawable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: aload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.F:(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_0        
        //    17: aload_1        
        //    18: putfield        com/bumptech/glide/request/a.U:Landroid/graphics/drawable/Drawable;
        //    21: aload_0        
        //    22: getfield        com/bumptech/glide/request/a.G:I
        //    25: sipush          8192
        //    28: ior            
        //    29: istore_2       
        //    30: aload_0        
        //    31: iload_2        
        //    32: putfield        com/bumptech/glide/request/a.G:I
        //    35: aload_0        
        //    36: iconst_0       
        //    37: putfield        com/bumptech/glide/request/a.V:I
        //    40: aload_0        
        //    41: iload_2        
        //    42: sipush          -16385
        //    45: iand           
        //    46: putfield        com/bumptech/glide/request/a.G:I
        //    49: aload_0        
        //    50: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    53: areturn        
        //    Signature:
        //  (Landroid/graphics/drawable/Drawable;)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T F0(@k0 final Drawable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: aload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.F0:(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_0        
        //    17: aload_1        
        //    18: putfield        com/bumptech/glide/request/a.M:Landroid/graphics/drawable/Drawable;
        //    21: aload_0        
        //    22: getfield        com/bumptech/glide/request/a.G:I
        //    25: bipush          64
        //    27: ior            
        //    28: istore_2       
        //    29: aload_0        
        //    30: iload_2        
        //    31: putfield        com/bumptech/glide/request/a.G:I
        //    34: aload_0        
        //    35: iconst_0       
        //    36: putfield        com/bumptech/glide/request/a.N:I
        //    39: aload_0        
        //    40: iload_2        
        //    41: sipush          -129
        //    44: iand           
        //    45: putfield        com/bumptech/glide/request/a.G:I
        //    48: aload_0        
        //    49: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    52: areturn        
        //    Signature:
        //  (Landroid/graphics/drawable/Drawable;)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T G0(@j0 final h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: aload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.G0:(Lcom/bumptech/glide/h;)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_0        
        //    17: aload_1        
        //    18: invokestatic    com/bumptech/glide/util/k.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //    21: checkcast       Lcom/bumptech/glide/h;
        //    24: putfield        com/bumptech/glide/request/a.J:Lcom/bumptech/glide/h;
        //    27: aload_0        
        //    28: aload_0        
        //    29: getfield        com/bumptech/glide/request/a.G:I
        //    32: bipush          8
        //    34: ior            
        //    35: putfield        com/bumptech/glide/request/a.G:I
        //    38: aload_0        
        //    39: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    42: areturn        
        //    Signature:
        //  (Lcom/bumptech/glide/h;)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T H() {
        return this.H0(p.c, new u());
    }
    
    @j0
    @androidx.annotation.j
    public T I(@j0 final com.bumptech.glide.load.b p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    com/bumptech/glide/util/k.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //     4: pop            
        //     5: aload_0        
        //     6: getstatic       com/bumptech/glide/load/resource/bitmap/q.g:Lcom/bumptech/glide/load/i;
        //     9: aload_1        
        //    10: invokevirtual   com/bumptech/glide/request/a.L0:(Lcom/bumptech/glide/load/i;Ljava/lang/Object;)Lcom/bumptech/glide/request/a;
        //    13: getstatic       com/bumptech/glide/load/resource/gif/i.a:Lcom/bumptech/glide/load/i;
        //    16: aload_1        
        //    17: invokevirtual   com/bumptech/glide/request/a.L0:(Lcom/bumptech/glide/load/i;Ljava/lang/Object;)Lcom/bumptech/glide/request/a;
        //    20: areturn        
        //    Signature:
        //  (Lcom/bumptech/glide/load/b;)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T J(@b0(from = 0L) final long l) {
        return this.L0(com.bumptech.glide.load.resource.bitmap.j0.g, l);
    }
    
    @j0
    public final j L() {
        return this.I;
    }
    
    @j0
    @androidx.annotation.j
    public <Y> T L0(@j0 final i<Y> p0, @j0 final Y p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            17
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: aload_1        
        //    12: aload_2        
        //    13: invokevirtual   com/bumptech/glide/request/a.L0:(Lcom/bumptech/glide/load/i;Ljava/lang/Object;)Lcom/bumptech/glide/request/a;
        //    16: areturn        
        //    17: aload_1        
        //    18: invokestatic    com/bumptech/glide/util/k.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //    21: pop            
        //    22: aload_2        
        //    23: invokestatic    com/bumptech/glide/util/k.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //    26: pop            
        //    27: aload_0        
        //    28: getfield        com/bumptech/glide/request/a.W:Lcom/bumptech/glide/load/j;
        //    31: aload_1        
        //    32: aload_2        
        //    33: invokevirtual   com/bumptech/glide/load/j.e:(Lcom/bumptech/glide/load/i;Ljava/lang/Object;)Lcom/bumptech/glide/load/j;
        //    36: pop            
        //    37: aload_0        
        //    38: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    41: areturn        
        //    Signature:
        //  <Y:Ljava/lang/Object;>(Lcom/bumptech/glide/load/i<TY;>;TY;)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T M0(@j0 final g p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: aload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.M0:(Lcom/bumptech/glide/load/g;)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_0        
        //    17: aload_1        
        //    18: invokestatic    com/bumptech/glide/util/k.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //    21: checkcast       Lcom/bumptech/glide/load/g;
        //    24: putfield        com/bumptech/glide/request/a.R:Lcom/bumptech/glide/load/g;
        //    27: aload_0        
        //    28: aload_0        
        //    29: getfield        com/bumptech/glide/request/a.G:I
        //    32: sipush          1024
        //    35: ior            
        //    36: putfield        com/bumptech/glide/request/a.G:I
        //    39: aload_0        
        //    40: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    43: areturn        
        //    Signature:
        //  (Lcom/bumptech/glide/load/g;)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    public final int N() {
        return this.L;
    }
    
    @j0
    @androidx.annotation.j
    public T N0(@t(from = 0.0, to = 1.0) final float p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: fload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.N0:(F)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: fload_1        
        //    17: fconst_0       
        //    18: fcmpg          
        //    19: iflt            48
        //    22: fload_1        
        //    23: fconst_1       
        //    24: fcmpl          
        //    25: ifgt            48
        //    28: aload_0        
        //    29: fload_1        
        //    30: putfield        com/bumptech/glide/request/a.H:F
        //    33: aload_0        
        //    34: aload_0        
        //    35: getfield        com/bumptech/glide/request/a.G:I
        //    38: iconst_2       
        //    39: ior            
        //    40: putfield        com/bumptech/glide/request/a.G:I
        //    43: aload_0        
        //    44: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    47: areturn        
        //    48: new             Ljava/lang/IllegalArgumentException;
        //    51: dup            
        //    52: ldc_w           "sizeMultiplier must be between 0 and 1"
        //    55: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    58: athrow         
        //    Signature:
        //  (F)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @k0
    public final Drawable O() {
        return this.K;
    }
    
    @j0
    @androidx.annotation.j
    public T O0(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: iconst_1       
        //    12: invokevirtual   com/bumptech/glide/request/a.O0:(Z)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_0        
        //    17: iload_1        
        //    18: iconst_1       
        //    19: ixor           
        //    20: putfield        com/bumptech/glide/request/a.O:Z
        //    23: aload_0        
        //    24: aload_0        
        //    25: getfield        com/bumptech/glide/request/a.G:I
        //    28: sipush          256
        //    31: ior            
        //    32: putfield        com/bumptech/glide/request/a.G:I
        //    35: aload_0        
        //    36: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    39: areturn        
        //    Signature:
        //  (Z)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @k0
    public final Drawable P() {
        return this.U;
    }
    
    @j0
    @androidx.annotation.j
    public T P0(@k0 final Resources$Theme p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: aload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.P0:(Landroid/content/res/Resources$Theme;)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_0        
        //    17: aload_1        
        //    18: putfield        com/bumptech/glide/request/a.a0:Landroid/content/res/Resources$Theme;
        //    21: aload_0        
        //    22: aload_0        
        //    23: getfield        com/bumptech/glide/request/a.G:I
        //    26: ldc             32768
        //    28: ior            
        //    29: putfield        com/bumptech/glide/request/a.G:I
        //    32: aload_0        
        //    33: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    36: areturn        
        //    Signature:
        //  (Landroid/content/res/Resources$Theme;)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    public final int Q() {
        return this.V;
    }
    
    @j0
    @androidx.annotation.j
    public T Q0(@b0(from = 0L) final int i) {
        return this.L0(com.bumptech.glide.load.model.stream.b.b, i);
    }
    
    public final boolean R() {
        return this.d0;
    }
    
    @j0
    @androidx.annotation.j
    public T R0(@j0 final n<Bitmap> n) {
        return this.S0(n, true);
    }
    
    @j0
    public final com.bumptech.glide.load.j S() {
        return this.W;
    }
    
    @j0
    T S0(@j0 final n<Bitmap> p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     4: ifeq            17
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: aload_1        
        //    12: iload_2        
        //    13: invokevirtual   com/bumptech/glide/request/a.S0:(Lcom/bumptech/glide/load/n;Z)Lcom/bumptech/glide/request/a;
        //    16: areturn        
        //    17: new             Lcom/bumptech/glide/load/resource/bitmap/s;
        //    20: dup            
        //    21: aload_1        
        //    22: iload_2        
        //    23: invokespecial   com/bumptech/glide/load/resource/bitmap/s.<init>:(Lcom/bumptech/glide/load/n;Z)V
        //    26: astore_3       
        //    27: aload_0        
        //    28: ldc_w           Landroid/graphics/Bitmap;.class
        //    31: aload_1        
        //    32: iload_2        
        //    33: invokevirtual   com/bumptech/glide/request/a.V0:(Ljava/lang/Class;Lcom/bumptech/glide/load/n;Z)Lcom/bumptech/glide/request/a;
        //    36: pop            
        //    37: aload_0        
        //    38: ldc_w           Landroid/graphics/drawable/Drawable;.class
        //    41: aload_3        
        //    42: iload_2        
        //    43: invokevirtual   com/bumptech/glide/request/a.V0:(Ljava/lang/Class;Lcom/bumptech/glide/load/n;Z)Lcom/bumptech/glide/request/a;
        //    46: pop            
        //    47: aload_0        
        //    48: ldc_w           Landroid/graphics/drawable/BitmapDrawable;.class
        //    51: aload_3        
        //    52: invokevirtual   com/bumptech/glide/load/resource/bitmap/s.c:()Lcom/bumptech/glide/load/n;
        //    55: iload_2        
        //    56: invokevirtual   com/bumptech/glide/request/a.V0:(Ljava/lang/Class;Lcom/bumptech/glide/load/n;Z)Lcom/bumptech/glide/request/a;
        //    59: pop            
        //    60: aload_0        
        //    61: ldc_w           Lcom/bumptech/glide/load/resource/gif/c;.class
        //    64: new             Lcom/bumptech/glide/load/resource/gif/f;
        //    67: dup            
        //    68: aload_1        
        //    69: invokespecial   com/bumptech/glide/load/resource/gif/f.<init>:(Lcom/bumptech/glide/load/n;)V
        //    72: iload_2        
        //    73: invokevirtual   com/bumptech/glide/request/a.V0:(Ljava/lang/Class;Lcom/bumptech/glide/load/n;Z)Lcom/bumptech/glide/request/a;
        //    76: pop            
        //    77: aload_0        
        //    78: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    81: areturn        
        //    Signature:
        //  (Lcom/bumptech/glide/load/n<Landroid/graphics/Bitmap;>;Z)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:759)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1011)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2515)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
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
    
    public final int T() {
        return this.P;
    }
    
    @j0
    @androidx.annotation.j
    final T T0(@j0 final p p0, @j0 final n<Bitmap> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            17
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: aload_1        
        //    12: aload_2        
        //    13: invokevirtual   com/bumptech/glide/request/a.T0:(Lcom/bumptech/glide/load/resource/bitmap/p;Lcom/bumptech/glide/load/n;)Lcom/bumptech/glide/request/a;
        //    16: areturn        
        //    17: aload_0        
        //    18: aload_1        
        //    19: invokevirtual   com/bumptech/glide/request/a.z:(Lcom/bumptech/glide/load/resource/bitmap/p;)Lcom/bumptech/glide/request/a;
        //    22: pop            
        //    23: aload_0        
        //    24: aload_2        
        //    25: invokevirtual   com/bumptech/glide/request/a.R0:(Lcom/bumptech/glide/load/n;)Lcom/bumptech/glide/request/a;
        //    28: areturn        
        //    Signature:
        //  (Lcom/bumptech/glide/load/resource/bitmap/p;Lcom/bumptech/glide/load/n<Landroid/graphics/Bitmap;>;)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    public final int U() {
        return this.Q;
    }
    
    @j0
    @androidx.annotation.j
    public <Y> T U0(@j0 final Class<Y> clazz, @j0 final n<Y> n) {
        return this.V0(clazz, n, true);
    }
    
    @k0
    public final Drawable V() {
        return this.M;
    }
    
    @j0
     <Y> T V0(@j0 final Class<Y> p0, @j0 final n<Y> p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     4: ifeq            18
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: aload_1        
        //    12: aload_2        
        //    13: iload_3        
        //    14: invokevirtual   com/bumptech/glide/request/a.V0:(Ljava/lang/Class;Lcom/bumptech/glide/load/n;Z)Lcom/bumptech/glide/request/a;
        //    17: areturn        
        //    18: aload_1        
        //    19: invokestatic    com/bumptech/glide/util/k.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //    22: pop            
        //    23: aload_2        
        //    24: invokestatic    com/bumptech/glide/util/k.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //    27: pop            
        //    28: aload_0        
        //    29: getfield        com/bumptech/glide/request/a.X:Ljava/util/Map;
        //    32: aload_1        
        //    33: aload_2        
        //    34: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    39: pop            
        //    40: aload_0        
        //    41: getfield        com/bumptech/glide/request/a.G:I
        //    44: sipush          2048
        //    47: ior            
        //    48: istore          4
        //    50: aload_0        
        //    51: iload           4
        //    53: putfield        com/bumptech/glide/request/a.G:I
        //    56: aload_0        
        //    57: iconst_1       
        //    58: putfield        com/bumptech/glide/request/a.T:Z
        //    61: iload           4
        //    63: ldc             65536
        //    65: ior            
        //    66: istore          4
        //    68: aload_0        
        //    69: iload           4
        //    71: putfield        com/bumptech/glide/request/a.G:I
        //    74: aload_0        
        //    75: iconst_0       
        //    76: putfield        com/bumptech/glide/request/a.e0:Z
        //    79: iload_3        
        //    80: ifeq            97
        //    83: aload_0        
        //    84: iload           4
        //    86: ldc             131072
        //    88: ior            
        //    89: putfield        com/bumptech/glide/request/a.G:I
        //    92: aload_0        
        //    93: iconst_1       
        //    94: putfield        com/bumptech/glide/request/a.S:Z
        //    97: aload_0        
        //    98: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //   101: areturn        
        //    Signature:
        //  <Y:Ljava/lang/Object;>(Ljava/lang/Class<TY;>;Lcom/bumptech/glide/load/n<TY;>;Z)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    public final int W() {
        return this.N;
    }
    
    @j0
    @androidx.annotation.j
    public T W0(@j0 final n<Bitmap>... array) {
        if (array.length > 1) {
            return this.S0(new com.bumptech.glide.load.h<Bitmap>(array), true);
        }
        if (array.length == 1) {
            return this.R0(array[0]);
        }
        return this.K0();
    }
    
    @j0
    public final h X() {
        return this.J;
    }
    
    @Deprecated
    @j0
    @androidx.annotation.j
    public T X0(@j0 final n<Bitmap>... array) {
        return this.S0(new com.bumptech.glide.load.h<Bitmap>(array), true);
    }
    
    @j0
    public final Class<?> Y() {
        return this.Y;
    }
    
    @j0
    @androidx.annotation.j
    public T Y0(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: iload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.Y0:(Z)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_0        
        //    17: iload_1        
        //    18: putfield        com/bumptech/glide/request/a.f0:Z
        //    21: aload_0        
        //    22: aload_0        
        //    23: getfield        com/bumptech/glide/request/a.G:I
        //    26: ldc             1048576
        //    28: ior            
        //    29: putfield        com/bumptech/glide/request/a.G:I
        //    32: aload_0        
        //    33: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    36: areturn        
        //    Signature:
        //  (Z)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    public final g Z() {
        return this.R;
    }
    
    @j0
    @androidx.annotation.j
    public T Z0(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: iload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.Z0:(Z)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_0        
        //    17: iload_1        
        //    18: putfield        com/bumptech/glide/request/a.c0:Z
        //    21: aload_0        
        //    22: aload_0        
        //    23: getfield        com/bumptech/glide/request/a.G:I
        //    26: ldc             262144
        //    28: ior            
        //    29: putfield        com/bumptech/glide/request/a.G:I
        //    32: aload_0        
        //    33: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    36: areturn        
        //    Signature:
        //  (Z)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T a(@j0 final a<?> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: aload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.a:(Lcom/bumptech/glide/request/a;)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_1        
        //    17: getfield        com/bumptech/glide/request/a.G:I
        //    20: iconst_2       
        //    21: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //    24: ifeq            35
        //    27: aload_0        
        //    28: aload_1        
        //    29: getfield        com/bumptech/glide/request/a.H:F
        //    32: putfield        com/bumptech/glide/request/a.H:F
        //    35: aload_1        
        //    36: getfield        com/bumptech/glide/request/a.G:I
        //    39: ldc             262144
        //    41: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //    44: ifeq            55
        //    47: aload_0        
        //    48: aload_1        
        //    49: getfield        com/bumptech/glide/request/a.c0:Z
        //    52: putfield        com/bumptech/glide/request/a.c0:Z
        //    55: aload_1        
        //    56: getfield        com/bumptech/glide/request/a.G:I
        //    59: ldc             1048576
        //    61: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //    64: ifeq            75
        //    67: aload_0        
        //    68: aload_1        
        //    69: getfield        com/bumptech/glide/request/a.f0:Z
        //    72: putfield        com/bumptech/glide/request/a.f0:Z
        //    75: aload_1        
        //    76: getfield        com/bumptech/glide/request/a.G:I
        //    79: iconst_4       
        //    80: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //    83: ifeq            94
        //    86: aload_0        
        //    87: aload_1        
        //    88: getfield        com/bumptech/glide/request/a.I:Lcom/bumptech/glide/load/engine/j;
        //    91: putfield        com/bumptech/glide/request/a.I:Lcom/bumptech/glide/load/engine/j;
        //    94: aload_1        
        //    95: getfield        com/bumptech/glide/request/a.G:I
        //    98: bipush          8
        //   100: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   103: ifeq            114
        //   106: aload_0        
        //   107: aload_1        
        //   108: getfield        com/bumptech/glide/request/a.J:Lcom/bumptech/glide/h;
        //   111: putfield        com/bumptech/glide/request/a.J:Lcom/bumptech/glide/h;
        //   114: aload_1        
        //   115: getfield        com/bumptech/glide/request/a.G:I
        //   118: bipush          16
        //   120: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   123: ifeq            150
        //   126: aload_0        
        //   127: aload_1        
        //   128: getfield        com/bumptech/glide/request/a.K:Landroid/graphics/drawable/Drawable;
        //   131: putfield        com/bumptech/glide/request/a.K:Landroid/graphics/drawable/Drawable;
        //   134: aload_0        
        //   135: iconst_0       
        //   136: putfield        com/bumptech/glide/request/a.L:I
        //   139: aload_0        
        //   140: aload_0        
        //   141: getfield        com/bumptech/glide/request/a.G:I
        //   144: bipush          -33
        //   146: iand           
        //   147: putfield        com/bumptech/glide/request/a.G:I
        //   150: aload_1        
        //   151: getfield        com/bumptech/glide/request/a.G:I
        //   154: bipush          32
        //   156: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   159: ifeq            186
        //   162: aload_0        
        //   163: aload_1        
        //   164: getfield        com/bumptech/glide/request/a.L:I
        //   167: putfield        com/bumptech/glide/request/a.L:I
        //   170: aload_0        
        //   171: aconst_null    
        //   172: putfield        com/bumptech/glide/request/a.K:Landroid/graphics/drawable/Drawable;
        //   175: aload_0        
        //   176: aload_0        
        //   177: getfield        com/bumptech/glide/request/a.G:I
        //   180: bipush          -17
        //   182: iand           
        //   183: putfield        com/bumptech/glide/request/a.G:I
        //   186: aload_1        
        //   187: getfield        com/bumptech/glide/request/a.G:I
        //   190: bipush          64
        //   192: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   195: ifeq            223
        //   198: aload_0        
        //   199: aload_1        
        //   200: getfield        com/bumptech/glide/request/a.M:Landroid/graphics/drawable/Drawable;
        //   203: putfield        com/bumptech/glide/request/a.M:Landroid/graphics/drawable/Drawable;
        //   206: aload_0        
        //   207: iconst_0       
        //   208: putfield        com/bumptech/glide/request/a.N:I
        //   211: aload_0        
        //   212: aload_0        
        //   213: getfield        com/bumptech/glide/request/a.G:I
        //   216: sipush          -129
        //   219: iand           
        //   220: putfield        com/bumptech/glide/request/a.G:I
        //   223: aload_1        
        //   224: getfield        com/bumptech/glide/request/a.G:I
        //   227: sipush          128
        //   230: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   233: ifeq            260
        //   236: aload_0        
        //   237: aload_1        
        //   238: getfield        com/bumptech/glide/request/a.N:I
        //   241: putfield        com/bumptech/glide/request/a.N:I
        //   244: aload_0        
        //   245: aconst_null    
        //   246: putfield        com/bumptech/glide/request/a.M:Landroid/graphics/drawable/Drawable;
        //   249: aload_0        
        //   250: aload_0        
        //   251: getfield        com/bumptech/glide/request/a.G:I
        //   254: bipush          -65
        //   256: iand           
        //   257: putfield        com/bumptech/glide/request/a.G:I
        //   260: aload_1        
        //   261: getfield        com/bumptech/glide/request/a.G:I
        //   264: sipush          256
        //   267: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   270: ifeq            281
        //   273: aload_0        
        //   274: aload_1        
        //   275: getfield        com/bumptech/glide/request/a.O:Z
        //   278: putfield        com/bumptech/glide/request/a.O:Z
        //   281: aload_1        
        //   282: getfield        com/bumptech/glide/request/a.G:I
        //   285: sipush          512
        //   288: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   291: ifeq            310
        //   294: aload_0        
        //   295: aload_1        
        //   296: getfield        com/bumptech/glide/request/a.Q:I
        //   299: putfield        com/bumptech/glide/request/a.Q:I
        //   302: aload_0        
        //   303: aload_1        
        //   304: getfield        com/bumptech/glide/request/a.P:I
        //   307: putfield        com/bumptech/glide/request/a.P:I
        //   310: aload_1        
        //   311: getfield        com/bumptech/glide/request/a.G:I
        //   314: sipush          1024
        //   317: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   320: ifeq            331
        //   323: aload_0        
        //   324: aload_1        
        //   325: getfield        com/bumptech/glide/request/a.R:Lcom/bumptech/glide/load/g;
        //   328: putfield        com/bumptech/glide/request/a.R:Lcom/bumptech/glide/load/g;
        //   331: aload_1        
        //   332: getfield        com/bumptech/glide/request/a.G:I
        //   335: sipush          4096
        //   338: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   341: ifeq            352
        //   344: aload_0        
        //   345: aload_1        
        //   346: getfield        com/bumptech/glide/request/a.Y:Ljava/lang/Class;
        //   349: putfield        com/bumptech/glide/request/a.Y:Ljava/lang/Class;
        //   352: aload_1        
        //   353: getfield        com/bumptech/glide/request/a.G:I
        //   356: sipush          8192
        //   359: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   362: ifeq            390
        //   365: aload_0        
        //   366: aload_1        
        //   367: getfield        com/bumptech/glide/request/a.U:Landroid/graphics/drawable/Drawable;
        //   370: putfield        com/bumptech/glide/request/a.U:Landroid/graphics/drawable/Drawable;
        //   373: aload_0        
        //   374: iconst_0       
        //   375: putfield        com/bumptech/glide/request/a.V:I
        //   378: aload_0        
        //   379: aload_0        
        //   380: getfield        com/bumptech/glide/request/a.G:I
        //   383: sipush          -16385
        //   386: iand           
        //   387: putfield        com/bumptech/glide/request/a.G:I
        //   390: aload_1        
        //   391: getfield        com/bumptech/glide/request/a.G:I
        //   394: sipush          16384
        //   397: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   400: ifeq            428
        //   403: aload_0        
        //   404: aload_1        
        //   405: getfield        com/bumptech/glide/request/a.V:I
        //   408: putfield        com/bumptech/glide/request/a.V:I
        //   411: aload_0        
        //   412: aconst_null    
        //   413: putfield        com/bumptech/glide/request/a.U:Landroid/graphics/drawable/Drawable;
        //   416: aload_0        
        //   417: aload_0        
        //   418: getfield        com/bumptech/glide/request/a.G:I
        //   421: sipush          -8193
        //   424: iand           
        //   425: putfield        com/bumptech/glide/request/a.G:I
        //   428: aload_1        
        //   429: getfield        com/bumptech/glide/request/a.G:I
        //   432: ldc             32768
        //   434: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   437: ifeq            448
        //   440: aload_0        
        //   441: aload_1        
        //   442: getfield        com/bumptech/glide/request/a.a0:Landroid/content/res/Resources$Theme;
        //   445: putfield        com/bumptech/glide/request/a.a0:Landroid/content/res/Resources$Theme;
        //   448: aload_1        
        //   449: getfield        com/bumptech/glide/request/a.G:I
        //   452: ldc             65536
        //   454: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   457: ifeq            468
        //   460: aload_0        
        //   461: aload_1        
        //   462: getfield        com/bumptech/glide/request/a.T:Z
        //   465: putfield        com/bumptech/glide/request/a.T:Z
        //   468: aload_1        
        //   469: getfield        com/bumptech/glide/request/a.G:I
        //   472: ldc             131072
        //   474: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   477: ifeq            488
        //   480: aload_0        
        //   481: aload_1        
        //   482: getfield        com/bumptech/glide/request/a.S:Z
        //   485: putfield        com/bumptech/glide/request/a.S:Z
        //   488: aload_1        
        //   489: getfield        com/bumptech/glide/request/a.G:I
        //   492: sipush          2048
        //   495: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   498: ifeq            522
        //   501: aload_0        
        //   502: getfield        com/bumptech/glide/request/a.X:Ljava/util/Map;
        //   505: aload_1        
        //   506: getfield        com/bumptech/glide/request/a.X:Ljava/util/Map;
        //   509: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
        //   514: aload_0        
        //   515: aload_1        
        //   516: getfield        com/bumptech/glide/request/a.e0:Z
        //   519: putfield        com/bumptech/glide/request/a.e0:Z
        //   522: aload_1        
        //   523: getfield        com/bumptech/glide/request/a.G:I
        //   526: ldc             524288
        //   528: invokestatic    com/bumptech/glide/request/a.m0:(II)Z
        //   531: ifeq            542
        //   534: aload_0        
        //   535: aload_1        
        //   536: getfield        com/bumptech/glide/request/a.d0:Z
        //   539: putfield        com/bumptech/glide/request/a.d0:Z
        //   542: aload_0        
        //   543: getfield        com/bumptech/glide/request/a.T:Z
        //   546: ifne            591
        //   549: aload_0        
        //   550: getfield        com/bumptech/glide/request/a.X:Ljava/util/Map;
        //   553: invokeinterface java/util/Map.clear:()V
        //   558: aload_0        
        //   559: getfield        com/bumptech/glide/request/a.G:I
        //   562: sipush          -2049
        //   565: iand           
        //   566: istore_2       
        //   567: aload_0        
        //   568: iload_2        
        //   569: putfield        com/bumptech/glide/request/a.G:I
        //   572: aload_0        
        //   573: iconst_0       
        //   574: putfield        com/bumptech/glide/request/a.S:Z
        //   577: aload_0        
        //   578: iload_2        
        //   579: ldc_w           -131073
        //   582: iand           
        //   583: putfield        com/bumptech/glide/request/a.G:I
        //   586: aload_0        
        //   587: iconst_1       
        //   588: putfield        com/bumptech/glide/request/a.e0:Z
        //   591: aload_0        
        //   592: aload_0        
        //   593: getfield        com/bumptech/glide/request/a.G:I
        //   596: aload_1        
        //   597: getfield        com/bumptech/glide/request/a.G:I
        //   600: ior            
        //   601: putfield        com/bumptech/glide/request/a.G:I
        //   604: aload_0        
        //   605: getfield        com/bumptech/glide/request/a.W:Lcom/bumptech/glide/load/j;
        //   608: aload_1        
        //   609: getfield        com/bumptech/glide/request/a.W:Lcom/bumptech/glide/load/j;
        //   612: invokevirtual   com/bumptech/glide/load/j.d:(Lcom/bumptech/glide/load/j;)V
        //   615: aload_0        
        //   616: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //   619: areturn        
        //    Signature:
        //  (Lcom/bumptech/glide/request/a<*>;)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    public final float a0() {
        return this.H;
    }
    
    @j0
    public T b() {
        if (this.Z && !this.b0) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.b0 = true;
        return this.s0();
    }
    
    @k0
    public final Resources$Theme b0() {
        return this.a0;
    }
    
    @j0
    @androidx.annotation.j
    public T c() {
        return this.T0(p.e, new l());
    }
    
    @j0
    public final Map<Class<?>, n<?>> c0() {
        return this.X;
    }
    
    public final boolean d0() {
        return this.f0;
    }
    
    public final boolean e0() {
        return this.c0;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof a;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final a a = (a)o;
            b3 = b2;
            if (Float.compare(a.H, this.H) == 0) {
                b3 = b2;
                if (this.L == a.L) {
                    b3 = b2;
                    if (m.d(this.K, a.K)) {
                        b3 = b2;
                        if (this.N == a.N) {
                            b3 = b2;
                            if (m.d(this.M, a.M)) {
                                b3 = b2;
                                if (this.V == a.V) {
                                    b3 = b2;
                                    if (m.d(this.U, a.U)) {
                                        b3 = b2;
                                        if (this.O == a.O) {
                                            b3 = b2;
                                            if (this.P == a.P) {
                                                b3 = b2;
                                                if (this.Q == a.Q) {
                                                    b3 = b2;
                                                    if (this.S == a.S) {
                                                        b3 = b2;
                                                        if (this.T == a.T) {
                                                            b3 = b2;
                                                            if (this.c0 == a.c0) {
                                                                b3 = b2;
                                                                if (this.d0 == a.d0) {
                                                                    b3 = b2;
                                                                    if (this.I.equals(a.I)) {
                                                                        b3 = b2;
                                                                        if (this.J == a.J) {
                                                                            b3 = b2;
                                                                            if (this.W.equals(a.W)) {
                                                                                b3 = b2;
                                                                                if (this.X.equals(a.X)) {
                                                                                    b3 = b2;
                                                                                    if (this.Y.equals(a.Y)) {
                                                                                        b3 = b2;
                                                                                        if (m.d(this.R, a.R)) {
                                                                                            b3 = b2;
                                                                                            if (m.d(this.a0, a.a0)) {
                                                                                                b3 = true;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    @j0
    @androidx.annotation.j
    public T f() {
        return this.H0(p.d, new com.bumptech.glide.load.resource.bitmap.m());
    }
    
    protected boolean f0() {
        return this.b0;
    }
    
    public final boolean g0() {
        return this.l0(4);
    }
    
    public final boolean h0() {
        return this.Z;
    }
    
    @Override
    public int hashCode() {
        return m.p(this.a0, m.p(this.R, m.p(this.Y, m.p(this.X, m.p(this.W, m.p(this.J, m.p(this.I, m.r(this.d0, m.r(this.c0, m.r(this.T, m.r(this.S, m.o(this.Q, m.o(this.P, m.r(this.O, m.p(this.U, m.o(this.V, m.p(this.M, m.o(this.N, m.p(this.K, m.o(this.L, m.l(this.H)))))))))))))))))))));
    }
    
    public final boolean i0() {
        return this.O;
    }
    
    public final boolean j0() {
        return this.l0(8);
    }
    
    boolean k0() {
        return this.e0;
    }
    
    public final boolean n0() {
        return this.l0(256);
    }
    
    public final boolean o0() {
        return this.T;
    }
    
    public final boolean p0() {
        return this.S;
    }
    
    public final boolean q0() {
        return this.l0(2048);
    }
    
    @j0
    @androidx.annotation.j
    public T r() {
        return this.T0(p.d, new com.bumptech.glide.load.resource.bitmap.n());
    }
    
    public final boolean r0() {
        return m.v(this.Q, this.P);
    }
    
    @j0
    public T s0() {
        this.Z = true;
        return this.J0();
    }
    
    @androidx.annotation.j
    public T t() {
        try {
            final a a = (a)super.clone();
            (a.W = new com.bumptech.glide.load.j()).d(this.W);
            (a.X = new b<Class<?>, n<?>>()).putAll(this.X);
            a.Z = false;
            a.b0 = false;
            return (T)a;
        }
        catch (CloneNotSupportedException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    @j0
    @androidx.annotation.j
    public T t0(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: iload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.t0:(Z)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_0        
        //    17: iload_1        
        //    18: putfield        com/bumptech/glide/request/a.d0:Z
        //    21: aload_0        
        //    22: aload_0        
        //    23: getfield        com/bumptech/glide/request/a.G:I
        //    26: ldc             524288
        //    28: ior            
        //    29: putfield        com/bumptech/glide/request/a.G:I
        //    32: aload_0        
        //    33: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    36: areturn        
        //    Signature:
        //  (Z)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T u(@j0 final Class<?> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: aload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.u:(Ljava/lang/Class;)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_0        
        //    17: aload_1        
        //    18: invokestatic    com/bumptech/glide/util/k.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //    21: checkcast       Ljava/lang/Class;
        //    24: putfield        com/bumptech/glide/request/a.Y:Ljava/lang/Class;
        //    27: aload_0        
        //    28: aload_0        
        //    29: getfield        com/bumptech/glide/request/a.G:I
        //    32: sipush          4096
        //    35: ior            
        //    36: putfield        com/bumptech/glide/request/a.G:I
        //    39: aload_0        
        //    40: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    43: areturn        
        //    Signature:
        //  (Ljava/lang/Class<*>;)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T u0() {
        return this.A0(p.e, new l());
    }
    
    @j0
    @androidx.annotation.j
    public T v() {
        return this.L0(q.k, Boolean.FALSE);
    }
    
    @j0
    @androidx.annotation.j
    public T v0() {
        return this.y0(p.d, new com.bumptech.glide.load.resource.bitmap.m());
    }
    
    @j0
    @androidx.annotation.j
    public T w(@j0 final j p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            16
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: aload_1        
        //    12: invokevirtual   com/bumptech/glide/request/a.w:(Lcom/bumptech/glide/load/engine/j;)Lcom/bumptech/glide/request/a;
        //    15: areturn        
        //    16: aload_0        
        //    17: aload_1        
        //    18: invokestatic    com/bumptech/glide/util/k.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //    21: checkcast       Lcom/bumptech/glide/load/engine/j;
        //    24: putfield        com/bumptech/glide/request/a.I:Lcom/bumptech/glide/load/engine/j;
        //    27: aload_0        
        //    28: aload_0        
        //    29: getfield        com/bumptech/glide/request/a.G:I
        //    32: iconst_4       
        //    33: ior            
        //    34: putfield        com/bumptech/glide/request/a.G:I
        //    37: aload_0        
        //    38: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    41: areturn        
        //    Signature:
        //  (Lcom/bumptech/glide/load/engine/j;)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T w0() {
        return this.A0(p.e, new com.bumptech.glide.load.resource.bitmap.n());
    }
    
    @j0
    @androidx.annotation.j
    public T x() {
        return this.L0(com.bumptech.glide.load.resource.gif.i.b, Boolean.TRUE);
    }
    
    @j0
    @androidx.annotation.j
    public T x0() {
        return this.y0(p.c, new u());
    }
    
    @j0
    @androidx.annotation.j
    public T y() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/a.b0:Z
        //     4: ifeq            15
        //     7: aload_0        
        //     8: invokevirtual   com/bumptech/glide/request/a.t:()Lcom/bumptech/glide/request/a;
        //    11: invokevirtual   com/bumptech/glide/request/a.y:()Lcom/bumptech/glide/request/a;
        //    14: areturn        
        //    15: aload_0        
        //    16: getfield        com/bumptech/glide/request/a.X:Ljava/util/Map;
        //    19: invokeinterface java/util/Map.clear:()V
        //    24: aload_0        
        //    25: getfield        com/bumptech/glide/request/a.G:I
        //    28: sipush          -2049
        //    31: iand           
        //    32: istore_1       
        //    33: aload_0        
        //    34: iload_1        
        //    35: putfield        com/bumptech/glide/request/a.G:I
        //    38: aload_0        
        //    39: iconst_0       
        //    40: putfield        com/bumptech/glide/request/a.S:Z
        //    43: iload_1        
        //    44: ldc_w           -131073
        //    47: iand           
        //    48: istore_1       
        //    49: aload_0        
        //    50: iload_1        
        //    51: putfield        com/bumptech/glide/request/a.G:I
        //    54: aload_0        
        //    55: iconst_0       
        //    56: putfield        com/bumptech/glide/request/a.T:Z
        //    59: aload_0        
        //    60: iload_1        
        //    61: ldc             65536
        //    63: ior            
        //    64: putfield        com/bumptech/glide/request/a.G:I
        //    67: aload_0        
        //    68: iconst_1       
        //    69: putfield        com/bumptech/glide/request/a.e0:Z
        //    72: aload_0        
        //    73: invokespecial   com/bumptech/glide/request/a.K0:()Lcom/bumptech/glide/request/a;
        //    76: areturn        
        //    Signature:
        //  ()TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    @j0
    @androidx.annotation.j
    public T z(@j0 final p p) {
        return this.L0(p.h, (p)k.d((Y)p));
    }
    
    @j0
    @androidx.annotation.j
    public T z0(@j0 final n<Bitmap> n) {
        return this.S0(n, false);
    }
}
