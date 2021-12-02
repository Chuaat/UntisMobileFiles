// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import androidx.core.os.c;
import androidx.fragment.app.Fragment;
import android.graphics.Rect;
import android.view.ViewGroup;
import java.util.Collection;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.t0;
import android.annotation.SuppressLint;
import androidx.fragment.app.e0;

@SuppressLint({ "RestrictedApi" })
@t0({ t0.a.I })
public class n extends e0
{
    private static boolean C(final g0 g0) {
        return !e0.l(g0.X()) || !e0.l(g0.Y()) || !e0.l(g0.Z());
    }
    
    @Override
    public void A(final Object o, final ArrayList<View> list, final ArrayList<View> list2) {
        final l0 l0 = (l0)o;
        if (l0 != null) {
            l0.a0().clear();
            l0.a0().addAll(list2);
            this.q(l0, list, list2);
        }
    }
    
    @Override
    public Object B(final Object o) {
        if (o == null) {
            return null;
        }
        final l0 l0 = new l0();
        l0.N0((g0)o);
        return l0;
    }
    
    @Override
    public void a(final Object o, final View view) {
        if (o != null) {
            ((g0)o).c(view);
        }
    }
    
    @Override
    public void b(final Object o, final ArrayList<View> list) {
        final g0 g0 = (g0)o;
        if (g0 == null) {
            return;
        }
        final boolean b = g0 instanceof l0;
        final int n = 0;
        int i = 0;
        if (b) {
            for (l0 l0 = (l0)g0; i < l0.R0(); ++i) {
                this.b(l0.Q0(i), list);
            }
        }
        else if (!C(g0) && e0.l(g0.a0())) {
            for (int size = list.size(), j = n; j < size; ++j) {
                g0.c(list.get(j));
            }
        }
    }
    
    @Override
    public void c(final ViewGroup viewGroup, final Object o) {
        j0.b(viewGroup, (g0)o);
    }
    
    @Override
    public boolean e(final Object o) {
        return o instanceof g0;
    }
    
    @Override
    public Object g(final Object o) {
        g0 u;
        if (o != null) {
            u = ((g0)o).u();
        }
        else {
            u = null;
        }
        return u;
    }
    
    @Override
    public Object m(final Object o, Object o2, final Object o3) {
        g0 a1 = (g0)o;
        final g0 g0 = (g0)o2;
        final g0 g2 = (g0)o3;
        if (a1 != null && g0 != null) {
            a1 = new l0().N0(a1).N0(g0).a1(1);
        }
        else if (a1 == null) {
            if (g0 != null) {
                a1 = g0;
            }
            else {
                a1 = null;
            }
        }
        if (g2 != null) {
            o2 = new l0();
            if (a1 != null) {
                ((l0)o2).N0(a1);
            }
            ((l0)o2).N0(g2);
            return o2;
        }
        return a1;
    }
    
    @Override
    public Object n(final Object o, final Object o2, final Object o3) {
        final l0 l0 = new l0();
        if (o != null) {
            l0.N0((g0)o);
        }
        if (o2 != null) {
            l0.N0((g0)o2);
        }
        if (o3 != null) {
            l0.N0((g0)o3);
        }
        return l0;
    }
    
    @Override
    public void p(final Object o, final View view) {
        if (o != null) {
            ((g0)o).r0(view);
        }
    }
    
    @Override
    public void q(final Object o, final ArrayList<View> list, final ArrayList<View> list2) {
        final g0 g0 = (g0)o;
        final boolean b = g0 instanceof l0;
        int i = 0;
        int j = 0;
        if (b) {
            for (l0 l0 = (l0)g0; j < l0.R0(); ++j) {
                this.q(l0.Q0(j), list, list2);
            }
        }
        else if (!C(g0)) {
            final List<View> a0 = g0.a0();
            if (a0.size() == list.size() && a0.containsAll(list)) {
                int size;
                if (list2 == null) {
                    size = 0;
                }
                else {
                    size = list2.size();
                }
                while (i < size) {
                    g0.c(list2.get(i));
                    ++i;
                }
                for (int k = list.size() - 1; k >= 0; --k) {
                    g0.r0(list.get(k));
                }
            }
        }
    }
    
    @Override
    public void r(final Object o, final View view, final ArrayList<View> list) {
        ((g0)o).a((g0.h)new g0.h() {
            @Override
            public void a(@androidx.annotation.j0 final g0 g0) {
                g0.p0((g0.h)this);
                g0.a((g0.h)this);
            }
            
            @Override
            public void b(@androidx.annotation.j0 final g0 g0) {
            }
            
            @Override
            public void c(@androidx.annotation.j0 final g0 g0) {
                g0.p0((g0.h)this);
                view.setVisibility(8);
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((View)list.get(i)).setVisibility(0);
                }
            }
            
            @Override
            public void d(@androidx.annotation.j0 final g0 g0) {
            }
            
            @Override
            public void e(@androidx.annotation.j0 final g0 g0) {
            }
        });
    }
    
    @Override
    public void t(final Object o, final Object o2, final ArrayList<View> list, final Object o3, final ArrayList<View> list2, final Object o4, final ArrayList<View> list3) {
        ((g0)o).a((g0.h)new i0() {
            @Override
            public void a(@androidx.annotation.j0 final g0 g0) {
                final Object a = o2;
                if (a != null) {
                    n.this.q(a, list, null);
                }
                final Object c = o3;
                if (c != null) {
                    n.this.q(c, list2, null);
                }
                final Object e = o4;
                if (e != null) {
                    n.this.q(e, list3, null);
                }
            }
            
            @Override
            public void c(@androidx.annotation.j0 final g0 g0) {
                g0.p0((g0.h)this);
            }
        });
    }
    
    @Override
    public void u(final Object o, final Rect rect) {
        if (o != null) {
            ((g0)o).z0((g0.f)new g0.f() {
                @Override
                public Rect a(@androidx.annotation.j0 final g0 g0) {
                    final Rect a = rect;
                    if (a != null && !a.isEmpty()) {
                        return rect;
                    }
                    return null;
                }
            });
        }
    }
    
    @Override
    public void v(final Object o, final View view) {
        if (view != null) {
            final g0 g0 = (g0)o;
            final Rect rect = new Rect();
            this.k(view, rect);
            g0.z0((g0.f)new g0.f() {
                @Override
                public Rect a(@androidx.annotation.j0 final g0 g0) {
                    return rect;
                }
            });
        }
    }
    
    @Override
    public void w(@androidx.annotation.j0 final Fragment fragment, @androidx.annotation.j0 final Object o, @androidx.annotation.j0 final c c, @androidx.annotation.j0 final Runnable runnable) {
        final g0 g0 = (g0)o;
        c.d((c.a)new c.a() {
            @Override
            public void onCancel() {
                g0.cancel();
            }
        });
        g0.a((g0.h)new g0.h() {
            @Override
            public void a(@androidx.annotation.j0 final g0 g0) {
            }
            
            @Override
            public void b(@androidx.annotation.j0 final g0 g0) {
            }
            
            @Override
            public void c(@androidx.annotation.j0 final g0 g0) {
                runnable.run();
            }
            
            @Override
            public void d(@androidx.annotation.j0 final g0 g0) {
            }
            
            @Override
            public void e(@androidx.annotation.j0 final g0 g0) {
            }
        });
    }
    
    @Override
    public void z(final Object o, final View e, final ArrayList<View> list) {
        final l0 l0 = (l0)o;
        final List<View> a0 = l0.a0();
        a0.clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            e0.d(a0, list.get(i));
        }
        a0.add(e);
        list.add(e);
        this.b(l0, list);
    }
}
