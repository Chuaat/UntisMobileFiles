// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.x;
import java.util.List;
import java.util.Map;
import androidx.annotation.c1;

@c1
final class r3 implements Runnable
{
    private final p3 G;
    private final int H;
    private final Throwable I;
    private final byte[] J;
    private final String K;
    private final Map<String, List<String>> L;
    
    @Override
    public final void run() {
        this.G.a(this.K, this.H, this.I, this.J, this.L);
    }
}
