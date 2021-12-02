// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.AbstractList;

public class n extends AbstractList<String> implements RandomAccess, o
{
    public static final o H;
    private final List<Object> G;
    
    static {
        H = new n().K4();
    }
    
    public n() {
        this.G = new ArrayList<Object>();
    }
    
    public n(final o o) {
        this.G = new ArrayList<Object>(o.size());
        this.addAll(o);
    }
    
    private static d f(final Object o) {
        if (o instanceof d) {
            return (d)o;
        }
        if (o instanceof String) {
            return d.l((String)o);
        }
        return d.i((byte[])o);
    }
    
    private static String h(final Object o) {
        if (o instanceof String) {
            return (String)o;
        }
        if (o instanceof d) {
            return ((d)o).C();
        }
        return j.b((byte[])o);
    }
    
    @Override
    public void C5(final d d) {
        this.G.add(d);
        ++super.modCount;
    }
    
    @Override
    public List<?> G2() {
        return Collections.unmodifiableList((List<?>)this.G);
    }
    
    @Override
    public o K4() {
        return new x(this);
    }
    
    @Override
    public boolean addAll(final int n, final Collection<? extends String> collection) {
        List<?> g2 = (List<?>)collection;
        if (collection instanceof o) {
            g2 = ((o)collection).G2();
        }
        final boolean addAll = this.G.addAll(n, g2);
        ++super.modCount;
        return addAll;
    }
    
    @Override
    public boolean addAll(final Collection<? extends String> collection) {
        return this.addAll(this.size(), collection);
    }
    
    public void b(final int n, final String s) {
        this.G.add(n, s);
        ++super.modCount;
    }
    
    @Override
    public void clear() {
        this.G.clear();
        ++super.modCount;
    }
    
    public String i(final int n) {
        final byte[] value = this.G.get(n);
        if (value instanceof String) {
            return (String)(Object)value;
        }
        if (value instanceof d) {
            final d d = (Object)value;
            final String c = d.C();
            if (d.q()) {
                this.G.set(n, c);
            }
            return c;
        }
        final byte[] array = value;
        final String b = j.b(array);
        if (j.a(array)) {
            this.G.set(n, b);
        }
        return b;
    }
    
    public String k(final int n) {
        final Object remove = this.G.remove(n);
        ++super.modCount;
        return h(remove);
    }
    
    public String l(final int n, final String s) {
        return h(this.G.set(n, s));
    }
    
    @Override
    public d p4(final int n) {
        final d value = this.G.get(n);
        final d f = f(value);
        if (f != value) {
            this.G.set(n, f);
        }
        return f;
    }
    
    @Override
    public int size() {
        return this.G.size();
    }
}
