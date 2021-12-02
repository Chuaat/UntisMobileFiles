// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.datatransport;

import java.util.Collections;
import com.google.firebase.components.j;
import e3.c;
import java.util.List;
import com.google.android.datatransport.runtime.f;
import com.google.android.datatransport.cct.a;
import com.google.android.datatransport.runtime.t;
import android.content.Context;
import com.google.android.datatransport.i;
import com.google.firebase.components.g;
import androidx.annotation.Keep;
import com.google.firebase.components.k;

@Keep
public class TransportRegistrar implements k
{
    public List<com.google.firebase.components.f<?>> getComponents() {
        return Collections.singletonList(com.google.firebase.components.f.d((Class)i.class).b(com.google.firebase.components.t.j((Class)Context.class)).f((j)c.a).d());
    }
}
