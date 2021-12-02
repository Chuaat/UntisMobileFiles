// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.abt.component;

import java.util.Arrays;
import com.google.firebase.platforminfo.h;
import com.google.firebase.components.j;
import com.google.firebase.components.t;
import com.google.firebase.components.f;
import java.util.List;
import android.content.Context;
import com.google.firebase.components.g;
import androidx.annotation.Keep;
import com.google.firebase.components.k;

@Keep
public class AbtRegistrar implements k
{
    @Override
    public List<f<?>> getComponents() {
        return Arrays.asList(f.d(a.class).b(t.j(Context.class)).b(t.h(com.google.firebase.analytics.connector.a.class)).f(b.b()).d(), h.b("fire-abt", "20.0.0"));
    }
}
