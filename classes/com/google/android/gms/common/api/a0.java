// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

final class a0 implements a
{
    private final /* synthetic */ d a;
    
    a0(final d a) {
        this.a = a;
    }
    
    @Override
    public final void a(Status l) {
        synchronized (this.a.u) {
            if (this.a.g()) {
                return;
            }
            if (l.N2()) {
                d.A(this.a, true);
            }
            else if (!l.j3()) {
                d.C(this.a, true);
            }
            this.a.q--;
            if (this.a.q == 0) {
                if (this.a.s) {
                    this.a.f();
                }
                else {
                    if (this.a.r) {
                        l = new Status(13);
                    }
                    else {
                        l = Status.L;
                    }
                    final d a = this.a;
                    a.o(new e(l, a.t));
                }
            }
        }
    }
}
