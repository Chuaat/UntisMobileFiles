// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import java.util.Iterator;
import rx.exceptions.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import rx.o;

public final class q implements o
{
    private List<o> G;
    private volatile boolean H;
    
    public q() {
    }
    
    public q(final o o) {
        (this.G = new LinkedList<o>()).add(o);
    }
    
    public q(final o... a) {
        this.G = new LinkedList<o>(Arrays.asList(a));
    }
    
    private static void e(Collection<o> o) {
        if (o == null) {
            return;
        }
        final Collection<o> collection = null;
        final Iterator<o> iterator = ((Collection<o>)o).iterator();
        o = collection;
        while (iterator.hasNext()) {
            final o o2 = iterator.next();
            try {
                o2.i();
            }
            finally {
                Collection<o> collection2 = (Collection<o>)o;
                if (o == null) {
                    collection2 = new ArrayList<o>();
                }
                final Throwable t;
                ((List<o>)collection2).add((o)t);
                o = collection2;
            }
        }
        c.d((List<? extends Throwable>)o);
    }
    
    public void a(final o o) {
        if (o.g()) {
            return;
        }
        if (!this.H) {
            synchronized (this) {
                if (!this.H) {
                    List<o> g;
                    if ((g = this.G) == null) {
                        g = new LinkedList<o>();
                        this.G = g;
                    }
                    g.add(o);
                    return;
                }
            }
        }
        o.i();
    }
    
    public void b() {
        if (!this.H) {
            synchronized (this) {
                final List<o> g = this.G;
                this.G = null;
                // monitorexit(this)
                e(g);
            }
        }
    }
    
    public boolean c() {
        final boolean h = this.H;
        final boolean b = false;
        if (!h) {
            // monitorenter(this)
            boolean b2 = b;
            try {
                if (!this.H) {
                    final List<o> g = this.G;
                    b2 = b;
                    if (g != null) {
                        b2 = b;
                        if (!g.isEmpty()) {
                            b2 = true;
                        }
                    }
                }
                return b2;
            }
            finally {
            }
            // monitorexit(this)
        }
        return false;
    }
    
    public void d(final o o) {
        if (!this.H) {
            synchronized (this) {
                final List<o> g = this.G;
                if (this.H || g == null) {
                    return;
                }
                final boolean remove = g.remove(o);
                // monitorexit(this)
                if (remove) {
                    o.i();
                }
            }
        }
    }
    
    @Override
    public boolean g() {
        return this.H;
    }
    
    @Override
    public void i() {
        if (!this.H) {
            synchronized (this) {
                if (this.H) {
                    return;
                }
                this.H = true;
                final List<o> g = this.G;
                this.G = null;
                // monitorexit(this)
                e(g);
            }
        }
    }
}
