// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations;

import com.google.firebase.installations.local.d;
import com.google.android.gms.tasks.n;

class m implements r
{
    private final s a;
    private final n<o> b;
    
    public m(final s a, final n<o> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean a(final Exception ex) {
        this.b.d(ex);
        return true;
    }
    
    @Override
    public boolean b(final d d) {
        if (d.k() && !this.a.f(d)) {
            this.b.c((Object)o.a().b(d.b()).d(d.c()).c(d.h()).a());
            return true;
        }
        return false;
    }
}
