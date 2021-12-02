// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.convert;

class j extends a implements h, l, g
{
    static final j a;
    
    static {
        a = new j();
    }
    
    protected j() {
    }
    
    @Override
    public long d(final Object o, final org.joda.time.a a) {
        return (long)o;
    }
    
    @Override
    public long f(final Object o) {
        return (long)o;
    }
    
    @Override
    public Class<?> g() {
        return Long.class;
    }
}
