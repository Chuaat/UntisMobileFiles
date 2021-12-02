// 
// Decompiled by Procyon v0.5.36
// 

package androidx.coordinatorlayout.widget;

import androidx.annotation.k0;
import java.util.List;
import androidx.annotation.j0;
import java.util.HashSet;
import java.util.ArrayList;
import androidx.core.util.m;
import androidx.annotation.t0;

@t0({ t0.a.G })
public final class a<T>
{
    private final m.a<ArrayList<T>> a;
    private final androidx.collection.m<T, ArrayList<T>> b;
    private final ArrayList<T> c;
    private final HashSet<T> d;
    
    public a() {
        this.a = new m.b<ArrayList<T>>(10);
        this.b = new androidx.collection.m<T, ArrayList<T>>();
        this.c = new ArrayList<T>();
        this.d = new HashSet<T>();
    }
    
    private void e(final T e, final ArrayList<T> list, final HashSet<T> set) {
        if (list.contains(e)) {
            return;
        }
        if (!set.contains(e)) {
            set.add(e);
            final ArrayList<T> list2 = this.b.get(e);
            if (list2 != null) {
                for (int i = 0; i < list2.size(); ++i) {
                    this.e(list2.get(i), list, set);
                }
            }
            set.remove(e);
            list.add(e);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
    
    @j0
    private ArrayList<T> f() {
        ArrayList<T> list;
        if ((list = this.a.b()) == null) {
            list = new ArrayList<T>();
        }
        return list;
    }
    
    private void k(@j0 final ArrayList<T> list) {
        list.clear();
        this.a.a(list);
    }
    
    public void a(@j0 final T t, @j0 final T e) {
        if (this.b.containsKey(t) && this.b.containsKey(e)) {
            ArrayList<T> f;
            if ((f = this.b.get(t)) == null) {
                f = this.f();
                this.b.put(t, f);
            }
            f.add(e);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }
    
    public void b(@j0 final T t) {
        if (!this.b.containsKey(t)) {
            this.b.put(t, null);
        }
    }
    
    public void c() {
        for (int size = this.b.size(), i = 0; i < size; ++i) {
            final ArrayList<T> list = this.b.o(i);
            if (list != null) {
                this.k(list);
            }
        }
        this.b.clear();
    }
    
    public boolean d(@j0 final T t) {
        return this.b.containsKey(t);
    }
    
    @k0
    public List g(@j0 final T t) {
        return this.b.get(t);
    }
    
    @k0
    public List<T> h(@j0 final T o) {
        final int size = this.b.size();
        ArrayList<T> list = null;
        ArrayList<T> list3;
        for (int i = 0; i < size; ++i, list = list3) {
            final ArrayList<T> list2 = this.b.o(i);
            list3 = list;
            if (list2 != null) {
                list3 = list;
                if (list2.contains(o)) {
                    if ((list3 = list) == null) {
                        list3 = new ArrayList<T>();
                    }
                    list3.add(this.b.i(i));
                }
            }
        }
        return list;
    }
    
    @j0
    public ArrayList<T> i() {
        this.c.clear();
        this.d.clear();
        for (int size = this.b.size(), i = 0; i < size; ++i) {
            this.e(this.b.i(i), this.c, this.d);
        }
        return this.c;
    }
    
    public boolean j(@j0 final T o) {
        for (int size = this.b.size(), i = 0; i < size; ++i) {
            final ArrayList<T> list = this.b.o(i);
            if (list != null && list.contains(o)) {
                return true;
            }
        }
        return false;
    }
    
    int l() {
        return this.b.size();
    }
}
