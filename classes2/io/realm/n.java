// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.h;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import org.bson.types.Decimal128;
import java.util.Date;
import io.realm.internal.OsList;
import org.bson.types.ObjectId;
import io.realm.internal.r;

public enum n implements r
{
    G;
    
    private static final String H = "This object was frozen while a query for it was still running.";
    
    @Override
    public long B(final String s) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public void E(final long n, final ObjectId objectId) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public boolean G(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public void I(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public byte[] K(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public void M() {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public double O(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public long P(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public float Q(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public boolean T() {
        return false;
    }
    
    @Override
    public String U(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public OsList V(final long n, final RealmFieldType realmFieldType) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public void a0(final long n, final Date date) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public Decimal128 b(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public RealmFieldType b0(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public void c0(final long n, final double n2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public void d(final long n, final String s) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public boolean e1() {
        return false;
    }
    
    @Override
    public void f(final long n, final float n2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public Table g() {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public long getColumnCount() {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public String[] getColumnNames() {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public long h(final long n, final RealmFieldType realmFieldType) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public void i(final long n, final boolean b) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public r i0(final OsSharedRealm osSharedRealm) {
        return h.G;
    }
    
    @Override
    public boolean j(final String s) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public ObjectId k(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public void k0(final long n, final byte[] array) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public boolean l(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public long l0() {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public long m(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public void o(final long n, final long n2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public OsList p(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public void s(final long n, final long n2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public Date u(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public void v(final long n, final Decimal128 decimal128) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public boolean y(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
    
    @Override
    public void z(final long n) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
}
