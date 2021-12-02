// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.database.Cursor;
import java.util.HashMap;
import android.os.StrictMode$ThreadPolicy;
import java.util.Collections;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Objects;
import java.util.ArrayList;
import android.os.Handler;
import androidx.collection.a;
import java.util.List;
import android.database.ContentObserver;
import android.content.ContentResolver;
import androidx.annotation.w;
import android.net.Uri;
import java.util.Map;

public final class i6 implements m6
{
    @w("ConfigurationContentLoader.class")
    private static final Map<Uri, i6> g;
    public static final String[] h;
    private final ContentResolver a;
    private final Uri b;
    private final ContentObserver c;
    private final Object d;
    private volatile Map<String, String> e;
    @w("this")
    private final List<j6> f;
    
    static {
        g = new a<Uri, i6>();
        h = new String[] { "key", "value" };
    }
    
    private i6(final ContentResolver contentResolver, final Uri uri) {
        final g6 c = new g6(this, null);
        this.c = c;
        this.d = new Object();
        this.f = new ArrayList<j6>();
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        (this.a = contentResolver).registerContentObserver(this.b = uri, false, (ContentObserver)c);
    }
    
    public static i6 b(final ContentResolver p0, final Uri p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: getstatic       com/google/android/gms/internal/measurement/i6.g:Ljava/util/Map;
        //     6: astore_2       
        //     7: aload_2        
        //     8: aload_1        
        //     9: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    14: checkcast       Lcom/google/android/gms/internal/measurement/i6;
        //    17: astore_3       
        //    18: aload_3        
        //    19: astore          4
        //    21: aload_3        
        //    22: ifnonnull       47
        //    25: new             Lcom/google/android/gms/internal/measurement/i6;
        //    28: astore          4
        //    30: aload           4
        //    32: aload_0        
        //    33: aload_1        
        //    34: invokespecial   com/google/android/gms/internal/measurement/i6.<init>:(Landroid/content/ContentResolver;Landroid/net/Uri;)V
        //    37: aload_2        
        //    38: aload_1        
        //    39: aload           4
        //    41: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    46: pop            
        //    47: ldc             Lcom/google/android/gms/internal/measurement/i6;.class
        //    49: monitorexit    
        //    50: aload           4
        //    52: areturn        
        //    53: astore_0       
        //    54: ldc             Lcom/google/android/gms/internal/measurement/i6;.class
        //    56: monitorexit    
        //    57: aload_0        
        //    58: athrow         
        //    59: astore_0       
        //    60: aload_3        
        //    61: astore          4
        //    63: goto            47
        //    66: astore_0       
        //    67: goto            47
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  3      18     53     59     Any
        //  25     37     59     66     Ljava/lang/SecurityException;
        //  25     37     53     59     Any
        //  37     47     66     70     Ljava/lang/SecurityException;
        //  37     47     53     59     Any
        //  47     50     53     59     Any
        //  54     57     53     59     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 39 out of bounds for length 39
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
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
    
    static void e() {
        synchronized (i6.class) {
            for (final i6 i6 : i6.g.values()) {
                i6.a.unregisterContentObserver(i6.c);
            }
            i6.g.clear();
        }
    }
    
    public final Map<String, String> c() {
        Map<String, String> e;
        if ((e = this.e) == null) {
            synchronized (this.d) {
                Label_0090: {
                    if (this.e == null) {
                        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                final Map map = k6.a((l6<Map>)new f6(this));
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                            }
                            finally {}
                        }
                        catch (SecurityException | SQLiteException | IllegalStateException ex) {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            e = null;
                        }
                        this.e = e;
                        break Label_0090;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
            }
        }
        if (e != null) {
            return e;
        }
        return Collections.emptyMap();
    }
    
    public final void f() {
        synchronized (this.d) {
            this.e = null;
            c7.e();
            // monitorexit(this.d)
            synchronized (this) {
                final Iterator<j6> iterator = this.f.iterator();
                while (iterator.hasNext()) {
                    iterator.next().zza();
                }
            }
        }
    }
}
