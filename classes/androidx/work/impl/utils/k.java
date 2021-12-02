// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import androidx.work.WorkerParameters;
import androidx.work.impl.j;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class k implements Runnable
{
    private j G;
    private String H;
    private WorkerParameters.a I;
    
    public k(final j g, final String h, final WorkerParameters.a i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public void run() {
        this.G.J().l(this.H, this.I);
    }
}
