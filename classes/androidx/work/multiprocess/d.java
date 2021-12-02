// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.multiprocess;

import androidx.work.c0;
import androidx.work.e0;
import androidx.work.w;
import androidx.work.f0;
import androidx.work.b0;
import java.util.UUID;
import x2.a;
import java.util.List;
import java.util.Collections;
import androidx.work.s;
import androidx.work.k;
import androidx.work.impl.j;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;

public abstract class d
{
    @t0({ t0.a.H })
    protected d() {
    }
    
    @j0
    public static d o(@j0 final Context context) {
        final d k = j.H(context).K();
        if (k != null) {
            return k;
        }
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }
    
    @j0
    public final c a(@j0 final String s, @j0 final k k, @j0 final s o) {
        return this.b(s, k, Collections.singletonList(o));
    }
    
    @j0
    public abstract c b(@j0 final String p0, @j0 final k p1, @j0 final List<s> p2);
    
    @j0
    public final c c(@j0 final s o) {
        return this.d(Collections.singletonList(o));
    }
    
    @j0
    public abstract c d(@j0 final List<s> p0);
    
    @j0
    public abstract a<Void> e();
    
    @j0
    public abstract a<Void> f(@j0 final String p0);
    
    @j0
    public abstract a<Void> g(@j0 final String p0);
    
    @j0
    public abstract a<Void> h(@j0 final UUID p0);
    
    @j0
    @t0({ t0.a.H })
    public abstract a<Void> i(@j0 final b0 p0);
    
    @j0
    public abstract a<Void> j(@j0 final f0 p0);
    
    @j0
    public abstract a<Void> k(@j0 final List<f0> p0);
    
    @j0
    public abstract a<Void> l(@j0 final String p0, @j0 final androidx.work.j p1, @j0 final w p2);
    
    @j0
    public final a<Void> m(@j0 final String s, @j0 final k k, @j0 final s o) {
        return this.n(s, k, Collections.singletonList(o));
    }
    
    @j0
    public abstract a<Void> n(@j0 final String p0, @j0 final k p1, @j0 final List<s> p2);
    
    @j0
    public abstract a<List<c0>> p(@j0 final e0 p0);
}
