// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.n;
import rx.g;

public final class t1<T> implements b<T, T>
{
    t1() {
    }
    
    public static <T> t1<T> b() {
        return (t1<T>)a.a;
    }
    
    public n<? super T> a(final n<? super T> n) {
        return n;
    }
    
    static final class a
    {
        static final t1<Object> a;
        
        static {
            a = new t1<Object>();
        }
    }
}
