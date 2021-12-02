// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import androidx.collection.m;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import androidx.collection.a;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import androidx.annotation.j0;

public final class c
{
    @j0
    public static final String a = "FirebaseMessaging";
    @j0
    public static final String b = "wake:com.google.firebase.messaging";
    public static final long c;
    @j0
    public static final String d = "error";
    
    static {
        c = TimeUnit.MINUTES.toMillis(3L);
    }
    
    private c() {
    }
    
    public static final class a
    {
        @j0
        public static final String a = "google.c.a.";
        @j0
        public static final String b = "google.c.a.e";
        @j0
        public static final String c = "google.c.a.c_id";
        @j0
        public static final String d = "google.c.a.c_l";
        @j0
        public static final String e = "google.c.a.ts";
        @j0
        public static final String f = "google.c.a.udt";
        @j0
        public static final String g = "google.c.a.tc";
        @j0
        public static final String h = "google.c.a.abt";
        @j0
        public static final String i = "google.c.a.m_l";
        @j0
        public static final String j = "google.c.a.m_c";
        
        private a() {
        }
    }
    
    public static final class b
    {
        @j0
        public static final String a = "FCM_CLIENT_EVENT_LOGGING";
        
        private b() {
        }
    }
    
    public static final class c
    {
        @j0
        public static final String A = "gcm.n.click_action";
        @j0
        public static final String B = "gcm.n.link";
        @j0
        public static final String C = "gcm.n.link_android";
        @j0
        public static final String D = "gcm.n.android_channel_id";
        @j0
        public static final String E = "gcm.n.analytics_data";
        @j0
        public static final String F = "_loc_key";
        @j0
        public static final String G = "_loc_args";
        @j0
        public static final String a = "gcm.";
        @j0
        public static final String b = "gcm.n.";
        @j0
        public static final String c = "gcm.notification.";
        @j0
        public static final String d = "gcm.n.e";
        @j0
        public static final String e = "gcm.n.dnp";
        @j0
        public static final String f = "gcm.n.noui";
        @j0
        public static final String g = "gcm.n.title";
        @j0
        public static final String h = "gcm.n.body";
        @j0
        public static final String i = "gcm.n.icon";
        @j0
        public static final String j = "gcm.n.image";
        @j0
        public static final String k = "gcm.n.tag";
        @j0
        public static final String l = "gcm.n.color";
        @j0
        public static final String m = "gcm.n.ticker";
        @j0
        public static final String n = "gcm.n.local_only";
        @j0
        public static final String o = "gcm.n.sticky";
        @j0
        public static final String p = "gcm.n.notification_priority";
        @j0
        public static final String q = "gcm.n.default_sound";
        @j0
        public static final String r = "gcm.n.default_vibrate_timings";
        @j0
        public static final String s = "gcm.n.default_light_settings";
        @j0
        public static final String t = "gcm.n.notification_count";
        @j0
        public static final String u = "gcm.n.visibility";
        @j0
        public static final String v = "gcm.n.vibrate_timings";
        @j0
        public static final String w = "gcm.n.light_settings";
        @j0
        public static final String x = "gcm.n.event_time";
        @j0
        public static final String y = "gcm.n.sound2";
        @j0
        public static final String z = "gcm.n.sound";
        
        private c() {
        }
    }
    
    public static final class d
    {
        @j0
        public static final String a = "google.";
        @j0
        public static final String b = "from";
        @j0
        public static final String c = "rawData";
        @j0
        public static final String d = "message_type";
        @j0
        public static final String e = "collapse_key";
        @j0
        public static final String f = "message_id";
        @j0
        public static final String g = "google.to";
        @j0
        public static final String h = "google.message_id";
        @j0
        public static final String i = "google.ttl";
        @j0
        public static final String j = "google.sent_time";
        @j0
        public static final String k = "google.original_priority";
        @j0
        public static final String l = "google.delivered_priority";
        @j0
        public static final String m = "google.priority";
        @j0
        public static final String n = "google.priority_reduced";
        @j0
        public static final String o = "google.c.";
        @j0
        public static final String p = "google.c.sender.id";
        
        private d() {
        }
        
        @j0
        public static a<String, String> a(@j0 final Bundle bundle) {
            final a a = new a();
            for (final String s : bundle.keySet()) {
                final Object value = bundle.get(s);
                if (value instanceof String) {
                    final String s2 = (String)value;
                    if (s.startsWith("google.") || s.startsWith("gcm.") || s.equals("from") || s.equals("message_type") || s.equals("collapse_key")) {
                        continue;
                    }
                    ((m)a).put((Object)s, (Object)s2);
                }
            }
            return (a<String, String>)a;
        }
    }
    
    public static final class e
    {
        @j0
        public static final String a = "gcm";
        @j0
        public static final String b = "deleted_messages";
        @j0
        public static final String c = "send_event";
        @j0
        public static final String d = "send_error";
        
        private e() {
        }
    }
    
    public static final class f
    {
        @j0
        public static final String a = "fcm";
        @j0
        public static final String b = "source";
        @j0
        public static final String c = "medium";
        @j0
        public static final String d = "label";
        @j0
        public static final String e = "_nt";
        @j0
        public static final String f = "campaign";
        @j0
        public static final String g = "_nmn";
        @j0
        public static final String h = "_nmt";
        @j0
        public static final String i = "_ndt";
        @j0
        public static final String j = "message_channel";
        @j0
        public static final String k = "_nmc";
        @j0
        public static final String l = "_cmp";
        @j0
        public static final String m = "_nr";
        @j0
        public static final String n = "_no";
        @j0
        public static final String o = "_nd";
        @j0
        public static final String p = "_nf";
        @j0
        public static final String q = "_ln";
        
        private f() {
        }
        
        public @interface a {
            @j0
            public static final String L0 = "data";
            @j0
            public static final String M0 = "display";
        }
    }
}
