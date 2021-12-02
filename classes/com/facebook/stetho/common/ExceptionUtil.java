// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common;

public class ExceptionUtil
{
    public static RuntimeException propagate(final Throwable cause) {
        propagateIfInstanceOf(cause, Error.class);
        propagateIfInstanceOf(cause, RuntimeException.class);
        throw new RuntimeException(cause);
    }
    
    public static <T extends Throwable> void propagateIfInstanceOf(final Throwable t, final Class<T> clazz) throws T, Throwable {
        if (!clazz.isInstance(t)) {
            return;
        }
        throw t;
    }
    
    public static <T extends Throwable> void sneakyThrow(final Throwable t) throws T, Throwable {
        throw t;
    }
}
