// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.io.c;
import org.bson.p;
import org.bson.io.f;
import org.bson.io.e;
import org.bson.r;
import org.bson.io.a;
import org.bson.p0;
import org.bson.z0;
import org.bson.m1;

public class o1 implements n0<m1>
{
    public m1 e(final p0 p, s0 s0) {
        final a a = new a(0);
        s0 = (s0)new r(a);
        try {
            ((r)s0).G0(p);
            return new m1(a.n(), 0, a.getPosition());
        }
        finally {
            ((r)s0).close();
            a.close();
        }
    }
    
    @Override
    public Class<m1> g() {
        return m1.class;
    }
    
    public void h(final z0 z0, m1 m1, final x0 x0) {
        m1 = (m1)new p(new f(m1.Q2()));
        try {
            z0.G0((p0)m1);
        }
        finally {
            ((p)m1).close();
        }
    }
}
