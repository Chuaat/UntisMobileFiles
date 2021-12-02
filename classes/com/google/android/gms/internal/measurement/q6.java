// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import c6.h;
import android.net.Uri;
import java.util.Map;

public final class q6
{
    private final Map<String, Map<String, String>> a;
    
    q6(final Map<String, Map<String, String>> a) {
        this.a = a;
    }
    
    @h
    public final String a(@h final Uri uri, @h final String s, @h final String s2, final String obj) {
        if (uri == null) {
            return null;
        }
        final Map<String, String> map = this.a.get(uri.toString());
        if (map == null) {
            return null;
        }
        final String value = String.valueOf(obj);
        String concat;
        if (value.length() != 0) {
            concat = "".concat(value);
        }
        else {
            concat = new String("");
        }
        return map.get(concat);
    }
}
