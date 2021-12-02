// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import java.util.Iterator;
import com.google.firebase.crashlytics.internal.f;
import androidx.annotation.j0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class z
{
    private final Map<String, String> a;
    private final int b;
    private final int c;
    
    public z(final int b, final int c) {
        this.a = new HashMap<String, String>();
        this.b = b;
        this.c = c;
    }
    
    private String c(final String s) {
        if (s != null) {
            return this.b(s);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }
    
    @j0
    public Map<String, String> a() {
        synchronized (this) {
            return Collections.unmodifiableMap((Map<? extends String, ? extends String>)new HashMap<String, String>(this.a));
        }
    }
    
    public String b(String trim) {
        String substring = trim;
        if (trim != null) {
            trim = trim.trim();
            final int length = trim.length();
            final int c = this.c;
            substring = trim;
            if (length > c) {
                substring = trim.substring(0, c);
            }
        }
        return substring;
    }
    
    public void d(String b, final String s) {
        synchronized (this) {
            final String c = this.c(b);
            if (this.a.size() >= this.b && !this.a.containsKey(c)) {
                final f f = com.google.firebase.crashlytics.internal.f.f();
                final StringBuilder sb = new StringBuilder();
                sb.append("Ignored entry \"");
                sb.append(b);
                sb.append("\" when adding custom keys. Maximum allowable: ");
                sb.append(this.b);
                f.m(sb.toString());
            }
            else {
                final Map<String, String> a = this.a;
                if (s == null) {
                    b = "";
                }
                else {
                    b = this.b(s);
                }
                a.put(c, b);
            }
        }
    }
    
    public void e(final Map<String, String> map) {
        // monitorenter(this)
        int i = 0;
        try {
            for (final Map.Entry<String, String> entry : map.entrySet()) {
                final String c = this.c(entry.getKey());
                if (this.a.size() >= this.b && !this.a.containsKey(c)) {
                    ++i;
                }
                else {
                    final String s = entry.getValue();
                    final Map<String, String> a = this.a;
                    String b;
                    if (s == null) {
                        b = "";
                    }
                    else {
                        b = this.b(s);
                    }
                    a.put(c, b);
                }
            }
            if (i > 0) {
                final f f = com.google.firebase.crashlytics.internal.f.f();
                final StringBuilder sb = new StringBuilder();
                sb.append("Ignored ");
                sb.append(i);
                sb.append(" entries when adding custom keys. Maximum allowable: ");
                sb.append(this.b);
                f.m(sb.toString());
            }
        }
        finally {
        }
        // monitorexit(this)
    }
}
