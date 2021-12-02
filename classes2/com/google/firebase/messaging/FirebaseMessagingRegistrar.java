// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import androidx.annotation.j0;
import java.util.Arrays;
import com.google.firebase.platforminfo.h;
import com.google.firebase.components.t;
import com.google.firebase.components.f;
import java.util.List;
import n3.b;
import j3.d;
import com.google.firebase.installations.j;
import com.google.firebase.platforminfo.i;
import com.google.firebase.e;
import com.google.firebase.components.g;
import f2.a;
import androidx.annotation.Keep;
import com.google.firebase.components.k;

@Keep
@a
public class FirebaseMessagingRegistrar implements k
{
    @Keep
    @j0
    public List<f<?>> getComponents() {
        return Arrays.asList(f.d((Class)FirebaseMessaging.class).b(t.j((Class)e.class)).b(t.h((Class)m3.a.class)).b(t.i((Class)i.class)).b(t.i((Class)com.google.firebase.heartbeatinfo.k.class)).b(t.h((Class)com.google.android.datatransport.i.class)).b(t.j((Class)j.class)).b(t.j((Class)d.class)).f(e0.a).c().d(), h.b("fire-fcm", "22.0.0"));
    }
}
