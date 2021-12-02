// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import java.util.Arrays;
import android.annotation.SuppressLint;
import java.util.concurrent.TimeUnit;
import androidx.core.os.t;
import androidx.annotation.k0;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

final class n implements Runnable
{
    static final ThreadLocal<n> K;
    static Comparator<c> L;
    ArrayList<RecyclerView> G;
    long H;
    long I;
    private ArrayList<c> J;
    
    static {
        K = new ThreadLocal<n>();
        n.L = new Comparator<c>() {
            public int a(final c c, final c c2) {
                final RecyclerView d = c.d;
                final int n = 1;
                final int n2 = 1;
                if (d == null != (c2.d == null)) {
                    int n3;
                    if (d == null) {
                        n3 = n2;
                    }
                    else {
                        n3 = -1;
                    }
                    return n3;
                }
                final boolean a = c.a;
                if (a != c2.a) {
                    int n4 = n;
                    if (a) {
                        n4 = -1;
                    }
                    return n4;
                }
                final int n5 = c2.b - c.b;
                if (n5 != 0) {
                    return n5;
                }
                final int n6 = c.c - c2.c;
                if (n6 != 0) {
                    return n6;
                }
                return 0;
            }
        };
    }
    
    n() {
        this.G = new ArrayList<RecyclerView>();
        this.J = new ArrayList<c>();
    }
    
