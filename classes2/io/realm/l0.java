// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import io.reactivex.l;
import java.util.ListIterator;
import java.util.Iterator;
import io.realm.internal.p;
import io.realm.internal.OsResults;
import org.bson.types.ObjectId;
import org.bson.types.Decimal128;
import java.util.Date;
import java.util.Collection;
import java.util.Collections;
import io.realm.internal.OsList;
import java.util.ArrayList;
import java.util.List;
import c6.h;
import java.util.AbstractList;

public class l0<E> extends AbstractList<E> implements OrderedRealmCollection<E>
{
    private static final String L = "This method is only available in managed mode.";
    static final String M = "This feature is available only when the element type is implementing RealmModel.";
    private static final String N = "Objects can only be removed from inside a write transaction.";
    @h
    protected Class<E> G;
    @h
    protected String H;
    private final s<E> I;
    public final a J;
    private List<E> K;
    
    public l0() {
        this.J = null;
        this.I = null;
        this.K = new ArrayList<E>();
    }
    
    l0(final Class<E> g, final OsList list, final a j) {
        this.G = g;
        this.I = this.x(j, list, g, null);
        this.J = j;
    }
    
    l0(final String h, final OsList list, final a j) {
        this.J = j;
        this.H = h;
        this.I = this.x(j, list, null, h);
    }
    
    public l0(final E... elements) {
        if (elements != null) {
            this.J = null;
            this.I = null;
            Collections.addAll(this.K = new ArrayList<E>(elements.length), elements);
            return;
        }
        throw new IllegalArgumentException("The objects argument cannot be null");
    }
    
    private boolean B() {
        final s<E> i = this.I;
        return i != null && i.o();
    }
    
    private static boolean C(final Class<?> clazz) {
        return n0.class.isAssignableFrom(clazz);
    }
    
    @h
    private E D(final boolean b, @h final E e) {
        if (this.G0()) {
            this.r();
            if (!this.I.n()) {
                return this.get(this.I.v() - 1);
            }
        }
        else {
            final List<E> k = this.K;
            if (k != null && !k.isEmpty()) {
                final List<E> i = this.K;
                return i.get(i.size() - 1);
            }
        }
        if (!b) {
            return e;
        }
        throw new IndexOutOfBoundsException("The list is empty.");
    }
    
