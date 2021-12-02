// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.constraints.controllers;

import java.util.Iterator;
import androidx.annotation.j0;
import androidx.work.impl.model.r;
import androidx.annotation.k0;
import java.util.ArrayList;
import androidx.work.impl.constraints.trackers.d;
import java.util.List;
import androidx.work.impl.constraints.a;

public abstract class c<T> implements androidx.work.impl.constraints.a<T>
{
    private final List<String> a;
    private T b;
    private d<T> c;
    private a d;
    
    c(final d<T> c) {
        this.a = new ArrayList<String>();
        this.c = c;
    }
    
    private void h(@k0 final a a, @k0 final T t) {
        if (!this.a.isEmpty()) {
            if (a != null) {
                if (t != null && !this.c(t)) {
                    a.a(this.a);
                }
                else {
                    a.b(this.a);
                }
            }
        }
    }
    
    @Override
    public void a(@k0 final T b) {
        this.b = b;
        this.h(this.d, b);
    }
    
    abstract boolean b(@j0 final r p0);
    
    abstract boolean c(@j0 final T p0);
    
    public boolean d(@j0 final String s) {
        final T b = this.b;
        return b != null && this.c(b) && this.a.contains(s);
    }
    
    public void e(@j0 final Iterable<r> iterable) {
        this.a.clear();
        for (final r r : iterable) {
            if (this.b(r)) {
                this.a.add(r.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.c(this);
        }
        else {
            this.c.a(this);
        }
        this.h(this.d, this.b);
    }
    
    public void f() {
        if (!this.a.isEmpty()) {
            this.a.clear();
            this.c.c(this);
        }
    }
    
    public void g(@k0 final a d) {
        if (this.d != d) {
            this.h(this.d = d, this.b);
        }
    }
    
    public interface a
    {
        void a(@j0 final List<String> p0);
        
        void b(@j0 final List<String> p0);
    }
}
