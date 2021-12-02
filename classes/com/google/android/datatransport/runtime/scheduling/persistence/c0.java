// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.annotation.t0;
import java.util.Objects;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.Map;
import java.util.List;
import androidx.annotation.k0;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import androidx.annotation.b1;
import android.database.Cursor;
import java.util.Iterator;
import android.util.Base64;
import android.content.ContentValues;
import com.google.android.datatransport.runtime.o;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.time.h;
import com.google.android.datatransport.runtime.time.a;
import androidx.annotation.c1;
import e6.f;
import b2.b;

@f
@c1
public class c0 implements com.google.android.datatransport.runtime.scheduling.persistence.c, b2.b
{
    private static final String K = "SQLiteEventStore";
    static final int L = 16;
    private static final int M = 50;
    private static final com.google.android.datatransport.c N;
    private final i0 G;
    private final com.google.android.datatransport.runtime.time.a H;
    private final com.google.android.datatransport.runtime.time.a I;
    private final com.google.android.datatransport.runtime.scheduling.persistence.d J;
    
    static {
        N = com.google.android.datatransport.c.b("proto");
    }
    
    @e6.a
    c0(@h final com.google.android.datatransport.runtime.time.a h, @com.google.android.datatransport.runtime.time.b final com.google.android.datatransport.runtime.time.a i, final com.google.android.datatransport.runtime.scheduling.persistence.d j, final i0 g) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    private void C(final SQLiteDatabase sqLiteDatabase) {
        this.w0(new r(sqLiteDatabase), (b<Throwable, Object>)q.a);
    }
    
    private long D(final SQLiteDatabase sqLiteDatabase, final o o) {
        final Long j = this.J(sqLiteDatabase, o);
        if (j != null) {
            return j;
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", o.b());
        contentValues.put("priority", Integer.valueOf(com.google.android.datatransport.runtime.util.a.a(o.d())));
        contentValues.put("next_request_ms", Integer.valueOf(0));
        if (o.c() != null) {
            contentValues.put("extras", Base64.encodeToString(o.c(), 0));
        }
        return sqLiteDatabase.insert("transport_contexts", (String)null, contentValues);
    }
    
    private static String D0(final Iterable<i> iterable) {
        final StringBuilder sb = new StringBuilder("(");
        final Iterator<i> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().c());
            if (iterator.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }
    
    @b1
    static <T> T G0(final Cursor cursor, final b<Cursor, T> b) {
        try {
            return b.apply(cursor);
        }
        finally {
            cursor.close();
        }
    }
    
    private long H() {
        return this.G().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }
    
    @k0
    private Long J(final SQLiteDatabase sqLiteDatabase, final o o) {
        final StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        final ArrayList<String> list = new ArrayList<String>(Arrays.asList(o.b(), String.valueOf(com.google.android.datatransport.runtime.util.a.a(o.d()))));
        if (o.c() != null) {
            sb.append(" and extras = ?");
            list.add(Base64.encodeToString(o.c(), 0));
        }
        else {
            sb.append(" and extras is null");
        }
        return G0(sqLiteDatabase.query("transport_contexts", new String[] { "_id" }, sb.toString(), (String[])list.toArray(new String[0]), (String)null, (String)null, (String)null), (b<Cursor, Long>)k.a);
    }
    
    private boolean L() {
        return this.H() * this.e2() >= this.J.f();
    }
    
    private List<i> M(final List<i> list, final Map<Long, Set<c>> map) {
        final ListIterator<i> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            final i i = listIterator.next();
            if (!map.containsKey(i.c())) {
                continue;
            }
            final com.google.android.datatransport.runtime.i.a n = i.b().n();
            for (final c c : map.get(i.c())) {
                n.c(c.a, c.b);
            }
            listIterator.set(com.google.android.datatransport.runtime.scheduling.persistence.i.a(i.c(), i.d(), n.d()));
        }
        return list;
    }
    
    private long e2() {
        return this.G().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }
    
    private List<i> j0(final SQLiteDatabase sqLiteDatabase, final o o) {
        final ArrayList<i> list = new ArrayList<i>();
        final Long j = this.J(sqLiteDatabase, o);
        if (j == null) {
            return list;
        }
        G0(sqLiteDatabase.query("events", new String[] { "_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline" }, "context_id = ?", new String[] { j.toString() }, (String)null, (String)null, (String)null, String.valueOf(this.J.d())), (b<Cursor, Object>)new x(this, list, o));
        return list;
    }
    
