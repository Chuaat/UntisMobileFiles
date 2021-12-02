// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.d;
import kotlin.reflect.h;
import kotlin.e1;

public class d1 extends c1
{
    @e1(version = "1.4")
    public d1(final Class clazz, final String s, final String s2, final int n) {
        super(q.NO_RECEIVER, clazz, s, s2, n);
    }
    
    @e1(version = "1.4")
    public d1(final Object o, final Class clazz, final String s, final String s2, final int n) {
        super(o, clazz, s, s2, n);
    }
    
    public d1(final h h, final String s, final String s2) {
        super(q.NO_RECEIVER, ((kotlin.jvm.internal.t)h).m(), s, s2, (h instanceof d ^ true) ? 1 : 0);
    }
    
    @Override
    public Object get() {
        return this.e().call(new Object[0]);
    }
}
