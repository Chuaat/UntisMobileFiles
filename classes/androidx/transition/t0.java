// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import androidx.annotation.p0;
import android.annotation.SuppressLint;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.view.ViewGroup;
import java.lang.reflect.Method;

class t0
{
    private static boolean a = true;
    private static Method b;
    private static boolean c;
    
    private t0() {
    }
    
    static int a(@j0 final ViewGroup p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          29
        //     5: if_icmplt       14
        //     8: aload_0        
        //     9: iload_1        
        //    10: invokevirtual   android/view/ViewGroup.getChildDrawingOrder:(I)I
        //    13: ireturn        
        //    14: getstatic       androidx/transition/t0.c:Z
        //    17: ifne            57
        //    20: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    23: astore_2       
        //    24: ldc             Landroid/view/ViewGroup;.class
        //    26: ldc             "getChildDrawingOrder"
        //    28: iconst_2       
        //    29: anewarray       Ljava/lang/Class;
        //    32: dup            
        //    33: iconst_0       
        //    34: aload_2        
        //    35: aastore        
        //    36: dup            
        //    37: iconst_1       
        //    38: aload_2        
        //    39: aastore        
        //    40: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    43: astore_2       
        //    44: aload_2        
        //    45: putstatic       androidx/transition/t0.b:Ljava/lang/reflect/Method;
        //    48: aload_2        
        //    49: iconst_1       
        //    50: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
        //    53: iconst_1       
        //    54: putstatic       androidx/transition/t0.c:Z
        //    57: getstatic       androidx/transition/t0.b:Ljava/lang/reflect/Method;
        //    60: astore_2       
        //    61: aload_2        
        //    62: ifnull          100
        //    65: aload_2        
        //    66: aload_0        
        //    67: iconst_2       
        //    68: anewarray       Ljava/lang/Object;
        //    71: dup            
        //    72: iconst_0       
        //    73: aload_0        
        //    74: invokevirtual   android/view/ViewGroup.getChildCount:()I
        //    77: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    80: aastore        
        //    81: dup            
        //    82: iconst_1       
        //    83: iload_1        
        //    84: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    87: aastore        
        //    88: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    91: checkcast       Ljava/lang/Integer;
        //    94: invokevirtual   java/lang/Integer.intValue:()I
        //    97: istore_3       
        //    98: iload_3        
        //    99: ireturn        
        //   100: iload_1        
        //   101: ireturn        
        //   102: astore_2       
        //   103: goto            53
        //   106: astore_0       
        //   107: goto            100
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  20     53     102    106    Ljava/lang/NoSuchMethodException;
        //  65     98     106    110    Ljava/lang/IllegalAccessException;
        //  65     98     106    110    Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0100:
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
    
    static s0 b(@j0 final ViewGroup viewGroup) {
        if (Build$VERSION.SDK_INT >= 18) {
            return new r0(viewGroup);
        }
        return q0.g(viewGroup);
    }
    
    @SuppressLint({ "NewApi" })
    @p0(18)
    private static void c(@j0 final ViewGroup viewGroup, final boolean b) {
        if (t0.a) {
            try {
                viewGroup.suppressLayout(b);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                t0.a = false;
            }
        }
    }
    
    static void d(@j0 final ViewGroup viewGroup, final boolean b) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29) {
            viewGroup.suppressLayout(b);
        }
        else if (sdk_INT >= 18) {
            c(viewGroup, b);
        }
        else {
            u0.b(viewGroup, b);
        }
    }
}
