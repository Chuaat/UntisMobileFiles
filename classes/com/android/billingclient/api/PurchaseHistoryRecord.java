// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import org.json.JSONArray;
import java.util.ArrayList;
import android.text.TextUtils;
import org.json.JSONException;
import androidx.annotation.j0;
import org.json.JSONObject;

public class PurchaseHistoryRecord
{
    private final String a;
    private final String b;
    private final JSONObject c;
    
    public PurchaseHistoryRecord(@j0 final String a, @j0 final String b) throws JSONException {
        this.a = a;
        this.b = b;
        this.c = new JSONObject(a);
    }
    
    @j0
    public String a() {
        return this.c.optString("developerPayload");
    }
    
    @j0
    public String b() {
        return this.a;
    }
    
    public long c() {
        return this.c.optLong("purchaseTime");
    }
    
    @j0
    public String d() {
        final JSONObject c = this.c;
        return c.optString("token", c.optString("purchaseToken"));
    }
    
    @k0
    public int e() {
        return this.c.optInt("quantity", 1);
    }
    
    @Override
    public boolean equals(@androidx.annotation.k0 final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PurchaseHistoryRecord)) {
            return false;
        }
        final PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord)o;
        return TextUtils.equals((CharSequence)this.a, (CharSequence)purchaseHistoryRecord.b()) && TextUtils.equals((CharSequence)this.b, (CharSequence)purchaseHistoryRecord.f());
    }
    
    @j0
    public String f() {
        return this.b;
    }
    
    @j0
    @com.android.billingclient.api.j0
    public ArrayList<String> g() {
        final ArrayList<String> list = new ArrayList<String>();
        if (this.c.has("productIds")) {
            final JSONArray optJSONArray = this.c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); ++i) {
                    list.add(optJSONArray.optString(i));
                }
            }
        }
        else if (this.c.has("productId")) {
            list.add(this.c.optString("productId"));
        }
        return list;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @j0
    @Override
    public String toString() {
        final String value = String.valueOf(this.a);
        String concat;
        if (value.length() != 0) {
            concat = "PurchaseHistoryRecord. Json: ".concat(value);
        }
        else {
            concat = new String("PurchaseHistoryRecord. Json: ");
        }
        return concat;
    }
}
