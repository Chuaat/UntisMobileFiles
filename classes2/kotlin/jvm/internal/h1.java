// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.d;
import kotlin.reflect.h;
import kotlin.e1;

public class h1 extends g1
{
    @e1(version = "1.4")
    public h1(final Class clazz, final String s, final String s2, final int n) {
        super(clazz, s, s2, n);
    }
    
    public h1(final h h, final String s, final String s2) {
        super(((kotlin.jvm.internal.t)h).m(), s, s2, (h instanceof d ^ true) ? 1 : 0);
    }
    
    @Override
    public Object W(final Object o, final Object o2) {
        return this.e().call(o, o2);
    }
}
