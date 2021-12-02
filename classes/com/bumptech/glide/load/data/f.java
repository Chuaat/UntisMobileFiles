// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data;

import java.util.Iterator;
import com.bumptech.glide.util.k;
import java.util.HashMap;
import androidx.annotation.j0;
import java.util.Map;

public class f
{
    private static final e.a<?> b;
    private final Map<Class<?>, e.a<?>> a;
    
    static {
        b = new e.a<Object>() {
            @j0
            @Override
            public Class<Object> a() {
                throw new UnsupportedOperationException("Not implemented");
            }
            
            @j0
            @Override
            public e<Object> b(@j0 final Object o) {
                return new b(o);
            }
        };
    }
    
    public f() {
        this.a = new HashMap<Class<?>, e.a<?>>();
    }
    
    @j0
    public <T> e<T> a(@j0 final T t) {
        synchronized (this) {
            k.d(t);
            e.a<T> a2;
            final e.a a = (e.a)(a2 = (e.a<T>)this.a.get(t.getClass()));
            if (a == null) {
                final Iterator<e.a<?>> iterator = this.a.values().iterator();
                do {
                    a2 = (e.a<T>)a;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    a2 = iterator.next();
                } while (!a2.a().isAssignableFrom(t.getClass()));
            }
            Object b;
            if ((b = a2) == null) {
                b = f.b;
            }
            return ((e.a<T>)b).b(t);
        }
    }
    
    public void b(@j0 final e.a<?> a) {
        synchronized (this) {
            this.a.put(a.a(), a);
        }
    }
    
    private static final class b implements e<Object>
    {
        private final Object a;
        
        b(@j0 final Object a) {
            this.a = a;
        }
        
        @j0
        @Override
        public Object a() {
            return this.a;
        }
        
        @Override
        public void b() {
        }
    }
}
