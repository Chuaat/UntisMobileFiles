// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.net.Uri$Builder;
import android.net.Uri;
import f2.a;

@a
public final class y
{
    private static final Uri a;
    
    static {
        a = new Uri$Builder().scheme("android.resource").authority("com.google.android.gms").appendPath("drawable").build();
    }
    
    private y() {
    }
}
