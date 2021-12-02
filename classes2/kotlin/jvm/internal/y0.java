// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.d;
import kotlin.reflect.h;
import kotlin.e1;

public class y0 extends x0
{
    @e1(version = "1.4")
    public y0(final Class clazz, final String s, final String s2, final int n) {
        super(clazz, s, s2, n);
    }
    
    public y0(final h h, final String s, final String s2) {
        super(((kotlin.jvm.internal.t)h).m(), s, s2, (h instanceof d ^ true) ? 1 : 0);
    }
    
    @Override
    public Object W(final Object o, final Object o2) {
        return this.e().call(o, o2);
    }
    
    @Override
    public void y(final Object o, final Object o2, final Object o3) {
        this.h().call(o, o2, o3);
    }
}