    private void q(@h final Object o, final boolean b) {
        if (b && o == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        this.J.h();
        this.J.K.capabilities.c("Listeners cannot be used on current thread.");
    }
    
    private void r() {
        this.J.h();
    }
    
    @h
    private E v(final boolean b, @h final E e) {
        if (this.G0()) {
            this.r();
            if (!this.I.n()) {
                return this.get(0);
            }
        }
        else {
            final List<E> k = this.K;
            if (k != null && !k.isEmpty()) {
                return this.K.get(0);
            }
        }
        if (!b) {
            return e;
        }
        throw new IndexOutOfBoundsException("The list is empty.");
    }
    
    private s<E> x(final a a, final OsList list, @h final Class<E> clazz, @h final String s) {
        if (clazz == null || C(clazz)) {
            return new o0<E>(a, list, (Class<Object>)clazz, s);
        }
        if (clazz == String.class) {
            return (s<E>)new w0(a, list, (Class<String>)clazz);
        }
        if (clazz == Long.class || clazz == Integer.class || clazz == Short.class || clazz == Byte.class) {
            return new r<E>(a, list, clazz);
        }
        if (clazz == Boolean.class) {
            return (s<E>)new io.realm.c(a, list, (Class<Boolean>)clazz);
        }
        if (clazz == byte[].class) {
            return (s<E>)new io.realm.b(a, list, (Class<byte[]>)clazz);
        }
        if (clazz == Double.class) {
            return (s<E>)new io.realm.i(a, list, (Class<Double>)clazz);
        }
        if (clazz == Float.class) {
            return (s<E>)new m(a, list, (Class<Float>)clazz);
        }
        if (clazz == Date.class) {
            return (s<E>)new f(a, list, (Class<Date>)clazz);
        }
        if (clazz == Decimal128.class) {
            return (s<E>)new g(a, list, (Class<Decimal128>)clazz);
        }
        if (clazz == ObjectId.class) {
            return (s<E>)new x(a, list, (Class<ObjectId>)clazz);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected value class: ");
        sb.append(clazz.getName());
        throw new IllegalArgumentException(sb.toString());
    }
    
    public f0 A() {
        final a j = this.J;
        if (j == null) {
            return null;
        }
        j.h();
        final a i = this.J;
        if (i instanceof f0) {
            return (f0)i;
        }
        throw new IllegalStateException("This method is only available for typed Realms");
    }
    
    @Override
    public s0<E> B3(final String[] array, final v0[] array2) {
        if (this.G0()) {
            return this.a3().G1(array, array2).b0();
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }
    
    public void E(final int i, final int j) {
        if (this.G0()) {
            this.r();
            this.I.p(i, j);
        }
        else {
            final int size = this.K.size();
            if (i < 0 || size <= i) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid index ");
                sb.append(i);
                sb.append(", size is ");
                sb.append(size);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            if (j < 0 || size <= j) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid index ");
                sb2.append(j);
                sb2.append(", size is ");
                sb2.append(size);
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            this.K.add(j, this.K.remove(i));
        }
    }
    
    public void F() {
        this.q(null, false);
        this.I.j().N();
    }
    
    public void G(final z<l0<E>> z) {
        this.q(z, true);
        this.I.j().O(this, (z<l0>)z);
    }
    
    @Override
    public boolean G0() {
        return this.J != null;
    }
    
    @h
    @Override
    public E G3(@h final E e) {
        return this.D(false, e);
    }
    
    public void H(final i0<l0<E>> i0) {
        this.q(i0, true);
        this.I.j().P(this, (i0<l0>)i0);
    }
    
    @h
    @Override
    public Number M1(final String s) {
        return this.a3().h1(s);
    }
    
    @Override
    public s0<E> R3(final String s, final v0 v0, final String s2, final v0 v2) {
        return this.B3(new String[] { s, s2 }, new v0[] { v0, v2 });
    }
    
    @Override
    public boolean T() {
        final a j = this.J;
        return j == null || (!j.isClosed() && this.B());
    }
    
    @Override
    public boolean T3() {
        if (!this.G0()) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }
        this.r();
        if (!this.I.n()) {
            this.I.f();
            ++super.modCount;
            return true;
        }
        return false;
    }
    
    @Override
    public s0<E> W5(final String s, final v0 v0) {
        if (this.G0()) {
            return this.a3().E1(s, v0).b0();
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }
    
    @Override
    public b0<E> Y3() {
        if (!this.G0()) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }
        this.r();
        if (!this.I.h()) {
            throw new UnsupportedOperationException("This feature is available only when the element type is implementing RealmModel.");
        }
        if (this.H != null) {
            final a j = this.J;
            return new b0<E>(j, OsResults.k(j.K, this.I.j().t()), this.H);
        }
        final a i = this.J;
        return new b0<E>(i, OsResults.k(i.K, this.I.j().t()), (Class<Object>)this.G);
    }
    
    @Override
    public boolean Y4() {
        return true;
    }
    
    @Override
    public Number Y6(final String s) {
        return this.a3().H1(s);
    }
    
    @Override
    public void Z6(final int n) {
        if (this.G0()) {
            this.r();
            this.I.e(n);
            ++super.modCount;
            return;
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }
    
    @Override
    public RealmQuery<E> a3() {
        if (!this.G0()) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }
        this.r();
        if (this.I.h()) {
            return RealmQuery.u(this);
        }
        throw new UnsupportedOperationException("This feature is available only when the element type is implementing RealmModel.");
    }
    
    @Override
    public boolean a5() {
        if (!this.G0()) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }
        if (!this.I.n()) {
            this.I.g();
            ++super.modCount;
            return true;
        }
        return false;
    }
    
    @Override
    public void add(final int n, @h final E e) {
        if (this.G0()) {
            this.r();
            this.I.k(n, e);
        }
        else {
            this.K.add(n, e);
        }
        ++super.modCount;
    }
    
    @Override
    public boolean add(@h final E e) {
        if (this.G0()) {
            this.r();
            this.I.a(e);
        }
        else {
            this.K.add(e);
        }
        ++super.modCount;
        return true;
    }
    
    @Override
    public void clear() {
        if (this.G0()) {
            this.r();
            this.I.r();
        }
        else {
            this.K.clear();
        }
        ++super.modCount;
    }
    
    @Override
    public boolean contains(@h final Object o) {
        if (this.G0()) {
            this.J.h();
            return (!(o instanceof p) || ((p)o).S6().g() != io.realm.internal.h.G) && super.contains(o);
        }
        return this.K.contains(o);
    }
    
    @Override
    public boolean e1() {
        return true;
    }
    
    @h
    @Override
    public E f1() {
        return this.D(true, null);
    }
    
    @h
    @Override
    public Number g3(final String s) {
        return this.a3().j1(s);
    }
    
    @h
    @Override
    public E get(final int n) {
        if (this.G0()) {
            this.r();
            return this.I.i(n);
        }
        return this.K.get(n);
    }
    
    @Override
    public boolean h5() {
        if (this.G0()) {
            final boolean n = this.I.n();
            boolean b = false;
            if (!n) {
                this.Z6(0);
                final int modCount = super.modCount;
                b = true;
                super.modCount = modCount + 1;
            }
            return b;
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }
    
    @c6.g
    @Override
    public Iterator<E> iterator() {
        if (this.G0()) {
            return new b();
        }
        return super.iterator();
    }
    
    @c6.g
    @Override
    public ListIterator<E> listIterator() {
        return this.listIterator(0);
    }
    
    @c6.g
    @Override
    public ListIterator<E> listIterator(final int index) {
        if (this.G0()) {
            return new c(index);
        }
        return super.listIterator(index);
    }
    
    public void m(final z<l0<E>> z) {
        this.q(z, true);
        this.I.j().g(this, (z<l0>)z);
    }
    
    public void n(final i0<l0<E>> i0) {
        this.q(i0, true);
        this.I.j().h(this, (i0<l0>)i0);
    }
    
    @Override
    public s0<E> n4(final String s) {
        return this.W5(s, v0.H);
    }
    
    @Override
    public boolean n6() {
        final a j = this.J;
        return j != null && j.N();
    }
    
    public io.reactivex.b0<io.realm.rx.a<l0<E>>> o() {
        final a j = this.J;
        if (j instanceof f0) {
            return j.I.q().j((f0)this.J, this);
        }
        if (j instanceof j) {
            return j.I.q().m((j)j, this);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.J.getClass());
        sb.append(" does not support RxJava2.");
        throw new UnsupportedOperationException(sb.toString());
    }
    
    @h
    @Override
    public E o2() {
        return this.v(true, null);
    }
    
    public l<l0<E>> p() {
        final a j = this.J;
        if (j instanceof f0) {
            return j.I.q().a((f0)this.J, this);
        }
        if (j instanceof j) {
            return j.I.q().b((j)this.J, this);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.J.getClass());
        sb.append(" does not support RxJava2.");
        throw new UnsupportedOperationException(sb.toString());
    }
    
    @h
    @Override
    public Date r2(final String s) {
        return this.a3().i1(s);
    }
    
    @Override
    public double r3(final String s) {
        return this.a3().d(s);
    }
    
    @Override
    public E remove(final int n) {
        E e;
        if (this.G0()) {
            this.r();
            e = this.get(n);
            this.I.q(n);
        }
        else {
            e = this.K.remove(n);
        }
        ++super.modCount;
        return e;
    }
    
    @Override
    public boolean remove(@h final Object o) {
        if (this.G0() && !this.J.Q()) {
            throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
        }
        return super.remove(o);
    }
    
    @Override
    public boolean removeAll(final Collection<?> c) {
        if (this.G0() && !this.J.Q()) {
            throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
        }
        return super.removeAll(c);
    }
    
    @Override
    public E set(final int n, @h final E e) {
        E e2;
        if (this.G0()) {
            this.r();
            e2 = this.I.s(n, e);
        }
        else {
            e2 = this.K.set(n, e);
        }
        return e2;
    }
    
    @Override
    public int size() {
        if (this.G0()) {
            this.r();
            return this.I.v();
        }
        return this.K.size();
    }
    
    long t() {
        return this.I.j().n();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final boolean g0 = this.G0();
        final int n = 0;
        final int n2 = 0;
        int i = 0;
        Label_0149: {
            if (!g0) {
                sb.append("RealmList<?>@[");
                while (i < this.size()) {
                    final E value = this.get(i);
                    if (value instanceof n0) {
                        sb.append(System.identityHashCode(value));
                    }
                    else if (value instanceof byte[]) {
                        sb.append("byte[");
                        sb.append(((byte[])(Object)value).length);
                        sb.append("]");
                    }
                    else {
                        sb.append(value);
                    }
                    sb.append(",");
                    ++i;
                }
                if (this.size() <= 0) {
                    break Label_0149;
                }
            }
            else {
                sb.append("RealmList<");
                String str = this.H;
                if (str == null) {
                    if (C(this.G)) {
                        str = this.J.H().m((Class<? extends n0>)this.G).l();
                    }
                    else {
                        final Class<E> g2 = this.G;
                        if (g2 == byte[].class) {
                            str = g2.getSimpleName();
                        }
                        else {
                            str = g2.getName();
                        }
                    }
                }
                sb.append(str);
                sb.append(">@[");
                if (!this.B()) {
                    sb.append("invalid");
                    break Label_0149;
                }
                int j = n2;
                if (C(this.G)) {
                    for (int k = n; k < this.size(); ++k) {
                        sb.append(((p)this.get(k)).S6().g().l0());
                        sb.append(",");
                    }
                    if (this.size() <= 0) {
                        break Label_0149;
                    }
                }
                else {
                    while (j < this.size()) {
                        final E value2 = this.get(j);
                        if (value2 instanceof byte[]) {
                            sb.append("byte[");
                            sb.append(((byte[])(Object)value2).length);
                            sb.append("]");
                        }
                        else {
                            sb.append(value2);
                        }
                        sb.append(",");
                        ++j;
                    }
                    if (this.size() <= 0) {
                        break Label_0149;
                    }
                }
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }
    
    public l0<E> w() {
        if (!this.G0()) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }
        if (!this.T()) {
            throw new IllegalStateException("Only valid, managed RealmLists can be frozen.");
        }
        final a w = this.J.w();
        final OsList s = this.z().s(w.K);
        final String h = this.H;
        if (h != null) {
            return new l0<E>(h, s, w);
        }
        return new l0<E>((Class<Object>)this.G, s, w);
    }
    
    @h
    @Override
    public E w6(@h final E e) {
        return this.v(false, e);
    }
    
    OsList z() {
        return this.I.j();
    }
    
    @h
    @Override
    public Date z4(final String s) {
        return this.a3().k1(s);
    }
    
    private class b implements Iterator<E>
    {
        int G;
        int H;
        int I;
        
        private b() {
            this.G = 0;
            this.H = -1;
            this.I = l0.this.modCount;
        }
        
        final void a() {
            if (l0.this.modCount == this.I) {
                return;
            }
            throw new ConcurrentModificationException();
        }
        
        @Override
        public boolean hasNext() {
            l0.this.r();
            this.a();
            return this.G != l0.this.size();
        }
        
        @h
        @Override
        public E next() {
            l0.this.r();
            this.a();
            final int g = this.G;
            try {
                final E value = l0.this.get(g);
                this.H = g;
                this.G = g + 1;
                return value;
            }
            catch (IndexOutOfBoundsException ex) {
                this.a();
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot access index ");
                sb.append(g);
                sb.append(" when size is ");
                sb.append(l0.this.size());
                sb.append(". Remember to check hasNext() before using next().");
                throw new NoSuchElementException(sb.toString());
            }
        }
        
        @Override
        public void remove() {
            l0.this.r();
            if (this.H >= 0) {
                this.a();
                try {
                    l0.this.remove(this.H);
                    final int h = this.H;
                    final int g = this.G;
                    if (h < g) {
                        this.G = g - 1;
                    }
                    this.H = -1;
                    this.I = l0.this.modCount;
                    return;
                }
                catch (IndexOutOfBoundsException ex) {
                    throw new ConcurrentModificationException();
                }
            }
            throw new IllegalStateException("Cannot call remove() twice. Must call next() in between.");
        }
    }
    
    private class c extends b implements ListIterator<E>
    {
        c(final int n) {
            if (n >= 0 && n <= l0.this.size()) {
                super.G = n;
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Starting location must be a valid index: [0, ");
            sb.append(l0.this.size() - 1);
            sb.append("]. Index was ");
            sb.append(n);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        
        @Override
        public void add(@h final E e) {
            l0.this.J.h();
            ((b)this).a();
            try {
                final int g = super.G;
                l0.this.add(g, e);
                super.H = -1;
                super.G = g + 1;
                super.I = l0.this.modCount;
            }
            catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }
        
        @Override
        public boolean hasPrevious() {
            return super.G != 0;
        }
        
        @Override
        public int nextIndex() {
            return super.G;
        }
        
        @h
        @Override
        public E previous() {
            ((b)this).a();
            final int i = super.G - 1;
            try {
                final E value = l0.this.get(i);
                super.G = i;
                super.H = i;
                return value;
            }
            catch (IndexOutOfBoundsException ex) {
                ((b)this).a();
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot access index less than zero. This was ");
                sb.append(i);
                sb.append(". Remember to check hasPrevious() before using previous().");
                throw new NoSuchElementException(sb.toString());
            }
        }
        
        @Override
        public int previousIndex() {
            return super.G - 1;
        }
        
        @Override
        public void set(@h final E e) {
            l0.this.J.h();
            if (super.H >= 0) {
                ((b)this).a();
                try {
                    l0.this.set(super.H, e);
                    super.I = l0.this.modCount;
                    return;
                }
                catch (IndexOutOfBoundsException ex) {
                    throw new ConcurrentModificationException();
                }
            }
            throw new IllegalStateException();
        }
    }
}
