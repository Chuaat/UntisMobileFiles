// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.billing;

import android.util.Log;
import rx.schedulers.c;
import java.util.concurrent.Callable;
import rx.g;
import android.app.PendingIntent;
import java.util.Collection;
import androidx.annotation.k0;
import android.os.RemoteException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import android.os.Bundle;
import com.untis.mobile.utils.billing.f;
import java.util.List;
import android.content.Intent;
import com.android.vending.billing.IInAppBillingService$Stub;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;
import com.android.vending.billing.IInAppBillingService;
import androidx.annotation.j0;
import android.app.Activity;
import java.util.ArrayList;

public class i implements com.untis.mobile.services.billing.b
{
    private static final String A = "INAPP_DATA_SIGNATURE_LIST";
    private static final String B = "INAPP_CONTINUATION_TOKEN";
    private static final String C = "BUY_INTENT";
    private static final String D = "BUNDLE_RESPONSE_CODE";
    private static final int E = 0;
    private static final int F = 1234;
    private static final ArrayList<String> s;
    private static final int t = 3;
    private static final String u = "ITEM_ID_LIST";
    private static final String v = "DETAILS_LIST";
    private static final String w = "INAPP_PURCHASE_ITEM_LIST";
    private static final String x = "INAPP_PURCHASE_DATA";
    private static final String y = "INAPP_PURCHASE_DATA_LIST";
    private static final String z = "INAPP_DATA_SIGNATURE";
    private final String o;
    @j0
    private final Activity p;
    private IInAppBillingService q;
    @j0
    private final ServiceConnection r;
    
    static {
        s = new ArrayList<String>();
    }
    
