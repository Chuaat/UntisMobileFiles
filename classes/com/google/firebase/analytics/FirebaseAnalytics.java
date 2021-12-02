// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.analytics;

import androidx.annotation.g0;
import android.app.Activity;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import com.google.firebase.installations.i;
import java.util.Map;
import androidx.annotation.u0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import com.google.android.gms.tasks.p;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.tasks.m;
import com.google.android.gms.measurement.internal.f7;
import androidx.annotation.k0;
import androidx.annotation.s0;
import androidx.annotation.Keep;
import android.os.Bundle;
import androidx.annotation.j0;
import android.content.Context;
import com.google.android.gms.common.internal.x;
import java.util.concurrent.ExecutorService;
import com.google.android.gms.internal.measurement.j3;

public final class FirebaseAnalytics
{
    private static volatile FirebaseAnalytics c;
    private final j3 a;
    private ExecutorService b;
    
    public FirebaseAnalytics(final j3 a) {
        x.k(a);
        this.a = a;
    }
    
    @Keep
    @j0
    @s0(allOf = { "android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK" })
    public static FirebaseAnalytics getInstance(@j0 final Context context) {
        if (FirebaseAnalytics.c == null) {
            synchronized (FirebaseAnalytics.class) {
                if (FirebaseAnalytics.c == null) {
                    FirebaseAnalytics.c = new FirebaseAnalytics(j3.C(context, null, null, null, null));
                }
            }
        }
        return FirebaseAnalytics.c;
    }
    
    @Keep
    @k0
    public static f7 getScionFrontendApiImplementation(final Context context, @k0 final Bundle bundle) {
        final j3 c = j3.C(context, null, null, null, bundle);
        if (c == null) {
            return null;
        }
        return new com.google.firebase.analytics.c(c);
    }
    
