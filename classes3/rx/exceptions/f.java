// 
// Decompiled by Procyon v0.5.36
// 

package rx.exceptions;

public class f extends RuntimeException
{
    private static final long G = -419289748403337611L;
    
    public f(final String message, Throwable cause) {
        if (cause == null) {
            cause = new NullPointerException();
        }
        super(message, cause);
    }
    
    public f(Throwable cause) {
        String message;
        if (cause != null) {
            message = cause.getMessage();
        }
        else {
            message = null;
        }
        if (cause == null) {
            cause = new NullPointerException();
        }
        super(message, cause);
    }
}
