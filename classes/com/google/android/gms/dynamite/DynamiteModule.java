// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamite;

import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.util.DynamiteApi;
import android.content.ContentResolver;
import android.net.Uri;
import java.lang.reflect.InvocationTargetException;
import android.os.IInterface;
import android.os.IBinder;
import com.google.android.gms.common.util.i;
import android.os.RemoteException;
import android.database.Cursor;
import java.lang.reflect.Field;
import android.util.Log;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.x;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.k0;
import f2.a;

@f2.a
public final class DynamiteModule
{
    @k0
    @d6.a("DynamiteModule.class")
    private static Boolean b;
    @k0
    @d6.a("DynamiteModule.class")
    private static k c;
    @k0
    @d6.a("DynamiteModule.class")
    private static m d;
    @k0
    @d6.a("DynamiteModule.class")
    private static String e;
    @d6.a("DynamiteModule.class")
    private static int f = -1;
    private static final ThreadLocal<c> g;
    private static final b.b h;
    @RecentlyNonNull
    @f2.a
    public static final b i;
    @RecentlyNonNull
    @f2.a
    public static final b j;
    @RecentlyNonNull
    @f2.a
    public static final b k;
    @RecentlyNonNull
    @f2.a
    public static final b l;
    @RecentlyNonNull
    @f2.a
    public static final b m;
    @RecentlyNonNull
    @f2.a
    public static final b n;
    private static final b o;
    private final Context a;
    
    static {
        g = new ThreadLocal<c>();
        h = (b.b)new com.google.android.gms.dynamite.b();
        i = (b)new com.google.android.gms.dynamite.a();
        j = (b)new com.google.android.gms.dynamite.d();
        k = (b)new com.google.android.gms.dynamite.c();
        l = (b)new f();
        m = (b)new e();
        n = (b)new h();
        o = (b)new g();
    }
    
    private DynamiteModule(final Context context) {
        this.a = x.k(context);
    }
    
    @RecentlyNonNull
    @f2.a
    public static int a(@RecentlyNonNull final Context context, @RecentlyNonNull final String s) {
        try {
            final ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(s);
            sb.append(".ModuleDescriptor");
            final Class<?> loadClass = classLoader.loadClass(sb.toString());
            final Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            final Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!v.b(declaredField.get(null), s)) {
                final String value = String.valueOf(declaredField.get(null));
                final StringBuilder sb2 = new StringBuilder(value.length() + 51 + String.valueOf(s).length());
                sb2.append("Module descriptor id '");
                sb2.append(value);
                sb2.append("' didn't match expected id '");
                sb2.append(s);
                sb2.append("'");
                Log.e("DynamiteModule", sb2.toString());
                return 0;
            }
            return declaredField2.getInt(null);
        }
        catch (Exception ex) {
            final String value2 = String.valueOf(ex.getMessage());
            String concat;
            if (value2.length() != 0) {
                concat = "Failed to load module descriptor class: ".concat(value2);
            }
            else {
                concat = new String("Failed to load module descriptor class: ");
            }
            Log.e("DynamiteModule", concat);
        }
        catch (ClassNotFoundException ex2) {
            final StringBuilder sb3 = new StringBuilder(String.valueOf(s).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(s);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
        }
        return 0;
    }
    
    @RecentlyNonNull
    @f2.a
    public static int c(@RecentlyNonNull final Context context, @RecentlyNonNull final String s) {
        return f(context, s, false);
    }
    
