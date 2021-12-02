// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.j0;
import com.google.firebase.installations.local.d;
import androidx.annotation.k0;
import q3.b;
import java.util.concurrent.TimeUnit;
import q3.a;
import java.util.regex.Pattern;

public final class s
{
    public static final long b;
    private static final String c = ":";
    private static final Pattern d;
    private static s e;
    private final a a;
    
    static {
        b = TimeUnit.HOURS.toSeconds(1L);
        d = Pattern.compile("\\AA[\\w-]{38}\\z");
    }
    
    private s(final a a) {
        this.a = a;
    }
    
    public static s c() {
        return d(q3.b.b());
    }
    
    public static s d(final a a) {
        if (s.e == null) {
            s.e = new s(a);
        }
        return s.e;
    }
    
    static boolean g(@k0 final String input) {
        return s.d.matcher(input).matches();
    }
    
    static boolean h(@k0 final String s) {
        return s.contains(":");
    }
    
    public long a() {
        return this.a.a();
    }
    
    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(this.a());
    }
    
    public long e() {
        return (long)(Math.random() * 1000.0);
    }
    
    public boolean f(@j0 final d d) {
        return TextUtils.isEmpty((CharSequence)d.b()) || d.h() + d.c() < this.b() + s.b;
    }
}
