// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class c implements Callable<Boolean>
{
    private final /* synthetic */ SharedPreferences G;
    private final /* synthetic */ String H;
    private final /* synthetic */ Boolean I;
    
    c(final SharedPreferences g, final String h, final Boolean i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
}
