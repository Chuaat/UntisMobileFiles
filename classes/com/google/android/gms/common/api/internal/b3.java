// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.m;
import androidx.annotation.k0;
import java.util.Set;
import java.util.Iterator;
import com.google.android.gms.common.api.l;
import java.util.Map;
import com.google.android.gms.tasks.n;
import androidx.collection.a;

public final class b3
{
    private final a<c<?>, com.google.android.gms.common.c> a;
    private final a<c<?>, String> b;
    private final n<Map<c<?>, String>> c;
    private int d;
    private boolean e;
    
    public b3(final Iterable<? extends l<?>> iterable) {
        this.b = new a<c<?>, String>();
        this.c = new n<Map<c<?>, String>>();
        this.e = false;
        this.a = new a<c<?>, com.google.android.gms.common.c>();
        final Iterator<? extends l<?>> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.a.put(((l<?>)iterator.next()).b(), null);
        }
        this.d = this.a.keySet().size();
    }
    
    public final Set<c<?>> a() {
        return this.a.keySet();
    }
    
    public final void b(final c<?> c, final com.google.android.gms.common.c c2, @k0 final String s) {
        this.a.put(c, c2);
        this.b.put(c, s);
        --this.d;
        if (!c2.j2()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (this.e) {
                this.c.b(new com.google.android.gms.common.api.c(this.a));
                return;
            }
            this.c.c(this.b);
        }
    }
    
    public final m<Map<c<?>, String>> c() {
        return this.c.a();
    }
}
