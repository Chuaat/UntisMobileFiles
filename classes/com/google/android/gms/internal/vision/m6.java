// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.logging.Logger;

abstract class m6<T extends b6>
{
    private static final Logger a;
    private static String b;
    
    static {
        a = Logger.getLogger(v5.class.getName());
        m6.b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
    }
    
    static <T extends b6> T b(final Class<T> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //     5: astore_1       
        //     6: aload_0        
        //     7: ldc             Lcom/google/android/gms/internal/vision/b6;.class
        //     9: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    12: ifeq            22
        //    15: getstatic       com/google/android/gms/internal/vision/m6.b:Ljava/lang/String;
        //    18: astore_2       
        //    19: goto            64
        //    22: aload_0        
        //    23: invokevirtual   java/lang/Class.getPackage:()Ljava/lang/Package;
        //    26: ldc             Lcom/google/android/gms/internal/vision/m6;.class
        //    28: invokevirtual   java/lang/Class.getPackage:()Ljava/lang/Package;
        //    31: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    34: ifeq            357
        //    37: ldc             "%s.BlazeGenerated%sLoader"
        //    39: iconst_2       
        //    40: anewarray       Ljava/lang/Object;
        //    43: dup            
        //    44: iconst_0       
        //    45: aload_0        
        //    46: invokevirtual   java/lang/Class.getPackage:()Ljava/lang/Package;
        //    49: invokevirtual   java/lang/Package.getName:()Ljava/lang/String;
        //    52: aastore        
        //    53: dup            
        //    54: iconst_1       
        //    55: aload_0        
        //    56: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //    59: aastore        
        //    60: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    63: astore_2       
        //    64: aload_2        
        //    65: iconst_1       
        //    66: aload_1        
        //    67: invokestatic    java/lang/Class.forName:(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
        //    70: astore_2       
        //    71: aload_2        
        //    72: iconst_0       
        //    73: anewarray       Ljava/lang/Class;
        //    76: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //    79: iconst_0       
        //    80: anewarray       Ljava/lang/Object;
        //    83: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //    86: checkcast       Lcom/google/android/gms/internal/vision/m6;
        //    89: astore_2       
        //    90: aload_0        
        //    91: aload_2        
        //    92: invokevirtual   com/google/android/gms/internal/vision/m6.a:()Lcom/google/android/gms/internal/vision/b6;
        //    95: invokevirtual   java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
        //    98: checkcast       Lcom/google/android/gms/internal/vision/b6;
        //   101: areturn        
        //   102: astore_3       
        //   103: new             Ljava/lang/IllegalStateException;
        //   106: astore_2       
        //   107: aload_2        
        //   108: aload_3        
        //   109: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   112: aload_2        
        //   113: athrow         
        //   114: astore_2       
        //   115: new             Ljava/lang/IllegalStateException;
        //   118: astore_3       
        //   119: aload_3        
        //   120: aload_2        
        //   121: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   124: aload_3        
        //   125: athrow         
        //   126: astore_3       
        //   127: new             Ljava/lang/IllegalStateException;
        //   130: astore_2       
        //   131: aload_2        
        //   132: aload_3        
        //   133: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   136: aload_2        
        //   137: athrow         
        //   138: astore_3       
        //   139: new             Ljava/lang/IllegalStateException;
        //   142: astore_2       
        //   143: aload_2        
        //   144: aload_3        
        //   145: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   148: aload_2        
        //   149: athrow         
        //   150: astore_2       
        //   151: ldc             Lcom/google/android/gms/internal/vision/m6;.class
        //   153: aload_1        
        //   154: invokestatic    java/util/ServiceLoader.load:(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;
        //   157: invokevirtual   java/util/ServiceLoader.iterator:()Ljava/util/Iterator;
        //   160: astore          4
        //   162: new             Ljava/util/ArrayList;
        //   165: dup            
        //   166: invokespecial   java/util/ArrayList.<init>:()V
        //   169: astore          5
        //   171: aload           4
        //   173: invokeinterface java/util/Iterator.hasNext:()Z
        //   178: ifeq            264
        //   181: aload           5
        //   183: aload_0        
        //   184: aload           4
        //   186: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   191: checkcast       Lcom/google/android/gms/internal/vision/m6;
        //   194: invokevirtual   com/google/android/gms/internal/vision/m6.a:()Lcom/google/android/gms/internal/vision/b6;
        //   197: invokevirtual   java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
        //   200: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   203: pop            
        //   204: goto            171
        //   207: astore          6
        //   209: getstatic       com/google/android/gms/internal/vision/m6.a:Ljava/util/logging/Logger;
        //   212: astore_3       
        //   213: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //   216: astore_1       
        //   217: aload_0        
        //   218: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   221: astore_2       
        //   222: aload_2        
        //   223: invokevirtual   java/lang/String.length:()I
        //   226: ifeq            239
        //   229: ldc             "Unable to load "
        //   231: aload_2        
        //   232: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   235: astore_2       
        //   236: goto            249
        //   239: new             Ljava/lang/String;
        //   242: dup            
        //   243: ldc             "Unable to load "
        //   245: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   248: astore_2       
        //   249: aload_3        
        //   250: aload_1        
        //   251: ldc             "com.google.protobuf.GeneratedExtensionRegistryLoader"
        //   253: ldc             "load"
        //   255: aload_2        
        //   256: aload           6
        //   258: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   261: goto            171
        //   264: aload           5
        //   266: invokevirtual   java/util/ArrayList.size:()I
        //   269: iconst_1       
        //   270: if_icmpne       283
        //   273: aload           5
        //   275: iconst_0       
        //   276: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   279: checkcast       Lcom/google/android/gms/internal/vision/b6;
        //   282: areturn        
        //   283: aload           5
        //   285: invokevirtual   java/util/ArrayList.size:()I
        //   288: ifne            293
        //   291: aconst_null    
        //   292: areturn        
        //   293: aload_0        
        //   294: ldc             "combine"
        //   296: iconst_1       
        //   297: anewarray       Ljava/lang/Class;
        //   300: dup            
        //   301: iconst_0       
        //   302: ldc             Ljava/util/Collection;.class
        //   304: aastore        
        //   305: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   308: aconst_null    
        //   309: iconst_1       
        //   310: anewarray       Ljava/lang/Object;
        //   313: dup            
        //   314: iconst_0       
        //   315: aload           5
        //   317: aastore        
        //   318: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   321: checkcast       Lcom/google/android/gms/internal/vision/b6;
        //   324: astore_0       
        //   325: aload_0        
        //   326: areturn        
        //   327: astore_0       
        //   328: new             Ljava/lang/IllegalStateException;
        //   331: dup            
        //   332: aload_0        
        //   333: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   336: athrow         
        //   337: astore_0       
        //   338: new             Ljava/lang/IllegalStateException;
        //   341: dup            
        //   342: aload_0        
        //   343: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   346: athrow         
        //   347: astore_0       
        //   348: new             Ljava/lang/IllegalStateException;
        //   351: dup            
        //   352: aload_0        
        //   353: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   356: athrow         
        //   357: new             Ljava/lang/IllegalArgumentException;
        //   360: dup            
        //   361: aload_0        
        //   362: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   365: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   368: athrow         
        //    Signature:
        //  <T:Lcom/google/android/gms/internal/vision/b6;>(Ljava/lang/Class<TT;>;)TT;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  64     71     150    357    Ljava/lang/ClassNotFoundException;
        //  71     90     138    150    Ljava/lang/NoSuchMethodException;
        //  71     90     126    138    Ljava/lang/InstantiationException;
        //  71     90     114    126    Ljava/lang/IllegalAccessException;
        //  71     90     102    114    Ljava/lang/reflect/InvocationTargetException;
        //  71     90     150    357    Ljava/lang/ClassNotFoundException;
        //  90     102    150    357    Ljava/lang/ClassNotFoundException;
        //  103    114    150    357    Ljava/lang/ClassNotFoundException;
        //  115    126    150    357    Ljava/lang/ClassNotFoundException;
        //  127    138    150    357    Ljava/lang/ClassNotFoundException;
        //  139    150    150    357    Ljava/lang/ClassNotFoundException;
        //  181    204    207    264    Ljava/util/ServiceConfigurationError;
        //  293    325    347    357    Ljava/lang/NoSuchMethodException;
        //  293    325    337    347    Ljava/lang/IllegalAccessException;
        //  293    325    327    337    Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 195 out of bounds for length 195
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
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
    
    protected abstract T a();
}
