// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import java.util.List;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import org.json.JSONArray;
import java.util.ArrayList;
import android.text.TextUtils;
import androidx.annotation.k0;
import org.json.JSONException;
import androidx.annotation.j0;
import org.json.JSONObject;

public class Purchase
{
    private final String a;
    private final String b;
    private final JSONObject c;
    
    public Purchase(@j0 final String a, @j0 final String b) throws JSONException {
        this.a = a;
        this.b = b;
        this.c = new JSONObject(a);
    }
    
    @k0
    public com.android.billingclient.api.a a() {
        final String optString = this.c.optString("obfuscatedAccountId");
        final String optString2 = this.c.optString("obfuscatedProfileId");
        if (optString == null && optString2 == null) {
            return null;
        }
        return new com.android.billingclient.api.a(optString, optString2);
    }
    
    @j0
    public String b() {
        return this.c.optString("developerPayload");
    }
    
    @j0
    public String c() {
        return this.c.optString("orderId");
    }
    
    @j0
    public String d() {
        return this.a;
    }
    
    @j0
    public String e() {
        return this.c.optString("packageName");
    }
    
    @Override
    public boolean equals(@k0 final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Purchase)) {
            return false;
        }
        final Purchase purchase = (Purchase)o;
        return TextUtils.equals((CharSequence)this.a, (CharSequence)purchase.d()) && TextUtils.equals((CharSequence)this.b, (CharSequence)purchase.j());
    }
    
    public int f() {
        if (this.c.optInt("purchaseState", 1) != 4) {
            return 1;
        }
        return 2;
    }
    
    public long g() {
        return this.c.optLong("purchaseTime");
    }
    
    @j0
    public String h() {
        final JSONObject c = this.c;
        return c.optString("token", c.optString("purchaseToken"));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @com.android.billingclient.api.k0
    public int i() {
        return this.c.optInt("quantity", 1);
    }
    
    @j0
    public String j() {
        return this.b;
    }
    
    @j0
    @com.android.billingclient.api.j0
    public ArrayList<String> k() {
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
    
    public boolean l() {
        return this.c.optBoolean("acknowledged", true);
    }
    
    public boolean m() {
        return this.c.optBoolean("autoRenewing");
    }
    
    @j0
    @Override
    public String toString() {
        final String value = String.valueOf(this.a);
        String concat;
        if (value.length() != 0) {
            concat = "Purchase. Json: ".concat(value);
        }
        else {
            concat = new String("Purchase. Json: ");
        }
        return concat;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        public static final int h0 = 0;
        public static final int i0 = 1;
        public static final int j0 = 2;
    }
    
    public static class b
    {
        @k0
        private final List<Purchase> a;
        private final h b;
        
        public b(@j0 final h b, @k0 final List<Purchase> a) {
            this.a = a;
            this.b = b;
        }
        
        @j0
        public h a() {
            return this.b;
        }
        
        @k0
        public List<Purchase> b() {
            return this.a;
        }
        
        public int c() {
            return this.a().b();
        }
    }
}
