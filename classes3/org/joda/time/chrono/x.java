// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.joda.time.field.r;
import org.joda.time.g;
import org.joda.time.i;
import java.util.concurrent.ConcurrentHashMap;

public final class x extends org.joda.time.chrono.a
{
    private static final long u0 = -6212696554273812441L;
    private static final x v0;
    private static final ConcurrentHashMap<i, x> w0;
    
    static {
        (w0 = new ConcurrentHashMap<i, x>()).put(i.I, v0 = new x(w.Y0()));
    }
    
    private x(final org.joda.time.a a) {
        super(a, null);
    }
    
    public static x c0() {
        return d0(i.n());
    }
    
    public static x d0(final i i) {
        i n = i;
        if (i == null) {
            n = i.n();
        }
        final ConcurrentHashMap<i, x> w0 = x.w0;
        x value;
        if ((value = w0.get(n)) == null) {
            value = new x(e0.e0(x.v0, n));
            final x x = w0.putIfAbsent(n, value);
            if (x != null) {
                value = x;
            }
        }
        return value;
    }
    
    public static x e0() {
        return x.v0;
    }
    
    private Object f0() {
        return new a(this.s());
    }
    
    @Override
    public org.joda.time.a R() {
        return x.v0;
    }
    
    @Override
    public org.joda.time.a S(final i i) {
        i n = i;
        if (i == null) {
            n = i.n();
        }
        if (n == this.s()) {
            return this;
        }
        return d0(n);
    }
    
    @Override
    protected void X(final org.joda.time.chrono.a.a a) {
        if (this.Y().s() == i.I) {
            final org.joda.time.field.i h = new org.joda.time.field.i(y.e, g.x(), 100);
            a.H = h;
            a.k = h.t();
            a.G = new r((org.joda.time.field.i)a.H, g.Y());
            a.C = new r((org.joda.time.field.i)a.H, a.h, g.W());
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof x && this.s().equals(((x)o).s()));
    }
    
    @Override
    public int hashCode() {
        return 800855 + this.s().hashCode();
    }
    
    @Override
    public String toString() {
        final i s = this.s();
        String string = "ISOChronology";
        if (s != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("ISOChronology");
            sb.append('[');
            sb.append(s.q());
            sb.append(']');
            string = sb.toString();
        }
        return string;
    }
    
    private static final class a implements Serializable
    {
        private static final long H = -6212696554273812441L;
        private transient i G;
        
        a(final i g) {
            this.G = g;
        }
        
        private void a(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.G = (i)objectInputStream.readObject();
        }
        
        private Object b() {
            return x.d0(this.G);
        }
        
        private void c(final ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.G);
        }
    }
}
