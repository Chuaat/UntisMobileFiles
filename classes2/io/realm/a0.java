// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Date;
import io.realm.internal.Table;
import java.util.ListIterator;
import java.util.Iterator;
import io.realm.internal.p;
import java.util.Collection;
import io.realm.internal.fields.c;
import io.realm.internal.core.QueryDescriptor;
import java.util.Locale;
import io.realm.internal.UncheckedRow;
import io.realm.internal.OsResults;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import c6.h;
import java.util.AbstractList;

abstract class a0<E> extends AbstractList<E> implements OrderedRealmCollection<E>
{
    private static final String L = "This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.";
    public final io.realm.a G;
    @h
    final Class<E> H;
    @h
    final String I;
    @SuppressFBWarnings({ "SS_SHOULD_BE_STATIC" })
    final boolean J;
    final OsResults K;
    
    a0(final io.realm.a a, final OsResults osResults, final Class<E> clazz) {
        this(a, osResults, clazz, null);
    }
    
    private a0(final io.realm.a g, final OsResults k, @h final Class<E> h, @h final String i) {
        this.J = false;
        this.G = g;
        this.K = k;
        this.H = h;
        this.I = i;
    }
    
    a0(final io.realm.a a, final OsResults osResults, final String s) {
        this(a, osResults, null, s);
    }
    
    @h
    private E f(final boolean b, @h final E e) {
        final UncheckedRow r = this.K.r();
        if (r != null) {
            return this.G.C(this.H, this.I, r);
        }
        if (!b) {
            return e;
        }
        throw new IndexOutOfBoundsException("No results were found.");
    }
    
    private long h(final String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Non-empty field name required.");
        }
        if (str.contains(".")) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Aggregates on child object fields are not supported: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        final long c = this.K.u().C(str);
        if (c >= 0L) {
            return c;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' does not exist.", str));
    }
    
    private u0 l() {
        return new u0(this.G.H());
    }
    
    @h
    private E n(final boolean b, @h final E e) {
        final UncheckedRow z = this.K.z();
        if (z != null) {
            return this.G.C(this.H, this.I, z);
        }
        if (!b) {
            return e;
        }
        throw new IndexOutOfBoundsException("No results were found.");
    }
    
    @Override
    public s0<E> B3(final String[] array, final v0[] array2) {
        return this.b(this.K.d0(QueryDescriptor.getInstanceForSort(this.l(), this.K.u(), array, array2)));
    }
    
    @Override
    public boolean G0() {
        return true;
    }
    
    @h
    @Override
    public E G3(@h final E e) {
        return this.n(false, e);
    }
    
    @Override
    public Number M1(final String s) {
        this.G.h();
        return this.K.g(OsResults.o.I, this.h(s));
    }
    
    @Override
    public s0<E> R3(final String s, final v0 v0, final String s2, final v0 v2) {
        return this.B3(new String[] { s, s2 }, new v0[] { v0, v2 });
    }
    
    @Override
    public boolean T() {
        return this.K.y();
    }
    
    @Override
    public boolean T3() {
        this.G.h();
        if (this.size() > 0) {
            this.K.h();
            return true;
        }
        return false;
    }
    
    @Override
    public s0<E> W5(final String s, final v0 v0) {
        return this.b(this.K.d0(QueryDescriptor.getInstanceForSort(this.l(), this.K.u(), s, v0)));
    }
    
    @Override
    public b0<E> Y3() {
        final String i = this.I;
        if (i != null) {
            return new b0<E>(this.G, this.K, i);
        }
        return new b0<E>(this.G, this.K, this.H);
    }
    
    @Override
    public Number Y6(final String s) {
        this.G.h();
        return this.K.g(OsResults.o.K, this.h(s));
    }
    
    @Override
    public void Z6(final int n) {
        this.G.j();
        this.K.n(n);
    }
    
    @Override
    public boolean a5() {
        this.G.j();
        return this.K.p();
    }
    
