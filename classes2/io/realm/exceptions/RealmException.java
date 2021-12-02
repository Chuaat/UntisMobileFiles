// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.exceptions;

import io.realm.internal.Keep;

@Keep
public final class RealmException extends RuntimeException
{
    public RealmException(final String message) {
        super(message);
    }
    
    public RealmException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
