// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.cloudmessaging;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.os.Parcelable;
import h2.c;
import android.os.Parcel;
import java.util.Iterator;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.k0;
import java.util.Map;
import android.content.Intent;
import androidx.annotation.j0;
import android.os.Parcelable$Creator;
import h2.d;

@d.a(creator = "CloudMessageCreator")
public final class a extends a
{
    @j0
    public static final Parcelable$Creator<a> CREATOR;
    public static final int I = 0;
    public static final int J = 1;
    public static final int K = 2;
    @j0
    @c(id = 1)
    private Intent G;
    @d6.a("this")
    private Map<String, String> H;
    
    static {
        CREATOR = (Parcelable$Creator)new com.google.android.gms.cloudmessaging.g();
    }
    
    @b
    public a(@j0 @e(id = 1) final Intent g) {
        this.G = g;
    }
    
    private static int Q5(@k0 final String s) {
        if ("high".equals(s)) {
            return 1;
        }
        if ("normal".equals(s)) {
            return 2;
        }
        return 0;
    }
    
    @k0
    public final String M() {
        return this.G.getStringExtra("collapse_key");
    }
    
    @k0
    public final String N2() {
        return this.G.getStringExtra("message_type");
    }
    
    @k0
    public final byte[] O3() {
        return this.G.getByteArrayExtra("rawData");
    }
    
    @j0
    public final Intent Q1() {
        return this.G;
    }
    
    public final long Q4() {
        final Bundle extras = this.G.getExtras();
        Object value;
        if (extras != null) {
            value = extras.get("google.sent_time");
        }
        else {
            value = null;
        }
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
                Log.w("CloudMessage", sb.toString());
            }
        }
        return 0L;
    }
    
    @k0
    public final String U3() {
        return this.G.getStringExtra("google.c.sender.id");
    }
    
    @k0
    public final String U4() {
        return this.G.getStringExtra("google.to");
    }
    
    @j0
    public final Map<String, String> g1() {
        synchronized (this) {
            if (this.H == null) {
                final Bundle extras = this.G.getExtras();
                final androidx.collection.a<String, String> h = new androidx.collection.a<String, String>();
                if (extras != null) {
                    for (final String s : extras.keySet()) {
                        final Object value = extras.get(s);
                        if (value instanceof String) {
                            final String s2 = (String)value;
                            if (s.startsWith("google.") || s.equals("from") || s.equals("message_type") || s.equals("collapse_key")) {
                                continue;
                            }
                            h.put(s, s2);
                        }
                    }
                }
                this.H = h;
            }
            return this.H;
        }
    }
    
    public final int i3() {
        String s;
        if ((s = this.G.getStringExtra("google.original_priority")) == null) {
            s = this.G.getStringExtra("google.priority");
        }
        return Q5(s);
    }
    
    @k0
    public final String j2() {
        String s;
        if ((s = this.G.getStringExtra("google.message_id")) == null) {
            s = this.G.getStringExtra("message_id");
        }
        return s;
    }
    
    public final int j3() {
        String s;
        if ((s = this.G.getStringExtra("google.delivered_priority")) == null) {
            if ("1".equals(this.G.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            s = this.G.getStringExtra("google.priority");
        }
        return Q5(s);
    }
    
    @k0
    public final String q1() {
        return this.G.getStringExtra("from");
    }
    
    public final int v5() {
        final Bundle extras = this.G.getExtras();
        Object value;
        if (extras != null) {
            value = extras.get("google.ttl");
        }
        else {
            value = null;
        }
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
                Log.w("CloudMessage", sb.toString());
            }
        }
        return 0;
    }
    
    public final void writeToParcel(@j0 final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.S(parcel, 1, (Parcelable)this.G, n, false);
        h2.c.b(parcel, a);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @Target({ ElementType.TYPE_PARAMETER, ElementType.TYPE_USE })
    public @interface a {
    }
}
