// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.functions.p;
import rx.internal.util.s;
import rx.functions.q;
import rx.g;

public final class f3
{
    static final Object a;
    
    static {
        a = new Object();
    }
    
    private f3() {
        throw new IllegalStateException("No instances!");
    }
    
    static <T> g<Object> a(final g<T> g) {
        return g.D0((g<?>)g, (g<?>)g.U2(f3.a));
    }
    
    public static <T> g<Boolean> b(final g<? extends T> g, final g<? extends T> g2, final q<? super T, ? super T, Boolean> q) {
        return g.z7((g<?>)a((g<Object>)g), (g<?>)a((g<Object>)g2), (q<? super Object, ? super Object, ?>)new q<Object, Object, Boolean>() {
            public Boolean a(final Object o, final Object o2) {
                final Object a = f3.a;
                boolean b = true;
                final boolean b2 = o == a;
                if (o2 != a) {
                    b = false;
                }
                if (b2 && b) {
                    return Boolean.TRUE;
                }
                if (!b2 && !b) {
                    return q.s(o, o2);
                }
                return Boolean.FALSE;
            }
        }).h((p<? super Object, Boolean>)s.c());
    }
}
