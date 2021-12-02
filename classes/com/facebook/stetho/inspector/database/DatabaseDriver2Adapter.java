// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.database;

import com.facebook.stetho.inspector.protocol.module.DatabaseDescriptor;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver;
import com.facebook.stetho.inspector.protocol.module.Database;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;

@Deprecated
public class DatabaseDriver2Adapter extends DatabaseDriver2<StringDatabaseDescriptor>
{
    private final Database.DatabaseDriver mLegacy;
    
    public DatabaseDriver2Adapter(final Database.DatabaseDriver mLegacy) {
        super(mLegacy.getContext());
        this.mLegacy = mLegacy;
    }
    
    @Override
    public Database.ExecuteSQLResponse executeSQL(final StringDatabaseDescriptor stringDatabaseDescriptor, final String s, final ExecuteResultHandler executeResultHandler) throws SQLiteException {
        return this.mLegacy.executeSQL(stringDatabaseDescriptor.name, s, executeResultHandler);
    }
    
    @Override
    public List<StringDatabaseDescriptor> getDatabaseNames() {
        final List<Object> databaseNames = (List<Object>)this.mLegacy.getDatabaseNames();
        final ArrayList list = new ArrayList<StringDatabaseDescriptor>(databaseNames.size());
        final Iterator<Object> iterator = databaseNames.iterator();
        while (iterator.hasNext()) {
            list.add(new StringDatabaseDescriptor(iterator.next().toString()));
        }
        return (List<StringDatabaseDescriptor>)list;
    }
    
    @Override
    public List<String> getTableNames(final StringDatabaseDescriptor stringDatabaseDescriptor) {
        return this.mLegacy.getTableNames(stringDatabaseDescriptor.name);
    }
    
    static class StringDatabaseDescriptor implements DatabaseDescriptor
    {
        public final String name;
        
        public StringDatabaseDescriptor(final String name) {
            this.name = name;
        }
        
        @Override
        public String name() {
            return this.name;
        }
    }
}
