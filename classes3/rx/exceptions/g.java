// 
// Decompiled by Procyon v0.5.36
// 

package rx.exceptions;

public class g extends RuntimeException
{
    private static final long G = -6298857009889503852L;
    
    public g(final String message, Throwable cause) {
        if (cause == null) {
            cause = new NullPointerException();
        }
        super(message, cause);
    }
    
    public g(Throwable cause) {
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
