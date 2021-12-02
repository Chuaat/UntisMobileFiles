// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.convert;

import java.util.Date;

final class f extends a implements h, l
{
    static final f a;
    
    static {
        a = new f();
    }
    
    protected f() {
    }
    
    @Override
    public long d(final Object o, final org.joda.time.a a) {
        return ((Date)o).getTime();
    }
    
    @Override
    public Class<?> g() {
        return Date.class;
    }
}
