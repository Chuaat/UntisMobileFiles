// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.Iterator;
import org.bson.w0;
import org.bson.codecs.s0;
import org.bson.p0;
import org.bson.codecs.x0;
import org.bson.z0;
import org.bson.codecs.configuration.a;
import java.util.HashMap;
import java.util.Map;
import org.bson.codecs.n0;

final class y implements f0
{
    @Override
    public <T> n0<T> a(final q0<T> p0, final g0 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: aload_1        
        //     3: invokeinterface org/bson/codecs/pojo/q0.a:()Ljava/lang/Class;
        //     8: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    11: ifeq            162
        //    14: aload_1        
        //    15: invokeinterface org/bson/codecs/pojo/q0.getTypeParameters:()Ljava/util/List;
        //    20: invokeinterface java/util/List.size:()I
        //    25: iconst_2       
        //    26: if_icmpne       162
        //    29: aload_1        
        //    30: invokeinterface org/bson/codecs/pojo/q0.getTypeParameters:()Ljava/util/List;
        //    35: iconst_0       
        //    36: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    41: checkcast       Lorg/bson/codecs/pojo/q0;
        //    44: invokeinterface org/bson/codecs/pojo/q0.a:()Ljava/lang/Class;
        //    49: astore_3       
        //    50: aload_3        
        //    51: ldc             Ljava/lang/String;.class
        //    53: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    56: ifeq            141
        //    59: new             Lorg/bson/codecs/pojo/y$a;
        //    62: dup            
        //    63: aload_1        
        //    64: invokeinterface org/bson/codecs/pojo/q0.a:()Ljava/lang/Class;
        //    69: aload_2        
        //    70: aload_1        
        //    71: invokeinterface org/bson/codecs/pojo/q0.getTypeParameters:()Ljava/util/List;
        //    76: iconst_1       
        //    77: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    82: checkcast       Lorg/bson/codecs/pojo/q0;
        //    85: invokeinterface org/bson/codecs/pojo/g0.a:(Lorg/bson/codecs/pojo/q0;)Lorg/bson/codecs/n0;
        //    90: invokespecial   org/bson/codecs/pojo/y$a.<init>:(Ljava/lang/Class;Lorg/bson/codecs/n0;)V
        //    93: astore_3       
        //    94: aload_3        
        //    95: areturn        
        //    96: astore_3       
        //    97: aload_1        
        //    98: invokeinterface org/bson/codecs/pojo/q0.getTypeParameters:()Ljava/util/List;
        //   103: iconst_1       
        //   104: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   109: checkcast       Lorg/bson/codecs/pojo/q0;
        //   112: invokeinterface org/bson/codecs/pojo/q0.a:()Ljava/lang/Class;
        //   117: ldc             Ljava/lang/Object;.class
        //   119: if_acmpne       139
        //   122: aload_2        
        //   123: ldc             Ljava/util/Map;.class
        //   125: invokestatic    org/bson/codecs/pojo/o0.c:(Ljava/lang/Class;)Lorg/bson/codecs/pojo/o0$b;
        //   128: invokevirtual   org/bson/codecs/pojo/o0$b.c:()Lorg/bson/codecs/pojo/o0;
        //   131: invokeinterface org/bson/codecs/pojo/g0.a:(Lorg/bson/codecs/pojo/q0;)Lorg/bson/codecs/n0;
        //   136: astore_1       
        //   137: aload_1        
        //   138: areturn        
        //   139: aload_3        
        //   140: athrow         
        //   141: new             Lorg/bson/codecs/configuration/a;
        //   144: dup            
        //   145: ldc             "Invalid Map type. Maps MUST have string keys, found %s instead."
        //   147: iconst_1       
        //   148: anewarray       Ljava/lang/Object;
        //   151: dup            
        //   152: iconst_0       
        //   153: aload_3        
        //   154: aastore        
        //   155: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   158: invokespecial   org/bson/codecs/configuration/a.<init>:(Ljava/lang/String;)V
        //   161: athrow         
        //   162: aconst_null    
        //   163: areturn        
        //   164: astore_1       
        //   165: goto            139
        //    Signature:
        //  <T:Ljava/lang/Object;>(Lorg/bson/codecs/pojo/q0<TT;>;Lorg/bson/codecs/pojo/g0;)Lorg/bson/codecs/n0<TT;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  59     94     96     141    Lorg/bson/codecs/configuration/a;
        //  122    137    164    168    Lorg/bson/codecs/configuration/a;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0139:
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
    
    private static class a<T> implements n0<Map<String, T>>
    {
        private final Class<Map<String, T>> a;
        private final n0<T> b;
        
        a(final Class<Map<String, T>> a, final n0<T> b) {
            this.a = a;
            this.b = b;
        }
        
        private Map<String, T> i() {
            if (this.a.isInterface()) {
                return new HashMap<String, T>();
            }
            try {
                return this.a.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            }
            catch (Exception ex) {
                throw new org.bson.codecs.configuration.a(ex.getMessage(), ex);
            }
        }
        
        public Map<String, T> e(final p0 p2, final s0 s0) {
            p2.b4();
            final Map<String, T> i = this.i();
            while (p2.o5() != org.bson.w0.H) {
                if (p2.O5() == org.bson.w0.R) {
                    i.put(p2.F4(), null);
                    p2.H4();
                }
                else {
                    i.put(p2.F4(), this.b.c(p2, s0));
                }
            }
            p2.K3();
            return i;
        }
        
        @Override
        public Class<Map<String, T>> g() {
            return this.a;
        }
        
        public void h(final z0 z0, final Map<String, T> map, final x0 x0) {
            z0.w0();
            for (final Map.Entry<String, T> entry : map.entrySet()) {
                z0.K(entry.getKey());
                if (entry.getValue() == null) {
                    z0.T();
                }
                else {
                    this.b.a(z0, entry.getValue(), x0);
                }
            }
            z0.N0();
        }
    }
}