    @j0
    public m<String> a() {
        try {
            synchronized (FirebaseAnalytics.class) {
                if (this.b == null) {
                    this.b = new com.google.firebase.analytics.a(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                final ExecutorService b = this.b;
                // monitorexit(FirebaseAnalytics.class)
                return p.d(b, (Callable<String>)new com.google.firebase.analytics.b(this));
            }
        }
        catch (RuntimeException ex) {
            this.a.a(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return p.f(ex);
        }
    }
    
    public void b(@j0 @u0(max = 40L, min = 1L) final String s, @k0 final Bundle bundle) {
        this.a.T(s, bundle);
    }
    
    public void c() {
        this.a.c();
    }
    
    public void d(final boolean b) {
        this.a.k(b);
    }
    
    public void e(@j0 final Map<b, a> map) {
        final Bundle bundle = new Bundle();
        final a a = map.get(FirebaseAnalytics.b.G);
        if (a != null) {
            final int ordinal = a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    bundle.putString("ad_storage", "denied");
                }
            }
            else {
                bundle.putString("ad_storage", "granted");
            }
        }
        final a a2 = map.get(FirebaseAnalytics.b.H);
        if (a2 != null) {
            final int ordinal2 = a2.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    bundle.putString("analytics_storage", "denied");
                }
            }
            else {
                bundle.putString("analytics_storage", "granted");
            }
        }
        this.a.f(bundle);
    }
    
    public void f(@k0 final Bundle bundle) {
        this.a.i(bundle);
    }
    
    public void g(final long n) {
        this.a.l(n);
    }
    
    @Keep
    @j0
    public String getFirebaseInstanceId() {
        try {
            return p.b((m<String>)i.t().b(), 30000L, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException cause) {
            throw new IllegalStateException(cause);
        }
        catch (TimeoutException ex2) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        catch (ExecutionException ex) {
            throw new IllegalStateException(ex.getCause());
        }
    }
    
    public void h(@k0 final String s) {
        this.a.m(s);
    }
    
    public void i(@j0 @u0(max = 24L, min = 1L) final String s, @k0 @u0(max = 36L) final String s2) {
        this.a.n(null, s, s2, false);
    }
    
    @Deprecated
    @Keep
    @g0
    public void setCurrentScreen(@j0 final Activity activity, @k0 @u0(max = 36L, min = 1L) final String s, @k0 @u0(max = 36L, min = 1L) final String s2) {
        this.a.g(activity, s, s2);
    }
    
    public enum a
    {
        @j0
        G, 
        @j0
        H;
    }
    
    public enum b
    {
        @j0
        G, 
        @j0
        H;
    }
    
    public static class c
    {
        @j0
        public static final String A = "view_item_list";
        @j0
        public static final String B = "view_search_results";
        @j0
        public static final String C = "earn_virtual_currency";
        @j0
        public static final String D = "screen_view";
        @j0
        public static final String E = "remove_from_cart";
        @Deprecated
        @j0
        public static final String F = "checkout_progress";
        @Deprecated
        @j0
        public static final String G = "set_checkout_option";
        @j0
        public static final String H = "add_shipping_info";
        @j0
        public static final String I = "purchase";
        @j0
        public static final String J = "refund";
        @j0
        public static final String K = "select_item";
        @j0
        public static final String L = "select_promotion";
        @j0
        public static final String M = "view_cart";
        @j0
        public static final String N = "view_promotion";
        @j0
        public static final String a = "ad_impression";
        @j0
        public static final String b = "add_payment_info";
        @j0
        public static final String c = "add_to_cart";
        @j0
        public static final String d = "add_to_wishlist";
        @j0
        public static final String e = "app_open";
        @j0
        public static final String f = "begin_checkout";
        @j0
        public static final String g = "campaign_details";
        @Deprecated
        @j0
        public static final String h = "ecommerce_purchase";
        @j0
        public static final String i = "generate_lead";
        @j0
        public static final String j = "join_group";
        @j0
        public static final String k = "level_end";
        @j0
        public static final String l = "level_start";
        @j0
        public static final String m = "level_up";
        @j0
        public static final String n = "login";
        @j0
        public static final String o = "post_score";
        @Deprecated
        @j0
        public static final String p = "present_offer";
        @Deprecated
        @j0
        public static final String q = "purchase_refund";
        @j0
        public static final String r = "search";
        @j0
        public static final String s = "select_content";
        @j0
        public static final String t = "share";
        @j0
        public static final String u = "sign_up";
        @j0
        public static final String v = "spend_virtual_currency";
        @j0
        public static final String w = "tutorial_begin";
        @j0
        public static final String x = "tutorial_complete";
        @j0
        public static final String y = "unlock_achievement";
        @j0
        public static final String z = "view_item";
        
        protected c() {
        }
    }
    
    public static class d
    {
        @j0
        public static final String A = "number_of_rooms";
        @j0
        public static final String B = "destination";
        @j0
        public static final String C = "origin";
        @j0
        public static final String D = "price";
        @j0
        public static final String E = "quantity";
        @j0
        public static final String F = "score";
        @j0
        public static final String G = "shipping";
        @j0
        public static final String H = "transaction_id";
        @j0
        public static final String I = "search_term";
        @j0
        public static final String J = "success";
        @j0
        public static final String K = "tax";
        @j0
        public static final String L = "value";
        @j0
        public static final String M = "virtual_currency_name";
        @j0
        public static final String N = "campaign";
        @j0
        public static final String O = "source";
        @j0
        public static final String P = "medium";
        @j0
        public static final String Q = "term";
        @j0
        public static final String R = "content";
        @j0
        public static final String S = "aclid";
        @j0
        public static final String T = "cp1";
        @j0
        public static final String U = "item_brand";
        @j0
        public static final String V = "item_variant";
        @Deprecated
        @j0
        public static final String W = "item_list";
        @Deprecated
        @j0
        public static final String X = "checkout_step";
        @Deprecated
        @j0
        public static final String Y = "checkout_option";
        @j0
        public static final String Z = "creative_name";
        @j0
        public static final String a = "achievement_id";
        @j0
        public static final String a0 = "creative_slot";
        @j0
        public static final String b = "ad_format";
        @j0
        public static final String b0 = "affiliation";
        @j0
        public static final String c = "ad_platform";
        @j0
        public static final String c0 = "index";
        @j0
        public static final String d = "ad_source";
        @j0
        public static final String d0 = "discount";
        @j0
        public static final String e = "ad_unit_name";
        @j0
        public static final String e0 = "item_category2";
        @j0
        public static final String f = "character";
        @j0
        public static final String f0 = "item_category3";
        @j0
        public static final String g = "travel_class";
        @j0
        public static final String g0 = "item_category4";
        @j0
        public static final String h = "content_type";
        @j0
        public static final String h0 = "item_category5";
        @j0
        public static final String i = "currency";
        @j0
        public static final String i0 = "item_list_id";
        @j0
        public static final String j = "coupon";
        @j0
        public static final String j0 = "item_list_name";
        @j0
        public static final String k = "start_date";
        @j0
        public static final String k0 = "items";
        @j0
        public static final String l = "end_date";
        @j0
        public static final String l0 = "location_id";
        @j0
        public static final String m = "extend_session";
        @j0
        public static final String m0 = "payment_type";
        @j0
        public static final String n = "flight_number";
        @j0
        public static final String n0 = "promotion_id";
        @j0
        public static final String o = "group_id";
        @j0
        public static final String o0 = "promotion_name";
        @j0
        public static final String p = "item_category";
        @j0
        public static final String p0 = "screen_class";
        @j0
        public static final String q = "item_id";
        @j0
        public static final String q0 = "screen_name";
        @Deprecated
        @j0
        public static final String r = "item_location_id";
        @j0
        public static final String r0 = "shipping_tier";
        @j0
        public static final String s = "item_name";
        @j0
        public static final String t = "location";
        @j0
        public static final String u = "level";
        @j0
        public static final String v = "level_name";
        @Deprecated
        @j0
        public static final String w = "sign_up_method";
        @j0
        public static final String x = "method";
        @j0
        public static final String y = "number_of_nights";
        @j0
        public static final String z = "number_of_passengers";
        
        protected d() {
        }
    }
    
    public static class e
    {
        @j0
        public static final String a = "sign_up_method";
        @j0
        public static final String b = "allow_personalized_ads";
        
        protected e() {
        }
    }
}
