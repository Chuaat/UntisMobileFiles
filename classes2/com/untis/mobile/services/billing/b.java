// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.billing;

import androidx.annotation.k0;
import android.content.Intent;
import androidx.annotation.j0;
import com.untis.mobile.utils.billing.f;
import java.util.List;
import rx.g;

public interface b
{
    public static final String a = "inapp";
    public static final String b = "subs";
    public static final String c = "product_id_premium";
    public static final String d = "subscription_premium_year";
    public static final String e = "subscription_premium_month";
    public static final String f = "subscription_premium_year_3";
    public static final String g = "subscription_premium_month_2";
    public static final String h = "product_id_homework";
    public static final String i = "product_id_widgets";
    public static final String j = "product_id_tt_settings";
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 3;
    
    @j0
    g<List<f>> a();
    
    @j0
    g<Boolean> b(@j0 final String p0, @j0 final String p1);
    
    @j0
    g<List<f>> c();
    
    @j0
    g<List<a>> d();
    
    @j0
    g<Boolean> e(@j0 final String p0);
    
    @j0
    g<f> f(final int p0, final int p1, @k0 final Intent p2);
    
    void onDestroy();
}
