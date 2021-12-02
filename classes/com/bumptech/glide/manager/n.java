// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.manager;

import android.util.Log;
import androidx.annotation.j0;
import java.util.Iterator;
import java.util.Collection;
import com.bumptech.glide.util.m;
import androidx.annotation.k0;
import androidx.annotation.b1;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.List;
import com.bumptech.glide.request.d;
import java.util.Set;

public class n
{
    private static final String d = "RequestTracker";
    private final Set<d> a;
    private final List<d> b;
    private boolean c;
    
    public n() {
        this.a = Collections.newSetFromMap(new WeakHashMap<d, Boolean>());
        this.b = new ArrayList<d>();
    }
    
    @b1
    void a(final d d) {
        this.a.add(d);
    }
    
    public boolean b(@k0 final d d) {
        final boolean b = true;
        if (d == null) {
            return true;
        }
        final boolean remove = this.a.remove(d);
        boolean b2 = b;
        if (!this.b.remove(d)) {
            b2 = (remove && b);
        }
        if (b2) {
            d.clear();
        }
        return b2;
    }
    
    public void c() {
        final Iterator<d> iterator = m.k(this.a).iterator();
        while (iterator.hasNext()) {
            this.b(iterator.next());
        }
        this.b.clear();
    }
    
    public boolean d() {
        return this.c;
    }
    
    public void e() {
        this.c = true;
        for (final d d : m.k(this.a)) {
            if (d.isRunning() || d.d()) {
                d.clear();
                this.b.add(d);
            }
        }
    }
    
    public void f() {
        this.c = true;
        for (final d d : m.k(this.a)) {
            if (d.isRunning()) {
                d.D();
                this.b.add(d);
            }
        }
    }
    
    public void g() {
        for (final d d : m.k(this.a)) {
            if (!d.d() && !d.g()) {
                d.clear();
                if (!this.c) {
                    d.i();
                }
                else {
                    this.b.add(d);
                }
            }
        }
    }
    
    public void h() {
        this.c = false;
        for (final d d : m.k(this.a)) {
            if (!d.d() && !d.isRunning()) {
                d.i();
            }
        }
        this.b.clear();
    }
    
    public void i(@j0 final d d) {
        this.a.add(d);
        if (!this.c) {
            d.i();
        }
        else {
            d.clear();
            if (Log.isLoggable("RequestTracker", 2)) {
                Log.v("RequestTracker", "Paused, delaying request");
            }
            this.b.add(d);
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.a.size());
        sb.append(", isPaused=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