    public i(@j0 final Activity p2, @j0 final b b) {
        final ArrayList<String> s = i.s;
        s.clear();
        s.add("product_id_homework");
        s.add("product_id_widgets");
        s.add("product_id_premium");
        s.add("subscription_premium_year");
        s.add("subscription_premium_month");
        s.add("product_id_tt_settings");
        s.add("subscription_premium_month_2");
        s.add("subscription_premium_year_3");
        this.p = p2;
        this.o = p2.getPackageName();
        final ServiceConnection r = (ServiceConnection)new ServiceConnection() {
            public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
                i.this.q = IInAppBillingService$Stub.asInterface(binder);
                b.a(i.this);
            }
            
            public void onServiceDisconnected(final ComponentName componentName) {
                i.this.q = null;
            }
        };
        this.r = (ServiceConnection)r;
        final Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        p2.bindService(intent, (ServiceConnection)r, 1);
    }
    
    @j0
    private List<a> n(@j0 final String s) throws RemoteException {
        final ArrayList<a> list = new ArrayList<a>();
        final Bundle bundle = new Bundle();
        bundle.putStringArrayList("ITEM_ID_LIST", (ArrayList)i.s);
        final Bundle skuDetails = this.q.getSkuDetails(3, this.o, s, bundle);
        if (skuDetails.getInt("BUNDLE_RESPONSE_CODE") == 0) {
            final ArrayList stringArrayList = skuDetails.getStringArrayList("DETAILS_LIST");
            if (stringArrayList == null) {
                return list;
            }
            for (final String s2 : stringArrayList) {
                try {
                    final JSONObject jsonObject = new JSONObject(s2);
                    list.add(new a(jsonObject.getString("productId"), jsonObject.getString("price"), s, jsonObject.getString("price_currency_code"), jsonObject.getLong("price_amount_micros"), jsonObject.getString("title"), jsonObject.getString("description")));
                }
                catch (JSONException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return list;
    }
    
    @j0
    private String o(@j0 final String s) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1500718020: {
                if (!s.equals("product_id_homework")) {
                    break;
                }
                n = 7;
                break;
            }
            case 284580103: {
                if (!s.equals("subscription_premium_year")) {
                    break;
                }
                n = 6;
                break;
            }
            case 221276918: {
                if (!s.equals("subscription_premium_month")) {
                    break;
                }
                n = 5;
                break;
            }
            case 18924763: {
                if (!s.equals("product_id_widgets")) {
                    break;
                }
                n = 4;
                break;
            }
            case 18747182: {
                if (!s.equals("product_id_tt_settings")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1396424965: {
                if (!s.equals("subscription_premium_year_3")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1639865213: {
                if (!s.equals("product_id_premium")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2101243607: {
                if (!s.equals("subscription_premium_month_2")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return "";
            }
            case 3:
            case 4:
            case 7: {
                return "inapp";
            }
            case 0:
            case 1:
            case 2:
            case 5:
            case 6: {
                return "subs";
            }
        }
    }
    
    private void p(@j0 final String s, @j0 final List<f> list, @k0 String stringArrayList) throws RemoteException {
        final Bundle purchaseHistory = this.q.getPurchaseHistory(3, this.o, s, stringArrayList, (Bundle)null);
        if (purchaseHistory.getInt("BUNDLE_RESPONSE_CODE") == 0) {
            final ArrayList stringArrayList2 = purchaseHistory.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            stringArrayList = (String)purchaseHistory.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            final ArrayList stringArrayList3 = purchaseHistory.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            final String string = purchaseHistory.getString("INAPP_CONTINUATION_TOKEN");
            for (int i = 0; i < stringArrayList2.size(); ++i) {
                final String s2 = ((ArrayList<String>)stringArrayList).get(i);
                final String s3 = stringArrayList3.get(i);
                try {
                    list.add(new f(s, s2, s3));
                }
                catch (JSONException ex) {
                    ex.printStackTrace();
                }
            }
            if (string != null && !string.isEmpty()) {
                this.p(s, list, string);
            }
        }
    }
    
    private void q(@j0 final String s, @j0 final List<f> list, @k0 String stringArrayList) throws RemoteException {
        final Bundle purchases = this.q.getPurchases(3, this.o, s, stringArrayList);
        if (purchases.getInt("BUNDLE_RESPONSE_CODE") == 0) {
            final ArrayList stringArrayList2 = purchases.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            final ArrayList stringArrayList3 = purchases.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            stringArrayList = (String)purchases.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            final String string = purchases.getString("INAPP_CONTINUATION_TOKEN");
            for (int i = 0; i < stringArrayList2.size(); ++i) {
                final String s2 = stringArrayList3.get(i);
                final String s3 = ((ArrayList<String>)stringArrayList).get(i);
                try {
                    list.add(new f(s, s2, s3));
                }
                catch (JSONException ex) {
                    ex.printStackTrace();
                }
            }
            if (string != null && !string.isEmpty()) {
                this.q(s, list, string);
            }
        }
    }
    
    @j0
    @Override
    public g<List<f>> a() {
        return (g<List<f>>)rx.g.H2((Callable)new d(this)).E5(rx.schedulers.c.e()).Q3(rx.android.schedulers.a.c());
    }
    
    @j0
    @Override
    public g<Boolean> b(@j0 final String s, @j0 final String s2) {
        return (g<Boolean>)rx.g.H2((Callable)new h(this, s2, s)).E5(rx.schedulers.c.e()).Q3(rx.android.schedulers.a.c());
    }
    
    @j0
    @Override
    public g<List<f>> c() {
        return (g<List<f>>)rx.g.H2((Callable)new e(this)).E5(rx.schedulers.c.e()).Q3(rx.android.schedulers.a.c());
    }
    
    @j0
    @Override
    public g<List<a>> d() {
        return (g<List<a>>)rx.g.H2((Callable)new com.untis.mobile.services.billing.c(this)).E5(rx.schedulers.c.e()).Q3(rx.android.schedulers.a.c());
    }
    
    @j0
    @Override
    public g<Boolean> e(@j0 final String s) {
        return (g<Boolean>)rx.g.H2((Callable)new com.untis.mobile.services.billing.g(this, s)).E5(rx.schedulers.c.e()).Q3(rx.android.schedulers.a.c());
    }
    
    @j0
    @Override
    public g<f> f(final int n, final int n2, @k0 final Intent intent) {
        return (g<f>)rx.g.H2((Callable)new com.untis.mobile.services.billing.f(this, intent, n, n2)).E5(rx.schedulers.c.e()).Q3(rx.android.schedulers.a.c());
    }
    
    @Override
    public void onDestroy() {
        if (this.q != null) {
            try {
                this.p.unbindService(this.r);
            }
            catch (Exception ex) {
                Log.e("untis_log", "could not unbind service connection", (Throwable)ex);
            }
        }
    }
    
    public interface b
    {
        void a(@j0 final com.untis.mobile.services.billing.b p0);
    }
}
