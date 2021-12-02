// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import androidx.annotation.k0;
import android.os.Bundle;
import androidx.annotation.j0;

@b("navigation")
public class i0 extends u0<e0>
{
    private final v0 a;
    
    public i0(@j0 final v0 a) {
        this.a = a;
    }
    
    @Override
    public boolean e() {
        return true;
    }
    
    @j0
    public e0 f() {
        return new e0(this);
    }
    
    @k0
    public a0 g(@j0 final e0 e0, @k0 final Bundle bundle, @k0 final o0 o0, @k0 final a a) {
        final int r = e0.R();
        if (r == 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("no start destination defined via app:startDestination for ");
            sb.append(e0.n());
            throw new IllegalStateException(sb.toString());
        }
        final a0 o2 = e0.O(r, false);
        if (o2 != null) {
            return this.a.e(o2.r()).b(o2, o2.i(bundle), o0, a);
        }
        final String p4 = e0.P();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("navigation destination ");
        sb2.append(p4);
        sb2.append(" is not a direct child of this NavGraph");
        throw new IllegalArgumentException(sb2.toString());
    }
}
