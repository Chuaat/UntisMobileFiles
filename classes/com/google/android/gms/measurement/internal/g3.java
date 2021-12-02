// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import androidx.annotation.c1;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import com.google.android.gms.common.util.d0;
import android.database.sqlite.SQLiteOpenHelper;

@d0
final class g3 extends SQLiteOpenHelper
{
    final /* synthetic */ h3 G;
    
    g3(final h3 g, final Context context, final String s) {
        this.G = g;
        super(context, "google_app_measurement_local.db", (SQLiteDatabase$CursorFactory)null, 1);
    }
    
    @c1
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        }
        catch (SQLiteException ex3) {
            this.G.a.c().o().a("Opening the local database failed, dropping and recreating it");
            this.G.a.w();
            if (!this.G.a.X().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.G.a.c().o().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            }
            catch (SQLiteException ex) {
                this.G.a.c().o().b("Failed to open local database. Events will bypass local storage", ex);
                return null;
            }
        }
        catch (SQLiteDatabaseLockedException ex2) {
            throw ex2;
        }
    }
    
    @c1
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        l.b(this.G.a.c(), sqLiteDatabase);
    }
    
    @c1
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
    
    @c1
    public final void onOpen(final SQLiteDatabase sqLiteDatabase) {
        l.a(this.G.a.c(), sqLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }
    
    @c1
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
}
