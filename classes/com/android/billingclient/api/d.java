// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.a1;
import android.app.Activity;
import androidx.annotation.j0;
import android.content.Context;

public abstract class d
{
    @d
    @j0
    public static b i(@j0 final Context context) {
        return new b(context, null);
    }
    
    @d
    public abstract void a(@j0 final com.android.billingclient.api.b p0, @j0 final com.android.billingclient.api.c p1);
    
    @d
    public abstract void b(@j0 final i p0, @j0 final j p1);
    
    @d
    public abstract void c();
    
    @d
    public abstract int d();
    
    @d
    @j0
    public abstract h e(@j0 final String p0);
    
    @d
    public abstract boolean f();
    
    @a1
    @j0
    public abstract h g(@j0 final Activity p0, @j0 final g p1);
    
    @a1
    public abstract void h(@j0 final Activity p0, @j0 final l p1, @j0 final k p2);
    
    @d
    public abstract void j(@j0 final String p0, @j0 final m p1);
    
    @Deprecated
    @j0
    public abstract Purchase.b k(@j0 final String p0);
    
    @d
    @l0
    public abstract void l(@j0 final String p0, @j0 final n p1);
    
    @d
    public abstract void m(@j0 final p p0, @j0 final q p1);
    
    @d
    public abstract void n(@j0 final f p0);
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        public static final int E = -3;
        public static final int F = -2;
        public static final int G = -1;
        public static final int H = 0;
        public static final int I = 1;
        public static final int J = 2;
        public static final int K = 3;
        public static final int L = 4;
        public static final int M = 5;
        public static final int N = 6;
        public static final int O = 7;
        public static final int P = 8;
    }
    
    @d
    public static final class b
    {
        private volatile String a;
        private volatile boolean b;
        private final Context c = c;
        private volatile o d;
        
        @j0
        public d a() {
            if (this.c == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.d == null) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.b) {
                return new com.android.billingclient.api.e(null, this.b, this.c, this.d);
            }
            throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
        }
        
        @j0
        public b b() {
            this.b = true;
            return this;
        }
        
        @j0
        public b c(@j0 final o d) {
            this.d = d;
            return this;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
        public static final int Q = 0;
        public static final int R = 1;
        public static final int S = 2;
        public static final int T = 3;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
        @j0
        public static final String U = "subscriptions";
        @j0
        public static final String V = "subscriptionsUpdate";
        @j0
        public static final String W = "inAppItemsOnVr";
        @j0
        public static final String X = "subscriptionsOnVr";
        @j0
        public static final String Y = "priceChangeConfirmation";
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
        @j0
        public static final String Z = "inapp";
        @j0
        public static final String a0 = "subs";
    }
}
