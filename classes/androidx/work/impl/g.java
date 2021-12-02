// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl;

import androidx.lifecycle.LiveData;
import androidx.work.impl.utils.l;
import androidx.work.c0;
import x2.a;
import android.text.TextUtils;
import androidx.work.impl.utils.b;
import java.util.Collections;
import androidx.work.o;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.CombineContinuationsWorker;
import androidx.work.s;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import androidx.annotation.k0;
import androidx.annotation.j0;
import androidx.work.q;
import androidx.work.u;
import androidx.work.f0;
import java.util.List;
import androidx.work.k;
import androidx.annotation.t0;
import androidx.work.b0;

@t0({ t0.a.H })
public class g extends b0
{
    private static final String j;
    private final j a;
    private final String b;
    private final k c;
    private final List<? extends f0> d;
    private final List<String> e;
    private final List<String> f;
    private final List<g> g;
    private boolean h;
    private u i;
    
    static {
        j = q.f("WorkContinuationImpl");
    }
    
    public g(@j0 final j j, @k0 final String s, @j0 final k k, @j0 final List<? extends f0> list) {
        this(j, s, k, list, null);
    }
    
    public g(@j0 final j a, @k0 final String b, @j0 final k c, @j0 final List<? extends f0> d, @k0 final List<g> g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = new ArrayList<String>(d.size());
        this.f = new ArrayList<String>();
        if (g != null) {
            final Iterator<g> iterator = g.iterator();
            while (iterator.hasNext()) {
                this.f.addAll(iterator.next().f);
            }
        }
        for (int i = 0; i < d.size(); ++i) {
            final String b2 = ((f0)d.get(i)).b();
            this.e.add(b2);
            this.f.add(b2);
        }
    }
    
    public g(@j0 final j j, @j0 final List<? extends f0> list) {
        this(j, null, k.H, list, null);
    }
    
    @t0({ t0.a.H })
    private static boolean p(@j0 final g g, @j0 final Set<String> set) {
        set.addAll(g.j());
        final Set<String> s = s(g);
        final Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (s.contains(iterator.next())) {
                return true;
            }
        }
        final List<g> l = g.l();
        if (l != null && !l.isEmpty()) {
            final Iterator<g> iterator2 = l.iterator();
            while (iterator2.hasNext()) {
                if (p(iterator2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(g.j());
        return false;
    }
    
    @j0
    @t0({ t0.a.H })
    public static Set<String> s(final g g) {
        final HashSet<Object> set = (HashSet<Object>)new HashSet<String>();
        final List<g> l = g.l();
        if (l != null && !l.isEmpty()) {
            final Iterator<g> iterator = l.iterator();
            while (iterator.hasNext()) {
                set.addAll(iterator.next().j());
            }
        }
        return (Set<String>)set;
    }
    
    @j0
    @Override
    protected b0 b(@j0 final List<b0> list) {
        final s o = ((f0.a<B, s>)new s.a(CombineContinuationsWorker.class).s(ArrayCreatingInputMerger.class)).b();
        final ArrayList<g> list2 = new ArrayList<g>(list.size());
        final Iterator<b0> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add((g)iterator.next());
        }
        return new g(this.a, null, k.H, Collections.singletonList(o), list2);
    }
    
    @j0
    @Override
    public u c() {
        if (!this.h) {
            final b b = new b(this);
            this.a.O().c(b);
            this.i = b.d();
        }
        else {
            q.c().h(androidx.work.impl.g.j, String.format("Already enqueued work ids (%s)", TextUtils.join((CharSequence)", ", (Iterable)this.e)), new Throwable[0]);
        }
        return this.i;
    }
    
    @j0
    @Override
    public a<List<c0>> d() {
        final l<List<c0>> a = l.a(this.a, this.f);
        this.a.O().c(a);
        return a.f();
    }
    
    @j0
    @Override
    public LiveData<List<c0>> e() {
        return this.a.N(this.f);
    }
    
    @j0
    @Override
    public b0 g(@j0 final List<s> list) {
        if (list.isEmpty()) {
            return this;
        }
        return new g(this.a, this.b, k.H, list, Collections.singletonList(this));
    }
    
    public List<String> h() {
        return this.f;
    }
    
    public k i() {
        return this.c;
    }
    
    @j0
    public List<String> j() {
        return this.e;
    }
    
    @k0
    public String k() {
        return this.b;
    }
    
    public List<g> l() {
        return this.g;
    }
    
    @j0
    public List<? extends f0> m() {
        return this.d;
    }
    
    @j0
    public j n() {
        return this.a;
    }
    
    @t0({ t0.a.H })
    public boolean o() {
        return p(this, new HashSet<String>());
    }
    
    public boolean q() {
        return this.h;
    }
    
    public void r() {
        this.h = true;
    }
}
