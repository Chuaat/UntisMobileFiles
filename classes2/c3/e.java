// 
// Decompiled by Procyon v0.5.36
// 

package c3;

public class e
{
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final e d;
    
    public e(Throwable cause, final d d) {
        this.a = cause.getLocalizedMessage();
        this.b = cause.getClass().getName();
        this.c = d.a(cause.getStackTrace());
        cause = cause.getCause();
        e d2;
        if (cause != null) {
            d2 = new e(cause, d);
        }
        else {
            d2 = null;
        }
        this.d = d2;
    }
}
