// 
// Decompiled by Procyon v0.5.36
// 

package androidx.collection;

import java.lang.reflect.Array;
import java.util.Iterator;
import androidx.annotation.j0;
import java.util.Map;
import androidx.annotation.k0;
import java.util.Set;
import java.util.Collection;

public final class c<E> implements Collection<E>, Set<E>
{
    private static final boolean K = false;
    private static final String L = "ArraySet";
    private static final int[] M;
    private static final Object[] N;
    private static final int O = 4;
    private static final int P = 10;
    @k0
    private static Object[] Q;
    private static int R;
    @k0
    private static Object[] S;
    private static int T;
    private int[] G;
    Object[] H;
    int I;
    private l<E, E> J;
    
    static {
        M = new int[0];
        N = new Object[0];
    }
    
    public c() {
        this(0);
    }
    
    public c(final int n) {
        if (n == 0) {
            this.G = c.M;
            this.H = c.N;
        }
        else {
            this.f(n);
        }
        this.I = 0;
    }
    
    public c(@k0 final c<E> c) {
        this();
        if (c != null) {
            this.b((c<? extends E>)c);
        }
    }
    
    public c(@k0 final Collection<E> collection) {
        this();
        if (collection != null) {
            this.addAll((Collection<? extends E>)collection);
        }
    }
    
    private void f(final int n) {
        Label_0145: {
            if (n == 8) {
                synchronized (c.class) {
                    final Object[] s = c.S;
                    if (s != null) {
                        this.H = s;
                        c.S = (Object[])s[0];
                        this.G = (int[])s[1];
                        s[0] = (s[1] = null);
                        --c.T;
                        return;
                    }
                    break Label_0145;
                }
            }
            if (n == 4) {
                synchronized (c.class) {
                    final Object[] q = c.Q;
                    if (q != null) {
                        this.H = q;
                        c.Q = (Object[])q[0];
                        this.G = (int[])q[1];
                        q[0] = (q[1] = null);
                        --c.R;
                        return;
                    }
                }
            }
        }
        this.G = new int[n];
        this.H = new Object[n];
    }
    
    private static void i(final int[] array, final Object[] array2, int i) {
        if (array.length == 8) {
            synchronized (c.class) {
                if (c.T < 10) {
                    array2[0] = c.S;
                    array2[1] = array;
                    --i;
                    while (i >= 2) {
                        array2[i] = null;
                        --i;
                    }
                    c.S = array2;
                    ++c.T;
                }
                return;
            }
        }
        if (array.length == 4) {
            synchronized (c.class) {
                if (c.R < 10) {
                    array2[0] = c.Q;
                    array2[1] = array;
                    --i;
                    while (i >= 2) {
                        array2[i] = null;
                        --i;
                    }
                    c.Q = array2;
                    ++c.R;
                }
            }
        }
    }
    
    private l<E, E> k() {
        if (this.J == null) {
            this.J = new l<E, E>() {
                @Override
                protected void a() {
                    c.this.clear();
                }
                
                @Override
                protected Object b(final int n, final int n2) {
                    return c.this.H[n];
                }
                
                @Override
                protected Map<E, E> c() {
                    throw new UnsupportedOperationException("not a map");
                }
                
                @Override
                protected int d() {
                    return c.this.I;
                }
                
                @Override
                protected int e(final Object o) {
                    return c.this.indexOf(o);
                }
                
                @Override
                protected int f(final Object o) {
                    return c.this.indexOf(o);
                }
                
                @Override
                protected void g(final E e, final E e2) {
                    c.this.add(e);
                }
                
                @Override
                protected void h(final int n) {
                    c.this.o(n);
                }
                
                @Override
                protected E i(final int n, final E e) {
                    throw new UnsupportedOperationException("not a map");
                }
            };
        }
        return this.J;
    }
    
