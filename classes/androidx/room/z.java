// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import android.content.ContentResolver;
import android.database.DataSetObserver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.database.CharArrayBuffer;
import java.util.ArrayList;
import android.database.sqlite.SQLiteTransactionListener;
import android.annotation.SuppressLint;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
import android.database.Cursor;
import android.content.ContentValues;
import java.util.Locale;
import android.os.Build$VERSION;
import androidx.annotation.k0;
import java.io.IOException;
import androidx.room.util.f;
import androidx.sqlite.db.c;
import androidx.annotation.j0;
import androidx.sqlite.db.d;

final class z implements d, p0
{
    @j0
    private final d G;
    @j0
    private final a H;
    @j0
    private final androidx.room.a I;
    
    z(@j0 final d g, @j0 final androidx.room.a i) {
        this.G = g;
        (this.I = i).g(g);
        this.H = new a(i);
    }
    
    @j0
    @androidx.annotation.p0(api = 24)
    @Override
    public androidx.sqlite.db.c E2() {
        this.H.N();
        return this.H;
    }
    
    @j0
    @androidx.annotation.p0(api = 24)
    @Override
    public androidx.sqlite.db.c T2() {
        this.H.N();
        return this.H;
    }
    
    @j0
    androidx.room.a a() {
        return this.I;
    }
    
    @j0
    androidx.sqlite.db.c b() {
        return this.H;
    }
    
    @Override
    public void close() {
        try {
            this.H.close();
        }
        catch (IOException ex) {
            f.a(ex);
        }
    }
    
    @j0
    @Override
    public d f() {
        return this.G;
    }
    
    @k0
    @Override
    public String getDatabaseName() {
        return this.G.getDatabaseName();
    }
    
    @androidx.annotation.p0(api = 16)
    @Override
    public void setWriteAheadLoggingEnabled(final boolean writeAheadLoggingEnabled) {
        this.G.setWriteAheadLoggingEnabled(writeAheadLoggingEnabled);
    }
    
    static final class a implements c
    {
        @j0
        private final androidx.room.a G;
        
        a(@j0 final androidx.room.a g) {
            this.G = g;
        }
        
        @Override
        public Cursor A0(final String s, final Object[] array) {
            try {
                return (Cursor)new z.c(this.G.f().A0(s, array), this.G);
            }
            finally {
                this.G.b();
            }
        }
        
        @Override
        public List<Pair<String, String>> B0() {
            return this.G.c((g.a<c, List<Pair<String, String>>>)g.a);
        }
        
        @Override
        public void F0(final int n) {
            this.G.c((g.a<c, Object>)new r(n));
        }
        
        @Override
        public void I0() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }
        
        @androidx.annotation.p0(api = 24)
        @Override
        public Cursor I1(final androidx.sqlite.db.f f, final CancellationSignal cancellationSignal) {
            try {
                return (Cursor)new z.c(this.G.f().I1(f, cancellationSignal), this.G);
            }
            finally {
                this.G.b();
            }
        }
        
        @Override
        public void J0(final String s) throws SQLException {
            this.G.c((g.a<c, Object>)new u(s));
        }
        
        @Override
        public boolean K1() {
            return this.G.c((g.a<c, Boolean>)n.a);
        }
        
        @Override
        public boolean M3(final int n) {
            return this.G.c((g.a<c, Boolean>)new androidx.room.b(n));
        }
        
        void N() {
            this.G.c((g.a<c, Object>)androidx.room.f.a);
        }
        
        @Override
        public boolean U0() {
            return this.G.c((g.a<c, Boolean>)k.a);
        }
        
        @Override
        public boolean U2() {
            return this.G.c((g.a<c, Boolean>)o.a);
        }
        
        @Override
        public Cursor W2(final String s) {
            try {
                return (Cursor)new z.c(this.G.f().W2(s), this.G);
            }
            finally {
                this.G.b();
            }
        }
        
        @SuppressLint({ "UnsafeNewApiCall" })
        @androidx.annotation.p0(api = 16)
        @Override
        public boolean W4() {
            return this.G.c((g.a<c, Boolean>)e.a);
        }
        
        @Override
        public Cursor Z3(final androidx.sqlite.db.f f) {
            try {
                return (Cursor)new z.c(this.G.f().Z3(f), this.G);
            }
            finally {
                this.G.b();
            }
        }
        
        @Override
        public void b5(final int n) {
            this.G.c((g.a<c, Object>)new m(n));
        }
        
        @Override
        public void beginTransaction() {
            final c f = this.G.f();
            try {
                f.beginTransaction();
            }
            finally {
                this.G.b();
            }
        }
        
        @Override
        public void close() throws IOException {
            this.G.a();
        }
        
        @SuppressLint({ "UnsafeNewApiCall" })
        @androidx.annotation.p0(api = 16)
        @Override
        public void d2(final boolean b) {
            this.G.c((g.a<c, Object>)new androidx.room.d(b));
        }
        
        @Override
        public long d3(final String s, final int n, final ContentValues contentValues) throws SQLException {
            return this.G.c((g.a<c, Long>)new v(s, n, contentValues));
        }
        
