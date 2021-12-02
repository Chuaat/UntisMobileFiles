// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.o;
import kotlin.reflect.c;
import kotlin.reflect.q;

public abstract class e1 extends i1 implements q
{
    public e1() {
    }
    
    @kotlin.e1(version = "1.1")
    public e1(final Object o) {
        super(o);
    }
    
    @kotlin.e1(version = "1.4")
    public e1(final Object o, final Class clazz, final String s, final String s2, final int n) {
        super(o, clazz, s, s2, n);
    }
    
    @Override
    protected c computeReflected() {
        return k1.r(this);
    }
    
    @Override
    public a e() {
        return (a)((q)this.b0()).e();
    }
    
    @Override
    public Object invoke(final Object o) {
        return this.get(o);
    }
    
    @kotlin.e1(version = "1.1")
    @Override
    public Object o(final Object o) {
        return ((q)this.b0()).o(o);
    }
}
