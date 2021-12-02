// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.database;

import android.net.Uri;

public class ContentProviderSchema
{
    private final String[] mProjection;
    private final String mTableName;
    private final Uri mUri;
    
    private ContentProviderSchema(final Builder builder) {
        this.mTableName = builder.mTable.mTableName;
        this.mUri = builder.mTable.mUri;
        this.mProjection = builder.mTable.mProjection;
    }
    
    public String[] getProjection() {
        return this.mProjection;
    }
    
    public String getTableName() {
        return this.mTableName;
    }
    
    public Uri getUri() {
        return this.mUri;
    }
    
    public static class Builder
    {
        private Table mTable;
        
        public ContentProviderSchema build() {
            return new ContentProviderSchema(this, null);
        }
        
        public Builder table(final Table mTable) {
            this.mTable = mTable;
            return this;
        }
    }
    
    public static class Table
    {
        private String[] mProjection;
        private String mTableName;
        private Uri mUri;
        
        private Table(final Builder builder) {
            this.mUri = builder.mUri;
            this.mProjection = builder.mProjection;
            final String access$700 = builder.mTableName;
            this.mTableName = access$700;
            if (access$700 == null) {
                this.mTableName = this.mUri.getLastPathSegment();
            }
        }
        
        public static class Builder
        {
            private String[] mProjection;
            private String mTableName;
            private Uri mUri;
            
            public Table build() {
                return new Table(this);
            }
            
            public Builder name(final String mTableName) {
                this.mTableName = mTableName;
                return this;
            }
            
            public Builder projection(final String[] mProjection) {
                this.mProjection = mProjection;
                return this;
            }
            
            public Builder uri(final Uri mUri) {
                this.mUri = mUri;
                return this;
            }
        }
    }
}
