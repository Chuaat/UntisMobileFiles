// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.mock;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.e0;
import retrofit2.d;
import c6.h;
import retrofit2.t;
import java.io.IOException;
import retrofit2.b;
import java.util.concurrent.Callable;

public final class c
{
    private c() {
        throw new AssertionError((Object)"No instances.");
    }
    
    public static <T> retrofit2.b<T> a(final Callable<retrofit2.b<T>> callable) {
        return new a<T>(callable);
    }
    
    public static <T> retrofit2.b<T> b(final IOException ex) {
        return new b<T>(null, ex);
    }
    
    public static <T> retrofit2.b<T> c(@h final T t) {
        return new b<T>(t.k(t), null);
    }
    
    public static <T> retrofit2.b<T> d(final t<T> t) {
        return new b<T>(t, null);
    }
    
    static final class a<T> implements b<T>
    {
        private final Callable<b<T>> G;
        private b<T> H;
        
        a(final Callable<b<T>> g) {
            this.G = g;
        }
        
        private b<T> a() {
            synchronized (this) {
                b<T> h;
                if ((h = this.H) == null) {
                    try {
                        h = this.G.call();
                    }
                    catch (Exception cause) {
                        throw new IllegalStateException("Callable threw unrecoverable exception", cause);
                    }
                    catch (IOException ex) {
                        h = c.b(ex);
                    }
                    this.H = h;
                }
                return h;
            }
        }
        
        @Override
        public boolean G() {
            return this.a().G();
        }
        
        @Override
        public boolean K() {
            return this.a().K();
        }
        
        @Override
        public b<T> M() {
            return new a((Callable<b<Object>>)this.G);
        }
        
        @Override
        public void N2(final d<T> d) {
            this.a().N2(d);
        }
        
        @Override
        public void cancel() {
            this.a().cancel();
        }
        
        @Override
        public e0 k() {
            return this.a().k();
        }
        
        @Override
        public t<T> p() throws IOException {
            return this.a().p();
        }
    }
    
    static final class b<T> implements retrofit2.b<T>
    {
        private final t<T> G;
        private final IOException H;
        private final AtomicBoolean I;
        private final AtomicBoolean J;
        
        b(@h final t<T> g, @h final IOException h) {
            this.I = new AtomicBoolean();
            this.J = new AtomicBoolean();
            int n = true ? 1 : 0;
            final boolean b = g == null;
            if (h != null) {
                n = (false ? 1 : 0);
            }
            if ((b ? 1 : 0) != n) {
                this.G = g;
                this.H = h;
                return;
            }
            throw new AssertionError((Object)"Only one of response or error can be set.");
        }
        
        @Override
        public boolean G() {
            return this.J.get();
        }
        
        @Override
        public boolean K() {
            return this.I.get();
        }
        
        @Override
        public retrofit2.b<T> M() {
            return new b((t<Object>)this.G, this.H);
        }
        
        @Override
        public void N2(final d<T> obj) {
            Objects.requireNonNull(obj, "callback == null");
            if (this.J.compareAndSet(false, true)) {
                IOException h;
                if (this.I.get()) {
                    h = new IOException("canceled");
                }
                else {
                    final t<T> g = this.G;
                    if (g != null) {
                        obj.b(this, g);
                        return;
                    }
                    h = this.H;
                }
                obj.a(this, h);
                return;
            }
            throw new IllegalStateException("Already executed");
        }
        
        @Override
        public void cancel() {
            this.I.set(true);
        }
        
        @Override
        public e0 k() {
            final t<T> g = this.G;
            if (g != null) {
                return g.i().W();
            }
            return new e0.a().B("http://localhost").b();
        }
        
        @Override
        public t<T> p() throws IOException {
            if (!this.J.compareAndSet(false, true)) {
                throw new IllegalStateException("Already executed");
            }
            if (this.I.get()) {
                throw new IOException("canceled");
            }
            final t<T> g = this.G;
            if (g != null) {
                return g;
            }
            throw this.H;
        }
    }
}
