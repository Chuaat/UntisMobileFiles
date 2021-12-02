// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import android.net.Uri;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import android.text.TextUtils;
import android.os.Parcel;
import com.google.android.gms.common.internal.b0;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.k0;
import h2.d$b;
import h2.d$e;
import java.util.Map;
import h2.d$c;
import android.os.Bundle;
import androidx.annotation.j0;
import android.os.Parcelable$Creator;
import h2.d$f;
import h2.d$a;
import h2.a;

@d$a(creator = "RemoteMessageCreator")
@d$f({ 1 })
public final class p0 extends a
{
    @j0
    public static final Parcelable$Creator<p0> CREATOR;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    @d$c(id = 2)
    Bundle G;
    private Map<String, String> H;
    private d I;
    
    static {
        CREATOR = (Parcelable$Creator)new q0();
    }
    
    @d$b
    public p0(@j0 @d$e(id = 2) final Bundle g) {
        this.G = g;
    }
    
    private int j2(final String s) {
        if ("high".equals(s)) {
            return 1;
        }
        if ("normal".equals(s)) {
            return 2;
        }
        return 0;
    }
    
    @k0
    public String M() {
        return this.G.getString("collapse_key");
    }
    
    @k0
    public String N2() {
        return this.G.getString("message_type");
    }
    
    public int O3() {
        String s;
        if ((s = this.G.getString("google.delivered_priority")) == null) {
            if ("1".equals(this.G.getString("google.priority_reduced"))) {
                return 2;
            }
            s = this.G.getString("google.priority");
        }
        return this.j2(s);
    }
    
    @k0
    public String Q1() {
        String s;
        if ((s = this.G.getString("google.message_id")) == null) {
            s = this.G.getString("message_id");
        }
        return s;
    }
    
    @k0
    public String Q4() {
        return this.G.getString("google.c.sender.id");
    }
    
