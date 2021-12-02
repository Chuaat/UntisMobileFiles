// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct.internal;

import java.io.IOException;
import com.google.firebase.encoders.e;
import i3.a;

public final class b implements i3.a
{
    public static final int a = 2;
    public static final i3.a b;
    
    static {
        b = (i3.a)new b();
    }
    
    private b() {
    }
    
    public void a(final b<?> b) {
        final b a = b.a;
        b.b((Class)j.class, (com.google.firebase.encoders.e)a);
        b.b((Class)com.google.android.datatransport.cct.internal.d.class, (com.google.firebase.encoders.e)a);
        final e a2 = e.a;
        b.b((Class)m.class, (com.google.firebase.encoders.e)a2);
        b.b((Class)g.class, (com.google.firebase.encoders.e)a2);
        final c a3 = c.a;
        b.b((Class)k.class, (com.google.firebase.encoders.e)a3);
        b.b((Class)com.google.android.datatransport.cct.internal.e.class, (com.google.firebase.encoders.e)a3);
        final a a4 = com.google.android.datatransport.cct.internal.b.a.a;
        b.b((Class)com.google.android.datatransport.cct.internal.a.class, (com.google.firebase.encoders.e)a4);
        b.b((Class)com.google.android.datatransport.cct.internal.c.class, (com.google.firebase.encoders.e)a4);
        final d a5 = d.a;
        b.b((Class)l.class, (com.google.firebase.encoders.e)a5);
        b.b((Class)com.google.android.datatransport.cct.internal.f.class, (com.google.firebase.encoders.e)a5);
        final f a6 = f.a;
        b.b((Class)o.class, (com.google.firebase.encoders.e)a6);
        b.b((Class)i.class, (com.google.firebase.encoders.e)a6);
    }
    
    private static final class a implements com.google.firebase.encoders.e<com.google.android.datatransport.cct.internal.a>
    {
        static final a a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        private static final com.google.firebase.encoders.d f;
        private static final com.google.firebase.encoders.d g;
        private static final com.google.firebase.encoders.d h;
        private static final com.google.firebase.encoders.d i;
        private static final com.google.firebase.encoders.d j;
        private static final com.google.firebase.encoders.d k;
        private static final com.google.firebase.encoders.d l;
        private static final com.google.firebase.encoders.d m;
        
        static {
            a = new a();
            b = com.google.firebase.encoders.d.d("sdkVersion");
            c = com.google.firebase.encoders.d.d("model");
            d = com.google.firebase.encoders.d.d("hardware");
            e = com.google.firebase.encoders.d.d("device");
            f = com.google.firebase.encoders.d.d("product");
            g = com.google.firebase.encoders.d.d("osBuild");
            h = com.google.firebase.encoders.d.d("manufacturer");
            i = com.google.firebase.encoders.d.d("fingerprint");
            j = com.google.firebase.encoders.d.d("locale");
            k = com.google.firebase.encoders.d.d("country");
            l = com.google.firebase.encoders.d.d("mccMnc");
            m = com.google.firebase.encoders.d.d("applicationBuild");
        }
        
        public void b(final com.google.android.datatransport.cct.internal.a a, final com.google.firebase.encoders.f f) throws IOException {
            f.n(com.google.android.datatransport.cct.internal.b.a.b, (Object)a.m());
            f.n(com.google.android.datatransport.cct.internal.b.a.c, (Object)a.j());
            f.n(com.google.android.datatransport.cct.internal.b.a.d, (Object)a.f());
            f.n(com.google.android.datatransport.cct.internal.b.a.e, (Object)a.d());
            f.n(com.google.android.datatransport.cct.internal.b.a.f, (Object)a.l());
            f.n(com.google.android.datatransport.cct.internal.b.a.g, (Object)a.k());
            f.n(com.google.android.datatransport.cct.internal.b.a.h, (Object)a.h());
            f.n(com.google.android.datatransport.cct.internal.b.a.i, (Object)a.e());
            f.n(com.google.android.datatransport.cct.internal.b.a.j, (Object)a.g());
            f.n(com.google.android.datatransport.cct.internal.b.a.k, (Object)a.c());
            f.n(com.google.android.datatransport.cct.internal.b.a.l, (Object)a.i());
            f.n(com.google.android.datatransport.cct.internal.b.a.m, (Object)a.b());
        }
    }
    
    private static final class b implements com.google.firebase.encoders.e<j>
    {
        static final b a;
        private static final com.google.firebase.encoders.d b;
        
