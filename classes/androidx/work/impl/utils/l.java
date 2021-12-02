// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import androidx.annotation.c1;
import x2.a;
import androidx.work.e0;
import java.util.UUID;
import androidx.work.impl.model.r;
import androidx.work.c0;
import java.util.List;
import androidx.annotation.j0;
import androidx.work.impl.j;
import androidx.work.impl.utils.futures.c;
import androidx.annotation.t0;

@t0({ t0.a.H })
public abstract class l<T> implements Runnable
{
    private final c<T> G;
    
    public l() {
        this.G = c.v();
    }
    
    @j0
    public static l<List<c0>> a(@j0 final j j, @j0 final List<String> list) {
        return new l<List<c0>>() {
            public List<c0> h() {
                return r.t.apply(j.M().U().D(list));
            }
        };
    }
    
    @j0
    public static l<List<c0>> b(@j0 final j j, @j0 final String s) {
        return new l<List<c0>>() {
            List<c0> h() {
                return r.t.apply(j.M().U().v(s));
            }
        };
    }
    
    @j0
    public static l<c0> c(@j0 final j j, @j0 final UUID uuid) {
        return new l<c0>() {
            c0 h() {
                final r.c r = j.M().U().r(uuid.toString());
                c0 a;
                if (r != null) {
                    a = r.a();
                }
                else {
                    a = null;
                }
                return a;
            }
        };
    }
    
    @j0
    public static l<List<c0>> d(@j0 final j j, @j0 final String s) {
        return new l<List<c0>>() {
            List<c0> h() {
                return r.t.apply(j.M().U().C(s));
            }
        };
    }
    
    @j0
    public static l<List<c0>> e(@j0 final j j, @j0 final e0 e0) {
        return new l<List<c0>>() {
            List<c0> h() {
                return r.t.apply(j.M().Q().a(i.b(e0)));
            }
        };
    }
    
    @j0
    public a<T> f() {
        return this.G;
    }
    
    @c1
    abstract T g();
    
    @Override
    public void run() {
        try {
            this.G.q(this.g());
        }
        finally {
            final Throwable t;
            this.G.r(t);
        }
    }
}