    private int l(final Object o, final int n) {
        final int i = this.I;
        if (i == 0) {
            return -1;
        }
        int a = g.a(this.G, i, n);
        if (a < 0) {
            return a;
        }
        if (o.equals(this.H[a])) {
            return a;
        }
        int n2;
        for (n2 = a + 1; n2 < i && this.G[n2] == n; ++n2) {
            if (o.equals(this.H[n2])) {
                return n2;
            }
        }
        --a;
        while (a >= 0 && this.G[a] == n) {
            if (o.equals(this.H[a])) {
                return a;
            }
            --a;
        }
        return ~n2;
    }
    
    private int m() {
        final int i = this.I;
        if (i == 0) {
            return -1;
        }
        final int a = g.a(this.G, i, 0);
        if (a < 0) {
            return a;
        }
        if (this.H[a] == null) {
            return a;
        }
        int n;
        for (n = a + 1; n < i && this.G[n] == 0; ++n) {
            if (this.H[n] == null) {
                return n;
            }
        }
        for (int n2 = a - 1; n2 >= 0 && this.G[n2] == 0; --n2) {
            if (this.H[n2] == null) {
                return n2;
            }
        }
        return ~n;
    }
    
    @Override
    public boolean add(@k0 final E e) {
        int n;
        int hashCode;
        if (e == null) {
            n = this.m();
            hashCode = 0;
        }
        else {
            hashCode = e.hashCode();
            n = this.l(e, hashCode);
        }
        if (n >= 0) {
            return false;
        }
        final int n2 = ~n;
        final int i = this.I;
        final int[] g = this.G;
        if (i >= g.length) {
            int n3 = 4;
            if (i >= 8) {
                n3 = (i >> 1) + i;
            }
            else if (i >= 4) {
                n3 = 8;
            }
            final Object[] h = this.H;
            this.f(n3);
            final int[] g2 = this.G;
            if (g2.length > 0) {
                System.arraycopy(g, 0, g2, 0, g.length);
                System.arraycopy(h, 0, this.H, 0, h.length);
            }
            i(g, h, this.I);
        }
        final int j = this.I;
        if (n2 < j) {
            final int[] g3 = this.G;
            final int n4 = n2 + 1;
            System.arraycopy(g3, n2, g3, n4, j - n2);
            final Object[] h2 = this.H;
            System.arraycopy(h2, n2, h2, n4, this.I - n2);
        }
        this.G[n2] = hashCode;
        this.H[n2] = e;
        ++this.I;
        return true;
    }
    
