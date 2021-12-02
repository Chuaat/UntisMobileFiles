// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.d;
import kotlin.reflect.h;
import kotlin.e1;

public class g0 extends f0
{
    @e1(version = "1.4")
    public g0(final int n, final Class clazz, final String s, final String s2, final int n2) {
        super(n, q.NO_RECEIVER, clazz, s, s2, n2);
    }
    
    @e1(version = "1.4")
    public g0(final int n, final Object o, final Class clazz, final String s, final String s2, final int n2) {
        super(n, o, clazz, s, s2, n2);
    }
    
    public g0(final int n, final h h, final String s, final String s2) {
        super(n, q.NO_RECEIVER, ((kotlin.jvm.internal.t)h).m(), s, s2, (h instanceof d ^ true) ? 1 : 0);
    }
}
