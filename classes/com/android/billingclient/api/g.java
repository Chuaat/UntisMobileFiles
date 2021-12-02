// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import android.text.TextUtils;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.util.Collection;
import androidx.annotation.k0;
import java.util.ArrayList;
import androidx.annotation.j0;

public class g
{
    @j0
    public static final String h = "accountId";
    @j0
    public static final String i = "prorationMode";
    @j0
    public static final String j = "vr";
    @j0
    public static final String k = "skusToReplace";
    @j0
    public static final String l = "oldSkuPurchaseToken";
    private boolean a;
    private String b;
    private String c;
    private String d;
    private int e = 0;
    private ArrayList<SkuDetails> f;
    private boolean g;
    
    private g() {
        this.e = 0;
    }
    
    @j0
    public static a b() {
        return new a(null);
    }
    
    public boolean a() {
        return this.g;
    }
    
    public final int d() {
        return this.e;
    }
    
    @k0
    public final String h() {
        return this.b;
    }
    
    @k0
    public final String i() {
        return this.d;
    }
    
    @k0
    public final String j() {
        return this.c;
    }
    
    @j0
    public final ArrayList<SkuDetails> l() {
        final ArrayList<SkuDetails> list = new ArrayList<SkuDetails>();
        list.addAll(this.f);
        return list;
    }
    
    final boolean o() {
        return this.g || this.b != null || this.d != null || this.e != 0 || this.a;
    }
    
    public static class a
    {
        private String a;
        private String b;
        private String c;
        private int d = 0;
        private ArrayList<SkuDetails> e;
        private boolean f;
        
        private a() {
            this.d = 0;
        }
        
        @j0
        public g a() {
            final ArrayList<SkuDetails> e = this.e;
            if (e != null && !e.isEmpty()) {
                final ArrayList<SkuDetails> e2 = this.e;
                for (int size = e2.size(), i = 0; i < size; ++i) {
                    if (e2.get(i) == null) {
                        throw new IllegalArgumentException("SKU cannot be null.");
                    }
                }
                if (this.e.size() > 1) {
                    final SkuDetails skuDetails = this.e.get(0);
                    final String q = skuDetails.q();
                    final ArrayList<SkuDetails> e3 = this.e;
                    for (int size2 = e3.size(), j = 0; j < size2; ++j) {
                        final SkuDetails skuDetails2 = e3.get(j);
                        if (!q.equals("play_pass_subs") && !skuDetails2.q().equals("play_pass_subs") && !q.equals(skuDetails2.q())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    final String t = skuDetails.t();
                    final ArrayList<SkuDetails> e4 = this.e;
                    for (int size3 = e4.size(), k = 0; k < size3; ++k) {
                        final SkuDetails skuDetails3 = e4.get(k);
                        if (!q.equals("play_pass_subs") && !skuDetails3.q().equals("play_pass_subs") && !t.equals(skuDetails3.t())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
                final g g = new g(null);
                g.a = (true ^ this.e.get(0).t().isEmpty());
                g.b = this.a;
                g.d = this.c;
                g.c = this.b;
                g.e = this.d;
                g.f = this.e;
                g.g = this.f;
                return g;
            }
            throw new IllegalArgumentException("SkuDetails must be provided.");
        }
        
        @j0
        public a b(@j0 final String a) {
            this.a = a;
            return this;
        }
        
        @j0
        public a c(@j0 final String c) {
            this.c = c;
            return this;
        }
        
        @j0
        public a d(@j0 final SkuDetails e) {
            final ArrayList<SkuDetails> e2 = new ArrayList<SkuDetails>();
            e2.add(e);
            this.e = e2;
            return this;
        }
        
        @j0
        @com.android.billingclient.api.j0
        public a e(@j0 final c c) {
            this.b = c.a();
            this.d = c.b();
            return this;
        }
        
        @j0
        public a f(final boolean f) {
            this.f = f;
            return this;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
        public static final int b0 = 0;
        public static final int c0 = 1;
        public static final int d0 = 2;
        public static final int e0 = 3;
        public static final int f0 = 4;
        @i0
        public static final int g0 = 5;
    }
    
    @com.android.billingclient.api.j0
    public static class c
    {
        private String a;
        private int b = 0;
        
        private c() {
            this.b = 0;
        }
        
        @j0
        @com.android.billingclient.api.j0
        public static a c() {
            return new a(null);
        }
        
        @com.android.billingclient.api.j0
        String a() {
            return this.a;
        }
        
        @com.android.billingclient.api.j0
        int b() {
            return this.b;
        }
        
        @com.android.billingclient.api.j0
        public static class a
        {
            private String a;
            private int b = 0;
            
            private a() {
                this.b = 0;
            }
            
            @j0
            @com.android.billingclient.api.j0
            public c a() {
                if (TextUtils.isEmpty((CharSequence)this.a) && TextUtils.isEmpty((CharSequence)null)) {
                    throw new IllegalArgumentException("Old SKU purchase token/id must be provided.");
                }
                final c c = new c(null);
                c.a = this.a;
                c.b = this.b;
                return c;
            }
            
            @j0
            @com.android.billingclient.api.j0
            public a b(@j0 final String a) {
                this.a = a;
                return this;
            }
            
            @j0
            @com.android.billingclient.api.j0
            public a c(final int b) {
                this.b = b;
                return this;
            }
        }
    }
}
