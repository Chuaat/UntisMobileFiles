// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import com.google.android.gms.common.internal.v;
import androidx.annotation.j0;
import android.util.Log;
import androidx.annotation.k0;
import android.text.TextUtils;
import java.util.regex.Pattern;

final class z0
{
    private static final Pattern d;
    private final String a;
    private final String b;
    private final String c;
    
    static {
        d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    }
    
    private z0(final String str, final String s) {
        this.a = d(s, str);
        this.b = str;
        final StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(s).length());
        sb.append(str);
        sb.append("!");
        sb.append(s);
        this.c = sb.toString();
    }
    
    @k0
    static z0 a(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        final String[] split = s.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new z0(split[0], split[1]);
    }
    
    @j0
    private static String d(final String s, final String s2) {
        String substring = s;
        if (s != null) {
            substring = s;
            if (s.startsWith("/topics/")) {
                Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", s2));
                substring = s.substring(8);
            }
        }
        if (substring != null && z0.d.matcher(substring).matches()) {
            return substring;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", substring, "[a-zA-Z0-9-_.~%]{1,900}"));
    }
    
    public static z0 f(@j0 final String s) {
        return new z0("S", s);
    }
    
    public static z0 g(@j0 final String s) {
        return new z0("U", s);
    }
    
    public String b() {
        return this.b;
    }
    
    public String c() {
        return this.a;
    }
    
    public String e() {
        return this.c;
    }
    
    @Override
    public boolean equals(@k0 final Object o) {
        if (!(o instanceof z0)) {
            return false;
        }
        final z0 z0 = (z0)o;
        return this.a.equals(z0.a) && this.b.equals(z0.b);
    }
    
    @Override
    public int hashCode() {
        return v.c(new Object[] { this.b, this.a });
    }
}
