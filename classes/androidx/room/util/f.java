// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room.util;

import androidx.annotation.j0;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class f
{
    private f() {
    }
    
    public static void a(@j0 final Exception ex) {
        b(ex);
    }
    
    private static <E extends Throwable> void b(@j0 final Throwable t) throws E, Throwable {
        throw t;
    }
}
