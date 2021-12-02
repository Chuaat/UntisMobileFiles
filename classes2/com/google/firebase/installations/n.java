// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations;

import com.google.firebase.installations.local.d;

class n implements r
{
    final com.google.android.gms.tasks.n<String> a;
    
    public n(final com.google.android.gms.tasks.n<String> a) {
        this.a = a;
    }
    
    @Override
    public boolean a(final Exception ex) {
        return false;
    }
    
    @Override
    public boolean b(final d d) {
        if (!d.l() && !d.k() && !d.i()) {
            return false;
        }
        this.a.e((Object)d.d());
        return true;
    }
}
