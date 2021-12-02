// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase;

import f2.a;
import com.google.android.gms.common.internal.v;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c0;
import android.content.Context;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.util.b0;
import androidx.annotation.k0;
import androidx.annotation.j0;

public final class o
{
    private static final String h = "google_api_key";
    private static final String i = "google_app_id";
    private static final String j = "firebase_database_url";
    private static final String k = "ga_trackingId";
    private static final String l = "gcm_defaultSenderId";
    private static final String m = "google_storage_bucket";
    private static final String n = "project_id";
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    
    private o(@j0 final String b, @j0 final String a, @k0 final String c, @k0 final String d, @k0 final String e, @k0 final String f, @k0 final String g) {
        x.r(b0.b(b) ^ true, "ApplicationId must be set.");
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @k0
    public static o h(@j0 final Context context) {
        final c0 c0 = new c0(context);
        final String a = c0.a("google_app_id");
        if (TextUtils.isEmpty((CharSequence)a)) {
            return null;
        }
        return new o(a, c0.a("google_api_key"), c0.a("firebase_database_url"), c0.a("ga_trackingId"), c0.a("gcm_defaultSenderId"), c0.a("google_storage_bucket"), c0.a("project_id"));
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof o;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final o o2 = (o)o;
        boolean b3 = b2;
        if (v.b(this.b, o2.b)) {
            b3 = b2;
            if (v.b(this.a, o2.a)) {
                b3 = b2;
                if (v.b(this.c, o2.c)) {
                    b3 = b2;
                    if (v.b(this.d, o2.d)) {
                        b3 = b2;
                        if (v.b(this.e, o2.e)) {
                            b3 = b2;
                            if (v.b(this.f, o2.f)) {
                                b3 = b2;
                                if (v.b(this.g, o2.g)) {
                                    b3 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        return v.c(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }
    
    @j0
    public String i() {
        return this.a;
    }
    
    @j0
    public String j() {
        return this.b;
    }
    
    @k0
    public String k() {
        return this.c;
    }
    
    @k0
    @a
    public String l() {
        return this.d;
    }
    
    @k0
    public String m() {
        return this.e;
    }
    
    @k0
    public String n() {
        return this.g;
    }
    
    @k0
    public String o() {
        return this.f;
    }
    
    @Override
    public String toString() {
        return v.d(this).a("applicationId", this.b).a("apiKey", this.a).a("databaseUrl", this.c).a("gcmSenderId", this.e).a("storageBucket", this.f).a("projectId", this.g).toString();
    }
    
    public static final class b
    {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        
        public b() {
        }
        
        public b(@j0 final o o) {
            this.b = o.b;
            this.a = o.a;
            this.c = o.c;
            this.d = o.d;
            this.e = o.e;
            this.f = o.f;
            this.g = o.g;
        }
        
        @j0
        public o a() {
            return new o(this.b, this.a, this.c, this.d, this.e, this.f, this.g, null);
        }
        
        @j0
        public b b(@j0 final String s) {
            this.a = x.h(s, "ApiKey must be set.");
            return this;
        }
        
        @j0
        public b c(@j0 final String s) {
            this.b = x.h(s, "ApplicationId must be set.");
            return this;
        }
        
        @j0
        public b d(@k0 final String c) {
            this.c = c;
            return this;
        }
        
        @j0
        @a
        public b e(@k0 final String d) {
            this.d = d;
            return this;
        }
        
        @j0
        public b f(@k0 final String e) {
            this.e = e;
            return this;
        }
        
        @j0
        public b g(@k0 final String g) {
            this.g = g;
            return this;
        }
        
        @j0
        public b h(@k0 final String f) {
            this.f = f;
            return this;
        }
    }
}
