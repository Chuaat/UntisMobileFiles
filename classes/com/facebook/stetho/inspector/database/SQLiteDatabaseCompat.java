// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.database;

import java.lang.annotation.Annotation;
import android.annotation.TargetApi;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build$VERSION;

public abstract class SQLiteDatabaseCompat
{
    public static final int ENABLE_FOREIGN_KEY_CONSTRAINTS = 2;
    public static final int ENABLE_WRITE_AHEAD_LOGGING = 1;
    private static final SQLiteDatabaseCompat sInstance;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        SQLiteDatabaseCompat sInstance2;
        if (sdk_INT >= 16) {
            sInstance2 = new JellyBeanAndBeyondImpl();
        }
        else if (sdk_INT >= 11) {
            sInstance2 = new HoneycombImpl();
        }
        else {
            sInstance2 = new NoopImpl();
        }
        sInstance = sInstance2;
    }
    
    public static SQLiteDatabaseCompat getInstance() {
        return SQLiteDatabaseCompat.sInstance;
    }
    
    public abstract void enableFeatures(@SQLiteOpenOptions final int p0, final SQLiteDatabase p1);
    
    public abstract int provideOpenFlags(@SQLiteOpenOptions final int p0);
    
    @TargetApi(11)
    private static class HoneycombImpl extends SQLiteDatabaseCompat
    {
        @Override
        public void enableFeatures(@SQLiteOpenOptions final int n, final SQLiteDatabase sqLiteDatabase) {
            if ((n & 0x1) != 0x0) {
                sqLiteDatabase.enableWriteAheadLogging();
            }
            if ((n & 0x2) != 0x0) {
                sqLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
            }
        }
        
        @Override
        public int provideOpenFlags(@SQLiteOpenOptions final int n) {
            return 0;
        }
    }
    
    @TargetApi(16)
    private static class JellyBeanAndBeyondImpl extends SQLiteDatabaseCompat
    {
        @Override
        public void enableFeatures(@SQLiteOpenOptions final int n, final SQLiteDatabase sqLiteDatabase) {
            if ((n & 0x2) != 0x0) {
                sqLiteDatabase.setForeignKeyConstraintsEnabled(true);
            }
        }
        
        @Override
        public int provideOpenFlags(@SQLiteOpenOptions int n) {
            if ((n & 0x1) != 0x0) {
                n = 536870912;
            }
            else {
                n = 0;
            }
            return n;
        }
    }
    
    private static class NoopImpl extends SQLiteDatabaseCompat
    {
        @Override
        public void enableFeatures(@SQLiteOpenOptions final int n, final SQLiteDatabase sqLiteDatabase) {
        }
        
        @Override
        public int provideOpenFlags(@SQLiteOpenOptions final int n) {
            return 0;
        }
    }
    
    public @interface SQLiteOpenOptions {
    }
}
