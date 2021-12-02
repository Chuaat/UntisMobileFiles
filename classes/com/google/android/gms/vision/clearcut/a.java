// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.clearcut;

import com.google.android.gms.internal.vision.q3;

final class a implements Runnable
{
    private final /* synthetic */ int G;
    private final /* synthetic */ q3.o H;
    private final /* synthetic */ DynamiteClearcutLogger I;
    
    a(final DynamiteClearcutLogger i, final int g, final q3.o h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        this.I.zzc.zza(this.G, this.H);
    }
}
