// 
// Decompiled by Procyon v0.5.36
// 

package androidx.sqlite.db;

import java.util.Locale;
import android.database.sqlite.SQLiteTransactionListener;
import android.content.ContentValues;
import android.database.SQLException;
import android.os.CancellationSignal;
import androidx.annotation.p0;
import android.util.Pair;
import java.util.List;
import android.database.Cursor;
import java.io.Closeable;

public interface c extends Closeable
{
    Cursor A0(final String p0, final Object[] p1);
    
    List<Pair<String, String>> B0();
    
    void F0(final int p0);
    
    @p0(api = 16)
    void I0();
    
    @p0(api = 16)
    Cursor I1(final f p0, final CancellationSignal p1);
    
    void J0(final String p0) throws SQLException;
    
    boolean K1();
    
    boolean M3(final int p0);
    
    boolean U0();
    
    boolean U2();
    
    Cursor W2(final String p0);
    
    @p0(api = 16)
    boolean W4();
    
    Cursor Z3(final f p0);
    
    void b5(final int p0);
    
    void beginTransaction();
    
    @p0(api = 16)
    void d2(final boolean p0);
    
    long d3(final String p0, final int p1, final ContentValues p2) throws SQLException;
    
    long e2();
    
    void e3(final SQLiteTransactionListener p0);
    
    void f4(final Locale p0);
    
    String getPath();
    
    int getVersion();
    
    h h1(final String p0);
    
    boolean isOpen();
    
    void j5(final long p0);
    
    boolean m2();
    
    boolean m3();
    
    int n0(final String p0, final String p1, final Object[] p2);
    
    void n2();
    
    void p3();
    
    void r4(final SQLiteTransactionListener p0);
    
    void s2(final String p0, final Object[] p1) throws SQLException;
    
    long t2();
    
    void v2();
    
    int w2(final String p0, final int p1, final ContentValues p2, final String p3, final Object[] p4);
    
    boolean x0(final long p0);
    
    boolean x4();
    
    long y2(final long p0);
}
