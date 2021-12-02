// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.exceptions;

import io.reactivex.annotations.f;

public final class d extends RuntimeException
{
    private static final long G = -6298857009889503852L;
    
    public d(final String message, @f Throwable cause) {
        if (cause == null) {
            cause = new NullPointerException();
        }
        super(message, cause);
    }
    
    public d(@f final Throwable obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ");
        sb.append(obj);
        this(sb.toString(), obj);
    }
}