    public int Q5() {
        final Object value = this.G.get("google.ttl");
        if (value instanceof Integer) {
            return (int)value;
        }
        if (value instanceof String) {
            try {
                return Integer.parseInt((String)value);
            }
            catch (NumberFormatException ex) {
                final String value2 = String.valueOf(value);
                final StringBuilder sb = new StringBuilder(value2.length() + 13);
                sb.append("Invalid TTL: ");
                sb.append(value2);
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        return 0;
    }
    
    void R5(final Intent intent) {
        intent.putExtras(this.G);
    }
    
    @j0
    @f2.a
    public Intent S5() {
        final Intent intent = new Intent();
        intent.putExtras(this.G);
        return intent;
    }
    
    @k0
    @b0
    public byte[] U3() {
        return this.G.getByteArray("rawData");
    }
    
    public long U4() {
        final Object value = this.G.get("google.sent_time");
        if (value instanceof Long) {
            return (long)value;
        }
        if (value instanceof String) {
            try {
                return Long.parseLong((String)value);
            }
            catch (NumberFormatException ex) {
                final String value2 = String.valueOf(value);
                final StringBuilder sb = new StringBuilder(value2.length() + 19);
                sb.append("Invalid sent time: ");
                sb.append(value2);
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        return 0L;
    }
    
    @j0
    public Map<String, String> g1() {
        if (this.H == null) {
            this.H = (Map<String, String>)com.google.firebase.messaging.c.d.a(this.G);
        }
        return this.H;
    }
    
    @k0
    public d i3() {
        if (this.I == null && n0.v(this.G)) {
            this.I = new d(new n0(this.G));
        }
        return this.I;
    }
    
    public int j3() {
        String s;
        if ((s = this.G.getString("google.original_priority")) == null) {
            s = this.G.getString("google.priority");
        }
        return this.j2(s);
    }
    
    @k0
    public String q1() {
        return this.G.getString("from");
    }
    
    @k0
    public String v5() {
        return this.G.getString("google.to");
    }
    
    public void writeToParcel(@j0 final Parcel parcel, final int n) {
        q0.c(this, parcel, n);
    }
    
    public static class b
    {
        private final Bundle a;
        private final Map<String, String> b;
        
        public b(@j0 String s) {
            final Bundle a = new Bundle();
            this.a = a;
            this.b = (Map<String, String>)new androidx.collection.a();
            if (TextUtils.isEmpty((CharSequence)s)) {
                s = String.valueOf(s);
                if (s.length() != 0) {
                    s = "Invalid to: ".concat(s);
                }
                else {
                    s = new String("Invalid to: ");
                }
                throw new IllegalArgumentException(s);
            }
            a.putString("google.to", s);
        }
        
        @j0
        public b a(@j0 final String s, @k0 final String s2) {
            this.b.put(s, s2);
            return this;
        }
        
        @j0
        public p0 b() {
            final Bundle bundle = new Bundle();
            for (final Map.Entry<String, String> entry : this.b.entrySet()) {
                bundle.putString((String)entry.getKey(), (String)entry.getValue());
            }
            bundle.putAll(this.a);
            this.a.remove("from");
            return new p0(bundle);
        }
        
        @j0
        public b c() {
            this.b.clear();
            return this;
        }
        
        @j0
        public b d(@k0 final String s) {
            this.a.putString("collapse_key", s);
            return this;
        }
        
        @j0
        public b e(@j0 final Map<String, String> map) {
            this.b.clear();
            this.b.putAll(map);
            return this;
        }
        
        @j0
        public b f(@j0 final String s) {
            this.a.putString("google.message_id", s);
            return this;
        }
        
        @j0
        public b g(@k0 final String s) {
            this.a.putString("message_type", s);
            return this;
        }
        
        @j0
        @b0
        public b h(@j0 final byte[] array) {
            this.a.putByteArray("rawData", array);
            return this;
        }
        
        @j0
        public b i(@androidx.annotation.b0(from = 0L, to = 86400L) final int i) {
            this.a.putString("google.ttl", String.valueOf(i));
            return this;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }
    
    public static class d
    {
        private final String a;
        private final String b;
        private final String[] c;
        private final String d;
        private final String e;
        private final String[] f;
        private final String g;
        private final String h;
        private final String i;
        private final String j;
        private final String k;
        private final String l;
        private final String m;
        private final Uri n;
        private final String o;
        private final Integer p;
        private final Integer q;
        private final Integer r;
        private final int[] s;
        private final Long t;
        private final boolean u;
        private final boolean v;
        private final boolean w;
        private final boolean x;
        private final boolean y;
        private final long[] z;
        
        private d(final n0 n0) {
            this.a = n0.p("gcm.n.title");
            this.b = n0.h("gcm.n.title");
            this.c = p(n0, "gcm.n.title");
            this.d = n0.p("gcm.n.body");
            this.e = n0.h("gcm.n.body");
            this.f = p(n0, "gcm.n.body");
            this.g = n0.p("gcm.n.icon");
            this.i = n0.o();
            this.j = n0.p("gcm.n.tag");
            this.k = n0.p("gcm.n.color");
            this.l = n0.p("gcm.n.click_action");
            this.m = n0.p("gcm.n.android_channel_id");
            this.n = n0.f();
            this.h = n0.p("gcm.n.image");
            this.o = n0.p("gcm.n.ticker");
            this.p = n0.b("gcm.n.notification_priority");
            this.q = n0.b("gcm.n.visibility");
            this.r = n0.b("gcm.n.notification_count");
            this.u = n0.a("gcm.n.sticky");
            this.v = n0.a("gcm.n.local_only");
            this.w = n0.a("gcm.n.default_sound");
            this.x = n0.a("gcm.n.default_vibrate_timings");
            this.y = n0.a("gcm.n.default_light_settings");
            this.t = n0.j("gcm.n.event_time");
            this.s = n0.e();
            this.z = n0.q();
        }
        
        private static String[] p(final n0 n0, final String s) {
            final Object[] g = n0.g(s);
            if (g == null) {
                return null;
            }
            final String[] array = new String[g.length];
            for (int i = 0; i < g.length; ++i) {
                array[i] = String.valueOf(g[i]);
            }
            return array;
        }
        
        @k0
        public Integer A() {
            return this.q;
        }
        
        @k0
        public String a() {
            return this.d;
        }
        
        @k0
        public String[] b() {
            return this.f;
        }
        
        @k0
        public String c() {
            return this.e;
        }
        
        @k0
        public String d() {
            return this.m;
        }
        
        @k0
        public String e() {
            return this.l;
        }
        
        @k0
        public String f() {
            return this.k;
        }
        
        public boolean g() {
            return this.y;
        }
        
        public boolean h() {
            return this.w;
        }
        
        public boolean i() {
            return this.x;
        }
        
        @k0
        public Long j() {
            return this.t;
        }
        
        @k0
        public String k() {
            return this.g;
        }
        
        @k0
        public Uri l() {
            final String h = this.h;
            if (h != null) {
                return Uri.parse(h);
            }
            return null;
        }
        
        @k0
        public int[] m() {
            return this.s;
        }
        
        @k0
        public Uri n() {
            return this.n;
        }
        
        public boolean o() {
            return this.v;
        }
        
        @k0
        public Integer q() {
            return this.r;
        }
        
        @k0
        public Integer r() {
            return this.p;
        }
        
        @k0
        public String s() {
            return this.i;
        }
        
        public boolean t() {
            return this.u;
        }
        
        @k0
        public String u() {
            return this.j;
        }
        
        @k0
        public String v() {
            return this.o;
        }
        
        @k0
        public String w() {
            return this.a;
        }
        
        @k0
        public String[] x() {
            return this.c;
        }
        
        @k0
        public String y() {
            return this.b;
        }
        
        @k0
        public long[] z() {
            return this.z;
        }
    }
}