    private void b() {
        final int size = this.G.size();
        int i = 0;
        int minCapacity = 0;
        while (i < size) {
            final RecyclerView recyclerView = this.G.get(i);
            int n = minCapacity;
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.N0.c(recyclerView, false);
                n = minCapacity + recyclerView.N0.d;
            }
            ++i;
            minCapacity = n;
        }
        this.J.ensureCapacity(minCapacity);
        int j = 0;
        int index = 0;
        while (j < size) {
            final RecyclerView d = this.G.get(j);
            int n2;
            if (d.getWindowVisibility() != 0) {
                n2 = index;
            }
            else {
                final b n3 = d.N0;
                final int b = Math.abs(n3.a) + Math.abs(n3.b);
                int n4 = 0;
                while (true) {
                    n2 = index;
                    if (n4 >= n3.d * 2) {
                        break;
                    }
                    c e;
                    if (index >= this.J.size()) {
                        e = new c();
                        this.J.add(e);
                    }
                    else {
                        e = this.J.get(index);
                    }
                    final int[] c = n3.c;
                    final int c2 = c[n4 + 1];
                    e.a = (c2 <= b);
                    e.b = b;
                    e.c = c2;
                    e.d = d;
                    e.e = c[n4];
                    ++index;
                    n4 += 2;
                }
            }
            ++j;
            index = n2;
        }
        Collections.sort(this.J, n.L);
    }
    
    private void c(final c c, final long n) {
        long n2;
        if (c.a) {
            n2 = Long.MAX_VALUE;
        }
        else {
            n2 = n;
        }
        final RecyclerView.g0 i = this.i(c.d, c.e, n2);
        if (i != null && i.mNestedRecyclerView != null && i.isBound() && !i.isInvalid()) {
            this.h((RecyclerView)i.mNestedRecyclerView.get(), n);
        }
    }
    
    private void d(final long n) {
        for (int i = 0; i < this.J.size(); ++i) {
            final c c = this.J.get(i);
            if (c.d == null) {
                break;
            }
            this.c(c, n);
            c.a();
        }
    }
    
    static boolean e(final RecyclerView recyclerView, final int n) {
        for (int j = recyclerView.K.j(), i = 0; i < j; ++i) {
            final RecyclerView.g0 u0 = RecyclerView.u0(recyclerView.K.i(i));
            if (u0.mPosition == n && !u0.isInvalid()) {
                return true;
            }
        }
        return false;
    }
    
    private void h(@k0 final RecyclerView recyclerView, final long n) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.n0 && recyclerView.K.j() != 0) {
            recyclerView.q1();
        }
        final b n2 = recyclerView.N0;
        n2.c(recyclerView, true);
        if (n2.d != 0) {
            try {
                t.b("RV Nested Prefetch");
                recyclerView.O0.k(recyclerView.R);
                for (int i = 0; i < n2.d * 2; i += 2) {
                    this.i(recyclerView, n2.c[i], n);
                }
            }
            finally {
                t.d();
            }
        }
    }
    
    private RecyclerView.g0 i(final RecyclerView recyclerView, final int n, final long n2) {
        if (e(recyclerView, n)) {
            return null;
        }
        final RecyclerView.x h = recyclerView.H;
        try {
            recyclerView.c1();
            final RecyclerView.g0 j = h.J(n, false, n2);
            if (j != null) {
                if (j.isBound() && !j.isInvalid()) {
                    h.C(j.itemView);
                }
                else {
                    h.a(j, false);
                }
            }
            return j;
        }
        finally {
            recyclerView.e1(false);
        }
    }
    
    public void a(final RecyclerView e) {
        this.G.add(e);
    }
    
    void f(final RecyclerView recyclerView, final int n, final int n2) {
        if (recyclerView.isAttachedToWindow() && this.H == 0L) {
            this.H = recyclerView.getNanoTime();
            recyclerView.post((Runnable)this);
        }
        recyclerView.N0.e(n, n2);
    }
    
    void g(final long n) {
        this.b();
        this.d(n);
    }
    
    public void j(final RecyclerView o) {
        this.G.remove(o);
    }
    
    @Override
    public void run() {
        try {
            t.b("RV Prefetch");
            if (!this.G.isEmpty()) {
                final int size = this.G.size();
                int i = 0;
                long n = 0L;
                while (i < size) {
                    final RecyclerView recyclerView = this.G.get(i);
                    long max = n;
                    if (recyclerView.getWindowVisibility() == 0) {
                        max = Math.max(recyclerView.getDrawingTime(), n);
                    }
                    ++i;
                    n = max;
                }
                if (n != 0L) {
                    this.g(TimeUnit.MILLISECONDS.toNanos(n) + this.I);
                }
            }
        }
        finally {
            this.H = 0L;
            t.d();
        }
    }
    
    @SuppressLint({ "VisibleForTests" })
    static class b implements p.c
    {
        int a;
        int b;
        int[] c;
        int d;
        
        @Override
        public void a(final int n, final int n2) {
            if (n < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (n2 >= 0) {
                final int n3 = this.d * 2;
                final int[] c = this.c;
                if (c == null) {
                    Arrays.fill(this.c = new int[4], -1);
                }
                else if (n3 >= c.length) {
                    System.arraycopy(c, 0, this.c = new int[n3 * 2], 0, c.length);
                }
                final int[] c2 = this.c;
                c2[n3] = n;
                c2[n3 + 1] = n2;
                ++this.d;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        
        void b() {
            final int[] c = this.c;
            if (c != null) {
                Arrays.fill(c, -1);
            }
            this.d = 0;
        }
        
        void c(final RecyclerView recyclerView, final boolean n) {
            this.d = 0;
            final int[] c = this.c;
            if (c != null) {
                Arrays.fill(c, -1);
            }
            final RecyclerView.p s = recyclerView.S;
            if (recyclerView.R != null && s != null && s.I0()) {
                if (n) {
                    if (!recyclerView.J.q()) {
                        s.s(recyclerView.R.getItemCount(), (RecyclerView.p.c)this);
                    }
                }
                else if (!recyclerView.D0()) {
                    s.r(this.a, this.b, recyclerView.O0, (RecyclerView.p.c)this);
                }
                final int d = this.d;
                if (d > s.m) {
                    s.m = d;
                    s.n = n;
                    recyclerView.H.L();
                }
            }
        }
        
        boolean d(final int n) {
            if (this.c != null) {
                for (int d = this.d, i = 0; i < d * 2; i += 2) {
                    if (this.c[i] == n) {
                        return true;
                    }
                }
            }
            return false;
        }
        
        void e(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    static class c
    {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;
        
        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }
}
