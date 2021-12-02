// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

class j0 implements a<Long>
{
    private static final a<Long> a;
    private static final long b = 253402300799999L;
    
    static {
        a = new d();
    }
    
    public void b(final Long n, final y0 y0) {
        if (n >= 0L && n <= 253402300799999L) {
            y0.f();
            y0.S("$date", org.bson.json.b.a(n));
            y0.b();
        }
        else {
            j0.a.a(n, y0);
        }
    }
}