        static {
            a = new b();
            b = com.google.firebase.encoders.d.d("logRequest");
        }
        
        public void b(final j j, final com.google.firebase.encoders.f f) throws IOException {
            f.n(com.google.android.datatransport.cct.internal.b.b.b, (Object)j.c());
        }
    }
    
    private static final class c implements com.google.firebase.encoders.e<k>
    {
        static final c a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        
        static {
            a = new c();
            b = com.google.firebase.encoders.d.d("clientType");
            c = com.google.firebase.encoders.d.d("androidClientInfo");
        }
        
        public void b(final k k, final com.google.firebase.encoders.f f) throws IOException {
            f.n(com.google.android.datatransport.cct.internal.b.c.b, (Object)k.c());
            f.n(com.google.android.datatransport.cct.internal.b.c.c, (Object)k.b());
        }
    }
    
    private static final class d implements com.google.firebase.encoders.e<l>
    {
        static final d a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        private static final com.google.firebase.encoders.d f;
        private static final com.google.firebase.encoders.d g;
        private static final com.google.firebase.encoders.d h;
        
        static {
            a = new d();
            b = com.google.firebase.encoders.d.d("eventTimeMs");
            c = com.google.firebase.encoders.d.d("eventCode");
            d = com.google.firebase.encoders.d.d("eventUptimeMs");
            e = com.google.firebase.encoders.d.d("sourceExtension");
            f = com.google.firebase.encoders.d.d("sourceExtensionJsonProto3");
            g = com.google.firebase.encoders.d.d("timezoneOffsetSeconds");
            h = com.google.firebase.encoders.d.d("networkConnectionInfo");
        }
        
        public void b(final l l, final com.google.firebase.encoders.f f) throws IOException {
            f.b(com.google.android.datatransport.cct.internal.b.d.b, l.c());
            f.n(com.google.android.datatransport.cct.internal.b.d.c, (Object)l.b());
            f.b(com.google.android.datatransport.cct.internal.b.d.d, l.d());
            f.n(com.google.android.datatransport.cct.internal.b.d.e, (Object)l.f());
            f.n(com.google.android.datatransport.cct.internal.b.d.f, (Object)l.g());
            f.b(com.google.android.datatransport.cct.internal.b.d.g, l.h());
            f.n(com.google.android.datatransport.cct.internal.b.d.h, (Object)l.e());
        }
    }
    
    private static final class e implements com.google.firebase.encoders.e<m>
    {
        static final e a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        private static final com.google.firebase.encoders.d f;
        private static final com.google.firebase.encoders.d g;
        private static final com.google.firebase.encoders.d h;
        
        static {
            a = new e();
            b = com.google.firebase.encoders.d.d("requestTimeMs");
            c = com.google.firebase.encoders.d.d("requestUptimeMs");
            d = com.google.firebase.encoders.d.d("clientInfo");
            e = com.google.firebase.encoders.d.d("logSource");
            f = com.google.firebase.encoders.d.d("logSourceName");
            g = com.google.firebase.encoders.d.d("logEvent");
            h = com.google.firebase.encoders.d.d("qosTier");
        }
        
        public void b(final m m, final com.google.firebase.encoders.f f) throws IOException {
            f.b(com.google.android.datatransport.cct.internal.b.e.b, m.g());
            f.b(com.google.android.datatransport.cct.internal.b.e.c, m.h());
            f.n(com.google.android.datatransport.cct.internal.b.e.d, (Object)m.b());
            f.n(com.google.android.datatransport.cct.internal.b.e.e, (Object)m.d());
            f.n(com.google.android.datatransport.cct.internal.b.e.f, (Object)m.e());
            f.n(com.google.android.datatransport.cct.internal.b.e.g, (Object)m.c());
            f.n(com.google.android.datatransport.cct.internal.b.e.h, (Object)m.f());
        }
    }
    
    private static final class f implements com.google.firebase.encoders.e<o>
    {
        static final f a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        
        static {
            a = new f();
            b = com.google.firebase.encoders.d.d("networkType");
            c = com.google.firebase.encoders.d.d("mobileSubtype");
        }
        
        public void b(final o o, final com.google.firebase.encoders.f f) throws IOException {
            f.n(com.google.android.datatransport.cct.internal.b.f.b, (Object)o.c());
            f.n(com.google.android.datatransport.cct.internal.b.f.c, (Object)o.b());
        }
    }
}
