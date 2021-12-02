// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import androidx.annotation.k0;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.c;
import androidx.core.widget.d;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import androidx.annotation.j0;
import android.widget.CompoundButton;

class i
{
    @j0
    private final CompoundButton a;
    private ColorStateList b;
    private PorterDuff$Mode c;
    private boolean d;
    private boolean e;
    private boolean f;
    
    i(@j0 final CompoundButton a) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.a = a;
    }
    
    void a() {
        final Drawable a = androidx.core.widget.d.a(this.a);
        if (a != null && (this.d || this.e)) {
            final Drawable mutate = androidx.core.graphics.drawable.c.r(a).mutate();
            if (this.d) {
                androidx.core.graphics.drawable.c.o(mutate, this.b);
            }
            if (this.e) {
                androidx.core.graphics.drawable.c.p(mutate, this.c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(mutate);
        }
    }
    
    int b(final int n) {
        int n2 = n;
        if (Build$VERSION.SDK_INT < 17) {
            final Drawable a = androidx.core.widget.d.a(this.a);
            n2 = n;
            if (a != null) {
                n2 = n + a.getIntrinsicWidth();
            }
        }
        return n2;
    }
    
    ColorStateList c() {
        return this.b;
    }
    
    PorterDuff$Mode d() {
        return this.c;
    }
    
    void e(@k0 final AttributeSet p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     4: invokevirtual   android/widget/CompoundButton.getContext:()Landroid/content/Context;
        //     7: astore_3       
        //     8: getstatic       c/a$n.J3:[I
        //    11: astore          4
        //    13: aload_3        
        //    14: aload_1        
        //    15: aload           4
        //    17: iload_2        
        //    18: iconst_0       
        //    19: invokestatic    androidx/appcompat/widget/u0.G:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/u0;
        //    22: astore_3       
        //    23: aload_0        
        //    24: getfield        androidx/appcompat/widget/i.a:Landroid/widget/CompoundButton;
        //    27: astore          5
        //    29: aload           5
        //    31: aload           5
        //    33: invokevirtual   android/widget/CompoundButton.getContext:()Landroid/content/Context;
        //    36: aload           4
        //    38: aload_1        
        //    39: aload_3        
        //    40: invokevirtual   androidx/appcompat/widget/u0.B:()Landroid/content/res/TypedArray;
        //    43: iload_2        
        //    44: iconst_0       
        //    45: invokestatic    androidx/core/view/j0.x1:(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V
        //    48: getstatic       c/a$n.L3:I
        //    51: istore_2       
        //    52: aload_3        
        //    53: iload_2        
        //    54: invokevirtual   androidx/appcompat/widget/u0.C:(I)Z
        //    57: ifeq            93
        //    60: aload_3        
        //    61: iload_2        
        //    62: iconst_0       
        //    63: invokevirtual   androidx/appcompat/widget/u0.u:(II)I
        //    66: istore_2       
        //    67: iload_2        
        //    68: ifeq            93
        //    71: aload_0        
        //    72: getfield        androidx/appcompat/widget/i.a:Landroid/widget/CompoundButton;
        //    75: astore_1       
        //    76: aload_1        
        //    77: aload_1        
        //    78: invokevirtual   android/widget/CompoundButton.getContext:()Landroid/content/Context;
        //    81: iload_2        
        //    82: invokestatic    androidx/appcompat/content/res/a.d:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
        //    85: invokevirtual   android/widget/CompoundButton.setButtonDrawable:(Landroid/graphics/drawable/Drawable;)V
        //    88: iconst_1       
        //    89: istore_2       
        //    90: goto            95
        //    93: iconst_0       
        //    94: istore_2       
        //    95: iload_2        
        //    96: ifne            139
        //    99: getstatic       c/a$n.K3:I
        //   102: istore_2       
        //   103: aload_3        
        //   104: iload_2        
        //   105: invokevirtual   androidx/appcompat/widget/u0.C:(I)Z
        //   108: ifeq            139
        //   111: aload_3        
        //   112: iload_2        
        //   113: iconst_0       
        //   114: invokevirtual   androidx/appcompat/widget/u0.u:(II)I
        //   117: istore_2       
        //   118: iload_2        
        //   119: ifeq            139
        //   122: aload_0        
        //   123: getfield        androidx/appcompat/widget/i.a:Landroid/widget/CompoundButton;
        //   126: astore_1       
        //   127: aload_1        
        //   128: aload_1        
        //   129: invokevirtual   android/widget/CompoundButton.getContext:()Landroid/content/Context;
        //   132: iload_2        
        //   133: invokestatic    androidx/appcompat/content/res/a.d:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
        //   136: invokevirtual   android/widget/CompoundButton.setButtonDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   139: getstatic       c/a$n.M3:I
        //   142: istore_2       
        //   143: aload_3        
        //   144: iload_2        
        //   145: invokevirtual   androidx/appcompat/widget/u0.C:(I)Z
        //   148: ifeq            163
        //   151: aload_0        
        //   152: getfield        androidx/appcompat/widget/i.a:Landroid/widget/CompoundButton;
        //   155: aload_3        
        //   156: iload_2        
        //   157: invokevirtual   androidx/appcompat/widget/u0.d:(I)Landroid/content/res/ColorStateList;
        //   160: invokestatic    androidx/core/widget/d.d:(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V
        //   163: getstatic       c/a$n.N3:I
        //   166: istore_2       
        //   167: aload_3        
        //   168: iload_2        
        //   169: invokevirtual   androidx/appcompat/widget/u0.C:(I)Z
        //   172: ifeq            192
        //   175: aload_0        
        //   176: getfield        androidx/appcompat/widget/i.a:Landroid/widget/CompoundButton;
        //   179: aload_3        
        //   180: iload_2        
        //   181: iconst_m1      
        //   182: invokevirtual   androidx/appcompat/widget/u0.o:(II)I
        //   185: aconst_null    
        //   186: invokestatic    androidx/appcompat/widget/b0.e:(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
        //   189: invokestatic    androidx/core/widget/d.e:(Landroid/widget/CompoundButton;Landroid/graphics/PorterDuff$Mode;)V
        //   192: aload_3        
        //   193: invokevirtual   androidx/appcompat/widget/u0.I:()V
        //   196: return         
        //   197: astore_1       
        //   198: aload_3        
        //   199: invokevirtual   androidx/appcompat/widget/u0.I:()V
        //   202: aload_1        
        //   203: athrow         
        //   204: astore_1       
        //   205: goto            93
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  48     67     197    204    Any
        //  71     88     204    208    Landroid/content/res/Resources$NotFoundException;
        //  71     88     197    204    Any
        //  99     118    197    204    Any
        //  122    139    197    204    Any
        //  139    163    197    204    Any
        //  163    192    197    204    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0093:
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
    
    void f() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        this.a();
    }
    
    void g(final ColorStateList b) {
        this.b = b;
        this.d = true;
        this.a();
    }
    
    void h(@k0 final PorterDuff$Mode c) {
        this.c = c;
        this.e = true;
        this.a();
    }
}
