// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import org.bson.codecs.s0;
import org.bson.codecs.configuration.c;
import org.bson.codecs.h0;
import org.bson.codecs.configuration.b;
import org.bson.codecs.configuration.d;

final class n1
{
    private static final d a;
    
    static {
        a = c.d(new h0());
    }
    
    private n1() {
    }
    
    static y0 a(final byte[] array, final p p2) {
        final w0 o5 = p2.O5();
        final w0 k = w0.K;
        if (o5 != k && p2.O5() != w0.L) {
            return n1.a.a(h0.e(p2.O5())).c(p2, s0.a().a());
        }
        final int position = p2.s0().getPosition();
        final org.bson.io.d o6 = p2.s0().o4(4);
        final int b0 = p2.s0().b0();
        o6.reset();
        p2.skipValue();
        if (p2.O5() == k) {
            return new m1(array, position, b0);
        }
        return new l1(array, position, b0);
    }
}
