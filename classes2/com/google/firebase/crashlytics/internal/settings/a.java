// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.settings;

import java.io.Closeable;
import com.google.firebase.crashlytics.internal.common.g;
import java.io.FileWriter;
import com.google.firebase.crashlytics.internal.f;
import org.json.JSONObject;
import com.google.firebase.crashlytics.internal.persistence.i;
import java.io.File;
import android.content.Context;

public class a
{
    private static final String b = "com.crashlytics.settings.json";
    private final Context a;
    
    public a(final Context a) {
        this.a = a;
    }
    
    private File a() {
        return new File(new i(this.a).b(), "com.crashlytics.settings.json");
    }
    
    public JSONObject b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc             "Checking for cached settings..."
        //     5: invokevirtual   com/google/firebase/crashlytics/internal/f.b:(Ljava/lang/String;)V
        //     8: aconst_null    
        //     9: astore_1       
        //    10: aconst_null    
        //    11: astore_2       
        //    12: aload_0        
        //    13: invokespecial   com/google/firebase/crashlytics/internal/settings/a.a:()Ljava/io/File;
        //    16: astore_3       
        //    17: aload_3        
        //    18: invokevirtual   java/io/File.exists:()Z
        //    21: ifeq            68
        //    24: new             Ljava/io/FileInputStream;
        //    27: astore_2       
        //    28: aload_2        
        //    29: aload_3        
        //    30: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    33: aload_2        
        //    34: astore_3       
        //    35: aload_2        
        //    36: invokestatic    com/google/firebase/crashlytics/internal/common/g.G:(Ljava/io/InputStream;)Ljava/lang/String;
        //    39: astore          4
        //    41: aload_2        
        //    42: astore_3       
        //    43: new             Lorg/json/JSONObject;
        //    46: astore          5
        //    48: aload_2        
        //    49: astore_3       
        //    50: aload           5
        //    52: aload           4
        //    54: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //    57: aload           5
        //    59: astore_3       
        //    60: goto            78
        //    63: astore          5
        //    65: goto            97
        //    68: invokestatic    com/google/firebase/crashlytics/internal/f.f:()Lcom/google/firebase/crashlytics/internal/f;
        //    71: ldc             "Settings file does not exist."
        //    73: invokevirtual   com/google/firebase/crashlytics/internal/f.k:(Ljava/lang/String;)V
        //    76: aconst_null    
        //    77: astore_3       
        //    78: aload_2        
        //    79: ldc             "Error while closing settings cache file."
        //    81: invokestatic    com/google/firebase/crashlytics/internal/common/g.e:(Ljava/io/Closeable;Ljava/lang/String;)V
        //    84: goto            117
        //    87: astore_3       
        //    88: aconst_null    
        //    89: astore_2       
        //    90: goto            126
        //    93: astore          5
        //    95: aconst_null    
        //    96: astore_2       
        //    97: aload_2        
        //    98: astore_3       
        //    99: invokestatic    com/google/firebase/crashlytics/internal/f.f:()Lcom/google/firebase/crashlytics/internal/f;
        //   102: ldc             "Failed to fetch cached settings"
        //   104: aload           5
        //   106: invokevirtual   com/google/firebase/crashlytics/internal/f.e:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   109: aload_2        
        //   110: ldc             "Error while closing settings cache file."
        //   112: invokestatic    com/google/firebase/crashlytics/internal/common/g.e:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   115: aload_1        
        //   116: astore_3       
        //   117: aload_3        
        //   118: areturn        
        //   119: astore          5
        //   121: aload_3        
        //   122: astore_2       
        //   123: aload           5
        //   125: astore_3       
        //   126: aload_2        
        //   127: ldc             "Error while closing settings cache file."
        //   129: invokestatic    com/google/firebase/crashlytics/internal/common/g.e:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   132: aload_3        
        //   133: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  12     33     93     97     Ljava/lang/Exception;
        //  12     33     87     93     Any
        //  35     41     63     68     Ljava/lang/Exception;
        //  35     41     119    126    Any
        //  43     48     63     68     Ljava/lang/Exception;
        //  43     48     119    126    Any
        //  50     57     63     68     Ljava/lang/Exception;
        //  50     57     119    126    Any
        //  68     76     93     97     Ljava/lang/Exception;
        //  68     76     87     93     Any
        //  99     109    119    126    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0068:
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
    
    public void c(final long n, final JSONObject jsonObject) {
        f.f().k("Writing settings to cache file...");
        if (jsonObject != null) {
            final Closeable closeable = null;
            Object o2;
            final Object o = o2 = null;
            FileWriter fileWriter = null;
            Closeable closeable2;
            try {
                try {
                    jsonObject.put("expires_at", n);
                    o2 = o;
                    o2 = o;
                    fileWriter = new FileWriter(this.a());
                    try {
                        fileWriter.write(jsonObject.toString());
                        fileWriter.flush();
                        g.e((Closeable)fileWriter, "Failed to close settings writer.");
                    }
                    catch (Exception o2) {}
                    finally {
                        o2 = fileWriter;
                    }
                }
                finally {}
            }
            catch (Exception fileWriter) {
                closeable2 = closeable;
            }
            f.f().e("Failed to cache settings", (Throwable)fileWriter);
            g.e(closeable2, "Failed to close settings writer.");
            return;
            g.e((Closeable)o2, "Failed to close settings writer.");
        }
    }
}
