// 
// Decompiled by Procyon v0.5.36
// 

package androidx.sqlite.db.framework;

import java.util.Iterator;
import android.text.TextUtils;
import androidx.sqlite.db.h;
import java.util.Locale;
import android.database.sqlite.SQLiteTransactionListener;
import android.content.ContentValues;
import java.io.IOException;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import androidx.sqlite.db.e;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.os.CancellationSignal;
import androidx.annotation.p0;
import android.util.Pair;
import java.util.List;
import androidx.sqlite.db.f;
import androidx.sqlite.db.b;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.db.c;

class a implements c
{
    private static final String[] H;
    private static final String[] I;
    private final SQLiteDatabase G;
    
    static {
        H = new String[] { "", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE " };
        I = new String[0];
    }
    
    a(final SQLiteDatabase g) {
        this.G = g;
    }
    
    @Override
    public Cursor A0(final String s, final Object[] array) {
        return this.Z3(new b(s, array));
    }
    
    @Override
    public List<Pair<String, String>> B0() {
        return (List<Pair<String, String>>)this.G.getAttachedDbs();
    }
    
    @Override
    public void F0(final int version) {
        this.G.setVersion(version);
    }
    
    @p0(api = 16)
    @Override
    public void I0() {
        this.G.disableWriteAheadLogging();
    }
    
    @p0(api = 16)
    @Override
    public Cursor I1(final f f, final CancellationSignal cancellationSignal) {
        return this.G.rawQueryWithFactory((SQLiteDatabase$CursorFactory)new SQLiteDatabase$CursorFactory() {
            public Cursor newCursor(final SQLiteDatabase sqLiteDatabase, final SQLiteCursorDriver sqLiteCursorDriver, final String s, final SQLiteQuery sqLiteQuery) {
                f.c(new d((SQLiteProgram)sqLiteQuery));
                return (Cursor)new SQLiteCursor(sqLiteCursorDriver, s, sqLiteQuery);
            }
        }, f.b(), a.I, (String)null, cancellationSignal);
    }
    
    @Override
    public void J0(final String s) throws SQLException {
        this.G.execSQL(s);
    }
    
    @Override
    public boolean K1() {
        return this.G.isReadOnly();
    }
    
    @Override
    public boolean M3(final int n) {
        return this.G.needUpgrade(n);
    }
    
    @Override
    public boolean U0() {
        return this.G.isDatabaseIntegrityOk();
    }
    
    @Override
    public boolean U2() {
        return this.G.yieldIfContendedSafely();
    }
    
    @Override
    public Cursor W2(final String s) {
        return this.Z3(new b(s));
    }
    
    @p0(api = 16)
    @Override
    public boolean W4() {
        return this.G.isWriteAheadLoggingEnabled();
    }
    
    @Override
    public Cursor Z3(final f f) {
        return this.G.rawQueryWithFactory((SQLiteDatabase$CursorFactory)new SQLiteDatabase$CursorFactory() {
            public Cursor newCursor(final SQLiteDatabase sqLiteDatabase, final SQLiteCursorDriver sqLiteCursorDriver, final String s, final SQLiteQuery sqLiteQuery) {
                f.c(new d((SQLiteProgram)sqLiteQuery));
                return (Cursor)new SQLiteCursor(sqLiteCursorDriver, s, sqLiteQuery);
            }
        }, f.b(), a.I, (String)null);
    }
    
    boolean a(final SQLiteDatabase sqLiteDatabase) {
        return this.G == sqLiteDatabase;
    }
    
    @Override
    public void b5(final int maxSqlCacheSize) {
        this.G.setMaxSqlCacheSize(maxSqlCacheSize);
    }
    
    @Override
    public void beginTransaction() {
        this.G.beginTransaction();
    }
    
    @Override
    public void close() throws IOException {
        this.G.close();
    }
    
    @p0(api = 16)
    @Override
    public void d2(final boolean foreignKeyConstraintsEnabled) {
        this.G.setForeignKeyConstraintsEnabled(foreignKeyConstraintsEnabled);
    }
    
    @Override
    public long d3(final String s, final int n, final ContentValues contentValues) throws SQLException {
        return this.G.insertWithOnConflict(s, (String)null, contentValues, n);
    }
    
    @Override
    public long e2() {
        return this.G.getPageSize();
    }
    
    @Override
    public void e3(final SQLiteTransactionListener sqLiteTransactionListener) {
        this.G.beginTransactionWithListener(sqLiteTransactionListener);
    }
    
    @Override
    public void f4(final Locale locale) {
        this.G.setLocale(locale);
    }
    
    @Override
    public String getPath() {
        return this.G.getPath();
    }
    
    @Override
    public int getVersion() {
        return this.G.getVersion();
    }
    
    @Override
    public h h1(final String s) {
        return new androidx.sqlite.db.framework.e(this.G.compileStatement(s));
    }
    
    @Override
    public boolean isOpen() {
        return this.G.isOpen();
    }
    
    @Override
    public void j5(final long pageSize) {
        this.G.setPageSize(pageSize);
    }
    
    @Override
    public boolean m2() {
        return this.G.enableWriteAheadLogging();
    }
    
    @Override
    public boolean m3() {
        return this.G.isDbLockedByCurrentThread();
    }
    
    @Override
    public int n0(String string, final String str, final Object[] array) {
        final StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(string);
        if (TextUtils.isEmpty((CharSequence)str)) {
            string = "";
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(" WHERE ");
            sb2.append(str);
            string = sb2.toString();
        }
        sb.append(string);
        final h h1 = this.h1(sb.toString());
        b.e(h1, array);
        return h1.c1();
    }
    
    @Override
    public void n2() {
        this.G.setTransactionSuccessful();
    }
    
    @Override
    public void p3() {
        this.G.endTransaction();
    }
    
    @Override
    public void r4(final SQLiteTransactionListener sqLiteTransactionListener) {
        this.G.beginTransactionWithListenerNonExclusive(sqLiteTransactionListener);
    }
    
    @Override
    public void s2(final String s, final Object[] array) throws SQLException {
        this.G.execSQL(s, array);
    }
    
    @Override
    public long t2() {
        return this.G.getMaximumSize();
    }
    
    @Override
    public void v2() {
        this.G.beginTransactionNonExclusive();
    }
    
    @Override
    public int w2(String s, int size, final ContentValues contentValues, final String str, final Object[] array) {
        if (contentValues != null && contentValues.size() != 0) {
            final StringBuilder sb = new StringBuilder(120);
            sb.append("UPDATE ");
            sb.append(a.H[size]);
            sb.append(s);
            sb.append(" SET ");
            size = contentValues.size();
            int n;
            if (array == null) {
                n = size;
            }
            else {
                n = array.length + size;
            }
            final Object[] array2 = new Object[n];
            int n2 = 0;
            for (final String str2 : contentValues.keySet()) {
                if (n2 > 0) {
                    s = ",";
                }
                else {
                    s = "";
                }
                sb.append(s);
                sb.append(str2);
                array2[n2] = contentValues.get(str2);
                sb.append("=?");
                ++n2;
            }
            if (array != null) {
                for (int i = size; i < n; ++i) {
                    array2[i] = array[i - size];
                }
            }
            if (!TextUtils.isEmpty((CharSequence)str)) {
                sb.append(" WHERE ");
                sb.append(str);
            }
            final h h1 = this.h1(sb.toString());
            b.e(h1, array2);
            return h1.c1();
        }
        throw new IllegalArgumentException("Empty values");
    }
    
    @Override
    public boolean x0(final long n) {
        return this.G.yieldIfContendedSafely(n);
    }
    
    @Override
    public boolean x4() {
        return this.G.inTransaction();
    }
    
    @Override
    public long y2(final long maximumSize) {
        return this.G.setMaximumSize(maximumSize);
    }
}
