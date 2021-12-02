// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

import org.bson.o;

class g0 implements a<o>
{
    public void b(final o o, final y0 y0) {
        y0.f();
        y0.S("$binary", org.bson.internal.a.c(o.b1()));
        y0.S("$type", String.format("%02X", o.c1()));
        y0.b();
    }
}
