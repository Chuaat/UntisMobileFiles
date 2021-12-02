// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.exceptions;

import io.realm.internal.Keep;

@Keep
public final class RealmMigrationNeededException extends RuntimeException
{
    private final String canonicalRealmPath;
    
    public RealmMigrationNeededException(final String canonicalRealmPath, final String message) {
        super(message);
        this.canonicalRealmPath = canonicalRealmPath;
    }
    
    public String getPath() {
        return this.canonicalRealmPath;
    }
}
