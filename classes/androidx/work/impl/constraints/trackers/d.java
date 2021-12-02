// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.constraints.trackers;

import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import androidx.annotation.j0;
import androidx.work.q;
import java.util.Set;
import android.content.Context;
import androidx.work.impl.utils.taskexecutor.a;
import androidx.annotation.t0;

@t0({ t0.a.H })
public abstract class d<T>
{
    private static final String f;
    protected final a a;
    protected final Context b;
    private final Object c;
    private final Set<androidx.work.impl.constraints.a<T>> d;
    T e;
    
    static {
        f = q.f("ConstraintTracker");
    }
    
    d(@j0 final Context context, @j0 final a a) {
        this.c = new Object();
        this.d = new LinkedHashSet<androidx.work.impl.constraints.a<T>>();
        this.b = context.getApplicationContext();
        this.a = a;
    }
    
    public void a(final androidx.work.impl.constraints.a<T> a) {
        synchronized (this.c) {
            if (this.d.add(a)) {
                if (this.d.size() == 1) {
                    this.e = this.b();
                    q.c().a(androidx.work.impl.constraints.trackers.d.f, String.format("%s: initial state = %s", this.getClass().getSimpleName(), this.e), new Throwable[0]);
                    this.e();
                }
                a.a(this.e);
            }
        }
    }
    
    public abstract T b();
    
    public void c(final androidx.work.impl.constraints.a<T> a) {
        synchronized (this.c) {
            if (this.d.remove(a) && this.d.isEmpty()) {
                this.f();
            }
        }
    }
    
    public void d(final T t) {
        synchronized (this.c) {
            final T e = this.e;
            if (e != t && (e == null || !e.equals(t))) {
                this.e = t;
                this.a.b().execute(new Runnable() {
                    final /* synthetic */ List G = new ArrayList(androidx.work.impl.constraints.trackers.d.this.d);
                    
                    @Override
                    public void run() {
                        final Iterator<androidx.work.impl.constraints.a<T>> iterator = this.G.iterator();
                        while (iterator.hasNext()) {
                            iterator.next().a(androidx.work.impl.constraints.trackers.d.this.e);
                        }
                    }
                });
            }
        }
    }
    
    public abstract void e();
    
    public abstract void f();
}
