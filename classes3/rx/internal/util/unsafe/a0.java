// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

abstract class a0<E> extends f<E>
{
    private static final Integer d0;
    protected final int c0;
    
    static {
        d0 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    }
    
    public a0(final int n) {
        super(n);
        this.c0 = Math.min(n / 4, a0.d0);
    }
}
