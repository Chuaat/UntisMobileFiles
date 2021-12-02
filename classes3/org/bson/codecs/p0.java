// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.z0;
import java.util.Date;

public class p0 implements n0<Date>
{
    public Date e(final org.bson.p0 p2, final s0 s0) {
        return new Date(p2.U1());
    }
    
    @Override
    public Class<Date> g() {
        return Date.class;
    }
    
    public void h(final z0 z0, final Date date, final x0 x0) {
        z0.D0(date.getTime());
    }
}