    @Override
    public boolean addAll(@j0 final Collection<? extends E> collection) {
        this.h(this.I + collection.size());
        final Iterator<? extends E> iterator = collection.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= this.add(iterator.next());
        }
        return b;
    }
    
    public void b(@j0 final c<? extends E> c) {
        final int i = c.I;
        this.h(this.I + i);
        final int j = this.I;
        int k = 0;
        if (j == 0) {
            if (i > 0) {
                System.arraycopy(c.G, 0, this.G, 0, i);
                System.arraycopy(c.H, 0, this.H, 0, i);
                this.I = i;
            }
        }
        else {
            while (k < i) {
                this.add(c.p(k));
                ++k;
            }
        }
    }
    
    @Override
    public void clear() {
        final int i = this.I;
        if (i != 0) {
            i(this.G, this.H, i);
            this.G = c.M;
            this.H = c.N;
            this.I = 0;
        }
    }
    
    @Override
    public boolean contains(@k0 final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    @Override
    public boolean containsAll(@j0 final Collection<?> collection) {
        final Iterator<?> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set = (Set)o;
        if (this.size() != set.size()) {
            return false;
        }
        int i = 0;
        try {
            while (i < this.I) {
                if (!set.contains(this.p(i))) {
                    return false;
                }
                ++i;
            }
            return true;
        }
        catch (NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    public void h(int i) {
        final int[] g = this.G;
        if (g.length < i) {
            final Object[] h = this.H;
            this.f(i);
            i = this.I;
            if (i > 0) {
                System.arraycopy(g, 0, this.G, 0, i);
                System.arraycopy(h, 0, this.H, 0, this.I);
            }
            i(g, h, this.I);
        }
    }
    
    @Override
    public int hashCode() {
        final int[] g = this.G;
        final int i = this.I;
        int j = 0;
        int n = 0;
        while (j < i) {
            n += g[j];
            ++j;
        }
        return n;
    }
    
    public int indexOf(@k0 final Object o) {
        int n;
        if (o == null) {
            n = this.m();
        }
        else {
            n = this.l(o, o.hashCode());
        }
        return n;
    }
    
    @Override
    public boolean isEmpty() {
        return this.I <= 0;
    }
    
    @Override
    public Iterator<E> iterator() {
        return this.k().m().iterator();
    }
    
    public boolean n(@j0 final c<? extends E> c) {
        final int i = c.I;
        final int j = this.I;
        boolean b = false;
        for (int k = 0; k < i; ++k) {
            this.remove(c.p(k));
        }
        if (j != this.I) {
            b = true;
        }
        return b;
    }
    
    public E o(final int n) {
        final Object[] h = this.H;
        final Object o = h[n];
        final int i = this.I;
        if (i <= 1) {
            i(this.G, h, i);
            this.G = c.M;
            this.H = c.N;
            this.I = 0;
        }
        else {
            final int[] g = this.G;
            final int length = g.length;
            int n2 = 8;
            if (length > 8 && i < g.length / 3) {
                if (i > 8) {
                    n2 = i + (i >> 1);
                }
                this.f(n2);
                --this.I;
                if (n > 0) {
                    System.arraycopy(g, 0, this.G, 0, n);
                    System.arraycopy(h, 0, this.H, 0, n);
                }
                final int j = this.I;
                if (n < j) {
                    final int n3 = n + 1;
                    System.arraycopy(g, n3, this.G, n, j - n);
                    System.arraycopy(h, n3, this.H, n, this.I - n);
                }
            }
            else {
                final int k = i - 1;
                if (n < (this.I = k)) {
                    final int n4 = n + 1;
                    System.arraycopy(g, n4, g, n, k - n);
                    final Object[] h2 = this.H;
                    System.arraycopy(h2, n4, h2, n, this.I - n);
                }
                this.H[this.I] = null;
            }
        }
        return (E)o;
    }
    
    @k0
    public E p(final int n) {
        return (E)this.H[n];
    }
    
    @Override
    public boolean remove(@k0 final Object o) {
        final int index = this.indexOf(o);
        if (index >= 0) {
            this.o(index);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean removeAll(@j0 final Collection<?> collection) {
        final Iterator<?> iterator = collection.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= this.remove(iterator.next());
        }
        return b;
    }
    
    @Override
    public boolean retainAll(@j0 final Collection<?> collection) {
        int i = this.I - 1;
        boolean b = false;
        while (i >= 0) {
            if (!collection.contains(this.H[i])) {
                this.o(i);
                b = true;
            }
            --i;
        }
        return b;
    }
    
    @Override
    public int size() {
        return this.I;
    }
    
    @j0
    @Override
    public Object[] toArray() {
        final int i = this.I;
        final Object[] array = new Object[i];
        System.arraycopy(this.H, 0, array, 0, i);
        return array;
    }
    
    @j0
    @Override
    public <T> T[] toArray(@j0 final T[] array) {
        Object[] array2 = array;
        if (array.length < this.I) {
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), this.I);
        }
        System.arraycopy(this.H, 0, array2, 0, this.I);
        final int length = ((T[])array2).length;
        final int i = this.I;
        if (length > i) {
            array2[i] = null;
        }
        return (T[])array2;
    }
    
    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.I * 14);
        sb.append('{');
        for (int i = 0; i < this.I; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final E p = this.p(i);
            if (p != this) {
                sb.append(p);
            }
            else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
