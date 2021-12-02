// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.j;
import kotlin.reflect.r;
import kotlin.reflect.o;
import kotlin.reflect.c;
import kotlin.e1;
import kotlin.reflect.m;

public abstract class x0 extends z0 implements m
{
    public x0() {
    }
    
    @e1(version = "1.4")
    public x0(final Class clazz, final String s, final String s2, final int n) {
        super(q.NO_RECEIVER, clazz, s, s2, n);
    }
    
    @e1(version = "1.1")
    @Override
    public Object c0(final Object o, final Object o2) {
        return ((m)this.b0()).c0(o, o2);
    }
    
    @Override
    protected c computeReflected() {
        return k1.k(this);
    }
    
    @Override
    public r.a e() {
        return (r.a)((m)this.b0()).e();
    }
    
    @Override
    public m.a h() {
        return (m.a)((m)this.b0()).h();
    }
    
    @Override
    public Object invoke(final Object o, final Object o2) {
        return this.W(o, o2);
    }
}
