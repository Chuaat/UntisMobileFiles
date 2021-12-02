// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import androidx.annotation.p0;
import android.annotation.SuppressLint;
import androidx.annotation.k0;
import android.graphics.Matrix;
import androidx.annotation.j0;
import android.widget.ImageView;
import java.lang.reflect.Field;

class t
{
    private static boolean a = true;
    private static Field b;
    private static boolean c;
    
    private t() {
    }
    
    static void a(@j0 final ImageView p0, @k0 final Matrix p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: iload_2        
        //     5: bipush          29
        //     7: if_icmplt       18
        //    10: aload_0        
        //    11: aload_1        
        //    12: invokevirtual   android/widget/ImageView.animateTransform:(Landroid/graphics/Matrix;)V
        //    15: goto            191
        //    18: aload_1        
        //    19: ifnonnull       68
        //    22: aload_0        
        //    23: invokevirtual   android/widget/ImageView.getDrawable:()Landroid/graphics/drawable/Drawable;
        //    26: astore_1       
        //    27: aload_1        
        //    28: ifnull          191
        //    31: aload_1        
        //    32: iconst_0       
        //    33: iconst_0       
        //    34: aload_0        
        //    35: invokevirtual   android/widget/ImageView.getWidth:()I
        //    38: aload_0        
        //    39: invokevirtual   android/widget/ImageView.getPaddingLeft:()I
        //    42: isub           
        //    43: aload_0        
        //    44: invokevirtual   android/widget/ImageView.getPaddingRight:()I
        //    47: isub           
        //    48: aload_0        
        //    49: invokevirtual   android/widget/ImageView.getHeight:()I
        //    52: aload_0        
        //    53: invokevirtual   android/widget/ImageView.getPaddingTop:()I
        //    56: isub           
        //    57: aload_0        
        //    58: invokevirtual   android/widget/ImageView.getPaddingBottom:()I
        //    61: isub           
        //    62: invokevirtual   android/graphics/drawable/Drawable.setBounds:(IIII)V
        //    65: goto            187
        //    68: iload_2        
        //    69: bipush          21
        //    71: if_icmplt       82
        //    74: aload_0        
        //    75: aload_1        
        //    76: invokestatic    androidx/transition/t.c:(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V
        //    79: goto            191
        //    82: aload_0        
        //    83: invokevirtual   android/widget/ImageView.getDrawable:()Landroid/graphics/drawable/Drawable;
        //    86: astore_3       
        //    87: aload_3        
        //    88: ifnull          191
        //    91: aload_3        
        //    92: iconst_0       
        //    93: iconst_0       
        //    94: aload_3        
        //    95: invokevirtual   android/graphics/drawable/Drawable.getIntrinsicWidth:()I
        //    98: aload_3        
        //    99: invokevirtual   android/graphics/drawable/Drawable.getIntrinsicHeight:()I
        //   102: invokevirtual   android/graphics/drawable/Drawable.setBounds:(IIII)V
        //   105: aconst_null    
        //   106: astore_3       
        //   107: aconst_null    
        //   108: astore          4
        //   110: invokestatic    androidx/transition/t.b:()V
        //   113: getstatic       androidx/transition/t.b:Ljava/lang/reflect/Field;
        //   116: astore          5
        //   118: aload           5
        //   120: ifnull          178
        //   123: aload           4
        //   125: astore_3       
        //   126: aload           5
        //   128: aload_0        
        //   129: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   132: checkcast       Landroid/graphics/Matrix;
        //   135: astore          5
        //   137: aload           5
        //   139: ifnonnull       170
        //   142: new             Landroid/graphics/Matrix;
        //   145: astore          4
        //   147: aload           4
        //   149: invokespecial   android/graphics/Matrix.<init>:()V
        //   152: aload           4
        //   154: astore_3       
        //   155: getstatic       androidx/transition/t.b:Ljava/lang/reflect/Field;
        //   158: aload_0        
        //   159: aload           4
        //   161: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   164: aload           4
        //   166: astore_3       
        //   167: goto            178
        //   170: aload           5
        //   172: astore_3       
        //   173: goto            178
        //   176: astore          4
        //   178: aload_3        
        //   179: ifnull          187
        //   182: aload_3        
        //   183: aload_1        
        //   184: invokevirtual   android/graphics/Matrix.set:(Landroid/graphics/Matrix;)V
        //   187: aload_0        
        //   188: invokevirtual   android/widget/ImageView.invalidate:()V
        //   191: return         
        //   192: astore_3       
        //   193: goto            170
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  126    137    176    178    Ljava/lang/IllegalAccessException;
        //  142    152    192    196    Ljava/lang/IllegalAccessException;
        //  155    164    176    178    Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0170:
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
    
    private static void b() {
        if (t.c) {
            return;
        }
        while (true) {
            try {
                (t.b = ImageView.class.getDeclaredField("mDrawMatrix")).setAccessible(true);
                t.c = true;
            }
            catch (NoSuchFieldException ex) {
                continue;
            }
            break;
        }
    }
    
    @SuppressLint({ "NewApi" })
    @p0(21)
    private static void c(@j0 final ImageView imageView, @k0 final Matrix matrix) {
        if (t.a) {
            try {
                imageView.animateTransform(matrix);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                t.a = false;
            }
        }
    }
}
