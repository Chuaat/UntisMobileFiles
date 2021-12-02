// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.wrappers.b;
import com.google.android.gms.common.wrappers.c;

public final class g4
{
    final z4 a;
    
    g4(final z9 z9) {
        this.a = z9.b0();
    }
    
    @d0
    final boolean a() {
        boolean b = false;
        try {
            final b a = c.a(this.a.X());
            if (a == null) {
                this.a.c().s().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (a.e("com.android.vending", 128).versionCode >= 80837300) {
                b = true;
            }
            return b;
        }
        catch (Exception ex) {
            this.a.c().s().b("Failed to retrieve Play Store version for Install Referrer", ex);
            return false;
        }
    }
}
