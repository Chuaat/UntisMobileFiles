// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.logging.Logger;

abstract class d9<T extends v8>
{
    private static final Logger a;
    private static final String b;
    
    static {
        a = Logger.getLogger(q8.class.getName());
        b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
    }
    
    static <T extends v8> T b(final Class<T> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //     5: astore_1       
        //     6: aload_0        
        //     7: ldc             Lcom/google/android/gms/internal/measurement/v8;.class
        //     9: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    12: ifeq            22
        //    15: getstatic       com/google/android/gms/internal/measurement/d9.b:Ljava/lang/String;
        //    18: astore_2       
        //    19: goto            64
        //    22: aload_0        
        //    23: invokevirtual   java/lang/Class.getPackage:()Ljava/lang/Package;
        //    26: ldc             Lcom/google/android/gms/internal/measurement/d9;.class
        //    28: invokevirtual   java/lang/Class.getPackage:()Ljava/lang/Package;
        //    31: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    34: ifeq            353
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
        //    86: checkcast       Lcom/google/android/gms/internal/measurement/d9;
        //    89: astore_2       
        //    90: aload_0        
        //    91: aload_2        
        //    92: invokevirtual   com/google/android/gms/internal/measurement/d9.a:()Lcom/google/android/gms/internal/measurement/v8;
        //    95: invokevirtual   java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
        //    98: checkcast       Lcom/google/android/gms/internal/measurement/v8;
        //   101: areturn        
        //   102: astore_3       
        //   103: new             Ljava/lang/IllegalStateException;
        //   106: astore_2       
        //   107: aload_2        
        //   108: aload_3        
        //   109: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   112: aload_2        
        //   113: athrow         
        //   114: astore_3       
        //   115: new             Ljava/lang/IllegalStateException;
        //   118: astore_2       
        //   119: aload_2        
        //   120: aload_3        
        //   121: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   124: aload_2        
        //   125: athrow         
        //   126: astore_3       
        //   127: new             Ljava/lang/IllegalStateException;
        //   130: astore_2       
        //   131: aload_2        
        //   132: aload_3        
        //   133: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   136: aload_2        
        //   137: athrow         
        //   138: astore_2       
        //   139: new             Ljava/lang/IllegalStateException;
        //   142: astore_3       
        //   143: aload_3        
        //   144: aload_2        
        //   145: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   148: aload_3        
        //   149: athrow         
        //   150: astore_2       
        //   151: ldc             Lcom/google/android/gms/internal/measurement/d9;.class
        //   153: aload_1        
        //   154: invokestatic    java/util/ServiceLoader.load:(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;
        //   157: invokevirtual   java/util/ServiceLoader.iterator:()Ljava/util/Iterator;
        //   160: astore          4
        //   162: new             Ljava/util/ArrayList;
        //   165: dup            
        //   166: invokespecial   java/util/ArrayList.<init>:()V
        //   169: astore_1       
        //   170: aload           4
        //   172: invokeinterface java/util/Iterator.hasNext:()Z
        //   177: ifeq            264
        //   180: aload_1        
        //   181: aload_0        
        //   182: aload           4
        //   184: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   189: checkcast       Lcom/google/android/gms/internal/measurement/d9;
        //   192: invokevirtual   com/google/android/gms/internal/measurement/d9.a:()Lcom/google/android/gms/internal/measurement/v8;
        //   195: invokevirtual   java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
        //   198: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   201: pop            
        //   202: goto            170
        //   205: astore          5
        //   207: getstatic       com/google/android/gms/internal/measurement/d9.a:Ljava/util/logging/Logger;
        //   210: astore          6
        //   212: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //   215: astore_3       
        //   216: aload_0        
        //   217: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   220: astore_2       
        //   221: aload_2        
        //   222: invokevirtual   java/lang/String.length:()I
        //   225: ifeq            238
        //   228: ldc             "Unable to load "
        //   230: aload_2        
        //   231: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   234: astore_2       
        //   235: goto            248
        //   238: new             Ljava/lang/String;
        //   241: dup            
        //   242: ldc             "Unable to load "
        //   244: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   247: astore_2       
        //   248: aload           6
        //   250: aload_3        
        //   251: ldc             "com.google.protobuf.GeneratedExtensionRegistryLoader"
        //   253: ldc             "load"
        //   255: aload_2        
        //   256: aload           5
        //   258: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   261: goto            170
        //   264: aload_1        
        //   265: invokevirtual   java/util/ArrayList.size:()I
        //   268: iconst_1       
        //   269: if_icmpne       281
        //   272: aload_1        
        //   273: iconst_0       
        //   274: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   277: checkcast       Lcom/google/android/gms/internal/measurement/v8;
        //   280: areturn        
        //   281: aload_1        
        //   282: invokevirtual   java/util/ArrayList.size:()I
        //   285: ifne            290
        //   288: aconst_null    
        //   289: areturn        
        //   290: aload_0        
        //   291: ldc             "combine"
        //   293: iconst_1       
        //   294: anewarray       Ljava/lang/Class;
        //   297: dup            
        //   298: iconst_0       
        //   299: ldc             Ljava/util/Collection;.class
        //   301: aastore        
        //   302: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   305: aconst_null    
        //   306: iconst_1       
        //   307: anewarray       Ljava/lang/Object;
        //   310: dup            
        //   311: iconst_0       
        //   312: aload_1        
        //   313: aastore        
        //   314: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   317: checkcast       Lcom/google/android/gms/internal/measurement/v8;
        //   320: astore_0       
        //   321: aload_0        
        //   322: areturn        
        //   323: astore_0       
        //   324: new             Ljava/lang/IllegalStateException;
        //   327: dup            
        //   328: aload_0        
        //   329: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   332: athrow         
        //   333: astore_0       
        //   334: new             Ljava/lang/IllegalStateException;
        //   337: dup            
        //   338: aload_0        
        //   339: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   342: athrow         
        //   343: astore_0       
        //   344: new             Ljava/lang/IllegalStateException;
        //   347: dup            
        //   348: aload_0        
        //   349: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   352: athrow         
        //   353: new             Ljava/lang/IllegalArgumentException;
        //   356: dup            
        //   357: aload_0        
        //   358: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   361: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   364: athrow         
        //    Signature:
        //  <T:Lcom/google/android/gms/internal/measurement/v8;>(Ljava/lang/Class<TT;>;)TT;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  64     71     150    353    Ljava/lang/ClassNotFoundException;
        //  71     90     138    150    Ljava/lang/NoSuchMethodException;
        //  71     90     126    138    Ljava/lang/InstantiationException;
        //  71     90     114    126    Ljava/lang/IllegalAccessException;
        //  71     90     102    114    Ljava/lang/reflect/InvocationTargetException;
        //  71     90     150    353    Ljava/lang/ClassNotFoundException;
        //  90     102    150    353    Ljava/lang/ClassNotFoundException;
        //  103    114    150    353    Ljava/lang/ClassNotFoundException;
        //  115    126    150    353    Ljava/lang/ClassNotFoundException;
        //  127    138    150    353    Ljava/lang/ClassNotFoundException;
        //  139    150    150    353    Ljava/lang/ClassNotFoundException;
        //  180    202    205    264    Ljava/util/ServiceConfigurationError;
        //  290    321    343    353    Ljava/lang/NoSuchMethodException;
        //  290    321    333    343    Ljava/lang/IllegalAccessException;
        //  290    321    323    333    Ljava/lang/reflect/InvocationTargetException;
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