    @RecentlyNonNull
    @f2.a
    public static DynamiteModule e(@RecentlyNonNull Context a, @RecentlyNonNull final b b, @RecentlyNonNull final String s) throws a {
        final ThreadLocal<c> g = DynamiteModule.g;
        final c value = g.get();
        final c value2 = new c(null);
        g.set(value2);
        try {
            final b.a a2 = b.a(a, s, DynamiteModule.h);
            final int a3 = a2.a;
            final int b2 = a2.b;
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 68 + String.valueOf(s).length());
            sb.append("Considering local module ");
            sb.append(s);
            sb.append(":");
            sb.append(a3);
            sb.append(" and remote module ");
            sb.append(s);
            sb.append(":");
            sb.append(b2);
            Log.i("DynamiteModule", sb.toString());
            final int c = a2.c;
            if (c == 0 || (c == -1 && a2.a == 0) || (c == 1 && a2.b == 0)) {
                final int a4 = a2.a;
                final int b3 = a2.b;
                final StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(a4);
                sb2.append(" and remote version is ");
                sb2.append(b3);
                sb2.append(".");
                throw new a(sb2.toString(), (com.google.android.gms.dynamite.b)null);
            }
            if (c == -1) {
                final DynamiteModule g2 = g(a, s);
                final Cursor a5 = value2.a;
                if (a5 != null) {
                    a5.close();
                }
                g.set(value);
                return g2;
            }
            if (c == 1) {
                try {
                    final DynamiteModule h = h(a, s, a2.b);
                    a = (Context)value2.a;
                    if (a != null) {
                        ((Cursor)a).close();
                    }
                    g.set(value);
                    return h;
                }
                catch (a a6) {
                    final String value3 = String.valueOf(a6.getMessage());
                    String concat;
                    if (value3.length() != 0) {
                        concat = "Failed to load remote module: ".concat(value3);
                    }
                    else {
                        concat = new String("Failed to load remote module: ");
                    }
                    Log.w("DynamiteModule", concat);
                    final int a7 = a2.a;
                    if (a7 != 0 && b.a(a, s, (b.b)new d(a7, 0)).c == -1) {
                        return g(a, s);
                    }
                    throw new a("Remote load failed. No local fallback found.", a6, null);
                }
            }
            final int c2 = a2.c;
            final StringBuilder sb3 = new StringBuilder(47);
            sb3.append("VersionPolicy returned invalid code:");
            sb3.append(c2);
            throw new a(sb3.toString(), (com.google.android.gms.dynamite.b)null);
        }
        finally {
            final Cursor a8 = value2.a;
            if (a8 != null) {
                a8.close();
            }
            DynamiteModule.g.set(value);
        }
    }
    
    @RecentlyNonNull
    public static int f(@RecentlyNonNull final Context p0, @RecentlyNonNull final String p1, @RecentlyNonNull final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: getstatic       com/google/android/gms/dynamite/DynamiteModule.b:Ljava/lang/Boolean;
        //     6: astore_3       
        //     7: aload_3        
        //     8: astore          4
        //    10: aload_3        
        //    11: ifnonnull       338
        //    14: aload_0        
        //    15: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //    18: invokevirtual   android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
        //    21: ldc             Lcom/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;.class
        //    23: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    26: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //    29: ldc_w           "sClassLoader"
        //    32: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    35: astore          5
        //    37: aload           5
        //    39: invokevirtual   java/lang/reflect/Field.getDeclaringClass:()Ljava/lang/Class;
        //    42: astore_3       
        //    43: aload_3        
        //    44: monitorenter   
        //    45: aload           5
        //    47: aconst_null    
        //    48: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    51: checkcast       Ljava/lang/ClassLoader;
        //    54: astore          4
        //    56: aload           4
        //    58: ifnull          90
        //    61: aload           4
        //    63: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //    66: if_acmpne       77
        //    69: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //    72: astore          4
        //    74: goto            250
        //    77: aload           4
        //    79: invokestatic    com/google/android/gms/dynamite/DynamiteModule.k:(Ljava/lang/ClassLoader;)V
        //    82: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //    85: astore          4
        //    87: goto            250
        //    90: ldc_w           "com.google.android.gms"
        //    93: aload_0        
        //    94: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //    97: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   100: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   103: ifeq            118
        //   106: aload           5
        //   108: aconst_null    
        //   109: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   112: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   115: goto            69
        //   118: aload_0        
        //   119: aload_1        
        //   120: iload_2        
        //   121: invokestatic    com/google/android/gms/dynamite/DynamiteModule.o:(Landroid/content/Context;Ljava/lang/String;Z)I
        //   124: istore          6
        //   126: getstatic       com/google/android/gms/dynamite/DynamiteModule.e:Ljava/lang/String;
        //   129: astore          4
        //   131: aload           4
        //   133: ifnull          228
        //   136: aload           4
        //   138: invokevirtual   java/lang/String.isEmpty:()Z
        //   141: ifeq            147
        //   144: goto            228
        //   147: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   150: bipush          29
        //   152: if_icmplt       180
        //   155: new             Ldalvik/system/DelegateLastClassLoader;
        //   158: astore          4
        //   160: aload           4
        //   162: getstatic       com/google/android/gms/dynamite/DynamiteModule.e:Ljava/lang/String;
        //   165: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //   168: checkcast       Ljava/lang/String;
        //   171: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   174: invokespecial   dalvik/system/DelegateLastClassLoader.<init>:(Ljava/lang/String;Ljava/lang/ClassLoader;)V
        //   177: goto            201
        //   180: new             Lcom/google/android/gms/dynamite/i;
        //   183: dup            
        //   184: getstatic       com/google/android/gms/dynamite/DynamiteModule.e:Ljava/lang/String;
        //   187: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //   190: checkcast       Ljava/lang/String;
        //   193: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   196: invokespecial   com/google/android/gms/dynamite/i.<init>:(Ljava/lang/String;Ljava/lang/ClassLoader;)V
        //   199: astore          4
        //   201: aload           4
        //   203: invokestatic    com/google/android/gms/dynamite/DynamiteModule.k:(Ljava/lang/ClassLoader;)V
        //   206: aload           5
        //   208: aconst_null    
        //   209: aload           4
        //   211: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   214: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   217: putstatic       com/google/android/gms/dynamite/DynamiteModule.b:Ljava/lang/Boolean;
        //   220: aload_3        
        //   221: monitorexit    
        //   222: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   224: monitorexit    
        //   225: iload           6
        //   227: ireturn        
        //   228: aload_3        
        //   229: monitorexit    
        //   230: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   232: monitorexit    
        //   233: iload           6
        //   235: ireturn        
        //   236: astore          4
        //   238: aload           5
        //   240: aconst_null    
        //   241: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   244: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   247: goto            69
        //   250: aload_3        
        //   251: monitorexit    
        //   252: goto            333
        //   255: astore          4
        //   257: aload_3        
        //   258: monitorexit    
        //   259: aload           4
        //   261: athrow         
        //   262: astore          4
        //   264: goto            274
        //   267: astore          4
        //   269: goto            274
        //   272: astore          4
        //   274: aload           4
        //   276: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   279: astore_3       
        //   280: aload_3        
        //   281: invokevirtual   java/lang/String.length:()I
        //   284: istore          6
        //   286: new             Ljava/lang/StringBuilder;
        //   289: astore          4
        //   291: aload           4
        //   293: iload           6
        //   295: bipush          30
        //   297: iadd           
        //   298: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   301: aload           4
        //   303: ldc_w           "Failed to load module via V2: "
        //   306: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   309: pop            
        //   310: aload           4
        //   312: aload_3        
        //   313: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   316: pop            
        //   317: ldc             "DynamiteModule"
        //   319: aload           4
        //   321: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   324: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   327: pop            
        //   328: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   331: astore          4
        //   333: aload           4
        //   335: putstatic       com/google/android/gms/dynamite/DynamiteModule.b:Ljava/lang/Boolean;
        //   338: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   340: monitorexit    
        //   341: aload           4
        //   343: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   346: istore          7
        //   348: iload           7
        //   350: ifeq            411
        //   353: aload_0        
        //   354: aload_1        
        //   355: iload_2        
        //   356: invokestatic    com/google/android/gms/dynamite/DynamiteModule.o:(Landroid/content/Context;Ljava/lang/String;Z)I
        //   359: istore          6
        //   361: iload           6
        //   363: ireturn        
        //   364: astore_1       
        //   365: aload_1        
        //   366: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   369: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   372: astore_1       
        //   373: aload_1        
        //   374: invokevirtual   java/lang/String.length:()I
        //   377: ifeq            391
        //   380: ldc_w           "Failed to retrieve remote module version: "
        //   383: aload_1        
        //   384: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   387: astore_1       
        //   388: goto            402
        //   391: new             Ljava/lang/String;
        //   394: dup            
        //   395: ldc_w           "Failed to retrieve remote module version: "
        //   398: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   401: astore_1       
        //   402: ldc             "DynamiteModule"
        //   404: aload_1        
        //   405: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   408: pop            
        //   409: iconst_0       
        //   410: ireturn        
        //   411: aload_0        
        //   412: aload_1        
        //   413: iload_2        
        //   414: invokestatic    com/google/android/gms/dynamite/DynamiteModule.m:(Landroid/content/Context;Ljava/lang/String;Z)I
        //   417: istore          6
        //   419: iload           6
        //   421: ireturn        
        //   422: astore_1       
        //   423: ldc             Lcom/google/android/gms/dynamite/DynamiteModule;.class
        //   425: monitorexit    
        //   426: aload_1        
        //   427: athrow         
        //   428: astore_1       
        //   429: aload_0        
        //   430: aload_1        
        //   431: invokestatic    com/google/android/gms/common/util/i.a:(Landroid/content/Context;Ljava/lang/Throwable;)Z
        //   434: pop            
        //   435: aload_1        
        //   436: athrow         
        //   437: astore          4
        //   439: goto            82
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                              
        //  -----  -----  -----  -----  --------------------------------------------------
        //  0      3      428    437    Any
        //  3      7      422    428    Any
        //  14     45     272    274    Ljava/lang/ClassNotFoundException;
        //  14     45     267    272    Ljava/lang/IllegalAccessException;
        //  14     45     262    267    Ljava/lang/NoSuchFieldException;
        //  14     45     422    428    Any
        //  45     56     255    262    Any
        //  61     69     255    262    Any
        //  69     74     255    262    Any
        //  77     82     437    442    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  77     82     255    262    Any
        //  82     87     255    262    Any
        //  90     115    255    262    Any
        //  118    131    236    250    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  118    131    255    262    Any
        //  136    144    236    250    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  136    144    255    262    Any
        //  147    177    236    250    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  147    177    255    262    Any
        //  180    201    236    250    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  180    201    255    262    Any
        //  201    220    236    250    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  201    220    255    262    Any
        //  220    222    255    262    Any
        //  222    225    422    428    Any
        //  228    230    255    262    Any
        //  230    233    422    428    Any
        //  238    247    255    262    Any
        //  250    252    255    262    Any
        //  257    259    255    262    Any
        //  259    262    272    274    Ljava/lang/ClassNotFoundException;
        //  259    262    267    272    Ljava/lang/IllegalAccessException;
        //  259    262    262    267    Ljava/lang/NoSuchFieldException;
        //  259    262    422    428    Any
        //  274    333    422    428    Any
        //  333    338    422    428    Any
        //  338    341    422    428    Any
        //  341    348    428    437    Any
        //  353    361    364    411    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  353    361    428    437    Any
        //  365    388    428    437    Any
        //  391    402    428    437    Any
        //  402    409    428    437    Any
        //  411    419    428    437    Any
        //  423    426    422    428    Any
        //  426    428    428    437    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0077:
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
    
    private static DynamiteModule g(final Context context, String s) {
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = "Selected local version of ".concat(s);
        }
        else {
            s = new String("Selected local version of ");
        }
        Log.i("DynamiteModule", s);
        return new DynamiteModule(context.getApplicationContext());
    }
    
    private static DynamiteModule h(final Context a, final String s, final int i) throws a {
        try {
            synchronized (DynamiteModule.class) {
                final Boolean b = DynamiteModule.b;
                // monitorexit(DynamiteModule.class)
                if (b == null) {
                    throw new a("Failed to determine which loading route to use.", (com.google.android.gms.dynamite.b)null);
                }
                if (b) {
                    return n((Context)a, s, i);
                }
                final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(s);
                sb.append(", version >= ");
                sb.append(i);
                Log.i("DynamiteModule", sb.toString());
                final k j = i((Context)a);
                if (j == null) {
                    throw new a("Failed to create IDynamiteLoader.", (com.google.android.gms.dynamite.b)null);
                }
                final int zzb = j.zzb();
                com.google.android.gms.dynamic.d d;
                if (zzb >= 3) {
                    final c c = DynamiteModule.g.get();
                    if (c == null) {
                        throw new a("No cached result cursor holder", (com.google.android.gms.dynamite.b)null);
                    }
                    d = j.f(com.google.android.gms.dynamic.f.z2(a), s, i, com.google.android.gms.dynamic.f.z2(c.a));
                }
                else if (zzb == 2) {
                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                    d = j.N1(com.google.android.gms.dynamic.f.z2(a), s, i);
                }
                else {
                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                    d = j.P0(com.google.android.gms.dynamic.f.z2(a), s, i);
                }
                if (com.google.android.gms.dynamic.f.y2(d) != null) {
                    return new DynamiteModule((Context)com.google.android.gms.dynamic.f.y2(d));
                }
                throw new a("Failed to load remote module.", (com.google.android.gms.dynamite.b)null);
            }
        }
        catch (a a) {
            throw a;
        }
        catch (RemoteException a) {
            throw new a("Failed to load remote module.", a, null);
        }
        finally {
            final Throwable t;
            i.a((Context)a, t);
            throw new a("Failed to load remote module.", t, null);
        }
    }
    
    @k0
    private static k i(final Context context) {
        synchronized (DynamiteModule.class) {
            final k c = DynamiteModule.c;
            if (c != null) {
                return c;
            }
            try {
                final IBinder binder = (IBinder)context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                k c2;
                if (binder == null) {
                    c2 = null;
                }
                else {
                    final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof k) {
                        c2 = (k)queryLocalInterface;
                    }
                    else {
                        c2 = new j(binder);
                    }
                }
                if (c2 != null) {
                    return DynamiteModule.c = c2;
                }
            }
            catch (Exception ex) {
                final String value = String.valueOf(ex.getMessage());
                String concat;
                if (value.length() != 0) {
                    concat = "Failed to load IDynamiteLoader from GmsCore: ".concat(value);
                }
                else {
                    concat = new String("Failed to load IDynamiteLoader from GmsCore: ");
                }
                Log.e("DynamiteModule", concat);
            }
            return null;
        }
    }
    
    private static Boolean j() {
        synchronized (DynamiteModule.class) {
            // monitorexit(DynamiteModule.class)
            return DynamiteModule.f >= 2;
        }
    }
    
    @d6.a("DynamiteModule.class")
    private static void k(ClassLoader d) throws a {
        try {
            d = (NoSuchMethodException)((ClassLoader)d).loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            if (d == null) {
                d = null;
            }
            else {
                final IInterface queryLocalInterface = ((IBinder)d).queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof m) {
                    d = (NoSuchMethodException)queryLocalInterface;
                }
                else {
                    d = (NoSuchMethodException)new l((IBinder)d);
                }
            }
            DynamiteModule.d = (m)d;
            return;
        }
        catch (NoSuchMethodException d) {}
        catch (InvocationTargetException d) {}
        catch (InstantiationException d) {}
        catch (IllegalAccessException d) {}
        catch (ClassNotFoundException ex) {}
        throw new a("Failed to instantiate dynamite loader", d, null);
    }
    
    private static boolean l(final Cursor a) {
        final c c = DynamiteModule.g.get();
        if (c != null && c.a == null) {
            c.a = a;
            return true;
        }
        return false;
    }
    
    private static int m(Context context, String str, final boolean b) {
        final k i = i(context);
        if (i == null) {
            return 0;
        }
        final Cursor cursor = null;
        final Cursor cursor2 = null;
        final Context context2 = null;
        Object o = cursor;
        Label_0302: {
            Cursor cursor3;
            try {
                try {
                    final int zzb = i.zzb();
                    if (zzb >= 3) {
                        o = cursor;
                        context = (Context)com.google.android.gms.dynamic.f.y2(i.D1(com.google.android.gms.dynamic.f.z2(context), (String)str, b));
                        if (context != null) {
                            try {
                                if (((Cursor)context).moveToFirst()) {
                                    final int int1 = ((Cursor)context).getInt(0);
                                    if (int1 > 0 && l((Cursor)context)) {
                                        context = context2;
                                    }
                                    if (context != null) {
                                        ((Cursor)context).close();
                                    }
                                    return int1;
                                }
                            }
                            catch (RemoteException str) {}
                            finally {
                                o = context;
                                context = (Context)str;
                                break Label_0302;
                            }
                        }
                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                        if (context != null) {
                            ((Cursor)context).close();
                        }
                        return 0;
                    }
                    if (zzb == 2) {
                        o = cursor;
                        Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                        o = cursor;
                        return i.m1(com.google.android.gms.dynamic.f.z2(context), (String)str, b);
                    }
                    o = cursor;
                    Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                    o = cursor;
                    return i.F1(com.google.android.gms.dynamic.f.z2(context), (String)str, b);
                }
                finally {}
            }
            catch (RemoteException str) {
                cursor3 = cursor2;
            }
            str = (RemoteException)String.valueOf(str.getMessage());
            if (((String)str).length() != 0) {
                str = (RemoteException)"Failed to retrieve remote module version: ".concat((String)str);
            }
            else {
                str = (RemoteException)new String("Failed to retrieve remote module version: ");
            }
            Log.w("DynamiteModule", (String)str);
            if (cursor3 != null) {
                cursor3.close();
            }
            return 0;
        }
        if (o != null) {
            ((Cursor)o).close();
        }
    }
    
    private static DynamiteModule n(Context applicationContext, final String s, final int i) throws a, RemoteException {
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(s);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            final m d = DynamiteModule.d;
            // monitorexit(DynamiteModule.class)
            if (d == null) {
                throw new a("DynamiteLoaderV2 was not cached.", (com.google.android.gms.dynamite.b)null);
            }
            final c c = DynamiteModule.g.get();
            if (c == null || c.a == null) {
                throw new a("No result cursor", (com.google.android.gms.dynamite.b)null);
            }
            applicationContext = applicationContext.getApplicationContext();
            final Cursor a = c.a;
            com.google.android.gms.dynamic.f.z2((Object)null);
            com.google.android.gms.dynamic.d d2;
            if (j()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                d2 = d.m0(com.google.android.gms.dynamic.f.z2(applicationContext), s, i, com.google.android.gms.dynamic.f.z2(a));
            }
            else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                d2 = d.f(com.google.android.gms.dynamic.f.z2(applicationContext), s, i, com.google.android.gms.dynamic.f.z2(a));
            }
            applicationContext = (Context)com.google.android.gms.dynamic.f.y2(d2);
            if (applicationContext != null) {
                return new DynamiteModule(applicationContext);
            }
            throw new a("Failed to get module context", (com.google.android.gms.dynamite.b)null);
        }
    }
    
    private static int o(Context query, final String s, final boolean b) throws a {
        final Context context = null;
        final Context context2 = null;
        final Exception ex;
        Label_0278: {
            try {
                final ContentResolver contentResolver = query.getContentResolver();
                String str;
                if (b) {
                    str = "api_force_staging";
                }
                else {
                    str = "api";
                }
                final StringBuilder sb = new StringBuilder(str.length() + 42 + String.valueOf(s).length());
                sb.append("content://com.google.android.gms.chimera/");
                sb.append(str);
                sb.append("/");
                sb.append(s);
                query = (Context)contentResolver.query(Uri.parse(sb.toString()), (String[])null, (String)null, (String[])null, (String)null);
                Label_0213: {
                    if (query == null) {
                        break Label_0213;
                    }
                    try {
                        if (((Cursor)query).moveToFirst()) {
                            final int int1 = ((Cursor)query).getInt(0);
                            if (int1 > 0) {
                                synchronized (DynamiteModule.class) {
                                    DynamiteModule.e = ((Cursor)query).getString(2);
                                    final int columnIndex = ((Cursor)query).getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        DynamiteModule.f = ((Cursor)query).getInt(columnIndex);
                                    }
                                    // monitorexit(DynamiteModule.class)
                                    if (l((Cursor)query)) {
                                        query = context2;
                                    }
                                }
                            }
                            if (query != null) {
                                ((Cursor)query).close();
                            }
                            return int1;
                        }
                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                        throw new a("Failed to connect to dynamite module ContentResolver.", (com.google.android.gms.dynamite.b)null);
                    }
                    catch (Exception ex2) {}
                }
            }
            catch (Exception ex) {
                query = null;
            }
            finally {
                query = context;
                break Label_0278;
            }
            try {
                if (ex instanceof a) {
                    throw ex;
                }
                throw new a("V2 version check failed", ex, null);
            }
            finally {}
        }
        if (query != null) {
            ((Cursor)query).close();
        }
        throw ex;
    }
    
    @RecentlyNonNull
    @f2.a
    public final Context b() {
        return this.a;
    }
    
    @RecentlyNonNull
    @f2.a
    public final IBinder d(@RecentlyNonNull String str) throws a {
        IBinder binder = null;
        try {
            binder = (IBinder)this.a.getClassLoader().loadClass((String)str).newInstance();
            return binder;
        }
        catch (IllegalAccessException binder) {}
        catch (InstantiationException binder) {}
        catch (ClassNotFoundException ex) {}
        str = String.valueOf(str);
        if (((String)str).length() != 0) {
            str = "Failed to instantiate module class: ".concat((String)str);
        }
        else {
            str = new String("Failed to instantiate module class: ");
        }
        throw new a((String)str, (Throwable)binder, null);
    }
    
    @DynamiteApi
    public static class DynamiteLoaderClassLoader
    {
        @RecentlyNullable
        @d6.a("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }
    
    @f2.a
    public static class a extends Exception
    {
        private a(final String message) {
            super(message);
        }
        
        private a(final String message, final Throwable cause) {
            super(message, cause);
        }
    }
    
    public interface b
    {
        a a(final Context p0, final String p1, final DynamiteModule.b.b p2) throws DynamiteModule.a;
        
        public static final class a
        {
            public int a;
            public int b;
            public int c;
            
            public a() {
                this.a = 0;
                this.b = 0;
                this.c = 0;
            }
        }
        
        public interface b
        {
            int a(final Context p0, final String p1, final boolean p2) throws DynamiteModule.a;
            
            int b(final Context p0, final String p1);
        }
    }
    
    private static final class c
    {
        public Cursor a;
    }
    
    private static final class d implements DynamiteModule.b.b
    {
        private final int a;
        private final int b;
        
        public d(final int a, final int n) {
            this.a = a;
            this.b = 0;
        }
        
        @Override
        public final int a(final Context context, final String s, final boolean b) {
            return 0;
        }
        
        @Override
        public final int b(final Context context, final String s) {
            return this.a;
        }
    }
}
