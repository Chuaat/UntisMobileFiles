// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import rx.functions.p;

public final class s
{
    private s() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T> p<? super T, Boolean> a() {
        return a.G;
    }
    
    public static <T> p<? super T, Boolean> b() {
        return b.G;
    }
    
    public static <T> p<T, T> c() {
        return (p<T, T>)c.G;
    }
    
    enum a implements p<Object, Boolean>
    {
        G;
        
        public Boolean b(final Object o) {
            return Boolean.FALSE;
        }
    }
    
    enum b implements p<Object, Boolean>
    {
        G;
        
        public Boolean b(final Object o) {
            return Boolean.TRUE;
        }
    }
    
    enum c implements p<Object, Object>
    {
        G;
        
        @Override
        public Object h(final Object o) {
            return o;
        }
    }
}
