// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.persistence;

import android.os.Build$VERSION;
import android.database.sqlite.SQLiteDatabase;
import e6.a;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import e6.b;
import android.content.Context;
import java.util.Arrays;
import java.util.List;
import android.database.sqlite.SQLiteOpenHelper;

final class i0 extends SQLiteOpenHelper
{
    static final String I = "com.google.android.datatransport.events";
    private static final String J = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";
    private static final String K = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";
    private static final String L = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";
    private static final String M = "CREATE INDEX events_backend_id on events(context_id)";
    private static final String N = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";
    private static final String O = "DROP TABLE events";
    private static final String P = "DROP TABLE event_metadata";
    private static final String Q = "DROP TABLE transport_contexts";
    private static final String R = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";
    private static final String S = "DROP TABLE IF EXISTS event_payloads";
    static int T = 4;
    private static final a U;
    private static final a V;
    private static final a W;
    private static final a X;
    private static final List<a> Y;
    private final int G;
    private boolean H;
    
    static {
        Y = Arrays.asList(U = (a)h0.a, V = (a)e0.a, W = (a)f0.a, X = (a)g0.a);
    }
    
    @e6.a
    i0(final Context context, @b("SQLITE_DB_NAME") final String s, @b("SCHEMA_VERSION") final int g) {
        super(context, s, (SQLiteDatabase$CursorFactory)null, g);
        this.H = false;
        this.G = g;
    }
    
    private void e(final SQLiteDatabase sqLiteDatabase) {
        if (!this.H) {
            this.onConfigure(sqLiteDatabase);
        }
    }
    
    private void k(final SQLiteDatabase sqLiteDatabase, final int n) {
        this.e(sqLiteDatabase);
        this.n(sqLiteDatabase, 0, n);
    }
    
    private void n(final SQLiteDatabase sqLiteDatabase, int i, final int j) {
        final List<a> y = i0.Y;
        if (j <= y.size()) {
            while (i < j) {
                i0.Y.get(i).a(sqLiteDatabase);
                ++i;
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Migration from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(j);
        sb.append(" was requested, but cannot be performed. Only ");
        sb.append(y.size());
        sb.append(" migrations are provided");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void onConfigure(final SQLiteDatabase sqLiteDatabase) {
        this.H = true;
        sqLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build$VERSION.SDK_INT >= 16) {
            sqLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }
    
    public void onCreate(final SQLiteDatabase sqLiteDatabase) {
        this.k(sqLiteDatabase, this.G);
    }
    
    public void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        sqLiteDatabase.execSQL("DROP TABLE events");
        sqLiteDatabase.execSQL("DROP TABLE event_metadata");
        sqLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        this.k(sqLiteDatabase, n2);
    }
    
    public void onOpen(final SQLiteDatabase sqLiteDatabase) {
        this.e(sqLiteDatabase);
    }
    
    public void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        this.e(sqLiteDatabase);
        this.n(sqLiteDatabase, n, n2);
    }
    
    public interface a
    {
        void a(final SQLiteDatabase p0);
    }
}
