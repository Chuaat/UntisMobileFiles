// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.billing;

import org.json.JSONObject;
import org.json.JSONException;

public class h
{
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final long e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    
    public h(final String s) throws JSONException {
        this("inapp", s);
    }
    
    public h(final String a, final String i) throws JSONException {
        this.a = a;
        this.i = i;
        final JSONObject jsonObject = new JSONObject(i);
        this.b = jsonObject.optString("productId");
        this.c = jsonObject.optString("type");
        this.d = jsonObject.optString("price");
        this.e = jsonObject.optLong("price_amount_micros");
        this.f = jsonObject.optString("price_currency_code");
        this.g = jsonObject.optString("title");
        this.h = jsonObject.optString("description");
    }
    
    public String a() {
        return this.h;
    }
    
    public String b() {
        return this.d;
    }
    
    public long c() {
        return this.e;
    }
    
    public String d() {
        return this.f;
    }
    
    public String e() {
        return this.b;
    }
    
    public String f() {
        return this.g;
    }
    
    public String g() {
        return this.c;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SkuDetails:");
        sb.append(this.i);
        return sb.toString();
    }
}
