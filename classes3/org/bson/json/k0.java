// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

class k0 implements a<Double>
{
    private static final a<Double> a;
    
    static {
        a = new f();
    }
    
    public void b(final Double n, final y0 y0) {
        if (!n.isNaN() && !n.isInfinite()) {
            y0.h(Double.toString(n));
        }
        else {
            k0.a.a(n, y0);
        }
    }
}
