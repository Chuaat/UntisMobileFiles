// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class g implements Callable<Long>
{
    private final /* synthetic */ SharedPreferences G;
    private final /* synthetic */ String H;
    private final /* synthetic */ Long I;
    
    g(final SharedPreferences g, final String h, final Long i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
}
