// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.j;
import kotlin.reflect.p;
import kotlin.reflect.o;
import kotlin.reflect.c;
import kotlin.e1;
import kotlin.reflect.k;

public abstract class t0 extends z0 implements k
{
    public t0() {
    }
    
    @e1(version = "1.1")
    public t0(final Object o) {
        super(o);
    }
    
    @e1(version = "1.4")
    public t0(final Object o, final Class clazz, final String s, final String s2, final int n) {
        super(o, clazz, s, s2, n);
    }
    
    @Override
    protected c computeReflected() {
        return k1.i(this);
    }
    
    @Override
    public p.a e() {
        return (p.a)((k)this.b0()).e();
    }
    
    @e1(version = "1.1")
    @Override
    public Object f() {
        return ((k)this.b0()).f();
    }
    
    @Override
    public k.a h() {
        return (k.a)((k)this.b0()).h();
    }
    
    @Override
    public Object invoke() {
        return this.get();
    }
}
