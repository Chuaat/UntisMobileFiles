// 
// Decompiled by Procyon v0.5.36
// 

package rx.exceptions;

public final class i extends RuntimeException
{
    private static final long G = 4594672310593167598L;
    
    public i(final String message, Throwable cause) {
        if (cause == null) {
            cause = new NullPointerException();
        }
        super(message, cause);
    }
    
    public i(Throwable cause) {
        if (cause == null) {
            cause = new NullPointerException();
        }
        super(cause);
    }
}
