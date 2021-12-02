// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.p0;
import org.bson.z0;
import org.bson.d1;
import org.bson.types.f;

public class m0 implements n0<f>
{
    private final n0<d1> a;
    
    public m0(final n0<d1> a) {
        this.a = a;
    }
    
    public f e(final p0 p2, final s0 s0) {
        return new f(p2.F2(), this.a.c(p2, s0));
    }
    
    @Override
    public Class<f> g() {
        return f.class;
    }
    
    public void h(final z0 z0, final f f, final x0 x0) {
        z0.d1(f.a());
        this.a.a(z0, f.b(), x0);
    }
}
