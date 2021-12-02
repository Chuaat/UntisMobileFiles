// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class i implements Callable<String>
{
    private final /* synthetic */ SharedPreferences G;
    private final /* synthetic */ String H;
    private final /* synthetic */ String I;
    
    i(final SharedPreferences g, final String h, final String i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
}
