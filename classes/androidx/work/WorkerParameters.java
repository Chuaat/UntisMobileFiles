// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import java.util.Collections;
import android.net.Uri;
import java.util.List;
import androidx.annotation.p0;
import androidx.annotation.k0;
import android.net.Network;
import androidx.annotation.t0;
import java.util.HashSet;
import androidx.annotation.b0;
import java.util.Collection;
import androidx.work.impl.utils.taskexecutor.a;
import java.util.concurrent.Executor;
import java.util.Set;
import androidx.annotation.j0;
import java.util.UUID;

public final class WorkerParameters
{
    @j0
    private UUID a;
    @j0
    private f b;
    @j0
    private Set<String> c;
    @j0
    private a d;
    private int e;
    @j0
    private Executor f;
    @j0
    private androidx.work.impl.utils.taskexecutor.a g;
    @j0
    private g0 h;
    @j0
    private y i;
    @j0
    private m j;
    
    @t0({ t0.a.H })
    public WorkerParameters(@j0 final UUID a, @j0 final f b, @j0 final Collection<String> c, @j0 final a d, @b0(from = 0L) final int e, @j0 final Executor f, @j0 final androidx.work.impl.utils.taskexecutor.a g, @j0 final g0 h, @j0 final y i, @j0 final m j) {
        this.a = a;
        this.b = b;
        this.c = new HashSet<String>(c);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @j0
    @t0({ t0.a.H })
    public Executor a() {
        return this.f;
    }
    
    @j0
    @t0({ t0.a.H })
    public m b() {
        return this.j;
    }
    
    @j0
    public UUID c() {
        return this.a;
    }
    
    @j0
    public f d() {
        return this.b;
    }
    
    @k0
    @p0(28)
    public Network e() {
        return this.d.c;
    }
    
    @j0
    @t0({ t0.a.H })
    public y f() {
        return this.i;
    }
    
    @b0(from = 0L)
    public int g() {
        return this.e;
    }
    
    @j0
    public Set<String> h() {
        return this.c;
    }
    
    @j0
    @t0({ t0.a.H })
    public androidx.work.impl.utils.taskexecutor.a i() {
        return this.g;
    }
    
    @j0
    @p0(24)
    public List<String> j() {
        return this.d.a;
    }
    
    @j0
    @p0(24)
    public List<Uri> k() {
        return this.d.b;
    }
    
    @j0
    @t0({ t0.a.H })
    public g0 l() {
        return this.h;
    }
    
    @t0({ t0.a.H })
    public static class a
    {
        @j0
        public List<String> a;
        @j0
        public List<Uri> b;
        @p0(28)
        public Network c;
        
        public a() {
            this.a = Collections.emptyList();
            this.b = Collections.emptyList();
        }
    }
}
