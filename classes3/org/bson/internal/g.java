// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.internal;

import java.util.NoSuchElementException;

abstract class g<T>
{
    private static final g<Object> a;
    
    static {
        a = new g<Object>() {
            @Override
            public Object b() {
                throw new NoSuchElementException(".get call on None!");
            }
            
            @Override
            public boolean d() {
                return true;
            }
        };
    }
    
    public static <T> g<T> a() {
        return (g<T>)g.a;
    }
    
    public static <T> g<T> e(final T t) {
        if (t == null) {
            return (g<T>)g.a;
        }
        return new b<T>(t);
    }
    
    public abstract T b();
    
    public boolean c() {
        return this.d() ^ true;
    }
    
    public abstract boolean d();
    
    @Override
    public String toString() {
        return "None";
    }
    
    public static class b<T> extends g<T>
    {
        private final T b;
        
        b(final T b) {
            this.b = b;
        }
        
        @Override
        public T b() {
            return this.b;
        }
        
        @Override
        public boolean d() {
            return false;
        }
        
        @Override
        public String toString() {
            return String.format("Some(%s)", this.b);
        }
    }
}
