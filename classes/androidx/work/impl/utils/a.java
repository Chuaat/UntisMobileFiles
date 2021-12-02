// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import androidx.work.u;
import androidx.work.impl.e;
import androidx.work.impl.model.b;
import androidx.work.impl.model.s;
import java.util.Collection;
import androidx.work.c0;
import java.util.LinkedList;
import java.util.UUID;
import androidx.annotation.c1;
import java.util.Iterator;
import androidx.work.impl.WorkDatabase;
import androidx.annotation.j0;
import androidx.work.impl.j;
import androidx.work.impl.c;
import androidx.annotation.t0;

@t0({ t0.a.H })
public abstract class a implements Runnable
{
    private final c G;
    
    public a() {
        this.G = new c();
    }
    
    public static a b(@j0 final j j) {
        return new a() {
            @c1
            @Override
            void i() {
                final WorkDatabase m = j.M();
                m.e();
                try {
                    final Iterator<String> iterator = m.U().p().iterator();
                    while (iterator.hasNext()) {
                        this.a(j, iterator.next());
                    }
                    new f(j.M()).e(System.currentTimeMillis());
                    m.I();
                }
                finally {
                    m.k();
                }
            }
        };
    }
    
    public static a c(@j0 final UUID uuid, @j0 final j j) {
        return new a() {
            @c1
            @Override
            void i() {
                final WorkDatabase m = j.M();
                m.e();
                try {
                    this.a(j, uuid.toString());
                    m.I();
                    m.k();
                    this.h(j);
                }
                finally {
                    m.k();
                }
            }
        };
    }
    
    public static a d(@j0 final String s, @j0 final j j, final boolean b) {
        return new a() {
            @c1
            @Override
            void i() {
                final WorkDatabase m = j.M();
                m.e();
                try {
                    final Iterator<String> iterator = m.U().q(s).iterator();
                    while (iterator.hasNext()) {
                        this.a(j, iterator.next());
                    }
                    m.I();
                    m.k();
                    if (b) {
                        this.h(j);
                    }
                }
                finally {
                    m.k();
                }
            }
        };
    }
    
    public static a e(@j0 final String s, @j0 final j j) {
        return new a() {
            @c1
            @Override
            void i() {
                final WorkDatabase m = j.M();
                m.e();
                try {
                    final Iterator<String> iterator = m.U().y(s).iterator();
                    while (iterator.hasNext()) {
                        this.a(j, iterator.next());
                    }
                    m.I();
                    m.k();
                    this.h(j);
                }
                finally {
                    m.k();
                }
            }
        };
    }
    
    private void g(final WorkDatabase workDatabase, final String e) {
        final s u = workDatabase.U();
        final b l = workDatabase.L();
        final LinkedList<String> list = new LinkedList<String>();
        list.add(e);
        while (!list.isEmpty()) {
            final String s = list.remove();
            final c0.a s2 = u.s(s);
            if (s2 != c0.a.I && s2 != c0.a.J) {
                u.a(c0.a.L, s);
            }
            list.addAll(l.b(s));
        }
    }
    
    void a(final j j, final String s) {
        this.g(j.M(), s);
        j.J().m(s);
        final Iterator<e> iterator = j.L().iterator();
        while (iterator.hasNext()) {
            iterator.next().e(s);
        }
    }
    
    public u f() {
        return this.G;
    }
    
    void h(final j j) {
        androidx.work.impl.f.b(j.F(), j.M(), j.L());
    }
    
    abstract void i();
    
    @Override
    public void run() {
        try {
            this.i();
            this.G.b((u.b)u.a);
        }
        finally {
            final Throwable t;
            this.G.b((u.b)new u.b.a(t));
        }
    }
}
