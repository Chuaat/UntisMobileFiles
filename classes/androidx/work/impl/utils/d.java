// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import androidx.annotation.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.i0;
import g.a;
import androidx.annotation.j0;
import androidx.lifecycle.LiveData;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class d
{
    private d() {
    }
    
    public static <In, Out> LiveData<Out> a(@j0 final LiveData<In> liveData, @j0 final a<In, Out> a, @j0 final androidx.work.impl.utils.taskexecutor.a a2) {
        final Object o = new Object();
        final i0<Out> i0 = new i0<Out>();
        i0.r(liveData, new l0<In>() {
            Out G = null;
            
            @Override
            public void a(@k0 final In in) {
                a2.c(new Runnable() {
                    @Override
                    public void run() {
                        synchronized (o) {
                            final Out apply = a.apply(in);
                            final l0<In> h = l0.this;
                            final Out g = h.G;
                            i0 i0;
                            if (g == null && apply != null) {
                                h.G = apply;
                                i0 = i0;
                            }
                            else {
                                if (g == null || g.equals(apply)) {
                                    return;
                                }
                                final l0<In> h2 = l0.this;
                                h2.G = apply;
                                i0 = i0;
                            }
                            i0.n(apply);
                        }
                    }
                });
            }
        });
        return i0;
    }
}
