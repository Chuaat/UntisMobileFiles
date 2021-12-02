// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations;

import java.util.Arrays;
import com.google.firebase.platforminfo.h;
import com.google.firebase.components.t;
import com.google.firebase.components.f;
import java.util.List;
import n3.b;
import com.google.firebase.platforminfo.i;
import com.google.firebase.e;
import com.google.firebase.components.g;
import androidx.annotation.Keep;
import com.google.firebase.components.k;

@Keep
public class FirebaseInstallationsRegistrar implements k
{
    public List<f<?>> getComponents() {
        return Arrays.asList(f.d((Class)j.class).b(t.j((Class)e.class)).b(t.i((Class)com.google.firebase.heartbeatinfo.k.class)).b(t.i((Class)i.class)).f((com.google.firebase.components.j)l.a).d(), h.b("fire-installations", "17.0.0"));
    }
}
