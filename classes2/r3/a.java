// 
// Decompiled by Procyon v0.5.36
// 

package r3;

import com.google.firebase.b;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import androidx.core.content.d;
import android.os.Build$VERSION;
import j3.c;
import android.content.SharedPreferences;
import android.content.Context;
import androidx.annotation.b1;

public class a
{
    private static final String e = "com.google.firebase.common.prefs:";
    @b1
    public static final String f = "firebase_data_collection_default_enabled";
    private final Context a;
    private final SharedPreferences b;
    private final c c;
    private boolean d;
    
    public a(final Context context, final String str, final c c) {
        final Context a = a(context);
        this.a = a;
        final StringBuilder sb = new StringBuilder();
        sb.append("com.google.firebase.common.prefs:");
        sb.append(str);
        this.b = a.getSharedPreferences(sb.toString(), 0);
        this.c = c;
        this.d = this.c();
    }
    
    private static Context a(final Context context) {
        if (Build$VERSION.SDK_INT < 24) {
            return context;
        }
        return d.b(context);
    }
    
    private boolean c() {
        if (this.b.contains("firebase_data_collection_default_enabled")) {
            return this.b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return this.d();
    }
    
    private boolean d() {
        try {
            final PackageManager packageManager = this.a.getPackageManager();
            if (packageManager != null) {
                final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128);
                if (applicationInfo != null) {
                    final Bundle metaData = applicationInfo.metaData;
                    if (metaData != null && metaData.containsKey("firebase_data_collection_default_enabled")) {
                        return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                    }
                }
            }
            return true;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return true;
        }
    }
    
    private void f(final boolean d) {
        synchronized (this) {
            if (this.d != d) {
                this.d = d;
                this.c.d(new j3.a<Object>(b.class, new b(d)));
            }
        }
    }
    
    public boolean b() {
        synchronized (this) {
            return this.d;
        }
    }
    
    public void e(final Boolean obj) {
        // monitorenter(this)
        Label_0040: {
            if (obj != null) {
                break Label_0040;
            }
            try {
                this.b.edit().remove("firebase_data_collection_default_enabled").apply();
                boolean b = this.d();
                while (true) {
                    this.f(b);
                    return;
                    b = Boolean.TRUE.equals(obj);
                    this.b.edit().putBoolean("firebase_data_collection_default_enabled", b).apply();
                    continue;
                }
            }
            finally {
            }
            // monitorexit(this)
        }
    }
}
