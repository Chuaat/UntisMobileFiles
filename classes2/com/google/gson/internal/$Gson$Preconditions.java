// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.internal;

import java.util.Objects;

public final class $Gson$Preconditions
{
    private $Gson$Preconditions() {
        throw new UnsupportedOperationException();
    }
    
    public static void checkArgument(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static <T> T checkNotNull(final T obj) {
        Objects.requireNonNull(obj);
        return obj;
    }
}
