// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.j;
import kotlin.reflect.q;
import kotlin.reflect.o;
import kotlin.reflect.c;
import kotlin.e1;
import kotlin.reflect.l;

public abstract class v0 extends z0 implements l
{
    public v0() {
    }
    
    @e1(version = "1.1")
    public v0(final Object o) {
        super(o);
    }
    
    @e1(version = "1.4")
    public v0(final Object o, final Class clazz, final String s, final String s2, final int n) {
        super(o, clazz, s, s2, n);
    }
    
    @Override
    protected c computeReflected() {
        return k1.j(this);
    }
    
    @Override
    public q.a e() {
        return (q.a)((l)this.b0()).e();
    }
    
    @Override
    public l.a h() {
        return (l.a)((l)this.b0()).h();
    }
    
    @Override
    public Object invoke(final Object o) {
        return this.get(o);
    }
    
    @e1(version = "1.1")
    @Override
    public Object o(final Object o) {
        return ((l)this.b0()).o(o);
    }
}
