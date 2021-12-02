// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Date;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import io.realm.internal.UncheckedRow;
import c6.h;
import java.util.Locale;
import io.realm.internal.OsResults;

public class b0<E> extends a0<E>
{
    private int M;
    
    b0(final io.realm.a a, final OsResults osResults, final Class<E> clazz) {
        super(a, osResults.m(), clazz);
        this.M = -1;
    }
    
    b0(final io.realm.a a, final OsResults osResults, final String s) {
        super(a, osResults.m(), s);
        this.M = -1;
    }
    
    private UnsupportedOperationException p(final String s) {
        return new UnsupportedOperationException(String.format(Locale.US, "'%s()' is not supported by OrderedRealmCollectionSnapshot. Call '%s()' on the original 'RealmCollection' instead.", s, s));
    }
    
    @Override
    public s0<E> B3(final String[] array, final v0[] array2) {
        throw this.p("sort");
    }
    
    @Override
    public s0<E> R3(final String s, final v0 v0, final String s2, final v0 v2) {
        throw this.p("sort");
    }
    
    @Override
    public boolean T3() {
        return super.T3();
    }
    
    @Override
    public s0<E> W5(final String s, final v0 v0) {
        throw this.p("sort");
    }
    
    @Override
    public b0<E> Y3() {
        super.G.h();
        return this;
    }
    
    @Override
    public boolean Y4() {
        return true;
    }
    
    @Override
    public void Z6(final int n) {
        super.G.j();
        if (super.K.v(n).T()) {
            super.K.n(n);
        }
    }
    
    @Deprecated
    @Override
    public RealmQuery<E> a3() {
        throw this.p("where");
    }
    
    @Override
    public boolean a5() {
        super.G.j();
        final UncheckedRow z = super.K.z();
        return z != null && z.T() && super.K.p();
    }
    
    @Override
    public boolean e1() {
        return true;
    }
    
    @Override
    public boolean h5() {
        super.G.j();
        final UncheckedRow r = super.K.r();
        return r != null && r.T() && super.K.o();
    }
    
    @Override
    public s0<E> n4(final String s) {
        throw this.p("sort");
    }
    
    @Override
    public boolean n6() {
        return false;
    }
    
    public OrderedRealmCollection<E> o() {
        throw this.p("freeze");
    }
    
    @Override
    public int size() {
        if (this.M == -1) {
            this.M = super.size();
        }
        return this.M;
    }
}
