// 
// Decompiled by Procyon v0.5.36
// 

package androidx.multidex;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.zip.ZipFile;
import java.lang.reflect.Constructor;
import dalvik.system.DexFile;
import java.util.StringTokenizer;
import java.util.List;
import dalvik.system.PathClassLoader;
import dalvik.system.DexClassLoader;
import dalvik.system.BaseDexClassLoader;
import android.os.Build$VERSION;
import android.content.pm.ApplicationInfo;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.io.IOException;
import android.util.Log;
import android.content.Context;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.io.File;
import java.util.Set;

public final class b
{
    static final String a = "MultiDex";
    private static final String b = "secondary-dexes";
    private static final String c = "code_cache";
    private static final String d = "secondary-dexes";
    private static final int e = 20;
    private static final int f = 4;
    private static final int g = 2;
    private static final int h = 1;
    private static final String i = "";
    private static final Set<File> j;
    private static final boolean k;
    
    static {
        j = new HashSet<File>();
        k = o(System.getProperty("java.vm.version"));
    }
    
    private b() {
    }
    
    private static void d(final Context context) throws Exception {
        final File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Clearing old secondary dex dir (");
            sb.append(file.getPath());
            sb.append(").");
            Log.i("MultiDex", sb.toString());
            final File[] listFiles = file.listFiles();
            if (listFiles == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to list secondary dex dir content (");
                sb2.append(file.getPath());
                sb2.append(").");
                Log.w("MultiDex", sb2.toString());
                return;
            }
            for (final File file2 : listFiles) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to delete old file ");
                sb3.append(file2.getPath());
                sb3.append(" of size ");
                sb3.append(file2.length());
                Log.i("MultiDex", sb3.toString());
                if (!file2.delete()) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Failed to delete old file ");
                    sb4.append(file2.getPath());
                    Log.w("MultiDex", sb4.toString());
                }
                else {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("Deleted old file ");
                    sb5.append(file2.getPath());
                    Log.i("MultiDex", sb5.toString());
                }
            }
            if (!file.delete()) {
                final StringBuilder sb6 = new StringBuilder();
                sb6.append("Failed to delete secondary dex dir ");
                sb6.append(file.getPath());
                Log.w("MultiDex", sb6.toString());
            }
            else {
                final StringBuilder sb7 = new StringBuilder();
                sb7.append("Deleted old secondary dex dir ");
                sb7.append(file.getPath());
                Log.i("MultiDex", sb7.toString());
            }
        }
    }
    
    private static void e(final Context p0, final File p1, final File p2, final String p3, final String p4, final boolean p5) throws IOException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          6
        //     5: aload           6
        //     7: monitorenter   
        //     8: aload           6
        //    10: aload_1        
        //    11: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //    16: ifeq            23
        //    19: aload           6
        //    21: monitorexit    
        //    22: return         
        //    23: aload           6
        //    25: aload_1        
        //    26: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    31: pop            
        //    32: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    35: istore          7
        //    37: iload           7
        //    39: bipush          20
        //    41: if_icmple       140
        //    44: new             Ljava/lang/StringBuilder;
        //    47: astore          8
        //    49: aload           8
        //    51: invokespecial   java/lang/StringBuilder.<init>:()V
        //    54: aload           8
        //    56: ldc             "MultiDex is not guaranteed to work in SDK version "
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    61: pop            
        //    62: aload           8
        //    64: iload           7
        //    66: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    69: pop            
        //    70: aload           8
        //    72: ldc             ": SDK version higher than "
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: pop            
        //    78: aload           8
        //    80: bipush          20
        //    82: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    85: pop            
        //    86: aload           8
        //    88: ldc             " should be backed by "
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: pop            
        //    94: aload           8
        //    96: ldc             "runtime with built-in multidex capabilty but it's not the "
        //    98: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   101: pop            
        //   102: aload           8
        //   104: ldc             "case here: java.vm.version=\""
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   109: pop            
        //   110: aload           8
        //   112: ldc             "java.vm.version"
        //   114: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   117: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   120: pop            
        //   121: aload           8
        //   123: ldc             "\""
        //   125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   128: pop            
        //   129: ldc             "MultiDex"
        //   131: aload           8
        //   133: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   136: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   139: pop            
        //   140: aload_0        
        //   141: invokestatic    androidx/multidex/b.j:(Landroid/content/Context;)Ljava/lang/ClassLoader;
        //   144: astore          8
        //   146: aload           8
        //   148: ifnonnull       155
        //   151: aload           6
        //   153: monitorexit    
        //   154: return         
        //   155: aload_0        
        //   156: invokestatic    androidx/multidex/b.d:(Landroid/content/Context;)V
        //   159: goto            174
        //   162: astore          9
        //   164: ldc             "MultiDex"
        //   166: ldc             "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
        //   168: aload           9
        //   170: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   173: pop            
        //   174: aload_0        
        //   175: aload_2        
        //   176: aload_3        
        //   177: invokestatic    androidx/multidex/b.k:(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
        //   180: astore_3       
        //   181: new             Landroidx/multidex/d;
        //   184: astore_2       
        //   185: aload_2        
        //   186: aload_1        
        //   187: aload_3        
        //   188: invokespecial   androidx/multidex/d.<init>:(Ljava/io/File;Ljava/io/File;)V
        //   191: aconst_null    
        //   192: astore_1       
        //   193: aload_2        
        //   194: aload_0        
        //   195: aload           4
        //   197: iconst_0       
        //   198: invokevirtual   androidx/multidex/d.h:(Landroid/content/Context;Ljava/lang/String;Z)Ljava/util/List;
        //   201: astore          9
        //   203: aload           8
        //   205: aload_3        
        //   206: aload           9
        //   208: invokestatic    androidx/multidex/b.n:(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/util/List;)V
        //   211: goto            245
        //   214: astore          9
        //   216: iload           5
        //   218: ifeq            265
        //   221: ldc             "MultiDex"
        //   223: ldc             "Failed to install extracted secondary dex files, retrying with forced extraction"
        //   225: aload           9
        //   227: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   230: pop            
        //   231: aload           8
        //   233: aload_3        
        //   234: aload_2        
        //   235: aload_0        
        //   236: aload           4
        //   238: iconst_1       
        //   239: invokevirtual   androidx/multidex/d.h:(Landroid/content/Context;Ljava/lang/String;Z)Ljava/util/List;
        //   242: invokestatic    androidx/multidex/b.n:(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/util/List;)V
        //   245: aload_2        
        //   246: invokevirtual   androidx/multidex/d.close:()V
        //   249: aload_1        
        //   250: astore_0       
        //   251: goto            255
        //   254: astore_0       
        //   255: aload_0        
        //   256: ifnonnull       263
        //   259: aload           6
        //   261: monitorexit    
        //   262: return         
        //   263: aload_0        
        //   264: athrow         
        //   265: aload           9
        //   267: athrow         
        //   268: astore_0       
        //   269: aload_2        
        //   270: invokevirtual   androidx/multidex/d.close:()V
        //   273: aload_0        
        //   274: athrow         
        //   275: astore_0       
        //   276: aload           6
        //   278: monitorexit    
        //   279: aload_0        
        //   280: athrow         
        //   281: astore_1       
        //   282: goto            273
        //    Exceptions:
        //  throws java.io.IOException
        //  throws java.lang.IllegalArgumentException
        //  throws java.lang.IllegalAccessException
        //  throws java.lang.NoSuchFieldException
        //  throws java.lang.reflect.InvocationTargetException
        //  throws java.lang.NoSuchMethodException
        //  throws java.lang.SecurityException
        //  throws java.lang.ClassNotFoundException
        //  throws java.lang.InstantiationException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      22     275    281    Any
        //  23     37     275    281    Any
        //  44     140    275    281    Any
        //  140    146    275    281    Any
        //  151    154    275    281    Any
        //  155    159    162    174    Any
        //  164    174    275    281    Any
        //  174    191    275    281    Any
        //  193    203    268    275    Any
        //  203    211    214    245    Ljava/io/IOException;
        //  203    211    268    275    Any
        //  221    245    268    275    Any
        //  245    249    254    255    Ljava/io/IOException;
        //  245    249    275    281    Any
        //  259    262    275    281    Any
        //  263    265    275    281    Any
        //  265    268    268    275    Any
        //  269    273    281    285    Ljava/io/IOException;
        //  269    273    275    281    Any
        //  273    275    275    281    Any
        //  276    279    275    281    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0273:
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
    
    private static void f(final Object o, final String s, final Object[] array) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        final Field g = g(o, s);
        final Object[] array2 = (Object[])g.get(o);
        final Object[] value = (Object[])Array.newInstance(array2.getClass().getComponentType(), array2.length + array.length);
        System.arraycopy(array2, 0, value, 0, array2.length);
        System.arraycopy(array, 0, value, array2.length, array.length);
        g.set(o, value);
    }
    
    private static Field g(final Object o, final String s) throws NoSuchFieldException {
        Class<?> clazz = o.getClass();
        while (clazz != null) {
            try {
                final Field declaredField = clazz.getDeclaredField(s);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            }
            catch (NoSuchFieldException ex) {
                clazz = clazz.getSuperclass();
                continue;
            }
            break;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Field ");
        sb.append(s);
        sb.append(" not found in ");
        sb.append(o.getClass());
        throw new NoSuchFieldException(sb.toString());
    }
    
    private static Method h(final Object o, final String s, final Class<?>... array) throws NoSuchMethodException {
        Class<?> clazz = o.getClass();
        while (clazz != null) {
            try {
                final Method declaredMethod = clazz.getDeclaredMethod(s, array);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            }
            catch (NoSuchMethodException ex) {
                clazz = clazz.getSuperclass();
                continue;
            }
            break;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Method ");
        sb.append(s);
        sb.append(" with parameters ");
        sb.append(Arrays.asList(array));
        sb.append(" not found in ");
        sb.append(o.getClass());
        throw new NoSuchMethodException(sb.toString());
    }
    
    private static ApplicationInfo i(final Context context) {
        try {
            return context.getApplicationInfo();
        }
        catch (RuntimeException ex) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", (Throwable)ex);
            return null;
        }
    }
    
    private static ClassLoader j(final Context context) {
        try {
            final ClassLoader classLoader = context.getClassLoader();
            if (Build$VERSION.SDK_INT >= 14) {
                if (classLoader instanceof BaseDexClassLoader) {
                    return classLoader;
                }
            }
            else if (classLoader instanceof DexClassLoader || classLoader instanceof PathClassLoader) {
                return classLoader;
            }
            Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
            return null;
        }
        catch (RuntimeException ex) {
            Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", (Throwable)ex);
            return null;
        }
    }
    
    private static File k(Context parent, File parent2, final String child) throws IOException {
        parent2 = new File(parent2, "code_cache");
        try {
            p(parent2);
            parent = (Context)parent2;
        }
        catch (IOException ex) {
            parent = (Context)new File(parent.getFilesDir(), "code_cache");
            p((File)parent);
        }
        final File file = new File((File)parent, child);
        p(file);
        return file;
    }
    
    public static void l(final Context context) {
        Log.i("MultiDex", "Installing application");
        String s = null;
        Label_0019: {
            if (!androidx.multidex.b.k) {
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT >= 4) {
                    try {
                        final ApplicationInfo i = i(context);
                        if (i == null) {
                            Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                            return;
                        }
                        e(context, new File(i.sourceDir), new File(i.dataDir), "secondary-dexes", "", true);
                        s = "install done";
                        break Label_0019;
                    }
                    catch (Exception ex) {
                        Log.e("MultiDex", "MultiDex installation failure", (Throwable)ex);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("MultiDex installation failed (");
                        sb.append(ex.getMessage());
                        sb.append(").");
                        throw new RuntimeException(sb.toString());
                    }
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("MultiDex installation failed. SDK ");
                sb2.append(sdk_INT);
                sb2.append(" is unsupported. Min SDK version is ");
                sb2.append(4);
                sb2.append(".");
                throw new RuntimeException(sb2.toString());
            }
            s = "VM has multidex support, MultiDex support library is disabled.";
        }
        Log.i("MultiDex", s);
    }
    
    public static void m(final Context context, final Context context2) {
        Log.i("MultiDex", "Installing instrumentation");
        String s = null;
        Label_0019: {
            if (!androidx.multidex.b.k) {
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT >= 4) {
                    try {
                        final ApplicationInfo i = i(context);
                        if (i == null) {
                            Log.i("MultiDex", "No ApplicationInfo available for instrumentation, i.e. running on a test Context: MultiDex support library is disabled.");
                            return;
                        }
                        final ApplicationInfo j = i(context2);
                        if (j == null) {
                            Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                            return;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append(context.getPackageName());
                        sb.append(".");
                        final String string = sb.toString();
                        final File file = new File(j.dataDir);
                        final File file2 = new File(i.sourceDir);
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(string);
                        sb2.append("secondary-dexes");
                        e(context2, file2, file, sb2.toString(), string, false);
                        e(context2, new File(j.sourceDir), file, "secondary-dexes", "", false);
                        s = "Installation done";
                        break Label_0019;
                    }
                    catch (Exception ex) {
                        Log.e("MultiDex", "MultiDex installation failure", (Throwable)ex);
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("MultiDex installation failed (");
                        sb3.append(ex.getMessage());
                        sb3.append(").");
                        throw new RuntimeException(sb3.toString());
                    }
                }
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("MultiDex installation failed. SDK ");
                sb4.append(sdk_INT);
                sb4.append(" is unsupported. Min SDK version is ");
                sb4.append(4);
                sb4.append(".");
                throw new RuntimeException(sb4.toString());
            }
            s = "VM has multidex support, MultiDex support library is disabled.";
        }
        Log.i("MultiDex", s);
    }
    
    private static void n(final ClassLoader classLoader, final File file, final List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (!list.isEmpty()) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 19) {
                androidx.multidex.b.b.a(classLoader, list, file);
            }
            else if (sdk_INT >= 14) {
                androidx.multidex.b.a.a(classLoader, list);
            }
            else {
                androidx.multidex.b.c.a(classLoader, list);
            }
        }
    }
    
    static boolean o(String str) {
        boolean b2;
        final boolean b = b2 = false;
        Label_0116: {
            if (str != null) {
                final StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
                final boolean hasMoreTokens = stringTokenizer.hasMoreTokens();
                String nextToken = null;
                String nextToken2;
                if (hasMoreTokens) {
                    nextToken2 = stringTokenizer.nextToken();
                }
                else {
                    nextToken2 = null;
                }
                if (stringTokenizer.hasMoreTokens()) {
                    nextToken = stringTokenizer.nextToken();
                }
                b2 = b;
                if (nextToken2 != null) {
                    b2 = b;
                    if (nextToken != null) {
                        try {
                            final int int1 = Integer.parseInt(nextToken2);
                            final int int2 = Integer.parseInt(nextToken);
                            if (int1 <= 2) {
                                b2 = b;
                                if (int1 != 2) {
                                    break Label_0116;
                                }
                                b2 = b;
                                if (int2 < 1) {
                                    break Label_0116;
                                }
                            }
                            b2 = true;
                        }
                        catch (NumberFormatException ex) {
                            b2 = b;
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        if (b2) {
            str = " has multidex support";
        }
        else {
            str = " does not have multidex support";
        }
        sb.append(str);
        Log.i("MultiDex", sb.toString());
        return b2;
    }
    
    private static void p(final File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            final File parentFile = file.getParentFile();
            String s;
            if (parentFile == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to create dir ");
                sb.append(file.getPath());
                sb.append(". Parent file is null.");
                s = sb.toString();
            }
            else {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to create dir ");
                sb2.append(file.getPath());
                sb2.append(". parent file is a dir ");
                sb2.append(parentFile.isDirectory());
                sb2.append(", a file ");
                sb2.append(parentFile.isFile());
                sb2.append(", exists ");
                sb2.append(parentFile.exists());
                sb2.append(", readable ");
                sb2.append(parentFile.canRead());
                sb2.append(", writable ");
                sb2.append(parentFile.canWrite());
                s = sb2.toString();
            }
            Log.e("MultiDex", s);
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to create directory ");
            sb3.append(file.getPath());
            throw new IOException(sb3.toString());
        }
    }
    
    private static final class a
    {
        private static final int b = 4;
        private final androidx.multidex.b.a.a a;
        
        private a() throws ClassNotFoundException, SecurityException, NoSuchMethodException {
            final Class<?> forName = Class.forName("dalvik.system.DexPathList$Element");
            androidx.multidex.b.a.a a;
            try {
                a = new b(forName);
            }
            catch (NoSuchMethodException ex) {
                try {
                    a = new c(forName);
                }
                catch (NoSuchMethodException ex2) {
                    a = new d(forName);
                }
            }
            this.a = a;
        }
        
        static void a(ClassLoader value, List<? extends File> b) throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
            value = (ClassLoader)g(value, "pathList").get(value);
            b = new androidx.multidex.b.a().b((List<? extends File>)b);
            try {
                f(value, "dexElements", b);
            }
            catch (NoSuchFieldException ex) {
                Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", (Throwable)ex);
                f(value, "pathElements", b);
            }
        }
        
        private Object[] b(final List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
            final int size = list.size();
            final Object[] array = new Object[size];
            for (int i = 0; i < size; ++i) {
                final File file = (File)list.get(i);
                array[i] = this.a.a(file, DexFile.loadDex(file.getPath(), c(file), 0));
            }
            return array;
        }
        
        private static String c(final File file) {
            final File parentFile = file.getParentFile();
            final String name = file.getName();
            final StringBuilder sb = new StringBuilder();
            sb.append(name.substring(0, name.length() - androidx.multidex.b.a.b));
            sb.append(".dex");
            return new File(parentFile, sb.toString()).getPath();
        }
        
        private interface a
        {
            Object a(final File p0, final DexFile p1) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
        }
        
        private static class b implements androidx.multidex.b.a.a
        {
            private final Constructor<?> a;
            
            b(final Class<?> clazz) throws SecurityException, NoSuchMethodException {
                (this.a = clazz.getConstructor(File.class, ZipFile.class, DexFile.class)).setAccessible(true);
            }
            
            @Override
            public Object a(final File file, final DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
                return this.a.newInstance(file, new ZipFile(file), dexFile);
            }
        }
        
        private static class c implements androidx.multidex.b.a.a
        {
            private final Constructor<?> a;
            
            c(final Class<?> clazz) throws SecurityException, NoSuchMethodException {
                (this.a = clazz.getConstructor(File.class, File.class, DexFile.class)).setAccessible(true);
            }
            
            @Override
            public Object a(final File file, final DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.a.newInstance(file, file, dexFile);
            }
        }
        
        private static class d implements androidx.multidex.b.a.a
        {
            private final Constructor<?> a;
            
            d(final Class<?> clazz) throws SecurityException, NoSuchMethodException {
                (this.a = clazz.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class)).setAccessible(true);
            }
            
            @Override
            public Object a(final File file, final DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.a.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }
    }
    
    private static final class b
    {
        static void a(final ClassLoader obj, final List<? extends File> c, final File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            final Object value = g(obj, "pathList").get(obj);
            final ArrayList<IOException> list = new ArrayList<IOException>();
            f(value, "dexElements", b(value, new ArrayList<File>(c), file, list));
            if (list.size() > 0) {
                final Iterator<IOException> iterator = list.iterator();
                while (iterator.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (Throwable)iterator.next());
                }
                final Field a = g(value, "dexElementsSuppressedExceptions");
                final IOException[] array = (IOException[])a.get(value);
                IOException[] array2;
                if (array == null) {
                    array2 = list.toArray(new IOException[list.size()]);
                }
                else {
                    array2 = new IOException[list.size() + array.length];
                    list.toArray(array2);
                    System.arraycopy(array, 0, array2, list.size(), array.length);
                }
                a.set(value, array2);
                final IOException ex = new IOException("I/O exception during makeDexElement");
                ex.initCause(list.get(0));
                throw ex;
            }
        }
        
        private static Object[] b(final Object obj, final ArrayList<File> list, final File file, final ArrayList<IOException> list2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[])h(obj, "makeDexElements", (Class<?>[])new Class[] { ArrayList.class, File.class, ArrayList.class }).invoke(obj, list, file, list2);
        }
    }
    
    private static final class c
    {
        static void a(final ClassLoader classLoader, final List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            final int size = list.size();
            final Field a = g(classLoader, "path");
            final StringBuilder sb = new StringBuilder((String)a.get(classLoader));
            final String[] array = new String[size];
            final File[] array2 = new File[size];
            final ZipFile[] array3 = new ZipFile[size];
            final DexFile[] array4 = new DexFile[size];
            final ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                final File file = (File)listIterator.next();
                final String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                final int previousIndex = listIterator.previousIndex();
                array[previousIndex] = absolutePath;
                array2[previousIndex] = file;
                array3[previousIndex] = new ZipFile(file);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(absolutePath);
                sb2.append(".dex");
                array4[previousIndex] = DexFile.loadDex(absolutePath, sb2.toString(), 0);
            }
            a.set(classLoader, sb.toString());
            f(classLoader, "mPaths", array);
            f(classLoader, "mFiles", array2);
            f(classLoader, "mZips", array3);
            f(classLoader, "mDexs", array4);
        }
    }
}
