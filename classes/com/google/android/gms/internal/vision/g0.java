// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import c6.h;
import android.net.Uri;
import java.util.Map;

public final class g0
{
    private final Map<String, Map<String, String>> a;
    
    g0(final Map<String, Map<String, String>> a) {
        this.a = a;
    }
    
    @h
    public final String a(@h final Uri uri, @h String string, @h final String original, final String obj) {
        if (uri != null) {
            string = uri.toString();
        }
        else if (string == null) {
            return null;
        }
        final Map<String, String> map = this.a.get(string);
        if (map == null) {
            return null;
        }
        String concat = obj;
        if (original != null) {
            final String value = String.valueOf(obj);
            if (value.length() != 0) {
                concat = original.concat(value);
            }
            else {
                concat = new String(original);
            }
        }
        return map.get(concat);
    }
}
