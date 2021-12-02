// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.database;

import com.facebook.stetho.inspector.protocol.module.DatabaseDescriptor;
import java.util.Collections;
import com.facebook.stetho.inspector.protocol.module.Database;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.io.File;
import java.util.List;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.common.Util;
import android.annotation.TargetApi;
import android.database.Cursor;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import d6.d;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;

@d
public class SqliteDatabaseDriver extends DatabaseDriver2<SqliteDatabaseDescriptor>
{
    private static final String[] UNINTERESTING_FILENAME_SUFFIXES;
    private final DatabaseConnectionProvider mDatabaseConnectionProvider;
    private final DatabaseFilesProvider mDatabaseFilesProvider;
    
    static {
        UNINTERESTING_FILENAME_SUFFIXES = new String[] { "-journal", "-shm", "-uid", "-wal" };
    }
    
    @Deprecated
    public SqliteDatabaseDriver(final Context context) {
        this(context, new DefaultDatabaseFilesProvider(context), new DefaultDatabaseConnectionProvider());
    }
    
    @Deprecated
    public SqliteDatabaseDriver(final Context context, final DatabaseFilesProvider databaseFilesProvider) {
        this(context, databaseFilesProvider, new DefaultDatabaseConnectionProvider());
    }
    
    public SqliteDatabaseDriver(final Context context, final DatabaseFilesProvider mDatabaseFilesProvider, final DatabaseConnectionProvider mDatabaseConnectionProvider) {
        super(context);
        this.mDatabaseFilesProvider = mDatabaseFilesProvider;
        this.mDatabaseConnectionProvider = mDatabaseConnectionProvider;
    }
    
    private <T> T executeInsert(final SQLiteDatabase sqLiteDatabase, final String s, final ExecuteResultHandler<T> executeResultHandler) {
        return executeResultHandler.handleInsert(sqLiteDatabase.compileStatement(s).executeInsert());
    }
    
    private <T> T executeRawQuery(final SQLiteDatabase sqLiteDatabase, final String s, final ExecuteResultHandler<T> executeResultHandler) {
        sqLiteDatabase.execSQL(s);
        return executeResultHandler.handleRawQuery();
    }
    
    private <T> T executeSelect(SQLiteDatabase rawQuery, final String s, final ExecuteResultHandler<T> executeResultHandler) {
        rawQuery = (SQLiteDatabase)rawQuery.rawQuery(s, (String[])null);
        try {
            return executeResultHandler.handleSelect((Cursor)rawQuery);
        }
        finally {
            ((Cursor)rawQuery).close();
        }
    }
    
    @TargetApi(11)
    private <T> T executeUpdateDelete(final SQLiteDatabase sqLiteDatabase, final String s, final ExecuteResultHandler<T> executeResultHandler) {
        return executeResultHandler.handleUpdateDelete(sqLiteDatabase.compileStatement(s).executeUpdateDelete());
    }
    
    private static String getFirstWord(String substring) {
        final String trim = substring.trim();
        final int index = trim.indexOf(32);
        substring = trim;
        if (index >= 0) {
            substring = trim.substring(0, index);
        }
        return substring;
    }
    
    private SQLiteDatabase openDatabase(final SqliteDatabaseDescriptor sqliteDatabaseDescriptor) throws SQLiteException {
        Util.throwIfNull(sqliteDatabaseDescriptor);
        return this.mDatabaseConnectionProvider.openDatabase(sqliteDatabaseDescriptor.file);
    }
    
    private static String removeSuffix(final String s, final String[] array) {
        for (final String suffix : array) {
            if (s.endsWith(suffix)) {
                return s.substring(0, s.length() - suffix.length());
            }
        }
        return s;
    }
    
