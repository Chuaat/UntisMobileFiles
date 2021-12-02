// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.abt;

import java.util.HashMap;
import android.text.TextUtils;
import java.util.ArrayList;
import java.text.ParseException;
import java.util.Map;
import com.google.firebase.analytics.connector.a;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;
import androidx.annotation.b1;

public class b
{
    @b1
    static final String g = "experimentId";
    @b1
    static final String h = "variantId";
    @b1
    static final String i = "triggerEvent";
    @b1
    static final String j = "experimentStartTime";
    @b1
    static final String k = "triggerTimeoutMillis";
    @b1
    static final String l = "timeToLiveMillis";
    private static final String[] m;
    @b1
    static final DateFormat n;
    private final String a;
    private final String b;
    private final String c;
    private final Date d;
    private final long e;
    private final long f;
    
    static {
        m = new String[] { "experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId" };
        n = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    }
    
    public b(final String a, final String b, final String c, final Date d, final long e, final long f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    static b a(final a.c c) {
        String d = c.d;
        if (d == null) {
            d = "";
        }
        return new b(c.b, String.valueOf(c.c), d, new Date(c.m), c.e, c.j);
    }
    
    static b b(final Map<String, String> map) throws com.google.firebase.abt.a {
        l(map);
        try {
            final Date parse = b.n.parse(map.get("experimentStartTime"));
            final long long1 = Long.parseLong(map.get("triggerTimeoutMillis"));
            final long long2 = Long.parseLong(map.get("timeToLiveMillis"));
            final String s = map.get("experimentId");
            final String s2 = map.get("variantId");
            String s3;
            if (map.containsKey("triggerEvent")) {
                s3 = map.get("triggerEvent");
            }
            else {
                s3 = "";
            }
            return new b(s, s2, s3, parse, long1, long2);
        }
        catch (NumberFormatException ex) {
            throw new com.google.firebase.abt.a("Could not process experiment: one of the durations could not be converted into a long.", ex);
        }
        catch (ParseException ex2) {
            throw new com.google.firebase.abt.a("Could not process experiment: parsing experiment start time failed.", ex2);
        }
    }
    
    static void k(final b b) throws com.google.firebase.abt.a {
        l(b.j());
    }
    
    private static void l(final Map<String, String> map) throws com.google.firebase.abt.a {
        final ArrayList<String> list = new ArrayList<String>();
        for (final String s : b.m) {
            if (!map.containsKey(s)) {
                list.add(s);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        throw new com.google.firebase.abt.a(String.format("The following keys are missing from the experiment info map: %s", list));
    }
    
    String c() {
        return this.a;
    }
    
    long d() {
        return this.d.getTime();
    }
    
    long e() {
        return this.f;
    }
    
    String f() {
        return this.c;
    }
    
    long g() {
        return this.e;
    }
    
    String h() {
        return this.b;
    }
    
    a.c i(String c) {
        final a.c c2 = new a.c();
        c2.a = c;
        c2.m = this.d();
        c2.b = this.a;
        c2.c = this.b;
        if (TextUtils.isEmpty((CharSequence)this.c)) {
            c = null;
        }
        else {
            c = this.c;
        }
        c2.d = c;
        c2.e = this.e;
        c2.j = this.f;
        return c2;
    }
    
    @b1
    Map<String, String> j() {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("experimentId", this.a);
        hashMap.put("variantId", this.b);
        hashMap.put("triggerEvent", this.c);
        hashMap.put("experimentStartTime", com.google.firebase.abt.b.n.format(this.d));
        hashMap.put("triggerTimeoutMillis", Long.toString(this.e));
        hashMap.put("timeToLiveMillis", Long.toString(this.f));
        return hashMap;
    }
}
