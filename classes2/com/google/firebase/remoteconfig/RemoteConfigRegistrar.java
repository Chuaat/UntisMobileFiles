// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig;

import java.util.Arrays;
import com.google.firebase.platforminfo.h;
import com.google.firebase.components.t;
import com.google.firebase.components.f;
import java.util.List;
import com.google.firebase.abt.component.a;
import com.google.firebase.installations.j;
import com.google.firebase.e;
import android.content.Context;
import com.google.firebase.components.g;
import androidx.annotation.Keep;
import com.google.firebase.components.k;

@Keep
public class RemoteConfigRegistrar implements k
{
    public List<f<?>> getComponents() {
        return Arrays.asList(f.d((Class)w.class).b(t.j((Class)Context.class)).b(t.j((Class)e.class)).b(t.j((Class)j.class)).b(t.j((Class)a.class)).b(t.h((Class)com.google.firebase.analytics.connector.a.class)).f(y.b()).e().d(), h.b("fire-rc", "20.0.1"));
    }
}
