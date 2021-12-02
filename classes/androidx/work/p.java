// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import androidx.annotation.t0;
import androidx.annotation.k0;
import androidx.annotation.j0;

public abstract class p
{
    @j0
    @t0({ t0.a.H })
    public static p c() {
        return new p() {
            @k0
            @Override
            public o a(@j0 final String s) {
                return null;
            }
        };
    }
    
    @k0
    public abstract o a(@j0 final String p0);
    
    @k0
    @t0({ t0.a.H })
    public final o b(@j0 final String s) {
        o o;
        if ((o = this.a(s)) == null) {
            o = androidx.work.o.a(s);
        }
        return o;
    }
}
