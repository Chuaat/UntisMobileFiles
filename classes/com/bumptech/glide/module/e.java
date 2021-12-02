// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.module;

import java.util.Iterator;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.ArrayList;
import android.util.Log;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import android.content.Context;

@Deprecated
public final class e
{
    private static final String b = "ManifestParser";
    private static final String c = "GlideModule";
    private final Context a;
    
    public e(final Context a) {
        this.a = a;
    }
    
    private static c b(String instance) {
        try {
            final Class<?> forName = Class.forName((String)instance);
            final InvocationTargetException ex = null;
            Label_0046: {
                try {
                    instance = (InvocationTargetException)forName.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                    break Label_0046;
                }
                catch (InvocationTargetException instance) {}
                catch (NoSuchMethodException instance) {}
                catch (IllegalAccessException instance) {}
                catch (InstantiationException ex2) {}
                c(forName, instance);
                instance = ex;
            }
            if (instance instanceof c) {
                return (c)instance;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected instanceof GlideModule, but found: ");
            sb.append(instance);
            throw new RuntimeException(sb.toString());
        }
        catch (ClassNotFoundException cause) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", cause);
        }
    }
    
    private static void c(final Class<?> obj, final Exception cause) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to instantiate GlideModule implementation for ");
        sb.append(obj);
        throw new RuntimeException(sb.toString(), cause);
    }
    
    public List<c> a() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        final ArrayList<c> list = new ArrayList<c>();
        try {
            final ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                return list;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Got app info metadata: ");
                sb.append(applicationInfo.metaData);
                Log.v("ManifestParser", sb.toString());
            }
            for (final String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    list.add(b(str));
                    if (!Log.isLoggable("ManifestParser", 3)) {
                        continue;
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Loaded Glide module: ");
                    sb2.append(str);
                    Log.d("ManifestParser", sb2.toString());
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
            }
            return list;
        }
        catch (PackageManager$NameNotFoundException cause) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", (Throwable)cause);
        }
    }
}
