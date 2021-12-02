// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.play_billing;

import org.json.JSONException;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.List;
import com.android.billingclient.api.h;
import android.content.Intent;
import java.util.Collection;
import java.util.Arrays;
import com.android.billingclient.api.g;
import android.text.TextUtils;
import com.android.billingclient.api.h0;
import java.util.ArrayList;
import androidx.annotation.k0;
import com.android.billingclient.api.i;
import com.android.billingclient.api.b;
import android.os.Bundle;

public final class a
{
    public static final int a;
    
    static {
        a = Runtime.getRuntime().availableProcessors();
    }
    
    public static int a(final Bundle bundle, final String s) {
        if (bundle == null) {
            k(s, "Unexpected null bundle received!");
            return 6;
        }
        final Object value = bundle.get("RESPONSE_CODE");
        if (value == null) {
            j(s, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (value instanceof Integer) {
            return (int)value;
        }
        final String name = ((Integer)value).getClass().getName();
        String concat;
        if (name.length() != 0) {
            concat = "Unexpected type for bundle response code: ".concat(name);
        }
        else {
            concat = new String("Unexpected type for bundle response code: ");
        }
        k(s, concat);
        return 6;
    }
    
    public static Bundle b(final b b, final String s) {
        final Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", s);
        return bundle;
    }
    
    public static Bundle c(final i i, final boolean b, final String s) {
        final Bundle bundle = new Bundle();
        if (b) {
            bundle.putString("playBillingLibraryVersion", s);
        }
        return bundle;
    }
    
    public static Bundle d(int n, final boolean b, final String s, @k0 final String s2, final ArrayList<h0> list) {
        final Bundle bundle = new Bundle();
        if (n >= 9) {
            bundle.putString("playBillingLibraryVersion", s);
        }
        if (n >= 9 && b) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (n >= 14) {
            final ArrayList<Object> list2 = new ArrayList<Object>();
            final int size = list.size();
            int i = 0;
            n = 0;
            while (i < size) {
                final h0 h0 = list.get(i);
                list2.add(null);
                n |= ((TextUtils.isEmpty((CharSequence)null) ^ true) ? 1 : 0);
                ++i;
            }
            if (n != 0) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", (ArrayList)list2);
            }
        }
        return bundle;
    }
    
    public static Bundle e(final g g, final boolean b, final boolean b2, final String s) {
        final Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", s);
        if (g.d() != 0) {
            bundle.putInt("prorationMode", g.d());
        }
        if (!TextUtils.isEmpty((CharSequence)g.h())) {
            bundle.putString("accountId", g.h());
        }
        if (!TextUtils.isEmpty((CharSequence)g.i())) {
            bundle.putString("obfuscatedProfileId", g.i());
        }
        if (g.a()) {
            bundle.putBoolean("vr", true);
        }
        if (!TextUtils.isEmpty((CharSequence)null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList((Collection<? extends E>)Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty((CharSequence)g.j())) {
            bundle.putString("oldSkuPurchaseToken", g.j());
        }
        if (!TextUtils.isEmpty((CharSequence)null)) {
            bundle.putString("oldSkuPurchaseId", (String)null);
        }
        if (!TextUtils.isEmpty((CharSequence)null)) {
            bundle.putString("paymentsPurchaseParams", (String)null);
        }
        if (b && b2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }
    
    public static Bundle f(final boolean b, final boolean b2, final String s) {
        final Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", s);
        if (b && b2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }
    
    public static h g(final Intent intent, final String s) {
        if (intent == null) {
            k("BillingHelper", "Got null intent!");
            final h.a c = h.c();
            c.c(6);
            c.b("An internal error occurred.");
            return c.a();
        }
        final h.a c2 = h.c();
        c2.c(a(intent.getExtras(), s));
        c2.b(h(intent.getExtras(), s));
        return c2.a();
    }
    
    public static String h(final Bundle bundle, final String s) {
        if (bundle == null) {
            k(s, "Unexpected null bundle received!");
            return "";
        }
        final Object value = bundle.get("DEBUG_MESSAGE");
        if (value == null) {
            j(s, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (value instanceof String) {
            return (String)value;
        }
        final String name = ((String)value).getClass().getName();
        String concat;
        if (name.length() != 0) {
            concat = "Unexpected type for debug message: ".concat(name);
        }
        else {
            concat = new String("Unexpected type for debug message: ");
        }
        k(s, concat);
        return "";
    }
    
    public static List<Purchase> i(final Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        final ArrayList stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        final ArrayList stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        final ArrayList<Purchase> list = new ArrayList<Purchase>();
        if (stringArrayList != null && stringArrayList2 != null) {
            for (int n = 0; n < stringArrayList.size() && n < stringArrayList2.size(); ++n) {
                final Purchase l = l(stringArrayList.get(n), stringArrayList2.get(n));
                if (l != null) {
                    list.add(l);
                }
            }
        }
        else {
            k("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
            final Purchase i = l(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (i == null) {
                k("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            list.add(i);
        }
        return list;
    }
    
    public static void j(final String s, final String s2) {
        if (Log.isLoggable(s, 2)) {
            Log.v(s, s2);
        }
    }
    
    public static void k(final String s, final String s2) {
        if (Log.isLoggable(s, 5)) {
            Log.w(s, s2);
        }
    }
    
    private static Purchase l(final String s, String value) {
        final Purchase purchase = null;
        if (s != null && value != null) {
            Purchase purchase2;
            try {
                purchase2 = new Purchase(s, value);
            }
            catch (JSONException obj) {
                value = String.valueOf(obj);
                final StringBuilder sb = new StringBuilder(value.length() + 47);
                sb.append("Got JSONException while parsing purchase data: ");
                sb.append(value);
                k("BillingHelper", sb.toString());
                purchase2 = purchase;
            }
            return purchase2;
        }
        k("BillingHelper", "Received a bad purchase data.");
        return null;
    }
}
