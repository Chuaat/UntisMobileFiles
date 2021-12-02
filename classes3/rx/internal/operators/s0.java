// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.subscriptions.e;
import java.util.Iterator;
import rx.h;
import rx.exceptions.c;
import java.util.ArrayList;
import rx.o;
import java.util.Map;
import rx.subscriptions.b;
import java.util.HashMap;
import rx.n;
import rx.functions.q;
import rx.functions.p;
import rx.g;

public final class s0<TLeft, TRight, TLeftDuration, TRightDuration, R> implements g.a<R>
{
    final g<TLeft> G;
    final g<TRight> H;
    final p<TLeft, g<TLeftDuration>> I;
    final p<TRight, g<TRightDuration>> J;
    final q<TLeft, TRight, R> K;
    
    public s0(final g<TLeft> g, final g<TRight> h, final p<TLeft, g<TLeftDuration>> i, final p<TRight, g<TRightDuration>> j, final q<TLeft, TRight, R> k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void a(final n<? super R> n) {
        new a(new rx.observers.g<Object>(n)).b();
    }
    
    final class a extends HashMap<Integer, TLeft>
    {
        private static final long O = 3491669543549085380L;
        final rx.subscriptions.b G;
        final n<? super R> H;
        boolean I;
        int J;
        boolean K;
        int L;
        final Map<Integer, TRight> M;
        final /* synthetic */ s0 N;
        
        public a(final n<? super R> h) {
            this.H = h;
            this.G = new rx.subscriptions.b();
            this.M = new HashMap<Integer, TRight>();
        }
        
        HashMap<Integer, TLeft> a() {
            return this;
        }
        
        public void b() {
            this.H.r(this.G);
            final s0.a.a a = new s0.a.a();
            final b b = new b();
            this.G.a(a);
            this.G.a(b);
            s0.this.G.R6(a);
            s0.this.H.R6(b);
        }
        
        final class a extends n<TLeft>
        {
            @Override
            public void b(final Throwable t) {
                s0.a.this.H.b(t);
                s0.a.this.H.i();
            }
            
            @Override
            public void c() {
                s0.a a = s0.a.this;
                synchronized (a) {
                    final s0.a l = s0.a.this;
                    final boolean b = true;
                    l.I = true;
                    int n = b ? 1 : 0;
                    if (!l.K) {
                        if (l.a().isEmpty()) {
                            n = (b ? 1 : 0);
                        }
                        else {
                            n = 0;
                        }
                    }
                    // monitorexit(a)
                    a = s0.a.this;
                    if (n != 0) {
                        a.H.c();
                        s0.a.this.H.i();
                    }
                    else {
                        a.G.e(this);
                    }
                }
            }
            
            @Override
            public void m(final TLeft value) {
                Object o = s0.a.this;
                synchronized (o) {
                    final s0.a l = s0.a.this;
                    final int i = l.J++;
                    l.a().put(i, value);
                    final s0.a j = s0.a.this;
                    final int k = j.L;
                    // monitorexit(o)
                    try {
                        final g<TLeftDuration> g = j.N.I.h(value);
                        o = new s0.a.a.a(i);
                        s0.a.this.G.a((o)o);
                        g.R6((n<? super TLeftDuration>)o);
                        final ArrayList<TRight> list = new ArrayList<TRight>();
                        o = s0.a.this;
                        synchronized (o) {
                            for (final Map.Entry<Integer, TRight> entry : s0.a.this.M.entrySet()) {
                                if (entry.getKey() < k) {
                                    list.add(entry.getValue());
                                }
                            }
                            // monitorexit(o)
                            o = list.iterator();
                            while (((Iterator)o).hasNext()) {
                                s0.a.this.H.m((Object)s0.this.K.s(value, ((Iterator<TRight>)o).next()));
                            }
                        }
                    }
                    finally {
                        final Throwable t;
                        rx.exceptions.c.f(t, this);
                    }
                }
            }
            
            protected void w(int i, final o o) {
                synchronized (s0.a.this) {
                    if (s0.a.this.a().remove(i) != null && s0.a.this.a().isEmpty() && s0.a.this.I) {
                        i = 1;
                    }
                    else {
                        i = 0;
                    }
                    // monitorexit(this.L)
                    if (i != 0) {
                        s0.a.this.H.c();
                        s0.a.this.H.i();
                    }
                    else {
                        s0.a.this.G.e(o);
                    }
                }
            }
            
            final class a extends n<TLeftDuration>
            {
                final int L;
                boolean M;
                
                public a(final int l) {
                    this.M = true;
                    this.L = l;
                }
                
                @Override
                public void b(final Throwable t) {
                    s0.a.a.this.b(t);
                }
                
                @Override
                public void c() {
                    if (this.M) {
                        this.M = false;
                        s0.a.a.this.w(this.L, this);
                    }
                }
                
                @Override
                public void m(final TLeftDuration tLeftDuration) {
                    this.c();
                }
            }
        }
        
        final class b extends n<TRight>
        {
            @Override
            public void b(final Throwable t) {
                s0.a.this.H.b(t);
                s0.a.this.H.i();
            }
            
            @Override
            public void c() {
                s0.a a = s0.a.this;
                synchronized (a) {
                    final s0.a l = s0.a.this;
                    final boolean b = true;
                    l.K = true;
                    int n = b ? 1 : 0;
                    if (!l.I) {
                        if (l.M.isEmpty()) {
                            n = (b ? 1 : 0);
                        }
                        else {
                            n = 0;
                        }
                    }
                    // monitorexit(a)
                    a = s0.a.this;
                    if (n != 0) {
                        a.H.c();
                        s0.a.this.H.i();
                    }
                    else {
                        a.G.e(this);
                    }
                }
            }
            
            @Override
            public void m(final TRight tRight) {
                Object o = s0.a.this;
                synchronized (o) {
                    final s0.a l = s0.a.this;
                    final int i = l.L++;
                    l.M.put(i, tRight);
                    final int j = s0.a.this.J;
                    // monitorexit(o)
                    o = new e();
                    s0.a.this.G.a((o)o);
                    try {
                        o = s0.this.J.h(tRight);
                        final a a = new a(i);
                        s0.a.this.G.a(a);
                        ((g<Object>)o).R6((n<? super Object>)a);
                        final ArrayList<TLeft> list = new ArrayList<TLeft>();
                        o = s0.a.this;
                        synchronized (o) {
                            for (final Map.Entry<Integer, TLeft> entry : s0.a.this.a().entrySet()) {
                                if (entry.getKey() < j) {
                                    list.add(entry.getValue());
                                }
                            }
                            // monitorexit(o)
                            o = list.iterator();
                            while (((Iterator)o).hasNext()) {
                                s0.a.this.H.m((Object)s0.this.K.s(((Iterator<TLeft>)o).next(), tRight));
                            }
                        }
                    }
                    finally {
                        final Throwable t;
                        rx.exceptions.c.f(t, this);
                    }
                }
            }
            
            void w(int i, final o o) {
                synchronized (s0.a.this) {
                    if (s0.a.this.M.remove(i) != null && s0.a.this.M.isEmpty() && s0.a.this.K) {
                        i = 1;
                    }
                    else {
                        i = 0;
                    }
                    // monitorexit(this.L)
                    if (i != 0) {
                        s0.a.this.H.c();
                        s0.a.this.H.i();
                    }
                    else {
                        s0.a.this.G.e(o);
                    }
                }
            }
            
            final class a extends n<TRightDuration>
            {
                final int L;
                boolean M;
                
                public a(final int l) {
                    this.M = true;
                    this.L = l;
                }
                
                @Override
                public void b(final Throwable t) {
                    b.this.b(t);
                }
                
                @Override
                public void c() {
                    if (this.M) {
                        this.M = false;
                        b.this.w(this.L, this);
                    }
                }
                
                @Override
                public void m(final TRightDuration tRightDuration) {
                    this.c();
                }
            }
        }
    }
}
