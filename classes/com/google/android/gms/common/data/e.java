// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.data;

import java.util.Iterator;
import androidx.annotation.RecentlyNonNull;
import java.util.HashSet;

public final class e implements d, a
{
    private HashSet<d> a;
    
    public e() {
        this.a = new HashSet<d>();
    }
    
    @Override
    public final void a(@RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        final Iterator<d> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(n, n2);
        }
    }
    
    @Override
    public final void b(@RecentlyNonNull final int n, @RecentlyNonNull final int n2, @RecentlyNonNull final int n3) {
        final Iterator<d> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(n, n2, n3);
        }
    }
    
    @Override
    public final void c(@RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        final Iterator<d> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().c(n, n2);
        }
    }
    
    @Override
    public final void d(@RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        final Iterator<d> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().d(n, n2);
        }
    }
    
    @Override
    public final void e(@RecentlyNonNull final d o) {
        this.a.remove(o);
    }
    
    @Override
    public final void f(@RecentlyNonNull final d e) {
        this.a.add(e);
    }
    
    @Override
    public final void g() {
        final Iterator<d> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().g();
        }
    }
    
    public final void h() {
        this.a.clear();
    }
    
    @RecentlyNonNull
    public final boolean i() {
        return !this.a.isEmpty();
    }
}
