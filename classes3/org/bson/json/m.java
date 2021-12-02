// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

import org.bson.internal.j;
import org.bson.v0;

class m implements a<v0>
{
    private long c(final int n) {
        return (long)n & 0xFFFFFFFFL;
    }
    
    public void b(final v0 v0, final y0 y0) {
        y0.f();
        y0.c("$timestamp");
        y0.e("t", j.g(this.c(v0.Z0())));
        y0.e("i", j.g(this.c(v0.Y0())));
        y0.b();
        y0.b();
    }
}
