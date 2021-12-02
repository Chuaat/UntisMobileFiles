// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public class a5<M extends a5<M>> extends f5
{
    protected c5 H;
    
    @Override
    public void a(final y4 y4) throws IOException {
        if (this.H == null) {
            return;
        }
        for (int i = 0; i < this.H.b(); ++i) {
            this.H.c(i).b(y4);
        }
    }
    
    @Override
    protected int d() {
        if (this.H != null) {
            for (int i = 0; i < this.H.b(); ++i) {
                this.H.c(i).c();
            }
        }
        return 0;
    }
    
    public M g() throws CloneNotSupportedException {
        final a5 a5 = (a5)super.f();
        e5.h(this, a5);
        return (M)a5;
    }
}
