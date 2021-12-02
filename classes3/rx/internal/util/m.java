// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import rx.exceptions.d;
import rx.internal.operators.x;
import rx.h;
import rx.internal.util.unsafe.n0;
import rx.internal.util.unsafe.z;
import rx.internal.util.unsafe.r;
import rx.internal.util.atomic.e;
import java.io.PrintStream;
import java.util.Queue;
import rx.o;

public class m implements o
{
    public static final int J;
    private Queue<Object> G;
    private final int H;
    public volatile Object I;
    
    static {
        int n;
        if (l.b()) {
            n = 16;
        }
        else {
            n = 128;
        }
        final String property = System.getProperty("rx.ring-buffer.size");
        int int1 = n;
        if (property != null) {
            try {
                int1 = Integer.parseInt(property);
            }
            catch (NumberFormatException ex) {
                final PrintStream err = System.err;
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to set 'rx.buffer.size' with value ");
                sb.append(property);
                sb.append(" => ");
                sb.append(ex.getMessage());
                err.println(sb.toString());
                int1 = n;
            }
        }
        J = int1;
    }
    
    m() {
        final int j = m.J;
        this(new e<Object>(j), j);
    }
    
    private m(final Queue<Object> g, final int h) {
        this.G = g;
        this.H = h;
    }
    
    private m(final boolean b, final int h) {
        Object g;
        if (b) {
            g = new r<Object>(h);
        }
        else {
            g = new z<Object>(h);
        }
        this.G = (Queue<Object>)g;
        this.H = h;
    }
    
    public static m h() {
        if (n0.f()) {
            return new m(true, m.J);
        }
        return new m();
    }
    
    public static m j() {
        if (n0.f()) {
            return new m(false, m.J);
        }
        return new m();
    }
    
    public boolean a(final Object o, final h h) {
        return x.a(h, o);
    }
    
    public Throwable b(final Object o) {
        return x.d(o);
    }
    
    public int c() {
        return this.H - this.e();
    }
    
    public int d() {
        return this.H;
    }
    
    public int e() {
        final Queue<Object> g = this.G;
        if (g == null) {
            return 0;
        }
        return g.size();
    }
    
    @Override
    public boolean g() {
        return this.G == null;
    }
    
    @Override
    public void i() {
        this.t();
    }
    
    public Object k(final Object o) {
        return x.e(o);
    }
    
    public boolean l(final Object o) {
        return x.f(o);
    }
    
    public boolean m() {
        final Queue<Object> g = this.G;
        return g == null || g.isEmpty();
    }
    
    public boolean n(final Object o) {
        return x.g(o);
    }
    
    public void o() {
        if (this.I == null) {
            this.I = x.b();
        }
    }
    
    public void p(final Throwable t) {
        if (this.I == null) {
            this.I = x.c(t);
        }
    }
    
    public void q(final Object o) throws d {
        synchronized (this) {
            final Queue<Object> g = this.G;
            boolean b = true;
            boolean b2 = false;
            if (g != null) {
                b2 = (g.offer(x.j(o)) ^ true);
                b = false;
            }
            // monitorexit(this)
            if (b) {
                throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
            }
            if (!b2) {
                return;
            }
            throw new d();
        }
    }
    
    public Object r() {
        synchronized (this) {
            final Queue<Object> g = this.G;
            if (g == null) {
                return null;
            }
            final Object peek = g.peek();
            final Object i = this.I;
            Object o;
            if ((o = peek) == null) {
                o = peek;
                if (i != null) {
                    o = peek;
                    if (g.peek() == null) {
                        o = i;
                    }
                }
            }
            return o;
        }
    }
    
    public Object s() {
        synchronized (this) {
            final Queue<Object> g = this.G;
            if (g == null) {
                return null;
            }
            final Object poll = g.poll();
            final Object i = this.I;
            Object o;
            if ((o = poll) == null) {
                o = poll;
                if (i != null) {
                    o = poll;
                    if (g.peek() == null) {
                        this.I = null;
                        o = i;
                    }
                }
            }
            return o;
        }
    }
    
    public void t() {
    }
    // monitorenter(this)
    // monitorexit(this)
}
