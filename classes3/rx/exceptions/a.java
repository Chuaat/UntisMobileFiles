// 
// Decompiled by Procyon v0.5.36
// 

package rx.exceptions;

import rx.plugins.c;
import java.util.HashSet;

public final class a extends RuntimeException
{
    private static final long G = 2038859767182585852L;
    
    public a(final String message) {
        super(message);
    }
    
    public static a b(Throwable cause) {
        final HashSet<Throwable> set = new HashSet<Throwable>();
        while (!(cause instanceof a)) {
            if (cause != null) {
                if (cause.getCause() != null) {
                    if (set.add(cause = cause.getCause())) {
                        continue;
                    }
                }
            }
            return null;
        }
        return (a)cause;
    }
    
    public void a(Throwable cause) {
        final HashSet<Throwable> set = new HashSet<Throwable>();
        while (cause.getCause() != null) {
            if (!set.add(cause = cause.getCause())) {
                c.I(this);
                return;
            }
        }
        try {
            cause.initCause(this);
        }
        catch (IllegalStateException ex) {
            c.I(new RuntimeException("Received an exception with a cause set to null, instead of being unset. To fix this, look down the chain of causes. The last exception had a cause explicitly set to null. It should be unset instead.", cause));
        }
    }
    
    @Override
    public Throwable fillInStackTrace() {
        // monitorenter(this)
        // monitorexit(this)
        return this;
    }
}
