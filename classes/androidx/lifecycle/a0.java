// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.g0;
import androidx.annotation.k0;
import androidx.arch.core.internal.b;
import android.annotation.SuppressLint;
import androidx.annotation.b1;
import java.util.Iterator;
import java.util.Map;
import androidx.annotation.j0;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import androidx.arch.core.internal.a;

public class a0 extends s
{
    private androidx.arch.core.internal.a<x, a> b;
    private c c;
    private final WeakReference<y> d;
    private int e;
    private boolean f;
    private boolean g;
    private ArrayList<c> h;
    private final boolean i;
    
    public a0(@j0 final y y) {
        this(y, true);
    }
    
    private a0(@j0 final y referent, final boolean i) {
        this.b = new androidx.arch.core.internal.a<x, a>();
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = new ArrayList<c>();
        this.d = new WeakReference<y>(referent);
        this.c = s.c.H;
        this.i = i;
    }
    
    private void d(final y y) {
        final Iterator<Map.Entry<x, a>> descendingIterator = (Iterator<Map.Entry<x, a>>)this.b.descendingIterator();
        while (descendingIterator.hasNext() && !this.g) {
            final Map.Entry<x, a> entry = descendingIterator.next();
            final a a = entry.getValue();
            while (a.a.compareTo(this.c) > 0 && !this.g && this.b.contains(entry.getKey())) {
                final b b = s.b.b(a.a);
                if (b == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("no event down from ");
                    sb.append(a.a);
                    throw new IllegalStateException(sb.toString());
                }
                this.p(b.f());
                a.a(y, b);
                this.o();
            }
        }
    }
    
    private c e(final x x) {
        final Map.Entry<x, a> n = this.b.n(x);
        c c = null;
        c a;
        if (n != null) {
            a = n.getValue().a;
        }
        else {
            a = null;
        }
        if (!this.h.isEmpty()) {
            final ArrayList<c> h = this.h;
            c = h.get(h.size() - 1);
        }
        return m(m(this.c, a), c);
    }
    
    @b1
    @j0
    public static a0 f(@j0 final y y) {
        return new a0(y, false);
    }
    
    @SuppressLint({ "RestrictedApi" })
    private void g(final String str) {
        if (this.i && !androidx.arch.core.executor.a.f().c()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(str);
            sb.append(" must be called on the main thread");
            throw new IllegalStateException(sb.toString());
        }
    }
    
    private void h(final y y) {
        final androidx.arch.core.internal.b.d h = this.b.h();
        while (h.hasNext() && !this.g) {
            final Map.Entry<K, a> entry = ((Iterator<Map.Entry<K, a>>)h).next();
            final a a = entry.getValue();
            while (a.a.compareTo(this.c) < 0 && !this.g && this.b.contains((x)entry.getKey())) {
                this.p(a.a);
                final b g = s.b.g(a.a);
                if (g == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("no event up from ");
                    sb.append(a.a);
                    throw new IllegalStateException(sb.toString());
                }
                a.a(y, g);
                this.o();
            }
        }
    }
    
    private boolean k() {
        final int size = this.b.size();
        boolean b = true;
        if (size == 0) {
            return true;
        }
        final c a = this.b.b().getValue().a;
        final c a2 = this.b.i().getValue().a;
        if (a != a2 || this.c != a2) {
            b = false;
        }
        return b;
    }
    
    static c m(@j0 final c o, @k0 final c c) {
        c c2 = o;
        if (c != null) {
            c2 = o;
            if (c.compareTo(o) < 0) {
                c2 = c;
            }
        }
        return c2;
    }
    
    private void n(final c c) {
        if (this.c == c) {
            return;
        }
        this.c = c;
        if (!this.f && this.e == 0) {
            this.f = true;
            this.r();
            this.f = false;
            return;
        }
        this.g = true;
    }
    
    private void o() {
        final ArrayList<c> h = this.h;
        h.remove(h.size() - 1);
    }
    
    private void p(final c e) {
        this.h.add(e);
    }
    
    private void r() {
        final y y = this.d.get();
        if (y != null) {
            while (true) {
                final boolean k = this.k();
                this.g = false;
                if (k) {
                    break;
                }
                if (this.c.compareTo(this.b.b().getValue().a) < 0) {
                    this.d(y);
                }
                final Map.Entry<x, a> i = this.b.i();
                if (this.g || i == null || this.c.compareTo(i.getValue().a) <= 0) {
                    continue;
                }
                this.h(y);
            }
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }
    
    @Override
    public void a(@j0 final x x) {
        this.g("addObserver");
        final c c = this.c;
        c c2 = s.c.G;
        if (c != c2) {
            c2 = s.c.H;
        }
        final a a = new a(x, c2);
        if (this.b.l(x, a) != null) {
            return;
        }
        final y y = this.d.get();
        if (y == null) {
            return;
        }
        final boolean b = this.e != 0 || this.f;
        c o = this.e(x);
        ++this.e;
        while (a.a.compareTo(o) < 0 && this.b.contains(x)) {
            this.p(a.a);
            final b g = s.b.g(a.a);
            if (g == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("no event up from ");
                sb.append(a.a);
                throw new IllegalStateException(sb.toString());
            }
            a.a(y, g);
            this.o();
            o = this.e(x);
        }
        if (!b) {
            this.r();
        }
        --this.e;
    }
    
    @j0
    @Override
    public c b() {
        return this.c;
    }
    
    @Override
    public void c(@j0 final x x) {
        this.g("removeObserver");
        this.b.m(x);
    }
    
    public int i() {
        this.g("getObserverCount");
        return this.b.size();
    }
    
    public void j(@j0 final b b) {
        this.g("handleLifecycleEvent");
        this.n(b.f());
    }
    
    @Deprecated
    @g0
    public void l(@j0 final c c) {
        this.g("markState");
        this.q(c);
    }
    
    @g0
    public void q(@j0 final c c) {
        this.g("setCurrentState");
        this.n(c);
    }
    
    static class a
    {
        c a;
        v b;
        
        a(final x x, final c a) {
            this.b = Lifecycling.g(x);
            this.a = a;
        }
        
        void a(final y y, final b b) {
            final c f = b.f();
            this.a = a0.m(this.a, f);
            this.b.h(y, b);
            this.a = f;
        }
    }
}