    static List<File> tidyDatabaseList(final List<File> c) {
        final HashSet set = new HashSet(c);
        final ArrayList<File> list = new ArrayList<File>();
        for (final File file : c) {
            final String path = file.getPath();
            final String removeSuffix = removeSuffix(path, SqliteDatabaseDriver.UNINTERESTING_FILENAME_SUFFIXES);
            if (removeSuffix.equals(path) || !set.contains(new File(removeSuffix))) {
                list.add(file);
            }
        }
        return list;
    }
    
    @Override
    public Database.ExecuteSQLResponse executeSQL(SqliteDatabaseDescriptor openDatabase, final String s, final ExecuteResultHandler<Database.ExecuteSQLResponse> executeResultHandler) throws SQLiteException {
        Util.throwIfNull(s);
        Util.throwIfNull(executeResultHandler);
        openDatabase = (SqliteDatabaseDescriptor)this.openDatabase(openDatabase);
        try {
            final String upperCase = getFirstWord(s).toUpperCase();
            int n = -1;
            switch (upperCase.hashCode()) {
                case 2012838315: {
                    if (upperCase.equals("DELETE")) {
                        n = 1;
                        break;
                    }
                    break;
                }
                case -591179561: {
                    if (upperCase.equals("EXPLAIN")) {
                        n = 5;
                        break;
                    }
                    break;
                }
                case -1785516855: {
                    if (upperCase.equals("UPDATE")) {
                        n = 0;
                        break;
                    }
                    break;
                }
                case -1852692228: {
                    if (upperCase.equals("SELECT")) {
                        n = 3;
                        break;
                    }
                    break;
                }
                case -1926899396: {
                    if (upperCase.equals("PRAGMA")) {
                        n = 4;
                        break;
                    }
                    break;
                }
                case -2130463047: {
                    if (upperCase.equals("INSERT")) {
                        n = 2;
                        break;
                    }
                    break;
                }
            }
            if (n == 0 || n == 1) {
                return this.executeUpdateDelete((SQLiteDatabase)openDatabase, s, executeResultHandler);
            }
            if (n == 2) {
                return this.executeInsert((SQLiteDatabase)openDatabase, s, executeResultHandler);
            }
            if (n != 3 && n != 4 && n != 5) {
                return this.executeRawQuery((SQLiteDatabase)openDatabase, s, executeResultHandler);
            }
            return this.executeSelect((SQLiteDatabase)openDatabase, s, executeResultHandler);
        }
        finally {
            ((SQLiteDatabase)openDatabase).close();
        }
    }
    
    @Override
    public List<SqliteDatabaseDescriptor> getDatabaseNames() {
        final ArrayList<SqliteDatabaseDescriptor> list = new ArrayList<SqliteDatabaseDescriptor>();
        final List<File> databaseFiles = this.mDatabaseFilesProvider.getDatabaseFiles();
        Collections.sort((List<Comparable>)databaseFiles);
        final Iterator<Object> iterator = tidyDatabaseList(databaseFiles).iterator();
        while (iterator.hasNext()) {
            list.add(new SqliteDatabaseDescriptor(iterator.next()));
        }
        return list;
    }
    
    @Override
    public List<String> getTableNames(SqliteDatabaseDescriptor openDatabase) throws SQLiteException {
        openDatabase = (SqliteDatabaseDescriptor)this.openDatabase(openDatabase);
        try {
            final Cursor rawQuery = ((SQLiteDatabase)openDatabase).rawQuery("SELECT name FROM sqlite_master WHERE type IN (?, ?)", new String[] { "table", "view" });
            try {
                final ArrayList<String> list = new ArrayList<String>();
                while (rawQuery.moveToNext()) {
                    list.add(rawQuery.getString(0));
                }
                return list;
            }
            finally {
                rawQuery.close();
            }
        }
        finally {
            ((SQLiteDatabase)openDatabase).close();
        }
    }
    
    static class SqliteDatabaseDescriptor implements DatabaseDescriptor
    {
        public final File file;
        
        public SqliteDatabaseDescriptor(final File file) {
            this.file = file;
        }
        
        @Override
        public String name() {
            return this.file.getName();
        }
    }
}
