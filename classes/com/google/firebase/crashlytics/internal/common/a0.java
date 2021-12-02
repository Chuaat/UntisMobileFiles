// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.Serializable;
import com.google.firebase.crashlytics.internal.f;
import java.io.Closeable;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Collections;
import androidx.annotation.j0;
import org.json.JSONException;
import java.util.Iterator;
import java.util.HashMap;
import org.json.JSONObject;
import java.util.Map;
import java.io.File;
import java.nio.charset.Charset;

class a0
{
    private static final Charset b;
    private static final String c = "user";
    private static final String d = "keys";
    private static final String e = "internal-keys";
    private static final String f = ".meta";
    private static final String g = "userId";
    private final File a;
    
    static {
        b = Charset.forName("UTF-8");
    }
    
    public a0(final File a) {
        this.a = a;
    }
    
    private static Map<String, String> d(final String s) throws JSONException {
        final JSONObject jsonObject = new JSONObject(s);
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final Iterator keys = jsonObject.keys();
        while (keys.hasNext()) {
            final String s2 = keys.next();
            hashMap.put(s2, k(jsonObject, s2));
        }
        return hashMap;
    }
    
    private static i0 e(final String s) throws JSONException {
        final JSONObject jsonObject = new JSONObject(s);
        final i0 i0 = new i0();
        i0.g(k(jsonObject, "userId"));
        return i0;
    }
    
    private static String f(final Map<String, String> map) throws JSONException {
        return new JSONObject((Map)map).toString();
    }
    
    private static String j(final i0 i0) throws JSONException {
        return new JSONObject() {
            {
                this.put("userId", (Object)a.c());
            }
        }.toString();
    }
    
    private static String k(final JSONObject jsonObject, final String s) {
        final boolean null = jsonObject.isNull(s);
        String optString = null;
        if (!null) {
            optString = jsonObject.optString(s, (String)null);
        }
        return optString;
    }
    
    @j0
    public File a(final String str) {
        final File a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("internal-keys");
        sb.append(".meta");
        return new File(a, sb.toString());
    }
    
    @j0
    public File b(final String str) {
        final File a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("keys");
        sb.append(".meta");
        return new File(a, sb.toString());
    }
    
    @j0
    public File c(final String str) {
        final File a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("user");
        sb.append(".meta");
        return new File(a, sb.toString());
    }
    
    public Map<String, String> g(final String s) {
        return this.h(s, false);
    }
    
    Map<String, String> h(String d, final boolean b) {
        Serializable file;
        if (b) {
            file = this.a(d);
        }
        else {
            file = this.b(d);
        }
        if (!((File)file).exists()) {
            return Collections.emptyMap();
        }
        final Closeable closeable = null;
        final String s = d = null;
        Closeable closeable2;
        try {
            try {
                d = s;
                final FileInputStream fileInputStream = new FileInputStream((File)file);
                try {
                    d = (String)d(com.google.firebase.crashlytics.internal.common.g.G(fileInputStream));
                    com.google.firebase.crashlytics.internal.common.g.e(fileInputStream, "Failed to close user metadata file.");
                    return (Map<String, String>)d;
                }
                catch (Exception file) {}
                finally {
                    file = (d = (String)fileInputStream);
                }
            }
            finally {}
        }
        catch (Exception file) {
            closeable2 = closeable;
        }
        com.google.firebase.crashlytics.internal.f.f().e("Error deserializing user metadata.", (Throwable)file);
        com.google.firebase.crashlytics.internal.common.g.e(closeable2, "Failed to close user metadata file.");
        return Collections.emptyMap();
        com.google.firebase.crashlytics.internal.common.g.e((Closeable)d, "Failed to close user metadata file.");
    }
    
    public i0 i(String e) {
        final File c = this.c(e);
        if (!c.exists()) {
            return new i0();
        }
        final Closeable closeable = null;
        final String s = e = null;
        Object o;
        final Exception ex2;
        try {
            try {
                e = s;
                final FileInputStream fileInputStream = new FileInputStream(c);
                try {
                    e = (String)e(com.google.firebase.crashlytics.internal.common.g.G(fileInputStream));
                    com.google.firebase.crashlytics.internal.common.g.e(fileInputStream, "Failed to close user metadata file.");
                    return (i0)e;
                }
                catch (Exception ex3) {}
            }
            finally {
                o = e;
                final Exception ex = ex2;
            }
        }
        catch (Exception ex2) {
            o = closeable;
        }
        com.google.firebase.crashlytics.internal.f.f().e("Error deserializing user metadata.", ex2);
        com.google.firebase.crashlytics.internal.common.g.e((Closeable)o, "Failed to close user metadata file.");
        return new i0();
        com.google.firebase.crashlytics.internal.common.g.e((Closeable)o, "Failed to close user metadata file.");
        throw null;
    }
    
    public void l(final String s, final Map<String, String> map) {
        this.m(s, map, false);
    }
    
    void m(String s, Map<String, String> o, final boolean b) {
        File file;
        if (b) {
            file = this.a(s);
        }
        else {
            file = this.b(s);
        }
        final Closeable closeable = null;
        final String s2 = s = null;
        Closeable closeable2;
        try {
            try {
                final String f = f((Map<String, String>)o);
                s = s2;
                s = s2;
                s = s2;
                s = s2;
                final FileOutputStream out = new FileOutputStream(file);
                s = s2;
                final OutputStreamWriter out2 = new OutputStreamWriter(out, a0.b);
                s = s2;
                o = new BufferedWriter(out2);
                try {
                    ((Writer)o).write(f);
                    ((Writer)o).flush();
                    com.google.firebase.crashlytics.internal.common.g.e((Closeable)o, "Failed to close key/value metadata file.");
                }
                catch (Exception file) {}
                finally {
                    s = (String)o;
                }
            }
            finally {}
        }
        catch (Exception file) {
            closeable2 = closeable;
        }
        com.google.firebase.crashlytics.internal.f.f().e("Error serializing key/value metadata.", (Throwable)file);
        com.google.firebase.crashlytics.internal.common.g.e(closeable2, "Failed to close key/value metadata file.");
        return;
        com.google.firebase.crashlytics.internal.common.g.e((Closeable)s, "Failed to close key/value metadata file.");
    }
    
    public void n(String ex, i0 i0) {
        final File c = this.c((String)ex);
        final Closeable closeable = null;
        Exception ex2 = ex = null;
        Closeable closeable2;
        try {
            try {
                final String j = j(i0);
                ex = ex2;
                ex = ex2;
                ex = ex2;
                ex = ex2;
                final FileOutputStream out = new FileOutputStream(c);
                ex = ex2;
                final OutputStreamWriter out2 = new OutputStreamWriter(out, a0.b);
                ex = ex2;
                i0 = (i0)new BufferedWriter(out2);
                try {
                    ((Writer)i0).write(j);
                    ((Writer)i0).flush();
                    com.google.firebase.crashlytics.internal.common.g.e((Closeable)i0, "Failed to close user metadata file.");
                }
                catch (Exception ex) {
                    ex2 = ex;
                }
                finally {
                    ex = (Exception)i0;
                }
            }
            finally {}
        }
        catch (Exception ex2) {
            closeable2 = closeable;
        }
        com.google.firebase.crashlytics.internal.f.f().e("Error serializing user metadata.", ex2);
        com.google.firebase.crashlytics.internal.common.g.e(closeable2, "Failed to close user metadata file.");
        return;
        com.google.firebase.crashlytics.internal.common.g.e((Closeable)ex, "Failed to close user metadata file.");
    }
}
