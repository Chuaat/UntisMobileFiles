// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import org.bson.types.Decimal128;
import java.util.Date;
import io.realm.RealmFieldType;
import org.bson.types.ObjectId;
import io.realm.internal.core.DescriptorOrdering;
import java.lang.ref.WeakReference;
import io.realm.i0;

public class n implements r
{
    private static final String L = "The pending query has not been executed.";
    private static final String M = "The 'frontEnd' has not been set.";
    private static final String N = "The query has been executed. This 'PendingRow' is not valid anymore.";
    private OsSharedRealm G;
    private OsResults H;
    private i0<n> I;
    private WeakReference<b> J;
    private boolean K;
    
    public n(final OsSharedRealm g, final TableQuery tableQuery, final DescriptorOrdering descriptorOrdering, final boolean k) {
        this.G = g;
        this.H = OsResults.l(g, tableQuery, descriptorOrdering);
        final i0<n> i = new i0<n>() {
            public void b(final n n) {
                n.this.n();
            }
        };
        this.I = i;
        this.H.d(this, i);
        this.K = k;
        g.addPendingRow(this);
    }
    
    private void c() {
        this.H.D(this, this.I);
        this.H = null;
        this.I = null;
        this.G.removePendingRow(this);
    }
    
    private void n() {
        final WeakReference<b> j = this.J;
        if (j == null) {
            throw new IllegalStateException("The 'frontEnd' has not been set.");
        }
        final b b = j.get();
        if (b == null) {
            this.c();
            return;
        }
        if (this.H.y()) {
            final UncheckedRow r = this.H.r();
            this.c();
            r r2;
            if (r != null) {
                r2 = r;
                if (this.K) {
                    r2 = CheckedRow.q(r);
                }
            }
            else {
                r2 = h.G;
            }
            b.a(r2);
        }
        else {
            this.c();
        }
    }
    
    @Override
    public long B(final String s) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public void E(final long n, final ObjectId objectId) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public boolean G(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public void I(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public byte[] K(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public void M() {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public double O(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public long P(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public float Q(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public boolean T() {
        return false;
    }
    
    @Override
    public String U(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public OsList V(final long n, final RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public void a0(final long n, final Date date) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public Decimal128 b(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public RealmFieldType b0(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public void c0(final long n, final double n2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public void d(final long n, final String s) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    public void e() {
        if (this.H != null) {
            this.n();
            return;
        }
        throw new IllegalStateException("The query has been executed. This 'PendingRow' is not valid anymore.");
    }
    
    @Override
    public boolean e1() {
        return false;
    }
    
    @Override
    public void f(final long n, final float n2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public Table g() {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public long getColumnCount() {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public String[] getColumnNames() {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public long h(final long n, final RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public void i(final long n, final boolean b) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public r i0(final OsSharedRealm osSharedRealm) {
        return io.realm.n.G;
    }
    
    @Override
    public boolean j(final String s) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public ObjectId k(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public void k0(final long n, final byte[] array) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public boolean l(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public long l0() {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public long m(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public void o(final long n, final long n2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public OsList p(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    public void q(final b referent) {
        this.J = new WeakReference<b>(referent);
    }
    
    @Override
    public void s(final long n, final long n2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public Date u(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public void v(final long n, final Decimal128 decimal128) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public boolean y(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    @Override
    public void z(final long n) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
    
    public interface b
    {
        void a(final r p0);
    }
}
