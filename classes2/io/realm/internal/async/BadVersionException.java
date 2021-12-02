// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.async;

import io.realm.internal.Keep;

@Keep
public class BadVersionException extends Exception
{
    public BadVersionException(final String message) {
        super(message);
    }
    
    public BadVersionException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
