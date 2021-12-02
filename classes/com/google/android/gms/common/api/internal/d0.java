// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.g0;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.b1;
import android.app.Activity;
import java.lang.ref.WeakReference;

public final class d0 extends com.google.android.gms.common.api.internal.a
{
    private final WeakReference<a> a;
    
    public d0(final Activity activity) {
        this(p(activity));
    }
    
    @b1(otherwise = 2)
    private d0(final a referent) {
        this.a = new WeakReference<a>(referent);
    }
    
    @Override
    public final com.google.android.gms.common.api.internal.a b(final Runnable runnable) {
        final a a = this.a.get();
        if (a != null) {
            a.o(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }
    
    @b1(otherwise = 2)
    static class a extends LifecycleCallback
    {
        private List<Runnable> H;
        
        private a(final m m) {
            super(m);
            this.H = new ArrayList<Runnable>();
            super.G.b("LifecycleObserverOnStop", this);
        }
        
        private final void o(final Runnable runnable) {
            synchronized (this) {
                this.H.add(runnable);
            }
        }
        
        private static a p(final Activity activity) {
            synchronized (activity) {
                final m c = LifecycleCallback.c(activity);
                a a;
                if ((a = c.e("LifecycleObserverOnStop", a.class)) == null) {
                    a = new a(c);
                }
                return a;
            }
        }
        
        @g0
        @Override
        public void l() {
            synchronized (this) {
                final List<Runnable> h = this.H;
                this.H = new ArrayList<Runnable>();
                // monitorexit(this)
                final Iterator<Runnable> iterator = h.iterator();
                while (iterator.hasNext()) {
                    iterator.next().run();
                }
            }
        }
    }
}
