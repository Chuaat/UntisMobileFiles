// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.c4;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.internal.measurement.v3;
import java.math.BigDecimal;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Pattern;
import java.util.Locale;
import java.util.List;

abstract class va
{
    final String a;
    final int b;
    Boolean c;
    Boolean d;
    Long e;
    Long f;
    
    va(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    private static Boolean d(final String s, int flags, final boolean b, final String s2, final List<String> list, final String regex, final n3 n3) {
        if (flags == 7) {
            if (list == null || list.size() == 0) {
                return null;
            }
        }
        else if (s2 == null) {
            return null;
        }
        String upperCase = s;
        if (!b) {
            upperCase = s;
            if (flags != 2) {
                upperCase = s.toUpperCase(Locale.ENGLISH);
            }
        }
        boolean b2 = false;
        switch (flags - 1) {
            default: {
                return null;
            }
            case 6: {
                if (list == null) {
                    return null;
                }
                b2 = list.contains(upperCase);
                break;
            }
            case 5: {
                b2 = upperCase.equals(s2);
                break;
            }
            case 4: {
                b2 = upperCase.contains(s2);
                break;
            }
            case 3: {
                b2 = upperCase.endsWith(s2);
                break;
            }
            case 2: {
                b2 = upperCase.startsWith(s2);
                break;
            }
            case 1: {
                if (regex == null) {
                    return null;
                }
                if (!b) {
                    flags = 66;
                }
                else {
                    flags = 0;
                }
                try {
                    return Pattern.compile(regex, flags).matcher(upperCase).matches();
                }
                catch (PatternSyntaxException ex) {
                    if (n3 != null) {
                        n3.t().b("Invalid regular expression in REGEXP audience filter. expression", regex);
                    }
                    return null;
                }
                break;
            }
        }
        return b2;
    }
    
    @d0
    static Boolean e(final BigDecimal p0, final v3 p1, final double p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //     4: pop            
        //     5: aload_1        
        //     6: invokevirtual   com/google/android/gms/internal/measurement/v3.C:()Z
        //     9: istore          4
        //    11: aconst_null    
        //    12: astore          5
        //    14: iload           4
        //    16: ifeq            456
        //    19: aload_1        
        //    20: invokevirtual   com/google/android/gms/internal/measurement/v3.H:()I
        //    23: istore          6
        //    25: iconst_1       
        //    26: istore          7
        //    28: iconst_1       
        //    29: istore          8
        //    31: iconst_1       
        //    32: istore          4
        //    34: iload           6
        //    36: iconst_1       
        //    37: if_icmpne       43
        //    40: goto            456
        //    43: aload_1        
        //    44: invokevirtual   com/google/android/gms/internal/measurement/v3.H:()I
        //    47: iconst_5       
        //    48: if_icmpne       70
        //    51: aload_1        
        //    52: invokevirtual   com/google/android/gms/internal/measurement/v3.G:()Z
        //    55: ifeq            68
        //    58: aload_1        
        //    59: invokevirtual   com/google/android/gms/internal/measurement/v3.F:()Z
        //    62: ifeq            68
        //    65: goto            79
        //    68: aconst_null    
        //    69: areturn        
        //    70: aload_1        
        //    71: invokevirtual   com/google/android/gms/internal/measurement/v3.D:()Z
        //    74: ifne            79
        //    77: aconst_null    
        //    78: areturn        
        //    79: aload_1        
        //    80: invokevirtual   com/google/android/gms/internal/measurement/v3.H:()I
        //    83: istore          6
        //    85: aload_1        
        //    86: invokevirtual   com/google/android/gms/internal/measurement/v3.H:()I
        //    89: iconst_5       
        //    90: if_icmpne       150
        //    93: aload_1        
        //    94: invokevirtual   com/google/android/gms/internal/measurement/v3.A:()Ljava/lang/String;
        //    97: invokestatic    com/google/android/gms/measurement/internal/ba.O:(Ljava/lang/String;)Z
        //   100: ifeq            148
        //   103: aload_1        
        //   104: invokevirtual   com/google/android/gms/internal/measurement/v3.z:()Ljava/lang/String;
        //   107: invokestatic    com/google/android/gms/measurement/internal/ba.O:(Ljava/lang/String;)Z
        //   110: ifne            116
        //   113: goto            148
        //   116: new             Ljava/math/BigDecimal;
        //   119: astore          9
        //   121: aload           9
        //   123: aload_1        
        //   124: invokevirtual   com/google/android/gms/internal/measurement/v3.A:()Ljava/lang/String;
        //   127: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   130: new             Ljava/math/BigDecimal;
        //   133: dup            
        //   134: aload_1        
        //   135: invokevirtual   com/google/android/gms/internal/measurement/v3.z:()Ljava/lang/String;
        //   138: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   141: astore_1       
        //   142: aconst_null    
        //   143: astore          10
        //   145: goto            181
        //   148: aconst_null    
        //   149: areturn        
        //   150: aload_1        
        //   151: invokevirtual   com/google/android/gms/internal/measurement/v3.x:()Ljava/lang/String;
        //   154: invokestatic    com/google/android/gms/measurement/internal/ba.O:(Ljava/lang/String;)Z
        //   157: ifne            162
        //   160: aconst_null    
        //   161: areturn        
        //   162: new             Ljava/math/BigDecimal;
        //   165: dup            
        //   166: aload_1        
        //   167: invokevirtual   com/google/android/gms/internal/measurement/v3.x:()Ljava/lang/String;
        //   170: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   173: astore          10
        //   175: aconst_null    
        //   176: astore          9
        //   178: aload           9
        //   180: astore_1       
        //   181: iload           6
        //   183: iconst_5       
        //   184: if_icmpne       199
        //   187: aload           5
        //   189: astore          11
        //   191: aload           9
        //   193: ifnull          428
        //   196: goto            211
        //   199: aload           10
        //   201: ifnonnull       211
        //   204: aload           5
        //   206: astore          11
        //   208: goto            428
        //   211: iinc            6, -1
        //   214: iload           6
        //   216: iconst_1       
        //   217: if_icmpeq       419
        //   220: iload           6
        //   222: iconst_2       
        //   223: if_icmpeq       382
        //   226: iload           6
        //   228: iconst_3       
        //   229: if_icmpeq       287
        //   232: iload           6
        //   234: iconst_4       
        //   235: if_icmpeq       245
        //   238: aload           5
        //   240: astore          11
        //   242: goto            428
        //   245: aload           5
        //   247: astore          11
        //   249: aload           9
        //   251: ifnull          428
        //   254: aload_0        
        //   255: aload           9
        //   257: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   260: iflt            274
        //   263: aload_0        
        //   264: aload_1        
        //   265: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   268: ifgt            274
        //   271: goto            277
        //   274: iconst_0       
        //   275: istore          4
        //   277: iload           4
        //   279: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   282: astore          11
        //   284: goto            428
        //   287: aload           10
        //   289: ifnonnull       299
        //   292: aload           5
        //   294: astore          11
        //   296: goto            428
        //   299: dload_2        
        //   300: dconst_0       
        //   301: dcmpl          
        //   302: ifeq            370
        //   305: aload_0        
        //   306: aload           10
        //   308: new             Ljava/math/BigDecimal;
        //   311: dup            
        //   312: dload_2        
        //   313: invokespecial   java/math/BigDecimal.<init>:(D)V
        //   316: new             Ljava/math/BigDecimal;
        //   319: dup            
        //   320: iconst_2       
        //   321: invokespecial   java/math/BigDecimal.<init>:(I)V
        //   324: invokevirtual   java/math/BigDecimal.multiply:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   327: invokevirtual   java/math/BigDecimal.subtract:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   330: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   333: ifle            274
        //   336: aload_0        
        //   337: aload           10
        //   339: new             Ljava/math/BigDecimal;
        //   342: dup            
        //   343: dload_2        
        //   344: invokespecial   java/math/BigDecimal.<init>:(D)V
        //   347: new             Ljava/math/BigDecimal;
        //   350: dup            
        //   351: iconst_2       
        //   352: invokespecial   java/math/BigDecimal.<init>:(I)V
        //   355: invokevirtual   java/math/BigDecimal.multiply:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   358: invokevirtual   java/math/BigDecimal.add:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   361: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   364: ifge            274
        //   367: goto            277
        //   370: aload_0        
        //   371: aload           10
        //   373: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   376: ifne            274
        //   379: goto            277
        //   382: aload           10
        //   384: ifnonnull       394
        //   387: aload           5
        //   389: astore          11
        //   391: goto            428
        //   394: aload_0        
        //   395: aload           10
        //   397: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   400: ifle            410
        //   403: iload           7
        //   405: istore          4
        //   407: goto            413
        //   410: iconst_0       
        //   411: istore          4
        //   413: iload           4
        //   415: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   418: areturn        
        //   419: aload           10
        //   421: ifnonnull       431
        //   424: aload           5
        //   426: astore          11
        //   428: aload           11
        //   430: areturn        
        //   431: aload_0        
        //   432: aload           10
        //   434: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   437: ifge            447
        //   440: iload           8
        //   442: istore          4
        //   444: goto            450
        //   447: iconst_0       
        //   448: istore          4
        //   450: iload           4
        //   452: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   455: areturn        
        //   456: aconst_null    
        //   457: areturn        
        //   458: astore_0       
        //   459: goto            148
        //   462: astore_0       
        //   463: goto            456
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  116    142    458    462    Ljava/lang/NumberFormatException;
        //  162    175    462    466    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0162:
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
    
    @d0
    static Boolean f(final String s, final c4 c4, final n3 n3) {
        x.k(c4);
        if (s == null) {
            return null;
        }
        if (c4.E() && c4.F() != 1) {
            if (c4.F() == 7) {
                if (c4.v() == 0) {
                    return null;
                }
            }
            else if (!c4.D()) {
                return null;
            }
            final int f = c4.F();
            final boolean b = c4.B();
            String s2;
            if (!b && f != 2 && f != 7) {
                s2 = c4.z().toUpperCase(Locale.ENGLISH);
            }
            else {
                s2 = c4.z();
            }
            List<String> list;
            if (c4.v() == 0) {
                list = null;
            }
            else {
                final List<String> list2 = list = c4.A();
                if (!b) {
                    final ArrayList list3 = new ArrayList<String>(list2.size());
                    final Iterator<String> iterator = list2.iterator();
                    while (iterator.hasNext()) {
                        list3.add(iterator.next().toUpperCase(Locale.ENGLISH));
                    }
                    list = Collections.unmodifiableList((List<? extends String>)list3);
                }
            }
            String s3;
            if (f == 2) {
                s3 = s2;
            }
            else {
                s3 = null;
            }
            return d(s, f, b, s2, list, s3, n3);
        }
        return null;
    }
    
    static Boolean g(final double n, final v3 v3) {
        try {
            return e(new BigDecimal(n), v3, Math.ulp(n));
        }
        catch (NumberFormatException ex) {
            return null;
        }
    }
    
    static Boolean h(final long val, final v3 v3) {
        try {
            return e(new BigDecimal(val), v3, 0.0);
        }
        catch (NumberFormatException ex) {
            return null;
        }
    }
    
    static Boolean i(final String val, final v3 v3) {
        if (!ba.O(val)) {
            return null;
        }
        try {
            return e(new BigDecimal(val), v3, 0.0);
        }
        catch (NumberFormatException ex) {
            return null;
        }
    }
    
    @d0
    static Boolean j(final Boolean b, final boolean b2) {
        if (b == null) {
            return null;
        }
        return b != b2;
    }
    
    abstract int a();
    
    abstract boolean b();
    
    abstract boolean c();
}
