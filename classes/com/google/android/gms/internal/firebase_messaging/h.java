// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import java.io.IOException;
import com.google.firebase.encoders.f;
import com.google.firebase.encoders.d$b;
import java.lang.annotation.Annotation;
import com.google.firebase.encoders.d;
import com.google.firebase.messaging.reporting.b;
import com.google.firebase.encoders.e;

final class h implements e<b>
{
    static final h a;
    private static final d b;
    
    static {
        a = new h();
        final d$b a2 = d.a("messagingClientEvent");
        final b0 b2 = new b0();
        b2.a(1);
        b = a2.b((Annotation)b2.b()).a();
    }
    
    private h() {
    }
}
