// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import androidx.sqlite.db.h;
import java.util.Locale;
import android.database.sqlite.SQLiteTransactionListener;
import android.content.ContentValues;
import java.io.IOException;
import android.database.SQLException;
import androidx.sqlite.db.e;
import android.os.CancellationSignal;
import androidx.annotation.p0;
import android.util.Pair;
import java.util.Collection;
import java.util.Arrays;
import android.database.Cursor;
import java.util.ArrayList;
import androidx.sqlite.db.f;
import java.util.List;
import java.util.Collections;
import androidx.annotation.j0;
import java.util.concurrent.Executor;
import androidx.sqlite.db.c;

final class a2 implements c
{
    private final c G;
    private final r2.f H;
    private final Executor I;
    
    a2(@j0 final c g, @j0 final r2.f h, @j0 final Executor i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @j0
    @Override
    public Cursor A0(@j0 final String s, @j0 final Object[] a) {
        final ArrayList list = new ArrayList();
        list.addAll(Arrays.asList(a));
        this.I.execute(new q1(this, s, list));
        return this.G.A0(s, a);
    }
    
    @j0
    @Override
    public List<Pair<String, String>> B0() {
        return this.G.B0();
    }
    
    @Override
    public void F0(final int n) {
        this.G.F0(n);
    }
    
    @p0(api = 16)
    @Override
    public void I0() {
        this.G.I0();
    }
    
    @j0
    @Override
    public Cursor I1(@j0 final f f, @j0 final CancellationSignal cancellationSignal) {
        final d2 d2 = new d2();
        f.c(d2);
        this.I.execute(new x1(this, f, d2));
        return this.G.Z3(f);
    }
    
    @Override
    public void J0(@j0 final String s) throws SQLException {
        this.I.execute(new y1(this, s));
        this.G.J0(s);
    }
    
    @Override
    public boolean K1() {
        return this.G.K1();
    }
    
    @Override
    public boolean M3(final int n) {
        return this.G.M3(n);
    }
    
    @Override
    public boolean U0() {
        return this.G.U0();
    }
    
    @Override
    public boolean U2() {
        return this.G.U2();
    }
    
    @j0
    @Override
    public Cursor W2(@j0 final String s) {
        this.I.execute(new z1(this, s));
        return this.G.W2(s);
    }
    
    @p0(api = 16)
    @Override
    public boolean W4() {
        return this.G.W4();
    }
    
    @j0
    @Override
    public Cursor Z3(@j0 final f f) {
        final d2 d2 = new d2();
        f.c(d2);
        this.I.execute(new w1(this, f, d2));
        return this.G.Z3(f);
    }
    
    @Override
    public void b5(final int n) {
        this.G.b5(n);
    }
    
    @Override
    public void beginTransaction() {
        this.I.execute(new u1(this));
        this.G.beginTransaction();
    }
    
    @Override
    public void close() throws IOException {
        this.G.close();
    }
    
    @p0(api = 16)
    @Override
    public void d2(final boolean b) {
        this.G.d2(b);
    }
    
    @Override
    public long d3(@j0 final String s, final int n, @j0 final ContentValues contentValues) throws SQLException {
        return this.G.d3(s, n, contentValues);
    }
    
    @Override
    public long e2() {
        return this.G.e2();
    }
    
    @Override
    public void e3(@j0 final SQLiteTransactionListener sqLiteTransactionListener) {
        this.I.execute(new v1(this));
        this.G.e3(sqLiteTransactionListener);
    }
    
    @Override
    public void f4(@j0 final Locale locale) {
        this.G.f4(locale);
    }
    
    @j0
    @Override
    public String getPath() {
        return this.G.getPath();
    }
    
    @Override
    public int getVersion() {
        return this.G.getVersion();
    }
    
    @j0
    @Override
    public h h1(@j0 final String s) {
        return new j2(this.G.h1(s), this.H, s, this.I);
    }
    
    @Override
    public boolean isOpen() {
        return this.G.isOpen();
    }
    
    @Override
    public void j5(final long n) {
        this.G.j5(n);
    }
    
    @Override
    public boolean m2() {
        return this.G.m2();
    }
    
    @Override
    public boolean m3() {
        return this.G.m3();
    }
    
    @Override
    public int n0(@j0 final String s, @j0 final String s2, @j0 final Object[] array) {
        return this.G.n0(s, s2, array);
    }
    
    @Override
    public void n2() {
        this.I.execute(new s1(this));
        this.G.n2();
    }
    
    @Override
    public void p3() {
        this.I.execute(new o1(this));
        this.G.p3();
    }
    
    @Override
    public void r4(@j0 final SQLiteTransactionListener sqLiteTransactionListener) {
        this.I.execute(new t1(this));
        this.G.r4(sqLiteTransactionListener);
    }
    
    @Override
    public void s2(@j0 final String s, @j0 final Object[] a) throws SQLException {
        final ArrayList list = new ArrayList();
        list.addAll(Arrays.asList(a));
        this.I.execute(new p1(this, s, list));
        this.G.s2(s, list.toArray());
    }
    
    @Override
    public long t2() {
        return this.G.t2();
    }
    
    @Override
    public void v2() {
        this.I.execute(new r1(this));
        this.G.v2();
    }
    
    @Override
    public int w2(@j0 final String s, final int n, @j0 final ContentValues contentValues, @j0 final String s2, @j0 final Object[] array) {
        return this.G.w2(s, n, contentValues, s2, array);
    }
    
    @Override
    public boolean x0(final long n) {
        return this.G.x0(n);
    }
    
    @Override
    public boolean x4() {
        return this.G.x4();
    }
    
    @Override
    public long y2(final long n) {
        return this.G.y2(n);
    }
}
