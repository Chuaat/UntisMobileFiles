// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import java.io.PrintStream;
import java.nio.CharBuffer;
import android.view.View;
import android.util.Log;
import android.content.res.Resources$NotFoundException;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.annotation.SuppressLint;

@SuppressLint({ "LogConditional" })
public class c
{
    public static void a(final ViewGroup$LayoutParams p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/lang/Throwable.<init>:()V
        //     7: invokevirtual   java/lang/Throwable.getStackTrace:()[Ljava/lang/StackTraceElement;
        //    10: iconst_1       
        //    11: aaload         
        //    12: astore_2       
        //    13: new             Ljava/lang/StringBuilder;
        //    16: dup            
        //    17: invokespecial   java/lang/StringBuilder.<init>:()V
        //    20: astore_3       
        //    21: aload_3        
        //    22: ldc             ".("
        //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    27: pop            
        //    28: aload_3        
        //    29: aload_2        
        //    30: invokevirtual   java/lang/StackTraceElement.getFileName:()Ljava/lang/String;
        //    33: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    36: pop            
        //    37: aload_3        
        //    38: ldc             ":"
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: pop            
        //    44: aload_3        
        //    45: aload_2        
        //    46: invokevirtual   java/lang/StackTraceElement.getLineNumber:()I
        //    49: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    52: pop            
        //    53: aload_3        
        //    54: ldc             ") "
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: pop            
        //    60: aload_3        
        //    61: aload_1        
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    65: pop            
        //    66: aload_3        
        //    67: ldc             "  "
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    72: pop            
        //    73: aload_3        
        //    74: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    77: astore_1       
        //    78: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //    81: astore_2       
        //    82: new             Ljava/lang/StringBuilder;
        //    85: dup            
        //    86: invokespecial   java/lang/StringBuilder.<init>:()V
        //    89: astore_3       
        //    90: aload_3        
        //    91: ldc             " >>>>>>>>>>>>>>>>>>. dump "
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    96: pop            
        //    97: aload_3        
        //    98: aload_1        
        //    99: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   102: pop            
        //   103: aload_3        
        //   104: ldc             "  "
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   109: pop            
        //   110: aload_3        
        //   111: aload_0        
        //   112: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   115: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   118: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   121: pop            
        //   122: aload_2        
        //   123: aload_3        
        //   124: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   127: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   130: aload_0        
        //   131: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   134: invokevirtual   java/lang/Class.getFields:()[Ljava/lang/reflect/Field;
        //   137: astore_3       
        //   138: iconst_0       
        //   139: istore          4
        //   141: iload           4
        //   143: aload_3        
        //   144: arraylength    
        //   145: if_icmpge       265
        //   148: aload_3        
        //   149: iload           4
        //   151: aaload         
        //   152: astore          5
        //   154: aload           5
        //   156: aload_0        
        //   157: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   160: astore_2       
        //   161: aload           5
        //   163: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //   166: astore          6
        //   168: aload           6
        //   170: ldc             "To"
        //   172: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   175: ifne            181
        //   178: goto            259
        //   181: aload_2        
        //   182: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   185: ldc             "-1"
        //   187: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   190: ifeq            196
        //   193: goto            259
        //   196: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   199: astore          5
        //   201: new             Ljava/lang/StringBuilder;
        //   204: astore          7
        //   206: aload           7
        //   208: invokespecial   java/lang/StringBuilder.<init>:()V
        //   211: aload           7
        //   213: aload_1        
        //   214: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   217: pop            
        //   218: aload           7
        //   220: ldc             "       "
        //   222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   225: pop            
        //   226: aload           7
        //   228: aload           6
        //   230: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   233: pop            
        //   234: aload           7
        //   236: ldc             " "
        //   238: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   241: pop            
        //   242: aload           7
        //   244: aload_2        
        //   245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   248: pop            
        //   249: aload           5
        //   251: aload           7
        //   253: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   256: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   259: iinc            4, 1
        //   262: goto            141
        //   265: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   268: astore_0       
        //   269: new             Ljava/lang/StringBuilder;
        //   272: dup            
        //   273: invokespecial   java/lang/StringBuilder.<init>:()V
        //   276: astore_3       
        //   277: aload_3        
        //   278: ldc             " <<<<<<<<<<<<<<<<< dump "
        //   280: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   283: pop            
        //   284: aload_3        
        //   285: aload_1        
        //   286: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   289: pop            
        //   290: aload_0        
        //   291: aload_3        
        //   292: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   295: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   298: return         
        //   299: astore_2       
        //   300: goto            259
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  154    178    299    303    Ljava/lang/IllegalAccessException;
        //  181    193    299    303    Ljava/lang/IllegalAccessException;
        //  196    259    299    303    Ljava/lang/IllegalAccessException;
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
    
    public static void b(final ViewGroup p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/lang/Throwable.<init>:()V
        //     7: invokevirtual   java/lang/Throwable.getStackTrace:()[Ljava/lang/StackTraceElement;
        //    10: iconst_1       
        //    11: aaload         
        //    12: astore_2       
        //    13: new             Ljava/lang/StringBuilder;
        //    16: dup            
        //    17: invokespecial   java/lang/StringBuilder.<init>:()V
        //    20: astore_3       
        //    21: aload_3        
        //    22: ldc             ".("
        //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    27: pop            
        //    28: aload_3        
        //    29: aload_2        
        //    30: invokevirtual   java/lang/StackTraceElement.getFileName:()Ljava/lang/String;
        //    33: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    36: pop            
        //    37: aload_3        
        //    38: ldc             ":"
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: pop            
        //    44: aload_3        
        //    45: aload_2        
        //    46: invokevirtual   java/lang/StackTraceElement.getLineNumber:()I
        //    49: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    52: pop            
        //    53: aload_3        
        //    54: ldc             ") "
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: pop            
        //    60: aload_3        
        //    61: aload_1        
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    65: pop            
        //    66: aload_3        
        //    67: ldc             "  "
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    72: pop            
        //    73: aload_3        
        //    74: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    77: astore_2       
        //    78: aload_0        
        //    79: invokevirtual   android/view/ViewGroup.getChildCount:()I
        //    82: istore          4
        //    84: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //    87: astore_3       
        //    88: new             Ljava/lang/StringBuilder;
        //    91: dup            
        //    92: invokespecial   java/lang/StringBuilder.<init>:()V
        //    95: astore          5
        //    97: aload           5
        //    99: aload_1        
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: pop            
        //   104: aload           5
        //   106: ldc             " children "
        //   108: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   111: pop            
        //   112: aload           5
        //   114: iload           4
        //   116: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   119: pop            
        //   120: aload_3        
        //   121: aload           5
        //   123: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   126: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   129: iconst_0       
        //   130: istore          6
        //   132: iload           6
        //   134: iload           4
        //   136: if_icmpge       338
        //   139: aload_0        
        //   140: iload           6
        //   142: invokevirtual   android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
        //   145: astore_3       
        //   146: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   149: astore          5
        //   151: new             Ljava/lang/StringBuilder;
        //   154: dup            
        //   155: invokespecial   java/lang/StringBuilder.<init>:()V
        //   158: astore_1       
        //   159: aload_1        
        //   160: aload_2        
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   164: pop            
        //   165: aload_1        
        //   166: ldc             "     "
        //   168: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   171: pop            
        //   172: aload_1        
        //   173: aload_3        
        //   174: invokestatic    androidx/constraintlayout/motion/widget/c.k:(Landroid/view/View;)Ljava/lang/String;
        //   177: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   180: pop            
        //   181: aload           5
        //   183: aload_1        
        //   184: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   187: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   190: aload_3        
        //   191: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   194: astore_1       
        //   195: aload_1        
        //   196: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   199: invokevirtual   java/lang/Class.getFields:()[Ljava/lang/reflect/Field;
        //   202: astore_3       
        //   203: iconst_0       
        //   204: istore          7
        //   206: iload           7
        //   208: aload_3        
        //   209: arraylength    
        //   210: if_icmpge       332
        //   213: aload_3        
        //   214: iload           7
        //   216: aaload         
        //   217: astore          8
        //   219: aload           8
        //   221: aload_1        
        //   222: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   225: astore          9
        //   227: aload           8
        //   229: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //   232: ldc             "To"
        //   234: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   237: ifne            243
        //   240: goto            326
        //   243: aload           9
        //   245: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   248: ldc             "-1"
        //   250: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   253: ifeq            259
        //   256: goto            326
        //   259: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   262: astore          10
        //   264: new             Ljava/lang/StringBuilder;
        //   267: astore          5
        //   269: aload           5
        //   271: invokespecial   java/lang/StringBuilder.<init>:()V
        //   274: aload           5
        //   276: aload_2        
        //   277: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   280: pop            
        //   281: aload           5
        //   283: ldc             "       "
        //   285: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   288: pop            
        //   289: aload           5
        //   291: aload           8
        //   293: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //   296: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   299: pop            
        //   300: aload           5
        //   302: ldc             " "
        //   304: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   307: pop            
        //   308: aload           5
        //   310: aload           9
        //   312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   315: pop            
        //   316: aload           10
        //   318: aload           5
        //   320: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   323: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   326: iinc            7, 1
        //   329: goto            206
        //   332: iinc            6, 1
        //   335: goto            132
        //   338: return         
        //   339: astore          5
        //   341: goto            326
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  219    240    339    344    Ljava/lang/IllegalAccessException;
        //  243    256    339    344    Ljava/lang/IllegalAccessException;
        //  259    326    339    344    Ljava/lang/IllegalAccessException;
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
    
    public static void c(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/lang/Throwable.<init>:()V
        //     7: invokevirtual   java/lang/Throwable.getStackTrace:()[Ljava/lang/StackTraceElement;
        //    10: iconst_1       
        //    11: aaload         
        //    12: astore_1       
        //    13: new             Ljava/lang/StringBuilder;
        //    16: dup            
        //    17: invokespecial   java/lang/StringBuilder.<init>:()V
        //    20: astore_2       
        //    21: aload_2        
        //    22: ldc             ".("
        //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    27: pop            
        //    28: aload_2        
        //    29: aload_1        
        //    30: invokevirtual   java/lang/StackTraceElement.getFileName:()Ljava/lang/String;
        //    33: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    36: pop            
        //    37: aload_2        
        //    38: ldc             ":"
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: pop            
        //    44: aload_2        
        //    45: aload_1        
        //    46: invokevirtual   java/lang/StackTraceElement.getLineNumber:()I
        //    49: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    52: pop            
        //    53: aload_2        
        //    54: ldc             ")"
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: pop            
        //    60: aload_2        
        //    61: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    64: astore_2       
        //    65: aload_0        
        //    66: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    69: astore_1       
        //    70: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //    73: astore_3       
        //    74: new             Ljava/lang/StringBuilder;
        //    77: dup            
        //    78: invokespecial   java/lang/StringBuilder.<init>:()V
        //    81: astore          4
        //    83: aload           4
        //    85: aload_2        
        //    86: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    89: pop            
        //    90: aload           4
        //    92: ldc             "------------- "
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    97: pop            
        //    98: aload           4
        //   100: aload_1        
        //   101: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   104: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   107: pop            
        //   108: aload           4
        //   110: ldc             " --------------------"
        //   112: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   115: pop            
        //   116: aload_3        
        //   117: aload           4
        //   119: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   122: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   125: aload_1        
        //   126: invokevirtual   java/lang/Class.getFields:()[Ljava/lang/reflect/Field;
        //   129: astore          4
        //   131: iconst_0       
        //   132: istore          5
        //   134: iload           5
        //   136: aload           4
        //   138: arraylength    
        //   139: if_icmpge       334
        //   142: aload           4
        //   144: iload           5
        //   146: aaload         
        //   147: astore          6
        //   149: aload           6
        //   151: aload_0        
        //   152: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   155: astore          7
        //   157: aload           6
        //   159: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //   162: ldc             "layout_constraint"
        //   164: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   167: ifne            173
        //   170: goto            328
        //   173: aload           7
        //   175: instanceof      Ljava/lang/Integer;
        //   178: ifeq            197
        //   181: aload           7
        //   183: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   186: ldc             "-1"
        //   188: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   191: ifeq            197
        //   194: goto            328
        //   197: aload           7
        //   199: instanceof      Ljava/lang/Integer;
        //   202: ifeq            221
        //   205: aload           7
        //   207: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   210: ldc             "0"
        //   212: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   215: ifeq            221
        //   218: goto            328
        //   221: aload           7
        //   223: instanceof      Ljava/lang/Float;
        //   226: ifeq            245
        //   229: aload           7
        //   231: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   234: ldc             "1.0"
        //   236: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   239: ifeq            245
        //   242: goto            328
        //   245: aload           7
        //   247: instanceof      Ljava/lang/Float;
        //   250: ifeq            269
        //   253: aload           7
        //   255: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   258: ldc             "0.5"
        //   260: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   263: ifeq            269
        //   266: goto            328
        //   269: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   272: astore          8
        //   274: new             Ljava/lang/StringBuilder;
        //   277: astore_3       
        //   278: aload_3        
        //   279: invokespecial   java/lang/StringBuilder.<init>:()V
        //   282: aload_3        
        //   283: aload_2        
        //   284: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   287: pop            
        //   288: aload_3        
        //   289: ldc             "    "
        //   291: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   294: pop            
        //   295: aload_3        
        //   296: aload           6
        //   298: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //   301: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   304: pop            
        //   305: aload_3        
        //   306: ldc             " "
        //   308: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   311: pop            
        //   312: aload_3        
        //   313: aload           7
        //   315: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   318: pop            
        //   319: aload           8
        //   321: aload_3        
        //   322: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   325: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   328: iinc            5, 1
        //   331: goto            134
        //   334: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   337: astore          4
        //   339: new             Ljava/lang/StringBuilder;
        //   342: dup            
        //   343: invokespecial   java/lang/StringBuilder.<init>:()V
        //   346: astore_0       
        //   347: aload_0        
        //   348: aload_2        
        //   349: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   352: pop            
        //   353: aload_0        
        //   354: ldc             "------------- "
        //   356: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   359: pop            
        //   360: aload_0        
        //   361: aload_1        
        //   362: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   365: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   368: pop            
        //   369: aload_0        
        //   370: ldc             " --------------------"
        //   372: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   375: pop            
        //   376: aload           4
        //   378: aload_0        
        //   379: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   382: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   385: return         
        //   386: astore_3       
        //   387: goto            328
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  149    170    386    390    Ljava/lang/IllegalAccessException;
        //  173    194    386    390    Ljava/lang/IllegalAccessException;
        //  197    218    386    390    Ljava/lang/IllegalAccessException;
        //  221    242    386    390    Ljava/lang/IllegalAccessException;
        //  245    266    386    390    Ljava/lang/IllegalAccessException;
        //  269    328    386    390    Ljava/lang/IllegalAccessException;
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
    
    public static String d(final MotionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/view/MotionEvent.getAction:()I
        //     4: istore_1       
        //     5: ldc             Landroid/view/MotionEvent;.class
        //     7: invokevirtual   java/lang/Class.getFields:()[Ljava/lang/reflect/Field;
        //    10: astore_0       
        //    11: iconst_0       
        //    12: istore_2       
        //    13: iload_2        
        //    14: aload_0        
        //    15: arraylength    
        //    16: if_icmpge       68
        //    19: aload_0        
        //    20: iload_2        
        //    21: aaload         
        //    22: astore_3       
        //    23: aload_3        
        //    24: invokevirtual   java/lang/reflect/Field.getModifiers:()I
        //    27: invokestatic    java/lang/reflect/Modifier.isStatic:(I)Z
        //    30: ifeq            62
        //    33: aload_3        
        //    34: invokevirtual   java/lang/reflect/Field.getType:()Ljava/lang/Class;
        //    37: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    40: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    43: ifeq            62
        //    46: aload_3        
        //    47: aconst_null    
        //    48: invokevirtual   java/lang/reflect/Field.getInt:(Ljava/lang/Object;)I
        //    51: iload_1        
        //    52: if_icmpne       62
        //    55: aload_3        
        //    56: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //    59: astore_3       
        //    60: aload_3        
        //    61: areturn        
        //    62: iinc            2, 1
        //    65: goto            13
        //    68: ldc             "---"
        //    70: areturn        
        //    71: astore_3       
        //    72: goto            62
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  23     60     71     75     Ljava/lang/IllegalAccessException;
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
    
    public static String e(final int n) {
        final StackTraceElement stackTraceElement = new Throwable().getStackTrace()[n + 2];
        final StringBuilder sb = new StringBuilder();
        sb.append(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")");
        return sb.toString();
    }
    
    public static String f() {
        final StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        final StringBuilder sb = new StringBuilder();
        sb.append(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(") ");
        sb.append(stackTraceElement.getMethodName());
        sb.append("()");
        return sb.toString();
    }
    
    public static String g() {
        final StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        final StringBuilder sb = new StringBuilder();
        sb.append(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")");
        return sb.toString();
    }
    
    public static String h() {
        final StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        final StringBuilder sb = new StringBuilder();
        sb.append(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")");
        return sb.toString();
    }
    
    public static String i(final Context context, final int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        }
        catch (Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("?");
            sb.append(i);
            return sb.toString();
        }
    }
    
    public static String j(final Context context, final int[] array) {
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append(array.length);
            sb.append("[");
            String s = sb.toString();
            for (int i = 0; i < array.length; ++i) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(s);
                String str;
                if (i == 0) {
                    str = "";
                }
                else {
                    str = " ";
                }
                sb2.append(str);
                final String string = sb2.toString();
                String str2;
                try {
                    str2 = context.getResources().getResourceEntryName(array[i]);
                }
                catch (Resources$NotFoundException ex2) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("? ");
                    sb3.append(array[i]);
                    sb3.append(" ");
                    str2 = sb3.toString();
                }
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(str2);
                s = sb4.toString();
            }
            final StringBuilder sb5 = new StringBuilder();
            sb5.append(s);
            sb5.append("]");
            return sb5.toString();
        }
        catch (Exception ex) {
            Log.v("DEBUG", ex.toString());
            return "UNKNOWN";
        }
    }
    
    public static String k(final View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        }
        catch (Exception ex) {
            return "UNKNOWN";
        }
    }
    
