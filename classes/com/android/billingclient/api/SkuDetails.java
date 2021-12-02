// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import androidx.annotation.k0;
import org.json.JSONException;
import android.text.TextUtils;
import androidx.annotation.j0;
import org.json.JSONObject;

public class SkuDetails
{
    private final String a;
    private final JSONObject b;
    
    public SkuDetails(@j0 final String a) throws JSONException {
        this.a = a;
        final JSONObject b = new JSONObject(a);
        this.b = b;
        if (TextUtils.isEmpty((CharSequence)b.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (!TextUtils.isEmpty((CharSequence)b.optString("type"))) {
            return;
        }
        throw new IllegalArgumentException("SkuType cannot be empty.");
    }
    
    @j0
    public String a() {
        return this.b.optString("description");
    }
    
    @j0
    public String b() {
        return this.b.optString("freeTrialPeriod");
    }
    
    @j0
    public String c() {
        return this.b.optString("iconUrl");
    }
    
    @j0
    public String d() {
        return this.b.optString("introductoryPrice");
    }
    
    public long e() {
        return this.b.optLong("introductoryPriceAmountMicros");
    }
    
    @Override
    public boolean equals(@k0 final Object o) {
        return this == o || (o instanceof SkuDetails && TextUtils.equals((CharSequence)this.a, (CharSequence)((SkuDetails)o).a));
    }
    
    public int f() {
        return this.b.optInt("introductoryPriceCycles");
    }
    
    @j0
    public String g() {
        return this.b.optString("introductoryPricePeriod");
    }
    
    @j0
    public String h() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @j0
    public String i() {
        if (this.b.has("original_price")) {
            return this.b.optString("original_price");
        }
        return this.k();
    }
    
    public long j() {
        if (this.b.has("original_price_micros")) {
            return this.b.optLong("original_price_micros");
        }
        return this.l();
    }
    
    @j0
    public String k() {
        return this.b.optString("price");
    }
    
    public long l() {
        return this.b.optLong("price_amount_micros");
    }
    
    @j0
    public String m() {
        return this.b.optString("price_currency_code");
    }
    
    @j0
    public String n() {
        return this.b.optString("productId");
    }
    
    @j0
    public String o() {
        return this.b.optString("subscriptionPeriod");
    }
    
    @j0
    public String p() {
        return this.b.optString("title");
    }
    
    @j0
    public String q() {
        return this.b.optString("type");
    }
    
    public int r() {
        return this.b.optInt("offer_type");
    }
    
    @j0
    public String s() {
        return this.b.optString("offer_id");
    }
    
    @j0
    public final String t() {
        return this.b.optString("packageName");
    }
    
    @j0
    @Override
    public String toString() {
        final String value = String.valueOf(this.a);
        String concat;
        if (value.length() != 0) {
            concat = "SkuDetails: ".concat(value);
        }
        else {
            concat = new String("SkuDetails: ");
        }
        return concat;
    }
    
    @j0
    public String u() {
        return this.b.optString("serializedDocid");
    }
    
    final String v() {
        return this.b.optString("skuDetailsToken");
    }
}
