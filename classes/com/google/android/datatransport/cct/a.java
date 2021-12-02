// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct;

import java.util.regex.Pattern;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.google.android.datatransport.c;
import java.util.Set;
import com.google.android.datatransport.runtime.g;

public final class a implements g
{
    static final String c = "cct";
    static final String d;
    static final String e;
    private static final String f;
    private static final String g = "1$";
    private static final String h = "\\";
    private static final Set<c> i;
    public static final a j;
    public static final a k;
    @j0
    private final String a;
    @k0
    private final String b;
    
    static {
        final String s = d = com.google.android.datatransport.cct.e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        final String s2 = e = com.google.android.datatransport.cct.e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        final String s3 = f = com.google.android.datatransport.cct.e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        i = Collections.unmodifiableSet((Set<? extends c>)new HashSet<c>(Arrays.asList(com.google.android.datatransport.c.b("proto"), com.google.android.datatransport.c.b("json"))));
        j = new a(s, null);
        k = new a(s2, s3);
    }
    
    public a(@j0 final String a, @k0 final String b) {
        this.a = a;
        this.b = b;
    }
    
    @j0
    static String c(@j0 final byte[] bytes) {
        return new String(bytes, Charset.forName("UTF-8"));
    }
    
    @j0
    static byte[] d(@j0 final String s) {
        return s.getBytes(Charset.forName("UTF-8"));
    }
    
    @j0
    public static a e(@j0 final byte[] bytes) {
        final String s = new String(bytes, Charset.forName("UTF-8"));
        if (!s.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        final String[] split = s.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        final String s2 = split[0];
        if (!s2.isEmpty()) {
            String s3;
            if ((s3 = split[1]).isEmpty()) {
                s3 = null;
            }
            return new a(s2, s3);
        }
        throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
    }
    
    @Override
    public Set<c> a() {
        return com.google.android.datatransport.cct.a.i;
    }
    
    @k0
    public byte[] b() {
        final String b = this.b;
        if (b == null && this.a == null) {
            return null;
        }
        final String a = this.a;
        String s;
        if ((s = b) == null) {
            s = "";
        }
        return String.format("%s%s%s%s", "1$", a, "\\", s).getBytes(Charset.forName("UTF-8"));
    }
    
    @k0
    public String f() {
        return this.b;
    }
    
    @j0
    public String g() {
        return this.a;
    }
    
    @k0
    @Override
    public byte[] getExtras() {
        return this.b();
    }
    
    @j0
    @Override
    public String getName() {
        return "cct";
    }
}
