// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.manager;

import androidx.annotation.j0;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import com.bumptech.glide.util.m;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import com.bumptech.glide.request.target.p;
import java.util.Set;

public final class o implements i
{
    private final Set<p<?>> G;
    
    public o() {
        this.G = Collections.newSetFromMap(new WeakHashMap<p<?>, Boolean>());
    }
    
    @Override
    public void a() {
        final Iterator<p<?>> iterator = m.k(this.G).iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }
    
    public void d() {
        this.G.clear();
    }
    
    @Override
    public void f() {
        final Iterator<p<?>> iterator = m.k(this.G).iterator();
        while (iterator.hasNext()) {
            iterator.next().f();
        }
    }
    
    @j0
    public List<p<?>> g() {
        return m.k(this.G);
    }
    
    public void i(@j0 final p<?> p) {
        this.G.add(p);
    }
    
    public void j(@j0 final p<?> p) {
        this.G.remove(p);
    }
    
    @Override
    public void onDestroy() {
        final Iterator<p<?>> iterator = m.k(this.G).iterator();
        while (iterator.hasNext()) {
            iterator.next().onDestroy();
        }
    }
}
