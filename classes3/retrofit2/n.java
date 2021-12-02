// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import okio.d0;
import okio.m;
import okio.r0;
import okio.v;
import okio.o;
import okio.t0;
import okhttp3.e0;
import okhttp3.g0;
import java.io.IOException;
import java.util.Objects;
import d6.a;
import c6.h;
import okhttp3.h0;
import okhttp3.e;

final class n<T> implements retrofit2.b<T>
{
    private final s G;
    private final Object[] H;
    private final e.a I;
    private final f<h0, T> J;
    private volatile boolean K;
    @h
    @a("this")
    private e L;
    @h
    @a("this")
    private Throwable M;
    @a("this")
    private boolean N;
    
    n(final s g, final Object[] h, final e.a i, final f<h0, T> j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    private e b() throws IOException {
        final e a = this.I.a(this.G.a(this.H));
        Objects.requireNonNull(a, "Call.Factory returned null.");
        return a;
    }
    
    @a("this")
    private e c() throws IOException {
        final e l = this.L;
        if (l != null) {
            return l;
        }
        Object o = this.M;
        if (o == null) {
            try {
                o = this.b();
                return this.L = (e)o;
            }
            catch (IOException o) {}
            catch (Error o) {}
            catch (RuntimeException ex) {}
            y.s((Throwable)o);
            throw this.M = (Throwable)o;
        }
        if (o instanceof IOException) {
            throw (IOException)o;
        }
        if (o instanceof RuntimeException) {
            throw (RuntimeException)o;
        }
        throw (Error)o;
    }
    
    @Override
    public boolean G() {
        synchronized (this) {
            return this.N;
        }
    }
    
    @Override
    public boolean K() {
        final boolean k = this.K;
        boolean b = true;
        if (k) {
            return true;
        }
        synchronized (this) {
            final e l = this.L;
            if (l == null || !l.K()) {
                b = false;
            }
            return b;
        }
    }
    
    @Override
    public void N2(final d<T> obj) {
        Objects.requireNonNull(obj, "callback == null");
        synchronized (this) {
            if (this.N) {
                throw new IllegalStateException("Already executed.");
            }
            this.N = true;
            final e l = this.L;
            final Throwable m = this.M;
            e e = l;
            Throwable i = m;
            if (l == null) {
                e = l;
                if ((i = m) == null) {
                    try {
                        this.L = this.b();
                    }
                    finally {
                        y.s(i);
                        this.M = i;
                        e = l;
                    }
                }
            }
            // monitorexit(this)
            if (i != null) {
                obj.a(this, i);
                return;
            }
            if (this.K) {
                e.cancel();
            }
            e.q1(new okhttp3.f() {
                private void c(final Throwable t) {
                    try {
                        obj.a(n.this, t);
                    }
                    finally {
                        y.s(t);
                        t.printStackTrace();
                    }
                }
                
                @Override
                public void a(final e e, final g0 g0) {
                    try {
                        final t<T> d = n.this.d(g0);
                        try {
                            obj.b(n.this, d);
                        }
                        finally {
                            final Throwable t;
                            y.s(t);
                            t.printStackTrace();
                        }
                    }
                    finally {
                        final Throwable t2;
                        y.s(t2);
                        this.c(t2);
                    }
                }
                
                @Override
                public void b(final e e, final IOException ex) {
                    this.c(ex);
                }
            });
        }
    }
    
    public n<T> a() {
        return new n<T>(this.G, this.H, this.I, this.J);
    }
    
    @Override
    public void cancel() {
        this.K = true;
        synchronized (this) {
            final e l = this.L;
            // monitorexit(this)
            if (l != null) {
                l.cancel();
            }
        }
    }
    
    t<T> d(g0 g0) throws IOException {
        final h0 r = g0.r();
        final g0 c = g0.Q().b(new c(r.contentType(), r.contentLength())).c();
        final int x = c.x();
        if (x >= 200) {
            if (x < 300) {
                if (x != 204) {
                    if (x != 205) {
                        g0 = (g0)new b(r);
                        try {
                            return t.m(this.J.a((h0)g0), c);
                        }
                        catch (RuntimeException ex) {
                            ((b)g0).a();
                            throw ex;
                        }
                    }
                }
                r.close();
                return t.m((T)null, c);
            }
        }
        try {
            return (t<T>)t.d(y.a(r), c);
        }
        finally {
            r.close();
        }
    }
    
    @Override
    public e0 k() {
        // monitorenter(this)
        try {
            try {
                // monitorexit(this)
                return this.c().k();
            }
            finally {}
        }
        catch (IOException cause) {
            throw new RuntimeException("Unable to create request.", cause);
        }
    }
    // monitorexit(this)
    
    @Override
    public t<T> p() throws IOException {
        synchronized (this) {
            if (!this.N) {
                this.N = true;
                final e c = this.c();
                // monitorexit(this)
                if (this.K) {
                    c.cancel();
                }
                return this.d(c.p());
            }
            throw new IllegalStateException("Already executed.");
        }
    }
    
    @Override
    public t0 timeout() {
        // monitorenter(this)
        try {
            try {
                // monitorexit(this)
                return this.c().timeout();
            }
            finally {}
        }
        catch (IOException cause) {
            throw new RuntimeException("Unable to create call.", cause);
        }
    }
    // monitorexit(this)
    
    static final class b extends h0
    {
        private final h0 G;
        private final o H;
        @h
        IOException I;
        
        b(final h0 g) {
            this.G = g;
            this.H = d0.d(new v(g.source()) {
                @Override
                public long read(final m m, long read) throws IOException {
                    try {
                        read = super.read(m, read);
                        return read;
                    }
                    catch (IOException i) {
                        throw b.this.I = i;
                    }
                }
            });
        }
        
        void a() throws IOException {
            final IOException i = this.I;
            if (i == null) {
                return;
            }
            throw i;
        }
        
        @Override
        public void close() {
            this.G.close();
        }
        
        @Override
        public long contentLength() {
            return this.G.contentLength();
        }
        
        @Override
        public okhttp3.y contentType() {
            return this.G.contentType();
        }
        
        @Override
        public o source() {
            return this.H;
        }
    }
    
    static final class c extends h0
    {
        @h
        private final okhttp3.y G;
        private final long H;
        
        c(@h final okhttp3.y g, final long h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public long contentLength() {
            return this.H;
        }
        
        @Override
        public okhttp3.y contentType() {
            return this.G;
        }
        
        @Override
        public o source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }
}
