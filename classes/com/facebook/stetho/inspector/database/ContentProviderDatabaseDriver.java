// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.database;

import com.facebook.stetho.inspector.protocol.module.DatabaseDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import android.database.sqlite.SQLiteException;
import android.database.Cursor;
import com.facebook.stetho.inspector.protocol.module.Database;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver;
import java.util.Iterator;
import android.content.Context;
import java.util.List;
import d6.d;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;

@d
public class ContentProviderDatabaseDriver extends DatabaseDriver2<ContentProviderDatabaseDescriptor>
{
    private static final String sDatabaseName = "content-providers";
    private final ContentProviderSchema[] mContentProviderSchemas;
    private List<String> mTableNames;
    
    public ContentProviderDatabaseDriver(final Context context, final ContentProviderSchema... mContentProviderSchemas) {
        super(context);
        this.mContentProviderSchemas = mContentProviderSchemas;
    }
    
    private String fetchTableName(final String s) {
        for (final String s2 : this.mTableNames) {
            if (s.contains(s2)) {
                return s2;
            }
        }
        return "";
    }
    
    @Override
    public Database.ExecuteSQLResponse executeSQL(ContentProviderDatabaseDescriptor query, final String s, final ExecuteResultHandler<Database.ExecuteSQLResponse> executeResultHandler) throws SQLiteException {
        final ContentProviderSchema contentProviderSchema = this.mContentProviderSchemas[this.mTableNames.indexOf(this.fetchTableName(s))];
        query = (ContentProviderDatabaseDescriptor)super.mContext.getContentResolver().query(contentProviderSchema.getUri(), contentProviderSchema.getProjection(), (String)null, (String[])null, (String)null);
        try {
            return executeResultHandler.handleSelect((Cursor)query);
        }
        finally {
            ((Cursor)query).close();
        }
    }
    
    @Override
    public List<ContentProviderDatabaseDescriptor> getDatabaseNames() {
        return Collections.singletonList(new ContentProviderDatabaseDescriptor());
    }
    
    @Override
    public List<String> getTableNames(final ContentProviderDatabaseDescriptor contentProviderDatabaseDescriptor) {
        if (this.mTableNames == null) {
            this.mTableNames = new ArrayList<String>();
            final ContentProviderSchema[] mContentProviderSchemas = this.mContentProviderSchemas;
            for (int length = mContentProviderSchemas.length, i = 0; i < length; ++i) {
                this.mTableNames.add(mContentProviderSchemas[i].getTableName());
            }
        }
        return this.mTableNames;
    }
    
    static class ContentProviderDatabaseDescriptor implements DatabaseDescriptor
    {
        public ContentProviderDatabaseDescriptor() {
        }
        
        @Override
        public String name() {
            return "content-providers";
        }
    }
}
