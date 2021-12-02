// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

final class s extends v<Void>
{
    s(final int n, final int n2, final Bundle bundle) {
        super(n, 2, bundle);
    }
    
    @Override
    final void a(final Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            this.c(null);
            return;
        }
        this.b(new u(4, "Invalid response to one way request"));
    }
    
    @Override
    final boolean d() {
        return true;
    }
}
