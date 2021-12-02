// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

import org.bson.o;

class c implements a<o>
{
    public void b(final o o, final y0 y0) {
        y0.f();
        y0.c("$binary");
        y0.S("base64", org.bson.internal.a.c(o.b1()));
        y0.S("subType", String.format("%02X", o.c1()));
        y0.b();
        y0.b();
    }
}