        @Override
        public long e2() {
            return this.G.c((g.a<c, Long>)q.a);
        }
        
        @Override
        public void e3(final SQLiteTransactionListener sqLiteTransactionListener) {
            final c f = this.G.f();
            try {
                f.e3(sqLiteTransactionListener);
            }
            finally {
                this.G.b();
            }
        }
        
        @Override
        public void f4(final Locale locale) {
            this.G.c((g.a<c, Object>)new c(locale));
        }
        
        @Override
        public String getPath() {
            return this.G.c((g.a<c, String>)h.a);
        }
        
        @Override
        public int getVersion() {
            return this.G.c((g.a<c, Integer>)i.a);
        }
        
        @Override
        public androidx.sqlite.db.h h1(final String s) {
            return new b(s, this.G);
        }
        
        @Override
        public boolean isOpen() {
            final c d = this.G.d();
            return d != null && d.isOpen();
        }
        
        @Override
        public void j5(final long n) {
            this.G.c((g.a<c, Object>)new s(n));
        }
        
        @Override
        public boolean m2() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }
        
        @Override
        public boolean m3() {
            return this.G.d() != null && this.G.c((g.a<c, Boolean>)l.a);
        }
        
        @Override
        public int n0(final String s, final String s2, final Object[] array) {
            return this.G.c((g.a<c, Integer>)new x(s, s2, array));
        }
        
        @Override
        public void n2() {
            final c d = this.G.d();
            if (d != null) {
                d.n2();
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
        }
        
        @Override
        public void p3() {
            if (this.G.d() != null) {
                try {
                    this.G.d().p3();
                    return;
                }
                finally {
                    this.G.b();
                }
            }
            throw new IllegalStateException("End transaction called but delegateDb is null");
        }
        
        @Override
        public void r4(final SQLiteTransactionListener sqLiteTransactionListener) {
            final c f = this.G.f();
            try {
                f.r4(sqLiteTransactionListener);
            }
            finally {
                this.G.b();
            }
        }
        
        @Override
        public void s2(final String s, final Object[] array) throws SQLException {
            this.G.c((g.a<c, Object>)new y(s, array));
        }
        
        @Override
        public long t2() {
            return this.G.c((g.a<c, Long>)p.a);
        }
        
        @Override
        public void v2() {
            final c f = this.G.f();
            try {
                f.v2();
            }
            finally {
                this.G.b();
            }
        }
        
        @Override
        public int w2(final String s, final int n, final ContentValues contentValues, final String s2, final Object[] array) {
            return this.G.c((g.a<c, Integer>)new w(s, n, contentValues, s2, array));
        }
        
        @Override
        public boolean x0(final long n) {
            return this.G.c((g.a<c, Boolean>)o.a);
        }
        
        @Override
        public boolean x4() {
            return this.G.d() != null && this.G.c((g.a<c, Boolean>)j.a);
        }
        
        @Override
        public long y2(final long n) {
            return this.G.c((g.a<c, Long>)new t(n));
        }
    }
    
    private static class b implements h
    {
        private final String G;
        private final ArrayList<Object> H;
        private final androidx.room.a I;
        
        b(final String g, final androidx.room.a i) {
            this.H = new ArrayList<Object>();
            this.G = g;
            this.I = i;
        }
        
        private void c(final h h) {
            int n;
            for (int i = 0; i < this.H.size(); i = n) {
                n = i + 1;
                final Object value = this.H.get(i);
                if (value == null) {
                    h.c4(n);
                }
                else if (value instanceof Long) {
                    h.l2(n, (long)value);
                }
                else if (value instanceof Double) {
                    h.r1(n, (double)value);
                }
                else if (value instanceof String) {
                    h.K0(n, (String)value);
                }
                else if (value instanceof byte[]) {
                    h.H2(n, (byte[])value);
                }
            }
        }
        
        private <T> T d(final g.a<h, T> a) {
            return this.I.c((g.a<androidx.sqlite.db.c, T>)new a0(this, a));
        }
        
        private void g(int i, final Object element) {
            final int index = i - 1;
            if (index >= this.H.size()) {
                for (i = this.H.size(); i <= index; ++i) {
                    this.H.add(null);
                }
            }
            this.H.set(index, element);
        }
        
        @Override
        public long F5() {
            return this.d((g.a<h, Long>)e0.a);
        }
        
        @Override
        public void H2(final int n, final byte[] array) {
            this.g(n, array);
        }
        
        @Override
        public void K0(final int n, final String s) {
            this.g(n, s);
        }
        
        @Override
        public String R2() {
            return this.d((g.a<h, String>)d0.a);
        }
        
        @Override
        public int c1() {
            return this.d((g.a<h, Integer>)c0.a);
        }
        
        @Override
        public void c4(final int n) {
            this.g(n, null);
        }
        
        @Override
        public void close() throws IOException {
        }
        
        @Override
        public void l2(final int n, final long l) {
            this.g(n, l);
        }
        
        @Override
        public void m5() {
            this.H.clear();
        }
        
        @Override
        public void p() {
            this.d((g.a<h, Object>)b0.a);
        }
        
        @Override
        public void r1(final int n, final double d) {
            this.g(n, d);
        }
        
        @Override
        public long z0() {
            return this.d((g.a<h, Long>)f0.a);
        }
    }
    
    private static final class c implements Cursor
    {
        private final Cursor G;
        private final androidx.room.a H;
        
        c(final Cursor g, final androidx.room.a h) {
            this.G = g;
            this.H = h;
        }
        
        public void close() {
            this.G.close();
            this.H.b();
        }
        
        public void copyStringToBuffer(final int n, final CharArrayBuffer charArrayBuffer) {
            this.G.copyStringToBuffer(n, charArrayBuffer);
        }
        
        @Deprecated
        public void deactivate() {
            this.G.deactivate();
        }
        
        public byte[] getBlob(final int n) {
            return this.G.getBlob(n);
        }
        
        public int getColumnCount() {
            return this.G.getColumnCount();
        }
        
        public int getColumnIndex(final String s) {
            return this.G.getColumnIndex(s);
        }
        
        public int getColumnIndexOrThrow(final String s) throws IllegalArgumentException {
            return this.G.getColumnIndexOrThrow(s);
        }
        
        public String getColumnName(final int n) {
            return this.G.getColumnName(n);
        }
        
        public String[] getColumnNames() {
            return this.G.getColumnNames();
        }
        
        public int getCount() {
            return this.G.getCount();
        }
        
        public double getDouble(final int n) {
            return this.G.getDouble(n);
        }
        
        public Bundle getExtras() {
            return this.G.getExtras();
        }
        
        public float getFloat(final int n) {
            return this.G.getFloat(n);
        }
        
        public int getInt(final int n) {
            return this.G.getInt(n);
        }
        
        public long getLong(final int n) {
            return this.G.getLong(n);
        }
        
        @SuppressLint({ "UnsafeNewApiCall" })
        @androidx.annotation.p0(api = 19)
        public Uri getNotificationUri() {
            return this.G.getNotificationUri();
        }
        
        @SuppressLint({ "UnsafeNewApiCall" })
        @k0
        @androidx.annotation.p0(api = 29)
        public List<Uri> getNotificationUris() {
            return (List<Uri>)this.G.getNotificationUris();
        }
        
        public int getPosition() {
            return this.G.getPosition();
        }
        
        public short getShort(final int n) {
            return this.G.getShort(n);
        }
        
        public String getString(final int n) {
            return this.G.getString(n);
        }
        
        public int getType(final int n) {
            return this.G.getType(n);
        }
        
        public boolean getWantsAllOnMoveCalls() {
            return this.G.getWantsAllOnMoveCalls();
        }
        
        public boolean isAfterLast() {
            return this.G.isAfterLast();
        }
        
        public boolean isBeforeFirst() {
            return this.G.isBeforeFirst();
        }
        
        public boolean isClosed() {
            return this.G.isClosed();
        }
        
        public boolean isFirst() {
            return this.G.isFirst();
        }
        
        public boolean isLast() {
            return this.G.isLast();
        }
        
        public boolean isNull(final int n) {
            return this.G.isNull(n);
        }
        
        public boolean move(final int n) {
            return this.G.move(n);
        }
        
        public boolean moveToFirst() {
            return this.G.moveToFirst();
        }
        
        public boolean moveToLast() {
            return this.G.moveToLast();
        }
        
        public boolean moveToNext() {
            return this.G.moveToNext();
        }
        
        public boolean moveToPosition(final int n) {
            return this.G.moveToPosition(n);
        }
        
        public boolean moveToPrevious() {
            return this.G.moveToPrevious();
        }
        
        public void registerContentObserver(final ContentObserver contentObserver) {
            this.G.registerContentObserver(contentObserver);
        }
        
        public void registerDataSetObserver(final DataSetObserver dataSetObserver) {
            this.G.registerDataSetObserver(dataSetObserver);
        }
        
        @Deprecated
        public boolean requery() {
            return this.G.requery();
        }
        
        public Bundle respond(final Bundle bundle) {
            return this.G.respond(bundle);
        }
        
        @SuppressLint({ "UnsafeNewApiCall" })
        @androidx.annotation.p0(api = 23)
        public void setExtras(final Bundle extras) {
            this.G.setExtras(extras);
        }
        
        public void setNotificationUri(final ContentResolver contentResolver, final Uri uri) {
            this.G.setNotificationUri(contentResolver, uri);
        }
        
        @SuppressLint({ "UnsafeNewApiCall" })
        @androidx.annotation.p0(api = 29)
        public void setNotificationUris(@j0 final ContentResolver contentResolver, @j0 final List<Uri> list) {
            this.G.setNotificationUris(contentResolver, (List)list);
        }
        
        public void unregisterContentObserver(final ContentObserver contentObserver) {
            this.G.unregisterContentObserver(contentObserver);
        }
        
        public void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
            this.G.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
