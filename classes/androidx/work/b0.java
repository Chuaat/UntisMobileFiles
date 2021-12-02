// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import java.util.Collections;
import androidx.lifecycle.LiveData;
import x2.a;
import androidx.annotation.t0;
import androidx.annotation.j0;
import java.util.List;

public abstract class b0
{
    @j0
    public static b0 a(@j0 final List<b0> list) {
        return list.get(0).b(list);
    }
    
    @j0
    @t0({ t0.a.H })
    protected abstract b0 b(@j0 final List<b0> p0);
    
    @j0
    public abstract u c();
    
    @j0
    public abstract a<List<c0>> d();
    
    @j0
    public abstract LiveData<List<c0>> e();
    
    @j0
    public final b0 f(@j0 final s o) {
        return this.g(Collections.singletonList(o));
    }
    
    @j0
    public abstract b0 g(@j0 final List<s> p0);
}
