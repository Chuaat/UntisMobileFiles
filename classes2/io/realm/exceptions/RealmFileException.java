// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.exceptions;

import java.util.Locale;
import io.realm.internal.Keep;

@Keep
public class RealmFileException extends RuntimeException
{
    private final Kind kind;
    
    public RealmFileException(final byte b, final String message) {
        super(message);
        this.kind = Kind.getKind(b);
    }
    
    public RealmFileException(final Kind kind, final String message) {
        super(message);
        this.kind = kind;
    }
    
    public RealmFileException(final Kind kind, final String message, final Throwable cause) {
        super(message, cause);
        this.kind = kind;
    }
    
    public RealmFileException(final Kind kind, final Throwable cause) {
        super(cause);
        this.kind = kind;
    }
    
    public Kind getKind() {
        return this.kind;
    }
    
    @Override
    public String toString() {
        return String.format(Locale.US, "%s Kind: %s.", super.toString(), this.kind);
    }
    
    @Keep
    public enum Kind
    {
        ACCESS_ERROR, 
        BAD_HISTORY, 
        EXISTS, 
        FORMAT_UPGRADE_REQUIRED, 
        INCOMPATIBLE_LOCK_FILE, 
        INCOMPATIBLE_SYNC_FILE, 
        NOT_FOUND, 
        PERMISSION_DENIED;
        
        static Kind getKind(final byte b) {
            switch (b) {
                default: {
                    throw new RuntimeException("Unknown value for RealmFileException kind.");
                }
                case 7: {
                    return Kind.INCOMPATIBLE_SYNC_FILE;
                }
                case 6: {
                    return Kind.FORMAT_UPGRADE_REQUIRED;
                }
                case 5: {
                    return Kind.INCOMPATIBLE_LOCK_FILE;
                }
                case 4: {
                    return Kind.NOT_FOUND;
                }
                case 3: {
                    return Kind.EXISTS;
                }
                case 2: {
                    return Kind.PERMISSION_DENIED;
                }
                case 1: {
                    return Kind.BAD_HISTORY;
                }
                case 0: {
                    return Kind.ACCESS_ERROR;
                }
            }
        }
    }
}
