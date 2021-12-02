// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import java.io.IOException;
import com.google.firebase.encoders.f;
import com.google.firebase.encoders.d$b;
import java.lang.annotation.Annotation;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;

final class a implements e<com.google.firebase.messaging.reporting.a>
{
    static final a a;
    private static final d b;
    private static final d c;
    private static final d d;
    private static final d e;
    private static final d f;
    private static final d g;
    private static final d h;
    private static final d i;
    private static final d j;
    private static final d k;
    private static final d l;
    private static final d m;
    private static final d n;
    private static final d o;
    private static final d p;
    
    static {
        a = new a();
        final d$b a2 = com.google.firebase.encoders.d.a("projectNumber");
        final b0 b2 = new b0();
        b2.a(1);
        b = a2.b((Annotation)b2.b()).a();
        final d$b a3 = com.google.firebase.encoders.d.a("messageId");
        final b0 b3 = new b0();
        b3.a(2);
        c = a3.b((Annotation)b3.b()).a();
        final d$b a4 = com.google.firebase.encoders.d.a("instanceId");
        final b0 b4 = new b0();
        b4.a(3);
        d = a4.b((Annotation)b4.b()).a();
        final d$b a5 = com.google.firebase.encoders.d.a("messageType");
        final b0 b5 = new b0();
        b5.a(4);
        e = a5.b((Annotation)b5.b()).a();
        final d$b a6 = com.google.firebase.encoders.d.a("sdkPlatform");
        final b0 b6 = new b0();
        b6.a(5);
        f = a6.b((Annotation)b6.b()).a();
        final d$b a7 = com.google.firebase.encoders.d.a("packageName");
        final b0 b7 = new b0();
        b7.a(6);
        g = a7.b((Annotation)b7.b()).a();
        final d$b a8 = com.google.firebase.encoders.d.a("collapseKey");
        final b0 b8 = new b0();
        b8.a(7);
        h = a8.b((Annotation)b8.b()).a();
        final d$b a9 = com.google.firebase.encoders.d.a("priority");
        final b0 b9 = new b0();
        b9.a(8);
        i = a9.b((Annotation)b9.b()).a();
        final d$b a10 = com.google.firebase.encoders.d.a("ttl");
        final b0 b10 = new b0();
        b10.a(9);
        j = a10.b((Annotation)b10.b()).a();
        final d$b a11 = com.google.firebase.encoders.d.a("topic");
        final b0 b11 = new b0();
        b11.a(10);
        k = a11.b((Annotation)b11.b()).a();
        final d$b a12 = com.google.firebase.encoders.d.a("bulkId");
        final b0 b12 = new b0();
        b12.a(11);
        l = a12.b((Annotation)b12.b()).a();
        final d$b a13 = com.google.firebase.encoders.d.a("event");
        final b0 b13 = new b0();
        b13.a(12);
        m = a13.b((Annotation)b13.b()).a();
        final d$b a14 = com.google.firebase.encoders.d.a("analyticsLabel");
        final b0 b14 = new b0();
        b14.a(13);
        n = a14.b((Annotation)b14.b()).a();
        final d$b a15 = com.google.firebase.encoders.d.a("campaignId");
        final b0 b15 = new b0();
        b15.a(14);
        o = a15.b((Annotation)b15.b()).a();
        final d$b a16 = com.google.firebase.encoders.d.a("composerLabel");
        final b0 b16 = new b0();
        b16.a(15);
        p = a16.b((Annotation)b16.b()).a();
    }
    
    private a() {
    }
}
