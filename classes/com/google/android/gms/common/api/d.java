// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import java.util.ArrayList;
import androidx.annotation.RecentlyNonNull;
import java.util.List;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class d extends BasePendingResult<e>
{
    private int q;
    private boolean r;
    private boolean s;
    private final n<?>[] t;
    private final Object u;
    
    private d(final List<n<?>> list, final k k) {
        super(k);
        this.u = new Object();
        final int size = list.size();
        this.q = size;
        final n[] t = new n[size];
        this.t = (n<?>[])t;
        if (list.isEmpty()) {
            this.o(new e(Status.L, t));
            return;
        }
        for (int i = 0; i < list.size(); ++i) {
            (this.t[i] = list.get(i)).c((n.a)new a0(this));
        }
    }
    
    @Override
    public final void f() {
        super.f();
        final n<?>[] t = this.t;
        for (int length = t.length, i = 0; i < length; ++i) {
            t[i].f();
        }
    }
    
    @RecentlyNonNull
    public final e y(@RecentlyNonNull final Status status) {
        return new e(status, this.t);
    }
    
    public static final class a
    {
        private List<n<?>> a;
        private k b;
        
        public a(@RecentlyNonNull final k b) {
            this.a = new ArrayList<n<?>>();
            this.b = b;
        }
        
        @RecentlyNonNull
        public final <R extends t> f<R> a(@RecentlyNonNull final n<R> n) {
            final f<R> f = new f<R>(this.a.size());
            this.a.add(n);
            return f;
        }
        
        @RecentlyNonNull
        public final d b() {
            return new d(this.a, this.b, null);
        }
    }
}
