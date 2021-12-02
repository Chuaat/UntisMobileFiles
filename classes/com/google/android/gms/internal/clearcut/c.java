// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.Iterator;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.HashMap;
import android.os.Handler;
import java.util.ArrayList;
import androidx.annotation.w;
import java.util.List;
import java.util.Map;
import android.database.ContentObserver;
import android.content.ContentResolver;
import android.net.Uri;
import java.util.concurrent.ConcurrentHashMap;

public final class c
{
    private static final ConcurrentHashMap<Uri, c> h;
    private static final String[] i;
    private final ContentResolver a;
    private final Uri b;
    private final ContentObserver c;
    private final Object d;
    private volatile Map<String, String> e;
    private final Object f;
    @w("listenersLock")
    private final List<e> g;
    
    static {
        h = new ConcurrentHashMap<Uri, c>();
        i = new String[] { "key", "value" };
    }
    
    private c(final ContentResolver a, final Uri b) {
        this.d = new Object();
        this.f = new Object();
        this.g = new ArrayList<e>();
        this.a = a;
        this.b = b;
        this.c = new d(this, null);
    }
    
    public static c a(final ContentResolver contentResolver, final Uri uri) {
        final ConcurrentHashMap<Uri, c> h = c.h;
        c value;
        if ((value = h.get(uri)) == null) {
            value = new c(contentResolver, uri);
            final c c = h.putIfAbsent(uri, value);
            if (c == null) {
                value.a.registerContentObserver(value.b, false, value.c);
            }
            else {
                value = c;
            }
        }
        return value;
    }
    
    private final Map<String, String> e() {
        try {
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            final Cursor query = this.a.query(this.b, com.google.android.gms.internal.clearcut.c.i, (String)null, (String[])null, (String)null);
            if (query != null) {
                try {
                    while (query.moveToNext()) {
                        hashMap.put(query.getString(0), query.getString(1));
                    }
                }
                finally {
                    query.close();
                }
            }
            return hashMap;
        }
        catch (SecurityException | SQLiteException ex) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }
    
    private final void f() {
        synchronized (this.f) {
            final Iterator<e> iterator = this.g.iterator();
            while (iterator.hasNext()) {
                iterator.next().i();
            }
        }
    }
    
    public final Map<String, String> c() {
        Map<String, String> map;
        if (com.google.android.gms.internal.clearcut.f.h("gms:phenotype:phenotype_flag:debug_disable_caching", false)) {
            map = this.e();
        }
        else {
            map = this.e;
        }
        Map<String, String> map2 = map;
        if (map == null) {
            synchronized (this.d) {
                Map<String, String> e;
                map2 = (e = this.e);
                if (map2 == null) {
                    e = this.e();
                    this.e = e;
                }
                // monitorexit(this.d)
                map2 = e;
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }
    
    public final void d() {
        synchronized (this.d) {
            this.e = null;
        }
    }
}
