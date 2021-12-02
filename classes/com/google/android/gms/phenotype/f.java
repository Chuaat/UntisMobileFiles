// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.phenotype;

import android.database.Cursor;
import java.util.HashMap;
import android.os.Handler;
import java.util.Map;
import android.database.ContentObserver;
import android.content.ContentResolver;
import android.net.Uri;
import java.util.concurrent.ConcurrentHashMap;

public final class f
{
    private static final ConcurrentHashMap<Uri, f> f;
    private static final String[] g;
    private final ContentResolver a;
    private final Uri b;
    private final ContentObserver c;
    private final Object d;
    private volatile Map<String, String> e;
    
    static {
        f = new ConcurrentHashMap<Uri, f>();
        g = new String[] { "key", "value" };
    }
    
    private f(final ContentResolver a, final Uri b) {
        this.d = new Object();
        this.a = a;
        this.b = b;
        this.c = new g(this, null);
    }
    
    public static f a(final ContentResolver contentResolver, final Uri uri) {
        final ConcurrentHashMap<Uri, f> f = com.google.android.gms.phenotype.f.f;
        f value;
        if ((value = f.get(uri)) == null) {
            value = new f(contentResolver, uri);
            final f f2 = f.putIfAbsent(uri, value);
            if (f2 == null) {
                value.a.registerContentObserver(value.b, false, value.c);
            }
            else {
                value = f2;
            }
        }
        return value;
    }
    
    private final Map<String, String> d() {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final Cursor query = this.a.query(this.b, com.google.android.gms.phenotype.f.g, (String)null, (String[])null, (String)null);
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
    
    public final Map<String, String> b() {
        Map<String, String> map;
        if (com.google.android.gms.phenotype.d.g("gms:phenotype:phenotype_flag:debug_disable_caching", false)) {
            map = this.d();
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
                    e = this.d();
                    this.e = e;
                }
                // monitorexit(this.d)
                map2 = e;
            }
        }
        return map2;
    }
    
    public final void c() {
        synchronized (this.d) {
            this.e = null;
        }
    }
}
