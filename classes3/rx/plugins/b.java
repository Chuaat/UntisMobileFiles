// 
// Decompiled by Procyon v0.5.36
// 

package rx.plugins;

import rx.exceptions.c;

public abstract class b
{
    protected static final String a = ".errorRendering";
    
    @Deprecated
    public void a(final Throwable t) {
    }
    
    public final String b(final Object o) {
        try {
            return this.c(o);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        finally {
            final Throwable t;
            c.e(t);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(o.getClass().getName());
        sb.append(".errorRendering");
        return sb.toString();
    }
    
    protected String c(final Object o) throws InterruptedException {
        return null;
    }
}
