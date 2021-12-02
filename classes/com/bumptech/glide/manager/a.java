// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.manager;

import java.util.Iterator;
import java.util.Collection;
import com.bumptech.glide.util.m;
import androidx.annotation.j0;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

class a implements h
{
    private final Set<i> a;
    private boolean b;
    private boolean c;
    
    a() {
        this.a = Collections.newSetFromMap(new WeakHashMap<i, Boolean>());
    }
    
    @Override
    public void a(@j0 final i i) {
        this.a.add(i);
        if (this.c) {
            i.onDestroy();
        }
        else if (this.b) {
            i.f();
        }
        else {
            i.a();
        }
    }
    
    @Override
    public void b(@j0 final i i) {
        this.a.remove(i);
    }
    
    void c() {
        this.c = true;
        final Iterator<i> iterator = m.k(this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().onDestroy();
        }
    }
    
    void d() {
        this.b = true;
        final Iterator<i> iterator = m.k(this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().f();
        }
    }
    
    void e() {
        this.b = false;
        final Iterator<i> iterator = m.k(this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }
}
