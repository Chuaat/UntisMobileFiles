// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.o;
import kotlin.reflect.c;
import kotlin.e1;
import kotlin.reflect.p;

public abstract class c1 extends i1 implements p
{
    public c1() {
    }
    
    @e1(version = "1.1")
    public c1(final Object o) {
        super(o);
    }
    
    @e1(version = "1.4")
    public c1(final Object o, final Class clazz, final String s, final String s2, final int n) {
        super(o, clazz, s, s2, n);
    }
    
    @Override
    protected c computeReflected() {
        return k1.q(this);
    }
    
    @Override
    public p.a e() {
        return (p.a)((p)this.b0()).e();
    }
    
    @e1(version = "1.1")
    @Override
    public Object f() {
        return ((p)this.b0()).f();
    }
    
    @Override
    public Object invoke() {
        return this.get();
    }
}
