// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.internal;

import kotlin.jvm.internal.k0;
import kotlin.y0;
import kotlin.e1;
import kotlin.y;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0083\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\b\u0010\u0006\u001a\u00020\u0005H\u0002\u001a \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0001\"\u0016\u0010\u000e\u001a\u00020\f8\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f" }, d2 = { "", "T", "instance", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "c", "major", "minor", "patch", "", "a", "Lkotlin/internal/k;", "Lkotlin/internal/k;", "IMPLEMENTATIONS", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class l
{
    @d
    @e
    public static final k a;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_0       
        //     4: iload_0        
        //     5: ldc             65544
        //     7: if_icmplt       253
        //    10: ldc             Lj6/a;.class
        //    12: invokevirtual   java/lang/Class.newInstance:()Ljava/lang/Object;
        //    15: astore_1       
        //    16: aload_1        
        //    17: ldc             "Class.forName(\"kotlin.in\u2026entations\").newInstance()"
        //    19: invokestatic    kotlin/jvm/internal/k0.o:(Ljava/lang/Object;Ljava/lang/String;)V
        //    22: aload_1        
        //    23: ifnull          38
        //    26: aload_1        
        //    27: checkcast       Lkotlin/internal/k;
        //    30: astore_2       
        //    31: goto            508
        //    34: astore_2       
        //    35: goto            50
        //    38: new             Ljava/lang/NullPointerException;
        //    41: astore_2       
        //    42: aload_2        
        //    43: ldc             "null cannot be cast to non-null type kotlin.internal.PlatformImplementations"
        //    45: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //    48: aload_2        
        //    49: athrow         
        //    50: aload_1        
        //    51: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    54: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    57: astore_3       
        //    58: ldc             Lkotlin/internal/k;.class
        //    60: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    63: astore          4
        //    65: new             Ljava/lang/ClassCastException;
        //    68: astore          5
        //    70: new             Ljava/lang/StringBuilder;
        //    73: astore_1       
        //    74: aload_1        
        //    75: invokespecial   java/lang/StringBuilder.<init>:()V
        //    78: aload_1        
        //    79: ldc             "Instance classloader: "
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    84: pop            
        //    85: aload_1        
        //    86: aload_3        
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    90: pop            
        //    91: aload_1        
        //    92: ldc             ", base type classloader: "
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    97: pop            
        //    98: aload_1        
        //    99: aload           4
        //   101: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   104: pop            
        //   105: aload           5
        //   107: aload_1        
        //   108: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   111: invokespecial   java/lang/ClassCastException.<init>:(Ljava/lang/String;)V
        //   114: aload           5
        //   116: aload_2        
        //   117: invokevirtual   java/lang/ClassCastException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   120: astore_2       
        //   121: aload_2        
        //   122: ldc             "ClassCastException(\"Inst\u2026baseTypeCL\").initCause(e)"
        //   124: invokestatic    kotlin/jvm/internal/k0.o:(Ljava/lang/Object;Ljava/lang/String;)V
        //   127: aload_2        
        //   128: athrow         
        //   129: astore_2       
        //   130: ldc             "kotlin.internal.JRE8PlatformImplementations"
        //   132: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   135: invokevirtual   java/lang/Class.newInstance:()Ljava/lang/Object;
        //   138: astore_1       
        //   139: aload_1        
        //   140: ldc             "Class.forName(\"kotlin.in\u2026entations\").newInstance()"
        //   142: invokestatic    kotlin/jvm/internal/k0.o:(Ljava/lang/Object;Ljava/lang/String;)V
        //   145: aload_1        
        //   146: ifnull          161
        //   149: aload_1        
        //   150: checkcast       Lkotlin/internal/k;
        //   153: astore_2       
        //   154: goto            508
        //   157: astore_2       
        //   158: goto            173
        //   161: new             Ljava/lang/NullPointerException;
        //   164: astore_2       
        //   165: aload_2        
        //   166: ldc             "null cannot be cast to non-null type kotlin.internal.PlatformImplementations"
        //   168: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   171: aload_2        
        //   172: athrow         
        //   173: aload_1        
        //   174: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   177: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //   180: astore_1       
        //   181: ldc             Lkotlin/internal/k;.class
        //   183: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //   186: astore          4
        //   188: new             Ljava/lang/ClassCastException;
        //   191: astore          5
        //   193: new             Ljava/lang/StringBuilder;
        //   196: astore_3       
        //   197: aload_3        
        //   198: invokespecial   java/lang/StringBuilder.<init>:()V
        //   201: aload_3        
        //   202: ldc             "Instance classloader: "
        //   204: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   207: pop            
        //   208: aload_3        
        //   209: aload_1        
        //   210: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   213: pop            
        //   214: aload_3        
        //   215: ldc             ", base type classloader: "
        //   217: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   220: pop            
        //   221: aload_3        
        //   222: aload           4
        //   224: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   227: pop            
        //   228: aload           5
        //   230: aload_3        
        //   231: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   234: invokespecial   java/lang/ClassCastException.<init>:(Ljava/lang/String;)V
        //   237: aload           5
        //   239: aload_2        
        //   240: invokevirtual   java/lang/ClassCastException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   243: astore_2       
        //   244: aload_2        
        //   245: ldc             "ClassCastException(\"Inst\u2026baseTypeCL\").initCause(e)"
        //   247: invokestatic    kotlin/jvm/internal/k0.o:(Ljava/lang/Object;Ljava/lang/String;)V
        //   250: aload_2        
        //   251: athrow         
        //   252: astore_2       
        //   253: iload_0        
        //   254: ldc             65543
        //   256: if_icmplt       500
        //   259: ldc             Li6/a;.class
        //   261: invokevirtual   java/lang/Class.newInstance:()Ljava/lang/Object;
        //   264: astore_1       
        //   265: aload_1        
        //   266: ldc             "Class.forName(\"kotlin.in\u2026entations\").newInstance()"
        //   268: invokestatic    kotlin/jvm/internal/k0.o:(Ljava/lang/Object;Ljava/lang/String;)V
        //   271: aload_1        
        //   272: ifnull          287
        //   275: aload_1        
        //   276: checkcast       Lkotlin/internal/k;
        //   279: astore_2       
        //   280: goto            508
        //   283: astore_2       
        //   284: goto            299
        //   287: new             Ljava/lang/NullPointerException;
        //   290: astore_2       
        //   291: aload_2        
        //   292: ldc             "null cannot be cast to non-null type kotlin.internal.PlatformImplementations"
        //   294: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   297: aload_2        
        //   298: athrow         
        //   299: aload_1        
        //   300: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   303: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //   306: astore          5
        //   308: ldc             Lkotlin/internal/k;.class
        //   310: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //   313: astore          4
        //   315: new             Ljava/lang/ClassCastException;
        //   318: astore_1       
        //   319: new             Ljava/lang/StringBuilder;
        //   322: astore_3       
        //   323: aload_3        
        //   324: invokespecial   java/lang/StringBuilder.<init>:()V
        //   327: aload_3        
        //   328: ldc             "Instance classloader: "
        //   330: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   333: pop            
        //   334: aload_3        
        //   335: aload           5
        //   337: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   340: pop            
        //   341: aload_3        
        //   342: ldc             ", base type classloader: "
        //   344: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   347: pop            
        //   348: aload_3        
        //   349: aload           4
        //   351: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   354: pop            
        //   355: aload_1        
        //   356: aload_3        
        //   357: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   360: invokespecial   java/lang/ClassCastException.<init>:(Ljava/lang/String;)V
        //   363: aload_1        
        //   364: aload_2        
        //   365: invokevirtual   java/lang/ClassCastException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   368: astore_2       
        //   369: aload_2        
        //   370: ldc             "ClassCastException(\"Inst\u2026baseTypeCL\").initCause(e)"
        //   372: invokestatic    kotlin/jvm/internal/k0.o:(Ljava/lang/Object;Ljava/lang/String;)V
        //   375: aload_2        
        //   376: athrow         
        //   377: astore_2       
        //   378: ldc             "kotlin.internal.JRE7PlatformImplementations"
        //   380: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   383: invokevirtual   java/lang/Class.newInstance:()Ljava/lang/Object;
        //   386: astore_1       
        //   387: aload_1        
        //   388: ldc             "Class.forName(\"kotlin.in\u2026entations\").newInstance()"
        //   390: invokestatic    kotlin/jvm/internal/k0.o:(Ljava/lang/Object;Ljava/lang/String;)V
        //   393: aload_1        
        //   394: ifnull          409
        //   397: aload_1        
        //   398: checkcast       Lkotlin/internal/k;
        //   401: astore_2       
        //   402: goto            508
        //   405: astore_2       
        //   406: goto            421
        //   409: new             Ljava/lang/NullPointerException;
        //   412: astore_2       
        //   413: aload_2        
        //   414: ldc             "null cannot be cast to non-null type kotlin.internal.PlatformImplementations"
        //   416: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   419: aload_2        
        //   420: athrow         
        //   421: aload_1        
        //   422: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   425: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //   428: astore_1       
        //   429: ldc             Lkotlin/internal/k;.class
        //   431: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //   434: astore          4
        //   436: new             Ljava/lang/ClassCastException;
        //   439: astore          5
        //   441: new             Ljava/lang/StringBuilder;
        //   444: astore_3       
        //   445: aload_3        
        //   446: invokespecial   java/lang/StringBuilder.<init>:()V
        //   449: aload_3        
        //   450: ldc             "Instance classloader: "
        //   452: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   455: pop            
        //   456: aload_3        
        //   457: aload_1        
        //   458: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   461: pop            
        //   462: aload_3        
        //   463: ldc             ", base type classloader: "
        //   465: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   468: pop            
        //   469: aload_3        
        //   470: aload           4
        //   472: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   475: pop            
        //   476: aload           5
        //   478: aload_3        
        //   479: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   482: invokespecial   java/lang/ClassCastException.<init>:(Ljava/lang/String;)V
        //   485: aload           5
        //   487: aload_2        
        //   488: invokevirtual   java/lang/ClassCastException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   491: astore_2       
        //   492: aload_2        
        //   493: ldc             "ClassCastException(\"Inst\u2026baseTypeCL\").initCause(e)"
        //   495: invokestatic    kotlin/jvm/internal/k0.o:(Ljava/lang/Object;Ljava/lang/String;)V
        //   498: aload_2        
        //   499: athrow         
        //   500: new             Lkotlin/internal/k;
        //   503: dup            
        //   504: invokespecial   kotlin/internal/k.<init>:()V
        //   507: astore_2       
        //   508: aload_2        
        //   509: putstatic       kotlin/internal/l.a:Lkotlin/internal/k;
        //   512: return         
        //   513: astore_2       
        //   514: goto            500
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  10     22     129    253    Ljava/lang/ClassNotFoundException;
        //  26     31     34     38     Ljava/lang/ClassCastException;
        //  26     31     129    253    Ljava/lang/ClassNotFoundException;
        //  38     50     34     38     Ljava/lang/ClassCastException;
        //  38     50     129    253    Ljava/lang/ClassNotFoundException;
        //  50     129    129    253    Ljava/lang/ClassNotFoundException;
        //  130    145    252    253    Ljava/lang/ClassNotFoundException;
        //  149    154    157    161    Ljava/lang/ClassCastException;
        //  149    154    252    253    Ljava/lang/ClassNotFoundException;
        //  161    173    157    161    Ljava/lang/ClassCastException;
        //  161    173    252    253    Ljava/lang/ClassNotFoundException;
        //  173    252    252    253    Ljava/lang/ClassNotFoundException;
        //  259    271    377    500    Ljava/lang/ClassNotFoundException;
        //  275    280    283    287    Ljava/lang/ClassCastException;
        //  275    280    377    500    Ljava/lang/ClassNotFoundException;
        //  287    299    283    287    Ljava/lang/ClassCastException;
        //  287    299    377    500    Ljava/lang/ClassNotFoundException;
        //  299    377    377    500    Ljava/lang/ClassNotFoundException;
        //  378    393    513    517    Ljava/lang/ClassNotFoundException;
        //  397    402    405    409    Ljava/lang/ClassCastException;
        //  397    402    513    517    Ljava/lang/ClassNotFoundException;
        //  409    421    405    409    Ljava/lang/ClassCastException;
        //  409    421    513    517    Ljava/lang/ClassNotFoundException;
        //  421    500    513    517    Ljava/lang/ClassNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0409:
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
    
    @e1(version = "1.2")
    @y0
    public static final boolean a(final int n, final int n2, final int n3) {
        return y.L.i(n, n2, n3);
    }
    
    private static final int c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //     5: astore_0       
        //     6: ldc             65542
        //     8: istore_1       
        //     9: iload_1        
        //    10: istore_2       
        //    11: aload_0        
        //    12: ifnull          123
        //    15: aload_0        
        //    16: bipush          46
        //    18: iconst_0       
        //    19: iconst_0       
        //    20: bipush          6
        //    22: aconst_null    
        //    23: invokestatic    kotlin/text/s.q3:(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I
        //    26: istore_3       
        //    27: iload_3        
        //    28: ifge            43
        //    31: aload_0        
        //    32: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    35: istore_2       
        //    36: iload_2        
        //    37: ldc             65536
        //    39: imul           
        //    40: istore_1       
        //    41: iload_1        
        //    42: ireturn        
        //    43: iload_3        
        //    44: iconst_1       
        //    45: iadd           
        //    46: istore          4
        //    48: aload_0        
        //    49: bipush          46
        //    51: iload           4
        //    53: iconst_0       
        //    54: iconst_4       
        //    55: aconst_null    
        //    56: invokestatic    kotlin/text/s.q3:(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I
        //    59: istore          5
        //    61: iload           5
        //    63: istore_2       
        //    64: iload           5
        //    66: ifge            74
        //    69: aload_0        
        //    70: invokevirtual   java/lang/String.length:()I
        //    73: istore_2       
        //    74: aload_0        
        //    75: iconst_0       
        //    76: iload_3        
        //    77: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    80: astore          6
        //    82: aload           6
        //    84: ldc             "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
        //    86: invokestatic    kotlin/jvm/internal/k0.o:(Ljava/lang/Object;Ljava/lang/String;)V
        //    89: aload_0        
        //    90: iload           4
        //    92: iload_2        
        //    93: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    96: astore_0       
        //    97: aload_0        
        //    98: ldc             "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
        //   100: invokestatic    kotlin/jvm/internal/k0.o:(Ljava/lang/Object;Ljava/lang/String;)V
        //   103: aload           6
        //   105: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   108: istore          5
        //   110: aload_0        
        //   111: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   114: istore_2       
        //   115: iload           5
        //   117: ldc             65536
        //   119: imul           
        //   120: iload_2        
        //   121: iadd           
        //   122: istore_2       
        //   123: iload_2        
        //   124: ireturn        
        //   125: astore          6
        //   127: goto            41
        //   130: astore          6
        //   132: iload_1        
        //   133: istore_2       
        //   134: goto            123
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  31     36     125    130    Ljava/lang/NumberFormatException;
        //  103    115    130    137    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0123:
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
