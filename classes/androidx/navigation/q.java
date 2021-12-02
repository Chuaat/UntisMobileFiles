// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import androidx.lifecycle.w0;
import androidx.lifecycle.a;
import androidx.lifecycle.c1;
import androidx.savedstate.SavedStateRegistry;
import androidx.lifecycle.s0;
import android.app.Application;
import androidx.annotation.k0;
import androidx.lifecycle.r0;
import androidx.lifecycle.z0;
import androidx.lifecycle.s;
import androidx.annotation.j0;
import java.util.UUID;
import androidx.savedstate.b;
import android.os.Bundle;
import android.content.Context;
import androidx.savedstate.c;
import androidx.lifecycle.r;
import androidx.lifecycle.d1;
import androidx.lifecycle.y;

public final class q implements y, d1, r, androidx.savedstate.c
{
    private final Context G;
    private final a0 H;
    private Bundle I;
    private final androidx.lifecycle.a0 J;
    private final androidx.savedstate.b K;
    @j0
    final UUID L;
    private s.c M;
    private s.c N;
    private t O;
    private z0.b P;
    private r0 Q;
    
    q(@j0 final Context context, @j0 final a0 a0, @k0 final Bundle bundle, @k0 final y y, @k0 final t t) {
        this(context, a0, bundle, y, t, UUID.randomUUID(), null);
    }
    
    q(@j0 final Context g, @j0 final a0 h, @k0 final Bundle i, @k0 final y y, @k0 final t o, @j0 final UUID l, @k0 final Bundle bundle) {
        this.J = new androidx.lifecycle.a0(this);
        final androidx.savedstate.b a = androidx.savedstate.b.a(this);
        this.K = a;
        this.M = s.c.I;
        this.N = s.c.K;
        this.G = g;
        this.L = l;
        this.H = h;
        this.I = i;
        this.O = o;
        a.c(bundle);
        if (y != null) {
            this.M = y.getLifecycle().b();
        }
    }
    
    @j0
    private static s.c e(@j0 final s.b obj) {
        switch (q$a.a[obj.ordinal()]) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unexpected event value ");
                sb.append(obj);
                throw new IllegalArgumentException(sb.toString());
            }
            case 6: {
                return s.c.G;
            }
            case 5: {
                return s.c.K;
            }
            case 3:
            case 4: {
                return s.c.J;
            }
            case 1:
            case 2: {
                return s.c.I;
            }
        }
    }
    
    @k0
    public Bundle a() {
        return this.I;
    }
    
    @j0
    public a0 b() {
        return this.H;
    }
    
    @j0
    s.c c() {
        return this.N;
    }
    
    @j0
    public r0 d() {
        if (this.Q == null) {
            this.Q = new z0(this, (z0.b)new b(this, null)).a(c.class).a();
        }
        return this.Q;
    }
    
    void f(@j0 final s.b b) {
        this.M = e(b);
        this.j();
    }
    
    void g(@k0 final Bundle i) {
        this.I = i;
    }
    
    @j0
    @Override
    public z0.b getDefaultViewModelProviderFactory() {
        if (this.P == null) {
            this.P = new s0((Application)this.G.getApplicationContext(), this, this.I);
        }
        return this.P;
    }
    
    @j0
    @Override
    public s getLifecycle() {
        return this.J;
    }
    
    @j0
    @Override
    public SavedStateRegistry getSavedStateRegistry() {
        return this.K.b();
    }
    
    @j0
    @Override
    public c1 getViewModelStore() {
        final t o = this.O;
        if (o != null) {
            return o.c(this.L);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }
    
    void h(@j0 final Bundle bundle) {
        this.K.d(bundle);
    }
    
    void i(@j0 final s.c n) {
        this.N = n;
        this.j();
    }
    
    void j() {
        androidx.lifecycle.a0 a0;
        s.c c;
        if (this.M.ordinal() < this.N.ordinal()) {
            a0 = this.J;
            c = this.M;
        }
        else {
            a0 = this.J;
            c = this.N;
        }
        a0.q(c);
    }
    
    private static class b extends a
    {
        b(@j0 final c c, @k0 final Bundle bundle) {
            super(c, bundle);
        }
        
        @j0
        @Override
        protected <T extends w0> T d(@j0 final String s, @j0 final Class<T> clazz, @j0 final r0 r0) {
            return (T)new q.c(r0);
        }
    }
    
    private static class c extends w0
    {
        private r0 a;
        
        c(final r0 a) {
            this.a = a;
        }
        
        public r0 a() {
            return this.a;
        }
    }
}
