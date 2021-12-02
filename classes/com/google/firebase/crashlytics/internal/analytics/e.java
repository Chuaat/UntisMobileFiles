// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.analytics;

import androidx.annotation.k0;
import android.os.Bundle;
import androidx.annotation.j0;

public class e implements a
{
    static final String b = "clx";
    @j0
    private final com.google.firebase.analytics.connector.a a;
    
    public e(@j0 final com.google.firebase.analytics.connector.a a) {
        this.a = a;
    }
    
    @Override
    public void a(@j0 final String s, @k0 final Bundle bundle) {
        this.a.c("clx", s, bundle);
    }
}
