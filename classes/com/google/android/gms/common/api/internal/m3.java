// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.j0;
import com.google.android.gms.common.c;
import androidx.annotation.k0;
import android.os.Bundle;

final class m3 implements r1
{
    private final /* synthetic */ i3 a;
    
    private m3(final i3 a) {
        this.a = a;
    }
    
    @Override
    public final void J(@k0 final Bundle bundle) {
        this.a.q.lock();
        try {
            this.a.o = c.h0;
            this.a.B();
        }
        finally {
            this.a.q.unlock();
        }
    }
    
    @Override
    public final void a(@j0 final c c) {
        this.a.q.lock();
        try {
            this.a.o = c;
            this.a.B();
        }
        finally {
            this.a.q.unlock();
        }
    }
    
    @Override
    public final void b(final int n, final boolean b) {
        this.a.q.lock();
        try {
            if (this.a.p) {
                this.a.p = false;
                this.a.n(n, b);
            }
            else {
                this.a.p = true;
                this.a.h.onConnectionSuspended(n);
            }
        }
        finally {
            this.a.q.unlock();
        }
    }
}
