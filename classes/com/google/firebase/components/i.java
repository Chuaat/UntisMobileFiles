// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.components;

import java.util.Collections;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import android.os.Bundle;
import n3.b;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.k0;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.app.Service;
import android.content.Context;
import androidx.annotation.b1;

public final class i<T>
{
    static final String c = "ComponentDiscovery";
    private static final String d = "com.google.firebase.components.ComponentRegistrar";
    private static final String e = "com.google.firebase.components:";
    private final T a;
    private final c<T> b;
    
    @b1
    i(final T a, final c<T> b) {
        this.a = a;
        this.b = b;
    }
    
    public static i<Context> d(final Context context, final Class<? extends Service> clazz) {
        return new i<Context>(context, (c<Context>)new b((Class)clazz));
    }
    
    @k0
    private static k e(final String className) {
        try {
            final Class<?> forName = Class.forName(className);
            if (k.class.isAssignableFrom(forName)) {
                return (k)forName.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            }
            throw new y(String.format("Class %s is not an instance of %s", className, "com.google.firebase.components.ComponentRegistrar"));
        }
        catch (InvocationTargetException ex) {
            throw new y(String.format("Could not instantiate %s", className), ex);
        }
        catch (NoSuchMethodException ex2) {
            throw new y(String.format("Could not instantiate %s", className), ex2);
        }
        catch (InstantiationException ex3) {
            throw new y(String.format("Could not instantiate %s.", className), ex3);
        }
        catch (IllegalAccessException ex4) {
            throw new y(String.format("Could not instantiate %s.", className), ex4);
        }
        catch (ClassNotFoundException ex5) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", className));
            return null;
        }
    }
    
    @Deprecated
    public List<k> b() {
        final ArrayList<k> list = new ArrayList<k>();
        for (final String s : this.b.a(this.a)) {
            try {
                final k e = e(s);
                if (e == null) {
                    continue;
                }
                list.add(e);
            }
            catch (y y) {
                Log.w("ComponentDiscovery", "Invalid component registrar.", (Throwable)y);
            }
        }
        return list;
    }
    
    public List<n3.b<k>> c() {
        final ArrayList<h> list = (ArrayList<h>)new ArrayList<n3.b<k>>();
        final Iterator<String> iterator = this.b.a(this.a).iterator();
        while (iterator.hasNext()) {
            list.add((n3.b<k>)new h(iterator.next()));
        }
        return (List<n3.b<k>>)list;
    }
    
    private static class b implements c<Context>
    {
        private final Class<? extends Service> a;
        
        private b(final Class<? extends Service> a) {
            this.a = a;
        }
        
        private Bundle b(final Context context) {
            try {
                final PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                final ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class)this.a), 128);
                if (serviceInfo == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.a);
                    sb.append(" has no service info.");
                    Log.w("ComponentDiscovery", sb.toString());
                    return null;
                }
                return serviceInfo.metaData;
            }
            catch (PackageManager$NameNotFoundException ex) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }
        
        public List<String> c(final Context context) {
            final Bundle b = this.b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            final ArrayList<String> list = new ArrayList<String>();
            for (final String s : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(s)) && s.startsWith("com.google.firebase.components:")) {
                    list.add(s.substring(31));
                }
            }
            return list;
        }
    }
    
    @b1
    interface c<T>
    {
        List<String> a(final T p0);
    }
}
