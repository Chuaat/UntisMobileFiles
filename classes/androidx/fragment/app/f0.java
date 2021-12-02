// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import androidx.savedstate.SavedStateRegistry;
import android.content.Context;
import androidx.lifecycle.s0;
import android.app.Application;
import android.content.ContextWrapper;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.lifecycle.y;
import androidx.lifecycle.s;
import androidx.annotation.j0;
import androidx.savedstate.b;
import androidx.lifecycle.a0;
import androidx.lifecycle.z0;
import androidx.lifecycle.c1;
import androidx.lifecycle.d1;
import androidx.savedstate.c;
import androidx.lifecycle.r;

class f0 implements r, c, d1
{
    private final Fragment G;
    private final c1 H;
    private z0.b I;
    private a0 J;
    private b K;
    
    f0(@j0 final Fragment g, @j0 final c1 h) {
        this.J = null;
        this.K = null;
        this.G = g;
        this.H = h;
    }
    
    void a(@j0 final s.b b) {
        this.J.j(b);
    }
    
    void b() {
        if (this.J == null) {
            this.J = new a0(this);
            this.K = b.a(this);
        }
    }
    
    boolean c() {
        return this.J != null;
    }
    
    void d(@k0 final Bundle bundle) {
        this.K.c(bundle);
    }
    
    void e(@j0 final Bundle bundle) {
        this.K.d(bundle);
    }
    
    void f(@j0 final s.c c) {
        this.J.q(c);
    }
    
    @j0
    @Override
    public z0.b getDefaultViewModelProviderFactory() {
        final z0.b defaultViewModelProviderFactory = this.G.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.G.mDefaultFactory)) {
            return this.I = defaultViewModelProviderFactory;
        }
        if (this.I == null) {
            final Application application = null;
            Context context = this.G.requireContext().getApplicationContext();
            Application application2;
            while (true) {
                application2 = application;
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Application) {
                    application2 = (Application)context;
                    break;
                }
                context = ((ContextWrapper)context).getBaseContext();
            }
            this.I = new s0(application2, this, this.G.getArguments());
        }
        return this.I;
    }
    
    @j0
    @Override
    public s getLifecycle() {
        this.b();
        return this.J;
    }
    
    @j0
    @Override
    public SavedStateRegistry getSavedStateRegistry() {
        this.b();
        return this.K.b();
    }
    
    @j0
    @Override
    public c1 getViewModelStore() {
        this.b();
        return this.H;
    }
}