    @Deprecated
    @Override
    public void add(final int n, final E e) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }
    
    @Deprecated
    @Override
    public boolean add(final E e) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }
    
    @Deprecated
    @Override
    public boolean addAll(final int n, final Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }
    
    @Deprecated
    @Override
    public boolean addAll(final Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }
    
    s0<E> b(final OsResults osResults) {
        final String i = this.I;
        s0 s0;
        if (i != null) {
            s0 = new s0(this.G, osResults, i);
        }
        else {
            s0 = new s0(this.G, osResults, this.H);
        }
        s0.Y4();
        return (s0<E>)s0;
    }
    
    @Deprecated
    @Override
    public void clear() {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }
    
    @Override
    public boolean contains(@h final Object obj) {
        if (this.e1()) {
            if (obj instanceof p && ((p)obj).S6().g() == io.realm.internal.h.G) {
                return false;
            }
            final Iterator<Object> iterator = this.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().equals(obj)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @h
    @Override
    public E f1() {
        return this.n(true, null);
    }
    
    @Override
    public Number g3(final String s) {
        this.G.h();
        return this.K.g(OsResults.o.H, this.h(s));
    }
    
    @h
    @Override
    public E get(final int n) {
        this.G.h();
        return this.G.C(this.H, this.I, this.K.v(n));
    }
    
    @Override
    public boolean h5() {
        this.G.j();
        return this.K.o();
    }
    
    OsResults i() {
        return this.K;
    }
    
    @Override
    public Iterator<E> iterator() {
        return new a();
    }
    
    public f0 k() {
        this.G.h();
        final io.realm.a g = this.G;
        if (g instanceof f0) {
            return (f0)g;
        }
        throw new IllegalStateException("This method is only available for typed Realms");
    }
    
    @Override
    public ListIterator<E> listIterator() {
        return new b(0);
    }
    
    @Override
    public ListIterator<E> listIterator(final int n) {
        return new b(n);
    }
    
    Table m() {
        return this.K.u();
    }
    
    @Override
    public s0<E> n4(final String s) {
        return this.b(this.K.d0(QueryDescriptor.getInstanceForSort(this.l(), this.K.u(), s, v0.H)));
    }
    
    @h
    @Override
    public E o2() {
        return this.f(true, null);
    }
    
    @h
    @Override
    public Date r2(final String s) {
        this.G.h();
        return this.K.f(OsResults.o.I, this.h(s));
    }
    
    @Override
    public double r3(final String s) {
        this.G.h();
        return this.K.g(OsResults.o.J, this.h(s)).doubleValue();
    }
    
    @Deprecated
    @Override
    public E remove(final int n) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }
    
    @Deprecated
    @Override
    public boolean remove(final Object o) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }
    
    @Deprecated
    @Override
    public boolean removeAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }
    
    @Deprecated
    @Override
    public boolean retainAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }
    
    @Deprecated
    @Override
    public E set(final int n, final E e) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }
    
    @Override
    public int size() {
        if (this.e1()) {
            final long c0 = this.K.c0();
            int n;
            if (c0 > 2147483647L) {
                n = Integer.MAX_VALUE;
            }
            else {
                n = (int)c0;
            }
            return n;
        }
        return 0;
    }
    
    @h
    @Override
    public E w6(@h final E e) {
        return this.f(false, e);
    }
    
    @Override
    public Date z4(final String s) {
        this.G.h();
        return this.K.f(OsResults.o.H, this.h(s));
    }
    
    private class a extends p<E>
    {
        a() {
            super(a0.this.K);
        }
        
        @Override
        protected E b(final UncheckedRow uncheckedRow) {
            final a0 i = a0.this;
            return i.G.C(i.H, i.I, uncheckedRow);
        }
    }
    
    private class b extends q<E>
    {
        b(final int n) {
            super(a0.this.K, n);
        }
        
        @Override
        protected E b(final UncheckedRow uncheckedRow) {
            final a0 i = a0.this;
            return i.G.C(i.H, i.I, uncheckedRow);
        }
    }
}
