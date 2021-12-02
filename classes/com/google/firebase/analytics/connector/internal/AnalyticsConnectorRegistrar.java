// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.analytics.connector.internal;

import androidx.annotation.j0;
import android.annotation.SuppressLint;
import java.util.Arrays;
import com.google.firebase.platforminfo.h;
import com.google.firebase.components.j;
import com.google.firebase.components.t;
import com.google.firebase.components.f;
import java.util.List;
import com.google.firebase.analytics.connector.b;
import j3.d;
import android.content.Context;
import com.google.firebase.e;
import com.google.firebase.components.g;
import f2.a;
import androidx.annotation.Keep;
import com.google.firebase.components.k;

@Keep
@a
public class AnalyticsConnectorRegistrar implements k
{
    @SuppressLint({ "MissingPermission" })
    @Keep
    @j0
    @a
    @Override
    public List<f<?>> getComponents() {
        return Arrays.asList(f.d(com.google.firebase.analytics.connector.a.class).b(t.j(e.class)).b(t.j(Context.class)).b(t.j(d.class)).f(com.google.firebase.analytics.connector.internal.b.a).e().d(), h.b("fire-analytics", "19.0.1"));
    }
}