    public static String l(final s s, final int n) {
        return m(s, n, -1);
    }
    
    public static String m(final s s, int length, final int n) {
        if (length == -1) {
            return "UNDEFINED";
        }
        String s3;
        final String s2 = s3 = s.getContext().getResources().getResourceEntryName(length);
        if (n != -1) {
            String replaceAll = s2;
            if (s2.length() > n) {
                replaceAll = s2.replaceAll("([^_])[aeiou]+", "$1");
            }
            s3 = replaceAll;
            if (replaceAll.length() > n) {
                length = replaceAll.replaceAll("[^_]", "").length();
                s3 = replaceAll;
                if (length > 0) {
                    length = (replaceAll.length() - n) / length;
                    final StringBuilder sb = new StringBuilder();
                    sb.append(CharBuffer.allocate(length).toString().replace('\0', '.'));
                    sb.append("_");
                    s3 = replaceAll.replaceAll(sb.toString(), "_");
                }
            }
        }
        return s3;
    }
    
    public static void n(final String s, final String str, int i) {
        final StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        final int length = stackTrace.length;
        final int n = 1;
        final int min = Math.min(i, length - 1);
        String string = " ";
        StackTraceElement stackTraceElement;
        StringBuilder sb;
        String string2;
        StringBuilder sb2;
        StringBuilder sb3;
        for (i = n; i <= min; ++i) {
            stackTraceElement = stackTrace[i];
            sb = new StringBuilder();
            sb.append(".(");
            sb.append(stackTrace[i].getFileName());
            sb.append(":");
            sb.append(stackTrace[i].getLineNumber());
            sb.append(") ");
            sb.append(stackTrace[i].getMethodName());
            string2 = sb.toString();
            sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(" ");
            string = sb2.toString();
            sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(string);
            sb3.append(string2);
            sb3.append(string);
            Log.v(s, sb3.toString());
        }
    }
    
    public static void o(final String str, int i) {
        final StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        final int length = stackTrace.length;
        final int n = 1;
        final int min = Math.min(i, length - 1);
        String string = " ";
        StackTraceElement stackTraceElement;
        StringBuilder sb;
        String string2;
        StringBuilder sb2;
        PrintStream out;
        StringBuilder sb3;
        for (i = n; i <= min; ++i) {
            stackTraceElement = stackTrace[i];
            sb = new StringBuilder();
            sb.append(".(");
            sb.append(stackTrace[i].getFileName());
            sb.append(":");
            sb.append(stackTrace[i].getLineNumber());
            sb.append(") ");
            string2 = sb.toString();
            sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(" ");
            string = sb2.toString();
            out = System.out;
            sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(string);
            sb3.append(string2);
            sb3.append(string);
            out.println(sb3.toString());
        }
    }
}
