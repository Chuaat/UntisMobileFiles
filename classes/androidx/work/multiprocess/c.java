// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.multiprocess;

import java.util.Collections;
import androidx.work.s;
import x2.a;
import androidx.annotation.j0;
import java.util.List;
import androidx.annotation.t0;

public abstract class c
{
    @t0({ t0.a.H })
    protected c() {
    }
    
    @j0
    public static c a(@j0 final List<c> list) {
        return list.get(0).b(list);
    }
    
    @j0
    @t0({ t0.a.H })
    protected abstract c b(@j0 final List<c> p0);
    
    @j0
    public abstract a<Void> c();
    
    @j0
    public final c d(@j0 final s o) {
        return this.e(Collections.singletonList(o));
    }
    
    @j0
    public abstract c e(@j0 final List<s> p0);
}
