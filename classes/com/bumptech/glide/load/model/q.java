// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import com.bumptech.glide.load.a;
import java.util.Collection;
import com.bumptech.glide.util.k;
import androidx.annotation.k0;
import com.bumptech.glide.h;
import java.util.Arrays;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import com.bumptech.glide.load.j;
import java.util.Iterator;
import androidx.annotation.j0;
import androidx.core.util.m;
import java.util.List;

class q<Model, Data> implements n<Model, Data>
{
    private final List<n<Model, Data>> a;
    private final m.a<List<Throwable>> b;
    
    q(@j0 final List<n<Model, Data>> a, @j0 final m.a<List<Throwable>> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean a(@j0 final Model model) {
        final Iterator<n<Model, Data>> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().a(model)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public n.a<Data> b(@j0 final Model model, final int n, final int n2, @j0 final j j) {
        final int size = this.a.size();
        final ArrayList list = new ArrayList<d<Data>>(size);
        final n.a<Data> a = null;
        int i = 0;
        g g = null;
        while (i < size) {
            final n<Model, Data> n3 = this.a.get(i);
            g a2 = g;
            if (n3.a(model)) {
                final n.a<Data> b = n3.b(model, n, n2, j);
                a2 = g;
                if (b != null) {
                    a2 = b.a;
                    list.add((d<Data>)b.c);
                }
            }
            ++i;
            g = a2;
        }
        Object o = a;
        if (!list.isEmpty()) {
            o = a;
            if (g != null) {
                o = new n.a(g, new a<Object>((List<d<Object>>)list, this.b));
            }
        }
        return (n.a<Data>)o;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MultiModelLoader{modelLoaders=");
        sb.append(Arrays.toString(this.a.toArray()));
        sb.append('}');
        return sb.toString();
    }
    
    static class a<Data> implements d<Data>, d.a<Data>
    {
        private final List<d<Data>> G;
        private final m.a<List<Throwable>> H;
        private int I;
        private h J;
        private d.a<? super Data> K;
        @k0
        private List<Throwable> L;
        private boolean M;
        
        a(@j0 final List<d<Data>> g, @j0 final m.a<List<Throwable>> h) {
            this.H = h;
            k.c(g);
            this.G = g;
            this.I = 0;
        }
        
        private void g() {
            if (this.M) {
                return;
            }
            if (this.I < this.G.size() - 1) {
                ++this.I;
                this.e(this.J, this.K);
            }
            else {
                k.d(this.L);
                this.K.c(new com.bumptech.glide.load.engine.q("Fetch failed", new ArrayList<Throwable>(this.L)));
            }
        }
        
        @j0
        @Override
        public Class<Data> a() {
            return this.G.get(0).a();
        }
        
        @Override
        public void b() {
            final List<Throwable> l = this.L;
            if (l != null) {
                this.H.a(l);
            }
            this.L = null;
            final Iterator<d<Data>> iterator = this.G.iterator();
            while (iterator.hasNext()) {
                iterator.next().b();
            }
        }
        
        @Override
        public void c(@j0 final Exception ex) {
            k.d(this.L).add(ex);
            this.g();
        }
        
        @Override
        public void cancel() {
            this.M = true;
            final Iterator<d<Data>> iterator = this.G.iterator();
            while (iterator.hasNext()) {
                iterator.next().cancel();
            }
        }
        
        @j0
        @Override
        public com.bumptech.glide.load.a d() {
            return this.G.get(0).d();
        }
        
        @Override
        public void e(@j0 final h j, @j0 final d.a<? super Data> k) {
            this.J = j;
            this.K = k;
            this.L = this.H.b();
            this.G.get(this.I).e(j, (d.a<? super Data>)this);
            if (this.M) {
                this.cancel();
            }
        }
        
        @Override
        public void f(@k0 final Data data) {
            if (data != null) {
                this.K.f((Object)data);
            }
            else {
                this.g();
            }
        }
    }
}
