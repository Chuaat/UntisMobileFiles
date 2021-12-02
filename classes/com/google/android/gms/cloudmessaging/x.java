// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

final class x extends v<Bundle>
{
    x(final int n, final int n2, final Bundle bundle) {
        super(n, 1, bundle);
    }
    
    @Override
    final void a(Bundle bundle) {
        if ((bundle = bundle.getBundle("data")) == null) {
            bundle = Bundle.EMPTY;
        }
        this.c(bundle);
    }
    
    @Override
    final boolean d() {
        return false;
    }
}
