// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.o;
import kotlin.reflect.c;
import kotlin.e1;
import kotlin.reflect.r;

public abstract class g1 extends i1 implements r
{
    public g1() {
    }
    
    @e1(version = "1.4")
    public g1(final Class clazz, final String s, final String s2, final int n) {
        super(q.NO_RECEIVER, clazz, s, s2, n);
    }
    
    @e1(version = "1.1")
    @Override
    public Object c0(final Object o, final Object o2) {
        return ((r)this.b0()).c0(o, o2);
    }
    
    @Override
    protected c computeReflected() {
        return k1.s(this);
    }
    
    @Override
    public r.a e() {
        return (r.a)((r)this.b0()).e();
    }
    
    @Override
    public Object invoke(final Object o, final Object o2) {
        return this.W(o, o2);
    }
}
