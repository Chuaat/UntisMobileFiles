// 
// Decompiled by Procyon v0.5.36
// 

package rx.exceptions;

public final class e extends RuntimeException
{
    private static final long G = 8622579378868820554L;
    
    public e(final String message, Throwable cause) {
        if (cause == null) {
            cause = new NullPointerException();
        }
        super(message, cause);
    }
    
    public e(Throwable cause) {
        if (cause == null) {
            cause = new NullPointerException();
        }
        super(cause);
    }
}
