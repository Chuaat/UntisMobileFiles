// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

public enum a7
{
    J((Class<?>)Void.class, (Class<?>)Void.class, (Object)null), 
    K((Class<?>)type, (Class<?>)Integer.class, (Object)0), 
    L((Class<?>)Long.TYPE, (Class<?>)Long.class, (Object)0L), 
    M((Class<?>)Float.TYPE, (Class<?>)Float.class, (Object)0.0f), 
    N((Class<?>)Double.TYPE, (Class<?>)Double.class, (Object)0.0), 
    O((Class<?>)Boolean.TYPE, (Class<?>)Boolean.class, (Object)Boolean.FALSE), 
    P((Class<?>)String.class, (Class<?>)String.class, (Object)""), 
    Q((Class<?>)f5.class, (Class<?>)f5.class, (Object)f5.H), 
    R((Class<?>)type, (Class<?>)Integer.class, (Object)null), 
    S((Class<?>)Object.class, (Class<?>)Object.class, (Object)null);
    
    private final Class<?> G;
    private final Class<?> H;
    private final Object I;
    
    static {
        final Class<Integer> type = Integer.TYPE;
    }
    
    private a7(final Class<?> g, final Class<?> h, final Object i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public final Class<?> b() {
        return this.H;
    }
}
