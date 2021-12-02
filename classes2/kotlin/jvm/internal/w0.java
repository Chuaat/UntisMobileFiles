// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.d;
import kotlin.reflect.h;
import kotlin.e1;

public class w0 extends v0
{
    @e1(version = "1.4")
    public w0(final Class clazz, final String s, final String s2, final int n) {
        super(q.NO_RECEIVER, clazz, s, s2, n);
    }
    
    @e1(version = "1.4")
    public w0(final Object o, final Class clazz, final String s, final String s2, final int n) {
        super(o, clazz, s, s2, n);
    }
    
    public w0(final h h, final String s, final String s2) {
        super(q.NO_RECEIVER, ((kotlin.jvm.internal.t)h).m(), s, s2, (h instanceof d ^ true) ? 1 : 0);
    }
    
    @Override
    public void d(final Object o, final Object o2) {
        this.h().call(o, o2);
    }
    
    @Override
    public Object get(final Object o) {
        return this.e().call(o);
    }
}
