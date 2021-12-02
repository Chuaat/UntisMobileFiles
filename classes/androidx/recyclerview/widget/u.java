// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import androidx.annotation.k0;
import java.util.List;
import androidx.annotation.j0;

public abstract class u<T, VH extends g0> extends h<VH>
{
    final d<T> a;
    private final d.b<T> b;
    
    protected u(@j0 final c<T> c) {
        final d.b<T> b = new d.b<T>() {
            @Override
            public void a(@j0 final List<T> list, @j0 final List<T> list2) {
                u.this.j(list, list2);
            }
        };
        this.b = b;
        (this.a = new d<T>(new b(this), c)).a((d.b<T>)b);
    }
    
    protected u(@j0 final androidx.recyclerview.widget.k.f<T> f) {
        final d.b<T> b = new d.b<T>() {
            @Override
            public void a(@j0 final List<T> list, @j0 final List<T> list2) {
                u.this.j(list, list2);
            }
        };
        this.b = b;
        (this.a = new d<T>(new b(this), new androidx.recyclerview.widget.c.a<T>(f).a())).a((d.b<T>)b);
    }
    
    @Override
    public int getItemCount() {
        return this.a.b().size();
    }
    
    @j0
    public List<T> h() {
        return this.a.b();
    }
    
    protected T i(final int n) {
        return this.a.b().get(n);
    }
    
    public void j(@j0 final List<T> list, @j0 final List<T> list2) {
    }
    
    public void k(@k0 final List<T> list, @k0 final Runnable runnable) {
        this.a.g(list, runnable);
    }
    
    public void submitList(@k0 final List<T> list) {
        this.a.f(list);
    }
}