    private Map<Long, Set<c>> m0(final SQLiteDatabase sqLiteDatabase, final List<i> list) {
        final HashMap<Long, Set<c>> hashMap = new HashMap<Long, Set<c>>();
        final StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); ++i) {
            sb.append(list.get(i).c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        G0(sqLiteDatabase.query("event_metadata", new String[] { "event_id", "name", "value" }, sb.toString(), (String[])null, (String)null, (String)null, (String)null), (b<Cursor, Object>)new z(hashMap));
        return hashMap;
    }
    
    private static byte[] p0(@k0 final String s) {
        if (s == null) {
            return null;
        }
        return Base64.decode(s, 0);
    }
    
    private byte[] s0(final long l) {
        return G0(this.G().query("event_payloads", new String[] { "bytes" }, "event_id = ?", new String[] { String.valueOf(l) }, (String)null, (String)null, "sequence_num"), (b<Cursor, byte[]>)a0.a);
    }
    
    private <T> T w0(final d<T> d, final b<Throwable, T> b) {
        final long a = this.I.a();
        try {
            return d.a();
        }
        catch (SQLiteDatabaseLockedException ex) {
            if (this.I.a() >= this.J.b() + a) {
                return b.apply((Throwable)ex);
            }
            SystemClock.sleep(50L);
            return d.a();
        }
    }
    
    private static com.google.android.datatransport.c y0(@k0 final String s) {
        if (s == null) {
            return c0.N;
        }
        return com.google.android.datatransport.c.b(s);
    }
    
    @k0
    @Override
    public i D4(final o o, final com.google.android.datatransport.runtime.i i) {
        z1.a.d("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", o.d(), i.l(), o.b());
        final long longValue = this.K((b<SQLiteDatabase, Long>)new w(this, o, i));
        if (longValue < 1L) {
            return null;
        }
        return i.a(longValue, o, i);
    }
    
    @b1
    long F() {
        return this.H() * this.e2();
    }
    
    @b1
    SQLiteDatabase G() {
        final i0 g = this.G;
        Objects.requireNonNull(g);
        return this.w0(new s(g), (b<Throwable, SQLiteDatabase>)p.a);
    }
    
    @b1
     <T> T K(final b<SQLiteDatabase, T> b) {
        final SQLiteDatabase g = this.G();
        g.beginTransaction();
        try {
            final T apply = b.apply(g);
            g.setTransactionSuccessful();
            return apply;
        }
        finally {
            g.endTransaction();
        }
    }
    
    @Override
    public Iterable<o> N1() {
        return this.K((b<SQLiteDatabase, Iterable<o>>)n.a);
    }
    
    @Override
    public long T4(final o o) {
        return G0(this.G().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[] { o.b(), String.valueOf(com.google.android.datatransport.runtime.util.a.a(o.d())) }), (b<Cursor, Long>)l.a);
    }
    
    @Override
    public <T> T a(final a<T> a) {
        final SQLiteDatabase g = this.G();
        this.C(g);
        try {
            final T p = a.p();
            g.setTransactionSuccessful();
            return p;
        }
        finally {
            g.endTransaction();
        }
    }
    
    @Override
    public void close() {
        this.G.close();
    }
    
    @Override
    public boolean i5(final o o) {
        return this.K((b<SQLiteDatabase, Boolean>)new u(this, o));
    }
    
    @Override
    public Iterable<i> j1(final o o) {
        return this.K((b<SQLiteDatabase, Iterable<i>>)new v(this, o));
    }
    
    @Override
    public int r0() {
        return this.K((b<SQLiteDatabase, Integer>)new j(this.H.a() - this.J.c()));
    }
    
    @Override
    public void u0(final Iterable<i> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM events WHERE _id in ");
        sb.append(D0(iterable));
        this.G().compileStatement(sb.toString()).execute();
    }
    
    @Override
    public void u5(final Iterable<i> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
        sb.append(D0(iterable));
        this.K((b<SQLiteDatabase, Object>)new y(sb.toString()));
    }
    
    @Override
    public void w1(final o o, final long n) {
        this.K((b<SQLiteDatabase, Object>)new t(n, o));
    }
    
    @t0({ t0.a.K })
    public void y() {
        this.K((b<SQLiteDatabase, Object>)com.google.android.datatransport.runtime.scheduling.persistence.o.a);
    }
    
    interface b<T, U>
    {
        U apply(final T p0);
    }
    
    private static class c
    {
        final String a;
        final String b;
        
        private c(final String a, final String b) {
            this.a = a;
            this.b = b;
        }
    }
    
    interface d<T>
    {
        T a();
    }
}
