// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import android.view.View;
import android.content.Context;
import java.util.Iterator;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.annotation.j0;
import java.util.concurrent.CopyOnWriteArrayList;

class k
{
    @j0
    private final CopyOnWriteArrayList<a> a;
    @j0
    private final FragmentManager b;
    
    k(@j0 final FragmentManager b) {
        this.a = new CopyOnWriteArrayList<a>();
        this.b = b;
    }
    
    void a(@j0 final Fragment fragment, @k0 final Bundle bundle, final boolean b) {
        final Fragment k0 = this.b.K0();
        if (k0 != null) {
            k0.getParentFragmentManager().J0().a(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.a(this.b, fragment, bundle);
            }
        }
    }
    
    void b(@j0 final Fragment fragment, final boolean b) {
        final Context f = this.b.H0().f();
        final Fragment k0 = this.b.K0();
        if (k0 != null) {
            k0.getParentFragmentManager().J0().b(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.b(this.b, fragment, f);
            }
        }
    }
    
    void c(@j0 final Fragment fragment, @k0 final Bundle bundle, final boolean b) {
        final Fragment k0 = this.b.K0();
        if (k0 != null) {
            k0.getParentFragmentManager().J0().c(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.c(this.b, fragment, bundle);
            }
        }
    }
    
    void d(@j0 final Fragment fragment, final boolean b) {
        final Fragment k0 = this.b.K0();
        if (k0 != null) {
            k0.getParentFragmentManager().J0().d(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.d(this.b, fragment);
            }
        }
    }
    
    void e(@j0 final Fragment fragment, final boolean b) {
        final Fragment k0 = this.b.K0();
        if (k0 != null) {
            k0.getParentFragmentManager().J0().e(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.e(this.b, fragment);
            }
        }
    }
    
    void f(@j0 final Fragment fragment, final boolean b) {
        final Fragment k0 = this.b.K0();
        if (k0 != null) {
            k0.getParentFragmentManager().J0().f(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.f(this.b, fragment);
            }
        }
    }
    
    void g(@j0 final Fragment fragment, final boolean b) {
        final Context f = this.b.H0().f();
        final Fragment k0 = this.b.K0();
        if (k0 != null) {
            k0.getParentFragmentManager().J0().g(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.g(this.b, fragment, f);
            }
        }
    }
    
    void h(@j0 final Fragment fragment, @k0 final Bundle bundle, final boolean b) {
        final Fragment k0 = this.b.K0();
        if (k0 != null) {
            k0.getParentFragmentManager().J0().h(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.h(this.b, fragment, bundle);
            }
        }
    }
    
    void i(@j0 final Fragment fragment, final boolean b) {
        final Fragment k0 = this.b.K0();
        if (k0 != null) {
            k0.getParentFragmentManager().J0().i(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.i(this.b, fragment);
            }
        }
    }
    
    void j(@j0 final Fragment fragment, @j0 final Bundle bundle, final boolean b) {
        final Fragment k0 = this.b.K0();
        if (k0 != null) {
            k0.getParentFragmentManager().J0().j(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.j(this.b, fragment, bundle);
            }
        }
    }
    
    void k(@j0 final Fragment fragment, final boolean b) {
        final Fragment k0 = this.b.K0();
        if (k0 != null) {
            k0.getParentFragmentManager().J0().k(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.k(this.b, fragment);
            }
        }
    }
    
    void l(@j0 final Fragment fragment, final boolean b) {
        final Fragment k0 = this.b.K0();
        if (k0 != null) {
            k0.getParentFragmentManager().J0().l(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.l(this.b, fragment);
            }
        }
    }
    
    void m(@j0 final Fragment fragment, @j0 final View view, @k0 final Bundle bundle, final boolean b) {
        final Fragment k0 = this.b.K0();
        if (k0 != null) {
            k0.getParentFragmentManager().J0().m(fragment, view, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.m(this.b, fragment, view, bundle);
            }
        }
    }
    
    void n(@j0 final Fragment fragment, final boolean b) {
        final Fragment k0 = this.b.K0();
        if (k0 != null) {
            k0.getParentFragmentManager().J0().n(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.n(this.b, fragment);
            }
        }
    }
    
    public void o(@j0 final FragmentManager.m m, final boolean b) {
        this.a.add(new a(m, b));
    }
    
    public void p(@j0 final FragmentManager.m m) {
        final CopyOnWriteArrayList<a> a = this.a;
        // monitorenter(a)
        int i = 0;
        try {
            while (i < this.a.size()) {
                if (this.a.get(i).a == m) {
                    this.a.remove(i);
                    break;
                }
                ++i;
            }
        }
        finally {
        }
        // monitorexit(a)
    }
    
    private static final class a
    {
        @j0
        final FragmentManager.m a;
        final boolean b;
        
        a(@j0 final FragmentManager.m a, final boolean b) {
            this.a = a;
            this.b = b;
        }
    }
}
