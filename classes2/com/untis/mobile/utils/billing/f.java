// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.billing;

import org.json.JSONException;
import org.json.JSONObject;

public class f
{
    String a;
    String b;
    String c;
    String d;
    long e;
    int f;
    String g;
    String h;
    String i;
    String j;
    boolean k;
    
    public f(final String a, final String i, final String j) throws JSONException {
        this.a = a;
        this.i = i;
        final JSONObject jsonObject = new JSONObject(this.i);
        this.b = jsonObject.optString("orderId");
        this.c = jsonObject.optString("packageName");
        this.d = jsonObject.optString("productId");
        this.e = jsonObject.optLong("purchaseTime");
        this.f = jsonObject.optInt("purchaseState");
        this.g = jsonObject.optString("developerPayload");
        this.h = jsonObject.optString("token", jsonObject.optString("purchaseToken"));
        this.k = jsonObject.optBoolean("autoRenewing");
        this.j = j;
    }
    
    public String a() {
        return this.g;
    }
    
    public String b() {
        return this.a;
    }
    
    public String c() {
        return this.b;
    }
    
    public String d() {
        return this.i;
    }
    
    public String e() {
        return this.c;
    }
    
    public int f() {
        return this.f;
    }
    
    public long g() {
        return this.e;
    }
    
    public String h() {
        return this.j;
    }
    
    public String i() {
        return this.d;
    }
    
    public String j() {
        return this.h;
    }
    
    public boolean k() {
        return this.k;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PurchaseInfo(type:");
        sb.append(this.a);
        sb.append("):");
        sb.append(this.i);
        return sb.toString();
    }
}
