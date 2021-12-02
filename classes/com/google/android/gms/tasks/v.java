// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

final class v implements Runnable
{
    private final /* synthetic */ m G;
    private final /* synthetic */ t H;
    
    v(final t h, final m g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        if (this.G.t()) {
            this.H.c.A();
            return;
        }
        try {
            this.H.c.z(this.H.b.a(this.G));
        }
        catch (Exception ex) {
            this.H.c.y(ex);
        }
        catch (k k) {
            if (k.getCause() instanceof Exception) {
                this.H.c.y((Exception)k.getCause());
                return;
            }
            this.H.c.y(k);
        }
    }
}
