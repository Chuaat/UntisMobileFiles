// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.g0;
import androidx.annotation.j0;
import androidx.annotation.i;
import java.util.Iterator;
import java.util.Map;
import androidx.arch.core.internal.b;

public class i0<T> extends k0<T>
{
    private androidx.arch.core.internal.b<LiveData<?>, a<?>> m;
    
    public i0() {
        this.m = new androidx.arch.core.internal.b<LiveData<?>, a<?>>();
    }
    
    @i
    @Override
    protected void l() {
        final Iterator<Map.Entry<LiveData<?>, a<?>>> iterator = this.m.iterator();
        while (iterator.hasNext()) {
            ((Map.Entry<K, a>)iterator.next()).getValue().b();
        }
    }
    
    @i
    @Override
    protected void m() {
        final Iterator<Map.Entry<LiveData<?>, a<?>>> iterator = this.m.iterator();
        while (iterator.hasNext()) {
            ((Map.Entry<K, a>)iterator.next()).getValue().c();
        }
    }
    
    @g0
    public <S> void r(@j0 final LiveData<S> liveData, @j0 final l0<? super S> l0) {
        final a<Object> a = new a<Object>((LiveData<Object>)liveData, (l0<? super Object>)l0);
        final a<Object> a2 = this.m.l(liveData, a);
        if (a2 != null && a2.H != l0) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (a2 != null) {
            return;
        }
        if (this.h()) {
            a.b();
        }
    }
    
    @g0
    public <S> void s(@j0 final LiveData<S> liveData) {
        final a<?> a = this.m.m(liveData);
        if (a != null) {
            a.c();
        }
    }
    
    private static class a<V> implements l0<V>
    {
        final LiveData<V> G;
        final l0<? super V> H;
        int I;
        
        a(final LiveData<V> g, final l0<? super V> h) {
            this.I = -1;
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void a(@androidx.annotation.k0 final V v) {
            if (this.I != this.G.g()) {
                this.I = this.G.g();
                this.H.a((Object)v);
            }
        }
        
        void b() {
            this.G.k(this);
        }
        
        void c() {
            this.G.o(this);
        }
    }
}
