// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.exceptions;

import io.realm.internal.Keep;

@Keep
public final class RealmError extends Error
{
    public RealmError(final String message) {
        super(message);
    }
}
