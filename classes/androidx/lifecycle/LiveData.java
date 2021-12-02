// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import java.util.Iterator;
import androidx.annotation.j0;
import java.util.Map;
import androidx.annotation.k0;
import androidx.annotation.g0;
import androidx.arch.core.executor.a;
import androidx.arch.core.internal.b;

public abstract class LiveData<T>
{
    static final int k = -1;
    static final Object l;
    final Object a;
    private androidx.arch.core.internal.b<l0<? super T>, c> b;
    int c;
    private boolean d;
    private volatile Object e;
    volatile Object f;
    private int g;
    private boolean h;
    private boolean i;
    private final Runnable j;
    
    static {
        l = new Object();
    }
    
    public LiveData() {
        this.a = new Object();
        this.b = new androidx.arch.core.internal.b<l0<? super T>, c>();
        this.c = 0;
        final Object l = LiveData.l;
        this.f = l;
        this.j = new Runnable() {
            @Override
            public void run() {
                synchronized (LiveData.this.a) {
                    final Object f = LiveData.this.f;
                    LiveData.this.f = LiveData.l;
                    // monitorexit(this.G.a)
                    LiveData.this.q(f);
                }
            }
        };
        this.e = l;
        this.g = -1;
    }
    
    public LiveData(final T e) {
        this.a = new Object();
        this.b = new androidx.arch.core.internal.b<l0<? super T>, c>();
        this.c = 0;
        this.f = LiveData.l;
        this.j = new Runnable() {
            @Override
            public void run() {
                synchronized (LiveData.this.a) {
                    final Object f = LiveData.this.f;
                    LiveData.this.f = LiveData.l;
                    // monitorexit(this.G.a)
                    LiveData.this.q(f);
                }
            }
        };
        this.e = e;
        this.g = 0;
    }
    
    static void b(final String str) {
        if (a.f().c()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot invoke ");
        sb.append(str);
        sb.append(" on a background thread");
        throw new IllegalStateException(sb.toString());
    }
    
    private void d(final c c) {
        if (!c.H) {
            return;
        }
        if (!c.k()) {
            c.e(false);
            return;
        }
        final int i = c.I;
        final int g = this.g;
        if (i >= g) {
            return;
        }
        c.I = g;
        c.G.a((Object)this.e);
    }
    
    @g0
    void c(int n) {
        int c = this.c;
        this.c = n + c;
        if (this.d) {
            return;
        }
        this.d = true;
        try {
            while (true) {
                final int c2 = this.c;
                if (c == c2) {
                    break;
                }
                if (c == 0 && c2 > 0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                final boolean b = c > 0 && c2 == 0;
                if (n != 0) {
                    this.l();
                }
                else if (b) {
                    this.m();
                }
                c = c2;
            }
        }
        finally {
            this.d = false;
        }
    }
    
    void e(@k0 c c) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        c c2 = c;
        do {
            this.i = false;
            Label_0088: {
                if (c2 != null) {
                    this.d(c2);
                    c = null;
                }
                else {
                    final androidx.arch.core.internal.b.d h = this.b.h();
                    do {
                        c = c2;
                        if (!h.hasNext()) {
                            break Label_0088;
                        }
                        this.d(((Iterator<Map.Entry<K, c>>)h).next().getValue());
                    } while (!this.i);
                    c = c2;
                }
            }
            c2 = c;
        } while (this.i);
        this.h = false;
    }
    
    @k0
    public T f() {
        final Object e = this.e;
        if (e != LiveData.l) {
            return (T)e;
        }
        return null;
    }
    
    int g() {
        return this.g;
    }
    
    public boolean h() {
        return this.c > 0;
    }
    
    public boolean i() {
        return this.b.size() > 0;
    }
    
    @g0
    public void j(@j0 final y y, @j0 final l0<? super T> l0) {
        b("observe");
        if (y.getLifecycle().b() == s.c.G) {
            return;
        }
        final LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(y, l0);
        final c c = this.b.l(l0, (c)lifecycleBoundObserver);
        if (c != null && !c.j(y)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c != null) {
            return;
        }
        y.getLifecycle().a(lifecycleBoundObserver);
    }
    
    @g0
    public void k(@j0 final l0<? super T> l0) {
        b("observeForever");
        final b b = new b(l0);
        final c c = this.b.l(l0, (c)b);
        if (c instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c != null) {
            return;
        }
        ((c)b).e(true);
    }
    
    protected void l() {
    }
    
    protected void m() {
    }
    
    protected void n(final T f) {
        synchronized (this.a) {
            final boolean b = this.f == LiveData.l;
            this.f = f;
            // monitorexit(this.a)
            if (!b) {
                return;
            }
            androidx.arch.core.executor.a.f().d(this.j);
        }
    }
    
    @g0
    public void o(@j0 final l0<? super T> l0) {
        b("removeObserver");
        final c c = this.b.m(l0);
        if (c == null) {
            return;
        }
        c.i();
        c.e(false);
    }
    
    @g0
    public void p(@j0 final y y) {
        b("removeObservers");
        for (final Map.Entry<l0<? super T>, c> entry : this.b) {
            if (entry.getValue().j(y)) {
                this.o(entry.getKey());
            }
        }
    }
    
    @g0
    protected void q(final T e) {
        b("setValue");
        ++this.g;
        this.e = e;
        this.e(null);
    }
    
    class LifecycleBoundObserver extends c implements v
    {
        @j0
        final y K;
        
        LifecycleBoundObserver(final y k, final l0<? super T> l2) {
            super(l2);
            this.K = k;
        }
        
        @Override
        public void h(@j0 final y y, @j0 final s.b b) {
            Enum<s.c> b2 = this.K.getLifecycle().b();
            if (b2 == s.c.G) {
                LiveData.this.o(super.G);
                return;
            }
            s.c b3;
            for (Enum<s.c> enum1 = null; enum1 != b2; enum1 = b2, b2 = b3) {
                ((c)this).e(this.k());
                b3 = this.K.getLifecycle().b();
            }
        }
        
        @Override
        void i() {
            this.K.getLifecycle().c(this);
        }
        
        @Override
        boolean j(final y y) {
            return this.K == y;
        }
        
        @Override
        boolean k() {
            return this.K.getLifecycle().b().b(s.c.J);
        }
    }
    
    private class b extends c
    {
        b(final l0<? super T> l0) {
            super(l0);
        }
        
        @Override
        boolean k() {
            return true;
        }
    }
    
    private abstract class c
    {
        final l0<? super T> G;
        boolean H;
        int I;
        
        c(final l0<? super T> g) {
            this.I = -1;
            this.G = g;
        }
        
        void e(final boolean h) {
            if (h == this.H) {
                return;
            }
            this.H = h;
            final LiveData j = LiveData.this;
            int n;
            if (h) {
                n = 1;
            }
            else {
                n = -1;
            }
            j.c(n);
            if (this.H) {
                LiveData.this.e(this);
            }
        }
        
        void i() {
        }
        
        boolean j(final y y) {
            return false;
        }
        
        abstract boolean k();
    }
}
