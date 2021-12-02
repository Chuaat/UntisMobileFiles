// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import org.bson.types.Decimal128;
import java.util.Date;
import io.realm.RealmFieldType;
import org.bson.types.ObjectId;

public enum h implements r
{
    G;
    
    private RuntimeException n0() {
        return new IllegalStateException("Object is no longer managed by Realm. Has it been deleted?");
    }
    
    @Override
    public long B(final String s) {
        throw this.n0();
    }
    
    @Override
    public void E(final long n, final ObjectId objectId) {
        throw this.n0();
    }
    
    @Override
    public boolean G(final long n) {
        throw this.n0();
    }
    
    @Override
    public void I(final long n) {
        throw this.n0();
    }
    
    @Override
    public byte[] K(final long n) {
        throw this.n0();
    }
    
    @Override
    public void M() {
        throw this.n0();
    }
    
    @Override
    public double O(final long n) {
        throw this.n0();
    }
    
    @Override
    public long P(final long n) {
        throw this.n0();
    }
    
    @Override
    public float Q(final long n) {
        throw this.n0();
    }
    
    @Override
    public boolean T() {
        return false;
    }
    
    @Override
    public String U(final long n) {
        throw this.n0();
    }
    
    @Override
    public OsList V(final long n, final RealmFieldType realmFieldType) {
        throw this.n0();
    }
    
    @Override
    public void a0(final long n, final Date date) {
        throw this.n0();
    }
    
    @Override
    public Decimal128 b(final long n) {
        throw this.n0();
    }
    
    @Override
    public RealmFieldType b0(final long n) {
        throw this.n0();
    }
    
    @Override
    public void c0(final long n, final double n2) {
        throw this.n0();
    }
    
    @Override
    public void d(final long n, final String s) {
        throw this.n0();
    }
    
    @Override
    public boolean e1() {
        return true;
    }
    
    @Override
    public void f(final long n, final float n2) {
        throw this.n0();
    }
    
    @Override
    public Table g() {
        throw this.n0();
    }
    
    @Override
    public long getColumnCount() {
        throw this.n0();
    }
    
    @Override
    public String[] getColumnNames() {
        throw this.n0();
    }
    
    @Override
    public long h(final long n, final RealmFieldType realmFieldType) {
        throw this.n0();
    }
    
    @Override
    public void i(final long n, final boolean b) {
        throw this.n0();
    }
    
    @Override
    public r i0(final OsSharedRealm osSharedRealm) {
        return h.G;
    }
    
    @Override
    public boolean j(final String s) {
        throw this.n0();
    }
    
    @Override
    public ObjectId k(final long n) {
        throw this.n0();
    }
    
    @Override
    public void k0(final long n, final byte[] array) {
        throw this.n0();
    }
    
    @Override
    public boolean l(final long n) {
        throw this.n0();
    }
    
    @Override
    public long l0() {
        throw this.n0();
    }
    
    @Override
    public long m(final long n) {
        throw this.n0();
    }
    
    @Override
    public void o(final long n, final long n2) {
        throw this.n0();
    }
    
    @Override
    public OsList p(final long n) {
        throw this.n0();
    }
    
    @Override
    public void s(final long n, final long n2) {
        throw this.n0();
    }
    
    @Override
    public Date u(final long n) {
        throw this.n0();
    }
    
    @Override
    public void v(final long n, final Decimal128 decimal128) {
        throw this.n0();
    }
    
    @Override
    public boolean y(final long n) {
        throw this.n0();
    }
    
    @Override
    public void z(final long n) {
        throw this.n0();
    }
}
